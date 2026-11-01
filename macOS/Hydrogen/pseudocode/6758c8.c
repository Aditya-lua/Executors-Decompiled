
void FUN_006758c8(long param_1,long param_2)

{
  undefined2 in_w8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  
  *(undefined2 *)(param_2 + 0x10) = in_w8;
  *(undefined8 *)(param_2 + 0x18) = 0;
  uVar1 = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(param_1 + 0x18) = 0;
  if (*(long **)(param_2 + 0x18) != (long *)0x0) {
    (**(code **)(**(long **)(param_2 + 0x18) + 8))();
  }
  unaff_x19[3] = uVar1;
  *(undefined1 *)(unaff_x20 + 0x11) = 1;
  *unaff_x19 = &UNK_00a0f028;
  *(undefined4 *)(unaff_x19 + 4) = *(undefined4 *)(unaff_x20 + 0x20);
  return;
}

