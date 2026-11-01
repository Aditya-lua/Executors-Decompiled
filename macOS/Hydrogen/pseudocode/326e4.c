
void FUN_000326e4(void)

{
  undefined1 in_ZR;
  undefined8 *unaff_x19;
  undefined8 *unaff_x22;
  
  while (!(bool)in_ZR) {
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      __ZdlPv(*unaff_x19);
    }
    in_ZR = unaff_x19 == unaff_x22;
    unaff_x19 = unaff_x19 + -3;
  }
  if (unaff_x22 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  return;
}

