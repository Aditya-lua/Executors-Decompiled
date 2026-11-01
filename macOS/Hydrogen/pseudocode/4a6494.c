
void FUN_004a6494(void)

{
  long *plVar1;
  long lVar2;
  long *in_x9;
  long lVar3;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x29;
  long lVar4;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  
  plVar1 = (long *)unaff_x20[10];
  if (plVar1 != in_x9) {
    lVar3 = *plVar1;
    unaff_x20[10] = plVar1 + 4;
    if (lVar3 != 0) {
      in_stack_00000038 = plVar1[2];
      in_stack_00000030 = plVar1[1];
      in_stack_00000040 = plVar1[3];
      uStack0000000000000028 = lVar3;
      (*(code *)*unaff_x20)(unaff_x29 + -0x38,&uStack0000000000000028);
      lVar2 = *(long *)(unaff_x29 + -0x38);
      lVar4 = *(long *)(unaff_x29 + -0x30);
      lVar3 = -0x8000000000000000;
      if (lVar2 != -0x8000000000000000) {
        unaff_x19[2] = *(long *)(unaff_x29 + -0x28);
        unaff_x19[1] = lVar4;
        unaff_x20[0xd] = unaff_x20[0xd] + -1;
        lVar3 = lVar2;
      }
      goto LAB_004a651c;
    }
  }
  func_0x004b7fe4();
  *unaff_x21 = 0;
  lVar3 = -0x8000000000000000;
LAB_004a651c:
  *unaff_x19 = lVar3;
  return;
}

