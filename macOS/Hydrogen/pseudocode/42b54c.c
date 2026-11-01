
/* WARNING: Possible PIC construction at 0x0042b810: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0042b85c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0042b6d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0042b908: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0042b6d4) */

void FUN_0042b54c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  char cVar1;
  ushort *puVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  code *pcVar6;
  ulong *puVar7;
  int iVar8;
  ulong *puVar9;
  int *piVar10;
  long *plVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 *extraout_x8;
  long lVar14;
  long lVar15;
  undefined8 uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  long lVar21;
  long unaff_x29;
  undefined1 auVar22 [16];
  ulong uStack_120;
  ulong uStack_118;
  char cStack_109;
  long lStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  ulong uStack_f0;
  int *piStack_e8;
  ulong uStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long *plStack_c0;
  ulong uStack_b0;
  ulong uStack_a0;
  int *piStack_98;
  ulong uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 uStack_8;
  
  auVar22 = __Unwind_Resume();
  puVar9 = auVar22._0_8_;
  puVar7 = &uStack_120;
  uStack_8 = (undefined *)0x42b554;
  lVar21 = (long)register0x00000008 + -0x10;
  if ((long)param_3 < 0) {
    uVar16 = 0;
code_r0x0042b8d0:
    uVar16 = func_0x007a1f00(uVar16,param_3,&UNK_009d9be8);
    if (param_3 == 0) {
      __Unwind_Resume(uVar16);
      auVar22 = func_0x003f3480();
      plVar11 = auVar22._8_8_;
      lVar21 = auVar22._0_8_;
      if (lVar21 == 0) {
        uVar16 = 0;
      }
      else {
        uVar16 = *(undefined8 *)(lVar21 + 8);
        lVar15 = plVar11[2];
        lVar14 = 0;
        if (*plVar11 != -0x8000000000000000) {
          lVar14 = plVar11[1];
        }
        extraout_x8[1] = *(undefined8 *)(lVar21 + 0x10);
        extraout_x8[2] = lVar14;
        extraout_x8[3] = lVar15;
      }
      *extraout_x8 = uVar16;
      return;
    }
    uStack_8 = &UNK_0042b90c;
  }
  else {
    if (param_3 == 0) {
      piVar10 = (int *)((long)&MACH_HEADER.magic + 1);
      bVar5 = (byte)puVar9[3];
    }
    else {
      uVar16 = 1;
      piVar10 = (int *)func_0x00187bd0(param_3,1);
      if (piVar10 == (int *)0x0) goto code_r0x0042b8d0;
      _memcpy(piVar10,auVar22._8_8_,param_3);
      if (((param_3 == 4) && ((*(byte *)((long)puVar9 + 0x19) & 1) == 0)) &&
         (*piVar10 == 0x48544150)) {
        *(undefined1 *)((long)puVar9 + 0x19) = 1;
      }
      bVar5 = (byte)puVar9[3];
    }
    if ((bVar5 & 1) == 0) {
      uStack_f0 = 0x8000000000000000;
      uStack_a0 = param_3;
      piStack_98 = piVar10;
      uStack_90 = param_3;
      func_0x00400bec(&lStack_108,puVar9,&uStack_a0,&uStack_f0);
      if (lStack_108 < -0x7ffffffffffffffe) {
        return;
      }
      if (lStack_108 == 0) {
        return;
      }
      uStack_8 = (undefined *)0x42b6d4;
      puVar7 = &uStack_120;
    }
    else {
      uVar12 = *puVar9;
      uStack_118 = uVar12;
      if (uVar12 != 0) {
        uVar18 = puVar9[1];
        uStack_120 = uVar18;
LAB_0042b604:
        uVar19 = (ulong)*(ushort *)(uVar12 + 0x21a);
        lVar17 = uVar19 * 0x18;
        lVar14 = uVar12 + 8;
        lVar15 = 0x43;
        do {
          lVar20 = lVar15;
          if (lVar17 == 0) goto LAB_0042b66c;
          uVar4 = *(ulong *)(lVar14 + 0x10);
          uVar3 = param_3;
          if (uVar4 <= param_3) {
            uVar3 = uVar4;
          }
          iVar8 = _memcmp(piVar10,*(undefined8 *)(lVar14 + 8),uVar3);
          lVar15 = param_3 - uVar4;
          if (iVar8 != 0) {
            lVar15 = (long)iVar8;
          }
          cVar1 = 0 < lVar15;
          if (lVar15 < 0) {
            cVar1 = -1;
          }
          lVar17 = lVar17 + -0x18;
          lVar14 = lVar14 + 0x18;
          lVar15 = lVar20 + 1;
        } while (cVar1 == '\x01');
        if (cVar1 == '\0') {
          cStack_109 = '\0';
          if (uVar18 == 0) {
            uStack_90 = lVar20 + -0x43;
            piStack_98 = (int *)0x0;
            uStack_a0 = uVar12;
            func_0x00402cd4(&uStack_f0,&uStack_a0,&cStack_109);
          }
          else {
            lStack_108 = *(long *)(uVar12 + (lVar20 + 1) * 8);
            while (uVar18 = uVar18 - 1, uVar18 != 0) {
              lStack_108 = *(long *)(lStack_108 + (ulong)*(ushort *)(lStack_108 + 0x21a) * 8 + 0x220
                                    );
            }
            lStack_f8 = (ulong)*(ushort *)(lStack_108 + 0x21a) - 1;
            uStack_100 = 0;
            func_0x00402cd4(&uStack_f0,&lStack_108,&cStack_109);
            if (*(ushort *)((long)plStack_c0 + 0x21a) <= uStack_b0) {
              do {
                puVar2 = (ushort *)(plStack_c0 + 0x43);
                uStack_b0 = (ulong)*puVar2;
                plStack_c0 = (long *)*plStack_c0;
              } while (*(ushort *)((long)plStack_c0 + 0x21a) <= *puVar2);
            }
            uVar12 = plStack_c0[uStack_b0 * 3 + 3];
            piVar10 = (int *)plStack_c0[uStack_b0 * 3 + 2];
            uVar18 = plStack_c0[uStack_b0 * 3 + 1];
            plStack_c0[uStack_b0 * 3 + 1] = uStack_f0;
            plStack_c0[uStack_b0 * 3 + 2] = (long)piStack_e8;
            plStack_c0[uStack_b0 * 3 + 3] = uStack_e0;
            lVar17 = plStack_c0[uStack_b0 * 3 + 0x23];
            lVar15 = plStack_c0[uStack_b0 * 3 + 0x22];
            lVar14 = plStack_c0[uStack_b0 * 3 + 0x24];
            plStack_c0[uStack_b0 * 3 + 0x22] = lStack_d8;
            plStack_c0[uStack_b0 * 3 + 0x23] = lStack_d0;
            plStack_c0[uStack_b0 * 3 + 0x24] = lStack_c8;
            uStack_f0 = uVar18;
            piStack_e8 = piVar10;
            uStack_e0 = uVar12;
            lStack_d8 = lVar15;
            lStack_d0 = lVar17;
            lStack_c8 = lVar14;
          }
          lVar14 = lStack_d8;
          piStack_98 = piStack_e8;
          uStack_a0 = uStack_f0;
          lStack_88 = lStack_d8;
          uStack_90 = uStack_e0;
          lStack_78 = lStack_c8;
          lStack_80 = lStack_d0;
          puVar9[2] = puVar9[2] - 1;
          if (cStack_109 == '\x01') {
            if (uStack_120 == 0) {
              func_0x007a247c(&UNK_00885311,0x21,&UNK_009d9530);
                    /* WARNING: Does not return */
              pcVar6 = (code *)SoftwareBreakpoint(1,0x42b8cc);
              (*pcVar6)();
            }
            puVar13 = *(undefined8 **)(uStack_118 + 0x220);
            *puVar9 = (ulong)puVar13;
            puVar9[1] = uStack_120 - 1;
            *puVar13 = 0;
            uStack_8 = &UNK_0042b814;
            puVar7 = &uStack_120;
            goto code_r0x00187bd4;
          }
          if (uStack_f0 != 0x8000000000000000) {
            if (uStack_f0 != 0) {
              func_0x00187bd4(piStack_e8,uStack_f0,1);
            }
            if ((-0x7fffffffffffffff < lVar14) && (lVar14 != 0)) {
              uStack_8 = &LAB_0042b860;
              puVar7 = &uStack_120;
              goto code_r0x00187bd4;
            }
          }
        }
        else {
          uVar19 = lVar20 - 0x43;
LAB_0042b66c:
          if (uVar18 != 0) goto code_r0x0042b670;
        }
      }
      if (param_3 == 0) {
        return;
      }
      puVar7 = (ulong *)register0x00000008;
      lVar21 = unaff_x29;
    }
  }
code_r0x00187bd4:
  *(long *)((long)puVar7 + -0x10) = lVar21;
  *(undefined **)((long)puVar7 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
code_r0x0042b670:
  uVar12 = *(ulong *)(uVar12 + uVar19 * 8 + 0x220);
  uVar18 = uVar18 - 1;
  goto LAB_0042b604;
}

