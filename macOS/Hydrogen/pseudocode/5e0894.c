
long FUN_005e0894(ulong param_1,long param_2)

{
  undefined1 *puVar1;
  byte *pbVar2;
  undefined2 uVar3;
  uint uVar4;
  uint uVar5;
  long in_x9;
  undefined2 *in_x10;
  undefined2 *puVar6;
  undefined2 *puVar7;
  uint uVar8;
  ulong uVar9;
  uint in_w13;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  uint uVar10;
  ulong unaff_x22;
  
  puVar7 = in_x10;
  do {
    puVar6 = puVar7;
    uVar9 = (unaff_x22 & 0xffffffff) * (ulong)(in_w13 & 0xffff | 0xd1b70000);
    uVar5 = (uint)(uVar9 >> 0x20);
    uVar8 = uVar5 >> 0xd;
    uVar10 = (uint)unaff_x22;
    uVar4 = uVar10 + (uVar5 >> 0xd) * -10000;
    uVar3 = *(undefined2 *)(&UNK_008b6488 + (ulong)(uVar4 % 100) * 2);
    puVar7 = puVar6 + -2;
    *puVar7 = *(undefined2 *)(&UNK_008b6488 + ((ulong)uVar4 / 100) * 2);
    puVar6[-1] = uVar3;
    unaff_x22 = uVar9 >> 0x2d;
  } while (unaff_w21 < uVar10);
  if (99 < uVar5 >> 0xd) {
    uVar8 = (uVar5 >> 0xf & 0x3fff) / 0x19;
    puVar7 = puVar6 + -3;
    *puVar7 = *(undefined2 *)(&UNK_008b6488 + ((ulong)((uVar5 >> 0xd) + uVar8 * -100) & 0xffff) * 2)
    ;
  }
  if (uVar8 < 10) {
    *(byte *)((long)puVar7 + -1) = (byte)uVar8 | 0x30;
  }
  else {
    puVar7[-1] = *(undefined2 *)(&UNK_008b6488 + (ulong)uVar8 * 2);
  }
  puVar1 = (undefined1 *)(param_2 + unaff_x20);
  *puVar1 = puVar1[1];
  puVar1[1] = 0x2e;
  *(undefined1 *)in_x10 = 0x65;
  pbVar2 = (byte *)(param_2 + in_x9 + 2);
  uVar9 = param_1;
  if (unaff_x19 < 1) {
    *pbVar2 = 0x2d;
    pbVar2 = pbVar2 + 1;
    uVar9 = 1 - unaff_x19;
  }
  if (uVar9 < 10) {
    *pbVar2 = (byte)uVar9 | 0x30;
    uVar9 = 1 - ((long)param_1 >> 0x3f);
  }
  else {
    *(undefined2 *)pbVar2 = *(undefined2 *)(&UNK_008b6488 + uVar9 * 2);
    uVar9 = param_1 >> 0x3f | 2;
  }
  return uVar9 + in_x9 + 2;
}

