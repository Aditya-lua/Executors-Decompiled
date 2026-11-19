/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9a84
 */

int i2d_PublicKey(EVP_PKEY *a,uchar **pp)

{
  int iVar1;
  RSA *a_00;
  EC_KEY *key;
  DSA *a_01;
  
  if (*(long *)&a[1].save_parameters != 0) {
    iVar1 = FUN_00ab98b4(a,0x86,&PTR_DAT_00c7b058,pp);
    return iVar1;
  }
  iVar1 = EVP_PKEY_get_base_id(a);
  if (iVar1 == 0x198) {
    key = (EC_KEY *)EVP_PKEY_get0_EC_KEY(a);
    iVar1 = i2o_ECPublicKey(key,pp);
    return iVar1;
  }
  if (iVar1 == 0x74) {
    a_01 = (DSA *)EVP_PKEY_get0_DSA(a);
    iVar1 = i2d_DSAPublicKey(a_01,pp);
    return iVar1;
  }
  if (iVar1 == 6) {
    a_00 = (RSA *)EVP_PKEY_get0_RSA(a);
    iVar1 = i2d_RSAPublicKey(a_00,pp);
    return iVar1;
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/i2d_evp.c",0x92,"i2d_PublicKey");
  ERR_set_error(0xd,0xa7,0);
  return -1;
}

