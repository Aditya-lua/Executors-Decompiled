/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a260b8
 */

int i2d_ECParameters(EC_KEY *key,uchar **out)

{
  int iVar1;
  
  if (key == (EC_KEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x448,"i2d_ECParameters");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  iVar1 = i2d_ECPKParameters(*(EC_GROUP **)(key + 0x18),out);
  return iVar1;
}

