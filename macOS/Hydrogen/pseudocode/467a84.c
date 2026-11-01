
void FUN_00467a84(long param_1,long param_2,long param_3,long *param_4,ulong param_5,long param_6)

{
  undefined2 *puVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  uint uVar4;
  long in_x9;
  long lVar5;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  undefined2 in_w14;
  uint in_w15;
  uint in_w16;
  long in_x17;
  
  *(undefined2 *)(param_6 + -0xe) = in_w14;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = param_5;
  lVar5 = in_x9 + -0x10;
  *param_4 = lVar5;
  puVar1 = (undefined2 *)(param_3 + lVar5);
  *puVar1 = *(undefined2 *)(param_1 + in_x12 * 2);
  puVar1[2] = *(undefined2 *)(param_1 + (ulong)in_w15 * 2);
  puVar1[3] = *(undefined2 *)(param_1 + (ulong)in_w16 * 2);
  puVar1[4] = *(undefined2 *)(param_1 + in_x17 * 2);
  puVar1[5] = *(undefined2 *)(param_1 + param_2 * 2);
  puVar1[6] = *(undefined2 *)
               (param_1 +
               (param_5 - (SUB168(auVar3 * ZEXT816(0x51eb851eb851eb9),8) >> 1) * in_x13) * 2);
  puVar1[7] = *(undefined2 *)(param_1 + (in_x11 - param_5 * in_x13) * 2);
  uVar4 = (uint)in_x10;
  if (uVar4 < 100) {
    uVar2 = uVar4;
    uVar4 = uVar4 & 0xffff;
  }
  else {
    uVar2 = (uVar4 >> 2 & 0x3fff) / 0x19;
    in_x10 = (ulong)uVar2;
    lVar5 = in_x9 + -0x12;
    *(undefined2 *)(param_3 + lVar5) =
         *(undefined2 *)(param_1 + ((ulong)(uVar4 + uVar2 * -100) & 0xffff) * 2);
    uVar4 = uVar2;
  }
  if (uVar4 < 10) {
    *(byte *)(param_3 + lVar5 + -1) = (byte)uVar2 | 0x30;
    *param_4 = lVar5 + -1;
    return;
  }
  *(undefined2 *)(param_3 + lVar5 + -2) = *(undefined2 *)(param_1 + (in_x10 & 0xffff) * 2);
  *param_4 = lVar5 + -2;
  return;
}

