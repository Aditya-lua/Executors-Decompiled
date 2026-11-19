/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e848
 */

ASN1_VALUE * X509_REQ_new_ex(undefined8 param_1,char *param_2)

{
  ASN1_VALUE *val;
  char *pcVar1;
  
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c827b0);
  if (val != (ASN1_VALUE *)0x0) {
    *(undefined8 *)(val + 0x68) = param_1;
    CRYPTO_free(*(void **)(val + 0x70));
    *(undefined8 *)(val + 0x70) = 0;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/x509/x_req.c",0x9b);
      *(char **)(val + 0x70) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c827b0);
        val = (ASN1_VALUE *)0x0;
      }
    }
  }
  return val;
}

