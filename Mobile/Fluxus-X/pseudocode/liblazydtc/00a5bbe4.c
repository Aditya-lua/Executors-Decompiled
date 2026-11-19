/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5bbe4
 */

bool ossl_is_partially_overlapping(long param_1,long param_2,int param_3)

{
  return (0 < param_3 && param_1 != param_2) &&
         ((ulong)(param_1 - param_2) < (ulong)(long)param_3 ||
         (ulong)-(long)param_3 < (ulong)(param_1 - param_2));
}

