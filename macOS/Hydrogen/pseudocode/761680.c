
void FUN_00761680(void)

{
  int iVar1;
  uint in_w8;
  byte *pbVar2;
  undefined8 *in_x10;
  uint in_w11;
  byte *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  
  while (in_w11 != in_w8) {
    pbVar2 = (byte *)*in_x10;
    in_x10 = in_x10 + 1;
    if (pbVar2 == (byte *)0x0) goto LAB_00761650;
LAB_0076167c:
    in_w11 = (uint)*pbVar2;
  }
  iVar1 = func_0x007408a0();
  do {
    if (iVar1 != 0) {
LAB_0076162c:
      func_0x00740a58();
      return;
    }
    unaff_x19 = unaff_x19 + 1;
    in_w8 = (uint)*unaff_x19;
    if (*unaff_x19 == 0) goto LAB_0076162c;
    pbVar2 = (byte *)*unaff_x20;
    in_x10 = unaff_x21;
    if (pbVar2 != (byte *)0x0) goto LAB_0076167c;
LAB_00761650:
    iVar1 = func_0x0074075c();
  } while( true );
}

