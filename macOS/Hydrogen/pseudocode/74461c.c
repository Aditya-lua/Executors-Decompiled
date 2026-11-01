
undefined8 FUN_0074461c(long param_1)

{
  int iVar1;
  undefined1 *puVar2;
  uint uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  
  *(long *)(unaff_x19 + 0x490) = param_1;
  if (param_1 == 0) {
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x488));
    *(undefined8 *)(unaff_x19 + 0x488) = 0;
    (*pcRam0000000000a2b5f0)();
    return 0x1b;
  }
  *(long **)(unaff_x20 + 0x1b0) = unaff_x21;
  lVar4 = *(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                   unaff_x20 + 0x18);
  *unaff_x21 = lVar4 + 1;
  puVar2 = (undefined1 *)_strstr(lVar4 + 1,";type=");
  if ((puVar2 != (undefined1 *)0x0) ||
     (puVar2 = (undefined1 *)_strstr(*(undefined8 *)(unaff_x19 + 0x58),";type="),
     puVar2 != (undefined1 *)0x0)) {
    *puVar2 = 0;
    iVar1 = func_0x0077e6d0((long)(char)puVar2[6]);
    if (iVar1 == 0x44) {
      uVar3 = *(uint *)(&UNK_00001344 + unaff_x20) | 0x8000;
    }
    else if (iVar1 == 0x41) {
      uVar3 = *(uint *)(&UNK_00001344 + unaff_x20) | 0x4000;
    }
    else {
      uVar3 = *(uint *)(&UNK_00001344 + unaff_x20) & 0xffffbfff;
    }
    *(uint *)(&UNK_00001344 + unaff_x20) = uVar3;
  }
  *(undefined4 *)(unaff_x21 + 2) = 0;
  unaff_x21[3] = 0;
  *(undefined8 *)(unaff_x19 + 0x4d8) = 0xffffffffffffffff;
  *(undefined1 *)(unaff_x19 + 0x4f8) = *(undefined1 *)(unaff_x20 + 0xa14);
  *(undefined1 *)(unaff_x19 + 0x4f9) = *(undefined1 *)(unaff_x20 + 0x6be);
  if (-1 < *(char *)(unaff_x20 + 0xa1d)) {
    return 0;
  }
  if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
               unaff_x20 + 0x18) == 0) {
    if (iRam0000000000a2b570 < 1) {
      return 0;
    }
  }
  else {
    if (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x20 + 0x18) + 8) < 1) {
      return 0;
    }
    if (iRam0000000000a2b570 < 1) {
      return 0;
    }
  }
  func_0x0073cfbc();
  return 0;
}

