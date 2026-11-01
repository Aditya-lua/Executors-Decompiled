
void FUN_006e5fc4(long param_1,int param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  
  if (param_2 < 1) {
    if (param_2 < -9999) {
      puVar3 = (undefined8 *)func_0x006e60a0(param_1);
    }
    else {
      puVar3 = (undefined8 *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
    }
  }
  else {
    puVar3 = (undefined8 *)(*(long *)(param_1 + 0x10) + (ulong)(param_2 - 1) * 0x10);
    if (*(undefined8 **)(param_1 + 8) <= puVar3) {
      lVar1 = __dyld_get_image_header(0);
      puVar3 = (undefined8 *)(lVar1 + 0x4e8dd08);
    }
  }
  uVar2 = func_0x006fc344(param_1,*puVar3);
  puVar3 = *(undefined8 **)(param_1 + 8);
  *puVar3 = uVar2;
  *(undefined4 *)((long)puVar3 + 0xc) = 6;
  *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + 0x10;
  return;
}

