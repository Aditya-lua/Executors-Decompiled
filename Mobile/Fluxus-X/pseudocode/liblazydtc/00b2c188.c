/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c188
 */

long FUN_00b2c188(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = CRYPTO_zalloc(0x140,"providers/implementations/ciphers/cipher_sm4.c",0x2e);
    if (lVar2 != 0) {
      uVar3 = ossl_prov_cipher_hw_sm4_ecb(0x80);
      ossl_cipher_generic_initkey(lVar2,0x80,0x80,0,1,0,uVar3,param_1);
    }
  }
  return lVar2;
}

