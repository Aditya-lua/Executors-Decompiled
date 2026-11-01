
void FUN_00707dd4(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 *puVar2;
  long unaff_x20;
  long *plVar3;
  long lVar4;
  
  iVar1 = (**(code **)(param_1 + 0x188))(param_3);
  if (iVar1 != 0) {
    lVar4 = *(long *)(unaff_x20 + 0x68);
    if (cRam0000000000a337b8 == '\0') {
      if (lVar4 != 0) {
        plVar3 = (long *)(*(long *)(unaff_x20 + 0x60) + 8);
        lVar4 = lVar4 << 4;
        do {
          puVar2 = (undefined8 *)plVar3[-1];
          if (puVar2 == (undefined8 *)0x0) {
            puVar2 = (undefined8 *)*plVar3;
          }
          (**(code **)*puVar2)();
          plVar3 = plVar3 + 2;
          lVar4 = lVar4 + -0x10;
        } while (lVar4 != 0);
      }
    }
    else if (lVar4 != 0) {
      plVar3 = (long *)(*(long *)(unaff_x20 + 0x60) + 8);
      lVar4 = lVar4 << 4;
      do {
        puVar2 = (undefined8 *)plVar3[-1];
        if (puVar2 == (undefined8 *)0x0) {
          puVar2 = (undefined8 *)*plVar3;
        }
        (**(code **)*puVar2)();
        plVar3 = plVar3 + 2;
        lVar4 = lVar4 + -0x10;
      } while (lVar4 != 0);
    }
  }
  return;
}

