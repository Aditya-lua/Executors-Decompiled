
void FUN_006b2e38(ulong param_1)

{
  long lVar1;
  long in_x9;
  uint in_w10;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  lVar1 = in_x9 + (param_1 & 0xffffffff) * (ulong)in_w10;
  if (*(char *)(lVar1 + 0x57) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 0x40));
  }
  *(undefined8 *)(lVar1 + 0x50) = in_stack_00000018;
  *(undefined8 *)(lVar1 + 0x48) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 0x40) = in_stack_00000008;
  return;
}

