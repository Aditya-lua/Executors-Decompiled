/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a668b4
 */

bool EVP_KEYMGMT_is_a(long param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  
  bVar1 = false;
  if (param_1 != 0) {
    iVar2 = evp_is_a(*(undefined8 *)(param_1 + 0x18),*(undefined4 *)(param_1 + 4),0,param_2);
    bVar1 = iVar2 != 0;
  }
  return bVar1;
}

