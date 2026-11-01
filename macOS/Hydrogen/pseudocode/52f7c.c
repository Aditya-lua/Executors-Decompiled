
undefined8 FUN_00052f7c(void)

{
  int *piVar1;
  code *pcVar2;
  char in_NG;
  char in_OV;
  undefined8 *puVar3;
  int *piVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *in_x10;
  undefined1 unaff_w19;
  int unaff_w20;
  ulong unaff_x21;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  
  if (in_NG == in_OV) {
    in_x10 = &uStack0000000000000028;
  }
  piVar1 = (int *)((long)in_x10 + unaff_x21);
  if (4 < (long)unaff_x21) {
    puVar3 = in_x10;
    uVar6 = unaff_x21;
    do {
      piVar4 = (int *)_memchr(puVar3,0x66,uVar6 - 4);
      if (piVar4 == (int *)0x0) break;
      if (*piVar4 == unaff_w20 && (char)piVar4[1] == 'g') goto LAB_00052fd4;
      puVar3 = (undefined8 *)((long)piVar4 + 1);
      uVar6 = (long)piVar1 - (long)puVar3;
    } while (4 < (long)uVar6);
  }
  piVar4 = piVar1;
LAB_00052fd4:
  uVar6 = (long)piVar4 - (long)in_x10;
  if (piVar4 == piVar1) {
    uVar6 = 0xffffffffffffffff;
  }
  if (unaff_x21 < uVar6) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5308c);
    (*pcVar2)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar6,5);
  lVar5 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar5 != 0) {
    **(undefined1 **)(lVar5 + 0x28) = unaff_w19;
  }
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
}

