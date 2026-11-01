
undefined8 FUN_00052bfc(void)

{
  char cVar1;
  code *pcVar2;
  bool bVar3;
  undefined1 uVar4;
  int iVar5;
  long *plVar6;
  undefined8 uVar7;
  ulong uVar8;
  int *piVar9;
  int *piVar10;
  long lVar11;
  byte bVar12;
  ulong uVar13;
  uint uVar14;
  int *piVar15;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined7 uStack0000000000000020;
  byte bStack0000000000000027;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000028);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  func_0x006e69bc();
  uVar7 = func_0x006e2ce4();
  uVar8 = _strlen();
  if (0x7ffffffffffffff7 < uVar8) {
    func_0x0001748c(&uStack0000000000000028);
code_r0x00053060:
    func_0x006e644c();
code_r0x00053088:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
    (*pcVar2)();
  }
  if (uVar8 < 0x17) {
    _uStack0000000000000038 = CONCAT17((char)uVar8,uStack0000000000000038);
    piVar9 = (int *)&uStack0000000000000028;
    if (uVar8 != 0) goto code_r0x00052cb4;
  }
  else {
    uVar13 = (uVar8 & 0xfffffffffffffff8) + 8;
    if ((uVar8 | 7) != 0x17) {
      uVar13 = uVar8 | 7;
    }
    piVar9 = (int *)__Znwm(uVar13 + 1);
    _uStack0000000000000038 = uVar13 + 1 | 0x8000000000000000;
    uStack0000000000000028 = piVar9;
    in_stack_00000030 = uVar8;
code_r0x00052cb4:
    _memmove(piVar9,uVar7,uVar8);
  }
  *(undefined1 *)((long)piVar9 + uVar8) = 0;
  iVar5 = func_0x006e21f8();
  if (iVar5 == 1) {
    iVar5 = func_0x006e2c48();
    bVar3 = iVar5 != 0;
  }
  else {
    iVar5 = func_0x006e24a4();
    if (iVar5 == 0) goto code_r0x00053060;
    uVar7 = func_0x006e2ce4();
    uVar8 = _strlen();
    if (0x7ffffffffffffff7 < uVar8) {
      func_0x0001748c(&uStack0000000000000010);
      goto code_r0x00053088;
    }
    if (uVar8 < 0x17) {
      _uStack0000000000000020 = CONCAT17((char)uVar8,uStack0000000000000020);
      piVar9 = (int *)&uStack0000000000000010;
      if (uVar8 != 0) goto code_r0x00052d70;
    }
    else {
      uVar13 = (uVar8 & 0xfffffffffffffff8) + 8;
      if ((uVar8 | 7) != 0x17) {
        uVar13 = uVar8 | 7;
      }
      piVar9 = (int *)__Znwm(uVar13 + 1);
      _uStack0000000000000020 = uVar13 + 1 | 0x8000000000000000;
      uStack0000000000000010 = piVar9;
      in_stack_00000018 = uVar8;
code_r0x00052d70:
      _memmove(piVar9,uVar7,uVar8);
    }
    *(undefined1 *)((long)piVar9 + uVar8) = 0;
    uVar8 = (ulong)bStack0000000000000027;
    uVar14 = (uint)(char)bStack0000000000000027;
    piVar9 = uStack0000000000000010;
    piVar10 = (int *)((long)uStack0000000000000010 + in_stack_00000018);
    if (-1 < (int)uVar14) {
      piVar9 = (int *)&uStack0000000000000010;
      piVar10 = (int *)((long)&uStack0000000000000010 + uVar8);
    }
    if (piVar9 != piVar10) {
      do {
        uVar4 = ___tolower((char)*piVar9);
        piVar15 = (int *)((long)piVar9 + 1);
        *(undefined1 *)piVar9 = uVar4;
        piVar9 = piVar15;
      } while (piVar15 != piVar10);
      uVar8 = _uStack0000000000000020 >> 0x38;
      uVar14 = (uint)(byte)(_uStack0000000000000020 >> 0x38);
    }
    cVar1 = (char)uVar14;
    uVar13 = in_stack_00000018;
    if (-1 < cVar1) {
      uVar13 = uVar8;
    }
    if (uVar13 == 1) {
      piVar9 = uStack0000000000000010;
      if (-1 < cVar1) {
        piVar9 = (int *)&uStack0000000000000010;
      }
      iVar5 = _memcmp(piVar9,"1");
      bVar3 = iVar5 == 0;
    }
    else if (uVar13 == 4) {
      piVar9 = uStack0000000000000010;
      if (-1 < cVar1) {
        piVar9 = (int *)&uStack0000000000000010;
      }
      bVar3 = *piVar9 == 0x65757274;
    }
    else {
      bVar3 = false;
    }
    if ((uVar14 >> 7 & 1) != 0) {
      __ZdlPv(uStack0000000000000010);
    }
  }
  _printf("[FFlag] %s value %d\n");
  if ((long)_uStack0000000000000038 < 0) {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = uStack0000000000000028;
    _uStack0000000000000020 = _uStack0000000000000038;
  }
  uVar8 = (ulong)bStack0000000000000027;
  piVar9 = uStack0000000000000010;
  piVar10 = (int *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)_uStack0000000000000020) {
    piVar9 = (int *)&uStack0000000000000010;
    piVar10 = (int *)((long)&uStack0000000000000010 + uVar8);
  }
  bVar12 = bStack0000000000000027;
  if (piVar9 != piVar10) {
    do {
      uVar4 = ___tolower((char)*piVar9);
      piVar15 = (int *)((long)piVar9 + 1);
      *(undefined1 *)piVar9 = uVar4;
      piVar9 = piVar15;
    } while (piVar15 != piVar10);
    uVar8 = _uStack0000000000000020 >> 0x38;
    bVar12 = (byte)(_uStack0000000000000020 >> 0x38);
  }
  piVar9 = uStack0000000000000010;
  uVar13 = in_stack_00000018;
  if (-1 < (char)bVar12) {
    piVar9 = (int *)&uStack0000000000000010;
    uVar13 = uVar8;
  }
  if (4 < (long)uVar13) {
    piVar15 = (int *)((long)piVar9 + uVar13);
    piVar10 = piVar9;
    while (piVar10 = (int *)_memchr(piVar10,0x66,uVar13 - 4), piVar10 != (int *)0x0) {
      if (*piVar10 == 0x616c6666 && (char)piVar10[1] == 'g') {
        if ((piVar10 != piVar15) && ((long)piVar10 - (long)piVar9 != -1)) {
          piVar9 = uStack0000000000000028;
          uVar8 = in_stack_00000030;
          if (-1 < (long)_uStack0000000000000038) {
            piVar9 = (int *)&uStack0000000000000028;
            uVar8 = _uStack0000000000000038 >> 0x38;
          }
          piVar10 = (int *)((long)piVar9 + uVar8);
          if ((long)uVar8 < 5) goto LAB_00052fd0;
          piVar15 = piVar9;
          uVar13 = uVar8;
          goto LAB_00052f9c;
        }
        break;
      }
      piVar10 = (int *)((long)piVar10 + 1);
      uVar13 = (long)piVar15 - (long)piVar10;
      if ((long)uVar13 < 5) break;
    }
  }
FUN_00052ff4:
  lVar11 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar11 != 0) {
    *(bool *)*(undefined8 *)(lVar11 + 0x28) = bVar3;
  }
  if ((long)_uStack0000000000000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((long)_uStack0000000000000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
  while( true ) {
    if (*piVar15 == 0x616c6666 && (char)piVar15[1] == 'g') goto LAB_00052fd4;
    piVar15 = (int *)((long)piVar15 + 1);
    uVar13 = (long)piVar10 - (long)piVar15;
    if ((long)uVar13 < 5) break;
LAB_00052f9c:
    piVar15 = (int *)_memchr(piVar15,0x66,uVar13 - 4);
    if (piVar15 == (int *)0x0) break;
  }
LAB_00052fd0:
  piVar15 = piVar10;
LAB_00052fd4:
  uVar13 = (long)piVar15 - (long)piVar9;
  if (piVar15 == piVar10) {
    uVar13 = 0xffffffffffffffff;
  }
  if (uVar8 < uVar13) {
    func_0x00049dd0(&uStack0000000000000028);
    goto code_r0x00053088;
  }
  func_0x0005287c(&uStack0000000000000028,uVar13,5);
  goto FUN_00052ff4;
}

