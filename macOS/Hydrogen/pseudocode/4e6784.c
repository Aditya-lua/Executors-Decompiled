
void FUN_004e6784(void)

{
  code *pcVar1;
  long *plVar2;
  undefined8 uVar3;
  long *extraout_x8;
  long *plVar4;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar5;
  long unaff_x22;
  long lVar6;
  long unaff_x24;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack_80;
  long lStack_78;
  long *plStack_70;
  long lStack_68;
  
  plVar2 = (long *)func_0x00187bd0();
  if (plVar2 != (long *)0x0) {
    *plVar2 = unaff_x22 + -600;
    uStack0000000000000008 = 4;
    in_stack_00000018 = 1;
    in_stack_00000010 = plVar2;
    lVar9 = in_stack_00000018;
    while (unaff_x22 != unaff_x20) {
      while ((lVar6 = unaff_x22 + 600, *(long *)(unaff_x22 + 0x228) != 0 ||
             (*(int *)(unaff_x22 + 0x248) != 0x110000))) {
        unaff_x22 = lVar6;
        if (lVar6 == unaff_x20) goto LAB_004e681c;
      }
      if (lVar9 == uStack0000000000000008) {
        in_stack_00000018 = lVar9;
        func_0x007a5594(&uStack0000000000000008,lVar9,1,8,8);
        plVar2 = in_stack_00000010;
      }
      plVar2[lVar9] = unaff_x22;
      lVar9 = lVar9 + 1;
      unaff_x22 = lVar6;
    }
LAB_004e681c:
    unaff_x19[1] = (long)in_stack_00000010;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[2] = lVar9;
    return;
  }
  uVar3 = func_0x007a1f00(8,0x20);
  if (uStack0000000000000008 != 0) {
    unaff_x21 = 8;
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 3,8);
  }
  auVar10 = __Unwind_Resume(uVar3);
  lVar9 = auVar10._0_8_;
  do {
    lVar6 = lVar9;
    if (lVar6 == auVar10._8_8_) {
      *extraout_x8 = 0;
      extraout_x8[1] = 8;
      extraout_x8[2] = 0;
      return;
    }
    lVar9 = lVar6 + 0x48;
  } while ((*(byte *)(lVar6 + 0x40) & 1) != 0);
  lVar5 = *(long *)(lVar6 + 0x38);
  if (lVar5 < 0) {
    uVar7 = 0;
code_r0x004e6a5c:
    func_0x007a1f00(uVar7,lVar5,&UNK_009e7fe0);
    unaff_x21 = unaff_x24;
code_r0x004e6a70:
    lVar8 = unaff_x21;
    uStack_80 = 0;
code_r0x004e6a7c:
    func_0x007a1f00(uStack_80,lVar8,&UNK_009e7fe0);
  }
  else {
    if (lVar5 == 0) {
      lVar6 = 1;
      plVar2 = (long *)func_0x00187bd0(0x60,8);
    }
    else {
      uVar3 = *(undefined8 *)(lVar6 + 0x30);
      uVar7 = 1;
      lVar6 = func_0x00187bd0(lVar5,1);
      unaff_x24 = unaff_x21;
      if (lVar6 == 0) goto code_r0x004e6a5c;
      _memcpy(lVar6,uVar3,lVar5);
      plVar2 = (long *)func_0x00187bd0(0x60,8);
    }
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar5;
      plVar2[1] = lVar6;
      plVar2[2] = lVar5;
      uStack_80 = 1;
      lStack_78 = 4;
      lVar6 = 1;
      plStack_70 = plVar2;
      do {
        do {
          lVar5 = lVar9;
          if (lVar5 == auVar10._8_8_) {
            extraout_x8[1] = (long)plStack_70;
            *extraout_x8 = lStack_78;
            extraout_x8[2] = lVar6;
            return;
          }
          lVar9 = lVar5 + 0x48;
        } while ((*(byte *)(lVar5 + 0x40) & 1) != 0);
        lVar8 = *(long *)(lVar5 + 0x38);
        lStack_68 = lVar6;
        if (lVar8 < 0) goto code_r0x004e6a70;
        if (lVar8 == 0) {
          unaff_x21 = 1;
        }
        else {
          uVar3 = *(undefined8 *)(lVar5 + 0x30);
          unaff_x21 = func_0x00187bd0(lVar8,1);
          if (unaff_x21 == 0) goto code_r0x004e6a7c;
          _memcpy(unaff_x21,uVar3,lVar8);
        }
        if (lVar6 == lStack_78) {
          func_0x007a5594(&lStack_78,lVar6,1,8,0x18);
          plVar2 = plStack_70;
        }
        plVar4 = plVar2 + lVar6 * 3;
        *plVar4 = lVar8;
        plVar4[1] = unaff_x21;
        plVar4[2] = lVar8;
        lVar6 = lVar6 + 1;
      } while( true );
    }
    func_0x007a1f00(8,0x60,unaff_x21);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6a94);
  (*pcVar1)();
}

