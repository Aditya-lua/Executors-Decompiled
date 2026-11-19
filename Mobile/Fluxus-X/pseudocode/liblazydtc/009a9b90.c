/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9b90
 */

undefined8 ssl3_renegotiate(long param_1)

{
  if (*(long *)(param_1 + 0x30) != 0) {
    *(undefined4 *)(param_1 + 0x1ac) = 1;
  }
  return 1;
}

