
long FUN_004dbca0(ulong param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar1 = param_1 & 0xffffffff | 0x517cc1b700000000;
  puVar3 = *(ulong **)(param_3 + 8);
  uVar4 = *(ulong *)(param_3 + 0x10);
  if (uVar4 < 8) {
    uVar5 = 0;
    if (uVar4 < 4) goto LAB_004dbcd8;
LAB_004dbd0c:
    puVar2 = (ulong *)((long)puVar3 + 4);
    uVar5 = ((ulong)(uint)*puVar3 ^ (uVar5 >> 0x3b | uVar5 << 5)) * uVar1;
    uVar4 = uVar4 - 4;
    if (uVar4 < 2) goto LAB_004dbce0;
LAB_004dbd24:
    puVar3 = (ulong *)((long)puVar2 + 2);
    uVar5 = ((ulong)(ushort)*puVar2 ^ (uVar5 >> 0x3b | uVar5 << 5)) * uVar1;
    if (uVar4 == 2) goto LAB_004dbcf0;
  }
  else {
    uVar5 = 0;
    puVar2 = puVar3;
    do {
      puVar3 = puVar2 + 1;
      uVar5 = (*puVar2 ^ (uVar5 >> 0x3b | uVar5 << 5)) * uVar1;
      uVar4 = uVar4 - 8;
      puVar2 = puVar3;
    } while (7 < uVar4);
    if (3 < uVar4) goto LAB_004dbd0c;
LAB_004dbcd8:
    puVar2 = puVar3;
    if (1 < uVar4) goto LAB_004dbd24;
LAB_004dbce0:
    puVar3 = puVar2;
    if (uVar4 == 0) goto LAB_004dbcf0;
  }
  uVar5 = ((ulong)(byte)*puVar3 ^ (uVar5 >> 0x3b | uVar5 << 5)) * uVar1;
LAB_004dbcf0:
  return ((uVar5 >> 0x3b | uVar5 << 5) ^ 0xff) * uVar1;
}

