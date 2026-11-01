
undefined8 FUN_0030006c(long param_1,undefined8 param_2,ulong param_3)

{
  uint uVar1;
  uint in_w8;
  ulong uVar2;
  int in_w9;
  ulong unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  
  uVar1 = (int)unaff_x19 * 8;
  *(uint *)(param_1 + 0x20) = in_w8 + uVar1;
  *(uint *)(param_1 + 0x24) = (int)(param_3 >> 0x1d) + in_w9 + (uint)CARRY4(in_w8,uVar1);
  uVar1 = *(uint *)(param_1 + 0x68);
  uVar2 = (ulong)uVar1;
  if (uVar1 != 0) {
    if ((unaff_x19 < 0x40) && (uVar2 + unaff_x19 < 0x40)) {
      _memcpy((long)unaff_x22 + uVar2);
      *(int *)(unaff_x20 + 0x68) = *(int *)(unaff_x20 + 0x68) + (int)unaff_x19;
      return 1;
    }
    if (uVar1 != 0x40) {
      _memcpy((long)unaff_x22 + uVar2);
    }
    if ((bRam0000000000a334f8 >> 4 & 1) == 0) {
      func_0x00387740();
    }
    else {
      func_0x00388580();
    }
    unaff_x19 = unaff_x19 - (0x40 - uVar2);
    *(undefined4 *)(unaff_x20 + 0x68) = 0;
    unaff_x22[1] = 0;
    *unaff_x22 = 0;
    unaff_x22[3] = 0;
    unaff_x22[2] = 0;
    unaff_x22[5] = 0;
    unaff_x22[4] = 0;
    unaff_x22[7] = 0;
    unaff_x22[6] = 0;
  }
  if (0x3f < unaff_x19) {
    if ((bRam0000000000a334f8 >> 4 & 1) == 0) {
      func_0x00387740();
    }
    else {
      func_0x00388580();
    }
    unaff_x19 = unaff_x19 & 0x3f;
  }
  if (unaff_x19 != 0) {
    *(int *)(unaff_x20 + 0x68) = (int)unaff_x19;
    _memcpy();
  }
  return 1;
}

