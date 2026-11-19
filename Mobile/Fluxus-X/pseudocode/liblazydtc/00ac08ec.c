/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac08ec
 */

BIO * FUN_00ac08ec(long *param_1,BIO *param_2,int param_3)

{
  int iVar1;
  BIO *pBVar2;
  undefined8 uVar3;
  
  pBVar2 = BIO_find_type(param_2,0x208);
  if (pBVar2 != (BIO *)0x0) {
    do {
      BIO_ctrl(pBVar2,0x78,0,param_1);
      if (*param_1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x2af,"PKCS7_find_digest");
        uVar3 = 0xc0103;
        goto LAB_00ac09b0;
      }
      EVP_MD_CTX_get0_md();
      iVar1 = EVP_MD_get_type();
      if (iVar1 == param_3) {
        return pBVar2;
      }
      pBVar2 = BIO_next(pBVar2);
      pBVar2 = BIO_find_type(pBVar2,0x208);
    } while (pBVar2 != (BIO *)0x0);
  }
  ERR_new();
  ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x2aa,"PKCS7_find_digest");
  uVar3 = 0x6c;
LAB_00ac09b0:
  ERR_set_error(0x21,uVar3,0);
  return (BIO *)0x0;
}

