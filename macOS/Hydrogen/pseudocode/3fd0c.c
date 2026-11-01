
void FUN_0003fd0c(undefined8 param_1)

{
  long *plVar1;
  long unaff_x19;
  undefined1 unaff_w20;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar2;
  
  func_0x0003fdb0(param_1,unaff_x22 + 0x18);
  uVar2 = *(undefined8 *)(unaff_x21 + 8);
  *(undefined8 *)(unaff_x21 + 8) = 0;
  if (*(long **)(unaff_x19 + 0x18) == (long *)0x0) {
    *(undefined8 *)(unaff_x19 + 0x18) = uVar2;
  }
  else {
    (**(code **)(**(long **)(unaff_x19 + 0x18) + 8))();
    plVar1 = *(long **)(unaff_x21 + 8);
    *(undefined8 *)(unaff_x19 + 0x18) = uVar2;
    if (plVar1 != (long *)0x0) {
      (**(code **)(*plVar1 + 8))();
    }
  }
  *(long *)(unaff_x21 + 8) = unaff_x19;
  *(undefined1 *)(unaff_x21 + 0x10) = unaff_w20;
  return;
}

