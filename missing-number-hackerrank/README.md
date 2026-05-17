<h2><a href="https://www.hackerrank.com/challenges/missing-numbers/problem">Missing Number</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given two arrays of integers, find which elements in the second array are missing from the first array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input1:</strong> <span class="example-io">arr = [7, 2, 5, 3, 5, 3]</span></p>
<p><strong>Input2:</strong> <span class="example-io">brr = [7, 2, 5, 4, 6, 3, 5, 3]</span></p>
<p><strong>Output:</strong> <span class="example-io">[4, 6]</span></p>

<p>&nbsp;</p>

<p><strong>Explanation</strong></p>

<p>The <code>brr</code> array is the orginal list. The numbers missing are <code>[4, 6]</code>.</p>
</div>

<p>&nbsp;</p>

<p><strong>Notes</strong></p>

<ul>
	<li>If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.</li>
	<li>Return the missing numbers sorted ascending.</li>
	<li>Only include a missing number once, even if it is missing multiple times.</li>
	<li>The difference between the maximum and minimum numbers in the original list is less than or equal to 100.</li>
</ul>

<p>&nbsp;</p>

<p><strong>Function Description</strong></p>
<p>Complete the missingNumbers function in the editor below. It should return a sorted array of missing numbers.</p>
<p>missingNumbers has the following parameter(s):</p>
<ul>
	<li>int arr[n]: the array with missing numbers</li>
	<li>int brr[m]: the original array of numbers</li>
</ul>

<p><strong>Returns</strong></p>
<ul>
	<li>int[]: an array of integers</li>
</ul>

<p>&nbsp;</p>

<p><strong>Input Formats</strong></p>

<p>There will be four lines of input:</p>

<p><code>n</code> - the size of the first list, </p>
<p>The next line contains space-separated integers <code>arr[i]</code></p> 
<p><code>m</code> - the size of the second list, </p>
<p>The next line contains space-separated integers <code>brr[i]</code></p>

</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n, m &lt;= 2 x 10<sup>5</sup></code></li>
	<li><code>n &lt;= m</code></li>
	<li><code>1 &lt;= brr[i] &lt;= 10<sup>4</sup></code></li>
	<li><code>max(brr) - min(brr) &lt;= 100</code></li>
</ul>
