
void FUN_0066f958(undefined1 param_1)

{
  undefined1 uVar1;
  undefined8 uVar2;
  int in_w8;
  long unaff_x19;
  
  uVar1 = 0;
  if (in_w8 != 0) {
    uVar1 = param_1;
  }
  *(undefined1 *)(unaff_x19 + 0x48) = uVar1;
  uVar2 = (**(code **)(**(long **)(unaff_x19 + 0x38) + 0x50))
                    (*(long **)(unaff_x19 + 0x38),*(undefined8 *)(unaff_x19 + 0x30));
  if (*(long **)(unaff_x19 + 0x40) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x40) + 8))();
  }
  *(undefined8 *)(unaff_x19 + 0x40) = uVar2;
  return;
}

