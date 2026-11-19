/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff66c
 */

undefined8
FUN_00bff66c(byte *param_1,byte *param_2,ulong *param_3,undefined8 param_4,uint *param_5,
            undefined8 *param_6,ulong param_7,uint param_8)

{
  byte bVar1;
  long lVar2;
  uint *puVar3;
  uint uVar4;
  
  *param_3 = (ulong)param_1;
  *param_6 = param_4;
  if ((((2 < (long)param_2 - (long)param_1) && ((param_8 >> 2 & 1) != 0)) && (*param_1 == 0xef)) &&
     ((param_1[1] == 0xbb && (param_1[2] == 0xbf)))) {
    param_1 = param_1 + 3;
    *param_3 = (ulong)param_1;
  }
  if (param_1 < param_2) {
    puVar3 = (uint *)*param_6;
    do {
      if (param_5 <= puVar3) {
        return 1;
      }
      bVar1 = *param_1;
      uVar4 = (uint)bVar1;
      if ((char)bVar1 < '\0') {
        if (uVar4 < 0xc2) {
          return 2;
        }
        if (uVar4 < 0xe0) {
          if ((long)param_2 - (long)param_1 < 2) {
            return 1;
          }
          if ((param_1[1] & 0xc0) != 0x80) {
            return 2;
          }
          lVar2 = 2;
          uVar4 = param_1[1] & 0x3f | (uVar4 & 0x1f) << 6;
          if (param_7 < uVar4) {
            return 2;
          }
        }
        else if (uVar4 < 0xf0) {
          if ((long)param_2 - (long)param_1 < 2) {
            return 1;
          }
          bVar1 = param_1[1];
          if (uVar4 == 0xed) {
            if (-0x61 < (char)bVar1) {
              return 2;
            }
          }
          else if (uVar4 == 0xe0) {
            if ((bVar1 & 0xe0) != 0xa0) {
              return 2;
            }
          }
          else if (-0x41 < (char)bVar1) {
            return 2;
          }
          if ((long)param_2 - (long)param_1 == 2) {
            return 1;
          }
          if ((param_1[2] & 0xc0) != 0x80) {
            return 2;
          }
          uVar4 = (uVar4 & 0xf) << 0xc | (bVar1 & 0x3f) << 6 | param_1[2] & 0x3f;
          if (param_7 < uVar4) {
            return 2;
          }
          lVar2 = 3;
        }
        else {
          if (0xf4 < uVar4) {
            return 2;
          }
          lVar2 = (long)param_2 - (long)param_1;
          if (lVar2 < 2) {
            return 1;
          }
          bVar1 = param_1[1];
          if (uVar4 == 0xf4) {
            if (-0x71 < (char)bVar1) {
              return 2;
            }
          }
          else if (uVar4 == 0xf0) {
            if (0x2f < bVar1 - 0x90) {
              return 2;
            }
          }
          else if (-0x41 < (char)bVar1) {
            return 2;
          }
          if (lVar2 == 2) {
            return 1;
          }
          if ((param_1[2] & 0xc0) != 0x80) {
            return 2;
          }
          if (lVar2 == 3) {
            return 1;
          }
          if ((param_1[3] & 0xc0) != 0x80) {
            return 2;
          }
          uVar4 = (uVar4 & 7) << 0x12 | (bVar1 & 0x3f) << 0xc | (param_1[2] & 0x3f) << 6 |
                  param_1[3] & 0x3f;
          if (param_7 < uVar4) {
            return 2;
          }
          lVar2 = 4;
        }
      }
      else {
        if (param_7 < bVar1) {
          return 2;
        }
        lVar2 = 1;
      }
      param_1 = param_1 + lVar2;
      *puVar3 = uVar4;
      *param_3 = (ulong)param_1;
      *param_6 = puVar3 + 1;
      puVar3 = puVar3 + 1;
    } while (param_1 < param_2);
  }
  return 0;
}

