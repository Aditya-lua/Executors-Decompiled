/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09fe8
 */

int X509_STORE_load_locations(X509_STORE *ctx,char *file,char *dir)

{
  int iVar1;
  
  iVar1 = X509_STORE_load_locations_ex((int)ctx,file,dir,0,0);
  return iVar1;
}

