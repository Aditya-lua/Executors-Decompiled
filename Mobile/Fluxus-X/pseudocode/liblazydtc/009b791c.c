/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b791c
 */

void SSL_CTX_load_verify_store(undefined8 *param_1,undefined8 param_2)

{
  X509_STORE_load_store_ex(param_1[5],param_2,*param_1,param_1[0x88]);
  return;
}

