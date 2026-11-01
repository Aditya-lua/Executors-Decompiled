
undefined8 FUN_005f0124(long *param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  FUN_005f01d4(param_1,param_3);
  uVar3 = param_3;
  if (param_3 < 2) {
    uVar3 = 1;
  }
  lVar1 = func_0x006115d0(uVar3);
  (**(code **)(*param_1 + 0x80))(param_1,lVar1,param_3);
  uVar2 = func_0x0068566c(lVar1,param_2,param_3);
  if (lVar1 != 0) {
    do {
      *(undefined1 *)(lVar1 + uVar3 + -1) = 0;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
    func_0x00611644(lVar1);
  }
  return uVar2;
}

