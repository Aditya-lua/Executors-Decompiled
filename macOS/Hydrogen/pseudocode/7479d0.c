
undefined8 FUN_007479d0(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  char cVar3;
  
  lVar2 = *(long *)(param_1 + 0x18);
  if ((((*(byte *)(param_1 + 0xa1b) >> 2 & 1) == 0) && (*(char *)(param_1 + 0xa16) == '\0')) ||
     (*(long *)(lVar2 + 0x4a0) == 0)) {
    if (((*(byte *)(param_1 + 0x1c3) >> 1 & 1) != 0) && (*(long *)(lVar2 + 0x4a0) != 0)) {
      cVar3 = 'I';
      if (((&UNK_00001345)[param_1] & 0x40) != 0) {
        cVar3 = 'A';
      }
      if (cVar3 != *(char *)(lVar2 + 0x4c0)) {
        *(undefined4 *)(*(long *)(param_1 + 0x1b0) + 0x10) = 1;
        uVar1 = func_0x00749ef0(param_1,lVar2,*(uint *)(&UNK_00001344 + param_1) >> 0xe & 1,0x13);
        return uVar1;
      }
    }
    uVar1 = func_0x0074a140(param_1);
    return uVar1;
  }
  uVar1 = func_0x0076e34c(param_1,lVar2 + 1000,"MDTM %s");
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar2 = *(long *)(param_1 + 0x18);
  if ((*(char *)(lVar2 + 0x4f6) != '\x12') && (*(char *)(param_1 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_1 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto code_r0x00747c00;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto code_r0x00747c00;
    func_0x0073cfbc(param_1,"[%s] -> [%s]");
  }
code_r0x00747c00:
  *(undefined1 *)(lVar2 + 0x4f6) = 0x12;
  return 0;
}

