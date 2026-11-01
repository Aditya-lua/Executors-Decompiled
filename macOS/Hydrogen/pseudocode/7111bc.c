
void FUN_007111bc(void)

{
  undefined8 *puVar1;
  ulong in_x9;
  ulong uVar2;
  long unaff_x20;
  long *unaff_x21;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined8 uVar3;
  
  while (unaff_x23 < unaff_x24) {
    uVar3 = *(undefined8 *)(*(long *)(*unaff_x21 + in_x9 * 8 + -8) + 0x18);
    puVar1 = (undefined8 *)func_0x006db828();
    *puVar1 = uVar3;
    in_x9 = in_x9 - 1;
    unaff_x24 = in_x9;
  }
  uVar2 = *(long *)(unaff_x20 + 0x198) - *(long *)(unaff_x20 + 400) >> 3;
  if (uVar2 < unaff_x23) {
    func_0x006cfeb0();
  }
  else if (unaff_x23 < uVar2) {
    *(ulong *)(unaff_x20 + 0x198) = *(long *)(unaff_x20 + 400) + unaff_x23 * 8;
  }
  return;
}

