/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c5de8
 */

undefined8 SSL_set_tlsext_max_fragment_length(long param_1,byte param_2)

{
  if (param_2 < 5) {
    *(byte *)(param_1 + 0xb4c) = param_2;
    return 1;
  }
  ERR_new();
  ERR_set_debug("ssl/t1_lib.c",0xd42,"SSL_set_tlsext_max_fragment_length");
  ERR_set_error(0x14,0xe8,0);
  return 0;
}

