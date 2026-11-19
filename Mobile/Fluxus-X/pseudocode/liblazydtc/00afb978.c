/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb978
 */

void X509_POLICY_NODE_print(BIO *out,X509_POLICY_NODE *node,int indent)

{
  int param2;
  char *param4;
  uint *puVar1;
  
  puVar1 = *(uint **)node;
  BIO_printf(out,"%*sPolicy: ",indent,"");
  i2a_ASN1_OBJECT(out,*(ASN1_OBJECT **)(puVar1 + 2));
  BIO_puts(out,"\n");
  param2 = indent + 2;
  param4 = "Non Critical";
  if ((*puVar1 & 0x10) != 0) {
    param4 = "Critical";
  }
  BIO_printf(out,"%*s%s\n",param2,"",param4);
  if (*(long *)(puVar1 + 4) == 0) {
    BIO_printf(out,"%*sNo Qualifiers\n",param2,"");
    return;
  }
  FUN_00afba58(out,*(long *)(puVar1 + 4),param2);
  BIO_puts(out,"\n");
  return;
}

