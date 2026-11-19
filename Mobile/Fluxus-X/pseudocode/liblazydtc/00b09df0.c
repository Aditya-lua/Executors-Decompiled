/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09df0
 */

bool X509_STORE_load_path(X509_STORE *param_1,char *param_2)

{
  int iVar1;
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *ctx;
  
  if (param_2 != (char *)0x0) {
    m = X509_LOOKUP_hash_dir();
    ctx = X509_STORE_add_lookup(param_1,m);
    if (ctx != (X509_LOOKUP *)0x0) {
      iVar1 = X509_LOOKUP_ctrl(ctx,2,param_2,1,(char **)0x0);
      return 0 < iVar1;
    }
  }
  return false;
}

