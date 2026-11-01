
undefined1  [16] thunk_FUN_00083b44(void)

{
  undefined8 *puVar1;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x22;
  undefined8 unaff_x24;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  
  auVar4._0_8_ = (undefined8 *)__Znwm(0x48);
  puVar1 = (undefined8 *)*unaff_x20;
  if (*(char *)((long)puVar1 + 0x17) < '\0') {
    func_0x00017634(auVar4._0_8_ + 4,*puVar1,puVar1[1]);
  }
  else {
    uVar3 = puVar1[1];
    uVar2 = *puVar1;
    auVar4._0_8_[6] = puVar1[2];
    auVar4._0_8_[5] = uVar3;
    auVar4._0_8_[4] = uVar2;
  }
  *(undefined1 *)(auVar4._0_8_ + 7) = 0;
  auVar4._0_8_[8] = 0;
  *auVar4._0_8_ = 0;
  auVar4._0_8_[1] = 0;
  auVar4._0_8_[2] = unaff_x24;
  *unaff_x22 = auVar4._0_8_;
  puVar1 = auVar4._0_8_;
  if (*(long *)*unaff_x19 != 0) {
    *unaff_x19 = *(long *)*unaff_x19;
    puVar1 = (undefined8 *)*unaff_x22;
  }
  func_0x0003767c(unaff_x19[1],puVar1);
  unaff_x19[2] = unaff_x19[2] + 1;
  auVar4._8_8_ = 1;
  return auVar4;
}

