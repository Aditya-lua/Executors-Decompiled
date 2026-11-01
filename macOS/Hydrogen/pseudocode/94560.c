
void FUN_00094560(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  ulong in_x9;
  undefined8 *unaff_x19;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000028;
  undefined *in_stack_00000030;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  long in_stack_00000098;
  
  if (in_x9 <= unaff_x22) {
    func_0x0001748c();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x94648);
    (*pcVar2)();
  }
  if (unaff_x22 < 0x17) {
    *(char *)((long)unaff_x19 + 0x17) = (char)unaff_x22;
    puVar3 = unaff_x19;
    if (unaff_x22 == 0) goto LAB_000945bc;
  }
  else {
    uVar1 = (unaff_x22 & 0xfffffffffffffff8) + 8;
    if ((unaff_x22 | 7) != 0x17) {
      uVar1 = unaff_x22 | 7;
    }
    puVar3 = (undefined8 *)__Znwm(uVar1 + 1);
    unaff_x19[1] = unaff_x22;
    unaff_x19[2] = uVar1 + 1 | 0x8000000000000000;
    *unaff_x19 = puVar3;
  }
  _memmove(puVar3);
  unaff_x19 = puVar3;
LAB_000945bc:
  *(undefined1 *)((long)unaff_x19 + unaff_x22) = 0;
  uStack0000000000000018 = unaff_x21 + 0x18;
  in_stack_00000098 = unaff_x21 + 0x68;
  in_stack_00000028 = unaff_x21 + 0x40;
  in_stack_00000030 = &UNK_009b2780;
  if (in_stack_00000080._7_1_ < '\0') {
    __ZdlPv(in_stack_00000070);
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__114basic_iostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000018,&UNK_009b2888);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(in_stack_00000010);
  return;
}

