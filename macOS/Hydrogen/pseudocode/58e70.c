
void FUN_00058e70(long *param_1,long *param_2)

{
  undefined1 in_ZR;
  long *plVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  do {
    if ((bool)in_ZR) {
      lVar2 = 4;
LAB_00058e88:
      (**(code **)(*param_1 + lVar2 * 8))();
    }
    else if (param_2 != (long *)0x0) {
      lVar2 = 5;
      param_1 = param_2;
      goto LAB_00058e88;
    }
    plVar1 = *(long **)(unaff_x21 + -0x28);
    *(undefined8 *)(unaff_x21 + -0x28) = 0;
    if (plVar1 != (long *)0x0) {
      (**(code **)(*plVar1 + 8))();
    }
    if (unaff_x21 + -0x28 == unaff_x20) {
      unaff_x19[1] = unaff_x20;
      __ZdlPv(*unaff_x19);
      return;
    }
    param_1 = (long *)(unaff_x21 + -0x48);
    param_2 = *(long **)(unaff_x21 + -0x30);
    in_ZR = param_1 == param_2;
    unaff_x21 = unaff_x21 + -0x28;
  } while( true );
}

