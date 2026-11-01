
byte FUN_00053830(void)

{
  int iVar1;
  ulong uVar2;
  int in_w8;
  byte *unaff_x19;
  undefined8 *unaff_x20;
  byte bVar3;
  
  if (in_w8 == 0x74) {
    bVar3 = 4;
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) goto LAB_00053b94;
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) {
      bVar3 = 0xb;
      goto LAB_00053b94;
    }
  }
  else if (in_w8 == 0x61) {
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) {
      bVar3 = 0xd;
      goto LAB_00053b94;
    }
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) {
      bVar3 = 3;
      goto LAB_00053b94;
    }
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) {
      bVar3 = 5;
      goto LAB_00053b94;
    }
    uVar2 = func_0x00053bb8();
    if ((uVar2 & 1) != 0) {
      bVar3 = 10;
      goto LAB_00053b94;
    }
  }
  if ((char)unaff_x19[0x1f] < '\0') {
    if (0x15 < *(ulong *)(unaff_x19 + 0x10)) {
      unaff_x20 = (undefined8 *)*unaff_x20;
      goto code_r0x00053b00;
    }
  }
  else if (0x15 < unaff_x19[0x1f]) {
code_r0x00053b00:
    if ((*(long *)((long)unaff_x20 + 3) == 0x6574707972636e65 &&
        *(long *)((long)unaff_x20 + 0xb) == 0x6469746573736164) &&
        *(long *)((long)unaff_x20 + 0xe) == 0x2f2f3a6469746573) {
      bVar3 = 6;
      goto LAB_00053b94;
    }
  }
  uVar2 = func_0x00053bb8();
  if ((uVar2 & 1) == 0) {
    iVar1 = func_0x00053bb8();
    bVar3 = 0xc;
    if (iVar1 == 0) {
      bVar3 = 1;
    }
  }
  else {
    bVar3 = 9;
  }
LAB_00053b94:
  *unaff_x19 = *unaff_x19 & 0xf0 | bVar3;
  return bVar3;
}

