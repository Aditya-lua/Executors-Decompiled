
void FUN_00035880(void)

{
  long lVar1;
  undefined1 in_ZR;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  
  while (!(bool)in_ZR) {
    __ZdlPv(*unaff_x20);
    in_ZR = unaff_x20 + 1 == unaff_x21;
    unaff_x20 = unaff_x20 + 1;
  }
  lVar1 = unaff_x19[2];
  if (lVar1 != unaff_x19[1]) {
    unaff_x19[2] = lVar1 + ((unaff_x19[1] - lVar1) + 7U & 0xfffffffffffffff8);
  }
  if (*unaff_x19 != 0) {
    __ZdlPv();
  }
  return;
}

