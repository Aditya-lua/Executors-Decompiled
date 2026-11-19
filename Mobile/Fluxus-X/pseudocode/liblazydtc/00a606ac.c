/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a606ac
 */

PKCS8_PRIV_KEY_INFO * EVP_PKEY2PKCS8(EVP_PKEY *pkey)

{
  int iVar1;
  long lVar2;
  PKCS8_PRIV_KEY_INFO *a;
  undefined8 uVar3;
  code *pcVar4;
  uchar *local_38;
  long local_30;
  uchar *local_28;
  
  if (*(long *)&pkey[1].save_parameters == 0) {
    a = PKCS8_PRIV_KEY_INFO_new();
    if (a == (PKCS8_PRIV_KEY_INFO *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_pkey.c",0x85,"EVP_PKEY2PKCS8");
      ERR_set_error(6,0xc0100,0);
      return (PKCS8_PRIV_KEY_INFO *)0x0;
    }
    if (*(long *)&pkey->references == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_pkey.c",0x94,"EVP_PKEY2PKCS8");
      uVar3 = 0x76;
    }
    else {
      pcVar4 = *(code **)(*(long *)&pkey->references + 0x48);
      if (pcVar4 == (code *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_pkey.c",0x90,"EVP_PKEY2PKCS8");
        uVar3 = 0x90;
      }
      else {
        iVar1 = (*pcVar4)(a,pkey);
        if (iVar1 != 0) {
          lVar2 = 0;
          goto LAB_00a6083c;
        }
        ERR_new();
        ERR_set_debug("crypto/evp/evp_pkey.c",0x8c,"EVP_PKEY2PKCS8");
        uVar3 = 0x92;
      }
    }
    ERR_set_error(6,uVar3,0);
    lVar2 = 0;
  }
  else {
    local_30 = 0;
    local_28 = (uchar *)0x0;
    lVar2 = OSSL_ENCODER_CTX_new_for_pkey(pkey,0x87,&DAT_002b7291,"PrivateKeyInfo",0);
    if ((lVar2 == 0) || (iVar1 = OSSL_ENCODER_to_data(lVar2,&local_28,&local_30), iVar1 == 0)) {
      a = (PKCS8_PRIV_KEY_INFO *)0x0;
    }
    else {
      local_38 = local_28;
      a = d2i_PKCS8_PRIV_KEY_INFO((PKCS8_PRIV_KEY_INFO **)0x0,&local_38,local_30);
      CRYPTO_free(local_28);
      if (a != (PKCS8_PRIV_KEY_INFO *)0x0) goto LAB_00a6083c;
      a = (PKCS8_PRIV_KEY_INFO *)0x0;
    }
  }
  PKCS8_PRIV_KEY_INFO_free(a);
  a = (PKCS8_PRIV_KEY_INFO *)0x0;
LAB_00a6083c:
  OSSL_ENCODER_CTX_free(lVar2);
  return a;
}

