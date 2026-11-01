
undefined8 * FUN_002236c8(void)

{
  int iVar1;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  undefined8 *puVar2;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  
  do {
    puVar2 = unaff_x26;
    if (puVar2 == unaff_x25) {
      return (undefined8 *)0x0;
    }
    unaff_x26 = puVar2 + 2;
    *unaff_x19 = (long)unaff_x26;
    (**(code **)(puVar2[1] + 0x30))(*puVar2);
  } while ((((in_stack_00000000 == 0 || in_stack_00000008 != unaff_x23) ||
            (iVar1 = _memcmp(), iVar1 != 0)) || (in_stack_00000018 != unaff_x22)) ||
          (iVar1 = _memcmp(in_stack_00000010), iVar1 != 0));
  return puVar2;
}

