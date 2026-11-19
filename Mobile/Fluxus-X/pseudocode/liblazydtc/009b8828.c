/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8828
 */

undefined4 SSL_client_hello_isv2(long param_1)

{
  if (*(undefined4 **)(param_1 + 0xb58) == (undefined4 *)0x0) {
    return 0;
  }
  return **(undefined4 **)(param_1 + 0xb58);
}

