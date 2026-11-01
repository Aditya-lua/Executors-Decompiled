
undefined1  [16] FUN_00060d64(void)

{
  undefined8 *puVar1;
  long *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  auVar3._0_8_ = (undefined8 *)__Znwm();
  uVar2 = *unaff_x21;
  auVar3._0_8_[5] = unaff_x21[1];
  auVar3._0_8_[4] = uVar2;
  auVar3._0_8_[6] = unaff_x21[2];
  *unaff_x21 = 0;
  unaff_x21[1] = 0;
  unaff_x21[2] = 0;
  *auVar3._0_8_ = 0;
  auVar3._0_8_[1] = 0;
  auVar3._0_8_[2] = unaff_x22;
  *unaff_x23 = auVar3._0_8_;
  puVar1 = auVar3._0_8_;
  if (*(long *)*unaff_x19 != 0) {
    *unaff_x19 = *(long *)*unaff_x19;
    puVar1 = (undefined8 *)*unaff_x23;
  }
  func_0x0003767c(unaff_x19[1],puVar1);
  unaff_x19[2] = unaff_x19[2] + 1;
  auVar3._8_8_ = 1;
  return auVar3;
}

