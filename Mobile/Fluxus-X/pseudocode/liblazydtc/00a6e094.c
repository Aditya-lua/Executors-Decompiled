/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e094
 */

ulong EVP_PKEY_is_a(int *param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  
  uVar3 = 0;
  if (param_1 != (int *)0x0) {
    if (*(long *)(param_1 + 0x18) != 0) {
      uVar3 = EVP_KEYMGMT_is_a(*(long *)(param_1 + 0x18));
      return uVar3;
    }
    iVar1 = *param_1;
    iVar2 = evp_pkey_name2type(param_2);
    uVar3 = (ulong)(iVar1 == iVar2);
  }
  return uVar3;
}

