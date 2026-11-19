/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b28bbc
 */

long FUN_00b28bbc(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = CRYPTO_zalloc(0x3d8,"providers/implementations/ciphers/cipher_aria_gcm.c",0x17);
    if (lVar2 != 0) {
      uVar3 = ossl_prov_aria_hw_gcm(0x80);
      ossl_gcm_initctx(param_1,lVar2,0x80,uVar3);
    }
  }
  return lVar2;
}

