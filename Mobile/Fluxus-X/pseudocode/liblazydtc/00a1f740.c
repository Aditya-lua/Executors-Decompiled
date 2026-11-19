/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f740
 */

bool FUN_00a1f740(long param_1,long param_2)

{
  int iVar1;
  
  iVar1 = BN_cmp(*(BIGNUM **)(*(long *)(param_2 + 0x20) + 0x68),
                 *(BIGNUM **)(*(long *)(param_1 + 0x20) + 0x68));
  return iVar1 == 0;
}

