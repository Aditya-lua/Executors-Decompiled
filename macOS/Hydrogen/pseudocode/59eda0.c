
void FUN_0059eda0(ulong *param_1,long param_2)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  dword *pdVar7;
  undefined8 *puVar8;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  long *plVar9;
  ulong uVar10;
  undefined8 uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong uStack_88;
  dword *pdStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  uVar13 = *(ulong *)(param_2 + 0x10);
  uVar10 = uVar13 * 0x10;
  if (uVar13 >> 0x3c == 0 && uVar10 < 0x7ffffffffffffff9) {
    if (uVar10 == 0) {
      uStack0000000000000008 = 0;
      in_stack_00000010 = 8;
LAB_0059ee34:
      param_1[1] = in_stack_00000010;
      *param_1 = uStack0000000000000008;
      param_1[2] = uVar13;
      return;
    }
    puVar14 = *(undefined8 **)(param_2 + 8);
    uVar11 = 8;
    uVar5 = func_0x00187bd0(uVar10,8);
    if (uVar5 != 0) {
      uStack0000000000000008 = uVar13;
      in_stack_00000010 = uVar5;
      if (uVar13 != 0) {
        uVar12 = 0;
        puVar8 = (undefined8 *)(uVar5 + 8);
        do {
          if (uVar10 == 0) break;
          uVar11 = *puVar14;
          plVar9 = (long *)puVar14[1];
          lVar3 = *plVar9;
          *plVar9 = lVar3 + 1;
          if (lVar3 < 0) {
            func_0x007a05dc();
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x59ee60);
            (*pcVar2)();
          }
          uVar12 = uVar12 + 1;
          puVar14 = puVar14 + 2;
          puVar8[-1] = uVar11;
          *puVar8 = plVar9;
          uVar10 = uVar10 - 0x10;
          puVar8 = puVar8 + 2;
        } while (uVar13 != uVar12);
      }
      goto LAB_0059ee34;
    }
  }
  else {
    uVar11 = 0;
  }
  uVar6 = func_0x007a1f00(uVar11,uVar10,&UNK_009f1b50);
  in_stack_00000018 = uVar11;
  func_0x0059e480(&uStack0000000000000008);
  __Unwind_Resume(uVar6);
  lVar3 = func_0x007a2668();
  uVar11 = 0;
  uVar13 = *(ulong *)(lVar3 + 0x10);
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar13;
  uVar10 = uVar13 * 0x30;
  if ((SUB168(auVar1 * ZEXT816(0x30),8) == 0) && (uVar10 < 0x7ffffffffffffff9)) {
    if (uVar10 == 0) {
      uStack_88 = 0;
      pdStack_80 = &MACH_HEADER.cpusubtype;
code_r0x0059ef58:
      extraout_x8[1] = (ulong)pdStack_80;
      *extraout_x8 = uStack_88;
      extraout_x8[2] = uVar13;
      return;
    }
    lVar3 = *(long *)(lVar3 + 8);
    uVar11 = 8;
    pdVar7 = (dword *)func_0x00187bd0(uVar10,8);
    if (pdVar7 != (dword *)0x0) {
      uStack_88 = uVar13;
      pdStack_80 = pdVar7;
      if (uVar13 != 0) {
        uVar5 = 0;
        do {
          if (uVar10 == 0) break;
          func_0x005a51dc(&uStack_70,lVar3);
          uVar5 = uVar5 + 1;
          lVar3 = lVar3 + 0x30;
          *(undefined8 *)(pdVar7 + 2) = uStack_68;
          *(undefined8 *)pdVar7 = uStack_70;
          *(undefined8 *)(pdVar7 + 6) = uStack_58;
          *(undefined8 *)(pdVar7 + 4) = uStack_60;
          *(undefined8 *)(pdVar7 + 10) = uStack_48;
          *(undefined8 *)(pdVar7 + 8) = uStack_50;
          uVar10 = uVar10 - 0x30;
          pdVar7 = pdVar7 + 0xc;
        } while (uVar13 != uVar5);
      }
      goto code_r0x0059ef58;
    }
  }
  uVar6 = func_0x007a1f00(uVar11,uVar10,&UNK_009f1b50);
  uStack_78 = uVar11;
  func_0x0059e598(&uStack_88);
  __Unwind_Resume(uVar6);
  lVar3 = func_0x007a2668();
  uVar13 = *(ulong *)(lVar3 + 0x10);
  uVar10 = uVar13 * 4;
  if (uVar13 >> 0x3e == 0 && uVar10 < 0x7ffffffffffffffd) {
    uVar6 = *(undefined8 *)(lVar3 + 8);
    if (uVar10 == 0) {
      uVar5 = 0;
      uVar12 = 4;
    }
    else {
      uVar11 = 4;
      uVar12 = func_0x00187bd0(uVar10,4);
      if (uVar12 == 0) goto code_r0x0059f04c;
      uVar5 = uVar13;
    }
    _memcpy(uVar12,uVar6,uVar10);
    *extraout_x8_00 = uVar5;
    extraout_x8_00[1] = uVar12;
    extraout_x8_00[2] = uVar13;
    return;
  }
  uVar11 = 0;
code_r0x0059f04c:
  lVar3 = func_0x007a1f00(uVar11,uVar10,&UNK_009f1b38);
  if (*(long *)(lVar3 + 0x10) != 0) {
    puVar14 = *(undefined8 **)(lVar3 + 8);
    lVar3 = 1 - *(long *)(lVar3 + 0x10);
    do {
      plVar9 = (long *)*puVar14;
      if (plVar9 != (long *)0x0) {
        lVar4 = *plVar9;
        *plVar9 = lVar4 + -1;
        LORelease();
        if (lVar4 == 1) {
          func_0x005d2c74(puVar14);
        }
      }
      puVar14 = puVar14 + 3;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 1);
  }
  return;
}

