
void thunk_FUN_0005fc48(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined1 *unaff_x23;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  *unaff_x23 = 0;
  lVar1 = unaff_x19[1];
  if (*(char *)(lVar1 + 0xf7) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 0xe0));
  }
  *(undefined8 *)(lVar1 + 0xe8) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 0xe0) = in_stack_00000008;
  *(undefined8 *)(lVar1 + 0xf0) = in_stack_00000018;
  *(long *)*unaff_x19 = *(long *)*unaff_x19 + 1;
  return;
}

