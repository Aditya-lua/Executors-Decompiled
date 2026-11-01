
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000488d8(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 *extraout_x8;
  
  __ZdlPv();
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
  *puVar3 = &UNK_009b6ff8;
  puVar3[1] = 0;
  puVar3[0x18] = uVar2;
  puVar3[0x17] = uVar1;
  *(undefined1 *)((long)puVar3 + 0xb1) = 1;
  puVar3[0x19] = puVar3 + 0xe;
  func_0x006849f8(puVar3 + 0xe);
  *puVar3 = &UNK_009b6ea0;
  *extraout_x8 = puVar3;
  return;
}

