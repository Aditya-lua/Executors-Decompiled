
undefined8 FUN_00091634(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  
  lVar2 = func_0x006e33ec(param_2,1);
  uVar3 = func_0x006e67c8(param_2,2,0);
  iVar1 = _strcmp(uVar3,"Position");
  if (iVar1 == 0) {
    puVar4 = (undefined8 *)func_0x006e3790(param_2,3);
    *(undefined8 *)(lVar2 + 0x30) = *puVar4;
    return 0;
  }
  iVar1 = _strcmp(uVar3,"Size");
  if (iVar1 == 0) {
    puVar4 = (undefined8 *)func_0x006e3790(param_2,3);
    *(undefined8 *)(lVar2 + 0x28) = *puVar4;
    return 0;
  }
  iVar1 = _strcmp(uVar3,"Rounding");
  if (iVar1 == 0) {
    uVar3 = func_0x006e6a4c(param_2,3);
    *(undefined8 *)(lVar2 + 0x38) = uVar3;
    return 0;
  }
  uVar3 = _strcmp(uVar3,"Data");
  if ((int)uVar3 != 0) {
    func_0x00091104(uVar3,param_2);
  }
  return 0;
}

