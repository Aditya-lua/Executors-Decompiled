
void FUN_00514b0c(undefined8 param_1,undefined8 param_2,int *param_3,int *param_4)

{
  ulong uVar1;
  double *pdVar2;
  double dVar3;
  code *pcVar4;
  double dVar5;
  undefined8 uVar6;
  undefined8 extraout_x8;
  int *piVar7;
  ulong uVar8;
  ulong uVar9;
  double dVar10;
  double dVar11;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000050;
  double dStack_b0;
  ulong uStack_a8;
  double dStack_a0;
  ulong uStack_98;
  double dStack_90;
  double dStack_88;
  double dStack_80;
  long lStack_78;
  
  func_0x00513d08(&uStack0000000000000050);
  auVar12 = __Unwind_Resume(param_1);
  uStack_a8 = 0;
  dStack_a0 = 3.95252516672997e-323;
  uStack_98 = 0;
  if (param_3 != param_4) {
    do {
      uVar6 = 1;
      while (piVar7 = param_3 + 8, *param_3 != 1) {
        param_3 = piVar7;
        if (piVar7 == param_4) goto LAB_00514d64;
      }
      func_0x0045b558(&dStack_90,*(undefined8 *)(param_3 + 2),*(undefined8 *)(param_3 + 4));
      dVar3 = dStack_80;
      dVar11 = dStack_88;
      dVar5 = dStack_88;
      dVar10 = dStack_90;
      if (dStack_90 == -0.0) {
        if ((long)dStack_80 < 0) {
          uVar6 = 0;
LAB_00514dbc:
          func_0x007a1f00(uVar6,dVar3,&UNK_009e9838);
          goto code_r0x00514dec;
        }
        if (dStack_80 == 0.0) {
          dVar5 = 4.94065645841247e-324;
        }
        else {
          dVar5 = (double)func_0x00187bd0(dStack_80,1);
          if (dVar5 == 0.0) goto LAB_00514dbc;
        }
        _memcpy(dVar5,dVar11,dVar3);
        dVar10 = dVar3;
      }
      dVar11 = (double)func_0x005320d4(auVar12._0_8_,auVar12._8_8_,dVar5,dVar3);
      if (0.7 < dVar11) {
        if ((long)dVar3 < 0) {
          uVar6 = 0;
code_r0x00514ddc:
          func_0x007a1f00(uVar6,dStack_b0,&UNK_009e9838);
code_r0x00514dec:
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x514df0);
          (*pcVar4)();
        }
        if (dVar3 == 0.0) {
          dStack_b0 = 4.94065645841247e-324;
          _memcpy(1,dVar5,0);
          if (uStack_98 != 0) goto LAB_00514c68;
LAB_00514c94:
          uVar8 = uStack_98;
          uVar9 = uStack_98;
          if (uStack_98 == uStack_a8) goto code_r0x00514cf0;
        }
        else {
          dStack_b0 = (double)func_0x00187bd0(dVar3,1);
          if (dStack_b0 == 0.0) {
            uVar6 = 1;
            dStack_b0 = dVar3;
            goto code_r0x00514ddc;
          }
          _memcpy(dStack_b0,dVar5,dVar3);
          if (uStack_98 == 0) goto LAB_00514c94;
LAB_00514c68:
          if (uStack_98 == 1) {
            uVar8 = 0;
          }
          else {
            uVar8 = 0;
            uVar9 = uStack_98;
            do {
              uVar1 = (uVar9 >> 1) + uVar8;
              if (*(double *)((long)dStack_a0 + uVar1 * 0x20) <= dVar11) {
                uVar8 = uVar1;
              }
              uVar9 = uVar9 - (uVar9 >> 1);
            } while (1 < uVar9);
          }
          if (*(double *)((long)dStack_a0 + uVar8 * 0x20) <= dVar11) {
            uVar8 = uVar8 + 1;
          }
          uVar9 = uStack_98;
          if (uStack_98 == uStack_a8) {
code_r0x00514cf0:
            uVar9 = uStack_98;
            func_0x0050c2ec(&uStack_a8,&UNK_009e9850);
          }
        }
        pdVar2 = (double *)((long)dStack_a0 + uVar8 * 0x20);
        if (uVar8 <= uVar9 && uVar9 - uVar8 != 0) {
          _memmove(pdVar2 + 4,pdVar2,(uVar9 - uVar8) * 0x20);
        }
        *pdVar2 = dVar11;
        pdVar2[1] = dVar3;
        pdVar2[2] = dStack_b0;
        pdVar2[3] = dVar3;
        uStack_98 = uVar9 + 1;
      }
      if (dVar10 != 0.0) {
        func_0x00187bd4(dVar5,dVar10,1);
      }
      param_3 = param_3 + 8;
    } while (param_3 != param_4);
  }
LAB_00514d64:
  lStack_78 = (long)dStack_a0 + uStack_98 * 0x20;
  dStack_90 = dStack_a0;
  dStack_88 = dStack_a0;
  dStack_80 = (double)uStack_a8;
  func_0x0051601c(extraout_x8,&dStack_90,&UNK_009e7fb0);
  return;
}

