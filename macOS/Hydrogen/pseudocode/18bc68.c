
void FUN_0018bc68(void)

{
  long lVar1;
  code *pcVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  long *extraout_x8;
  ulong *unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  long lStack_78;
  long *plStack_70;
  long lStack_68;
  
  uVar3 = func_0x00187bd0();
  if (uVar3 != 0) {
    uVar11 = 0;
    uVar10 = unaff_x22 >> 3;
    uStack0000000000000008 = uVar10;
    in_stack_00000010 = uVar3;
    while ((*(long *)(unaff_x20 + uVar11 * 8) != 0 && (lVar4 = _CFRetain(), lVar4 != 0))) {
      *(long *)(uVar3 + uVar11 * 8) = lVar4;
      uVar11 = uVar11 + 1;
      if (uVar10 == uVar11) {
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = uVar10;
        return;
      }
    }
    func_0x007a11c0(&UNK_00819d21,0x22,&UNK_009c06c8);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x18bcf8);
    (*pcVar2)();
  }
  uVar5 = func_0x007a1f00();
  func_0x0018b1c8(&uStack0000000000000008);
  __Unwind_Resume(uVar5);
  auVar13 = func_0x007a2668();
  puVar6 = auVar13._0_8_;
  lVar4 = puVar6[1];
  lVar1 = puVar6[2];
  if (lVar1 <= lVar4) {
    *extraout_x8 = 0;
    extraout_x8[1] = 8;
    extraout_x8[2] = 0;
    return;
  }
  puVar12 = (undefined8 *)*puVar6;
  lVar7 = _CFArrayGetValueAtIndex(*puVar12,lVar4);
  if (lVar7 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13b0);
  }
  else {
    puVar6[1] = lVar4 + 1;
    lVar7 = _CFRetain();
    if (lVar7 != 0) {
      plVar8 = (long *)func_0x00187bd0(0x20,8);
      if (plVar8 != (long *)0x0) {
        *plVar8 = lVar7;
        lStack_78 = 4;
        lStack_68 = 1;
        plStack_70 = plVar8;
        if (lVar4 + 1 < lVar1) {
          do {
            lVar7 = lStack_68;
            lVar9 = _CFArrayGetValueAtIndex(*puVar12,lVar4 + lStack_68);
            if (lVar9 == 0) {
              func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13b0);
              goto code_r0x0018bee4;
            }
            lVar9 = _CFRetain();
            if (lVar9 == 0) {
              func_0x007a11c0(&UNK_00819c28,0x22,&UNK_009c0668);
              goto code_r0x0018bee4;
            }
            if (lVar7 == lStack_78) {
              func_0x0079ab9c(&lStack_78,lVar7,1,8,8);
              plVar8 = plStack_70;
            }
            plVar8[lVar7] = lVar9;
            lStack_68 = lVar7 + 1;
          } while ((lVar4 - lVar1) + lStack_68 != 0);
        }
        extraout_x8[1] = (long)plStack_70;
        *extraout_x8 = lStack_78;
        extraout_x8[2] = lStack_68;
        return;
      }
      goto code_r0x0018bed4;
    }
  }
  func_0x007a11c0(&UNK_00819c28,0x22,&UNK_009c0668);
code_r0x0018bed4:
  func_0x007a1f00(8,0x20,auVar13._8_8_);
code_r0x0018bee4:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x18bee8);
  (*pcVar2)();
}

