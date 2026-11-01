
/* WARNING: Possible PIC construction at 0x0006e3a4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006e3a8) */
/* WARNING: Removing unreachable block (ram,0x0006e3c4) */
/* WARNING: Removing unreachable block (ram,0x0006e3b8) */
/* WARNING: Removing unreachable block (ram,0x0006e3bc) */
/* WARNING: Removing unreachable block (ram,0x0006e3cc) */
/* WARNING: Removing unreachable block (ram,0x0006e3d8) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0006e360(void)

{
  long lVar1;
  undefined1 uVar2;
  undefined6 uVar3;
  undefined2 uVar4;
  undefined6 uVar5;
  undefined6 uVar6;
  undefined2 uVar7;
  undefined6 uVar8;
  code *pcVar9;
  byte bVar10;
  int iVar11;
  undefined8 uVar12;
  long *plVar13;
  long *plVar14;
  long lVar15;
  char *pcVar16;
  char *pcVar17;
  undefined4 uVar18;
  ulong uVar19;
  bool bVar20;
  long *unaff_x20;
  undefined4 *unaff_x21;
  long *plVar21;
  char *pcVar22;
  long *plVar23;
  long unaff_x23;
  int *unaff_x24;
  int unaff_w25;
  undefined1 auVar24 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000030;
  long in_stack_00000038;
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
  
  if ((unaff_x23 == 4) && (*unaff_x24 == 0x6474737a)) {
    uVar2 = false;
    *unaff_x21 = 0x19f;
  }
  else {
    uVar2 = true;
  }
  uVar6 = s_Content_Length_008d1a55._0_6_;
  uVar7 = s_Content_Length_008d1a55._6_2_;
  uVar8 = s_Content_Length_008d1a55._8_6_;
  if (unaff_w25 < 0) {
    __ZdlPv();
    uVar6 = s_Content_Length_008d1a55._0_6_;
    uVar7 = s_Content_Length_008d1a55._6_2_;
    uVar8 = s_Content_Length_008d1a55._8_6_;
  }
  s_Content_Length_008d1a55._0_6_ = uVar6;
  s_Content_Length_008d1a55._6_2_ = uVar7;
  s_Content_Length_008d1a55._8_6_ = uVar8;
  if (!(bool)uVar2) {
    s_Content_Length_008d1a55[0] = (char)uVar6;
    s_Content_Length_008d1a55[1] = SUB61(uVar6,1);
    s_Content_Length_008d1a55[2] = SUB61(uVar6,2);
    s_Content_Length_008d1a55[3] = SUB61(uVar6,3);
    s_Content_Length_008d1a55[4] = SUB61(uVar6,4);
    s_Content_Length_008d1a55[5] = SUB61(uVar6,5);
    s_Content_Length_008d1a55[6] = (char)uVar7;
    s_Content_Length_008d1a55[7] = SUB21(uVar7,1);
    s_Content_Length_008d1a55[8] = (char)uVar8;
    s_Content_Length_008d1a55[9] = SUB61(uVar8,1);
    s_Content_Length_008d1a55[10] = SUB61(uVar8,2);
    s_Content_Length_008d1a55[0xb] = SUB61(uVar8,3);
    s_Content_Length_008d1a55[0xc] = SUB61(uVar8,4);
    s_Content_Length_008d1a55[0xd] = SUB61(uVar8,5);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000038) {
      return 0;
    }
    s_Content_Length_008d1a55._0_6_ = uVar6;
    s_Content_Length_008d1a55._6_2_ = uVar7;
    s_Content_Length_008d1a55._8_6_ = uVar8;
    uVar12 = ___stack_chk_fail();
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
      uVar12 = __Unwind_Resume(uVar12);
      if (in_stack_00000030 == unaff_x20) {
        (**(code **)(in_stack_00000018 + 0x20))();
        in_stack_00000030 = (long *)__Unwind_Resume(uVar12);
      }
      if (in_stack_00000030 == (long *)0x0) goto LAB_0006e49c;
    }
    else {
LAB_0006e49c:
      in_stack_00000030 = (long *)__Unwind_Resume(uVar12);
    }
    (**(code **)(*in_stack_00000030 + 0x28))();
    __Unwind_Resume(uVar12);
  }
  auVar24 = (*(code *)PTR____chkstk_darwin_009b01d8)();
  plVar21 = auVar24._8_8_;
  plVar13 = auVar24._0_8_;
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  iVar11 = func_0x000692e4(*plVar13 + 0x48);
  uVar8 = s_Content_Length_008d1a55._8_6_;
  uVar7 = s_Content_Length_008d1a55._6_2_;
  uVar6 = s_Content_Length_008d1a55._0_6_;
  if (iVar11 == 0) {
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
    lVar15 = func_0x00063e9c(*plVar13 + 0x48,acStack_4058);
    uVar3 = s_Content_Length_008d1a55._0_6_;
    uVar4 = s_Content_Length_008d1a55._6_2_;
    uVar5 = s_Content_Length_008d1a55._8_6_;
    if (cStack_4041 < '\0') {
      __ZdlPv(CONCAT26(acStack_4052,acStack_4058));
      uVar3 = s_Content_Length_008d1a55._0_6_;
      uVar4 = s_Content_Length_008d1a55._6_2_;
      uVar5 = s_Content_Length_008d1a55._8_6_;
    }
    s_Content_Length_008d1a55._0_6_ = uVar3;
    s_Content_Length_008d1a55._6_2_ = uVar4;
    s_Content_Length_008d1a55._8_6_ = uVar5;
    if (lVar15 == 0) {
      plVar23 = (long *)plVar13[1];
      plVar14 = (long *)plVar21[3];
      if (plVar14 == (long *)0x0) {
        plStack_4080 = (long *)0x0;
      }
      else if (plVar14 == plVar21) {
        plStack_4080 = alStack_4098;
        (**(code **)(*plVar21 + 0x18))(plVar21,alStack_4098);
      }
      else {
        plStack_4080 = (long *)(**(code **)(*plVar14 + 0x10))();
      }
      pcVar16 = (char *)(**(code **)(*plVar23 + 0x28))(plVar23,acStack_4058,0x4000);
      bVar10 = pcVar16 == (char *)0x0;
      if (0 < (long)pcVar16) {
        bVar10 = false;
        pcVar22 = (char *)0x0;
        do {
          pcStack_40f8 = (char *)0x0;
          pcStack_40f0 = pcVar22;
          pcStack_40e8 = pcVar16;
          pcStack_40e0 = acStack_4058;
          if (plStack_4080 == (long *)0x0) {
            func_0x00056004();
            goto code_r0x0006e9e4;
          }
          uVar19 = (**(code **)(*plStack_4080 + 0x30))
                             (plStack_4080,&pcStack_40e0,&pcStack_40e8,&pcStack_40f0,&pcStack_40f8);
          if ((uVar19 & 1) == 0) break;
          pcVar17 = (char *)(**(code **)(*plVar23 + 0x28))(plVar23,acStack_4058,0x4000);
          pcVar22 = pcVar22 + (long)pcVar16;
          bVar10 = pcVar17 == (char *)0x0;
          pcVar16 = pcVar17;
        } while (0 < (long)pcVar17);
      }
      plVar21 = plStack_4080;
      if (plStack_4080 != alStack_4098) goto joined_r0x0006e7e0;
      (**(code **)(alStack_4098[0] + 0x20))();
      goto joined_r0x0006e67c;
    }
    cStack_40f9 = '\0';
    cStack_4041 = '\x0e';
    s_Content_Length_008d1a55[0] = (char)uVar6;
    s_Content_Length_008d1a55[1] = SUB61(uVar6,1);
    s_Content_Length_008d1a55[2] = SUB61(uVar6,2);
    s_Content_Length_008d1a55[3] = SUB61(uVar6,3);
    s_Content_Length_008d1a55[4] = SUB61(uVar6,4);
    s_Content_Length_008d1a55[5] = SUB61(uVar6,5);
    acStack_4058[0] = s_Content_Length_008d1a55[0];
    acStack_4058[1] = s_Content_Length_008d1a55[1];
    acStack_4058[2] = s_Content_Length_008d1a55[2];
    acStack_4058[3] = s_Content_Length_008d1a55[3];
    acStack_4058[4] = s_Content_Length_008d1a55[4];
    acStack_4058[5] = s_Content_Length_008d1a55[5];
    s_Content_Length_008d1a55[6] = (char)uVar7;
    s_Content_Length_008d1a55[7] = SUB21(uVar7,1);
    acStack_4052[0] = s_Content_Length_008d1a55[6];
    acStack_4052[1] = s_Content_Length_008d1a55[7];
    s_Content_Length_008d1a55[8] = (char)uVar8;
    s_Content_Length_008d1a55[9] = SUB61(uVar8,1);
    s_Content_Length_008d1a55[10] = SUB61(uVar8,2);
    s_Content_Length_008d1a55[0xb] = SUB61(uVar8,3);
    s_Content_Length_008d1a55[0xc] = SUB61(uVar8,4);
    s_Content_Length_008d1a55[0xd] = SUB61(uVar8,5);
    acStack_4050[0] = s_Content_Length_008d1a55[8];
    acStack_4050[1] = s_Content_Length_008d1a55[9];
    acStack_4050[2] = s_Content_Length_008d1a55[10];
    acStack_4050[3] = s_Content_Length_008d1a55[0xb];
    acStack_4050[4] = s_Content_Length_008d1a55[0xc];
    acStack_4050[5] = s_Content_Length_008d1a55[0xd];
    uStack_404a = 0;
    pcVar16 = (char *)func_0x00069608(*plVar13 + 0x48,acStack_4058,0xffffffffffffffff,0,&cStack_40f9
                                     );
    if (cStack_4041 < '\0') {
      __ZdlPv(CONCAT26(acStack_4052,acStack_4058));
      if (cStack_40f9 == '\0') goto code_r0x0006e694;
      goto code_r0x0006e808;
    }
    if (cStack_40f9 != '\0') goto code_r0x0006e808;
code_r0x0006e694:
    if (pcVar16 <= *(char **)plVar13[2]) {
      if (pcVar16 != (char *)0x0) {
        plVar23 = (long *)plVar13[1];
        plVar14 = (long *)plVar13[3] + 3;
        plStack_40a0 = (long *)*plVar14;
        if (plStack_40a0 == (long *)0x0) {
          plStack_40a0 = (long *)0x0;
        }
        else if (plStack_40a0 == (long *)plVar13[3]) {
          plStack_40a0 = alStack_40b8;
          (**(code **)(*(long *)*plVar14 + 0x18))((long *)*plVar14,alStack_40b8);
        }
        else {
          *plVar14 = 0;
        }
        plVar14 = (long *)plVar21[3];
        plStack_40c0 = (long *)0x0;
        if (plVar14 != (long *)0x0) {
          if (plVar14 == plVar21) {
            plStack_40c0 = alStack_40d8;
            (**(code **)(*plVar21 + 0x18))(plVar21,alStack_40d8);
          }
          else {
            plStack_40c0 = (long *)(**(code **)(*plVar14 + 0x10))();
          }
        }
        pcVar22 = (char *)0x0;
        do {
          uVar19 = (long)pcVar16 - (long)pcVar22;
          if (0x3fff < uVar19) {
            uVar19 = 0x4000;
          }
          pcVar17 = (char *)(**(code **)(*plVar23 + 0x28))(plVar23,acStack_4058,uVar19);
          if ((long)pcVar17 < 1) {
code_r0x0006e954:
            bVar20 = false;
            if (plStack_40c0 == alStack_40d8) goto code_r0x0006e988;
            goto code_r0x0006e968;
          }
          pcStack_40f8 = pcVar16;
          pcStack_40f0 = pcVar22;
          pcStack_40e8 = pcVar17;
          pcStack_40e0 = acStack_4058;
          if (plStack_40c0 == (long *)0x0) goto code_r0x0006e9e0;
          iVar11 = (**(code **)(*plStack_40c0 + 0x30))
                             (plStack_40c0,&pcStack_40e0,&pcStack_40e8,&pcStack_40f0,&pcStack_40f8);
          if (iVar11 == 0) goto code_r0x0006e954;
          pcVar22 = pcVar17 + (long)pcVar22;
          if (plStack_40a0 != (long *)0x0) {
            pcStack_40e8 = pcVar16;
            pcStack_40e0 = pcVar22;
            iVar11 = (**(code **)(*plStack_40a0 + 0x30))(plStack_40a0,&pcStack_40e0,&pcStack_40e8);
            if (iVar11 == 0) goto code_r0x0006e954;
          }
        } while (pcVar22 < pcVar16);
        bVar20 = true;
        if (plStack_40c0 == alStack_40d8) {
code_r0x0006e988:
          lVar15 = 4;
          plVar21 = alStack_40d8;
code_r0x0006e990:
          (**(code **)(*plVar21 + lVar15 * 8))();
        }
        else {
code_r0x0006e968:
          if (plStack_40c0 != (long *)0x0) {
            lVar15 = 5;
            plVar21 = plStack_40c0;
            goto code_r0x0006e990;
          }
        }
        if (plStack_40a0 == alStack_40b8) {
          lVar15 = 4;
          plVar21 = alStack_40b8;
code_r0x0006e9c0:
          (**(code **)(*plVar21 + lVar15 * 8))();
        }
        else if (plStack_40a0 != (long *)0x0) {
          lVar15 = 5;
          plVar21 = plStack_40a0;
          goto code_r0x0006e9c0;
        }
        if (!bVar20) goto code_r0x0006e808;
      }
      goto code_r0x0006e7e8;
    }
    pcVar22 = (char *)0x0;
    plVar21 = (long *)plVar13[1];
    do {
      uVar19 = (long)pcVar16 - (long)pcVar22;
      if (pcVar16 < pcVar22 || uVar19 == 0) break;
      if (0x3fff < uVar19) {
        uVar19 = 0x4000;
      }
      lVar15 = (**(code **)(*plVar21 + 0x28))(plVar21,acStack_4058,uVar19);
      pcVar22 = pcVar22 + lVar15;
    } while (0 < lVar15);
    uVar18 = 0x19d;
  }
  else {
    lVar15 = *plVar13;
    lVar1 = plVar13[1];
    plVar14 = (long *)plVar21[3];
    if (plVar14 == (long *)0x0) {
      plStack_4060 = (long *)0x0;
    }
    else if (plVar14 == plVar21) {
      plStack_4060 = alStack_4078;
      (**(code **)(*plVar21 + 0x18))(plVar21,alStack_4078);
    }
    else {
      plStack_4060 = (long *)(**(code **)(*plVar14 + 0x10))();
    }
    bVar10 = func_0x0006eb0c(lVar1,lVar15,alStack_4078);
    plVar21 = plStack_4060;
    if (plStack_4060 == alStack_4078) {
      (**(code **)(alStack_4078[0] + 0x20))();
    }
    else {
joined_r0x0006e7e0:
      if (plVar21 != (long *)0x0) {
        (**(code **)(*plVar21 + 0x28))();
      }
    }
    bVar10 = bVar10 & 1;
joined_r0x0006e67c:
    if ((bool)bVar10 != false) {
code_r0x0006e7e8:
      uVar12 = 1;
      goto code_r0x0006e818;
    }
code_r0x0006e808:
    uVar18 = 400;
  }
  uVar12 = 0;
  *(undefined4 *)plVar13[4] = uVar18;
code_r0x0006e818:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return uVar12;
  }
  ___stack_chk_fail(uVar12);
code_r0x0006e9e0:
  func_0x00056004();
code_r0x0006e9e4:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x6e9e8);
  (*pcVar9)();
}

