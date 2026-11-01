
void FUN_006b2e18(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  lVar1 = *unaff_x19 + (ulong)*(uint *)(unaff_x19 + 3) * 0x88;
  if (*(char *)(lVar1 + 0x57) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 0x40));
  }
  *(undefined8 *)(lVar1 + 0x50) = in_stack_00000018;
  *(undefined8 *)(lVar1 + 0x48) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 0x40) = in_stack_00000008;
  return;
}

