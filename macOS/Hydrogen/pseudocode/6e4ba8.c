
undefined8 FUN_006e4ba8(long *param_1)

{
  byte bVar1;
  long lVar2;
  long unaff_x19;
  
  if (*(int *)((long)param_1 + 0xc) == 9) {
    lVar2 = *(long *)(unaff_x19 + 8);
    *(undefined8 *)(*param_1 + 0x58) = *(undefined8 *)(lVar2 + -0x10);
    bVar1 = *(byte *)(*param_1 + 1);
  }
  else {
    if (*(int *)((long)param_1 + 0xc) != 7) {
      *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
      return 0;
    }
    lVar2 = *(long *)(unaff_x19 + 8);
    *(undefined8 *)(*param_1 + 0x10) = *(undefined8 *)(lVar2 + -0x10);
    bVar1 = *(byte *)(*param_1 + 1);
  }
  if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar2 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48();
  }
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return 1;
}

