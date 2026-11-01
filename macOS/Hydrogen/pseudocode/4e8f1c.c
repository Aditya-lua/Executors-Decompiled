
/* WARNING: Type propagation algorithm not settling */

void FUN_004e8f1c(long param_1)

{
  uint uVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  long *plVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 uVar9;
  long *extraout_x8;
  long *extraout_x8_00;
  long *plVar10;
  undefined8 ******ppppppuVar11;
  byte *pbVar12;
  long lVar13;
  long lVar14;
  undefined1 auVar15 [16];
  undefined8 in_stack_00000010;
  undefined8 *******pppppppuStack_108;
  long *plStack_100;
  undefined8 ******ppppppuStack_f8;
  long lStack_f0;
  long lStack_e8;
  undefined8 *******pppppppuStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_58;
  long *plStack_50;
  long lStack_48;
  
  func_0x00187bd4(in_stack_00000010,param_1 << 4,8);
  auVar15 = __Unwind_Resume();
  uVar9 = auVar15._8_8_;
  plVar6 = auVar15._0_8_;
  lVar8 = *plVar6;
  lVar14 = plVar6[1];
  if (lVar8 != lVar14) {
    pbVar12 = (byte *)plVar6[2];
    do {
      if (((((*(long *)(lVar8 + 0x228) == 0) && (*(int *)(lVar8 + 0x248) == 0x110000)) &&
           (!(*(int *)(lVar8 + 0x38) == 1 && *(long *)(lVar8 + 0x40) != 0))) &&
          (uVar1 = *(uint *)(lVar8 + 0x250), (uVar1 >> 2 & 1) == 0)) &&
         (((bVar2 = *pbVar12, (uVar1 >> 0xd & 1) == 0 && ((bVar2 & 1) != 0)) ||
          (((uVar1 >> 3 & 1) != 0 || (!((bVar2 & 1) != 0 || (uVar1 & 0x1000) != 0))))))) {
        lVar13 = lVar8 + 600;
        *plVar6 = lVar13;
        plVar6 = (long *)func_0x00187bd0(0x20,8);
        if (plVar6 != (long *)0x0) {
          *plVar6 = lVar8;
          lStack_58 = 4;
          lStack_48 = 1;
          plStack_50 = plVar6;
          lVar8 = lStack_48;
          for (; lVar13 != lVar14; lVar13 = lVar13 + 600) {
            while ((((*(long *)(lVar13 + 0x228) != 0 || (*(int *)(lVar13 + 0x248) != 0x110000)) ||
                    ((*(int *)(lVar13 + 0x38) == 1 && *(long *)(lVar13 + 0x40) != 0 ||
                     (uVar1 = *(uint *)(lVar13 + 0x250), (uVar1 >> 2 & 1) != 0)))) ||
                   ((((bVar2 = *pbVar12, (uVar1 >> 0xd & 1) != 0 || ((bVar2 & 1) == 0)) &&
                     ((uVar1 >> 3 & 1) == 0)) && ((bVar2 & 1) != 0 || (uVar1 & 0x1000) != 0))))) {
              lVar13 = lVar13 + 600;
              if (lVar13 == lVar14) goto code_r0x004e90a4;
            }
            if (lVar8 == lStack_58) {
              lStack_48 = lVar8;
              func_0x007a5594(&lStack_58,lVar8,1,8,8);
              plVar6 = plStack_50;
            }
            plVar6[lVar8] = lVar13;
            lVar8 = lVar8 + 1;
          }
code_r0x004e90a4:
          extraout_x8[1] = (long)plStack_50;
          *extraout_x8 = lStack_58;
          extraout_x8[2] = lVar8;
          return;
        }
        uVar7 = func_0x007a1f00(8,0x20,uVar9);
        if (lStack_58 != 0) {
          uVar9 = 8;
          func_0x00187bd4(plStack_50,lStack_58 << 3,8);
        }
        auVar15 = __Unwind_Resume(uVar7);
        lVar14 = auVar15._8_8_;
        lVar8 = auVar15._0_8_;
        pppppppuStack_108 = &pppppppuStack_108;
        if (lVar8 != lVar14) goto LAB_004e9160;
        goto LAB_004e9188;
      }
      lVar8 = lVar8 + 600;
    } while (lVar8 != lVar14);
    *plVar6 = lVar8;
  }
  *extraout_x8 = 0;
  extraout_x8[1] = 8;
  extraout_x8[2] = 0;
  return;
LAB_004e9160:
  lVar8 = lVar8 + 0x48;
  func_0x005139dc(&lStack_d8,&pppppppuStack_108);
  lVar4 = lStack_c8;
  lVar3 = lStack_d0;
  lVar13 = lStack_d8;
  if (lStack_d8 != -0x7fffffffffffffff) {
    plVar6 = (long *)func_0x00187bd0(0x60,8);
    if (plVar6 == (long *)0x0) {
      func_0x007a1f00(8,0x60,uVar9);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x4e92c4);
      (*pcVar5)();
    }
    *plVar6 = lVar13;
    plVar6[1] = lVar3;
    plVar6[2] = lVar4;
    pppppppuStack_108 = (undefined8 *******)0x4;
    ppppppuStack_f8 = (undefined8 ******)0x1;
    plStack_100 = plVar6;
    if (lVar8 == lVar14) goto LAB_004e9280;
    ppppppuVar11 = (undefined8 ******)0x1;
    lStack_f0 = lVar8;
    lStack_e8 = lVar14;
    pppppppuStack_e0 = &pppppppuStack_e0;
    goto LAB_004e91fc;
  }
  if (lVar8 == lVar14) {
LAB_004e9188:
    *extraout_x8_00 = 0;
    extraout_x8_00[1] = 8;
    extraout_x8_00[2] = 0;
    return;
  }
  goto LAB_004e9160;
LAB_004e91fc:
  func_0x005139dc(&lStack_d8,&pppppppuStack_e0,lVar8);
  lVar4 = lStack_c8;
  lVar3 = lStack_d0;
  lVar13 = lStack_d8;
  lVar8 = lVar8 + 0x48;
  if (lStack_d8 == -0x7fffffffffffffff) {
    if (lVar8 == lVar14) goto LAB_004e9280;
    goto LAB_004e91fc;
  }
  lStack_f0 = lVar8;
  if ((undefined8 *******)ppppppuVar11 == pppppppuStack_108) {
    func_0x007a5594(&pppppppuStack_108,ppppppuVar11,1,8,0x18);
    plVar6 = plStack_100;
  }
  plVar10 = plVar6 + (long)ppppppuVar11 * 3;
  *plVar10 = lVar13;
  plVar10[1] = lVar3;
  plVar10[2] = lVar4;
  ppppppuVar11 = (undefined8 ******)((long)ppppppuVar11 + 1);
  lVar8 = lStack_f0;
  lVar14 = lStack_e8;
  ppppppuStack_f8 = ppppppuVar11;
  pppppppuStack_e0 = &pppppppuStack_e0;
  if (lStack_f0 == lStack_e8) {
LAB_004e9280:
    extraout_x8_00[1] = (long)plStack_100;
    *extraout_x8_00 = (long)pppppppuStack_108;
    extraout_x8_00[2] = (long)ppppppuStack_f8;
    return;
  }
  goto LAB_004e91fc;
}

