
undefined8 FUN_006db6e4(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  ulong uVar3;
  
  if (*(long *)(param_2 + 0x28) != 0) {
    uVar3 = 0;
    do {
      lVar2 = *(long *)(*(long *)(unaff_x19 + 0x20) + uVar3 * 8);
      if (lVar2 == 0 || *(int *)(lVar2 + 8) != iRam0000000000a27ad8) {
        if (lVar2 != 0 && *(int *)(lVar2 + 8) == iRam0000000000a27ae8) {
          func_0x006dbd2c(param_1,*(undefined8 *)(lVar2 + 0x20),*(undefined8 *)(lVar2 + 0x28));
        }
      }
      else {
        func_0x006dbc08(param_1,*(undefined8 *)(lVar2 + 0x20),*(undefined8 *)(lVar2 + 0x28));
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < *(ulong *)(unaff_x19 + 0x28));
  }
  if (*(long *)(unaff_x19 + 0x38) != 0) {
    uVar3 = 0;
    do {
      puVar1 = *(undefined8 **)(*(long *)(unaff_x19 + 0x30) + uVar3 * 8);
      (**(code **)*puVar1)(puVar1,param_1);
      uVar3 = uVar3 + 1;
    } while (uVar3 < *(ulong *)(unaff_x19 + 0x38));
  }
  return 0;
}

