/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b773c8
 */

void FUN_00b773c8(long param_1,long param_2,ulong *param_3)

{
  ulong *puVar1;
  ulong *puVar2;
  bool bVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  if (*(char *)(param_1 + 0x1a1) != '\0') {
    return;
  }
  param_1 = param_1 + 0x60;
  puVar1 = (ulong *)(param_1 + ((ulong)*(byte *)(param_2 + 0xf) & 0xf) * 0x10);
  uVar5 = *puVar1;
  uVar6 = puVar1[1];
  puVar1 = (ulong *)(param_1 + ((ulong)*(byte *)(param_2 + 0xf) & 0xf0));
  uVar7 = puVar1[1] ^ (uVar6 >> 4 | uVar5 << 0x3c);
  uVar5 = *puVar1 ^ uVar5 >> 4 ^ (ulong)*(ushort *)(&DAT_00364d90 + (uVar6 & 0xf) * 2) << 0x30;
  lVar4 = 0xe;
  do {
    puVar1 = (ulong *)(param_1 + ((ulong)*(byte *)(param_2 + lVar4) & 0xf) * 0x10);
    puVar2 = (ulong *)(param_1 + ((ulong)*(byte *)(param_2 + lVar4) & 0xf0));
    uVar8 = puVar1[1] ^ (uVar7 >> 4 | uVar5 << 0x3c);
    uVar6 = *puVar1 ^ uVar5 >> 4;
    bVar3 = lVar4 != 0;
    uVar5 = *puVar2 ^ (uVar6 ^ (ulong)*(ushort *)(&DAT_00364d90 + (uVar7 & 0xf) * 2) << 0x30) >> 4 ^
            (ulong)*(ushort *)(&DAT_00364d90 + (uVar8 & 0xf) * 2) << 0x30;
    uVar7 = (uVar8 >> 4 | uVar6 << 0x3c) ^ puVar2[1];
    lVar4 = lVar4 + -1;
  } while (bVar3);
  uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
  uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
  uVar6 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
  uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
  *param_3 = uVar5 >> 0x20 | uVar5 << 0x20;
  param_3[1] = uVar6 >> 0x20 | uVar6 << 0x20;
  return;
}

