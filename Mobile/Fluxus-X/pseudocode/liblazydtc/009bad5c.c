/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bad5c
 */

int FUN_009bad5c(long param_1,char *param_2)

{
  int iVar1;
  stack_st_X509_NAME *stackCAs;
  
  stackCAs = *(stack_st_X509_NAME **)(param_1 + 0xa8);
  if (stackCAs == (stack_st_X509_NAME *)0x0) {
    stackCAs = (stack_st_X509_NAME *)OPENSSL_sk_new_null();
    *(stack_st_X509_NAME **)(param_1 + 0xa8) = stackCAs;
    if (stackCAs == (stack_st_X509_NAME *)0x0) {
      return 0;
    }
  }
  iVar1 = SSL_add_dir_cert_subjects_to_stack(stackCAs,param_2);
  return iVar1;
}

