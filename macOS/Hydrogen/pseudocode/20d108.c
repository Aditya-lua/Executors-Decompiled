
void FUN_0020d108(long param_1,undefined1 param_2 [16],long param_3,undefined2 *param_4)

{
  undefined2 *puVar1;
  long lVar2;
  long in_x9;
  long lVar3;
  undefined2 *in_x10;
  long lVar4;
  long in_x11;
  undefined2 *in_x12;
  undefined2 *in_x13;
  undefined2 *in_x14;
  undefined2 *in_x15;
  undefined2 *in_x16;
  undefined2 *in_x17;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined2 uVar5;
  undefined6 uVar6;
  undefined8 uVar7;
  undefined2 uVar8;
  undefined2 uVar9;
  undefined2 uVar10;
  undefined2 uVar11;
  undefined2 uVar12;
  undefined2 uVar13;
  undefined2 uVar14;
  undefined2 uVar15;
  
  uVar7 = param_2._8_8_;
  uVar6 = param_2._2_6_;
  uVar5 = param_2._0_2_;
  while( true ) {
    uVar8 = in_x10[-0x2f];
    uVar9 = *in_x13;
    uVar10 = *in_x14;
    uVar11 = *in_x15;
    uVar12 = *in_x12;
    uVar13 = *in_x16;
    uVar14 = *in_x17;
    uVar15 = *param_4;
    puVar1 = (undefined2 *)(param_3 + in_x9);
    *puVar1 = uVar5;
    puVar1[1] = uVar8;
    puVar1[2] = (short)uVar6;
    puVar1[3] = uVar9;
    puVar1[4] = (short)((uint6)uVar6 >> 0x10);
    puVar1[5] = uVar10;
    puVar1[6] = (short)((uint6)uVar6 >> 0x20);
    puVar1[7] = uVar11;
    puVar1[8] = (short)uVar7;
    puVar1[9] = uVar12;
    puVar1[10] = (short)((ulong)uVar7 >> 0x10);
    puVar1[0xb] = uVar13;
    puVar1[0xc] = (short)((ulong)uVar7 >> 0x20);
    puVar1[0xd] = uVar14;
    puVar1[0xe] = (short)((ulong)uVar7 >> 0x30);
    puVar1[0xf] = uVar15;
    in_x9 = in_x9 + 0x20;
    in_x11 = in_x11 + -8;
    if (in_x11 == 0) break;
    uVar5 = in_x10[0x30];
    uVar6 = CONCAT24(in_x10[0x54],CONCAT22(in_x10[0x48],in_x10[0x3c]));
    in_x12 = in_x10 + 0x61;
    uVar7 = CONCAT26(in_x10[0x84],CONCAT24(in_x10[0x78],CONCAT22(in_x10[0x6c],in_x10[0x60])));
    in_x13 = in_x10 + 0x3d;
    in_x14 = in_x10 + 0x49;
    in_x15 = in_x10 + 0x55;
    in_x16 = in_x10 + 0x6d;
    in_x17 = in_x10 + 0x79;
    param_4 = in_x10 + 0x85;
    in_x10 = in_x10 + 0x60;
  }
  if (unaff_x21 != param_1) {
    lVar3 = unaff_x21 - param_1;
    lVar4 = param_3 + param_1 * 4 + 2;
    lVar2 = unaff_x22 + param_1 * 0x18 + 2;
    do {
      *(undefined4 *)(lVar4 + -2) = *(undefined4 *)(lVar2 + -2);
      lVar4 = lVar4 + 4;
      lVar2 = lVar2 + 0x18;
      lVar3 = lVar3 + -1;
    } while (lVar3 != 0);
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_3;
  unaff_x19[2] = unaff_x21;
  return;
}

