
void FUN_001a20f8(void)

{
  undefined1 uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  code *pcVar4;
  long lVar5;
  dword *pdVar6;
  undefined8 uVar7;
  long lVar8;
  long *plVar9;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  long *plVar10;
  long *plVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  long lVar19;
  undefined8 uStack_138;
  long lStack_130;
  ulong uStack_108;
  ulong uStack_100;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  ulong uStack_70;
  dword *pdStack_68;
  long lStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x001a1118();
  lVar5 = __Unwind_Resume();
  lVar15 = 0;
  uVar17 = *(ulong *)(lVar5 + 0x10);
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar17;
  uVar12 = uVar17 * 0x18;
  if ((SUB168(auVar2 * ZEXT816(0x18),8) == 0) && (uVar12 < 0x7ffffffffffffff9)) {
    if (uVar12 == 0) {
      uStack_70 = 0;
      pdStack_68 = &MACH_HEADER.cpusubtype;
LAB_001a21c8:
      extraout_x8[1] = (ulong)pdStack_68;
      *extraout_x8 = uStack_70;
      extraout_x8[2] = uVar17;
      return;
    }
    lVar5 = *(long *)(lVar5 + 8);
    lVar15 = 8;
    pdVar6 = (dword *)func_0x00187bd0(uVar12,8);
    if (pdVar6 != (dword *)0x0) {
      uStack_70 = uVar17;
      pdStack_68 = pdVar6;
      if (uVar17 != 0) {
        uVar16 = 0;
        do {
          if (uVar12 == 0) break;
          func_0x0045cd08(&uStack_58,lVar5);
          uVar16 = uVar16 + 1;
          lVar5 = lVar5 + 0x18;
          *(undefined8 *)(pdVar6 + 2) = uStack_50;
          *(undefined8 *)pdVar6 = uStack_58;
          *(undefined8 *)(pdVar6 + 4) = uStack_48;
          uVar12 = uVar12 - 0x18;
          pdVar6 = pdVar6 + 6;
        } while (uVar17 != uVar16);
      }
      goto LAB_001a21c8;
    }
  }
  uVar7 = func_0x007a1f00(lVar15,uVar12,&UNK_009c24a8);
  lStack_60 = lVar15;
  func_0x0016b01c(&uStack_70);
  lVar5 = __Unwind_Resume(uVar7);
  uVar7 = 0;
  uVar17 = *(ulong *)(lVar5 + 0x10);
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar17;
  uVar12 = uVar17 * 0x28;
  if ((SUB168(auVar3 * ZEXT816(0x28),8) != 0) || (0x7ffffffffffffff8 < uVar12)) {
LAB_001a2468:
    func_0x007a1f00(uVar7,uVar12,&UNK_009c24a8);
LAB_001a247c:
    uStack_138 = 0;
code_r0x001a2484:
    func_0x007a1f00(uStack_138,lStack_130,&UNK_009c24c0);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x1a249c);
    (*pcVar4)();
  }
  if (uVar12 == 0) {
    uStack_108 = 0;
    uStack_100 = 8;
  }
  else {
    plVar10 = *(long **)(lVar5 + 8);
    uVar7 = 8;
    uStack_100 = func_0x00187bd0(uVar12,8);
    if (uStack_100 == 0) goto LAB_001a2468;
    uStack_108 = uVar17;
    if (uVar17 != 0) {
      uVar14 = 0;
      uVar16 = 0;
      uStack_138 = 1;
      plVar11 = plVar10;
      do {
        if (uVar12 == uVar14) break;
        lVar5 = plVar11[4];
        uVar1 = *(undefined1 *)((long)plVar11 + 0x21);
        lVar13 = *plVar11;
        if (lVar13 == 0) {
          plVar9 = (long *)((long)plVar10 + uVar14 + 8);
          if (*plVar9 == -0x8000000000000000) {
            lStack_e8 = *(long *)((long)plVar10 + uVar14 + 0x10);
            lStack_f0 = *plVar9;
            lStack_e0 = *(long *)((long)plVar10 + uVar14 + 0x18);
          }
          else {
            func_0x0045cd08(&lStack_f0);
          }
          lVar8 = lStack_e8;
          lVar19 = lStack_e0;
          lVar18 = lStack_f0;
        }
        else {
          if (lVar13 == 1) {
            lVar19 = *(long *)((long)plVar10 + uVar14 + 0x18);
            if (lVar19 < 0) {
              uStack_138 = 0;
              lStack_130 = lVar15;
              goto code_r0x001a2484;
            }
            uVar7 = *(undefined8 *)((long)plVar10 + uVar14 + 0x10);
            if (lVar19 == 0) {
              lVar8 = 1;
            }
            else {
              lVar8 = func_0x00187bd0(lVar19,1);
              if (lVar8 == 0) goto LAB_001a2460;
            }
            _memcpy(lVar8,uVar7,lVar19);
            lVar15 = lVar8;
          }
          else {
            if (*(long *)((long)plVar10 + uVar14 + 8) == -0x8000000000000000) {
              lVar8 = *(long *)((long)plVar10 + uVar14 + 0x10);
              lVar19 = *(long *)((long)plVar10 + uVar14 + 0x18);
              lVar18 = -0x8000000000000000;
              goto LAB_001a22cc;
            }
            lVar19 = *(long *)((long)plVar10 + uVar14 + 0x18);
            if (lVar19 < 0) goto LAB_001a247c;
            uVar7 = *(undefined8 *)((long)plVar10 + uVar14 + 0x10);
            if (lVar19 == 0) {
              lVar8 = 1;
            }
            else {
              lVar8 = func_0x00187bd0(lVar19,1);
              if (lVar8 == 0) {
LAB_001a2460:
                lStack_130 = lVar19;
                goto code_r0x001a2484;
              }
            }
            _memcpy(lVar8,uVar7,lVar19);
            lStack_130 = lVar8;
          }
          lVar18 = lVar19;
        }
LAB_001a22cc:
        plVar11 = plVar11 + 5;
        uVar16 = uVar16 + 1;
        plVar9 = (long *)(uStack_100 + uVar14);
        *plVar9 = lVar13;
        plVar9[1] = lVar18;
        plVar9[2] = lVar8;
        plVar9[3] = lVar19;
        *(char *)(plVar9 + 4) = (char)lVar5;
        uVar14 = uVar14 + 0x28;
        *(undefined1 *)((long)plVar9 + 0x21) = uVar1;
      } while (uVar17 != uVar16);
    }
  }
  extraout_x8_00[1] = uStack_100;
  *extraout_x8_00 = uStack_108;
  extraout_x8_00[2] = uVar17;
  return;
}

