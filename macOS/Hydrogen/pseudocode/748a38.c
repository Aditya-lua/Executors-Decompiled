
undefined8 FUN_00748a38(long param_1,long param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  
  uVar2 = *(ulong *)(param_2 + 0x398);
  if ((uVar2 & 0x80a) == 0x800) {
    func_0x0073c9e4(param_1,"Failed EPSV attempt, exiting");
    uVar1 = 8;
  }
  else {
    if (((param_1 != 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8))))) {
      func_0x0073cab8(param_1,"Failed EPSV attempt. Disabling EPSV");
      uVar2 = *(ulong *)(param_2 + 0x398);
    }
    *(ulong *)(param_2 + 0x398) = uVar2 & 0xffffffffffff7fff;
    func_0x00730bf8(param_1,1);
    func_0x00730b8c(param_1,param_2,1);
    *(uint *)(&UNK_00001344 + param_1) = *(uint *)(&UNK_00001344 + param_1) & 0xffffffdf;
    uVar1 = func_0x0076e34c(param_1,param_2 + 1000,"%s");
    if ((int)uVar1 == 0) {
      *(int *)(param_2 + 0x4e8) = *(int *)(param_2 + 0x4e8) + 1;
      lVar3 = *(long *)(param_1 + 0x18);
      if (((*(char *)(lVar3 + 0x4f6) != '\x1e') && (*(char *)(param_1 + 0xa1d) < '\0')) &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     param_1 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + param_1 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
        func_0x0073cfbc(param_1,"[%s] -> [%s]");
      }
      *(undefined1 *)(lVar3 + 0x4f6) = 0x1e;
      return 0;
    }
  }
  return uVar1;
}

