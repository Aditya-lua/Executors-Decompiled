/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca764
 */

ulong ossl_rand_pool_entropy_available(long param_1)

{
  ulong uVar1;
  
  uVar1 = 0;
  if ((*(ulong *)(param_1 + 0x38) <= *(ulong *)(param_1 + 0x30)) &&
     (uVar1 = 0, *(ulong *)(param_1 + 0x18) <= *(ulong *)(param_1 + 8))) {
    uVar1 = *(ulong *)(param_1 + 0x30);
  }
  return uVar1;
}

