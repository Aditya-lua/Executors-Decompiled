/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01460
 */

undefined8
FUN_00c01460(uint *param_1,uint *param_2,long *param_3,undefined1 *param_4,long param_5,
            long *param_6,ulong param_7,uint param_8)

{
  uint uVar1;
  uint uVar2;
  undefined1 *puVar3;
  uint uVar4;
  ulong uVar5;
  byte *pbVar6;
  byte bVar7;
  
  *param_6 = (long)param_4;
  *param_3 = (long)param_1;
  if ((param_8 >> 1 & 1) != 0) {
    if (param_5 - (long)param_4 < 3) {
      return 1;
    }
    *param_6 = (long)(param_4 + 1);
    *param_4 = 0xef;
    puVar3 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar3 + 1);
    *puVar3 = 0xbb;
    puVar3 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar3 + 1);
    *puVar3 = 0xbf;
    param_1 = (uint *)*param_3;
  }
  do {
    if (param_2 <= param_1) {
      return 0;
    }
    uVar2 = *param_1;
    uVar5 = (ulong)uVar2 & 0xffff;
    if (param_7 < uVar5) {
      return 2;
    }
    uVar4 = (uint)uVar5;
    if (uVar4 < 0x80) {
      pbVar6 = (byte *)*param_6;
      if (param_5 - (long)pbVar6 < 1) {
        return 1;
      }
      *param_6 = (long)(pbVar6 + 1);
      *pbVar6 = (byte)uVar2;
    }
    else {
      if (uVar4 < 0x800) {
        pbVar6 = (byte *)*param_6;
        if (param_5 - (long)pbVar6 < 2) {
          return 1;
        }
        *param_6 = (long)(pbVar6 + 1);
        bVar7 = (byte)(uVar2 >> 6) | 0xc0;
      }
      else {
        if (0x1a < uVar4 >> 0xb) {
          if (uVar4 >> 10 < 0x37) {
            if ((long)param_2 - (long)param_1 < 5) {
              return 1;
            }
            uVar4 = param_1[1];
            if ((uVar4 & 0xfc00) != 0xdc00) {
              return 2;
            }
            pbVar6 = (byte *)*param_6;
            if (param_5 - (long)pbVar6 < 4) {
              return 1;
            }
            if (param_7 < ((ulong)uVar4 & 0x3ff | ((ulong)uVar2 & 0x3ff) << 10) + 0x10000) {
              return 2;
            }
            *param_3 = (long)(param_1 + 1);
            *param_6 = (long)(pbVar6 + 1);
            uVar1 = (uVar2 >> 6 & 0xf) + 1;
            *pbVar6 = (byte)(uVar1 >> 2) | 0xf0;
            pbVar6 = (byte *)*param_6;
            *param_6 = (long)(pbVar6 + 1);
            *pbVar6 = (byte)(uVar2 >> 2) & 0xf | (char)uVar1 * '\x10' & 0x30U | 0x80;
            pbVar6 = (byte *)*param_6;
            *param_6 = (long)(pbVar6 + 1);
            *pbVar6 = (byte)((uVar2 & 3) << 4) | (byte)(uVar4 >> 6) & 0xf | 0x80;
            pbVar6 = (byte *)*param_6;
            *param_6 = (long)(pbVar6 + 1);
            *pbVar6 = (byte)uVar4 & 0x3f | 0x80;
            goto LAB_00c014ec;
          }
          if (uVar4 < 0xe000) {
            return 2;
          }
        }
        pbVar6 = (byte *)*param_6;
        if (param_5 - (long)pbVar6 < 3) {
          return 1;
        }
        *param_6 = (long)(pbVar6 + 1);
        *pbVar6 = (byte)(uVar4 >> 0xc) | 0xe0;
        pbVar6 = (byte *)*param_6;
        bVar7 = (byte)(uVar2 >> 6) & 0x3f | 0x80;
        *param_6 = (long)(pbVar6 + 1);
      }
      *pbVar6 = bVar7;
      pbVar6 = (byte *)*param_6;
      *param_6 = (long)(pbVar6 + 1);
      *pbVar6 = (byte)uVar2 & 0x3f | 0x80;
    }
LAB_00c014ec:
    param_1 = (uint *)(*param_3 + 4);
    *param_3 = (long)param_1;
  } while( true );
}

