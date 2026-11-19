/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69644
 */

void EVP_CIPHER_do_all(fn *fn,void *arg)

{
  void *local_30;
  fn *pfStack_28;
  
  OPENSSL_init_crypto(4,0);
  local_30 = arg;
  pfStack_28 = fn;
  OBJ_NAME_do_all(2,(fn *)&LAB_00a69690,&local_30);
  return;
}

