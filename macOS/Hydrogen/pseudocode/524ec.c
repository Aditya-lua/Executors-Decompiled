
undefined8 FUN_000524ec(void)

{
  int *piVar1;
  code *pcVar2;
  undefined1 uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *puVar8;
  int *piVar9;
  undefined8 *puVar10;
  long lVar11;
  byte bVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  
  uVar4 = func_0x00086db4();
  uVar4 = func_0x00086db4(uVar4,"/Users/x0rch/hydrogen-m/src/init_env.h",0x26);
  uVar4 = func_0x00086db4(uVar4,":",1);
  plVar5 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar4,0x5f);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000028,(long)plVar5 + *(long *)(*plVar5 + -0x18));
  plVar6 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000028,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000028);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar5,uVar4);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar5);
  func_0x006e69bc();
  uVar4 = func_0x006e2ce4();
  uVar7 = _strlen();
  if (0x7ffffffffffffff7 < uVar7) {
    func_0x0001748c(&uStack0000000000000028);
    goto code_r0x00052820;
  }
  if (uVar7 < 0x17) {
    _uStack0000000000000038 = CONCAT17((char)uVar7,uStack0000000000000038);
    puVar8 = &uStack0000000000000028;
    if (uVar7 != 0) goto LAB_000525f0;
  }
  else {
    uVar13 = (uVar7 & 0xfffffffffffffff8) + 8;
    if ((uVar7 | 7) != 0x17) {
      uVar13 = uVar7 | 7;
    }
    puVar8 = (undefined8 *)__Znwm(uVar13 + 1);
    _uStack0000000000000038 = uVar13 + 1 | 0x8000000000000000;
    uStack0000000000000028 = puVar8;
    in_stack_00000030 = uVar7;
LAB_000525f0:
    _memmove(puVar8,uVar4,uVar7);
  }
  *(undefined1 *)((long)puVar8 + uVar7) = 0;
  _printf("[FFlag] %s\n");
  if ((long)_uStack0000000000000038 < 0) {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = uStack0000000000000028;
    in_stack_00000020 = _uStack0000000000000038;
  }
  uVar7 = (ulong)in_stack_00000020._7_1_;
  puVar8 = uStack0000000000000010;
  puVar10 = (undefined8 *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)in_stack_00000020) {
    puVar8 = &uStack0000000000000010;
    puVar10 = (undefined8 *)((long)&uStack0000000000000010 + uVar7);
  }
  bVar12 = in_stack_00000020._7_1_;
  if (puVar8 != puVar10) {
    do {
      uVar3 = ___tolower(*(undefined1 *)puVar8);
      puVar14 = (undefined8 *)((long)puVar8 + 1);
      *(undefined1 *)puVar8 = uVar3;
      puVar8 = puVar14;
    } while (puVar14 != puVar10);
    uVar7 = in_stack_00000020 >> 0x38;
    bVar12 = (byte)(in_stack_00000020 >> 0x38);
  }
  puVar8 = uStack0000000000000010;
  uVar13 = in_stack_00000018;
  if (-1 < (char)bVar12) {
    puVar8 = &uStack0000000000000010;
    uVar13 = uVar7;
  }
  if (4 < (long)uVar13) {
    piVar1 = (int *)((long)puVar8 + uVar13);
    puVar10 = puVar8;
    while (piVar9 = (int *)_memchr(puVar10,0x66,uVar13 - 4), piVar9 != (int *)0x0) {
      if (*piVar9 == 0x616c6666 && (char)piVar9[1] == 'g') {
        if ((piVar9 != piVar1) && ((long)piVar9 - (long)puVar8 != -1)) {
          puVar8 = uStack0000000000000028;
          uVar7 = in_stack_00000030;
          if (-1 < (long)_uStack0000000000000038) {
            puVar8 = &uStack0000000000000028;
            uVar7 = _uStack0000000000000038 >> 0x38;
          }
          piVar1 = (int *)((long)puVar8 + uVar7);
          if ((long)uVar7 < 5) goto code_r0x0005277c;
          puVar10 = puVar8;
          uVar13 = uVar7;
          goto code_r0x00052748;
        }
        break;
      }
      puVar10 = (undefined8 *)((long)piVar9 + 1);
      uVar13 = (long)piVar1 - (long)puVar10;
      if ((long)uVar13 < 5) break;
    }
  }
code_r0x000527a0:
  lVar11 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar11 == 0) {
    func_0x006e383c();
  }
  else {
    func_0x006e3c24();
  }
  if ((long)in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((long)_uStack0000000000000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  return 1;
  while( true ) {
    if (*piVar9 == 0x616c6666 && (char)piVar9[1] == 'g') goto code_r0x00052780;
    puVar10 = (undefined8 *)((long)piVar9 + 1);
    uVar13 = (long)piVar1 - (long)puVar10;
    if ((long)uVar13 < 5) break;
code_r0x00052748:
    piVar9 = (int *)_memchr(puVar10,0x66,uVar13 - 4);
    if (piVar9 == (int *)0x0) break;
  }
code_r0x0005277c:
  piVar9 = piVar1;
code_r0x00052780:
  uVar13 = (long)piVar9 - (long)puVar8;
  if (piVar9 == piVar1) {
    uVar13 = 0xffffffffffffffff;
  }
  if (uVar7 < uVar13) {
code_r0x00052820:
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5282c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar13,5);
  goto code_r0x000527a0;
}

