/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873f3c
 */

void FUN_00873f3c(long param_1)

{
  *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(param_1 + 0x30);
  *(undefined8 *)(param_1 + 0x50) = *(undefined8 *)(param_1 + 0x48);
  *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(param_1 + 0x60);
  *(undefined8 *)(param_1 + 0x80) = *(undefined8 *)(param_1 + 0x78);
  *(undefined8 *)(param_1 + 0x98) = *(undefined8 *)(param_1 + 0x90);
  *(undefined8 *)(param_1 + 0xe0) = *(undefined8 *)(param_1 + 0xd8);
  *(undefined8 *)(param_1 + 0xb0) = *(undefined8 *)(param_1 + 0xa8);
  *(undefined8 *)(param_1 + 0x1b0) = *(undefined8 *)(param_1 + 0x1a8);
  *(undefined8 *)(param_1 + 0x1c8) = *(undefined8 *)(param_1 + 0x1c0);
  *(undefined8 *)(param_1 + 0x1e0) = *(undefined8 *)(param_1 + 0x1d8);
  *(undefined8 *)(param_1 + 0x1f8) = *(undefined8 *)(param_1 + 0x1f0);
  FUN_0087b738(param_1 + 0xf8,0x20);
  FUN_0087b7b8(param_1 + 0x130,0x20);
  FUN_0087b838(param_1 + 0x168,0x20);
  *(undefined8 *)(param_1 + 0x278) = *(undefined8 *)(param_1 + 0x270);
  if ((*(byte *)(param_1 + 0x288) & 1) == 0) {
    *(undefined2 *)(param_1 + 0x288) = 0;
  }
  else {
    **(undefined1 **)(param_1 + 0x298) = 0;
    *(undefined8 *)(param_1 + 0x290) = 0;
  }
  return;
}

