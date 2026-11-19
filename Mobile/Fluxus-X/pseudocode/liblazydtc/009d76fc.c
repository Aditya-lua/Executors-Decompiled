/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d76fc
 */

undefined8 tls_parse_ctos_etm(long param_1)

{
  if ((*(byte *)(param_1 + 0x9ea) >> 3 & 1) == 0) {
    *(undefined4 *)(param_1 + 0xb2c) = 1;
  }
  return 1;
}

