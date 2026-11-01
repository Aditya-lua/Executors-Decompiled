
void FUN_004a9f20(long param_1,long *param_2)

{
  undefined8 uVar1;
  long *plVar2;
  long *plVar3;
  long *in_x9;
  long *plVar4;
  undefined8 *unaff_x19;
  long *plVar5;
  
  if (param_2 == (long *)0x0) {
    for (; param_1 != 0; param_1 = param_1 + -1) {
      in_x9 = (long *)in_x9[0x70];
    }
    plVar4 = (long *)*in_x9;
    plVar5 = (long *)0x0;
    param_2 = in_x9;
  }
  else {
    plVar4 = (long *)*param_2;
    plVar5 = in_x9;
  }
  if (plVar4 != (long *)0x0) {
    plVar2 = param_2;
    plVar3 = plVar5;
    do {
      param_2 = plVar4;
      plVar5 = (long *)((long)plVar3 + 1);
      uVar1 = 0x380;
      if (plVar3 != (long *)0x0) {
        uVar1 = 0x3e0;
      }
      func_0x00187bd4(plVar2,uVar1,8);
      plVar2 = param_2;
      plVar3 = plVar5;
      plVar4 = (long *)*param_2;
    } while ((long *)*param_2 != (long *)0x0);
  }
  uVar1 = 0x380;
  if (plVar5 != (long *)0x0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(param_2,uVar1,8);
  *unaff_x19 = 0;
  return;
}

