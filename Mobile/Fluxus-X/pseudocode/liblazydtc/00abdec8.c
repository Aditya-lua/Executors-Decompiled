/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdec8
 */

ASN1_VALUE * PKCS7_new_ex(undefined8 param_1,char *param_2)

{
  ASN1_VALUE *val;
  char *pcVar1;
  
  val = (ASN1_VALUE *)ASN1_item_new_ex(&DAT_00c7b7a0,param_1,param_2);
  if (val != (ASN1_VALUE *)0x0) {
    *(undefined8 *)(val + 0x28) = param_1;
    *(undefined8 *)(val + 0x30) = 0;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/pkcs7/pk7_asn1.c",0x67);
      *(char **)(val + 0x30) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        CRYPTO_free((void *)0x0);
        ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7b7a0);
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_asn1.c",0x6b,"PKCS7_new_ex");
        ERR_set_error(0x39,0xc0100,0);
        val = (ASN1_VALUE *)0x0;
      }
    }
  }
  return val;
}

