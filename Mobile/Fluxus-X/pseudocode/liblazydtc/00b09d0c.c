/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09d0c
 */

int X509_STORE_set_default_paths(X509_STORE *ctx)

{
  int iVar1;
  
  iVar1 = X509_STORE_set_default_paths_ex((int)ctx,0,0);
  return iVar1;
}

