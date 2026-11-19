/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6950c
 */

undefined8
mbedtls_base64_decode(undefined1 *param_1,ulong param_2,ulong *param_3,byte *param_4,ulong param_5)

{
  byte bVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  undefined1 *puVar10;
  uint uVar11;
  undefined1 *puVar12;
  
  if (param_5 != 0) {
    uVar4 = 0;
    uVar8 = 0;
    uVar6 = 0;
    do {
      if (uVar6 < param_5) {
        bVar3 = false;
        do {
          if (param_4[uVar6] != 0x20) break;
          uVar6 = uVar6 + 1;
          bVar3 = true;
        } while (uVar6 < param_5);
      }
      else {
        bVar3 = false;
      }
      uVar7 = param_5;
      if (uVar6 == param_5) break;
      uVar9 = (uint)param_4[uVar6];
      if ((param_5 - uVar6 < 2) || (uVar9 != 0xd)) {
        if (uVar9 != 10) goto joined_r0x00b695f4;
      }
      else if (param_4[uVar6 + 1] != 10) {
        uVar9 = 0xd;
joined_r0x00b695f4:
        if (bVar3) {
          return 0xffffffd4;
        }
        cVar2 = (char)uVar9;
        if (cVar2 < '\0') {
          return 0xffffffd4;
        }
        if (uVar9 == 0x3d) {
          uVar4 = uVar4 + 1;
          if (2 < uVar4) {
            return 0xffffffd4;
          }
        }
        else {
          if (uVar4 != 0) {
            return 0xffffffd4;
          }
          uVar4 = 0;
          if ((char)(((((byte)(uVar9 + 0xff9f >> 8) | (byte)(0x7a - uVar9 >> 8)) ^ 0xff) &
                      cVar2 + 0xbaU |
                      (((byte)(uVar9 + 0xffbf >> 8) | (byte)(0x5a - uVar9 >> 8)) ^ 0xff) &
                      cVar2 - 0x40U |
                      cVar2 + 5U &
                      (((byte)(uVar9 + 0xffd0 >> 8) | (byte)(0x39 - uVar9 >> 8)) ^ 0xff) |
                      cVar2 + 0x14U &
                      (((byte)(uVar9 + 0xffd5 >> 8) | (byte)(0x2b - uVar9 >> 8)) ^ 0xff) |
                     cVar2 + 0x11U &
                     (((byte)(uVar9 + 0xffd1 >> 8) | (byte)(0x2f - uVar9 >> 8)) ^ 0xff)) - 1) < '\0'
             ) {
            return 0xffffffd4;
          }
        }
        uVar8 = uVar8 + 1;
      }
      uVar6 = uVar6 + 1;
      uVar7 = uVar6;
    } while (uVar6 < param_5);
    if (uVar8 != 0) {
      uVar8 = ((uVar8 >> 3) * 6 - (ulong)uVar4) + ((uVar8 & 7) * 6 + 7 >> 3);
      if ((param_1 == (undefined1 *)0x0) || (param_2 < uVar8)) {
        *param_3 = uVar8;
        return 0xffffffd6;
      }
      puVar12 = param_1;
      if (uVar7 != 0) {
        uVar4 = 0;
        iVar5 = 0;
        uVar9 = 0;
        puVar10 = param_1;
        do {
          bVar1 = *param_4;
          uVar11 = (uint)bVar1;
          puVar12 = puVar10;
          if ((0x20 < uVar11) || ((1L << ((ulong)bVar1 & 0x3f) & 0x100002400U) == 0)) {
            uVar9 = uVar9 << 6;
            if (bVar1 == 0x3d) {
              uVar4 = uVar4 + 1;
            }
            else {
              uVar9 = uVar9 | (int)((((bVar1 + 0xff9f | 0x7a - bVar1) >> 8 ^ 0xff) &
                                     uVar11 - 0x46 & 0xff |
                                     ((bVar1 + 0xffbf | 0x5a - bVar1) >> 8 ^ 0xff) &
                                     bVar1 - 0x40 & 0xff |
                                     uVar11 + 5 & 0xff &
                                     ((uVar11 + 0xffd0 | 0x39 - uVar11) >> 8 ^ 0xffffffff) |
                                     uVar11 + 0x14 & 0xff &
                                     ((uVar11 + 0xffd5 | 0x2b - uVar11) >> 8 ^ 0xffffffff) |
                                    uVar11 + 0x11 & 0xff &
                                    ((uVar11 + 0xffd1 | 0x2f - uVar11) >> 8 ^ 0xffffffff)) *
                                    0x1000000 + -0x1000000) >> 0x18;
            }
            iVar5 = iVar5 + 1;
            if (iVar5 == 4) {
              puVar12 = puVar10 + 1;
              *puVar10 = (char)(uVar9 >> 0x10);
              if (uVar4 < 2) {
                iVar5 = 0;
                puVar10[1] = (char)(uVar9 >> 8);
                if (uVar4 == 0) {
                  puVar12 = puVar10 + 3;
                  puVar10[2] = (char)uVar9;
                }
                else {
                  puVar12 = puVar10 + 2;
                  uVar4 = 1;
                }
              }
              else {
                iVar5 = 0;
              }
            }
          }
          uVar7 = uVar7 - 1;
          param_4 = param_4 + 1;
          puVar10 = puVar12;
        } while (uVar7 != 0);
      }
      *param_3 = (long)puVar12 - (long)param_1;
      return 0;
    }
  }
  *param_3 = 0;
  return 0;
}

