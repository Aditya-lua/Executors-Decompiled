
void FUN_0002a698(void)

{
  bool in_CY;
  long lVar1;
  ulong in_x9;
  long in_x10;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x25;
  
  if (in_CY) {
    in_x9 = in_x10 + 1;
  }
  lVar1 = __Znwm(in_x9);
  _memcpy();
  if (unaff_x25 != 0x16) {
    __ZdlPv();
  }
  unaff_x19[2] = in_x9 | 0x8000000000000000;
  *unaff_x19 = lVar1;
  unaff_x19[1] = unaff_x20;
  *(undefined1 *)(lVar1 + unaff_x20) = 0;
  return;
}

