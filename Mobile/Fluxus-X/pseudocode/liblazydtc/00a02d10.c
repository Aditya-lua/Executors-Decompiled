/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02d10
 */

bool BN_is_one(undefined8 *param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if ((*(int *)(param_1 + 1) == 1) && (bVar1 = false, *(long *)*param_1 == 1)) {
    bVar1 = *(int *)(param_1 + 2) == 0;
  }
  return bVar1;
}

