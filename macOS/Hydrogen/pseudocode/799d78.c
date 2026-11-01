
void FUN_00799d78(long param_1,long *param_2,long param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x18);
  if (lVar2 == param_1) {
    uVar1 = 4;
  }
  else {
    if (lVar2 == 0) goto LAB_00799dac;
    uVar1 = 5;
    param_1 = lVar2;
  }
  func_0x0008a2bc(uVar1,param_1);
LAB_00799dac:
  if (*param_2 == param_3) {
    uVar1 = 4;
  }
  else {
    if (*param_2 == 0) {
      return;
    }
    uVar1 = 5;
  }
  func_0x0008a278(uVar1);
  return;
}

