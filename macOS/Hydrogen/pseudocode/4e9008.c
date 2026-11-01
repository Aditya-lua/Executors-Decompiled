
void thunk_FUN_004e9018(long param_1)

{
  uint uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  long unaff_x23;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    while ((((*(long *)(unaff_x23 + 0x228) == 0 && (*(int *)(unaff_x23 + 0x248) == 0x110000)) &&
            (*(int *)(unaff_x23 + 0x38) != 1 || *(long *)(unaff_x23 + 0x40) == 0)) &&
           ((uVar1 = *(uint *)(unaff_x23 + 0x250), (uVar1 >> 2 & 1) == 0 &&
            ((((uVar1 >> 0xd & 1) == 0 && ((*unaff_x22 & 1) != 0)) ||
             (((uVar1 >> 3 & 1) != 0 || ((*unaff_x22 & 1) == 0 && (uVar1 & 0x1000) == 0))))))))) {
      if (unaff_x20 == uStack0000000000000008) {
        func_0x007a5594(&uStack0000000000000008,unaff_x20,1,8,8);
        param_1 = in_stack_00000010;
      }
      *(long *)(param_1 + unaff_x20 * 8) = unaff_x23;
      in_stack_00000018 = unaff_x20 + 1;
      if (unaff_x23 + 600 == unaff_x21) goto LAB_004e90a4;
      unaff_x23 = unaff_x23 + 600;
      unaff_x20 = in_stack_00000018;
    }
    unaff_x23 = unaff_x23 + 600;
  } while (unaff_x23 != unaff_x21);
LAB_004e90a4:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

