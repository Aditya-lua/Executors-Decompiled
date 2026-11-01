
void FUN_000305d8(void)

{
  char cVar1;
  code *in_x9;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined7 uStack0000000000000028;
  char cStack000000000000002f;
  
  (*in_x9)();
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    __ZdlPv(*unaff_x19);
  }
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = in_stack_00000010;
  cVar1 = *(char *)((long)unaff_x19 + 0x17);
  if (cVar1 < '\0') {
    if ((unaff_x19[1] == 1) || (unaff_x19[1] == 0xc)) {
      if (&uStack0000000000000018 != unaff_x19) {
        func_0x00017784();
      }
    }
    else {
      *(undefined1 *)*unaff_x19 = 0;
      unaff_x19[1] = 0;
    }
  }
  else if ((cVar1 == '\x01') || (cVar1 == '\f')) {
    if (&uStack0000000000000018 != unaff_x19) {
      if (cStack000000000000002f < '\0') {
        func_0x000176c0();
      }
      else {
        unaff_x19[1] = in_stack_00000020;
        *unaff_x19 = uStack0000000000000018;
        unaff_x19[2] = CONCAT17(cStack000000000000002f,uStack0000000000000028);
      }
    }
  }
  else {
    *(undefined1 *)unaff_x19 = 0;
    *(undefined1 *)((long)unaff_x19 + 0x17) = 0;
  }
  if (cStack000000000000002f < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  return;
}

