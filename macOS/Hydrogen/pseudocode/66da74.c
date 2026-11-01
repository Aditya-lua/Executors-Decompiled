
void FUN_0066da74(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  do {
    *(undefined1 *)(unaff_x22 + -1 + param_1) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if ((int)unaff_x23 == 0) {
    lVar1 = 0;
  }
  else {
    lVar1 = func_0x006115d0();
  }
  unaff_x19[0x16] = lVar1;
  unaff_x19[0x14] = -1;
  unaff_x19[0x15] = unaff_x23;
  uVar2 = (**(code **)(*(long *)unaff_x19[0x17] + 0x50))((long *)unaff_x19[0x17],lVar1);
  plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  (**(code **)(*plVar3 + 0x38))(plVar3,lVar1,uVar2,0,1);
  return;
}

