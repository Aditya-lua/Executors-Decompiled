/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908a04
 */

void FUN_00908a04(long param_1,long param_2,void *param_3)

{
  undefined8 *puVar1;
  
  if (param_3 == (void *)0x0) {
    memset((void *)(param_1 + 0x137c),0,0x5c);
    *(undefined8 *)(param_1 + 0x13d8) = 0xffffffffffffffff;
  }
  else {
    memcpy((void *)(param_1 + 0x137c),param_3,100);
  }
  puVar1 = *(undefined8 **)(param_2 + 0x3a8);
  *(undefined8 *)(param_1 + 0x13e8) = *puVar1;
  *(uint *)(param_1 + 0x13f0) = *(uint *)((long)puVar1 + 0x8c) & 0x3ffffff;
  *(undefined4 *)(param_1 + 0x13e0) = *(undefined4 *)(param_2 + 0x560);
  *(byte *)(param_1 + 0x140c) =
       (byte)(*(uint *)(param_2 + 0x3a0) >> 4) & 2 | *(byte *)(param_1 + 0x140c) & 0xfd;
  return;
}

