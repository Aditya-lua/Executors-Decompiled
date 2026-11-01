
void FUN_00034ff0(void)

{
  long lVar1;
  undefined8 *unaff_x20;
  undefined8 *puVar2;
  undefined8 *unaff_x21;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x70) = 0x2a;
  if (unaff_x20 != unaff_x21) {
    do {
      puVar2 = unaff_x20 + 1;
      __ZdlPv(*unaff_x20);
      unaff_x20 = puVar2;
    } while (puVar2 != unaff_x21);
    lVar1 = *(long *)(unaff_x29 + -0x80);
    if (lVar1 != *(long *)(unaff_x29 + -0x88)) {
      *(ulong *)(unaff_x29 + -0x80) =
           lVar1 + ((*(long *)(unaff_x29 + -0x88) - lVar1) + 7U & 0xfffffffffffffff8);
    }
  }
  if (*(long *)(unaff_x29 + -0x90) != 0) {
    __ZdlPv();
  }
  return;
}

