
/* WARNING: Removing unreachable block (ram,0x00068bac) */

undefined8 * FUN_00068aa4(void)

{
  undefined *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  char cVar6;
  undefined8 *puVar7;
  long *plVar8;
  int iVar9;
  undefined8 *puVar10;
  long *plVar11;
  undefined8 uVar12;
  long *plVar13;
  long lVar14;
  ulong uVar15;
  long *plVar16;
  long unaff_x19;
  long unaff_x20;
  ulong uVar17;
  uint uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  long unaff_x29;
  char cStack0000000000000000;
  char cStack0000000000000001;
  char cStack0000000000000002;
  char cStack0000000000000003;
  char cStack0000000000000004;
  char cStack0000000000000005;
  char cStack0000000000000006;
  char cStack0000000000000007;
  undefined8 in_stack_00000010;
  long lStack0000000000000018;
  ulong in_stack_00000020;
  undefined8 in_stack_00000028;
  long lStack0000000000000040;
  long *plStack0000000000000058;
  long lStack0000000000000060;
  long *in_stack_00000078;
  long lStack0000000000000080;
  long *in_stack_00000098;
  
  plVar13 = &lStack0000000000000040;
  plStack0000000000000058 = plVar13;
  puVar10 = (undefined8 *)func_0x00069e20();
  if (plStack0000000000000058 == plVar13) {
    lVar14 = 4;
    plVar11 = &lStack0000000000000040;
LAB_00068af0:
    (**(code **)(*plVar11 + lVar14 * 8))();
  }
  else if (plStack0000000000000058 != (long *)0x0) {
    lVar14 = 5;
    plVar11 = plStack0000000000000058;
    goto LAB_00068af0;
  }
  if (in_stack_00000078 == &lStack0000000000000060) {
    lVar14 = 4;
    plVar11 = &lStack0000000000000060;
LAB_00068b20:
    (**(code **)(*plVar11 + lVar14 * 8))();
  }
  else if (in_stack_00000078 != (long *)0x0) {
    lVar14 = 5;
    plVar11 = in_stack_00000078;
    goto LAB_00068b20;
  }
  if (in_stack_00000098 == &lStack0000000000000080) {
    lVar14 = 4;
    plVar11 = &lStack0000000000000080;
LAB_00068b50:
    (**(code **)(*plVar11 + lVar14 * 8))();
  }
  else if (in_stack_00000098 != (long *)0x0) {
    lVar14 = 5;
    plVar11 = in_stack_00000098;
    goto LAB_00068b50;
  }
  if ((int)puVar10 != 0) {
    in_stack_00000010._7_1_ = '\f';
    cStack0000000000000000 = s_Content_Type_008d186c[0];
    cStack0000000000000001 = s_Content_Type_008d186c[1];
    cStack0000000000000002 = s_Content_Type_008d186c[2];
    cStack0000000000000003 = s_Content_Type_008d186c[3];
    cStack0000000000000004 = s_Content_Type_008d186c[4];
    cStack0000000000000005 = s_Content_Type_008d186c[5];
    cStack0000000000000006 = s_Content_Type_008d186c[6];
    cStack0000000000000007 = s_Content_Type_008d186c[7];
    func_0x0005cc80(&lStack0000000000000018);
    uVar18 = (uint)(char)in_stack_00000028._7_1_;
    plVar13 = (long *)lStack0000000000000018;
    uVar15 = in_stack_00000020;
    if (-1 < (int)uVar18) {
      plVar13 = &lStack0000000000000018;
      uVar15 = (ulong)in_stack_00000028._7_1_;
    }
    if (0x20 < (long)uVar15) {
      plVar16 = (long *)((long)plVar13 + uVar15);
      plVar11 = plVar13;
      while (plVar11 = (long *)_memchr(plVar11,0x61,uVar15 - 0x20), plVar11 != (long *)0x0) {
        if ((((*plVar11 == 0x746163696c707061 && plVar11[1] == 0x77772d782f6e6f69) &&
             plVar11[2] == 0x752d6d726f662d77) && plVar11[3] == 0x65646f636e656c72) &&
            (char)plVar11[4] == 'd') {
          puVar10 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
          if ((plVar11 != plVar16) && (plVar11 == plVar13)) {
            bVar5 = *(byte *)(unaff_x19 + 0x87);
            if (((char)bVar5 < '\0') && (&UNK_00002001 <= *(undefined **)(unaff_x19 + 0x78))) {
              puVar10 = (undefined8 *)0x0;
              *(undefined4 *)(unaff_x20 + 0x18) = 0x19d;
            }
            else {
              puVar1 = *(undefined **)(unaff_x19 + 0x78);
              puVar7 = *(undefined8 **)(unaff_x19 + 0x70);
              if (-1 < (char)bVar5) {
                puVar1 = (undefined *)(ulong)bVar5;
                puVar7 = (undefined8 *)(unaff_x19 + 0x70);
              }
              func_0x000606e0(puVar7,puVar1,unaff_x19 + 0x30);
              uVar18 = (uint)in_stack_00000028._7_1_;
            }
          }
          goto LAB_00068c6c;
        }
        plVar11 = (long *)((long)plVar11 + 1);
        uVar15 = (long)plVar16 - (long)plVar11;
        if ((long)uVar15 < 0x21) break;
      }
    }
    puVar10 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
LAB_00068c6c:
    if ((uVar18 >> 7 & 1) != 0) {
      __ZdlPv(lStack0000000000000018);
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return puVar10;
  }
  uVar12 = ___stack_chk_fail();
  if (-1 < (char)in_stack_00000028._7_1_) goto LAB_00068df0;
  __ZdlPv(lStack0000000000000018);
  uVar12 = __Unwind_Resume(uVar12);
  if (-1 < in_stack_00000010._7_1_) goto LAB_00068df0;
  __ZdlPv(_cStack0000000000000000);
  uVar12 = __Unwind_Resume(uVar12);
  if (plStack0000000000000058 == plVar13) {
    lVar14 = 4;
    plVar13 = &lStack0000000000000040;
LAB_00068d74:
    (**(code **)(*plVar13 + lVar14 * 8))();
  }
  else if (plStack0000000000000058 != (long *)0x0) {
    lVar14 = 5;
    plVar13 = plStack0000000000000058;
    goto LAB_00068d74;
  }
  if (in_stack_00000078 == &lStack0000000000000060) {
    lVar14 = 4;
    plVar13 = &lStack0000000000000060;
LAB_00068da4:
    (**(code **)(*plVar13 + lVar14 * 8))();
  }
  else if (in_stack_00000078 != (long *)0x0) {
    lVar14 = 5;
    plVar13 = in_stack_00000078;
    goto LAB_00068da4;
  }
  if (in_stack_00000098 == &lStack0000000000000080) {
    lVar14 = 4;
    plVar13 = &lStack0000000000000080;
  }
  else {
    if (in_stack_00000098 == (long *)0x0) goto LAB_00068df0;
    lVar14 = 5;
    plVar13 = in_stack_00000098;
  }
  (**(code **)(*plVar13 + lVar14 * 8))();
LAB_00068df0:
  plVar13 = (long *)__Unwind_Resume(uVar12);
  bVar5 = *(byte *)((long)plVar13 + 0x17);
  uVar19 = (ulong)bVar5;
  uVar20 = plVar13[1];
  uVar15 = 0;
  uVar2 = uVar20;
  if (-1 < (char)bVar5) {
    uVar2 = uVar19;
  }
  if (uVar2 == 0) {
code_r0x00068e64:
    if (uVar15 < uVar2) {
      lVar14 = 0;
      plVar16 = (long *)*plVar13;
      plVar11 = plVar16;
      if (-1 < (char)bVar5) {
        plVar11 = plVar13;
      }
      do {
        uVar21 = uVar15;
        if (uVar15 < uVar2) {
          do {
            cVar6 = *(char *)((long)plVar11 + uVar21);
            if (cVar6 == '\0') {
              return (undefined8 *)0x0;
            }
            if (cVar6 == '/') goto code_r0x00068ed0;
            if (cVar6 == '\\') {
              return (undefined8 *)0x0;
            }
            uVar21 = uVar21 + 1;
          } while (uVar2 != uVar21);
          uVar21 = uVar2;
        }
code_r0x00068ed0:
        uVar4 = uVar20;
        plVar8 = plVar16;
        if (-1 < (char)bVar5) {
          uVar4 = uVar19;
          plVar8 = plVar13;
        }
        if (uVar4 < uVar15) {
code_r0x00068ff8:
          puVar10 = (undefined8 *)func_0x00049dd0(plVar13);
          *puVar10 = &UNK_009b8b58;
          plVar13 = (long *)puVar10[2];
          if (plVar13 != (long *)0x0) {
            LOAcquire();
            lVar14 = plVar13[1];
            plVar13[1] = lVar14 + -1;
            LORelease();
            if (lVar14 == 0) {
              (**(code **)(*plVar13 + 0x10))(plVar13);
              __ZNSt3__119__shared_weak_count14__release_weakEv(plVar13);
              return puVar10;
            }
          }
          return puVar10;
        }
        uVar17 = uVar21 - uVar15;
        uVar3 = uVar4 - uVar15;
        if (uVar17 <= uVar4 - uVar15) {
          uVar3 = uVar17;
        }
        iVar9 = _memcmp((long)plVar8 + uVar15,".",uVar3 != 0);
        if ((uVar3 != 1) || (iVar9 != 0)) {
          uVar4 = uVar20;
          plVar8 = plVar16;
          if (-1 < (char)bVar5) {
            uVar4 = uVar19;
            plVar8 = plVar13;
          }
          if (uVar4 < uVar15) goto code_r0x00068ff8;
          uVar3 = uVar4 - uVar15;
          if (uVar17 <= uVar4 - uVar15) {
            uVar3 = uVar17;
          }
          uVar4 = uVar3;
          if (1 < uVar3) {
            uVar4 = 2;
          }
          iVar9 = _memcmp((long)plVar8 + uVar15,"..",uVar4);
          if ((uVar3 == 2) && (iVar9 == 0)) {
            if (lVar14 == 0) {
              return (undefined8 *)0x0;
            }
            lVar14 = lVar14 + -1;
          }
          else {
            lVar14 = lVar14 + 1;
          }
        }
        if (uVar21 < uVar2) {
          while (*(char *)((long)plVar11 + uVar21) == '/') {
            uVar21 = uVar21 + 1;
            if (uVar2 == uVar21) goto code_r0x00068fcc;
          }
        }
        uVar15 = uVar21;
        if (uVar2 <= uVar21) {
          s_Content_Type_008d186c[0] = s_Content_Type_008d186c[0];
          s_Content_Type_008d186c[1] = s_Content_Type_008d186c[1];
          s_Content_Type_008d186c[2] = s_Content_Type_008d186c[2];
          s_Content_Type_008d186c[3] = s_Content_Type_008d186c[3];
          s_Content_Type_008d186c[4] = s_Content_Type_008d186c[4];
          s_Content_Type_008d186c[5] = s_Content_Type_008d186c[5];
          s_Content_Type_008d186c[6] = s_Content_Type_008d186c[6];
          s_Content_Type_008d186c[7] = s_Content_Type_008d186c[7];
          return (undefined8 *)((long)&MACH_HEADER.magic + 1);
        }
      } while( true );
    }
  }
  else {
    plVar11 = (long *)*plVar13;
    if (-1 < (char)bVar5) {
      plVar11 = plVar13;
    }
    do {
      if (*(char *)((long)plVar11 + uVar15) != '/') goto code_r0x00068e64;
      uVar15 = uVar15 + 1;
    } while (uVar2 != uVar15);
  }
code_r0x00068fcc:
  return (undefined8 *)((long)&MACH_HEADER.magic + 1);
}

