/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91284
 */

undefined4 FUN_00b91284(uint param_1,ushort *param_2,undefined1 *param_3)

{
  ushort uVar1;
  uint uVar2;
  undefined4 uVar3;
  uint uVar4;
  uint uVar5;
  
  if ((param_1 & 0x7f000000) != 0x3000000) {
    return 0xffffff79;
  }
  uVar1 = *param_2;
  uVar5 = param_1 & 0x7fc00000;
  if ((uVar5 != 0x3800000) || (uVar1 != 0x1100)) {
    if (uVar5 != 0x3c00000) {
      return 0xffffff79;
    }
    if ((uVar1 & 0x7000) != 0x2000) {
      return 0xffffff79;
    }
    if ((uVar1 & 0x700) == 0) {
      return 0xffffff79;
    }
  }
  if ((param_1 & 0x3f0000) == 0) {
    if (uVar5 == 0x3c00000) {
      if ((uVar1 & 0x7000) != 0x2000) goto LAB_00b91428;
      uVar2 = 1 << (ulong)(uVar1 >> 8 & 7);
      goto LAB_00b912e4;
    }
    if (uVar5 != 0x3800000) {
LAB_00b91428:
      *param_3 = 0;
      return 0xffffff7a;
    }
    uVar2 = param_1 - 3;
    if ((0xf < (uVar2 & 0xff)) || ((0xe7e7U >> (ulong)(uVar2 & 0x1f) & 1) == 0)) {
      uVar2 = (uint)((param_1 & 0xff | 0x2000000) == 0x2000013) << 6;
      goto LAB_00b912e4;
    }
    uVar2 = *(uint *)(&DAT_00780a30 + (long)(char)uVar2 * 4);
    *param_3 = (char)uVar2;
    uVar4 = uVar2;
  }
  else {
    uVar2 = (param_1 & 0x3f0000) >> 0x10;
LAB_00b912e4:
    uVar4 = uVar2 & 0xff;
    *param_3 = (char)uVar2;
    if (uVar4 < 4) {
      return 0xffffff7a;
    }
    if (uVar5 == 0x3c00000) {
      if ((uVar1 & 0x7000) != 0x2000) {
        return 0xffffff79;
      }
      if ((uint)(1 << (ulong)(uVar1 >> 8 & 7)) < uVar4) {
        return 0xffffff79;
      }
      goto LAB_00b913e8;
    }
    if (uVar5 != 0x3800000) {
      return 0xffffff79;
    }
  }
  uVar5 = 0x10;
  switch(param_1 & 0xff) {
  case 4:
  case 5:
    if (0x14 < uVar4) {
      return 0xffffff79;
    }
    break;
  default:
    uVar5 = (uint)((param_1 & 0xff | 0x2000000) == 0x2000013) << 6;
  case 3:
    if (uVar5 < uVar4) {
      return 0xffffff79;
    }
    break;
  case 8:
  case 0xc:
  case 0x10:
    if (0x1c < uVar4) {
      return 0xffffff79;
    }
    break;
  case 9:
  case 0xd:
  case 0x11:
    if (0x20 < uVar4) {
      return 0xffffff79;
    }
    break;
  case 10:
  case 0x12:
    if (0x30 < uVar4) {
      return 0xffffff79;
    }
    break;
  case 0xb:
    if (0x40 < uVar4) {
      return 0xffffff79;
    }
  }
LAB_00b913e8:
  uVar3 = 0xffffff7a;
  if ((uVar2 & 0xff) < 0x41) {
    uVar3 = 0;
  }
  return uVar3;
}

