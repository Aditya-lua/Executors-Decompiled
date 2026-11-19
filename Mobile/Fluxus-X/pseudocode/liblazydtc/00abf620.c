/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abf620
 */

undefined8 FUN_00abf620(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  BIO_METHOD *type;
  BIO *bp;
  undefined8 uVar1;
  undefined8 uVar2;
  EVP_MD *pEVar3;
  EVP_MD *parg;
  long lVar4;
  BIO *pBVar5;
  char acStack_64 [52];
  
  type = BIO_f_md();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    uVar1 = 0x42;
LAB_00abf704:
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar1,"pkcs7_bio_add_digest");
    uVar1 = 0x80020;
  }
  else {
    OBJ_obj2txt(acStack_64,0x32,(ASN1_OBJECT *)*param_2,0);
    ERR_set_mark();
    uVar1 = ossl_pkcs7_ctx_get0_libctx(param_3);
    uVar2 = ossl_pkcs7_ctx_get0_propq(param_3);
    pEVar3 = (EVP_MD *)EVP_MD_fetch(uVar1,acStack_64,uVar2);
    parg = pEVar3;
    if ((pEVar3 != (EVP_MD *)0x0) ||
       (parg = EVP_get_digestbyname(acStack_64), parg != (EVP_MD *)0x0)) {
      ERR_pop_to_mark();
      lVar4 = BIO_ctrl(bp,0x6f,0,parg);
      if (lVar4 < 1) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x58,"pkcs7_bio_add_digest");
        ERR_set_error(0x21,0x80020,0);
        EVP_MD_free(pEVar3);
        goto LAB_00abf758;
      }
      EVP_MD_free(pEVar3);
      if ((BIO *)*param_1 == (BIO *)0x0) {
        *param_1 = bp;
        return 1;
      }
      pBVar5 = BIO_push((BIO *)*param_1,bp);
      if (pBVar5 != (BIO *)0x0) {
        return 1;
      }
      ERR_new();
      uVar1 = 0x60;
      goto LAB_00abf704;
    }
    ERR_clear_last_mark();
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x52,"pkcs7_bio_add_digest");
    uVar1 = 0x6d;
  }
  ERR_set_error(0x21,uVar1,0);
LAB_00abf758:
  BIO_free(bp);
  return 0;
}

