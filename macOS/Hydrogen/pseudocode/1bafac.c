
undefined8 FUN_001bafac(void)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long lStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x00187bd4();
  plVar2 = (long *)__Unwind_Resume();
  if (((*plVar2 < -0x7fffffffffffffea) || (plVar2[8] == 0)) ||
     (lVar1 = plVar2[7] + plVar2[8] * 0x40, *(long *)(lVar1 + -0x40) != -0x7ffffffffffffff6)) {
    uVar3 = 0;
  }
  else {
    lStack_38 = 0;
    uStack_30 = 1;
    uStack_28 = 0;
    func_0x001a5ffc(lVar1 + -0x20,&lStack_38);
    uVar3 = uStack_28;
    if (lStack_38 != 0) {
      func_0x00187bd4(uStack_30,lStack_38,1);
    }
  }
  return uVar3;
}

