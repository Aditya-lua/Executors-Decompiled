
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0049accc(void)

{
  long lVar1;
  code *pcVar2;
  undefined1 uVar3;
  long *plVar4;
  long lVar5;
  long extraout_x1;
  undefined8 extraout_x1_00;
  long lVar6;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined8 uVar7;
  undefined8 in_stack_00000008;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_c8;
  long lStack_c0;
  long lStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  uint uStack_a0;
  undefined1 uStack_99;
  undefined2 uStack_98;
  undefined4 uStack_96;
  undefined1 uStack_91;
  ushort uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  uint uStack_7e;
  undefined1 uStack_79;
  undefined2 uStack_78;
  undefined4 uStack_76;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  uint uStack_68;
  undefined1 uStack_61;
  undefined2 uStack_60;
  undefined4 uStack_5e;
  undefined1 uStack_59;
  ushort uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined2 uStack_42;
  
  func_0x00187bd4();
  *(undefined8 *)(unaff_x23 + 0x68) = unaff_x22;
  *(undefined8 *)(unaff_x23 + 0x70) = unaff_x21;
  func_0x0049c420();
  lVar5 = *unaff_x20;
  if (lVar5 != 0) goto LAB_0049ad1c;
  lVar5 = *unaff_x19;
  while (lVar5 == 0) {
    __Unwind_Resume(in_stack_00000008);
    lVar5 = extraout_x1;
LAB_0049ad1c:
    func_0x00187bd4(unaff_x20[1],lVar5,1);
    lVar5 = *unaff_x19;
  }
  lVar6 = 1;
  func_0x00187bd4(unaff_x19[1]);
  __Unwind_Resume(in_stack_00000008);
  func_0x007a2668();
  uVar3 = func_0x007a2668();
  lVar1 = _UNK_0089f368;
  lVar5 = _UNK_0089f360;
  uStack_a8 = CONCAT31(uStack_a8._1_3_,3);
  uStack_a4 = CONCAT31(uStack_a4._1_3_,3);
  uStack_a0 = CONCAT31(uStack_a0._1_3_,3);
  uStack_96 = CONCAT31(uStack_96._1_3_,3);
  uStack_8c = CONCAT31(uStack_8c._1_3_,3);
  uStack_88 = CONCAT31(uStack_88._1_3_,3);
  uStack_84 = CONCAT31(uStack_84._1_3_,3);
  uStack_7e = CONCAT31(uStack_7e._1_3_,3);
  uStack_76 = CONCAT31(uStack_76._1_3_,3);
  uStack_70 = CONCAT31(uStack_70._1_3_,3);
  uStack_6c = CONCAT31(uStack_6c._1_3_,3);
  uStack_68 = CONCAT31(uStack_68._1_3_,3);
  uStack_5e = CONCAT31(uStack_5e._1_3_,3);
  uStack_54 = CONCAT31(uStack_54._1_3_,3);
  uStack_50 = CONCAT31(uStack_50._1_3_,3);
  uStack_4c = CONCAT31(uStack_4c._1_3_,3);
  plVar4 = (long *)func_0x00187bd0(0xe0,8);
  if (plVar4 == (long *)0x0) {
    func_0x007a1f18(8,0xe0);
  }
  else {
    plVar4[0x15] = (ulong)CONCAT42(uStack_76,uStack_78);
    plVar4[0x14] = CONCAT17(uStack_79,CONCAT16(3,(uint6)uStack_7e << 0x10));
    plVar4[0x17] = CONCAT17(uStack_61,CONCAT16(3,(uint6)uStack_68));
    plVar4[0x16] = CONCAT44(uStack_6c,uStack_70);
    plVar4[0x19] = CONCAT44(uStack_54,(uint)uStack_58);
    plVar4[0x18] = CONCAT17(uStack_59,CONCAT16(3,CONCAT42(uStack_5e,uStack_60)));
    plVar4[0x1b] = CONCAT26(uStack_42,CONCAT15(uVar3,0x202000000));
    plVar4[0x1a] = CONCAT44(uStack_4c,uStack_50);
    plVar4[0xd] = 0;
    plVar4[0xc] = lStack_c0;
    plVar4[0xf] = CONCAT44(uStack_a4,uStack_a8);
    plVar4[0xe] = lStack_b0;
    plVar4[0x11] = CONCAT17(uStack_91,CONCAT16(3,CONCAT42(uStack_96,uStack_98)));
    plVar4[0x10] = CONCAT17(uStack_99,CONCAT16(3,(uint6)uStack_a0));
    plVar4[0x13] = CONCAT44(uStack_84,uStack_88);
    plVar4[0x12] = CONCAT44(uStack_8c,(uint)uStack_90);
    plVar4[5] = 1;
    plVar4[4] = 0;
    plVar4[7] = 0;
    plVar4[6] = 0;
    plVar4[9] = lVar5;
    plVar4[8] = 8;
    plVar4[0xb] = lStack_c8;
    plVar4[10] = lVar1;
    plVar4[1] = lStack_118;
    *plVar4 = 2;
    plVar4[3] = lStack_108;
    plVar4[2] = lStack_110;
    if (lVar6 < 0) {
      uVar7 = 0;
    }
    else {
      if (lVar6 == 0) {
        lVar5 = 1;
LAB_0049aea0:
        _memcpy(lVar5,extraout_x1_00,lVar6);
        if ((*plVar4 != 2) && (plVar4[1] != 0)) {
          func_0x00187bd4(plVar4[2],plVar4[1],1);
        }
        *plVar4 = 0;
        plVar4[1] = lVar6;
        plVar4[2] = lVar5;
        plVar4[3] = lVar6;
        return plVar4;
      }
      uVar7 = 1;
      lVar5 = func_0x00187bd0(lVar6,1);
      if (lVar5 != 0) goto LAB_0049aea0;
    }
    func_0x007a1f00(uVar7,lVar6,&UNK_009e2c18);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x49af20);
  (*pcVar2)();
}

