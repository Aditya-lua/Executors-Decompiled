
long FUN_00608da4(void)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  long in_stack_00000028;
  
  ___cxa_throw();
  iVar3 = ___cxa_guard_acquire(0xa3c150);
  if (iVar3 != 0) {
    func_0x005fe1e8(0xa3c168,0);
    ___cxa_atexit(&SUB_00087574,0xa3c168,0);
    ___cxa_guard_release(0xa3c150);
  }
  if (in_stack_00000028 == 0xa3c168) {
    return 0xa3c168;
  }
  uVar5 = *(ulong *)(in_stack_00000028 + 0x18);
  if ((uVar5 == uRam0000000000a3c180) &&
     (*(long *)(lRam0000000000a3c188 + (uVar5 & 0x3ffffffffffffffe) * 4) != 0)) {
    lVar4 = *(long *)(in_stack_00000028 + 0x20);
    uVar8 = uVar5;
    if (lVar4 == lRam0000000000a3c188) goto code_r0x005ffdc4;
  }
  else {
    uVar8 = uRam0000000000a3c180;
    do {
      uVar7 = 0;
      if (uVar8 == 0) goto code_r0x005ffd44;
      uVar7 = uVar8 - 1;
      lVar4 = uVar8 * 8;
      uVar8 = uVar7;
    } while (*(long *)(lRam0000000000a3c188 + -8 + lVar4) == 0);
    uVar6 = (int)uVar7 + 1;
    uVar7 = (ulong)uVar6;
    if (uVar6 < 9) {
code_r0x005ffd44:
      uVar8 = (ulong)*(uint *)(&UNK_008babcc + uVar7 * 4);
    }
    else if (uVar7 < 0x11) {
      uVar8 = 0x10;
    }
    else if (uVar7 < 0x21) {
      uVar8 = 0x20;
    }
    else if (uVar7 < 0x41) {
      uVar8 = 0x40;
    }
    else {
      uVar6 = 0;
      uVar8 = 0x40;
      do {
        uVar2 = uVar6 + (uint)uVar8 >> 1;
        uVar1 = uVar2;
        if (uVar7 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
          uVar1 = (uint)uVar8;
          uVar6 = uVar2;
        }
        uVar8 = (ulong)uVar1;
      } while (1 < uVar1 - uVar6);
      uVar8 = 1L << (uVar8 & 0x3f);
    }
    lVar4 = *(long *)(in_stack_00000028 + 0x20);
    if (uVar5 != uVar8) {
      if (lVar4 != 0) {
        if (uVar5 != 0) {
          do {
            *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
            uVar5 = uVar5 - 1;
          } while (uVar5 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar8);
      if (uVar8 == 0) {
        lVar4 = 0;
      }
      else {
        lVar4 = func_0x006115d0(uVar8 << 3);
      }
    }
    *(ulong *)(in_stack_00000028 + 0x18) = uVar8;
    *(long *)(in_stack_00000028 + 0x20) = lVar4;
    *(undefined8 *)(in_stack_00000028 + 0x10) = 0x1fffffffffffffff;
    if (lVar4 == lRam0000000000a3c188) goto code_r0x005ffdc4;
  }
  _memcpy(lVar4,lRam0000000000a3c188,uVar8 << 3);
code_r0x005ffdc4:
  *(undefined4 *)(in_stack_00000028 + 0x28) = uRam0000000000a3c190;
  return in_stack_00000028;
}

