
long FUN_00086224(void)

{
  bool in_CY;
  undefined8 *puVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x24;
  undefined8 uVar2;
  
  if (in_CY) {
    puVar1 = (undefined8 *)func_0x00086484();
  }
  else {
    unaff_x24[1] = 0;
    *unaff_x24 = 0;
    *(undefined1 *)unaff_x24 = 3;
    puVar1 = (undefined8 *)__Znwm(0x18);
    if (*(char *)((long)unaff_x20 + 0x17) < '\0') {
      func_0x00017634(puVar1,*unaff_x20,unaff_x20[1]);
    }
    else {
      uVar2 = *unaff_x20;
      puVar1[1] = unaff_x20[1];
      *puVar1 = uVar2;
      puVar1[2] = unaff_x20[2];
    }
    unaff_x24[1] = puVar1;
    puVar1 = unaff_x24 + 2;
    *(undefined8 **)(unaff_x21 + 8) = puVar1;
  }
  *(undefined8 **)(unaff_x21 + 8) = puVar1;
  return *(long *)(*(long *)(*(long *)(*(long *)(unaff_x19 + 0x10) + -8) + 8) + 8) + -0x10;
}

