/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c016ec
 */

undefined8
FUN_00c016ec(byte *param_1,byte *param_2,ulong *param_3,long param_4,uint *param_5,long *param_6,
            ulong param_7,uint param_8)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint *puVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  
  *param_3 = (ulong)param_1;
  *param_6 = param_4;
  if ((((2 < (long)param_2 - (long)param_1) && ((param_8 >> 2 & 1) != 0)) && (*param_1 == 0xef)) &&
     ((param_1[1] == 0xbb && (param_1[2] == 0xbf)))) {
    param_1 = param_1 + 3;
    *param_3 = (ulong)param_1;
  }
  if (param_1 < param_2) {
    puVar5 = (uint *)*param_6;
    do {
      if (param_5 <= puVar5) {
        return 1;
      }
      bVar1 = *param_1;
      if (param_7 < bVar1) {
        return 2;
      }
      uVar6 = (uint)bVar1;
      if ((char)bVar1 < '\0') {
        if (uVar6 < 0xc2) {
          return 2;
        }
        uVar7 = (uint)bVar1;
        if (uVar6 < 0xe0) {
          if ((long)param_2 - (long)param_1 < 2) {
            return 1;
          }
          if ((param_1[1] & 0xc0) != 0x80) {
            return 2;
          }
          uVar6 = param_1[1] & 0x3f | (uVar7 & 0x1f) << 6;
          if (param_7 < uVar6) {
            return 2;
          }
          *puVar5 = uVar6;
          lVar8 = 2;
        }
        else if (uVar7 < 0xf0) {
          if ((long)param_2 - (long)param_1 < 2) {
            return 1;
          }
          bVar2 = param_1[1];
          if (bVar1 == 0xed) {
            if (-0x61 < (char)bVar2) {
              return 2;
            }
          }
          else if (bVar1 == 0xe0) {
            if ((bVar2 & 0xe0) != 0xa0) {
              return 2;
            }
          }
          else if (-0x41 < (char)bVar2) {
            return 2;
          }
          if ((long)param_2 - (long)param_1 == 2) {
            return 1;
          }
          if ((param_1[2] & 0xc0) != 0x80) {
            return 2;
          }
          uVar6 = (uVar7 & 0xf) << 0xc | (bVar2 & 0x3f) << 6 | param_1[2] & 0x3f;
          if (param_7 < uVar6) {
            return 2;
          }
          *puVar5 = uVar6;
          lVar8 = 3;
        }
        else {
          if (0xf4 < uVar7) {
            return 2;
          }
          lVar8 = (long)param_2 - (long)param_1;
          if (lVar8 < 2) {
            return 1;
          }
          bVar2 = param_1[1];
          if (bVar1 == 0xf4) {
            if (-0x71 < (char)bVar2) {
              return 2;
            }
          }
          else if (uVar7 == 0xf0) {
            if (0x2f < bVar2 - 0x90) {
              return 2;
            }
          }
          else if (-0x41 < (char)bVar2) {
            return 2;
          }
          if (lVar8 == 2) {
            return 1;
          }
          bVar3 = param_1[2];
          if ((bVar3 & 0xc0) != 0x80) {
            return 2;
          }
          if (lVar8 == 3) {
            return 1;
          }
          bVar4 = param_1[3];
          if ((bVar4 & 0xc0) != 0x80) {
            return 2;
          }
          if ((long)param_5 - (long)puVar5 < 5) {
            return 1;
          }
          if (param_7 < (((ulong)bVar1 & 7) << 0x12 | ((ulong)bVar2 & 0x3f) << 0xc |
                         ((ulong)bVar3 & 0x3f) << 6 | (ulong)bVar4 & 0x3f)) {
            return 2;
          }
          *puVar5 = ((bVar2 & 0xf) << 2 | ((uVar7 & 7) << 2 | bVar2 >> 4 & 3) << 6 | bVar3 >> 4 & 3)
                    - 0x40 | 0xd800;
          lVar8 = 4;
          puVar5 = puVar5 + 1;
          *puVar5 = bVar4 & 0x3f | (bVar3 & 0xf) << 6 | 0xdc00;
        }
      }
      else {
        *puVar5 = uVar6;
        lVar8 = 1;
      }
      param_1 = param_1 + lVar8;
      puVar5 = puVar5 + 1;
      *param_3 = (ulong)param_1;
      *param_6 = (long)puVar5;
    } while (param_1 < param_2);
  }
  return 0;
}

