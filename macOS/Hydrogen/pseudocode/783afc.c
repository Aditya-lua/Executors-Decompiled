
undefined8 FUN_00783afc(long param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x18);
  *param_2 = 0;
  uVar3 = *(uint *)(&UNK_00001344 + param_1);
  if ((((uVar3 >> 0x13 & 1) == 0) ||
      ((*(uint *)(*(long *)(lVar4 + 0x3a0) + 0x94) & 0xc0040003) != 0)) &&
     (*(long *)(param_1 + 0xf8) + (ulong)*(uint *)(param_1 + 0x118) == 0)) {
    if ((((*(byte *)(lVar4 + 0x398) >> 6 & 1) == 0) ||
        (((*(byte *)(param_1 + 0x1c3) >> 1 & 1) != 0 &&
         ((*(uint *)(*(long *)(lVar4 + 0x3a0) + 0x94) & 0xc0000003) == 0)))) ||
       (*(int *)(param_1 + 0x968) == 0xb)) {
      if ((uVar3 >> 4 & 1) == 0) {
        return 0;
      }
      if ((*(char *)(param_1 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    param_1 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + param_1 + 0x18) + 8))))) {
        func_0x0073cab8(param_1,"REFUSED_STREAM, retrying a fresh connect");
        uVar3 = *(uint *)(&UNK_00001344 + param_1);
      }
      *(uint *)(&UNK_00001344 + param_1) = uVar3 & 0xffffffef;
    }
    iVar1 = *(int *)(param_1 + 0xc50);
    *(int *)(param_1 + 0xc50) = iVar1 + 1;
    if (4 < iVar1) {
      func_0x0073c9e4(param_1,"Connection died, tried %d times before giving up");
      *(undefined4 *)(param_1 + 0xc50) = 0;
      return 0x37;
    }
    if ((*(char *)(param_1 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8))))) {
      func_0x0073cab8(param_1,"Connection died, retrying a fresh connect (retry count: %d)");
    }
    lVar2 = (*pcRam0000000000a2b600)
                      (*(undefined8 *)
                        ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                        param_1 + 0x28));
    *param_2 = lVar2;
    if (lVar2 == 0) {
      return 0x1b;
    }
    func_0x00734f74(lVar4,1);
    *(ulong *)(lVar4 + 0x398) = *(ulong *)(lVar4 + 0x398) | 0x4000;
    func_0x00773f38(param_1,1);
  }
  return 0;
}

