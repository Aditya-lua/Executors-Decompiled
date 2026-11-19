/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75bcc
 */

ulong EVP_PKEY_CTX_is_a(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  
  if (*(long *)(param_1 + 0x20) == 0) {
    iVar1 = **(int **)(param_1 + 0x78);
    iVar2 = evp_pkey_name2type(param_2);
    return (ulong)(iVar1 == iVar2);
  }
  uVar3 = EVP_KEYMGMT_is_a();
  return uVar3;
}

