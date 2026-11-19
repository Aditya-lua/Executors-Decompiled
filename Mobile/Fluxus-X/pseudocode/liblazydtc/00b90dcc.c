/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b90dcc
 */

uint FUN_00b90dcc(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  
  if (param_2 == param_3) {
    return param_2;
  }
  uVar2 = param_2 & 0xffffff00;
  if ((int)uVar2 < 0x6000900) {
    if (uVar2 != 0x6000200) {
      uVar1 = 0x300;
      goto LAB_00b90e1c;
    }
LAB_00b90e3c:
    uVar1 = param_3 & 0xffffff00;
    if ((uVar1 == 0x6000200) || ((uVar1 == 0x6000300 || (uVar1 == 0x6001300)))) {
      if (uVar2 == uVar1) goto LAB_00b90f7c;
    }
    else if ((uVar2 == uVar1) && (uVar1 == 0x6000900 || (param_3 & 0xfffffc00 | 0x200) == 0x6000600)
            ) {
LAB_00b90f7c:
      if ((int)uVar2 < 0x6000900) {
        if (uVar2 != 0x6000200) {
          uVar3 = 0x300;
          goto LAB_00b90fc0;
        }
LAB_00b90fe0:
        if (((param_2 & 0xff) != 0) && ((param_2 & 0xff | 0x2000000) == 0x20000ff)) {
          return param_3;
        }
      }
      else {
        if (uVar2 == 0x6000900) goto LAB_00b90fe0;
        uVar3 = 0x1300;
LAB_00b90fc0:
        if ((uVar2 == (uVar3 | 0x6000000)) || ((param_2 >> 9 | 1) == 0x30003)) goto LAB_00b90fe0;
      }
      if ((int)uVar1 < 0x6000900) {
        if (uVar1 != 0x6000200) {
          uVar2 = 0x300;
          goto LAB_00b91040;
        }
      }
      else if (uVar1 != 0x6000900) {
        uVar2 = 0x1300;
LAB_00b91040:
        if ((uVar1 != (uVar2 | 0x6000000)) && ((param_3 >> 9 | 1) != 0x30003)) goto LAB_00b90e78;
      }
      if (((param_3 & 0xff) != 0) && ((param_3 & 0xff | 0x2000000) == 0x20000ff)) {
        return param_2;
      }
    }
  }
  else {
    if (uVar2 == 0x6000900) goto LAB_00b90e3c;
    uVar1 = 0x1300;
LAB_00b90e1c:
    if ((uVar2 == (uVar1 | 0x6000000)) || ((param_2 >> 9 | 1) == 0x30003)) goto LAB_00b90e3c;
  }
LAB_00b90e78:
  if (((param_2 & 0x7f000000) == 0x5000000) && ((param_3 & 0x7f000000) == 0x5000000)) {
    if ((param_2 & 0xffc07fff) != (param_3 & 0xffc07fff)) {
      return 0;
    }
    uVar2 = param_2 >> 0x10 & 0x3f;
    uVar1 = param_3 >> 0x10 & 0x3f;
    if ((param_2 & 0x8000 & param_3) == 0) {
      if (((param_2 & 0x8000) != 0) && (uVar2 <= uVar1)) {
        return param_3;
      }
      if ((param_3 >> 0xf & 1) == 0) {
        return 0;
      }
      if (uVar2 < uVar1) {
        return 0;
      }
      return param_2;
    }
    if (uVar2 <= uVar1) {
      uVar2 = uVar1;
    }
    goto LAB_00b90ec0;
  }
  if ((param_2 & 0x7f000000) != 0x3000000) {
    return 0;
  }
  if ((param_3 & 0x7f000000) != 0x3000000) {
    return 0;
  }
  if ((param_2 & 0xffc07fff) != (param_3 & 0xffc07fff)) {
    return 0;
  }
  uVar1 = param_2 & 0x7fc00000;
  if (((param_1 & 0xffff) != 0x1100) || (uVar1 != 0x3800000)) {
    if (uVar1 != 0x3c00000) {
      return 0;
    }
    if ((param_1 & 0x7000) != 0x2000) {
      return 0;
    }
    if ((param_1 & 0x700) == 0) {
      return 0;
    }
  }
  if ((param_2 & 0x3f0000) == 0) {
    if (uVar1 != 0x3c00000) {
      uVar2 = 0;
      if (uVar1 == 0x3800000) {
        uVar2 = param_2 - 3;
        if (((uVar2 & 0xff) < 0x10) && ((0xe7e7U >> (ulong)(uVar2 & 0x1f) & 1) != 0)) {
          uVar2 = *(uint *)(&DAT_00780a30 + (long)(char)uVar2 * 4);
          goto joined_r0x00b91224;
        }
        uVar2 = (uint)((param_2 & 0xff | 0x2000000) == 0x2000013) << 6;
      }
      goto joined_r0x00b9114c;
    }
    uVar2 = 0;
    if ((param_1 & 0x7000) != 0x2000) goto joined_r0x00b9114c;
    uVar2 = 1 << (ulong)((param_1 & 0xffff) >> 8 & 7);
joined_r0x00b91224:
    if ((param_3 & 0x3f0000) == 0) goto LAB_00b91150;
LAB_00b90f34:
    uVar1 = (param_3 & 0x3f0000) >> 0x10;
  }
  else {
    uVar2 = (param_2 & 0x3f0000) >> 0x10;
joined_r0x00b9114c:
    if ((param_3 & 0x3f0000) != 0) goto LAB_00b90f34;
LAB_00b91150:
    if ((param_3 & 0x7fc00000) == 0x3c00000) {
      uVar1 = 0;
      if ((param_1 & 0x7000) == 0x2000) {
        uVar1 = 1 << (ulong)((param_1 & 0xffff) >> 8 & 7);
      }
    }
    else {
      uVar1 = 0;
      if ((param_3 & 0x7fc00000) == 0x3800000) {
        uVar1 = param_3 - 3;
        if (((uVar1 & 0xff) < 0x10) && ((0xe7e7U >> (ulong)(uVar1 & 0x1f) & 1) != 0)) {
          uVar1 = *(uint *)(&DAT_00780a30 + (long)(char)uVar1 * 4);
        }
        else {
          uVar1 = (uint)((param_3 & 0xff | 0x2000000) == 0x2000013) << 6;
        }
      }
    }
  }
  if (((param_3 >> 0xf & 1) == 0) || ((param_2 >> 0xf & 1) == 0)) {
    if ((param_2 >> 0xf & 1) != 0) {
      uVar3 = 0;
      if (uVar2 <= uVar1) {
        uVar3 = param_3;
      }
      return uVar3;
    }
    if ((param_3 >> 0xf & 1) == 0) {
      if (uVar2 == uVar1) {
        return (uVar2 & 0x3f) << 0x10 | param_2 & 0xffc07fff;
      }
      return 0;
    }
    uVar3 = 0;
    if (uVar1 <= uVar2) {
      uVar3 = param_2;
    }
    return uVar3;
  }
  if (uVar2 <= uVar1) {
    uVar2 = uVar1;
  }
LAB_00b90ec0:
  return param_2 & 0xffc07fff | (uVar2 & 0x3f) << 0x10 | 0x8000;
}

