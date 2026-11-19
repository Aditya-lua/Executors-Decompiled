/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2630c
 */

int i2o_ECPublicKey(EC_KEY *key,uchar **out)

{
  undefined4 uVar1;
  bool bVar2;
  size_t len;
  size_t sVar3;
  uchar *buf;
  
  if (key == (EC_KEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x48d,"i2o_ECPublicKey");
    uVar1 = 0xc0102;
LAB_00a2638c:
    ERR_set_error(0x10,uVar1,0);
  }
  else {
    len = EC_POINT_point2oct(*(EC_GROUP **)(key + 0x18),*(EC_POINT **)(key + 0x20),
                             *(point_conversion_form_t *)(key + 0x34),(uchar *)0x0,0,(BN_CTX *)0x0);
    if ((out == (uchar **)0x0) || (len == 0)) goto LAB_00a26398;
    buf = *out;
    if (buf == (uchar *)0x0) {
      buf = CRYPTO_malloc((int)len,"crypto/ec/ec_asn1.c",0x499);
      *out = buf;
      if (buf == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x49a,"i2o_ECPublicKey");
        uVar1 = 0xc0100;
        goto LAB_00a2638c;
      }
      bVar2 = true;
    }
    else {
      bVar2 = false;
    }
    sVar3 = EC_POINT_point2oct(*(EC_GROUP **)(key + 0x18),*(EC_POINT **)(key + 0x20),
                               *(point_conversion_form_t *)(key + 0x34),buf,len,(BN_CTX *)0x0);
    if (sVar3 != 0) {
      if (!bVar2) {
        *out = *out + len;
      }
      goto LAB_00a26398;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x4a1,"i2o_ECPublicKey");
    ERR_set_error(0x10,0x80010,0);
    if (bVar2) {
      CRYPTO_free(*out);
      len = 0;
      *out = (uchar *)0x0;
      goto LAB_00a26398;
    }
  }
  len = 0;
LAB_00a26398:
  return (int)len;
}

