
/* WARNING: Removing unreachable block (ram,0x0003fc34) */
/* WARNING: Removing unreachable block (ram,0x0003fc38) */
/* WARNING: Removing unreachable block (ram,0x0003fc3c) */
/* WARNING: Removing unreachable block (ram,0x0003fc48) */

void FUN_0003fb80(undefined8 param_1)

{
  undefined8 *puVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  
  puVar1 = (undefined8 *)func_0x005edf2c(param_1,0);
  *(undefined4 *)(puVar1 + 3) = 0xffffffff;
  *(undefined1 *)((long)puVar1 + 0x1c) = 0;
  *puVar1 = &UNK_00a0e578;
  puVar1[1] = &UNK_00a0e710;
  if (unaff_x20 != 0) {
    _strlen();
  }
  func_0x0003f610(unaff_x29 + -0x28,"InputBuffer");
  (**(code **)(*unaff_x19 + 0x180))();
  *(undefined **)(unaff_x29 + -0x28) = &UNK_009f6820;
  if (*(long **)(unaff_x29 + -0x20) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x20) + 8))();
  }
  return;
}

