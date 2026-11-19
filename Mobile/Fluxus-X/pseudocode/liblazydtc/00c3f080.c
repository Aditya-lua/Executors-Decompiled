/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f080
 */

int X509V3_extensions_print
              (BIO *out,char *title,stack_st_X509_EXTENSION *exts,ulong flag,int indent)

{
  int iVar1;
  
  iVar1 = X509V3_extensions_print(out,title,exts,flag,indent);
  return iVar1;
}

