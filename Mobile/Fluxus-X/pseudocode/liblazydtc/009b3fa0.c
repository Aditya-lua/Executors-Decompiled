/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fa0
 */

int SSL_get_verify_callback(int param_1,X509_STORE_CTX *param_2)

{
  return (int)*(undefined8 *)((ulong)(uint)param_1 + 0x970);
}

