
bool FUN_006ca318(long param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  
  if ((param_2 == 0) || (*(int *)(param_2 + 8) != iRam0000000000a27ac8)) {
    return *(int *)(param_2 + 8) == iRam0000000000a27ab8;
  }
  if (*(int *)(param_1 + 8) < 2) {
    return true;
  }
  if ((*(long *)(param_1 + 0x110) != 0) && (*(ulong *)(param_1 + 0x118) != param_2)) {
    uVar4 = 0;
    uVar5 = *(long *)(param_1 + 0x108) - 1;
    uVar6 = param_2 >> 4 ^ param_2 >> 9;
    do {
      uVar6 = uVar6 & uVar5;
      uVar7 = *(ulong *)(*(long *)(param_1 + 0x100) + uVar6 * 0x20);
      if (uVar7 == param_2) {
        if (*(int *)(*(long *)(param_1 + 0x100) + uVar6 * 0x20 + 8) != 0) {
          return false;
        }
        break;
      }
      uVar4 = uVar4 + 1;
      uVar6 = uVar4 + uVar6;
    } while (uVar7 != *(ulong *)(param_1 + 0x118) && uVar4 <= uVar5);
  }
  if ((*(long *)(param_1 + 0x188) != 0) && (*(ulong *)(param_1 + 400) != param_2)) {
    uVar4 = 0;
    uVar5 = *(long *)(param_1 + 0x180) - 1;
    uVar6 = param_2 >> 4 ^ param_2 >> 9;
    do {
      uVar6 = uVar6 & uVar5;
      uVar7 = *(ulong *)(*(long *)(param_1 + 0x178) + uVar6 * 0x10);
      if (uVar7 == param_2) {
        uVar4 = func_0x006d22a0(*(undefined4 *)(*(long *)(param_1 + 0x178) + uVar6 * 0x10 + 8));
        return uVar4 >> 0x20 != 1;
      }
      uVar4 = uVar4 + 1;
      uVar6 = uVar4 + uVar6;
    } while (uVar7 != *(ulong *)(param_1 + 400) && uVar4 <= uVar5);
  }
  uVar4 = *(ulong *)(param_2 + 0x20);
  do {
    for (; (iVar2 = *(int *)(uVar4 + 8), uVar4 == 0 || (iVar2 != iRam0000000000a27a98));
        uVar4 = *(ulong *)(uVar4 + 0x20)) {
      if (((uVar4 == 0) || (iVar2 != iRam0000000000a27a48)) &&
         ((uVar4 == 0 || (iVar2 != iRam0000000000a27b38)))) {
        if (iVar2 != iRam0000000000a27af8) {
          return true;
        }
        if (*(long *)(param_1 + 0x70) == 0) {
          return true;
        }
        if (uVar4 == *(ulong *)(param_1 + 0x78)) {
          return true;
        }
        uVar6 = 0;
        uVar7 = *(long *)(param_1 + 0x68) - 1;
        uVar5 = uVar4 >> 4 ^ uVar4 >> 9;
        do {
          uVar5 = uVar5 & uVar7;
          uVar3 = *(ulong *)(*(long *)(param_1 + 0x60) + uVar5 * 0x38);
          if (uVar3 == uVar4) {
            if (*(char *)(*(long *)(param_1 + 0x60) + uVar5 * 0x38 + 0x35) == '\0') {
              return true;
            }
            return false;
          }
          uVar6 = uVar6 + 1;
          uVar5 = uVar6 + uVar5;
        } while (uVar3 != *(ulong *)(param_1 + 0x78) && uVar6 <= uVar7);
        return true;
      }
    }
    if (*(long *)(param_1 + 0xe8) == 0) {
      return true;
    }
    uVar4 = *(ulong *)(uVar4 + 0x20);
    if (uVar4 == *(ulong *)(param_1 + 0xf0)) {
      return true;
    }
    uVar6 = 0;
    lVar1 = *(long *)(param_1 + 0xd8);
    uVar7 = *(long *)(param_1 + 0xe0) - 1;
    uVar5 = uVar4 >> 4 ^ uVar4 >> 9;
    while( true ) {
      uVar5 = uVar5 & uVar7;
      uVar3 = *(ulong *)(lVar1 + uVar5 * 0x18);
      if (uVar3 == uVar4) break;
      uVar6 = uVar6 + 1;
      uVar5 = uVar6 + uVar5;
      if (uVar3 == *(ulong *)(param_1 + 0xf0) || uVar7 < uVar6) {
        return true;
      }
    }
    if (*(char *)(lVar1 + uVar5 * 0x18 + 0x10) != '\0') {
      return true;
    }
    uVar4 = *(ulong *)(lVar1 + uVar5 * 0x18 + 8);
  } while (uVar4 != 0);
  return true;
}

