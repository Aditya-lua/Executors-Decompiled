
void FUN_004def1c(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  do {
    if (unaff_x22 == unaff_x21) {
      if ((*(long *)(unaff_x20 + 0x30) != 0) && (*(long *)(unaff_x20 + 0x40) != 0)) {
        func_0x00187bd4(*(long *)(unaff_x20 + 0x30),*(long *)(unaff_x20 + 0x40) << 4,8);
      }
      *(undefined8 *)(unaff_x20 + 0x30) = 0;
      *unaff_x19 = -0x8000000000000000;
      return;
    }
    uVar1 = *unaff_x22;
    uVar2 = unaff_x22[1];
    *(undefined8 **)(unaff_x20 + 0x38) = unaff_x22 + 2;
    func_0x00521640(&uStack0000000000000018,&uStack0000000000000010,uVar1,uVar2);
    unaff_x22 = unaff_x22 + 2;
  } while (uStack0000000000000018 == unaff_x23);
  *unaff_x19 = uStack0000000000000018;
  unaff_x19[2] = in_stack_00000028;
  unaff_x19[1] = in_stack_00000020;
  return;
}

