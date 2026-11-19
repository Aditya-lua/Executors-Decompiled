/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2349c
 */

ulong FUN_00a2349c(EVP_PKEY *param_1,X509_PUBKEY *param_2)

{
  uint uVar1;
  ulong uVar2;
  EC_KEY *pEVar3;
  undefined8 local_50;
  undefined8 local_48;
  X509_ALGOR *pXStack_40;
  EC_KEY *local_38;
  int local_2c;
  uchar *local_28;
  
  local_28 = (uchar *)0x0;
  local_38 = (EC_KEY *)0x0;
  local_50 = 0;
  local_48 = 0;
  uVar2 = ossl_x509_PUBKEY_get0_libctx(&local_48,&local_50,param_2);
  if ((int)uVar2 != 0) {
    uVar1 = X509_PUBKEY_get0_param((ASN1_OBJECT **)0x0,&local_28,&local_2c,&pXStack_40,param_2);
    uVar2 = (ulong)uVar1;
    if (uVar1 != 0) {
      local_38 = (EC_KEY *)ossl_ec_key_param_from_x509_algor(pXStack_40,local_48,local_50);
      uVar2 = 0;
      if (local_38 != (EC_KEY *)0x0) {
        pEVar3 = o2i_ECPublicKey(&local_38,&local_28,(long)local_2c);
        if (pEVar3 == (EC_KEY *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_ameth.c",0x77,"eckey_pub_decode");
          ERR_set_error(0x10,0x8e,0);
          EC_KEY_free(local_38);
          uVar2 = 0;
        }
        else {
          EVP_PKEY_assign(param_1,0x198,local_38);
          uVar2 = 1;
        }
      }
    }
  }
  return uVar2;
}

