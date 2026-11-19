/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9124
 */

void OPENSSL_sk_unshift(undefined8 param_1,undefined8 param_2)

{
  OPENSSL_sk_insert(param_1,param_2,0);
  return;
}

