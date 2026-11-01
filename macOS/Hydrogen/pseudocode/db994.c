
undefined8 FUN_000db994(long param_1,undefined1 param_2 [16])

{
  long lVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined4 in_w9;
  long lVar5;
  short sVar6;
  uint unaff_w19;
  int unaff_w20;
  undefined4 unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined4 unaff_w27;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar8 = param_2._8_8_;
  uVar7 = param_2._0_8_;
  *(undefined8 *)(param_1 + 0x78) = 0x7f7fffff00000000;
  *(undefined8 *)(param_1 + 0x80) = 0;
  *(undefined4 *)(param_1 + 0x88) = in_w9;
  lVar4 = *(long *)(&UNK_00004de8 + unaff_x22);
  if (lVar4 != 0) {
    *(undefined8 *)(&UNK_00004de0 + unaff_x22) = uVar7;
    iVar2 = *(int *)(&UNK_00003f58 + unaff_x22);
    lVar5 = (long)*(short *)(&UNK_0000138c + param_1);
    lVar1 = unaff_x22 + lVar5 * 8;
    if (*(int *)(&UNK_000060dc + lVar1) == iVar2) {
      sVar6 = *(short *)(&UNK_000060e2 + lVar1) + 1;
    }
    else {
      iVar3 = (*(short *)(&UNK_0000138c + param_1) + 1) % 6;
      *(short *)(&UNK_0000138c + param_1) = (short)iVar3;
      lVar5 = (long)iVar3;
      lVar1 = unaff_x22 + (long)iVar3 * 8;
      *(int *)(&UNK_000060dc + lVar1) = iVar2;
      *(undefined4 *)(&UNK_000060e0 + lVar1) = 0;
      sVar6 = 1;
    }
    *(short *)(&UNK_000060e2 + unaff_x22 + lVar5 * 8) = sVar6;
    *(int *)(&UNK_00001388 + param_1) = *(int *)(&UNK_00001388 + param_1) + 1;
    (*pcRam0000000000a28da8)(lVar4,uRam0000000000a33a18);
    *(undefined8 *)(&UNK_00004de8 + unaff_x22) = 0;
    uVar7 = 0;
    uVar8 = 0;
  }
  *(undefined8 *)(&UNK_00004df8 + unaff_x22) = uVar8;
  *(undefined8 *)(&UNK_00004df0 + unaff_x22) = uVar7;
  *(int *)(unaff_x23 + 0x3c4) = unaff_w20;
  *(undefined4 *)(unaff_x23 + 0x3c8) = unaff_w21;
  *(undefined1 *)(unaff_x23 + 0x3a4) = 1;
  *(uint *)(unaff_x23 + 0x3a8) = unaff_w19;
  *(undefined4 *)(unaff_x23 + 0x3b0) = unaff_w27;
  if (unaff_w20 == *(int *)(unaff_x26 + 0x804)) {
    *(undefined1 *)(unaff_x26 + 0x812) = 1;
  }
  *(undefined4 *)(unaff_x23 + 0x3ac) = *(undefined4 *)(&UNK_00003f58 + unaff_x25);
  *(undefined1 *)(unaff_x23 + 0x3a5) = 1;
  if ((unaff_w19 & 1) == 0) {
    if ((*(int *)(unaff_x23 + 0x428) == 0) || ((*(byte *)(unaff_x23 + 0x41d) >> 4 & 1) == 0)) {
      func_0x000d8e98(0,0);
    }
    else {
      lVar4 = *(long *)(unaff_x24 + 0x4c0);
      func_0x000c9774("##Tooltip_Hidden",0,0x2030347);
      lVar4 = *(long *)(lVar4 + 0x4000);
      *(undefined1 *)(lVar4 + 0xc3) = 1;
      *(undefined1 *)(lVar4 + 0xc5) = 1;
      *(undefined1 *)(lVar4 + 0xe4) = 1;
    }
  }
  if ((unaff_w19 & 0x12) == 0) {
    *(uint *)(unaff_x23 + 8) = *(uint *)(unaff_x23 + 8) & 0xfffffffe;
  }
  return 1;
}

