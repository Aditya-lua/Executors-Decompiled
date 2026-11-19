/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bade4
 */

void FUN_009bade4(long param_1,undefined8 param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0xa8);
  if (lVar1 == 0) {
    lVar1 = OPENSSL_sk_new_null();
    *(long *)(param_1 + 0xa8) = lVar1;
    if (lVar1 == 0) {
      return;
    }
  }
  SSL_add_store_cert_subjects_to_stack(lVar1,param_2);
  return;
}

