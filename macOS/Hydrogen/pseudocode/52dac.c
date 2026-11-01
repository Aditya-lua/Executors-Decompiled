
undefined8 FUN_00052dac(ulong param_1)

{
  char cVar1;
  code *pcVar2;
  bool in_ZR;
  bool bVar3;
  undefined1 uVar4;
  int iVar5;
  int *piVar6;
  long lVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  ulong in_x9;
  undefined1 *unaff_x19;
  uint unaff_w20;
  undefined1 *unaff_x21;
  undefined1 *puVar11;
  int *piVar12;
  int *piVar13;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  byte bStack000000000000003f;
  
  if (!in_ZR) {
    do {
      uVar4 = ___tolower(*unaff_x21);
      puVar11 = unaff_x21 + 1;
      *unaff_x21 = uVar4;
      unaff_x21 = puVar11;
    } while (puVar11 != unaff_x19);
    param_1 = in_stack_00000020 >> 0x38;
    unaff_w20 = (uint)(byte)(in_stack_00000020 >> 0x38);
    in_x9 = in_stack_00000018;
  }
  cVar1 = (char)unaff_w20;
  if (-1 < cVar1) {
    in_x9 = param_1;
  }
  if (in_x9 == 1) {
    piVar12 = uStack0000000000000010;
    if (-1 < cVar1) {
      piVar12 = (int *)&uStack0000000000000010;
    }
    iVar5 = _memcmp(piVar12,"1");
    bVar3 = iVar5 == 0;
  }
  else if (in_x9 == 4) {
    piVar12 = uStack0000000000000010;
    if (-1 < cVar1) {
      piVar12 = (int *)&uStack0000000000000010;
    }
    bVar3 = *piVar12 == 0x65757274;
  }
  else {
    bVar3 = false;
  }
  if ((unaff_w20 >> 7 & 1) != 0) {
    __ZdlPv(uStack0000000000000010);
  }
  _printf("[FFlag] %s value %d\n");
  if ((char)bStack000000000000003f < '\0') {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = uStack0000000000000028;
    in_stack_00000020 = CONCAT17(bStack000000000000003f,uStack0000000000000038);
  }
  uVar9 = (ulong)in_stack_00000020._7_1_;
  piVar12 = uStack0000000000000010;
  piVar6 = (int *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)in_stack_00000020) {
    piVar12 = (int *)&uStack0000000000000010;
    piVar6 = (int *)((long)&uStack0000000000000010 + uVar9);
  }
  bVar8 = in_stack_00000020._7_1_;
  if (piVar12 != piVar6) {
    do {
      uVar4 = ___tolower((char)*piVar12);
      piVar13 = (int *)((long)piVar12 + 1);
      *(undefined1 *)piVar12 = uVar4;
      piVar12 = piVar13;
    } while (piVar13 != piVar6);
    uVar9 = in_stack_00000020 >> 0x38;
    bVar8 = (byte)(in_stack_00000020 >> 0x38);
  }
  piVar12 = uStack0000000000000010;
  uVar10 = in_stack_00000018;
  if (-1 < (char)bVar8) {
    piVar12 = (int *)&uStack0000000000000010;
    uVar10 = uVar9;
  }
  if (4 < (long)uVar10) {
    piVar13 = (int *)((long)piVar12 + uVar10);
    piVar6 = piVar12;
    while (piVar6 = (int *)_memchr(piVar6,0x66,uVar10 - 4), piVar6 != (int *)0x0) {
      if (*piVar6 == 0x616c6666 && (char)piVar6[1] == 'g') {
        if ((piVar6 != piVar13) && ((long)piVar6 - (long)piVar12 != -1)) {
          piVar12 = uStack0000000000000028;
          uVar9 = in_stack_00000030;
          if (-1 < (char)bStack000000000000003f) {
            piVar12 = (int *)&uStack0000000000000028;
            uVar9 = (ulong)bStack000000000000003f;
          }
          piVar6 = (int *)((long)piVar12 + uVar9);
          if ((long)uVar9 < 5) goto LAB_00052fd0;
          piVar13 = piVar12;
          uVar10 = uVar9;
          goto LAB_00052f9c;
        }
        break;
      }
      piVar6 = (int *)((long)piVar6 + 1);
      uVar10 = (long)piVar13 - (long)piVar6;
      if ((long)uVar10 < 5) break;
    }
  }
  goto FUN_00052ff4;
  while( true ) {
    if (*piVar13 == 0x616c6666 && (char)piVar13[1] == 'g') goto LAB_00052fd4;
    piVar13 = (int *)((long)piVar13 + 1);
    uVar10 = (long)piVar6 - (long)piVar13;
    if ((long)uVar10 < 5) break;
LAB_00052f9c:
    piVar13 = (int *)_memchr(piVar13,0x66,uVar10 - 4);
    if (piVar13 == (int *)0x0) break;
  }
LAB_00052fd0:
  piVar13 = piVar6;
LAB_00052fd4:
  uVar10 = (long)piVar13 - (long)piVar12;
  if (piVar13 == piVar6) {
    uVar10 = 0xffffffffffffffff;
  }
  if (uVar9 < uVar10) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar10,5);
FUN_00052ff4:
  lVar7 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar7 != 0) {
    **(undefined1 **)(lVar7 + 0x28) = bVar3;
  }
  if ((long)in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
}

