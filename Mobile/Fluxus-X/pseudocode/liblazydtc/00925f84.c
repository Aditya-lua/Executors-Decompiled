/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925f84
 */

void FUN_00925f84(void *param_1)

{
  memset(param_1,0,0x1b0);
  *(undefined4 *)((long)param_1 + 0x78) = 0;
  *(undefined8 *)((long)param_1 + 0x1b0) = 1;
  *(undefined8 *)((long)param_1 + 0x80) = 0;
  *(undefined8 *)((long)param_1 + 0x88) = 0;
  return;
}

