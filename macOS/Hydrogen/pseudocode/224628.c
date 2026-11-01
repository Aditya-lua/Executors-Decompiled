
void FUN_00224628(undefined8 param_1,long param_2)

{
  long lVar1;
  long *extraout_x8;
  undefined1 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 in_stack_00000010;
  undefined1 auStack_110 [16];
  ulong uStack_100;
  long lStack_f8;
  undefined1 *puStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  
  if (param_2 != 0) {
    func_0x00187bd4(in_stack_00000010,param_2,1);
  }
  auStack_110 = __Unwind_Resume();
  uStack_100 = 0;
  func_0x00225470(&lStack_f8,auStack_110);
  if ((lStack_f8 == -0x8000000000000000) || ((ulong)auStack_110._8_8_ <= uStack_100)) {
    extraout_x8[0xd] = lStack_90;
    extraout_x8[0xc] = lStack_98;
    extraout_x8[0xf] = lStack_80;
    extraout_x8[0xe] = lStack_88;
    extraout_x8[0x11] = lStack_70;
    extraout_x8[0x10] = lStack_78;
    extraout_x8[5] = lStack_d0;
    extraout_x8[4] = lStack_d8;
    extraout_x8[7] = lStack_c0;
    extraout_x8[6] = lStack_c8;
    extraout_x8[9] = uStack_b0;
    extraout_x8[8] = lStack_b8;
    extraout_x8[0xb] = lStack_a0;
    extraout_x8[10] = lStack_a8;
    extraout_x8[1] = (long)puStack_f0;
    *extraout_x8 = lStack_f8;
    extraout_x8[3] = lStack_e0;
    extraout_x8[2] = lStack_e8;
  }
  else {
    *(undefined1 *)(extraout_x8 + 1) = 0xf;
    extraout_x8[2] = (long)&UNK_008284f0;
    extraout_x8[3] = 10;
    *extraout_x8 = -0x8000000000000000;
    if ((-0x7fffffffffffffff < lStack_98) && (lStack_98 != 0)) {
      func_0x00187bd4(lStack_90,lStack_98,1);
    }
    if (lStack_e8 != 0) {
      puVar2 = puStack_f0;
      do {
        *puVar2 = 0;
        lStack_e8 = lStack_e8 + -1;
        puVar2 = puVar2 + 1;
      } while (lStack_e8 != 0);
    }
    if (lStack_f8 != 0) {
      lVar3 = 0;
      do {
        puStack_f0[lVar3] = 0;
        lVar3 = lVar3 + 1;
      } while (lStack_f8 != lVar3);
      func_0x00187bd4(puStack_f0,lStack_f8,1);
    }
    if (lStack_c8 != -0x8000000000000000) {
      if (lStack_b8 != 0) {
        puVar4 = (undefined8 *)(lStack_c0 + 8);
        lVar3 = lStack_b8;
        do {
          lVar1 = puVar4[-1];
          if (lVar1 != -0x8000000000000000 && lVar1 != 0) {
            func_0x00187bd4(*puVar4,lVar1,1);
          }
          puVar4 = puVar4 + 3;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      if (lStack_c8 != 0) {
        func_0x00187bd4(lStack_c0,lStack_c8 * 0x18,8);
      }
    }
    if ((uStack_b0 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(lStack_a8,uStack_b0,1);
    }
    if (lStack_e0 != 0) {
      func_0x00187bd4(lStack_d8,lStack_e0,1);
    }
  }
  return;
}

