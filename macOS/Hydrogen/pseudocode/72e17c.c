
void FUN_0072e17c(undefined8 param_1,long param_2)

{
  long lVar1;
  byte bVar2;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long lVar3;
  
  if ((((param_2 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x20 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x19 + 0xc))) {
    func_0x0073cbdc();
    unaff_x21 = (ulong)*(uint *)(unaff_x22 + 0x98);
  }
  lVar3 = unaff_x19[3];
  lVar1 = lVar3 + (long)(int)unaff_x19[4] * 4;
  if ((int)unaff_x21 == *(int *)(lVar1 + 0x238)) {
    *(undefined4 *)(lVar1 + 0x238) = 0xffffffff;
    unaff_x21 = (ulong)*(uint *)(unaff_x22 + 0x98);
  }
  if ((int)unaff_x21 != -1) {
    if (((*(byte *)(unaff_x22 + 0x134) >> 2 & 1) == 0) && (*(long *)(lVar3 + 0x20) != 0)) {
      func_0x0076b038();
      func_0x0076bad4();
      (**(code **)(lVar3 + 0x20))(*(undefined8 *)(lVar3 + 0x28),unaff_x21);
      func_0x0076bad4();
    }
    else {
      func_0x0076b038();
      _close(unaff_x21);
    }
  }
  *(undefined4 *)(unaff_x22 + 0x98) = 0xffffffff;
  bVar2 = *(byte *)(unaff_x22 + 0x134);
  if (((bVar2 >> 4 & 1) != 0) && ((int)unaff_x19[4] == 0)) {
    *(undefined8 *)(unaff_x19[3] + 0x50) = 0;
    bVar2 = *(byte *)(unaff_x22 + 0x134);
  }
  *(byte *)(unaff_x22 + 0x134) = bVar2 & 0xef;
  *(undefined8 *)(unaff_x22 + 0x100) = 0;
  *(undefined8 *)(unaff_x22 + 0x108) = 0;
  *(undefined8 *)(unaff_x22 + 0x110) = 0;
  *(undefined8 *)(unaff_x22 + 0x118) = 0;
  *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) & 0xfe;
  return;
}

