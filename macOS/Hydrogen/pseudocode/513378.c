
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00513378(long *param_1,long *param_2,undefined8 *param_3)

{
  long *plVar1;
  code *pcVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long unaff_x21;
  long lVar6;
  long lVar7;
  long *plVar8;
  long *plVar9;
  
  plVar1 = (long *)*param_3;
  lVar6 = param_3[1];
  if (param_1 == param_2) {
LAB_00513484:
    *plVar1 = lVar6;
    return;
  }
  lVar5 = *param_1;
  lVar4 = param_1[1];
  if (lVar4 < 0) {
    uVar3 = 0;
  }
  else {
    lVar7 = 0;
    plVar8 = param_1 + 3;
    plVar9 = (long *)(param_3[2] + lVar6 * 0x18 + 8);
    do {
      if (lVar4 == 0) {
        unaff_x21 = 1;
      }
      else {
        unaff_x21 = func_0x00187bd0(lVar4,1);
        if (unaff_x21 == 0) {
          uVar3 = 1;
          unaff_x21 = lVar4;
          goto code_r0x005134b4;
        }
      }
      _memcpy(unaff_x21,lVar5,lVar4);
      plVar9[-1] = lVar4;
      *plVar9 = unaff_x21;
      plVar9[1] = lVar4;
      if (((ulong)((long)param_2 - (long)param_1) >> 4) - 1 == lVar7) {
        lVar6 = lVar6 + lVar7 + 1;
        goto LAB_00513484;
      }
      lVar5 = plVar8[-1];
      lVar4 = *plVar8;
      plVar8 = plVar8 + 2;
      plVar9 = plVar9 + 3;
      lVar7 = lVar7 + 1;
    } while (-1 < lVar4);
    uVar3 = 0;
  }
code_r0x005134b4:
  func_0x007a1f00(uVar3,unaff_x21,&UNK_009e9838);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5134c8);
  (*pcVar2)();
}

