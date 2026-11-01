
undefined8 FUN_0073ec74(void)

{
  int iVar1;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 *puVar2;
  long unaff_x22;
  long unaff_x25;
  
  iVar1 = func_0x0073ed38();
  if (iVar1 == 0) {
    *(int *)(unaff_x22 + 0x478) = *(int *)(unaff_x22 + 0x478) + 1;
    if ((*(char *)(unaff_x25 + 0x52b) != '\x01') && (iVar1 = func_0x0074f64c(), iVar1 != 0)) {
      iVar1 = func_0x0073ed38();
      if (iVar1 != 0) goto code_r0x0073ec88;
      *(int *)(unaff_x22 + 0x478) = *(int *)(unaff_x22 + 0x478) + 1;
    }
    *unaff_x20 = 1;
  }
  else {
code_r0x0073ec88:
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

