/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb58d0
 */

void HUF_decompress1X_usingDTable(void)

{
  long in_x4;
  
  if (*(char *)(in_x4 + 1) == '\0') {
    FUN_00bb58e0();
    return;
  }
  FUN_00bb519c();
  return;
}

