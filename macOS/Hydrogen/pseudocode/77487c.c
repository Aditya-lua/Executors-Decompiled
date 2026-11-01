
undefined8 FUN_0077487c(long param_1,undefined8 param_2,undefined8 param_3)

{
  char cVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined1 *unaff_x21;
  undefined8 *unaff_x22;
  
  plVar3 = *(long **)(param_1 + 0x148);
  if (plVar3 == (long *)0x0) {
    uVar2 = func_0x00774334(param_1,*(undefined8 *)
                                     (
                                     "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                     + param_1 + 0x30));
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    plVar3 = *(long **)(param_1 + 0x148);
    *unaff_x22 = 0;
    *unaff_x21 = 0;
    if (plVar3 == (long *)0x0) {
      uVar2 = 0x1a;
      cVar1 = *(char *)(param_1 + 0xa1d);
      goto joined_r0x00774918;
    }
  }
  else {
    *unaff_x22 = 0;
    *unaff_x21 = 0;
  }
  uVar2 = (**(code **)(*plVar3 + 0x10))(param_1,plVar3,param_2,param_3);
  cVar1 = *(char *)(param_1 + 0xa1d);
joined_r0x00774918:
  if (cVar1 < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 param_1 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) {
        return uVar2;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1) {
      return uVar2;
    }
    func_0x0073cd4c(param_1,"client_read(len=%zu) -> %d, nread=%zu, eos=%d");
  }
  return uVar2;
}

