

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            // HashMap to store grouped anagrams
                    Map<String, List<String>> map = new HashMap<>();

                            for (String s : strs) {

                                        // Convert string to char array
                                                    char[] chars = s.toCharArray();

                                                                // Sort characters
                                                                            Arrays.sort(chars);

                                                                                        // Convert back to string
                                                                                                    String key = new String(chars);

                                                                                                                // If key doesn't exist, create new list
                                                                                                                            if (!map.containsKey(key)) {
                                                                                                                                            map.put(key, new ArrayList<>());
                                                                                                                                                        }

                                                                                                                                                                    // Add original string to the group
                                                                                                                                                                                map.get(key).add(s);
                                                                                                                                                                                        }

                                                                                                                                                                                                // Return all grouped values
                                                                                                                                                                                                        return new ArrayList<>(map.values());
                                                                                                                                                                                                            }
                                                                                                                                                                                                            }