
/* WARNING: Type propagation algorithm not settling */

void FUN_0006e4b4(void)

{
  long lVar1;
  undefined6 uVar2;
  undefined2 uVar3;
  undefined6 uVar4;
  undefined6 uVar5;
  undefined2 uVar6;
  undefined6 uVar7;
  code *pcVar8;
  byte bVar9;
  int iVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  char *pcVar14;
  undefined8 uVar15;
  char *pcVar16;
  undefined4 uVar17;
  ulong uVar18;
  bool bVar19;
  long *plVar20;
  char *pcVar21;
  long *plVar22;
  undefined1 auVar23 [16];
  char cStack_40f9;
  char *pcStack_40f8;
  char *pcStack_40f0;
  char *pcStack_40e8;
  char *pcStack_40e0;
  long alStack_40d8 [3];
  long *plStack_40c0;
  long alStack_40b8 [3];
  long *plStack_40a0;
  long alStack_4098 [3];
  long *plStack_4080;
  long alStack_4078 [3];
  long *plStack_4060;
  char acStack_4058 [6];
  char acStack_4052 [2];
  char acStack_4050 [6];
  undefined1 uStack_404a;
  char cStack_4041;
  long lStack_58;
  
  __Unwind_Resume();
  auVar23 = (*(code *)PTR____chkstk_darwin_009b01d8)();
  plVar20 = auVar23._8_8_;
  plVar11 = auVar23._0_8_;
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar10 = func_0x000692e4(*plVar11 + 0x48);
  uVar7 = s_Content_Length_008d1a55._8_6_;
  uVar6 = s_Content_Length_008d1a55._6_2_;
  uVar5 = s_Content_Length_008d1a55._0_6_;
  if (iVar10 == 0) {
    cStack_4041 = '\x0e';
    acStack_4058[0] = s_Content_Length_008d1a55[0];
    acStack_4058[1] = s_Content_Length_008d1a55[1];
    acStack_4058[2] = s_Content_Length_008d1a55[2];
    acStack_4058[3] = s_Content_Length_008d1a55[3];
    acStack_4058[4] = s_Content_Length_008d1a55[4];
    acStack_4058[5] = s_Content_Length_008d1a55[5];
    acStack_4052[0] = s_Content_Length_008d1a55[6];
    acStack_4052[1] = s_Content_Length_008d1a55[7];
    acStack_4050[0] = s_Content_Length_008d1a55[8];
    acStack_4050[1] = s_Content_Length_008d1a55[9];
    acStack_4050[2] = s_Content_Length_008d1a55[10];
    acStack_4050[3] = s_Content_Length_008d1a55[0xb];
    acStack_4050[4] = s_Content_Length_008d1a55[0xc];
    acStack_4050[5] = s_Content_Length_008d1a55[0xd];
    uStack_404a = 0;
    lVar13 = func_0x00063e9c(*plVar11 + 0x48,acStack_4058);
    uVar2 = s_Content_Length_008d1a55._0_6_;
    uVar3 = s_Content_Length_008d1a55._6_2_;
    uVar4 = s_Content_Length_008d1a55._8_6_;
    if (cStack_4041 < '\0') {
      __ZdlPv(CONCAT26(acStack_4052,acStack_4058));
      uVar2 = s_Content_Length_008d1a55._0_6_;
      uVar3 = s_Content_Length_008d1a55._6_2_;
      uVar4 = s_Content_Length_008d1a55._8_6_;
    }
    s_Content_Length_008d1a55._0_6_ = uVar2;
    s_Content_Length_008d1a55._6_2_ = uVar3;
    s_Content_Length_008d1a55._8_6_ = uVar4;
    if (lVar13 == 0) {
      plVar22 = (long *)plVar11[1];
      plVar12 = (long *)plVar20[3];
      if (plVar12 == (long *)0x0) {
        plStack_4080 = (long *)0x0;
      }
      else if (plVar12 == plVar20) {
        plStack_4080 = alStack_4098;
        (**(code **)(*plVar20 + 0x18))(plVar20,alStack_4098);
      }
      else {
        plStack_4080 = (long *)(**(code **)(*plVar12 + 0x10))();
      }
      pcVar14 = (char *)(**(code **)(*plVar22 + 0x28))(plVar22,acStack_4058,0x4000);
      bVar9 = pcVar14 == (char *)0x0;
      if (0 < (long)pcVar14) {
        bVar9 = false;
        pcVar21 = (char *)0x0;
        do {
          pcStack_40f8 = (char *)0x0;
          pcStack_40f0 = pcVar21;
          pcStack_40e8 = pcVar14;
          pcStack_40e0 = acStack_4058;
          if (plStack_4080 == (long *)0x0) {
            func_0x00056004();
            goto code_r0x0006e9e4;
          }
          uVar18 = (**(code **)(*plStack_4080 + 0x30))
                             (plStack_4080,&pcStack_40e0,&pcStack_40e8,&pcStack_40f0,&pcStack_40f8);
          if ((uVar18 & 1) == 0) break;
          pcVar16 = (char *)(**(code **)(*plVar22 + 0x28))(plVar22,acStack_4058,0x4000);
          pcVar21 = pcVar21 + (long)pcVar14;
          bVar9 = pcVar16 == (char *)0x0;
          pcVar14 = pcVar16;
        } while (0 < (long)pcVar16);
      }
      plVar20 = plStack_4080;
      if (plStack_4080 != alStack_4098) goto joined_r0x0006e7e0;
      (**(code **)(alStack_4098[0] + 0x20))();
      goto joined_r0x0006e67c;
    }
    cStack_40f9 = '\0';
    cStack_4041 = '\x0e';
    s_Content_Length_008d1a55[0] = (char)uVar5;
    s_Content_Length_008d1a55[1] = SUB61(uVar5,1);
    s_Content_Length_008d1a55[2] = SUB61(uVar5,2);
    s_Content_Length_008d1a55[3] = SUB61(uVar5,3);
    s_Content_Length_008d1a55[4] = SUB61(uVar5,4);
    s_Content_Length_008d1a55[5] = SUB61(uVar5,5);
    acStack_4058[0] = s_Content_Length_008d1a55[0];
    acStack_4058[1] = s_Content_Length_008d1a55[1];
    acStack_4058[2] = s_Content_Length_008d1a55[2];
    acStack_4058[3] = s_Content_Length_008d1a55[3];
    acStack_4058[4] = s_Content_Length_008d1a55[4];
    acStack_4058[5] = s_Content_Length_008d1a55[5];
    s_Content_Length_008d1a55[6] = (char)uVar6;
    s_Content_Length_008d1a55[7] = SUB21(uVar6,1);
    acStack_4052[0] = s_Content_Length_008d1a55[6];
    acStack_4052[1] = s_Content_Length_008d1a55[7];
    s_Content_Length_008d1a55[8] = (char)uVar7;
    s_Content_Length_008d1a55[9] = SUB61(uVar7,1);
    s_Content_Length_008d1a55[10] = SUB61(uVar7,2);
    s_Content_Length_008d1a55[0xb] = SUB61(uVar7,3);
    s_Content_Length_008d1a55[0xc] = SUB61(uVar7,4);
    s_Content_Length_008d1a55[0xd] = SUB61(uVar7,5);
    acStack_4050[0] = s_Content_Length_008d1a55[8];
    acStack_4050[1] = s_Content_Length_008d1a55[9];
    acStack_4050[2] = s_Content_Length_008d1a55[10];
    acStack_4050[3] = s_Content_Length_008d1a55[0xb];
    acStack_4050[4] = s_Content_Length_008d1a55[0xc];
    acStack_4050[5] = s_Content_Length_008d1a55[0xd];
    uStack_404a = 0;
    pcVar14 = (char *)func_0x00069608(*plVar11 + 0x48,acStack_4058,0xffffffffffffffff,0,&cStack_40f9
                                     );
    if (cStack_4041 < '\0') {
      __ZdlPv(CONCAT26(acStack_4052,acStack_4058));
      if (cStack_40f9 == '\0') goto code_r0x0006e694;
      goto LAB_0006e808;
    }
    if (cStack_40f9 != '\0') goto LAB_0006e808;
code_r0x0006e694:
    if (pcVar14 <= *(char **)plVar11[2]) {
      if (pcVar14 != (char *)0x0) {
        plVar22 = (long *)plVar11[1];
        plVar12 = (long *)plVar11[3] + 3;
        plStack_40a0 = (long *)*plVar12;
        if (plStack_40a0 == (long *)0x0) {
          plStack_40a0 = (long *)0x0;
        }
        else if (plStack_40a0 == (long *)plVar11[3]) {
          plStack_40a0 = alStack_40b8;
          (**(code **)(*(long *)*plVar12 + 0x18))((long *)*plVar12,alStack_40b8);
        }
        else {
          *plVar12 = 0;
        }
        plVar12 = (long *)plVar20[3];
        plStack_40c0 = (long *)0x0;
        if (plVar12 != (long *)0x0) {
          if (plVar12 == plVar20) {
            plStack_40c0 = alStack_40d8;
            (**(code **)(*plVar20 + 0x18))(plVar20,alStack_40d8);
          }
          else {
            plStack_40c0 = (long *)(**(code **)(*plVar12 + 0x10))();
          }
        }
        pcVar21 = (char *)0x0;
        do {
          uVar18 = (long)pcVar14 - (long)pcVar21;
          if (0x3fff < uVar18) {
            uVar18 = 0x4000;
          }
          pcVar16 = (char *)(**(code **)(*plVar22 + 0x28))(plVar22,acStack_4058,uVar18);
          if ((long)pcVar16 < 1) {
code_r0x0006e954:
            bVar19 = false;
            if (plStack_40c0 == alStack_40d8) goto code_r0x0006e988;
            goto code_r0x0006e968;
          }
          pcStack_40f8 = pcVar14;
          pcStack_40f0 = pcVar21;
          pcStack_40e8 = pcVar16;
          pcStack_40e0 = acStack_4058;
          if (plStack_40c0 == (long *)0x0) goto code_r0x0006e9e0;
          iVar10 = (**(code **)(*plStack_40c0 + 0x30))
                             (plStack_40c0,&pcStack_40e0,&pcStack_40e8,&pcStack_40f0,&pcStack_40f8);
          if (iVar10 == 0) goto code_r0x0006e954;
          pcVar21 = pcVar16 + (long)pcVar21;
          if (plStack_40a0 != (long *)0x0) {
            pcStack_40e8 = pcVar14;
            pcStack_40e0 = pcVar21;
            iVar10 = (**(code **)(*plStack_40a0 + 0x30))(plStack_40a0,&pcStack_40e0,&pcStack_40e8);
            if (iVar10 == 0) goto code_r0x0006e954;
          }
        } while (pcVar21 < pcVar14);
        bVar19 = true;
        if (plStack_40c0 == alStack_40d8) {
code_r0x0006e988:
          lVar13 = 4;
          plVar20 = alStack_40d8;
code_r0x0006e990:
          (**(code **)(*plVar20 + lVar13 * 8))();
        }
        else {
code_r0x0006e968:
          if (plStack_40c0 != (long *)0x0) {
            lVar13 = 5;
            plVar20 = plStack_40c0;
            goto code_r0x0006e990;
          }
        }
        if (plStack_40a0 == alStack_40b8) {
          lVar13 = 4;
          plVar20 = alStack_40b8;
code_r0x0006e9c0:
          (**(code **)(*plVar20 + lVar13 * 8))();
        }
        else if (plStack_40a0 != (long *)0x0) {
          lVar13 = 5;
          plVar20 = plStack_40a0;
          goto code_r0x0006e9c0;
        }
        if (!bVar19) goto LAB_0006e808;
      }
      goto LAB_0006e7e8;
    }
    pcVar21 = (char *)0x0;
    plVar20 = (long *)plVar11[1];
    do {
      uVar18 = (long)pcVar14 - (long)pcVar21;
      if (pcVar14 < pcVar21 || uVar18 == 0) break;
      if (0x3fff < uVar18) {
        uVar18 = 0x4000;
      }
      lVar13 = (**(code **)(*plVar20 + 0x28))(plVar20,acStack_4058,uVar18);
      pcVar21 = pcVar21 + lVar13;
    } while (0 < lVar13);
    uVar17 = 0x19d;
  }
  else {
    lVar13 = *plVar11;
    lVar1 = plVar11[1];
    plVar12 = (long *)plVar20[3];
    if (plVar12 == (long *)0x0) {
      plStack_4060 = (long *)0x0;
    }
    else if (plVar12 == plVar20) {
      plStack_4060 = alStack_4078;
      (**(code **)(*plVar20 + 0x18))(plVar20,alStack_4078);
    }
    else {
      plStack_4060 = (long *)(**(code **)(*plVar12 + 0x10))();
    }
    bVar9 = func_0x0006eb0c(lVar1,lVar13,alStack_4078);
    plVar20 = plStack_4060;
    if (plStack_4060 == alStack_4078) {
      (**(code **)(alStack_4078[0] + 0x20))();
    }
    else {
joined_r0x0006e7e0:
      if (plVar20 != (long *)0x0) {
        (**(code **)(*plVar20 + 0x28))();
      }
    }
    bVar9 = bVar9 & 1;
joined_r0x0006e67c:
    if ((bool)bVar9 != false) {
LAB_0006e7e8:
      uVar15 = 1;
      goto LAB_0006e818;
    }
LAB_0006e808:
    uVar17 = 400;
  }
  uVar15 = 0;
  *(undefined4 *)plVar11[4] = uVar17;
LAB_0006e818:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return;
  }
  ___stack_chk_fail(uVar15);
code_r0x0006e9e0:
  func_0x00056004();
code_r0x0006e9e4:
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x6e9e8);
  (*pcVar8)();
}

