
undefined8 FUN_002fd3d4(void)

{
  uint uVar1;
  undefined8 *puVar2;
  long unaff_x20;
  long unaff_x21;
  
  *(undefined8 *)(unaff_x21 + 0x140) = *(undefined8 *)(unaff_x20 + 0x140);
  *(undefined8 *)(unaff_x20 + 0x140) = 0;
  puVar2 = *(undefined8 **)(unaff_x21 + 0x148);
  if (puVar2 != (undefined8 *)0x0) {
    uVar1 = *(uint *)((long)puVar2 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*puVar2);
      uVar1 = *(uint *)((long)puVar2 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *puVar2 = 0;
    }
    else {
      func_0x0036e3d8(puVar2);
    }
  }
  *(undefined8 *)(unaff_x21 + 0x148) = *(undefined8 *)(unaff_x20 + 0x148);
  *(undefined8 *)(unaff_x20 + 0x148) = 0;
  puVar2 = *(undefined8 **)(unaff_x21 + 0x150);
  if (puVar2 != (undefined8 *)0x0) {
    uVar1 = *(uint *)((long)puVar2 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*puVar2);
      uVar1 = *(uint *)((long)puVar2 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *puVar2 = 0;
    }
    else {
      func_0x0036e3d8(puVar2);
    }
  }
  *(undefined8 *)(unaff_x21 + 0x150) = *(undefined8 *)(unaff_x20 + 0x150);
  *(undefined8 *)(unaff_x20 + 0x150) = 0;
  puVar2 = *(undefined8 **)(unaff_x21 + 0x158);
  if (puVar2 != (undefined8 *)0x0) {
    uVar1 = *(uint *)((long)puVar2 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*puVar2);
      uVar1 = *(uint *)((long)puVar2 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *puVar2 = 0;
    }
    else {
      func_0x0036e3d8(puVar2);
    }
  }
  *(undefined8 *)(unaff_x21 + 0x158) = *(undefined8 *)(unaff_x20 + 0x158);
  *(undefined8 *)(unaff_x20 + 0x158) = 0;
  *(byte *)(unaff_x21 + 0x180) =
       *(byte *)(unaff_x21 + 0x180) & 0xfe | *(byte *)(unaff_x20 + 0x180) & 1;
  func_0x002f7efc();
  return 1;
}

