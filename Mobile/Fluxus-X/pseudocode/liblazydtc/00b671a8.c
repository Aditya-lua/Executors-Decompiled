/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b671a8
 */

bool ossl_ccm_generic_auth_encrypt(long param_1)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long in_x4;
  undefined8 in_x5;
  
  if (*(long *)(param_1 + 0x88) == 0) {
    iVar2 = CRYPTO_ccm128_encrypt(param_1 + 0x50);
  }
  else {
    iVar2 = CRYPTO_ccm128_encrypt_ccm64();
  }
  bVar1 = iVar2 == 0;
  if ((in_x4 != 0) && (iVar2 == 0)) {
    lVar3 = CRYPTO_ccm128_tag(param_1 + 0x50,in_x4,in_x5);
    bVar1 = lVar3 != 0;
  }
  return bVar1;
}

