/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acd8ac
 */

undefined4
ossl_rsa_pss_to_ctx(EVP_MD_CTX *param_1,EVP_PKEY_CTX *param_2,undefined8 *param_3,EVP_PKEY *param_4)

{
  int iVar1;
  int iVar2;
  RSA_PSS_PARAMS *a;
  undefined8 uVar3;
  undefined4 uVar4;
  undefined8 local_58;
  EVP_MD *local_50;
  undefined8 local_48;
  undefined4 local_3c;
  EVP_PKEY_CTX *local_38;
  
  local_50 = (EVP_MD *)0x0;
  local_48 = 0;
  local_38 = param_2;
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_3);
  if (iVar1 != 0x390) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_ameth.c",0x215,"ossl_rsa_pss_to_ctx");
    ERR_set_error(4,0x9b,0);
    return 0xffffffff;
  }
  a = (RSA_PSS_PARAMS *)ossl_rsa_pss_decode(param_3);
  iVar1 = ossl_rsa_pss_get_param(a,&local_50,&local_48,&local_3c);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_ameth.c",0x21c,"ossl_rsa_pss_to_ctx");
    uVar3 = 0x95;
LAB_00acd988:
    ERR_set_error(4,uVar3,0);
  }
  else if (param_4 == (EVP_PKEY *)0x0) {
    iVar1 = EVP_PKEY_CTX_get_signature_md(param_2,&local_58);
    if (0 < iVar1) {
      iVar1 = EVP_MD_get_type(local_50);
      iVar2 = EVP_MD_get_type(local_58);
      if (iVar1 != iVar2) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_ameth.c",0x229,"ossl_rsa_pss_to_ctx");
        uVar3 = 0x9e;
        goto LAB_00acd988;
      }
      goto LAB_00acd9c8;
    }
  }
  else {
    iVar1 = EVP_DigestVerifyInit(param_1,&local_38,local_50,(ENGINE *)0x0,param_4);
    if (iVar1 != 0) {
LAB_00acd9c8:
      iVar1 = EVP_PKEY_CTX_set_rsa_padding(local_38,6);
      if (0 < iVar1) {
        iVar1 = EVP_PKEY_CTX_set_rsa_pss_saltlen(local_38,local_3c);
        uVar4 = 0xffffffff;
        if (0 < iVar1) {
          iVar1 = EVP_PKEY_CTX_set_rsa_mgf1_md(local_38,local_48);
          uVar4 = 1;
          if (iVar1 < 1) {
            uVar4 = 0xffffffff;
          }
        }
        goto LAB_00acda10;
      }
    }
  }
  uVar4 = 0xffffffff;
LAB_00acda10:
  RSA_PSS_PARAMS_free(a);
  return uVar4;
}

