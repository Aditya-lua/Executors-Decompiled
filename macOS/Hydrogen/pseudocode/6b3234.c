
void FUN_006b3234(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  undefined4 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *puVar11;
  undefined4 *puVar12;
  long unaff_x25;
  undefined4 unaff_w26;
  long unaff_x27;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  lVar3 = __Znwm();
  puVar5 = (undefined8 *)(lVar3 + unaff_x25 * 8);
  *(undefined4 *)puVar5 = unaff_w26;
  *(int *)((long)puVar5 + 4) = (int)unaff_x23;
  puVar1 = puVar5 + 1;
  if ((long)unaff_x24 - (long)unaff_x21 != 0) {
    uVar6 = ((long)unaff_x24 - (long)unaff_x21) - 8;
    puVar11 = unaff_x24;
    if ((0x57 < uVar6) && (0x3f < (ulong)((long)unaff_x24 + (-lVar3 - unaff_x27)))) {
      uVar6 = (uVar6 >> 3) + 1;
      uVar7 = uVar6 & 0x3ffffffffffffff8;
      puVar11 = unaff_x24 + -uVar7;
      puVar5 = puVar5 + -uVar7;
      puVar8 = unaff_x24 + -4;
      puVar9 = (undefined8 *)(lVar3 + unaff_x25 * 8 + -0x20);
      uVar10 = uVar7;
      do {
        uVar15 = *puVar8;
        uVar14 = puVar8[3];
        uVar13 = puVar8[2];
        uVar19 = puVar8[-3];
        uVar18 = puVar8[-4];
        uVar17 = puVar8[-1];
        uVar16 = puVar8[-2];
        puVar9[1] = puVar8[1];
        *puVar9 = uVar15;
        puVar9[3] = uVar14;
        puVar9[2] = uVar13;
        puVar9[-3] = uVar19;
        puVar9[-4] = uVar18;
        puVar9[-1] = uVar17;
        puVar9[-2] = uVar16;
        puVar8 = puVar8 + -8;
        puVar9 = puVar9 + -8;
        uVar10 = uVar10 - 8;
      } while (uVar10 != 0);
      if (uVar6 == uVar7) goto code_r0x006b32d4;
    }
    do {
      puVar11 = puVar11 + -1;
      puVar5 = puVar5 + -1;
      *puVar5 = *puVar11;
    } while (puVar11 != unaff_x21);
  }
code_r0x006b32d4:
  *(undefined8 **)(unaff_x19 + 0x280) = puVar5;
  *(undefined8 **)(unaff_x19 + 0x288) = puVar1;
  *(long *)(unaff_x19 + 0x290) = lVar3 + unaff_x22;
  if (unaff_x21 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 **)(unaff_x19 + 0x288) = puVar1;
  if (*(char *)(unaff_x19 + 0x2af) < '\0') {
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  puVar12 = *(undefined4 **)(unaff_x19 + 0x2f8);
  if (*(undefined4 **)(unaff_x19 + 0x300) <= puVar12) {
    puVar12 = (undefined4 *)func_0x006b7894(unaff_x19 + 0x2f0);
    goto code_r0x006b33ac;
  }
  puVar4 = puVar12 + 2;
  *puVar12 = *(undefined4 *)(unaff_x19 + 0x1b8);
  uVar6 = _strlen((long)unaff_x20 + unaff_x23);
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(puVar4);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6b33e4);
    (*pcVar2)();
  }
  if (uVar6 < 0x17) {
    *(char *)((long)puVar12 + 0x1f) = (char)uVar6;
    if (uVar6 != 0) goto code_r0x006b3390;
  }
  else {
    uVar10 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar10 = uVar6 | 7;
    }
    puVar4 = (undefined4 *)__Znwm(uVar10 + 1);
    *(ulong *)(puVar12 + 4) = uVar6;
    *(ulong *)(puVar12 + 6) = uVar10 + 1 | 0x8000000000000000;
    *(undefined4 **)(puVar12 + 2) = puVar4;
code_r0x006b3390:
    _memmove(puVar4,(long)unaff_x20 + unaff_x23,uVar6);
  }
  *(undefined1 *)((long)puVar4 + uVar6) = 0;
  puVar12 = puVar12 + 8;
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar12;
code_r0x006b33ac:
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar12;
  return;
}

