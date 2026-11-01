
undefined8 FUN_00737a14(undefined8 param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  char *pcVar5;
  
  uVar2 = *(uint *)(&UNK_00004030 + param_2);
  uVar3 = *(uint *)(&UNK_00004024 + param_2);
  uVar1 = uVar2;
  if (uVar3 <= uVar2) {
    uVar1 = uVar3;
  }
  *(uint *)(&UNK_00004024 + param_2) = uVar3 - uVar1;
  *(uint *)(&UNK_00004030 + param_2) = uVar2 - uVar1;
  *(ulong *)(&UNK_00004028 + param_2) = *(long *)(&UNK_00004028 + param_2) + (ulong)uVar1;
  if (uVar3 < uVar2) {
    if (*(int *)(param_2 + 0x20) == 0) {
      return 0x17;
    }
    _inflateEnd(&UNK_00004028 + param_2);
    *(undefined4 *)(param_2 + 0x20) = 0;
    return 0x17;
  }
  if (uVar2 < uVar3) {
    *(undefined4 *)(param_2 + 0x20) = 3;
    return 0;
  }
  if (*(int *)(param_2 + 0x20) == 0) {
    return 0;
  }
  uVar4 = _inflateEnd(&UNK_00004028 + param_2);
  if ((int)uVar4 != 0) {
    if (*(long *)(&UNK_00004058 + param_2) == 0) {
      pcVar5 = 
      "Error while processing content unencoding: Unknown failure within decompression software.";
    }
    else {
      pcVar5 = "Error while processing content unencoding: %s";
    }
    func_0x0073c9e4(param_1,pcVar5);
    uVar4 = 0x3d;
  }
  *(undefined4 *)(param_2 + 0x20) = 0;
  return uVar4;
}

