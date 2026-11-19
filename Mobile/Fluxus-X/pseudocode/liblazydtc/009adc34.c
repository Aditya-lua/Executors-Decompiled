/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009adc34
 */

undefined8 ssl_cert_set_cert_store(long param_1,long param_2,int param_3,int param_4)

{
  long lVar1;
  
  lVar1 = 0x1d0;
  if (param_3 != 0) {
    lVar1 = 0x1c8;
  }
  X509_STORE_free(*(X509_STORE **)(param_1 + lVar1));
  *(long *)(param_1 + lVar1) = param_2;
  if ((param_2 != 0) && (param_4 != 0)) {
    X509_STORE_up_ref(param_2);
  }
  return 1;
}

