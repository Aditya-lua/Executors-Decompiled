
undefined8 FUN_006db7b4(undefined8 param_1,long param_2)

{
  long lVar1;
  long unaff_x20;
  
  lVar1 = *(long *)(param_2 + 0x20);
  if (lVar1 == 0 || *(int *)(lVar1 + 8) != iRam0000000000a27ad8) {
    if (lVar1 != 0 && *(int *)(lVar1 + 8) == iRam0000000000a27ae8) {
      func_0x006dbd2c(param_1,*(undefined8 *)(lVar1 + 0x20),*(undefined8 *)(lVar1 + 0x28));
    }
  }
  else {
    func_0x006dbc08(param_1,*(undefined8 *)(lVar1 + 0x20),*(undefined8 *)(lVar1 + 0x28));
  }
  (**(code **)**(undefined8 **)(unaff_x20 + 0x28))(*(undefined8 **)(unaff_x20 + 0x28),param_1);
  return 0;
}

