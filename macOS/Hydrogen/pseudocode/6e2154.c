
void FUN_006e2154(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  int iVar4;
  undefined8 uVar5;
  
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
  }
  iVar4 = (int)param_2;
  if (iVar4 < 1) {
    if (iVar4 < -9999) {
      puVar2 = (undefined8 *)func_0x006e60a0(param_1,param_2);
    }
    else {
      puVar2 = (undefined8 *)(*(long *)(param_1 + 8) + (long)iVar4 * 0x10);
    }
  }
  else {
    puVar2 = (undefined8 *)(*(long *)(param_1 + 0x10) + (ulong)(iVar4 - 1) * 0x10);
    if (*(undefined8 **)(param_1 + 8) <= puVar2) {
      lVar1 = __dyld_get_image_header(0);
      puVar2 = (undefined8 *)(lVar1 + 0x4e8dd08);
    }
  }
  puVar3 = *(undefined8 **)(param_1 + 8);
  uVar5 = *puVar2;
  puVar3[1] = puVar2[1];
  *puVar3 = uVar5;
  *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + 0x10;
  return;
}

