
undefined8 FUN_006f32a0(undefined8 param_1)

{
  undefined8 uVar1;
  double dVar2;
  double dVar3;
  double dVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  dVar2 = (double)func_0x006e6a4c(param_1,1);
  dVar3 = (double)func_0x006e6a4c(param_1,2);
  dVar4 = (double)func_0x006e6a4c(param_1,3);
  if (dVar3 <= dVar4) {
    if (dVar3 <= dVar2) {
      dVar3 = dVar2;
    }
    if (dVar3 <= dVar4) {
      dVar4 = dVar3;
    }
    func_0x006e3850(dVar4,param_1);
    return 1;
  }
  uVar1 = func_0x006e63b0(param_1,3,"max must be greater than or equal to min");
  dVar4 = (double)func_0x006e6a4c(uVar1,1);
  uVar5 = 0xbff0000000000000;
  if (0.0 <= dVar4) {
    uVar5 = 0;
  }
  uVar6 = 0x3ff0000000000000;
  if (dVar4 <= 0.0) {
    uVar6 = uVar5;
  }
  func_0x006e3850(uVar6,uVar1);
  return 1;
}

