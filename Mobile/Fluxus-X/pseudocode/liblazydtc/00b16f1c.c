/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16f1c
 */

int ossl_asn1_item_digest_ex
              (ASN1_ITEM *param_1,EVP_MD *param_2,ASN1_VALUE *param_3,uchar *param_4,uint *param_5,
              undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  int nid;
  long lVar2;
  ENGINE *e;
  undefined8 uVar3;
  EVP_MD *type;
  uchar *local_58;
  
  local_58 = (uchar *)0x0;
  iVar1 = ASN1_item_i2d(param_3,&local_58,param_1);
  if (iVar1 < 0) {
    return 0;
  }
  if (local_58 == (uchar *)0x0) {
    return 0;
  }
  lVar2 = EVP_MD_get0_provider(param_2);
  type = param_2;
  if (lVar2 == 0) {
    nid = EVP_MD_get_type(param_2);
    e = ENGINE_get_digest_engine(nid);
    if (e == (ENGINE *)0x0) {
      uVar3 = EVP_MD_get0_name(param_2);
      type = (EVP_MD *)EVP_MD_fetch(param_6,uVar3,param_7);
    }
    else {
      ENGINE_finish(e);
    }
  }
  if (type == (EVP_MD *)0x0) {
    iVar1 = 0;
  }
  else {
    iVar1 = EVP_Digest(local_58,(long)iVar1,param_4,param_5,type,(ENGINE *)0x0);
  }
  CRYPTO_free(local_58);
  if (type != param_2) {
    EVP_MD_free(type);
  }
  return iVar1;
}

