
undefined8 FUN_0073ecf4(void)

{
  int iVar1;
  long unaff_x19;
  undefined8 *puVar2;
  undefined4 *unaff_x20;
  long unaff_x22;
  
  iVar1 = func_0x0073ed38();
  if (iVar1 == 0) {
    *(int *)(unaff_x22 + 0x478) = *(int *)(unaff_x22 + 0x478) + 1;
    *unaff_x20 = 1;
  }
  else {
    puVar2 = *(undefined8 **)(unaff_x19 + 0x1b8);
    if (puVar2 != (undefined8 *)0x0) {
      func_0x0073fefc();
      func_0x00779fa4(*puVar2);
      **(undefined8 **)(unaff_x19 + 0x1b8) = 0;
      (*pcRam0000000000a2b5f0)();
      *(undefined8 *)(unaff_x19 + 0x1b8) = 0;
    }
  }
  return 0;
}

