
undefined8 FUN_004561e8(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  long *unaff_x19;
  undefined8 uStack0000000000000030;
  
  uVar1 = func_0x0046adc0(param_1 + 0xc43,1);
  uVar2 = 1;
  if ((uVar1 & 1) == 0) {
    if (unaff_x19[4] != 0) {
      uVar1 = func_0x00476678(&uStack0000000000000030);
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      if ((unaff_x19[4] != 0) && (uVar1 = func_0x0046adc0(&UNK_00890b53,1), (uVar1 & 1) != 0)) {
        return 1;
      }
    }
    if (*unaff_x19 == 0) {
      uVar2 = 0;
    }
    else {
      uVar2 = 0;
      *(int *)(unaff_x19 + 3) = (int)unaff_x19[3] + -1;
    }
  }
  return uVar2;
}

