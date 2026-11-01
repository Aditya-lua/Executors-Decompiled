
void FUN_006f3f1c(void)

{
  long lVar1;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x25;
  
  (**(code **)(unaff_x25 + 0x10))(*(undefined8 *)(unaff_x25 + 0x18));
  *(long *)(unaff_x25 + 0x48) = (unaff_x20 - unaff_x21) + *(long *)(unaff_x25 + 0x48);
  lVar1 = unaff_x25 + (unaff_x22 & 0xffffffff) * 8;
  *(long *)(lVar1 + 0x560) = (unaff_x20 - unaff_x21) + *(long *)(lVar1 + 0x560);
  if (*(code **)(unaff_x25 + 0x520) != (code *)0x0) {
    (**(code **)(unaff_x25 + 0x520))();
  }
  return;
}

