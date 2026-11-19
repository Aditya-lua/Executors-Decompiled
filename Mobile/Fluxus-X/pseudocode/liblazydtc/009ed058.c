/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed058
 */

int X509_NAME_print_ex(BIO *out,X509_NAME *nm,int indent,ulong flags)

{
  int iVar1;
  
  if (flags == 0) {
    iVar1 = X509_NAME_print(out,nm,indent);
    return iVar1;
  }
  iVar1 = FUN_009ed088(&LAB_009ed448);
  return iVar1;
}

