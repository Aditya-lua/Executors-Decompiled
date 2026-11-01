
void FUN_0072e1d4(long param_1)

{
  byte bVar1;
  long unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  if ((int)unaff_x21 == *(int *)(param_1 + 0x238)) {
    *(undefined4 *)(param_1 + 0x238) = 0xffffffff;
    unaff_x21 = (ulong)*(uint *)(unaff_x22 + 0x98);
  }
  if ((int)unaff_x21 != -1) {
    if (((*(byte *)(unaff_x22 + 0x134) >> 2 & 1) == 0) && (*(long *)(unaff_x23 + 0x20) != 0)) {
      func_0x0076b038();
      func_0x0076bad4();
      (**(code **)(unaff_x23 + 0x20))(*(undefined8 *)(unaff_x23 + 0x28),unaff_x21);
      func_0x0076bad4();
    }
    else {
      func_0x0076b038();
      _close(unaff_x21);
    }
  }
  *(undefined4 *)(unaff_x22 + 0x98) = 0xffffffff;
  bVar1 = *(byte *)(unaff_x22 + 0x134);
  if (((bVar1 >> 4 & 1) != 0) && (*(int *)(unaff_x19 + 0x20) == 0)) {
    *(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 0x50) = 0;
    bVar1 = *(byte *)(unaff_x22 + 0x134);
  }
  *(byte *)(unaff_x22 + 0x134) = bVar1 & 0xef;
  *(undefined8 *)(unaff_x22 + 0x100) = 0;
  *(undefined8 *)(unaff_x22 + 0x108) = 0;
  *(undefined8 *)(unaff_x22 + 0x110) = 0;
  *(undefined8 *)(unaff_x22 + 0x118) = 0;
  *(byte *)(unaff_x19 + 0x24) = *(byte *)(unaff_x19 + 0x24) & 0xfe;
  return;
}

