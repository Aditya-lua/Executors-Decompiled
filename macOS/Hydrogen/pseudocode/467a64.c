
void FUN_00467a64(long param_1,long param_2,long param_3,long *param_4,ulong param_5)

{
  undefined2 *puVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  uint uVar5;
  ulong uVar6;
  long in_x9;
  long lVar7;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  uint in_w15;
  uint in_w16;
  long in_x17;
  
  auVar3._8_8_ = 0;
  auVar3._0_8_ = param_5;
  uVar6 = SUB168(auVar3 * ZEXT816(0x28f5c28f5c28f5c3),8) >> 2;
  *(undefined2 *)(param_3 + in_x9 + -0xe) = *(undefined2 *)(param_1 + in_x14 * 2);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar6;
  lVar7 = in_x9 + -0x10;
  *param_4 = lVar7;
  puVar1 = (undefined2 *)(param_3 + lVar7);
  *puVar1 = *(undefined2 *)(param_1 + in_x12 * 2);
  puVar1[2] = *(undefined2 *)(param_1 + (ulong)in_w15 * 2);
  puVar1[3] = *(undefined2 *)(param_1 + (ulong)in_w16 * 2);
  puVar1[4] = *(undefined2 *)(param_1 + in_x17 * 2);
  puVar1[5] = *(undefined2 *)(param_1 + param_2 * 2);
  puVar1[6] = *(undefined2 *)
               (param_1 +
               (uVar6 - (SUB168(auVar4 * ZEXT816(0x51eb851eb851eb9),8) >> 1) * in_x13) * 2);
  puVar1[7] = *(undefined2 *)(param_1 + (in_x11 - uVar6 * in_x13) * 2);
  uVar5 = (uint)in_x10;
  if (uVar5 < 100) {
    uVar2 = uVar5;
    uVar5 = uVar5 & 0xffff;
  }
  else {
    uVar2 = (uVar5 >> 2 & 0x3fff) / 0x19;
    in_x10 = (ulong)uVar2;
    lVar7 = in_x9 + -0x12;
    *(undefined2 *)(param_3 + lVar7) =
         *(undefined2 *)(param_1 + ((ulong)(uVar5 + uVar2 * -100) & 0xffff) * 2);
    uVar5 = uVar2;
  }
  if (uVar5 < 10) {
    *(byte *)(param_3 + lVar7 + -1) = (byte)uVar2 | 0x30;
    *param_4 = lVar7 + -1;
    return;
  }
  *(undefined2 *)(param_3 + lVar7 + -2) = *(undefined2 *)(param_1 + (in_x10 & 0xffff) * 2);
  *param_4 = lVar7 + -2;
  return;
}

