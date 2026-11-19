/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1caac
 */

ASN1_VALUE * X509_PUBKEY_new_ex(undefined8 param_1,char *param_2)

{
  ASN1_VALUE *val;
  char *pcVar1;
  
  val = (ASN1_VALUE *)ASN1_item_new_ex(&DAT_00c82640,param_1,param_2);
  if (val != (ASN1_VALUE *)0x0) {
    *(undefined8 *)(val + 0x18) = param_1;
    CRYPTO_free(*(void **)(val + 0x20));
    *(undefined8 *)(val + 0x20) = 0;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/x509/x_pubkey.c",0x37);
      *(char **)(val + 0x20) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c82640);
        val = (ASN1_VALUE *)0x0;
      }
    }
  }
  return val;
}

