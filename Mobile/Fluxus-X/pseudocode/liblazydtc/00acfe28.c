/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acfe28
 */

RSA * ossl_rsa_key_from_pkcs8(PKCS8_PRIV_KEY_INFO *param_1)

{
  int iVar1;
  RSA *r;
  undefined8 uVar2;
  X509_ALGOR *local_30;
  int local_24;
  uchar *puStack_18;
  
  iVar1 = PKCS8_pkey_get0((ASN1_OBJECT **)0x0,&puStack_18,&local_24,&local_30,param_1);
  if (iVar1 == 0) {
    r = (RSA *)0x0;
  }
  else {
    r = d2i_RSAPrivateKey((RSA **)0x0,&puStack_18,(long)local_24);
    if (r == (RSA *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_backend.c",0x230,"ossl_rsa_key_from_pkcs8");
      ERR_set_error(4,0x80004,0);
    }
    else {
      iVar1 = ossl_rsa_param_decode(r,local_30);
      if (iVar1 == 0) {
        RSA_free(r);
        r = (RSA *)0x0;
      }
      else {
        RSA_clear_flags(r,0xf000);
        iVar1 = OBJ_obj2nid(local_30->algorithm);
        if (iVar1 == 0x390) {
          uVar2 = 0x1000;
        }
        else {
          if (iVar1 != 6) {
            return r;
          }
          uVar2 = 0;
        }
        RSA_set_flags(r,uVar2);
      }
    }
  }
  return r;
}

