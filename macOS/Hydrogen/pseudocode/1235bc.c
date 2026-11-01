
void FUN_001235bc(undefined8 param_1,int param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  int in_w8;
  int unaff_w19;
  int *unaff_x20;
  
  if (in_w8 < param_2) {
    iVar1 = in_w8;
    if (in_w8 < 0) {
      iVar1 = in_w8 + 1;
    }
    iVar2 = 8;
    if (in_w8 != 0) {
      iVar2 = in_w8 + (iVar1 >> 1);
    }
    if (iVar2 <= unaff_w19) {
      iVar2 = unaff_w19;
    }
    uVar3 = func_0x000b810c((long)iVar2 * 0x18);
    if (*(long *)(unaff_x20 + 2) != 0) {
      _memcpy(uVar3,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x18);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
    }
    *(undefined8 *)(unaff_x20 + 2) = uVar3;
    unaff_x20[1] = iVar2;
  }
  *unaff_x20 = unaff_w19;
  return;
}

