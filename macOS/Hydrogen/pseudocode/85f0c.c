
long FUN_00085f0c(long param_1)

{
  long lVar1;
  long in_x9;
  long *unaff_x19;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  undefined1 *puVar2;
  undefined8 uVar3;
  
  lVar1 = in_x9 + 0x10;
  if (unaff_x22 == unaff_x21) {
    puVar2 = unaff_x22;
  }
  else {
    do {
      uVar3 = *(undefined8 *)(unaff_x22 + -0x10);
      *(undefined8 *)(in_x9 + -8) = *(undefined8 *)(unaff_x22 + -8);
      *(undefined8 *)(in_x9 + -0x10) = uVar3;
      in_x9 = in_x9 + -0x10;
      unaff_x22[-0x10] = 0;
      *(undefined8 *)(unaff_x22 + -8) = 0;
      unaff_x22 = unaff_x22 + -0x10;
    } while (unaff_x22 != unaff_x21);
    unaff_x22 = (undefined1 *)*unaff_x19;
    puVar2 = (undefined1 *)unaff_x19[1];
  }
  *unaff_x19 = in_x9;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = param_1;
  while (puVar2 != unaff_x22) {
    func_0x00078220(puVar2 + -8,puVar2[-0x10]);
    puVar2 = puVar2 + -0x10;
  }
  if (unaff_x22 != (undefined1 *)0x0) {
    __ZdlPv(unaff_x22);
  }
  return lVar1;
}

