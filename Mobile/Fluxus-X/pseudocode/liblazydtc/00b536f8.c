/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b536f8
 */

undefined8 FUN_00b536f8(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  EVP_CIPHER_CTX *pEVar3;
  long lVar4;
  undefined8 uVar5;
  
  lVar2 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if (lVar2 != 0) {
    pEVar3 = CMAC_CTX_get0_cipher_ctx(*(CMAC_CTX **)(param_1 + 8));
    lVar4 = EVP_CIPHER_CTX_get0_cipher();
    if (lVar4 == 0) {
      lVar4 = 0;
    }
    else {
      iVar1 = EVP_CIPHER_CTX_get_block_size(pEVar3);
      lVar4 = (long)iVar1;
    }
    uVar5 = OSSL_PARAM_set_size_t(lVar2,lVar4);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
  }
  lVar2 = OSSL_PARAM_locate(param_2,"block-size");
  if (lVar2 != 0) {
    pEVar3 = CMAC_CTX_get0_cipher_ctx(*(CMAC_CTX **)(param_1 + 8));
    lVar4 = EVP_CIPHER_CTX_get0_cipher();
    if (lVar4 == 0) {
      lVar4 = 0;
    }
    else {
      iVar1 = EVP_CIPHER_CTX_get_block_size(pEVar3);
      lVar4 = (long)iVar1;
    }
    uVar5 = OSSL_PARAM_set_size_t(lVar2,lVar4);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
  }
  return 1;
}

