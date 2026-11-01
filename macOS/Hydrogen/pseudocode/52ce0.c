
undefined8 FUN_00052ce0(undefined8 param_1)

{
  int *piVar1;
  code *pcVar2;
  undefined1 uVar3;
  int iVar4;
  int *piVar5;
  undefined8 *puVar6;
  long lVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  byte bStack000000000000003f;
  
  iVar4 = func_0x006e2c48(param_1,2);
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
  puVar11 = uStack0000000000000010;
  puVar6 = (undefined8 *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)in_stack_00000020) {
    puVar11 = &uStack0000000000000010;
    puVar6 = (undefined8 *)((long)&uStack0000000000000010 + uVar9);
  }
  bVar8 = in_stack_00000020._7_1_;
  if (puVar11 != puVar6) {
    do {
      uVar3 = ___tolower(*(undefined1 *)puVar11);
      puVar12 = (undefined8 *)((long)puVar11 + 1);
      *(undefined1 *)puVar11 = uVar3;
      puVar11 = puVar12;
    } while (puVar12 != puVar6);
    uVar9 = in_stack_00000020 >> 0x38;
    bVar8 = (byte)(in_stack_00000020 >> 0x38);
  }
  puVar11 = uStack0000000000000010;
  uVar10 = in_stack_00000018;
  if (-1 < (char)bVar8) {
    puVar11 = &uStack0000000000000010;
    uVar10 = uVar9;
  }
  if (4 < (long)uVar10) {
    piVar1 = (int *)((long)puVar11 + uVar10);
    puVar6 = puVar11;
    while (piVar5 = (int *)_memchr(puVar6,0x66,uVar10 - 4), piVar5 != (int *)0x0) {
      if (*piVar5 == 0x616c6666 && (char)piVar5[1] == 'g') {
        if ((piVar5 != piVar1) && ((long)piVar5 - (long)puVar11 != -1)) {
          puVar11 = uStack0000000000000028;
          uVar9 = in_stack_00000030;
          if (-1 < (char)bStack000000000000003f) {
            puVar11 = &uStack0000000000000028;
            uVar9 = (ulong)bStack000000000000003f;
          }
          piVar1 = (int *)((long)puVar11 + uVar9);
          if ((long)uVar9 < 5) goto code_r0x00052fd0;
          puVar6 = puVar11;
          uVar10 = uVar9;
          goto code_r0x00052f9c;
        }
        break;
      }
      puVar6 = (undefined8 *)((long)piVar5 + 1);
      uVar10 = (long)piVar1 - (long)puVar6;
      if ((long)uVar10 < 5) break;
    }
  }
  goto code_r0x00052ff4;
  while( true ) {
    if (*piVar5 == 0x616c6666 && (char)piVar5[1] == 'g') goto code_r0x00052fd4;
    puVar6 = (undefined8 *)((long)piVar5 + 1);
    uVar10 = (long)piVar1 - (long)puVar6;
    if ((long)uVar10 < 5) break;
code_r0x00052f9c:
    piVar5 = (int *)_memchr(puVar6,0x66,uVar10 - 4);
    if (piVar5 == (int *)0x0) break;
  }
code_r0x00052fd0:
  piVar5 = piVar1;
code_r0x00052fd4:
  uVar10 = (long)piVar5 - (long)puVar11;
  if (piVar5 == piVar1) {
    uVar10 = 0xffffffffffffffff;
  }
  if (uVar9 < uVar10) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar10,5);
code_r0x00052ff4:
  lVar7 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar7 != 0) {
    *(bool *)*(undefined8 *)(lVar7 + 0x28) = iVar4 != 0;
  }
  if ((long)in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
}

