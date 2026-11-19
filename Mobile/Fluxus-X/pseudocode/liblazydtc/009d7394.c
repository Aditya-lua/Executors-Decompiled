/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d7394
 */

undefined8 tls_parse_ctos_npn(long param_1)

{
  if ((*(long *)(param_1 + 0x240) == 0) || (*(long *)(param_1 + 0x2c8) == 0)) {
    *(undefined4 *)(param_1 + 0x484) = 1;
    return 1;
  }
  return 1;
}

