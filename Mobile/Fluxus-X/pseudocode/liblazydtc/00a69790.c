/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69790
 */

void EVP_MD_do_all_sorted(fn *fn,void *arg)

{
  void *local_30;
  fn *pfStack_28;
  
  OPENSSL_init_crypto(8,0);
  local_30 = arg;
  pfStack_28 = fn;
  OBJ_NAME_do_all_sorted(1,(fn *)&LAB_00a6975c,&local_30);
  return;
}

