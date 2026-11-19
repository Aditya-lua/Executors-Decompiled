/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824264
 */

void FUN_00824264(ulong *param_1)

{
  if ((char)param_1[3] == '\x01') {
    *(undefined1 *)(param_1 + 3) = 0;
    *param_1 = *param_1 ^ 0x9d178d819b5ff149;
    param_1[1] = param_1[1] ^ 0x9d178d819b5ff149;
    param_1[2] = param_1[2] ^ 0x9d178d819b5ff149;
  }
  return;
}

