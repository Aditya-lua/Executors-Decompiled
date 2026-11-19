/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75b08
 */

bool EVP_PKEY_meth_remove(undefined8 param_1)

{
  long lVar1;
  
  lVar1 = OPENSSL_sk_delete_ptr(DAT_00d21b48,param_1);
  return lVar1 != 0;
}

