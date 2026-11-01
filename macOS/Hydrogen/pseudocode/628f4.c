
/* WARNING: Removing unreachable block (ram,0x00062854) */

void FUN_000628f4(void)

{
  ulong uVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x23;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  
  _memmove();
  *(undefined1 *)(unaff_x21 + unaff_x20) = 0;
  if (*(char *)(unaff_x19 + 0x77) < '\0') {
    __ZdlPv(*unaff_x23);
  }
  unaff_x23[1] = in_stack_00000018;
  *unaff_x23 = in_stack_00000010;
  unaff_x23[2] = in_stack_00000020;
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  uVar1 = *(ulong *)(unaff_x19 + 0x68);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
    uVar1 = (ulong)*(byte *)(unaff_x19 + 0x77);
  }
  __ZNSt3__19to_stringEm(&uStack0000000000000030,uVar1);
  func_0x0005dd28();
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  return;
}

