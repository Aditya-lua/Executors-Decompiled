/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa9de0
 */

void FUN_00aa9de0(undefined1 *param_1,long param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar5 = (ulong)(byte)param_1[0xf];
  puVar1 = (ulong *)(param_2 + (uVar5 & 0xf) * 0x10);
  uVar2 = *puVar1;
  uVar3 = puVar1[1];
  lVar4 = 0xe;
  while( true ) {
    puVar1 = (ulong *)(param_2 + (uVar5 & 0xfffffffffffffff0));
    uVar6 = *(ulong *)(&DAT_0076e998 + (uVar3 & 0xf) * 8) ^ uVar2 >> 4 ^ *puVar1;
    uVar3 = puVar1[1] ^ (uVar3 >> 4 | uVar2 << 0x3c);
    if (lVar4 == -1) break;
    uVar5 = (ulong)(byte)param_1[lVar4];
    puVar1 = (ulong *)(param_2 + (uVar5 & 0xf) * 0x10);
    lVar4 = lVar4 + -1;
    uVar2 = *(ulong *)(&DAT_0076e998 + (uVar3 & 0xf) * 8) ^ uVar6 >> 4 ^ *puVar1;
    uVar3 = puVar1[1] ^ (uVar3 >> 4 | uVar6 << 0x3c);
  }
  *param_1 = (char)(uVar6 >> 0x38);
  param_1[1] = (char)(uVar6 >> 0x30);
  param_1[3] = (char)(uVar6 >> 0x20);
  param_1[2] = (char)(uVar6 >> 0x28);
  param_1[5] = (char)(uVar6 >> 0x10);
  param_1[4] = (char)(uVar6 >> 0x18);
  param_1[6] = (char)(uVar6 >> 8);
  param_1[8] = (char)(uVar3 >> 0x38);
  param_1[9] = (char)(uVar3 >> 0x30);
  param_1[10] = (char)(uVar3 >> 0x28);
  param_1[0xb] = (char)(uVar3 >> 0x20);
  param_1[7] = (char)uVar6;
  param_1[0xc] = (char)(uVar3 >> 0x18);
  param_1[0xd] = (char)(uVar3 >> 0x10);
  param_1[0xe] = (char)(uVar3 >> 8);
  param_1[0xf] = (char)uVar3;
  return;
}

