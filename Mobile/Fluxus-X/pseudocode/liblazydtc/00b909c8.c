/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b909c8
 */

/* WARNING: Type propagation algorithm not settling */

uint FUN_00b909c8(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  uint uVar4;
  uint uVar5;
  
  if (param_3 == param_2) {
    return 1;
  }
  uVar1 = param_3 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 == 0x6000200) goto LAB_00b90a3c;
    uVar4 = 0x300;
LAB_00b90a1c:
    if ((uVar1 == (uVar4 | 0x6000000)) || ((param_3 >> 9 | 1) == 0x30003)) goto LAB_00b90a3c;
  }
  else {
    if (uVar1 != 0x6000900) {
      uVar4 = 0x1300;
      goto LAB_00b90a1c;
    }
LAB_00b90a3c:
    uVar4 = param_2 & 0xffffff00;
    if ((int)uVar4 < 0x6000900) {
      if (uVar4 != 0x6000200) {
        uVar5 = 0x300;
LAB_00b90a7c:
        if ((uVar4 != (uVar5 | 0x6000000)) && ((param_2 >> 9 | 1) != 0x30003)) goto LAB_00b90ad0;
      }
    }
    else if (uVar4 != 0x6000900) {
      uVar5 = 0x1300;
      goto LAB_00b90a7c;
    }
    if (((param_2 & 0xff) != 0) && ((param_2 & 0xff | 0x2000000) == 0x20000ff)) {
      bVar3 = uVar4 == uVar1;
      goto LAB_00b90ac4;
    }
  }
LAB_00b90ad0:
  uVar1 = param_2 & 0x7f000000;
  uVar4 = param_3 & 0x7f000000;
  if ((uVar1 == 0x5000000) && (uVar4 == 0x5000000)) {
    if ((param_2 >> 0xf & 1) == 0) {
      return 0;
    }
    if (((param_3 ^ param_2) & 0xffc07fff) == 0) {
      return (uint)((param_2 >> 0x10 & 0x3f) <= (param_3 >> 0x10 & 0x3f));
    }
    return 0;
  }
  if ((uVar1 != 0x3000000) || (uVar4 != 0x3000000)) {
    if (uVar1 != 0x9000000) {
      return 0;
    }
    if ((param_2 & 0xfe00ffff | 0x8000000) != 0x8000000) {
      return 0;
    }
    if (uVar4 != 0x9000000) {
      return 0;
    }
    bVar3 = (param_3 & 0xf6ff0000 | 0x9000000) == param_2;
    goto LAB_00b90ac4;
  }
  if (((param_3 ^ param_2) & 0xffc07fff) != 0) {
    return 0;
  }
  if (((param_1 & 0xffff) != 0x1100) || ((param_2 & 0x7fc00000) != 0x3800000)) {
    if ((param_2 & 0x7fc00000) != 0x3c00000) {
      return 0;
    }
    if ((param_1 & 0x7000) != 0x2000) {
      return 0;
    }
    if ((param_1 & 0x700) == 0) {
      return 0;
    }
  }
  uVar1 = param_3 & 0x3f0000;
  if (uVar1 == 0) {
    if ((param_3 & 0x7fc00000) != 0x3c00000) {
      if ((param_3 & 0x7fc00000) != 0x3800000) {
        uVar4 = 0;
        goto LAB_00b90b6c;
      }
      uVar4 = param_3 - 3;
      if (((uVar4 & 0xff) < 0x10) && ((0xe7e7U >> (ulong)(uVar4 & 0x1f) & 1) != 0)) {
        uVar4 = *(uint *)(&DAT_00780a30 + (long)(char)uVar4 * 4);
      }
      else {
        uVar4 = (uint)((param_3 & 0xff | 0x2000000) == 0x2000013) << 6;
      }
      goto LAB_00b90d1c;
    }
    uVar4 = 0;
    if ((param_1 & 0x7000) == 0x2000) {
      uVar4 = 1 << (ulong)((param_1 & 0xffff) >> 8 & 7);
    }
LAB_00b90cc0:
    if ((param_1 & 0x7000) == 0x2000) {
      uVar5 = 1 << (ulong)((param_1 & 0xffff) >> 8 & 7);
    }
    else {
      uVar5 = 0;
    }
    goto joined_r0x00b90d5c;
  }
  uVar4 = uVar1 >> 0x10;
LAB_00b90b6c:
  if ((param_3 & 0x7fc00000) == 0x3800000) {
LAB_00b90d1c:
    uVar5 = 0x10;
    switch(param_3 & 0xff) {
    case 3:
      goto switchD_00b90d40_caseD_3;
    case 4:
    case 5:
      uVar5 = 0x14;
      break;
    default:
      uVar5 = (uint)((param_3 & 0xff | 0x2000000) == 0x2000013) << 6;
      break;
    case 8:
    case 0xc:
    case 0x10:
      uVar5 = 0x1c;
      break;
    case 9:
    case 0xd:
      uVar5 = 0x20;
      break;
    case 10:
    case 0x12:
      uVar5 = 0x30;
      break;
    case 0xb:
      uVar5 = 0x40;
      break;
    case 0x11:
      uVar5 = 0x20;
    }
  }
  else {
    uVar5 = 0;
    if ((param_3 & 0x7fc00000) == 0x3c00000) goto LAB_00b90cc0;
switchD_00b90d40_caseD_3:
  }
joined_r0x00b90d5c:
  uVar2 = param_2 >> 0x10 & 0x3f;
  if (uVar2 != 0) {
    if ((uVar1 == 0) && (uVar2 == uVar5)) {
      return 1;
    }
    return (uint)(uVar2 <= uVar4) & (param_2 & 0x8000) >> 0xf;
  }
  bVar3 = uVar4 == uVar5;
LAB_00b90ac4:
  return (uint)bVar3;
}

