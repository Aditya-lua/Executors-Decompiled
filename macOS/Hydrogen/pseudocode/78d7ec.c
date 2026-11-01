
long FUN_0078d7ec(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  int *piVar3;
  undefined4 *unaff_x19;
  undefined8 *unaff_x21;
  long lVar4;
  long unaff_x29;
  byte bStack000000000000003b;
  undefined4 uStack000000000000003c;
  
  bStack000000000000003b = (byte)param_4 | 0x80;
  *unaff_x21 = param_4;
  unaff_x21[1] = param_4;
  if (((param_1 != 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                param_1 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_1 + 0x18) + 8))))) {
    func_0x0073cab8(param_1,"WS-ENC: %s [%s%s%s payload=%ld/%ld]");
  }
  uStack000000000000003c = *(undefined4 *)((long)unaff_x21 + 0x14);
  lVar4 = 6;
  *(undefined4 *)(unaff_x21 + 2) = 0;
  lVar2 = func_0x00729948();
  if (-1 < lVar2) {
    if (lVar2 == 6) goto LAB_0078d648;
    *unaff_x19 = 0x37;
  }
  lVar4 = -1;
LAB_0078d648:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return lVar4;
  }
  piVar3 = (int *)___stack_chk_fail();
  lVar2 = 0;
  if (piVar3 != (int *)0x0) {
    if ((((*piVar3 == -0x3f212453) && (iVar1 = func_0x0076bb00(piVar3), iVar1 != 0)) &&
        (*(long *)(piVar3 + 6) != 0)) &&
       (lVar2 = *(long *)(*(long *)(piVar3 + 6) + 1000), lVar2 != 0)) {
      lVar2 = lVar2 + 0xd8;
      if ((*(byte *)((long)piVar3 + 0xa21) & 1) != 0) {
        lVar2 = 0;
      }
    }
    else {
      lVar2 = 0;
    }
  }
  return lVar2;
}

