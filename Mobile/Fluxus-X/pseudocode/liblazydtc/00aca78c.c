/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca78c
 */

long ossl_rand_pool_entropy_needed(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = *(ulong *)(param_1 + 0x30);
  uVar1 = *(ulong *)(param_1 + 0x38);
  if (*(ulong *)(param_1 + 0x38) <= uVar2) {
    uVar1 = uVar2;
  }
  return uVar1 - uVar2;
}

