
void FUN_00082f3c(long param_1)

{
  undefined1 *puVar1;
  long in_x9;
  long in_x10;
  long in_x11;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined1 *puVar2;
  undefined8 uVar3;
  
  while (in_x11 != in_x10) {
    uVar3 = *(undefined8 *)(unaff_x22 + -0x10);
    *(undefined8 *)(in_x9 + -8) = *(undefined8 *)(unaff_x22 + -8);
    *(undefined8 *)(in_x9 + -0x10) = uVar3;
    in_x9 = in_x9 + -0x10;
    *(undefined1 *)(unaff_x22 + -0x10) = 0;
    *(undefined8 *)(unaff_x22 + -8) = 0;
    in_x11 = unaff_x22 + -0x10;
    unaff_x22 = in_x11;
  }
  puVar1 = (undefined1 *)*unaff_x19;
  puVar2 = (undefined1 *)unaff_x19[1];
  *unaff_x19 = in_x9;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = param_1;
  while (puVar2 != puVar1) {
    func_0x00078220(puVar2 + -8,puVar2[-0x10]);
    puVar2 = puVar2 + -0x10;
  }
  if (puVar1 != (undefined1 *)0x0) {
    __ZdlPv(puVar1);
  }
  return;
}

