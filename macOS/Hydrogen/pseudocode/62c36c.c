
undefined8 FUN_0062c36c(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined1 auStack_40 [8];
  ulong uStack_38;
  ulong uStack_30;
  long lStack_28;
  
  func_0x00677f58(auStack_40,param_2);
  uVar1 = func_0x00677180(param_1 + 0x38,auStack_40);
  if (uStack_30 <= uStack_38) {
    uStack_38 = uStack_30;
  }
  if (lStack_28 != 0) {
    if (uStack_38 != 0) {
      do {
        *(undefined8 *)(lStack_28 + -8 + uStack_38 * 8) = 0;
        uStack_38 = uStack_38 - 1;
      } while (uStack_38 != 0);
    }
    func_0x00611644();
  }
  return uVar1;
}

