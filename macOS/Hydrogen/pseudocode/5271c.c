
undefined8 FUN_0005271c(ulong param_1)

{
  int *piVar1;
  undefined8 *puVar2;
  ulong uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  int *piVar6;
  long lVar7;
  ulong uVar8;
  int in_w9;
  int unaff_w20;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  
  puVar2 = uStack0000000000000028;
  uVar3 = in_stack_00000030;
  if (-1 < in_w9) {
    puVar2 = &uStack0000000000000028;
    uVar3 = param_1;
  }
  piVar1 = (int *)((long)puVar2 + uVar3);
  if (4 < (long)uVar3) {
    puVar5 = puVar2;
    uVar8 = uVar3;
    do {
      piVar6 = (int *)_memchr(puVar5,0x66,uVar8 - 4);
      if (piVar6 == (int *)0x0) break;
      if (*piVar6 == unaff_w20 && (char)piVar6[1] == 'g') goto LAB_00052780;
      puVar5 = (undefined8 *)((long)piVar6 + 1);
      uVar8 = (long)piVar1 - (long)puVar5;
    } while (4 < (long)uVar8);
  }
  piVar6 = piVar1;
LAB_00052780:
  uVar8 = (long)piVar6 - (long)puVar2;
  if (piVar6 == piVar1) {
    uVar8 = 0xffffffffffffffff;
  }
  if (uVar3 < uVar8) {
    func_0x00049dd0(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x5282c);
    (*pcVar4)();
  }
  func_0x0005287c(&uStack0000000000000028,uVar8,5);
  lVar7 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar7 == 0) {
    func_0x006e383c();
  }
  else {
    func_0x006e3c24();
  }
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 1;
}

