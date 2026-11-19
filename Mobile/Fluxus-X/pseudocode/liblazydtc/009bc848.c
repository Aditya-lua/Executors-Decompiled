/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc848
 */

void SSL_CTX_use_serverinfo(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  SSL_CTX_use_serverinfo_ex(param_1,1,param_2,param_3);
  return;
}

