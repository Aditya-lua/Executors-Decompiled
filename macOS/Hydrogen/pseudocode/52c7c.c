
undefined8 FUN_00052c7c(void)

{
  char cVar1;
  code *pcVar2;
  bool bVar3;
  undefined1 uVar4;
  int iVar5;
  undefined8 uVar6;
  int *piVar7;
  int *piVar8;
  long lVar9;
  byte bVar10;
  ulong uVar11;
  ulong uVar12;
  uint uVar13;
  long unaff_x20;
  long unaff_x22;
  int *piVar14;
  ulong unaff_x24;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined7 uStack0000000000000020;
  byte bStack0000000000000027;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  byte bStack000000000000003f;
  
  if (unaff_x20 != 0) {
    _memmove();
  }
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  iVar5 = func_0x006e21f8();
  if (iVar5 == 1) {
    iVar5 = func_0x006e2c48();
    bVar3 = iVar5 != 0;
  }
  else {
    iVar5 = func_0x006e24a4();
    if (iVar5 == 0) {
      func_0x006e644c();
code_r0x00053088:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
      (*pcVar2)();
    }
    uVar6 = func_0x006e2ce4();
    uVar11 = _strlen();
    if (unaff_x24 < uVar11) {
      func_0x0001748c(&uStack0000000000000010);
      goto code_r0x00053088;
    }
    if (uVar11 < 0x17) {
      _uStack0000000000000020 = CONCAT17((char)uVar11,uStack0000000000000020);
      piVar7 = (int *)&uStack0000000000000010;
      if (uVar11 != 0) goto code_r0x00052d70;
    }
    else {
      uVar12 = (uVar11 & 0xfffffffffffffff8) + 8;
      if ((uVar11 | 7) != 0x17) {
        uVar12 = uVar11 | 7;
      }
      piVar7 = (int *)__Znwm(uVar12 + 1);
      _uStack0000000000000020 = uVar12 + 1 | 0x8000000000000000;
      uStack0000000000000010 = piVar7;
      in_stack_00000018 = uVar11;
code_r0x00052d70:
      _memmove(piVar7,uVar6,uVar11);
    }
    *(undefined1 *)((long)piVar7 + uVar11) = 0;
    uVar11 = (ulong)bStack0000000000000027;
    uVar13 = (uint)(char)bStack0000000000000027;
    piVar7 = uStack0000000000000010;
    piVar8 = (int *)((long)uStack0000000000000010 + in_stack_00000018);
    if (-1 < (int)uVar13) {
      piVar7 = (int *)&uStack0000000000000010;
      piVar8 = (int *)((long)&uStack0000000000000010 + uVar11);
    }
    if (piVar7 != piVar8) {
      do {
        uVar4 = ___tolower((char)*piVar7);
        piVar14 = (int *)((long)piVar7 + 1);
        *(undefined1 *)piVar7 = uVar4;
        piVar7 = piVar14;
      } while (piVar14 != piVar8);
      uVar11 = _uStack0000000000000020 >> 0x38;
      uVar13 = (uint)(byte)(_uStack0000000000000020 >> 0x38);
    }
    cVar1 = (char)uVar13;
    uVar12 = in_stack_00000018;
    if (-1 < cVar1) {
      uVar12 = uVar11;
    }
    if (uVar12 == 1) {
      piVar7 = uStack0000000000000010;
      if (-1 < cVar1) {
        piVar7 = (int *)&uStack0000000000000010;
      }
      iVar5 = _memcmp(piVar7,"1");
      bVar3 = iVar5 == 0;
    }
    else if (uVar12 == 4) {
      piVar7 = uStack0000000000000010;
      if (-1 < cVar1) {
        piVar7 = (int *)&uStack0000000000000010;
      }
      bVar3 = *piVar7 == 0x65757274;
    }
    else {
      bVar3 = false;
    }
    if ((uVar13 >> 7 & 1) != 0) {
      __ZdlPv(uStack0000000000000010);
    }
  }
  _printf("[FFlag] %s value %d\n");
  if ((char)bStack000000000000003f < '\0') {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = uStack0000000000000028;
    _uStack0000000000000020 = CONCAT17(bStack000000000000003f,uStack0000000000000038);
  }
  uVar11 = (ulong)bStack0000000000000027;
  piVar7 = uStack0000000000000010;
  piVar8 = (int *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)_uStack0000000000000020) {
    piVar7 = (int *)&uStack0000000000000010;
    piVar8 = (int *)((long)&uStack0000000000000010 + uVar11);
  }
  bVar10 = bStack0000000000000027;
  if (piVar7 != piVar8) {
    do {
      uVar4 = ___tolower((char)*piVar7);
      piVar14 = (int *)((long)piVar7 + 1);
      *(undefined1 *)piVar7 = uVar4;
      piVar7 = piVar14;
    } while (piVar14 != piVar8);
    uVar11 = _uStack0000000000000020 >> 0x38;
    bVar10 = (byte)(_uStack0000000000000020 >> 0x38);
  }
  piVar7 = uStack0000000000000010;
  uVar12 = in_stack_00000018;
  if (-1 < (char)bVar10) {
    piVar7 = (int *)&uStack0000000000000010;
    uVar12 = uVar11;
  }
  if (4 < (long)uVar12) {
    piVar14 = (int *)((long)piVar7 + uVar12);
    piVar8 = piVar7;
    while (piVar8 = (int *)_memchr(piVar8,0x66,uVar12 - 4), piVar8 != (int *)0x0) {
      if (*piVar8 == 0x616c6666 && (char)piVar8[1] == 'g') {
        if ((piVar8 != piVar14) && ((long)piVar8 - (long)piVar7 != -1)) {
          piVar7 = uStack0000000000000028;
          uVar11 = in_stack_00000030;
          if (-1 < (char)bStack000000000000003f) {
            piVar7 = (int *)&uStack0000000000000028;
            uVar11 = (ulong)bStack000000000000003f;
          }
          piVar8 = (int *)((long)piVar7 + uVar11);
          if ((long)uVar11 < 5) goto code_r0x00052fd0;
          piVar14 = piVar7;
          uVar12 = uVar11;
          goto code_r0x00052f9c;
        }
        break;
      }
      piVar8 = (int *)((long)piVar8 + 1);
      uVar12 = (long)piVar14 - (long)piVar8;
      if ((long)uVar12 < 5) break;
    }
  }
code_r0x00052ff4:
  lVar9 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar9 != 0) {
    *(bool *)*(undefined8 *)(lVar9 + 0x28) = bVar3;
  }
  if ((long)_uStack0000000000000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
  while( true ) {
    if (*piVar14 == 0x616c6666 && (char)piVar14[1] == 'g') goto code_r0x00052fd4;
    piVar14 = (int *)((long)piVar14 + 1);
    uVar12 = (long)piVar8 - (long)piVar14;
    if ((long)uVar12 < 5) break;
code_r0x00052f9c:
    piVar14 = (int *)_memchr(piVar14,0x66,uVar12 - 4);
    if (piVar14 == (int *)0x0) break;
  }
code_r0x00052fd0:
  piVar14 = piVar8;
code_r0x00052fd4:
  uVar12 = (long)piVar14 - (long)piVar7;
  if (piVar14 == piVar8) {
    uVar12 = 0xffffffffffffffff;
  }
  if (uVar11 < uVar12) {
    func_0x00049dd0(&uStack0000000000000028);
    goto code_r0x00053088;
  }
  func_0x0005287c(&uStack0000000000000028,uVar12,5);
  goto code_r0x00052ff4;
}

