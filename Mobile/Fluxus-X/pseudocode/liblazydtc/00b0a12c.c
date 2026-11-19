/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a12c
 */

int X509_REVOKED_get_ext_count(X509_REVOKED *x)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_count(*(stack_st_X509_EXTENSION **)&x->reason);
  return iVar1;
}

