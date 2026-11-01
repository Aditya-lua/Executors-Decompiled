
bool FUN_0006a984(undefined8 param_1,char *param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  char cVar3;
  code *pcVar4;
  undefined8 *puVar5;
  undefined8 *unaff_x19;
  ulong unaff_x25;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  
  if ((*param_2 != '\"') || (param_2[param_3 + -1] != '\"')) {
    func_0x00017634(&uStack0000000000000020);
    cVar3 = *(char *)((long)unaff_x19 + 0x17);
    goto joined_r0x0006a9e4;
  }
  uVar1 = param_3 - 1U;
  if (param_3 - 2U <= param_3 - 1U) {
    uVar1 = param_3 - 2U;
  }
  if (unaff_x25 < uVar1) {
    func_0x0001748c(&uStack0000000000000020);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x6aa94);
    (*pcVar4)();
  }
  if (uVar1 < 0x17) {
    _uStack0000000000000030 = CONCAT17((char)uVar1,uStack0000000000000030);
    puVar5 = &uStack0000000000000020;
    if (uVar1 != 0) goto LAB_0006aa60;
  }
  else {
    uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
    if ((uVar1 | 7) != 0x17) {
      uVar2 = uVar1 | 7;
    }
    puVar5 = (undefined8 *)__Znwm(uVar2 + 1);
    _uStack0000000000000030 = uVar2 + 1 | 0x8000000000000000;
    uStack0000000000000020 = puVar5;
    in_stack_00000028 = uVar1;
LAB_0006aa60:
    _memmove(puVar5,param_2 + 1,uVar1);
  }
  *(undefined1 *)((long)puVar5 + uVar1) = 0;
  cVar3 = *(char *)((long)unaff_x19 + 0x17);
joined_r0x0006a9e4:
  if (cVar3 < '\0') {
    __ZdlPv(*unaff_x19);
  }
  unaff_x19[1] = in_stack_00000028;
  *unaff_x19 = uStack0000000000000020;
  unaff_x19[2] = _uStack0000000000000030;
  _uStack0000000000000030 = _uStack0000000000000030 & 0xffffffffffffff;
  uStack0000000000000020 = (undefined8 *)((ulong)uStack0000000000000020 & 0xffffffffffffff00);
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  uVar1 = unaff_x19[1];
  if (-1 < (char)*(byte *)((long)unaff_x19 + 0x17)) {
    uVar1 = (ulong)*(byte *)((long)unaff_x19 + 0x17);
  }
  return uVar1 != 0;
}

