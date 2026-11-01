
void FUN_0018bcf8(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  long *extraout_x8;
  undefined8 *puVar9;
  undefined1 auVar10 [16];
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000018;
  long lStack_78;
  long *plStack_70;
  long lStack_68;
  
  uVar4 = func_0x007a1f00(0);
  in_stack_00000018 = param_3;
  func_0x0018b1c8(&uStack0000000000000008);
  __Unwind_Resume(uVar4);
  auVar10 = func_0x007a2668();
  puVar5 = auVar10._0_8_;
  lVar1 = puVar5[1];
  lVar2 = puVar5[2];
  if (lVar2 <= lVar1) {
    *extraout_x8 = 0;
    extraout_x8[1] = 8;
    extraout_x8[2] = 0;
    return;
  }
  puVar9 = (undefined8 *)*puVar5;
  lVar6 = _CFArrayGetValueAtIndex(*puVar9,lVar1);
  if (lVar6 == 0) {
    func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13b0);
  }
  else {
    puVar5[1] = lVar1 + 1;
    lVar6 = _CFRetain();
    if (lVar6 != 0) {
      plVar7 = (long *)func_0x00187bd0(0x20,8);
      if (plVar7 != (long *)0x0) {
        *plVar7 = lVar6;
        lStack_78 = 4;
        lStack_68 = 1;
        plStack_70 = plVar7;
        if (lVar1 + 1 < lVar2) {
          do {
            lVar6 = lStack_68;
            lVar8 = _CFArrayGetValueAtIndex(*puVar9,lVar1 + lStack_68);
            if (lVar8 == 0) {
              func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c13b0);
              goto LAB_0018bee4;
            }
            lVar8 = _CFRetain();
            if (lVar8 == 0) {
              func_0x007a11c0(&UNK_00819c28,0x22,&UNK_009c0668);
              goto LAB_0018bee4;
            }
            if (lVar6 == lStack_78) {
              func_0x0079ab9c(&lStack_78,lVar6,1,8,8);
              plVar7 = plStack_70;
            }
            plVar7[lVar6] = lVar8;
            lStack_68 = lVar6 + 1;
          } while ((lVar1 - lVar2) + lStack_68 != 0);
        }
        extraout_x8[1] = (long)plStack_70;
        *extraout_x8 = lStack_78;
        extraout_x8[2] = lStack_68;
        return;
      }
      goto LAB_0018bed4;
    }
  }
  func_0x007a11c0(&UNK_00819c28,0x22,&UNK_009c0668);
LAB_0018bed4:
  func_0x007a1f00(8,0x20,auVar10._8_8_);
LAB_0018bee4:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x18bee8);
  (*pcVar3)();
}

