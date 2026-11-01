
undefined8 FUN_00664d18(void)

{
  long lVar1;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000040;
  undefined1 auStack_130 [8];
  ulong uStack_128;
  ulong uStack_120;
  long lStack_118;
  undefined1 auStack_110 [8];
  ulong uStack_108;
  ulong uStack_100;
  long lStack_f8;
  undefined1 auStack_f0 [8];
  ulong uStack_e8;
  ulong uStack_e0;
  long lStack_d8;
  undefined1 auStack_d0 [8];
  ulong uStack_c8;
  ulong uStack_c0;
  long lStack_b8;
  undefined1 auStack_b0 [8];
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  undefined1 auStack_90 [8];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  undefined1 auStack_70 [8];
  ulong uStack_68;
  ulong uStack_60;
  long lStack_58;
  undefined1 auStack_50 [8];
  ulong uStack_48;
  ulong uStack_40;
  long lStack_38;
  
  uVar3 = __Unwind_Resume();
  func_0x0062a89c(&uStack0000000000000040);
  auVar6 = __Unwind_Resume(uVar3);
  lVar5 = auVar6._8_8_;
  lVar4 = auVar6._0_8_;
  if (*(char *)(lVar5 + 0x48) != '\0') {
    return 1;
  }
  lVar1 = lVar5 + 8;
  uVar2 = func_0x0067701c(lVar1);
  if (uVar2 <= *(uint *)(*(long *)(lVar4 + 8) + 0x90)) {
    lVar5 = lVar5 + 0x28;
    uVar2 = func_0x0067701c(lVar5);
    if (uVar2 <= *(uint *)(*(long *)(lVar4 + 8) + 0x90)) {
      func_0x00677494(auStack_f0,lVar1,lVar4 + 0x10);
      func_0x006778a8(auStack_d0,auStack_f0,lVar1);
      func_0x006778a8(auStack_b0,auStack_d0,lVar1);
      func_0x00677494(auStack_90,auStack_b0,lVar4 + 0x30);
      func_0x00677494(auStack_130,lVar1,lVar5);
      func_0x006778a8(auStack_110,auStack_130,lVar5);
      func_0x00677494(auStack_70,auStack_90,auStack_110);
      func_0x00678964(auStack_50,auStack_70,*(long *)(lVar4 + 8) + 0x70);
      uVar3 = func_0x006787a4(auStack_50);
      if (uStack_40 <= uStack_48) {
        uStack_48 = uStack_40;
      }
      if (lStack_38 != 0) {
        if (uStack_48 != 0) {
          do {
            *(undefined8 *)(lStack_38 + -8 + uStack_48 * 8) = 0;
            uStack_48 = uStack_48 - 1;
          } while (uStack_48 != 0);
        }
        func_0x00611644();
      }
      if (uStack_60 <= uStack_68) {
        uStack_68 = uStack_60;
      }
      if (lStack_58 != 0) {
        if (uStack_68 != 0) {
          do {
            *(undefined8 *)(lStack_58 + -8 + uStack_68 * 8) = 0;
            uStack_68 = uStack_68 - 1;
          } while (uStack_68 != 0);
        }
        func_0x00611644();
      }
      if (uStack_100 <= uStack_108) {
        uStack_108 = uStack_100;
      }
      if (lStack_f8 != 0) {
        if (uStack_108 != 0) {
          do {
            *(undefined8 *)(lStack_f8 + -8 + uStack_108 * 8) = 0;
            uStack_108 = uStack_108 - 1;
          } while (uStack_108 != 0);
        }
        func_0x00611644();
      }
      if (uStack_120 <= uStack_128) {
        uStack_128 = uStack_120;
      }
      if (lStack_118 != 0) {
        if (uStack_128 != 0) {
          do {
            *(undefined8 *)(lStack_118 + -8 + uStack_128 * 8) = 0;
            uStack_128 = uStack_128 - 1;
          } while (uStack_128 != 0);
        }
        func_0x00611644();
      }
      if (uStack_80 <= uStack_88) {
        uStack_88 = uStack_80;
      }
      if (lStack_78 != 0) {
        if (uStack_88 != 0) {
          do {
            *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
            uStack_88 = uStack_88 - 1;
          } while (uStack_88 != 0);
        }
        func_0x00611644();
      }
      if (uStack_a0 <= uStack_a8) {
        uStack_a8 = uStack_a0;
      }
      if (lStack_98 != 0) {
        if (uStack_a8 != 0) {
          do {
            *(undefined8 *)(lStack_98 + -8 + uStack_a8 * 8) = 0;
            uStack_a8 = uStack_a8 - 1;
          } while (uStack_a8 != 0);
        }
        func_0x00611644();
      }
      if (uStack_c0 <= uStack_c8) {
        uStack_c8 = uStack_c0;
      }
      if (lStack_b8 != 0) {
        if (uStack_c8 != 0) {
          do {
            *(undefined8 *)(lStack_b8 + -8 + uStack_c8 * 8) = 0;
            uStack_c8 = uStack_c8 - 1;
          } while (uStack_c8 != 0);
        }
        func_0x00611644();
      }
      if (uStack_e0 <= uStack_e8) {
        uStack_e8 = uStack_e0;
      }
      if (lStack_d8 == 0) {
        return uVar3;
      }
      if (uStack_e8 != 0) {
        do {
          *(undefined8 *)(lStack_d8 + -8 + uStack_e8 * 8) = 0;
          uStack_e8 = uStack_e8 - 1;
        } while (uStack_e8 != 0);
      }
      func_0x00611644();
      return uVar3;
    }
  }
  return 0;
}

