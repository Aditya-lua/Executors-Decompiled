/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a25ac4
 */

int i2d_ECPKParameters(EC_GROUP *param_1,uchar **out)

{
  int iVar1;
  ASN1_VALUE *val;
  
  val = (ASN1_VALUE *)EC_GROUP_get_ecpkparameters(param_1,0);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x39b,"i2d_ECPKParameters");
    ERR_set_error(0x10,0x78,0);
    iVar1 = 0;
  }
  else {
    iVar1 = ASN1_item_i2d(val,out,(ASN1_ITEM *)&DAT_00c5ade8);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x39f,"i2d_ECPKParameters");
      ERR_set_error(0x10,0x79,0);
    }
    ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5ade8);
  }
  return iVar1;
}

