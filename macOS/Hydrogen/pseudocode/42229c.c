
void FUN_0042229c(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  uint *puVar2;
  int iVar3;
  undefined *puVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined4 in_stack_00000060;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined2 in_stack_000000d8;
  
  *(undefined4 *)(unaff_x29 + -0x24) = 0x6a;
  lVar1 = _recvfrom(*param_1,param_2,param_3,2,&uStack0000000000000070,unaff_x29 + -0x24);
  if (lVar1 < 0) {
    puVar2 = (uint *)___error();
    puVar4 = (undefined *)((ulong)*puVar2 << 0x20 | 2);
LAB_004222f0:
    *unaff_x19 = 1;
    unaff_x19[1] = puVar4;
  }
  else {
    iVar3 = *(int *)(unaff_x29 + -0x24);
    if (iVar3 == 0) {
      iVar3 = 2;
    }
    else if (uStack0000000000000070._1_1_ != '\x01') {
      puVar4 = &UNK_009da800;
      goto LAB_004222f0;
    }
    uVar5 = *(undefined8 *)(unaff_x20 + 0x38);
    uVar7 = *(undefined8 *)(unaff_x20 + 0x50);
    uVar6 = *(undefined8 *)(unaff_x20 + 0x48);
    uVar9 = *(undefined8 *)(unaff_x20 + 0x60);
    uVar8 = *(undefined8 *)(unaff_x20 + 0x58);
    in_stack_00000060 = CONCAT22(in_stack_00000060._2_2_,in_stack_000000d8);
    uVar11 = *(undefined8 *)(unaff_x20 + 0x20);
    uVar10 = *(undefined8 *)(unaff_x20 + 0x18);
    uVar13 = *(undefined8 *)(unaff_x20 + 0x30);
    uVar12 = *(undefined8 *)(unaff_x20 + 0x28);
    *(undefined8 *)((long)unaff_x19 + 0x54) = *(undefined8 *)(unaff_x20 + 0x40);
    *(undefined8 *)((long)unaff_x19 + 0x4c) = uVar5;
    *(undefined8 *)((long)unaff_x19 + 100) = uVar7;
    *(undefined8 *)((long)unaff_x19 + 0x5c) = uVar6;
    *(undefined8 *)((long)unaff_x19 + 0x74) = uVar9;
    *(undefined8 *)((long)unaff_x19 + 0x6c) = uVar8;
    *(undefined4 *)((long)unaff_x19 + 0x7c) = in_stack_00000060;
    *(undefined8 *)((long)unaff_x19 + 0x24) = in_stack_00000080;
    *(undefined8 *)((long)unaff_x19 + 0x1c) = in_stack_00000078;
    *(undefined8 *)((long)unaff_x19 + 0x34) = uVar11;
    *(undefined8 *)((long)unaff_x19 + 0x2c) = uVar10;
    *(undefined8 *)((long)unaff_x19 + 0x44) = uVar13;
    *(undefined8 *)((long)unaff_x19 + 0x3c) = uVar12;
    *(int *)(unaff_x19 + 2) = iVar3;
    *(ulong *)((long)unaff_x19 + 0x14) =
         (ulong)(ushort)uStack0000000000000070 |
         (ulong)uStack0000000000000070._2_4_ << 0x10 | (ulong)uStack0000000000000070._6_2_ << 0x30;
    *unaff_x19 = 0;
    unaff_x19[1] = lVar1;
  }
  return;
}

