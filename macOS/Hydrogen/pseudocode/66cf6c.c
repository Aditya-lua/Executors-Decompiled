
undefined4 FUN_0066cf6c(long *param_1,uint param_2)

{
  int iVar1;
  undefined4 uVar2;
  uint uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  
  iVar1 = (**(code **)(*param_1 + 0x58))();
  if (iVar1 == 0) {
    uVar3 = (**(code **)(*param_1 + 0x28))(param_1);
    if (uVar3 < 2) {
      return 0;
    }
    uVar4 = (**(code **)(*param_1 + 0x80))(param_1);
    if (param_2 < 2) {
      return 0;
    }
    if ((uVar4 & 1) != 0) {
      return 0;
    }
    puVar5 = (undefined8 *)(*param_1 + 0x28);
  }
  else {
    puVar5 = (undefined8 *)(*param_1 + 0x58);
  }
  uVar2 = (*(code *)*puVar5)(param_1);
  return uVar2;
}

