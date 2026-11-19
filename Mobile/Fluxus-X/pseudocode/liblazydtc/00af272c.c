/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af272c
 */

void FUN_00af272c(void)

{
  undefined8 uVar1;
  
  uVar1 = X509_LOOKUP_get_method_data();
  OPENSSL_sk_pop_free(uVar1,&LAB_00af2988);
  return;
}

