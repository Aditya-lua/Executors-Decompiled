
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000480a8(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 in_ZR;
  undefined8 *puVar3;
  ulong uVar4;
  undefined8 *extraout_x8;
  long in_x9;
  undefined8 *unaff_x20;
  long unaff_x22;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  *unaff_x20 = &UNK_009b2d90;
  uVar4 = unaff_x20[0x14];
  if ((ulong)unaff_x20[0x15] <= (ulong)unaff_x20[0x14]) {
    uVar4 = unaff_x20[0x15];
  }
  *(undefined1 *)((long)unaff_x20 + 0x99) = 0;
  if (unaff_x20[0x16] == unaff_x22 && uVar4 != 0) {
    do {
      unaff_x20[uVar4 + 2] = 0;
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
  }
  __ZdlPv();
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  __Unwind_Resume();
  puVar3 = (undefined8 *)__Znwm(0xd0);
  puVar3[1] = 0;
  *puVar3 = 0;
  puVar3[3] = 0;
  puVar3[2] = 0;
  puVar3[5] = 0;
  puVar3[4] = 0;
  puVar3[7] = 0;
  puVar3[6] = 0;
  puVar3[9] = 0;
  puVar3[8] = 0;
  puVar3[0xb] = 0;
  puVar3[10] = 0;
  puVar3[0xd] = 0;
  puVar3[0xc] = 0;
  puVar3[0xf] = 0;
  puVar3[0xe] = 0;
  puVar3[0x11] = 0;
  puVar3[0x10] = 0;
  puVar3[0x13] = 0;
  puVar3[0x12] = 0;
  puVar3[0x15] = 0;
  puVar3[0x14] = 0;
  puVar3[0x17] = 0;
  puVar3[0x16] = 0;
  puVar3[0x19] = 0;
  puVar3[0x18] = 0;
  func_0x005edf2c(puVar3,1);
  uVar2 = _UNK_007fc1d8;
  uVar1 = _UNK_007fc1d0;
  puVar3[0xc] = _UNK_007fc1d8;
  puVar3[0xb] = uVar1;
  *(undefined1 *)((long)puVar3 + 0x51) = 1;
  puVar3[0xd] = puVar3 + 2;
  *puVar3 = &UNK_009b6570;
  puVar3[1] = 0;
  puVar3[0x18] = uVar2;
  puVar3[0x17] = uVar1;
  *(undefined1 *)((long)puVar3 + 0xb1) = 1;
  puVar3[0x19] = puVar3 + 0xe;
  func_0x0069f298(puVar3 + 0xe);
  *puVar3 = &UNK_00a19f18;
  *extraout_x8 = puVar3;
  return;
}

