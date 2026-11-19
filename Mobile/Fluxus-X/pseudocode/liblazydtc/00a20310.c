/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20310
 */

DSA * ossl_dsa_key_from_pkcs8(PKCS8_PRIV_KEY_INFO *param_1)

{
  int iVar1;
  ASN1_INTEGER *ai;
  DSA *r;
  BIGNUM *bn;
  BIGNUM *pBVar2;
  BN_CTX *ctx;
  BIGNUM *m;
  BIGNUM *a;
  undefined8 uVar3;
  X509_ALGOR *local_70;
  int *local_68;
  int local_60;
  int local_5c;
  uchar *local_58;
  uchar *puStack_48;
  
  iVar1 = PKCS8_pkey_get0((ASN1_OBJECT **)0x0,&puStack_48,&local_5c,&local_70,param_1);
  if (iVar1 == 0) {
    return (DSA *)0x0;
  }
  X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_60,&local_68,local_70);
  ai = d2i_ASN1_INTEGER((ASN1_INTEGER **)0x0,&puStack_48,(long)local_5c);
  if (((ai == (ASN1_INTEGER *)0x0) || (ai->type == 0x102)) || (local_60 != 0x10)) {
LAB_00a20468:
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_backend.c",0xb8,"ossl_dsa_key_from_pkcs8");
    ERR_set_error(10,0x68,0);
    pBVar2 = (BIGNUM *)0x0;
    bn = (BIGNUM *)0x0;
    ctx = (BN_CTX *)0x0;
    r = (DSA *)0x0;
  }
  else {
    local_58 = *(uchar **)(local_68 + 2);
    r = d2i_DSAparams((DSA **)0x0,&local_58,(long)*local_68);
    if (r == (DSA *)0x0) goto LAB_00a20468;
    bn = (BIGNUM *)BN_secure_new();
    if ((bn == (BIGNUM *)0x0) || (pBVar2 = ASN1_INTEGER_to_BN(ai,bn), pBVar2 == (BIGNUM *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/dsa/dsa_backend.c",0x9c,"ossl_dsa_key_from_pkcs8");
      ERR_set_error(10,0x6d,0);
      pBVar2 = (BIGNUM *)0x0;
      ctx = (BN_CTX *)0x0;
    }
    else {
      pBVar2 = BN_new();
      if (pBVar2 == (BIGNUM *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/dsa/dsa_backend.c",0xa1,"ossl_dsa_key_from_pkcs8");
        ERR_set_error(10,0xc0100,0);
        ctx = (BN_CTX *)0x0;
      }
      else {
        ctx = BN_CTX_new();
        if (ctx == (BN_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/dsa/dsa_backend.c",0xa5,"ossl_dsa_key_from_pkcs8");
          uVar3 = 0xc0100;
        }
        else {
          m = (BIGNUM *)DSA_get0_p(r);
          a = (BIGNUM *)DSA_get0_g(r);
          BN_set_flags(bn,4);
          iVar1 = BN_mod_exp(pBVar2,a,bn,m,ctx);
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/dsa/dsa_backend.c",0xad,"ossl_dsa_key_from_pkcs8");
            uVar3 = 0x6d;
          }
          else {
            iVar1 = DSA_set0_key(r,pBVar2,bn);
            if (iVar1 != 0) goto LAB_00a204c0;
            ERR_new();
            ERR_set_debug("crypto/dsa/dsa_backend.c",0xb1,"ossl_dsa_key_from_pkcs8");
            uVar3 = 0xc0103;
          }
        }
        ERR_set_error(10,uVar3,0);
      }
    }
  }
  BN_free(bn);
  BN_free(pBVar2);
  DSA_free(r);
  r = (DSA *)0x0;
LAB_00a204c0:
  BN_CTX_free(ctx);
  ASN1_STRING_clear_free(ai);
  return r;
}

