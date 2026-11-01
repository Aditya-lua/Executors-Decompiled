
void FUN_004e910c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long *plVar5;
  long lVar6;
  long *extraout_x8;
  long *plVar7;
  undefined8 ******ppppppuVar8;
  long lVar9;
  undefined1 auVar10 [16];
  undefined8 *******pppppppuStack_a8;
  long *plStack_a0;
  undefined8 ******ppppppuStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 *******pppppppuStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  
  auVar10 = __Unwind_Resume();
  lVar9 = auVar10._8_8_;
  lVar6 = auVar10._0_8_;
  pppppppuStack_a8 = &pppppppuStack_a8;
  if (lVar6 != lVar9) {
    do {
      lVar6 = lVar6 + 0x48;
      func_0x005139dc(&lStack_78,&pppppppuStack_a8);
      lVar3 = lStack_68;
      lVar2 = lStack_70;
      lVar1 = lStack_78;
      if (lStack_78 != -0x7fffffffffffffff) {
        plVar5 = (long *)func_0x00187bd0(0x60,8);
        if (plVar5 == (long *)0x0) {
          func_0x007a1f00(8,0x60,param_3);
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x4e92c4);
          (*pcVar4)();
        }
        *plVar5 = lVar1;
        plVar5[1] = lVar2;
        plVar5[2] = lVar3;
        pppppppuStack_a8 = (undefined8 *******)0x4;
        ppppppuStack_98 = (undefined8 ******)0x1;
        plStack_a0 = plVar5;
        if (lVar6 == lVar9) goto LAB_004e9280;
        ppppppuVar8 = (undefined8 ******)0x1;
        lStack_90 = lVar6;
        lStack_88 = lVar9;
        pppppppuStack_80 = &pppppppuStack_80;
        goto LAB_004e91fc;
      }
    } while (lVar6 != lVar9);
  }
  *extraout_x8 = 0;
  extraout_x8[1] = 8;
  extraout_x8[2] = 0;
  return;
LAB_004e91fc:
  func_0x005139dc(&lStack_78,&pppppppuStack_80,lVar6);
  lVar3 = lStack_68;
  lVar2 = lStack_70;
  lVar1 = lStack_78;
  lVar6 = lVar6 + 0x48;
  if (lStack_78 != -0x7fffffffffffffff) {
    lStack_90 = lVar6;
    if ((undefined8 *******)ppppppuVar8 == pppppppuStack_a8) {
      func_0x007a5594(&pppppppuStack_a8,ppppppuVar8,1,8,0x18);
      plVar5 = plStack_a0;
    }
    plVar7 = plVar5 + (long)ppppppuVar8 * 3;
    *plVar7 = lVar1;
    plVar7[1] = lVar2;
    plVar7[2] = lVar3;
    ppppppuVar8 = (undefined8 ******)((long)ppppppuVar8 + 1);
    lVar6 = lStack_90;
    lVar9 = lStack_88;
    ppppppuStack_98 = ppppppuVar8;
    pppppppuStack_80 = &pppppppuStack_80;
    if (lStack_90 == lStack_88) goto LAB_004e9280;
    goto LAB_004e91fc;
  }
  if (lVar6 == lVar9) {
LAB_004e9280:
    extraout_x8[1] = (long)plStack_a0;
    *extraout_x8 = (long)pppppppuStack_a8;
    extraout_x8[2] = (long)ppppppuStack_98;
    return;
  }
  goto LAB_004e91fc;
}

