
undefined8 FUN_000525e4(undefined8 *param_1)

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
  ulong unaff_x20;
  long unaff_x22;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong unaff_x23;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong uStack0000000000000038;
  
  uStack0000000000000038 = unaff_x23 | 0x8000000000000000;
  uStack0000000000000028 = param_1;
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  _printf("[FFlag] %s\n");
  if ((long)uStack0000000000000038 < 0) {
    func_0x00017634(&uStack0000000000000010,uStack0000000000000028,unaff_x20);
  }
  else {
    uStack0000000000000010 = uStack0000000000000028;
    in_stack_00000020 = uStack0000000000000038;
    in_stack_00000018 = unaff_x20;
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
          if (-1 < (long)uStack0000000000000038) {
            puVar10 = &uStack0000000000000028;
            unaff_x20 = uStack0000000000000038 >> 0x38;
          }
          piVar1 = (int *)((long)puVar10 + unaff_x20);
          if ((long)unaff_x20 < 5) goto LAB_0005277c;
          puVar5 = puVar10;
          uVar8 = unaff_x20;
          goto LAB_00052748;
        }
        break;
      }
      puVar5 = (undefined8 *)((long)piVar4 + 1);
      uVar9 = (long)piVar1 - (long)puVar5;
      if ((long)uVar9 < 5) break;
    }
  }
  goto LAB_000527a0;
  while( true ) {
    if (*piVar4 == 0x616c6666 && (char)piVar4[1] == 'g') goto LAB_00052780;
    puVar5 = (undefined8 *)((long)piVar4 + 1);
    uVar8 = (long)piVar1 - (long)puVar5;
    if ((long)uVar8 < 5) break;
LAB_00052748:
    piVar4 = (int *)_memchr(puVar5,0x66,uVar8 - 4);
    if (piVar4 == (int *)0x0) break;
  }
LAB_0005277c:
  piVar4 = piVar1;
LAB_00052780:
  uVar8 = (long)piVar4 - (long)puVar10;
  if (piVar4 == piVar1) {
    uVar8 = 0xffffffffffffffff;
  }
  if (unaff_x20 < uVar8) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5282c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar8,5);
LAB_000527a0:
  lVar6 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar6 == 0) {
    func_0x006e383c();
  }
  else {
    func_0x006e3c24();
  }
  if ((long)in_stack_00000020 < 0) {
    __ZdlPv(uStack0000000000000010);
  }
  if ((long)uStack0000000000000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  return 1;
}

