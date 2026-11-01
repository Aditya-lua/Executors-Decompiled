
void FUN_00094c68(long param_1)

{
  long lVar1;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  lVar1 = *(long *)(param_1 + 8);
  if (*(char *)(lVar1 + 0x47) < '\0') {
    __ZdlPv(*(undefined8 *)(lVar1 + 0x30));
  }
  *(undefined8 *)(lVar1 + 0x38) = in_stack_00000010;
  *(undefined8 *)(lVar1 + 0x30) = in_stack_00000008;
  *(undefined8 *)(lVar1 + 0x40) = in_stack_00000018;
  return;
}

