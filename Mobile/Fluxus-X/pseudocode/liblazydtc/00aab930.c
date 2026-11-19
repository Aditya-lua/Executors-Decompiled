/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab930
 */

void FUN_00aab930(char *param_1,uint param_2,byte *param_3)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  
  bVar1 = param_1[0xf];
  param_3[0xf] = bVar1 << (ulong)(param_2 & 0x1f);
  bVar2 = param_1[0xe];
  uVar3 = 8 - param_2;
  param_3[0xe] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[0xd];
  param_3[0xd] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[0xc];
  param_3[0xc] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[0xb];
  param_3[0xb] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[10];
  param_3[10] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[9];
  param_3[9] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[8];
  param_3[8] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[7];
  param_3[7] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[6];
  param_3[6] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[5];
  param_3[5] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[4];
  param_3[4] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[3];
  param_3[3] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  bVar2 = param_1[2];
  param_3[2] = bVar2 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  bVar1 = param_1[1];
  param_3[1] = bVar1 << (ulong)(param_2 & 0x1f) | bVar2 >> (ulong)(uVar3 & 0x1f);
  *param_3 = *param_1 << (ulong)(param_2 & 0x1f) | bVar1 >> (ulong)(uVar3 & 0x1f);
  return;
}

