
undefined8 *
FUN_0065396c(ulong param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined8 param_5)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  undefined1 auVar5 [16];
  
  *unaff_x19 = 0;
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  if (unaff_x23 >> 0x3e == 0) {
    uVar1 = (long)param_1 >> 1;
    if ((ulong)((long)param_1 >> 1) <= unaff_x23) {
      uVar1 = unaff_x23;
    }
    if (0x7ffffffffffffffb < param_1) {
      uVar1 = 0x3fffffffffffffff;
    }
    if (uVar1 >> 0x3e == 0) {
      puVar2 = (undefined8 *)__Znwm(uVar1 * 4);
      *unaff_x19 = (long)puVar2;
      unaff_x19[1] = (long)puVar2;
      unaff_x19[2] = (long)puVar2 + uVar1 * 4;
      puVar3 = puVar2;
      if (unaff_x21 - unaff_x22 != 0) {
        puVar3 = (undefined8 *)_memcpy(puVar2);
      }
      unaff_x19[1] = (long)puVar2 + (unaff_x21 - unaff_x22);
      return puVar3;
    }
  }
  auVar5 = func_0x00017f90();
  puVar3 = auVar5._0_8_;
  *puVar3 = &UNK_00a0c0d0;
  puVar3[1] = &UNK_00a0c190;
  uVar4 = __Znwm(0xa8);
  func_0x00653bcc(uVar4,auVar5._8_8_);
  puVar3[2] = uVar4;
  if (*(int *)(param_4 + 0x28) == 1) {
    func_0x006072ac(puVar3 + 3,auVar5._8_8_,param_4);
  }
  else {
    func_0x005fe0b4(puVar3 + 3,param_4);
  }
  func_0x005fe0b4(puVar3 + 9,param_5);
  puVar3[0xf] = &UNK_00a09a40;
  func_0x005fdd18(puVar3 + 0x10);
  func_0x005fdd18(puVar3 + 0x16);
  *(undefined1 *)(puVar3 + 0x1c) = 1;
  return puVar3;
}

