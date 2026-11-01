
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_0052b134(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 extraout_x1;
  undefined *puVar6;
  long in_x3;
  undefined8 in_x4;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined1 auVar7 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  char cStack_30;
  undefined1 uStack_2f;
  undefined8 uStack_28;
  
  lVar2 = func_0x00187bd0();
  if (lVar2 != 0) {
    _memcpy(lVar2);
    puVar3 = (undefined8 *)func_0x0052b7a0();
    if (in_stack_00000000 == -0x8000000000000000) {
      *unaff_x19 = 0;
      unaff_x19[1] = in_stack_00000008;
    }
    else {
      puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
      if (puVar3 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x52b200);
        (*pcVar1)();
      }
      puVar3[1] = 1;
      *puVar3 = 1;
      puVar3[2] = in_stack_00000000;
      puVar3[3] = in_stack_00000008;
      puVar3[4] = in_stack_00000010;
      *unaff_x19 = puVar3;
      unaff_x19[1] = &UNK_009e9a70;
      uVar4 = _UNK_008a6800;
      unaff_x19[3] = _UNK_008a6808;
      unaff_x19[2] = uVar4;
    }
    return puVar3;
  }
  puVar6 = &UNK_009eaac8;
  uVar4 = func_0x007a1f00();
  if (unaff_x21 != 0) {
    puVar6 = (undefined *)0x1;
    func_0x00187bd4();
  }
  auVar7 = __Unwind_Resume(uVar4);
  lVar2 = auVar7._8_8_;
  puVar3 = (undefined8 *)func_0x0052c198(&cStack_30,auVar7._0_8_,lVar2,puVar6,in_x3,in_x4);
  if (cStack_30 == '\x01') {
    *extraout_x8 = 0;
    extraout_x8[1] = uStack_28;
  }
  else {
    puVar3 = (undefined8 *)func_0x00187bd0(0x18,8);
    if (puVar3 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x18);
      auVar7 = func_0x0052cecc();
      puVar3 = auVar7._0_8_;
      if (((ulong)puVar3 & 1) == 0) {
        puVar3 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar3 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          if (in_x3 < 0) {
            uVar4 = 0;
code_r0x0052b480:
            uVar4 = func_0x007a1f00(uVar4,in_x3,&UNK_009eaac8);
            if (unaff_x21 != 0) {
              func_0x00187bd4(in_x3,unaff_x21,1);
            }
            __Unwind_Resume(uVar4);
            return (undefined8 *)0x596b48cc04376e6;
          }
          if (in_x3 == 0) {
            lVar5 = 1;
          }
          else {
            uVar4 = 1;
            lVar5 = func_0x00187bd0(in_x3,1);
            unaff_x21 = lVar2;
            if (lVar5 == 0) goto code_r0x0052b480;
          }
          uVar4 = _memcpy(lVar5,puVar6,in_x3);
          lStack_b8 = in_x3;
          lStack_b0 = lVar5;
          lStack_a8 = in_x3;
          puVar3 = (undefined8 *)func_0x0052babc(&lStack_d0,uVar4,extraout_x1,lVar2,&lStack_b8);
          if (lStack_d0 == -0x8000000000000000) {
            *extraout_x8_01 = 0;
            extraout_x8_01[1] = uStack_c8;
          }
          else {
            puVar3 = (undefined8 *)func_0x00187bd0(0x28,8);
            if (puVar3 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
              pcVar1 = (code *)SoftwareBreakpoint(1,0x52b47c);
              (*pcVar1)();
            }
            puVar3[1] = 1;
            *puVar3 = 1;
            puVar3[2] = lStack_d0;
            puVar3[3] = uStack_c8;
            puVar3[4] = uStack_c0;
            *extraout_x8_01 = puVar3;
            extraout_x8_01[1] = &UNK_009e9a10;
            uVar4 = _UNK_008a67d0;
            extraout_x8_01[3] = _UNK_008a67d8;
            extraout_x8_01[2] = uVar4;
          }
          return puVar3;
        }
        puVar3[1] = 1;
        *puVar3 = 1;
        puVar3[2] = auVar7._8_8_;
        *extraout_x8_00 = puVar3;
        extraout_x8_00[1] = &UNK_009e9a30;
        uVar4 = _UNK_008a67e0;
        extraout_x8_00[3] = _UNK_008a67e8;
        extraout_x8_00[2] = uVar4;
      }
      else {
        *extraout_x8_00 = 0;
        extraout_x8_00[1] = auVar7._8_8_;
      }
      return puVar3;
    }
    puVar3[1] = 1;
    *puVar3 = 1;
    *(undefined1 *)(puVar3 + 2) = uStack_2f;
    *extraout_x8 = puVar3;
    extraout_x8[1] = &UNK_009e9a90;
    uVar4 = _UNK_0089f380;
    extraout_x8[3] = _UNK_0089f388;
    extraout_x8[2] = uVar4;
  }
  return puVar3;
}

