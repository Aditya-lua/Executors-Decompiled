
void FUN_004e8ff0(long param_1)

{
  long lVar1;
  uint uVar2;
  long *unaff_x19;
  long unaff_x21;
  byte *unaff_x22;
  long unaff_x24;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  
  lStack0000000000000018 = 1;
  lVar1 = lStack0000000000000018;
  for (; unaff_x24 != unaff_x21; unaff_x24 = unaff_x24 + 600) {
    while ((((*(long *)(unaff_x24 + 0x228) != 0 || (*(int *)(unaff_x24 + 0x248) != 0x110000)) ||
            (*(int *)(unaff_x24 + 0x38) == 1 && *(long *)(unaff_x24 + 0x40) != 0)) ||
           ((uVar2 = *(uint *)(unaff_x24 + 0x250), (uVar2 >> 2 & 1) != 0 ||
            ((((uVar2 >> 0xd & 1) != 0 || ((*unaff_x22 & 1) == 0)) &&
             (((uVar2 >> 3 & 1) == 0 && ((*unaff_x22 & 1) != 0 || (uVar2 & 0x1000) != 0))))))))) {
      unaff_x24 = unaff_x24 + 600;
      if (unaff_x24 == unaff_x21) goto LAB_004e90a4;
    }
    if (lVar1 == uStack0000000000000008) {
      lStack0000000000000018 = lVar1;
      func_0x007a5594(&uStack0000000000000008,lVar1,1,8,8);
      param_1 = in_stack_00000010;
    }
    *(long *)(param_1 + lVar1 * 8) = unaff_x24;
    lVar1 = lVar1 + 1;
  }
LAB_004e90a4:
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = lVar1;
  return;
}

