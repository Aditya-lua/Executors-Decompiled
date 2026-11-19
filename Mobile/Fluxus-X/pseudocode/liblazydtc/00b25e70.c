/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25e70
 */

bool FUN_00b25e70(long param_1,long param_2,long param_3,undefined8 param_4)

{
  long lVar1;
  int iVar2;
  
  lVar1 = param_1 + 0x18;
  if (param_3 == 0) {
    iVar2 = ossl_siv128_finish(lVar1);
    return iVar2 == 0;
  }
  if (param_2 == 0) {
    iVar2 = ossl_siv128_aad(lVar1,param_3,param_4);
    return iVar2 == 1;
  }
  if ((*(byte *)(param_1 + 4) & 1) == 0) {
    iVar2 = ossl_siv128_decrypt(lVar1,param_3,param_2);
  }
  else {
    iVar2 = ossl_siv128_encrypt(lVar1,param_3,param_2);
  }
  return 0 < iVar2;
}

