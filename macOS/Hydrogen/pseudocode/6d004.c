
void FUN_0006d004(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  
  if (unaff_x21 < 0x17) {
    *(char *)((long)unaff_x19 + 0x17) = (char)unaff_x21;
    puVar2 = unaff_x19;
    if (unaff_x21 == 0) {
      *(undefined1 *)unaff_x19 = 0;
      return;
    }
  }
  else {
    uVar1 = (unaff_x21 & 0xfffffffffffffff8) + 8;
    if ((unaff_x21 | 7) != 0x17) {
      uVar1 = unaff_x21 | 7;
    }
    puVar2 = (undefined8 *)__Znwm(uVar1 + 1);
    unaff_x19[1] = unaff_x21;
    unaff_x19[2] = uVar1 + 1 | 0x8000000000000000;
    *unaff_x19 = puVar2;
  }
  _memmove(puVar2,unaff_x20 + unaff_x23);
  *(undefined1 *)((long)puVar2 + unaff_x21) = 0;
  return;
}

