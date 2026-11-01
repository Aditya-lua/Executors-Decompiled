
void FUN_006e4ce0(long param_1,undefined8 param_2,int param_3,undefined8 param_4)

{
  uint uVar1;
  
  uVar1 = (uint)param_4;
  if (uVar1 != 0) {
    if ((int)uVar1 < 1) {
      if (uVar1 < 0xffffd8f1) {
        func_0x006e60a0(param_1,param_4);
      }
    }
    else if (*(ulong *)(param_1 + 8) <= *(long *)(param_1 + 0x10) + (ulong)(uVar1 - 1) * 0x10) {
      __dyld_get_image_header(0);
    }
  }
  func_0x006eefcc(param_1,&DAT_006e4ddc);
  if (param_3 == -1) {
    if (*(ulong *)(*(long *)(param_1 + 0x20) + 0x10) <= *(ulong *)(param_1 + 8)) {
      *(ulong *)(*(long *)(param_1 + 0x20) + 0x10) = *(ulong *)(param_1 + 8);
      return;
    }
  }
  return;
}

