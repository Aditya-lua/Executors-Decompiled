
void FUN_000dc540(long param_1,undefined1 param_2 [16])

{
  long lVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined4 in_w9;
  long lVar5;
  short sVar6;
  ulong in_x10;
  long unaff_x19;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar8 = param_2._8_8_;
  uVar7 = param_2._0_8_;
  *(ulong *)(param_1 + 0x78) = in_x10 & 0xffffffffffff | 0x7f7f000000000000;
  *(undefined8 *)(param_1 + 0x80) = 0;
  *(undefined4 *)(param_1 + 0x88) = in_w9;
  lVar4 = *(long *)(&UNK_00004de8 + unaff_x19);
  if (lVar4 != 0) {
    *(undefined8 *)(&UNK_00004de0 + unaff_x19) = uVar7;
    iVar2 = *(int *)(&UNK_00003f58 + unaff_x19);
    lVar5 = (long)*(short *)(&UNK_0000138c + param_1);
    lVar1 = unaff_x19 + lVar5 * 8;
    if (*(int *)(&UNK_000060dc + lVar1) == iVar2) {
      sVar6 = *(short *)(&UNK_000060e2 + lVar1) + 1;
    }
    else {
      iVar3 = (*(short *)(&UNK_0000138c + param_1) + 1) % 6;
      *(short *)(&UNK_0000138c + param_1) = (short)iVar3;
      lVar5 = (long)iVar3;
      lVar1 = unaff_x19 + (long)iVar3 * 8;
      *(int *)(&UNK_000060dc + lVar1) = iVar2;
      *(undefined4 *)(&UNK_000060e0 + lVar1) = 0;
      sVar6 = 1;
    }
    *(short *)(&UNK_000060e2 + unaff_x19 + lVar5 * 8) = sVar6;
    *(int *)(&UNK_00001388 + param_1) = *(int *)(&UNK_00001388 + param_1) + 1;
    (*pcRam0000000000a28da8)(lVar4,uRam0000000000a33a18);
    *(undefined8 *)(&UNK_00004de8 + unaff_x19) = 0;
    uVar7 = 0;
    uVar8 = 0;
  }
  *(undefined8 *)(&UNK_00004df8 + unaff_x19) = uVar8;
  *(undefined8 *)(&UNK_00004df0 + unaff_x19) = uVar7;
  return;
}

