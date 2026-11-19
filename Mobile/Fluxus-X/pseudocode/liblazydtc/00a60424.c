/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60424
 */

EVP_PKEY * evp_pkcs82pkey_legacy(PKCS8_PRIV_KEY_INFO *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  EVP_PKEY *pkey;
  undefined8 uVar2;
  code *pcVar3;
  char acStack_88 [80];
  ASN1_OBJECT *local_38;
  
  iVar1 = PKCS8_pkey_get0(&local_38,(uchar **)0x0,(int *)0x0,(X509_ALGOR **)0x0,param_1);
  if (iVar1 != 0) {
    pkey = EVP_PKEY_new();
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_pkey.c",0x23,"evp_pkcs82pkey_legacy");
      ERR_set_error(6,0xc0100,0);
      return (EVP_PKEY *)0x0;
    }
    iVar1 = OBJ_obj2nid(local_38);
    iVar1 = EVP_PKEY_set_type(pkey,iVar1);
    if (iVar1 == 0) {
      iVar1 = i2t_ASN1_OBJECT(acStack_88,0x50,local_38);
      ERR_new(iVar1);
      ERR_set_debug("crypto/evp/evp_pkey.c",0x29,"evp_pkcs82pkey_legacy");
      ERR_set_error(6,0x76,"TYPE=%s",acStack_88);
    }
    else {
      pcVar3 = *(code **)(*(long *)&pkey->references + 0x138);
      if (pcVar3 == (code *)0x0) {
        pcVar3 = *(code **)(*(long *)&pkey->references + 0x40);
        if (pcVar3 == (code *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/evp/evp_pkey.c",0x37,"evp_pkcs82pkey_legacy");
          uVar2 = 0x90;
        }
        else {
          iVar1 = (*pcVar3)(pkey,param_1);
          if (iVar1 != 0) {
            return pkey;
          }
          ERR_new();
          ERR_set_debug("crypto/evp/evp_pkey.c",0x33,"evp_pkcs82pkey_legacy");
          uVar2 = 0x91;
        }
        ERR_set_error(6,uVar2,0);
      }
      else {
        iVar1 = (*pcVar3)(pkey,param_1,param_2,param_3);
        if (iVar1 != 0) {
          return pkey;
        }
      }
    }
    EVP_PKEY_free(pkey);
  }
  return (EVP_PKEY *)0x0;
}

