/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3ffd4
 */

int FUN_00b3ffd4(undefined8 param_1,uchar **param_2)

{
  int iVar1;
  BIGNUM *bn;
  ASN1_INTEGER *a;
  undefined8 uVar2;
  
  bn = (BIGNUM *)DSA_get0_pub_key();
  if (bn == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x250,
                  "dsa_spki_pub_to_der");
    uVar2 = 0xdc;
  }
  else {
    a = BN_to_ASN1_INTEGER(bn,(ASN1_INTEGER *)0x0);
    if (a != (ASN1_INTEGER *)0x0) {
      iVar1 = i2d_ASN1_INTEGER(a,param_2);
      ASN1_STRING_clear_free(a);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x254,
                  "dsa_spki_pub_to_der");
    uVar2 = 0xa0;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

