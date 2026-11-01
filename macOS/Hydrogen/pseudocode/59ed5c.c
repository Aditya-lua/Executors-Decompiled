
void FUN_0059ed5c(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  dword *pdVar7;
  ulong uVar8;
  ulong *extraout_x8;
  undefined8 *puVar9;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined1 uStack0000000000000008;
  ulong uStack_e8;
  dword *pdStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  ulong uStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  
  uVar4 = func_0x007a1f00();
  func_0x0059e200(&uStack0000000000000008);
  __Unwind_Resume(uVar4);
  lVar5 = func_0x007a2668();
  uVar13 = *(ulong *)(lVar5 + 0x10);
  uVar11 = uVar13 * 0x10;
  if (uVar13 >> 0x3c == 0 && uVar11 < 0x7ffffffffffffff9) {
    if (uVar11 == 0) {
      uStack_58 = 0;
      uStack_50 = 8;
LAB_0059ee34:
      extraout_x8[1] = uStack_50;
      *extraout_x8 = uStack_58;
      extraout_x8[2] = uVar13;
      return;
    }
    puVar14 = *(undefined8 **)(lVar5 + 8);
    uVar4 = 8;
    uStack_50 = func_0x00187bd0(uVar11,8);
    if (uStack_50 != 0) {
      uStack_58 = uVar13;
      if (uVar13 != 0) {
        uVar12 = 0;
        puVar9 = (undefined8 *)(uStack_50 + 8);
        do {
          if (uVar11 == 0) break;
          uVar4 = *puVar14;
          plVar10 = (long *)puVar14[1];
          lVar5 = *plVar10;
          *plVar10 = lVar5 + 1;
          if (lVar5 < 0) {
            func_0x007a05dc();
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x59ee60);
            (*pcVar2)();
          }
          uVar12 = uVar12 + 1;
          puVar14 = puVar14 + 2;
          puVar9[-1] = uVar4;
          *puVar9 = plVar10;
          uVar11 = uVar11 - 0x10;
          puVar9 = puVar9 + 2;
        } while (uVar13 != uVar12);
      }
      goto LAB_0059ee34;
    }
  }
  else {
    uVar4 = 0;
  }
  uVar6 = func_0x007a1f00(uVar4,uVar11,&UNK_009f1b50);
  uStack_48 = uVar4;
  func_0x0059e480(&uStack_58);
  __Unwind_Resume(uVar6);
  lVar5 = func_0x007a2668();
  uVar4 = 0;
  uVar13 = *(ulong *)(lVar5 + 0x10);
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar13;
  uVar11 = uVar13 * 0x30;
  if ((SUB168(auVar1 * ZEXT816(0x30),8) == 0) && (uVar11 < 0x7ffffffffffffff9)) {
    if (uVar11 == 0) {
      uStack_e8 = 0;
      pdStack_e0 = &MACH_HEADER.cpusubtype;
code_r0x0059ef58:
      extraout_x8_00[1] = (ulong)pdStack_e0;
      *extraout_x8_00 = uStack_e8;
      extraout_x8_00[2] = uVar13;
      return;
    }
    lVar5 = *(long *)(lVar5 + 8);
    uVar4 = 8;
    pdVar7 = (dword *)func_0x00187bd0(uVar11,8);
    if (pdVar7 != (dword *)0x0) {
      uStack_e8 = uVar13;
      pdStack_e0 = pdVar7;
      if (uVar13 != 0) {
        uVar12 = 0;
        do {
          if (uVar11 == 0) break;
          func_0x005a51dc(&uStack_d0,lVar5);
          uVar12 = uVar12 + 1;
          lVar5 = lVar5 + 0x30;
          *(undefined8 *)(pdVar7 + 2) = uStack_c8;
          *(undefined8 *)pdVar7 = uStack_d0;
          *(undefined8 *)(pdVar7 + 6) = uStack_b8;
          *(undefined8 *)(pdVar7 + 4) = uStack_c0;
          *(undefined8 *)(pdVar7 + 10) = uStack_a8;
          *(undefined8 *)(pdVar7 + 8) = uStack_b0;
          uVar11 = uVar11 - 0x30;
          pdVar7 = pdVar7 + 0xc;
        } while (uVar13 != uVar12);
      }
      goto code_r0x0059ef58;
    }
  }
  uVar6 = func_0x007a1f00(uVar4,uVar11,&UNK_009f1b50);
  uStack_d8 = uVar4;
  func_0x0059e598(&uStack_e8);
  __Unwind_Resume(uVar6);
  lVar5 = func_0x007a2668();
  uVar13 = *(ulong *)(lVar5 + 0x10);
  uVar11 = uVar13 * 4;
  if (uVar13 >> 0x3e == 0 && uVar11 < 0x7ffffffffffffffd) {
    uVar6 = *(undefined8 *)(lVar5 + 8);
    if (uVar11 == 0) {
      uVar12 = 0;
      uVar8 = 4;
    }
    else {
      uVar4 = 4;
      uVar8 = func_0x00187bd0(uVar11,4);
      if (uVar8 == 0) goto code_r0x0059f04c;
      uVar12 = uVar13;
    }
    _memcpy(uVar8,uVar6,uVar11);
    *extraout_x8_01 = uVar12;
    extraout_x8_01[1] = uVar8;
    extraout_x8_01[2] = uVar13;
    return;
  }
  uVar4 = 0;
code_r0x0059f04c:
  lVar5 = func_0x007a1f00(uVar4,uVar11,&UNK_009f1b38);
  if (*(long *)(lVar5 + 0x10) != 0) {
    puVar14 = *(undefined8 **)(lVar5 + 8);
    lVar5 = 1 - *(long *)(lVar5 + 0x10);
    do {
      plVar10 = (long *)*puVar14;
      if (plVar10 != (long *)0x0) {
        lVar3 = *plVar10;
        *plVar10 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          func_0x005d2c74(puVar14);
        }
      }
      puVar14 = puVar14 + 3;
      lVar5 = lVar5 + 1;
    } while (lVar5 != 1);
  }
  return;
}

