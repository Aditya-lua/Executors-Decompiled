
void FUN_001884a0(long param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long *extraout_x8;
  long in_x9;
  long lVar3;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined1 *puStack_48;
  
  func_0x00187bd4(param_2,in_x9 + param_1 * -0x10,8);
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
  puStack_48 = (undefined1 *)&lStack_c0;
  lStack_c0 = -0x7fffffffffffffd9;
  uStack_68 = puVar1[1];
  uStack_70 = *puVar1;
  uStack_58 = puVar1[3];
  uStack_60 = puVar1[2];
  uStack_50 = puVar1[4];
  func_0x00189d40(&lStack_88,&uStack_70,&UNK_009c00f8);
  if (lStack_c0 == -0x7fffffffffffffd9) {
    extraout_x8[2] = lStack_80;
    extraout_x8[1] = lStack_88;
    extraout_x8[3] = lStack_78;
    *extraout_x8 = -0x7fffffffffffffd9;
  }
  else {
    extraout_x8[1] = lStack_b8;
    *extraout_x8 = lStack_c0;
    extraout_x8[3] = lStack_a8;
    extraout_x8[2] = lStack_b0;
    extraout_x8[5] = lStack_98;
    extraout_x8[4] = lStack_a0;
    extraout_x8[6] = lStack_90;
    lVar3 = lStack_78 + 1;
    lVar2 = lStack_80;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x00194828(lVar2);
      lVar2 = lVar2 + 8;
    }
    if (lStack_88 != 0) {
      func_0x00187bd4(lStack_80,lStack_88 << 3,8);
    }
  }
  return;
}

