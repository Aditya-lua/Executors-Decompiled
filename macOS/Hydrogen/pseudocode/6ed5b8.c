
undefined8 FUN_006ed5b8(undefined8 param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  plVar1 = (long *)func_0x006e1710();
  uVar3 = *(undefined8 *)(*plVar1 + 0x18);
  uVar2 = func_0x006ed614(uVar3,param_3);
  if ((int)uVar2 != -1) {
    func_0x006ed2b0(param_1,uVar3,uVar2,param_4 != 0);
  }
  return uVar2;
}

