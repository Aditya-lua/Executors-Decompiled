/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fab4
 */

void EVP_MD_CTX_set_pkey_ctx(long param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = *(ulong *)(param_1 + 0x18);
  if (((uint)uVar2 >> 10 & 1) == 0) {
    EVP_PKEY_CTX_free(*(EVP_PKEY_CTX **)(param_1 + 0x28));
    uVar2 = *(ulong *)(param_1 + 0x18);
  }
  uVar1 = uVar2 & 0xfffffffffffffbff;
  if (param_2 != 0) {
    uVar1 = uVar2 | 0x400;
  }
  *(long *)(param_1 + 0x28) = param_2;
  *(ulong *)(param_1 + 0x18) = uVar1;
  return;
}

