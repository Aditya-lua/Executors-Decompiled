/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3aec
 */

void Poly1305_Init(undefined8 *param_1,uint3 *param_2)

{
  undefined4 uVar1;
  uint uVar2;
  
  *(undefined4 *)(param_1 + 0x18) = *(undefined4 *)(param_2 + 4);
  *(undefined4 *)((long)param_1 + 0xc4) = *(undefined4 *)(param_2 + 5);
  *(undefined4 *)(param_1 + 0x19) = *(undefined4 *)(param_2 + 6);
  uVar1 = *(undefined4 *)(param_2 + 7);
  *(undefined4 *)(param_1 + 2) = 0;
  *param_1 = 0;
  param_1[1] = 0;
  *(undefined4 *)((long)param_1 + 0xcc) = uVar1;
  *(uint *)((long)param_1 + 0x14) = (uint)*param_2 | (*(byte *)((long)param_2 + 3) & 0xf) << 0x18;
  *(uint *)(param_1 + 3) = *(uint *)(param_2 + 1) & 0xffffffc;
  *(uint *)((long)param_1 + 0x1c) = *(uint *)(param_2 + 2) & 0xffffffc;
  uVar2 = *(uint *)(param_2 + 3);
  param_1[0x1c] = 0;
  *(uint *)(param_1 + 4) = uVar2 & 0xffffffc;
  return;
}

