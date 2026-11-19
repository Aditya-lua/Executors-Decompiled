/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1a58
 */

int FUN_00ab1a58(BIO *param_1,undefined8 *param_2,int param_3)

{
  int iVar1;
  
  BIO_printf(param_1,"%*sCertificate ID:\n",param_3,"");
  param_3 = param_3 + 2;
  BIO_printf(param_1,"%*sHash Algorithm: ",param_3,"");
  i2a_ASN1_OBJECT(param_1,(ASN1_OBJECT *)*param_2);
  BIO_printf(param_1,"\n%*sIssuer Name Hash: ",param_3,"");
  i2a_ASN1_STRING(param_1,(ASN1_STRING *)(param_2 + 2),0);
  BIO_printf(param_1,"\n%*sIssuer Key Hash: ",param_3,"");
  i2a_ASN1_STRING(param_1,(ASN1_STRING *)(param_2 + 5),0);
  BIO_printf(param_1,"\n%*sSerial Number: ",param_3,"");
  i2a_ASN1_INTEGER(param_1,(ASN1_INTEGER *)(param_2 + 8));
  iVar1 = BIO_printf(param_1,"\n");
  return iVar1;
}

