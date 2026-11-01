
void FUN_0066488c(code *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  long *unaff_x22;
  
  uVar1 = (*param_1)(param_2,param_5);
  uVar2 = (ulong)uVar1;
  if (uVar1 == 0) {
    lVar3 = 0;
  }
  else {
    lVar3 = func_0x006115d0();
  }
  (**(code **)(*unaff_x22 + 0x90))();
  func_0x00611bb8();
  if (lVar3 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar3 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

