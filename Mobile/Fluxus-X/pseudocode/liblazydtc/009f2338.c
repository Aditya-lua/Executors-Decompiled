/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2338
 */

EVP_PKEY *
ossl_d2i_PrivateKey_legacy
          (int param_1,long *param_2,undefined8 *param_3,ulong param_4,undefined8 param_5,
          undefined8 param_6)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  PKCS8_PRIV_KEY_INFO *a;
  EVP_PKEY *pEVar5;
  undefined8 uVar6;
  long lVar7;
  EVP_PKEY *pkey;
  uchar *local_48;
  
  local_48 = (uchar *)*param_3;
  if ((param_2 == (long *)0x0) || (pkey = (EVP_PKEY *)*param_2, pkey == (EVP_PKEY *)0x0)) {
    pkey = EVP_PKEY_new();
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/d2i_pr.c",0x56,"ossl_d2i_PrivateKey_legacy");
      ERR_set_error(0xd,0x80006,0);
      return (EVP_PKEY *)0x0;
    }
  }
  else {
    ENGINE_finish((ENGINE *)pkey->ameth);
    pkey->ameth = (EVP_PKEY_ASN1_METHOD *)0x0;
  }
  iVar1 = EVP_PKEY_set_type(pkey,param_1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/d2i_pr.c",0x62,"ossl_d2i_PrivateKey_legacy");
    uVar6 = 0xa3;
  }
  else {
    uVar2 = ERR_set_mark();
    uVar4 = (ulong)uVar2;
    lVar7 = *(long *)&pkey->references;
    if (*(code **)(lVar7 + 0xb8) != (code *)0x0) {
      uVar4 = (**(code **)(lVar7 + 0xb8))(pkey,&local_48,param_4 & 0xffffffff);
      if ((int)uVar4 != 0) {
        ERR_clear_last_mark();
        pEVar5 = pkey;
        goto LAB_009f24b0;
      }
      lVar7 = *(long *)&pkey->references;
    }
    if ((*(long *)(lVar7 + 0x40) != 0) || (*(long *)(lVar7 + 0x138) != 0)) {
      a = d2i_PKCS8_PRIV_KEY_INFO((PKCS8_PRIV_KEY_INFO **)0x0,&local_48,param_4);
      if (a == (PKCS8_PRIV_KEY_INFO *)0x0) {
        ERR_clear_last_mark();
      }
      else {
        pEVar5 = (EVP_PKEY *)evp_pkcs82pkey_legacy(a,param_5,param_6);
        PKCS8_PRIV_KEY_INFO_free(a);
        if (pEVar5 == (EVP_PKEY *)0x0) {
          ERR_clear_last_mark();
        }
        else {
          EVP_PKEY_free(pkey);
          ERR_pop_to_mark();
          iVar1 = EVP_PKEY_type(param_1);
          iVar3 = EVP_PKEY_get_base_id(pEVar5);
          pkey = pEVar5;
          if (iVar1 == iVar3) {
LAB_009f24b0:
            *param_3 = local_48;
            if (param_2 == (long *)0x0) {
              return pEVar5;
            }
            *param_2 = (long)pEVar5;
            return pEVar5;
          }
        }
      }
      goto joined_r0x009f2400;
    }
    ERR_clear_last_mark(uVar4);
    ERR_new();
    ERR_set_debug("crypto/asn1/d2i_pr.c",0x7f,"ossl_d2i_PrivateKey_legacy");
    uVar6 = 0x8000d;
  }
  ERR_set_error(0xd,uVar6,0);
joined_r0x009f2400:
  if ((param_2 == (long *)0x0) || ((EVP_PKEY *)*param_2 != pkey)) {
    EVP_PKEY_free(pkey);
  }
  return (EVP_PKEY *)0x0;
}

