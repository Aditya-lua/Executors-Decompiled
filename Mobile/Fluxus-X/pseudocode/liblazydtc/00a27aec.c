/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27aec
 */

EC_KEY * ossl_ec_key_from_pkcs8(PKCS8_PRIV_KEY_INFO *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  EC_KEY *pEVar2;
  X509_ALGOR *local_40;
  EC_KEY *local_38;
  int local_2c;
  uchar *local_28;
  
  local_28 = (uchar *)0x0;
  local_38 = (EC_KEY *)0x0;
  iVar1 = PKCS8_pkey_get0((ASN1_OBJECT **)0x0,&local_28,&local_2c,&local_40,param_1);
  if (iVar1 != 0) {
    local_38 = (EC_KEY *)ossl_ec_key_param_from_x509_algor(local_40,param_2,param_3);
    if (local_38 != (EC_KEY *)0x0) {
      pEVar2 = d2i_ECPrivateKey(&local_38,&local_28,(long)local_2c);
      if (pEVar2 != (EC_KEY *)0x0) {
        return local_38;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_backend.c",0x341,"ossl_ec_key_from_pkcs8");
      ERR_set_error(0x10,0x8e,0);
    }
    EC_KEY_free(local_38);
  }
  return (EC_KEY *)0x0;
}

