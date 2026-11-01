
void thunk_FUN_005147a8(undefined8 param_1,undefined8 param_2,ulong *param_3)

{
  long *plVar1;
  ulong uVar2;
  double *pdVar3;
  long *plVar4;
  double dVar5;
  ulong *puVar6;
  ulong uVar7;
  code *pcVar8;
  undefined8 extraout_x8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  double dVar17;
  ulong uVar18;
  double dVar19;
  undefined1 auVar20 [16];
  undefined1 uStack0000000000000018;
  undefined8 uStack_100;
  double dStack_f0;
  ulong uStack_e8;
  double dStack_d0;
  ulong uStack_c0;
  ulong *puStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  ulong uStack_a0;
  long lStack_98;
  long lStack_90;
  ulong uStack_88;
  long lStack_80;
  
  func_0x00513d08(&uStack0000000000000018);
  auVar20 = __Unwind_Resume(param_1);
  uStack_b0 = 0;
  lStack_a8 = 8;
  uStack_a0 = 0;
  uVar18 = *param_3;
  uVar10 = param_3[1];
  dStack_d0 = (double)param_3[2];
  puVar15 = (ulong *)param_3[3];
  puStack_b8 = (ulong *)param_3[4];
  uStack_c0 = param_3[5];
  uVar9 = param_3[6];
  dVar5 = (double)param_3[7];
  puVar13 = (ulong *)param_3[8];
  puVar6 = (ulong *)param_3[9];
  uStack_100 = 1;
  uVar16 = param_3[10];
  uVar7 = param_3[0xb];
  do {
    puVar14 = puVar15;
    do {
      puVar15 = puVar14;
      if (uVar18 == 2) {
code_r0x00514858:
        if ((uVar16 == 0) || (uVar16 == uVar7)) {
          if (uStack_c0 == 2) goto code_r0x00514a70;
          uVar12 = uVar10;
          if ((uStack_c0 & 1) != 0) {
            if (uVar9 != 0) {
              uVar18 = 2;
              dVar17 = dVar5;
              uVar11 = uVar9;
              uVar9 = 0;
              goto code_r0x00514934;
            }
            uStack_c0 = 0;
            uVar9 = 0;
          }
          if ((puVar13 == (ulong *)0x0) || (puVar13 == puVar6)) {
code_r0x00514a70:
            lStack_80 = lStack_a8 + uStack_a0 * 0x20;
            lStack_98 = lStack_a8;
            lStack_90 = lStack_a8;
            uStack_88 = uStack_b0;
            func_0x0051601c(extraout_x8,&lStack_98,&UNK_009e7fb0);
            return;
          }
          uVar11 = *puVar13;
          pdVar3 = (double *)(puVar13 + 1);
          uVar18 = 2;
          puVar13 = puVar13 + 3;
          dVar17 = *pdVar3;
        }
        else {
          puVar14 = (ulong *)(uVar16 + 0x230);
          dStack_d0 = *(double *)(uVar16 + 0x238);
          plVar1 = (long *)(uVar16 + 0x40);
          plVar4 = (long *)(uVar16 + 0x48);
          uVar16 = uVar16 + 0x2c8;
          puStack_b8 = (ulong *)*plVar1 + *plVar4 * 3;
          uVar18 = 1;
          uVar12 = 0;
          puVar15 = (ulong *)*plVar1;
          dVar17 = dStack_d0;
          uVar11 = *puVar14;
        }
      }
      else if ((uVar18 & 1) == 0) {
joined_r0x005148e0:
        if ((puVar14 == (ulong *)0x0) || (puVar14 == puStack_b8)) goto code_r0x00514858;
        puVar15 = puVar14 + 3;
        uVar11 = *puVar14;
        dVar17 = (double)puVar14[1];
        uVar12 = uVar10;
      }
      else {
        if (uVar10 == 0) {
          uVar18 = 0;
          uVar10 = 0;
          goto joined_r0x005148e0;
        }
        uVar12 = 0;
        dVar17 = dStack_d0;
        uVar11 = uVar10;
      }
code_r0x00514934:
      uVar10 = uVar12;
      dVar19 = (double)func_0x005320d4(auVar20._0_8_,auVar20._8_8_,uVar11,dVar17);
      puVar14 = puVar15;
    } while (dVar19 <= 0.7);
    if ((long)dVar17 < 0) {
      uStack_100 = 0;
      goto code_r0x00514ac8;
    }
    if (dVar17 == 0.0) {
      dStack_f0 = 4.94065645841247e-324;
      _memcpy(1,uVar11,0);
      if (uStack_a0 == 0) goto code_r0x005149d0;
code_r0x005149a4:
      if (uStack_a0 == 1) {
        uVar11 = 0;
      }
      else {
        uVar11 = 0;
        uVar12 = uStack_a0;
        do {
          uVar2 = (uVar12 >> 1) + uVar11;
          if (*(double *)(lStack_a8 + uVar2 * 0x20) <= dVar19) {
            uVar11 = uVar2;
          }
          uVar12 = uVar12 - (uVar12 >> 1);
        } while (1 < uVar12);
      }
      if (*(double *)(lStack_a8 + uVar11 * 0x20) <= dVar19) {
        uVar11 = uVar11 + 1;
      }
      uStack_e8 = uStack_a0;
      if (uStack_a0 == uStack_b0) {
code_r0x00514a34:
        uStack_e8 = uStack_a0;
        func_0x0050c2ec(&uStack_b0,&UNK_009e9850);
      }
    }
    else {
      dStack_f0 = (double)func_0x00187bd0(dVar17,1);
      if (dStack_f0 == 0.0) {
        dStack_f0 = dVar17;
code_r0x00514ac8:
        func_0x007a1f00(uStack_100,dStack_f0,&UNK_009e9838);
                    /* WARNING: Does not return */
        pcVar8 = (code *)SoftwareBreakpoint(1,0x514ae0);
        (*pcVar8)();
      }
      _memcpy(dStack_f0,uVar11,dVar17);
      if (uStack_a0 != 0) goto code_r0x005149a4;
code_r0x005149d0:
      uVar11 = uStack_a0;
      uStack_e8 = uStack_a0;
      if (uStack_a0 == uStack_b0) goto code_r0x00514a34;
    }
    pdVar3 = (double *)(lStack_a8 + uVar11 * 0x20);
    if (uVar11 <= uStack_e8 && uStack_e8 - uVar11 != 0) {
      _memmove(pdVar3 + 4,pdVar3,(uStack_e8 - uVar11) * 0x20);
    }
    *pdVar3 = dVar19;
    pdVar3[1] = dVar17;
    pdVar3[2] = dStack_f0;
    pdVar3[3] = dVar17;
    uStack_a0 = uStack_e8 + 1;
  } while( true );
}

