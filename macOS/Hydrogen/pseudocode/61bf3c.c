
void thunk_FUN_0061bf50(void)

{
  ulong uVar1;
  char in_ZR;
  int iVar2;
  ulong unaff_x19;
  long *unaff_x20;
  long *unaff_x23;
  ulong unaff_x25;
  ulong uVar3;
  
  iVar2 = (**(code **)(*unaff_x23 + 0x30))();
  uVar3 = unaff_x25 & 0xffffffff;
  if ((iVar2 == 0 || unaff_x19 < uVar3) || in_ZR == '\0') {
    if (unaff_x19 < uVar3) goto LAB_0061c024;
    do {
      (**(code **)(*unaff_x23 + 0x28))();
      (**(code **)(*unaff_x20 + 0x110))();
      unaff_x19 = unaff_x19 - uVar3;
    } while (uVar3 <= unaff_x19);
  }
  else {
    (**(code **)(unaff_x20[1] + 0x80))();
    uVar1 = 0;
    if (uVar3 != 0) {
      uVar1 = unaff_x19 / uVar3;
    }
    (**(code **)(*unaff_x23 + 0x38))();
    unaff_x19 = unaff_x19 - uVar1 * uVar3;
  }
  if (unaff_x19 == 0) {
    return;
  }
LAB_0061c024:
  (**(code **)(*unaff_x23 + 0x28))();
  (**(code **)(*unaff_x20 + 0x110))();
  unaff_x20[0xd] = uVar3 - unaff_x19;
  return;
}

