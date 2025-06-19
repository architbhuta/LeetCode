class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numberSet = set(nums)
        longest = 0

        for n in numberSet:
            if (n - 1) not in numberSet: 
                length = 1  
                current = n
                while (current + 1) in numberSet:
                    current += 1
                    length += 1
                longest = max(longest, length)

        return longest
# https://stackoverflow.com/questions/5139724/whats-the-difference-between-hashset-and-set. just for my reference