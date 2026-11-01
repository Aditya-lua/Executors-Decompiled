
void FUN_0005fd50(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  _memcpy();
  *(undefined1 *)(unaff_x23 + unaff_x22) = 0;
  lVar1 = unaff_x19[1];
  if (*(char *)(lVar1 + 0xdf) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 200));
  }
  *(undefined8 *)(lVar1 + 0xd0) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 200) = in_stack_00000008;
  *(undefined8 *)(lVar1 + 0xd8) = in_stack_00000018;
  *(long *)*unaff_x19 = *(long *)*unaff_x19 + 1;
  return;
}

