/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eb78
 */

ASN1_VALUE * X509_new_ex(undefined8 param_1,char *param_2)

{
  ASN1_VALUE *val;
  char *pcVar1;
  
  val = (ASN1_VALUE *)ASN1_item_new_ex(&DAT_00c82968,param_1,param_2);
  if (val != (ASN1_VALUE *)0x0) {
    *(undefined8 *)(val + 0x170) = param_1;
    CRYPTO_free(*(void **)(val + 0x178));
    *(undefined8 *)(val + 0x178) = 0;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/x509/x_x509.c",0x99);
      *(char **)(val + 0x178) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c82968);
        val = (ASN1_VALUE *)0x0;
      }
    }
  }
  return val;
}

