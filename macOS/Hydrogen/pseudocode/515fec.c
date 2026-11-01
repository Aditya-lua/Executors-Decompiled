
void FUN_00515fec(void)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  long *plVar4;
  dword *pdVar5;
  ulong *extraout_x8;
  long lVar6;
  dword *pdVar7;
  dword *pdVar9;
  ulong uVar8;
  long *unaff_x20;
  ulong uVar10;
  long unaff_x23;
  long unaff_x24;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x004dfd4c(unaff_x24);
    unaff_x24 = unaff_x24 + 0x68;
  }
  if (*unaff_x20 != 0) {
    func_0x00187bd4();
  }
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  lVar1 = plVar4[2];
  lVar2 = plVar4[3];
  uVar10 = lVar1 * 0x20;
  pdVar5 = (dword *)*plVar4;
  lVar6 = plVar4[1];
  pdVar7 = pdVar5;
  pdVar9 = pdVar5;
  if (lVar6 != lVar2) {
    do {
      uVar14 = *(undefined8 *)(lVar6 + 0x10);
      uVar13 = *(undefined8 *)(lVar6 + 8);
      puVar12 = (undefined8 *)(lVar6 + 0x18);
      lVar6 = lVar6 + 0x20;
      *(undefined8 *)(pdVar7 + 4) = *puVar12;
      pdVar9 = pdVar7 + 6;
      *(undefined8 *)(pdVar7 + 2) = uVar14;
      *(undefined8 *)pdVar7 = uVar13;
      pdVar7 = pdVar9;
    } while (lVar6 != lVar2);
    plVar4[1] = lVar6;
  }
  uVar8 = (long)pdVar9 - (long)pdVar5;
  *plVar4 = 8;
  plVar4[1] = 8;
  plVar4[2] = 0;
  plVar4[3] = 8;
  if (lVar2 - lVar6 != 0) {
    uVar11 = (ulong)(lVar2 - lVar6) >> 5;
    puVar12 = (undefined8 *)(lVar6 + 0x10);
    do {
      if (puVar12[-1] != 0) {
        func_0x00187bd4(*puVar12,puVar12[-1],1);
      }
      puVar12 = puVar12 + 4;
      uVar11 = uVar11 - 1;
    } while (uVar11 != 0);
  }
  if (lVar1 != 0) {
    uVar11 = (uVar10 / 0x18) * 0x18;
    if (uVar10 != uVar11) {
      if (uVar10 == 0) {
        pdVar5 = &MACH_HEADER.cpusubtype;
      }
      else {
        pdVar5 = (dword *)func_0x00187bd8(pdVar5,uVar10,8,uVar11);
        if (pdVar5 == (dword *)0x0) {
          func_0x007a1f18(8,uVar11);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x516128);
          (*pcVar3)();
        }
      }
    }
  }
  *extraout_x8 = uVar10 / 0x18;
  extraout_x8[1] = (ulong)pdVar5;
  extraout_x8[2] = (uVar8 >> 3) * -0x5555555555555555;
  return;
}

