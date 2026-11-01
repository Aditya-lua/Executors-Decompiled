
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00737e48(undefined8 param_1,long param_2,undefined8 param_3,undefined4 param_4)

{
  undefined *puVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  puVar1 = &UNK_00004028 + param_2;
  iVar2 = *(int *)(&UNK_00004030 + param_2);
  uVar6 = *(undefined8 *)(&UNK_00004028 + param_2);
  iVar4 = *(int *)(param_2 + 0x20);
  if (1 < iVar4 - 1U) {
    if (iVar4 == 0) {
      return 0x17;
    }
    if (iVar4 != 4) {
      _inflateEnd(puVar1);
      *(undefined4 *)(param_2 + 0x20) = 0;
      return 0x17;
    }
  }
code_r0x00737b98:
  *(long *)(&UNK_00004040 + param_2) = param_2 + 0x24;
  *(undefined4 *)(&UNK_00004048 + param_2) = 0x4000;
  uVar3 = _inflate(puVar1,5);
  iVar4 = *(int *)(&UNK_00004048 + param_2);
  if (iVar4 != 0x4000 && uVar3 < 2) {
    *(undefined4 *)(param_2 + 0x20) = param_4;
    uVar5 = func_0x00773be4(param_1,*(undefined8 *)(param_2 + 8),param_3,param_2 + 0x24,
                            0x4000 - iVar4);
    if ((int)uVar5 != 0) {
      if (*(int *)(param_2 + 0x20) != 0) {
        _inflateEnd(puVar1);
        *(undefined4 *)(param_2 + 0x20) = 0;
      }
      goto joined_r0x00737cb4;
    }
  }
  switch(uVar3) {
  case 0:
    goto code_r0x00737b98;
  case 1:
    uVar5 = func_0x00737a08(param_1,param_2);
    goto joined_r0x00737cb4;
  case 0xfffffffb:
    uVar5 = 0;
joined_r0x00737cb4:
    if ((iVar2 != 0) && (*(int *)(param_2 + 0x20) == 1)) {
      *(undefined4 *)(param_2 + 0x20) = param_4;
    }
    return uVar5;
  case 0xfffffffd:
    if (*(int *)(param_2 + 0x20) == 1) {
      _inflateEnd(puVar1);
      iVar4 = _inflateInit2_(puVar1,0xfffffff1,"1.2.12",0x70);
      if (iVar4 == 0) {
        *(undefined8 *)(&UNK_00004028 + param_2) = uVar6;
        *(int *)(&UNK_00004030 + param_2) = iVar2;
        *(undefined4 *)(param_2 + 0x20) = 2;
        *(undefined4 *)(&UNK_00004024 + param_2) = 4;
        goto code_r0x00737b98;
      }
      *(undefined4 *)(param_2 + 0x20) = 0;
    }
  default:
    if (*(long *)(&UNK_00004058 + param_2) == 0) {
      func_0x0073c9e4(param_1,
                      "Error while processing content unencoding: Unknown failure within decompression software."
                     );
      iVar4 = *(int *)(param_2 + 0x20);
    }
    else {
      func_0x0073c9e4(param_1,"Error while processing content unencoding: %s");
      iVar4 = *(int *)(param_2 + 0x20);
    }
    if (iVar4 == 0) {
      uVar5 = 0x3d;
    }
    else {
      _inflateEnd(puVar1);
      *(undefined4 *)(param_2 + 0x20) = 0;
      uVar5 = 0x3d;
    }
    goto joined_r0x00737cb4;
  }
}

