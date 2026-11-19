/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaa048
 */

void FUN_00aaa048(undefined1 *param_1,long param_2,long param_3,long param_4)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  
  uVar2 = (ulong)(byte)param_1[0xf];
  do {
    uVar4 = (ulong)((uint)*(byte *)(param_3 + 0xf) ^ (uint)uVar2);
    puVar1 = (ulong *)(param_2 + (uVar4 & 0xf) * 0x10);
    uVar3 = *puVar1;
    uVar2 = puVar1[1];
    uVar4 = uVar4 & 0xff;
    lVar5 = 0xe;
    while( true ) {
      puVar1 = (ulong *)(param_2 + (uVar4 & 0xfffffffffffffff0));
      uVar6 = *(ulong *)(&DAT_0076e998 + (uVar2 & 0xf) * 8) ^ uVar3 >> 4 ^ *puVar1;
      uVar2 = puVar1[1] ^ (uVar2 >> 4 | uVar3 << 0x3c);
      if (lVar5 == -1) break;
      uVar4 = (ulong)(*(byte *)(param_3 + lVar5) ^ param_1[lVar5]);
      puVar1 = (ulong *)(param_2 + (uVar4 & 0xf) * 0x10);
      lVar5 = lVar5 + -1;
      uVar3 = *(ulong *)(&DAT_0076e998 + (uVar2 & 0xf) * 8) ^ uVar6 >> 4 ^ *puVar1;
      uVar2 = puVar1[1] ^ (uVar2 >> 4 | uVar6 << 0x3c);
    }
    *param_1 = (char)(uVar6 >> 0x38);
    param_1[1] = (char)(uVar6 >> 0x30);
    param_1[3] = (char)(uVar6 >> 0x20);
    param_1[2] = (char)(uVar6 >> 0x28);
    param_1[7] = (char)uVar6;
    param_1[5] = (char)(uVar6 >> 0x10);
    param_1[4] = (char)(uVar6 >> 0x18);
    param_1[6] = (char)(uVar6 >> 8);
    param_1[8] = (char)(uVar2 >> 0x38);
    param_1[9] = (char)(uVar2 >> 0x30);
    param_1[10] = (char)(uVar2 >> 0x28);
    param_1[0xb] = (char)(uVar2 >> 0x20);
    param_4 = param_4 + -0x10;
    param_3 = param_3 + 0x10;
    param_1[0xf] = (char)uVar2;
    param_1[0xc] = (char)(uVar2 >> 0x18);
    param_1[0xd] = (char)(uVar2 >> 0x10);
    param_1[0xe] = (char)(uVar2 >> 8);
  } while (param_4 != 0);
  return;
}

