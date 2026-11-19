/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a23578
 */

undefined8 FUN_00a23578(X509_PUBKEY *param_1,long param_2)

{
  int iVar1;
  uchar *penc;
  ASN1_OBJECT *aobj;
  EC_KEY *key;
  uchar *local_48;
  int local_3c;
  ASN1_STRING *local_38;
  
  key = *(EC_KEY **)(param_2 + 0x20);
  local_38 = (ASN1_STRING *)0x0;
  iVar1 = FUN_00a242dc(&local_3c,&local_38,key);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_ameth.c",0x4d,"eckey_pub_encode");
    ERR_set_error(0x10,0x80010,0);
    return 0;
  }
  iVar1 = i2o_ECPublicKey(key,(uchar **)0x0);
  if (iVar1 < 1) {
    penc = (uchar *)0x0;
  }
  else {
    penc = CRYPTO_malloc(iVar1,"crypto/ec/ec_ameth.c",0x53);
    if (penc != (uchar *)0x0) {
      local_48 = penc;
      iVar1 = i2o_ECPublicKey(key,&local_48);
      if (0 < iVar1) {
        aobj = OBJ_nid2obj(0x198);
        iVar1 = X509_PUBKEY_set0_param(param_1,aobj,local_3c,local_38,penc,iVar1);
        if (iVar1 != 0) {
          return 1;
        }
      }
    }
  }
  if (local_3c == 0x10) {
    ASN1_STRING_free(local_38);
  }
  CRYPTO_free(penc);
  return 0;
}

