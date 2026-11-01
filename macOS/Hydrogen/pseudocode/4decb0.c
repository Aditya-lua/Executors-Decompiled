
void FUN_004decb0(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  undefined8 in_stack_00000048;
  
  while ((*(long *)(unaff_x21 + 0x220) != unaff_x22 ||
         (iVar2 = _memcmp(*(undefined8 *)(unaff_x21 + 0x218),unaff_x23,unaff_x22), iVar2 != 0))) {
    unaff_x28 = unaff_x28 + -600;
    unaff_x21 = unaff_x21 + 600;
    if (unaff_x28 == 0) {
      if (unaff_x25 == unaff_x24) {
        *unaff_x20 = unaff_x25;
        *unaff_x19 = 0x8000000000000000;
        return;
      }
      unaff_x23 = *unaff_x25;
      unaff_x22 = unaff_x25[1];
      unaff_x21 = unaff_x26;
      unaff_x25 = unaff_x25 + 2;
      unaff_x28 = unaff_x27;
    }
  }
  *unaff_x20 = unaff_x25;
  if ((*(long *)(unaff_x21 + 0x228) == 0) && (*(int *)(unaff_x21 + 0x248) == 0x110000)) {
    func_0x0050d570(unaff_x21);
  }
  else {
    uStack0000000000000020 = 0;
    in_stack_00000028 = 1;
    in_stack_00000048 = 0xe0000020;
    uStack0000000000000038 = &uStack0000000000000020;
    in_stack_00000030 = 0;
    in_stack_00000040 = &UNK_009e7f30;
    iVar2 = func_0x0050f9f0(unaff_x21,&uStack0000000000000038);
    if (iVar2 != 0) {
      func_0x007a2810(&UNK_008a34d0,0x37);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x4dede8);
      (*pcVar1)();
    }
    in_stack_00000008 = in_stack_00000028;
    in_stack_00000000 = uStack0000000000000020;
    in_stack_00000010 = in_stack_00000030;
  }
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = in_stack_00000010;
  return;
}

