/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9861c
 */

undefined4
mbedtls_cipher_values_from_psa
          (uint param_1,ushort param_2,long *param_3,undefined4 *param_4,undefined4 *param_5)

{
  uint uVar1;
  bool bVar2;
  undefined4 uVar3;
  
  uVar1 = param_1 & 0xffc07fff;
  if ((param_1 & 0x7f000000) != 0x5000000) {
    uVar1 = param_1;
  }
  if ((uVar1 & 0x7e000000 | 0x1000000) == 0x5000000) {
    if ((int)uVar1 < 0x4c01100) {
      if ((int)uVar1 < 0x4404400) {
        if ((uVar1 != 0x4404000) && (uVar1 != 0x4404100)) {
          return 0xffffff7a;
        }
        uVar3 = 2;
      }
      else {
        if (uVar1 == 0x4404400) goto LAB_00b986fc;
        if (uVar1 == 0x4800100) {
          uVar3 = 7;
        }
        else {
          if (uVar1 != 0x4c01000) {
            return 0xffffff7a;
          }
          uVar3 = 5;
        }
      }
    }
    else if ((int)uVar1 < 0x5000500) {
      if (uVar1 == 0x4c01100) {
        uVar3 = 3;
      }
      else if (uVar1 == 0x4c01200) {
        uVar3 = 4;
      }
      else {
        if (uVar1 != 0x4c01300) {
          return 0xffffff7a;
        }
        uVar3 = 9;
      }
    }
    else if (uVar1 == 0x5000500) {
      uVar3 = 0xb;
    }
    else if (uVar1 == 0x5400100) {
      uVar3 = 8;
    }
    else {
      if (uVar1 != 0x5400200) {
        return 0xffffff7a;
      }
      uVar3 = 6;
    }
  }
  else {
    if (uVar1 != 0x3c00200) {
      return 0xffffff7a;
    }
LAB_00b986fc:
    uVar3 = 1;
  }
  *param_4 = uVar3;
  if (param_2 < 0x2400) {
    if (param_2 == 0x2004) {
      uVar3 = 7;
    }
    else {
      if (param_2 != 0x2301) {
        return 0xffffff7a;
      }
      uVar3 = 3;
      if (*param_3 != 0x40) {
        uVar3 = 4;
      }
      if (*param_3 == 0x80) {
        *param_3 = 0xc0;
      }
    }
  }
  else if (param_2 == 0x2400) {
    uVar3 = 2;
  }
  else if (param_2 == 0x2403) {
    uVar3 = 5;
  }
  else {
    if (param_2 != 0x2406) {
      return 0xffffff7a;
    }
    uVar3 = 6;
  }
  if (param_5 != (undefined4 *)0x0) {
    *param_5 = uVar3;
  }
  if ((int)uVar1 < 0x4c01000) {
    if ((int)uVar1 < 0x4404400) {
      if (((uVar1 != 0x3c00200) && (uVar1 != 0x4404000)) && (uVar1 != 0x4404100)) {
        return 0xffffff7a;
      }
      goto LAB_00b98944;
    }
    if ((uVar1 == 0x4404400) || (uVar1 == 0x440ff00)) goto LAB_00b98944;
    if (uVar1 != 0x4800100) {
      return 0xffffff7a;
    }
LAB_00b98918:
    if (param_2 == 0x2004) {
      return 0;
    }
    uVar1 = uVar1 + 0xfb3ff000 >> 8 | uVar1 << 0x18;
    bVar2 = uVar1 == 3;
    if (uVar1 < 3) {
LAB_00b98944:
      uVar1 = param_2 - 0x2400;
      if ((uVar1 < 7) && ((1 << (ulong)(uVar1 & 0x1f) & 0x49U) != 0)) {
        return 0;
      }
      if (param_2 == 0x2301) {
        return 0;
      }
      return 0xffffff7a;
    }
  }
  else {
    if ((int)uVar1 < 0x4c01300) {
      if (((uVar1 != 0x4c01000) && (uVar1 != 0x4c01100)) && (uVar1 != 0x4c01200)) {
        return 0xffffff7a;
      }
      goto LAB_00b98944;
    }
    if ((int)uVar1 < 0x5400100) {
      if (uVar1 == 0x4c01300) goto LAB_00b989c0;
      if (uVar1 != 0x5000500) {
        return 0xffffff7a;
      }
      goto LAB_00b98918;
    }
    if (uVar1 == 0x5400100) goto LAB_00b989c0;
    bVar2 = uVar1 == 0x5400200;
  }
  if (!bVar2) {
    return 0xffffff7a;
  }
LAB_00b989c0:
  if ((ushort)(param_2 + 0xdc00) < 7) {
    return *(undefined4 *)(&DAT_00786840 + (long)(short)(param_2 + 0xdc00) * 4);
  }
  return 0xffffff7a;
}

