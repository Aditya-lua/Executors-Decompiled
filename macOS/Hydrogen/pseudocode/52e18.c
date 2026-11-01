
undefined8 FUN_00052e18(void)

{
  int *piVar1;
  code *pcVar2;
  undefined1 uVar3;
  int *piVar4;
  undefined8 *puVar5;
  long lVar6;
  byte bVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 unaff_w19;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  byte bStack000000000000003f;
  
  __ZdlPv();
  _printf("[FFlag] %s value %d\n");
  if ((char)bStack000000000000003f < '\0') {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,in_stack_00000030);
  }
  else {
    in_stack_00000018 = in_stack_00000030;
    uStack0000000000000010 = uStack0000000000000028;
    in_stack_00000020 = CONCAT17(bStack000000000000003f,uStack0000000000000038);
  }
  uVar8 = (ulong)in_stack_00000020._7_1_;
  puVar10 = uStack0000000000000010;
  puVar5 = (undefined8 *)((long)uStack0000000000000010 + in_stack_00000018);
  if (-1 < (long)in_stack_00000020) {
    puVar10 = &uStack0000000000000010;
    puVar5 = (undefined8 *)((long)&uStack0000000000000010 + uVar8);
  }
  bVar7 = in_stack_00000020._7_1_;
  if (puVar10 != puVar5) {
    do {
      uVar3 = ___tolower(*(undefined1 *)puVar10);
      puVar11 = (undefined8 *)((long)puVar10 + 1);
      *(undefined1 *)puVar10 = uVar3;
      puVar10 = puVar11;
    } while (puVar11 != puVar5);
    uVar8 = in_stack_00000020 >> 0x38;
    bVar7 = (byte)(in_stack_00000020 >> 0x38);
  }
  puVar10 = uStack0000000000000010;
  uVar9 = in_stack_00000018;
  if (-1 < (char)bVar7) {
    puVar10 = &uStack0000000000000010;
    uVar9 = uVar8;
  }
  if (4 < (long)uVar9) {
    piVar1 = (int *)((long)puVar10 + uVar9);
    puVar5 = puVar10;
    while (piVar4 = (int *)_memchr(puVar5,0x66,uVar9 - 4), piVar4 != (int *)0x0) {
      if (*piVar4 == 0x616c6666 && (char)piVar4[1] == 'g') {
        if ((piVar4 != piVar1) && ((long)piVar4 - (long)puVar10 != -1)) {
          puVar10 = uStack0000000000000028;
          uVar8 = in_stack_00000030;
          if (-1 < (char)bStack000000000000003f) {
            puVar10 = &uStack0000000000000028;
            uVar8 = (ulong)bStack000000000000003f;
          }
          piVar1 = (int *)((long)puVar10 + uVar8);
          if ((long)uVar8 < 5) goto LAB_00052fd0;
          puVar5 = puVar10;
          uVar9 = uVar8;
          goto LAB_00052f9c;
        }
        break;
      }
      puVar5 = (undefined8 *)((long)piVar4 + 1);
      uVar9 = (long)piVar1 - (long)puVar5;
      if ((long)uVar9 < 5) break;
    }
  }
  goto FUN_00052ff4;
  while( true ) {
    if (*piVar4 == 0x616c6666 && (char)piVar4[1] == 'g') goto LAB_00052fd4;
    puVar5 = (undefined8 *)((long)piVar4 + 1);
    uVar9 = (long)piVar1 - (long)puVar5;
    if ((long)uVar9 < 5) break;
LAB_00052f9c:
    piVar4 = (int *)_memchr(puVar5,0x66,uVar9 - 4);
    if (piVar4 == (int *)0x0) break;
  }
LAB_00052fd0:
  piVar4 = piVar1;
LAB_00052fd4:
  uVar9 = (long)piVar4 - (long)puVar10;
  if (piVar4 == piVar1) {
    uVar9 = 0xffffffffffffffff;
  }
  if (uVar8 < uVar9) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar9,5);
FUN_00052ff4:
  lVar6 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar6 != 0) {
    **(undefined1 **)(lVar6 + 0x28) = unaff_w19;
  }
  if ((long)in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((char)bStack000000000000003f < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
}

