/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32bd0
 */

int X509_NAME_print_ex(BIO *out,X509_NAME *nm,int indent,ulong flags)

{
  int iVar1;
  
  iVar1 = X509_NAME_print_ex(out,nm,indent,flags);
  return iVar1;
}

