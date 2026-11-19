/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af2240
 */

int X509_load_cert_file(X509_LOOKUP *ctx,char *file,int type)

{
  int iVar1;
  
  iVar1 = X509_load_cert_file_ex((int)ctx,file,type,0,0);
  return iVar1;
}

