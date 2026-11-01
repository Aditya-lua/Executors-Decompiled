
void FUN_000c1774(long param_1,undefined1 param_2 [16])

{
  uint uVar1;
  long in_x9;
  ulong uVar2;
  undefined8 *in_x10;
  undefined4 *puVar3;
  undefined4 uVar4;
  undefined4 unaff_w19;
  undefined4 *unaff_x20;
  undefined4 unaff_w21;
  long unaff_x22;
  long unaff_x24;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar6 = param_2._8_8_;
  uVar5 = param_2._0_8_;
  while( true ) {
    in_x10[1] = uVar6;
    *in_x10 = uVar5;
    in_x10[3] = uVar6;
    in_x10[2] = uVar5;
    in_x9 = in_x9 + 0x40;
    param_1 = param_1 + -1;
    if (param_1 == 0) break;
    in_x10 = (undefined8 *)(*(long *)(&UNK_000060c0 + unaff_x24) + in_x9);
    in_x10[5] = uVar6;
    in_x10[4] = uVar5;
    in_x10[7] = uVar6;
    in_x10[6] = uVar5;
  }
  *unaff_x20 = unaff_w21;
  uVar1 = *(uint *)(unaff_x22 + 0x100);
  if (-1 < (int)uVar1) {
    uVar2 = 0;
    puVar3 = *(undefined4 **)(&UNK_000060c0 + unaff_x24);
    do {
      uVar4 = unaff_w19;
      if (uVar2 < uVar1) {
        uVar4 = *(undefined4 *)(*(long *)(unaff_x22 + 0x108) + uVar2 * 4);
      }
      *puVar3 = uVar4;
      uVar2 = uVar2 + 1;
      puVar3 = puVar3 + 0x10;
    } while (uVar1 + 1 != uVar2);
  }
  return;
}

