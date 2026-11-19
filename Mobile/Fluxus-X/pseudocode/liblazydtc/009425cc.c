/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009425cc
 */

void FUN_009425cc(long param_1)

{
  *(undefined8 *)(param_1 + 0x1160) = *(undefined8 *)(param_1 + 0x240);
  *(undefined8 *)(param_1 + 0x1168) = *(undefined8 *)(param_1 + 0x1d8);
  *(uint *)(param_1 + 0x131c) =
       *(uint *)(param_1 + 0x131c) & 0xfffc0000 |
       *(uint *)(param_1 + 0x131c) & 0x1ffff | (uint)(*(char *)(param_1 + 0x131a) == '\x04') << 0x11
  ;
  return;
}

