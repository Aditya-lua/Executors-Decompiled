/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7900
 */

void SSL_CTX_load_verify_file(undefined8 *param_1,undefined8 param_2)

{
  X509_STORE_load_file_ex(param_1[5],param_2,*param_1,param_1[0x88]);
  return;
}

