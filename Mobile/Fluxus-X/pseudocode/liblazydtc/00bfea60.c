/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfea60
 */

undefined8
FUN_00bfea60(ushort *param_1,ushort *param_2,long *param_3,undefined1 *param_4,long param_5,
            long *param_6,ulong param_7,uint param_8)

{
  uint uVar1;
  ushort uVar2;
  ushort uVar3;
  undefined1 *puVar4;
  byte *pbVar5;
  byte bVar6;
  
  *param_6 = (long)param_4;
  *param_3 = (long)param_1;
  if ((param_8 >> 1 & 1) != 0) {
    if (param_5 - (long)param_4 < 3) {
      return 1;
    }
    *param_6 = (long)(param_4 + 1);
    *param_4 = 0xef;
    puVar4 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar4 + 1);
    *puVar4 = 0xbb;
    puVar4 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar4 + 1);
    *puVar4 = 0xbf;
    param_1 = (ushort *)*param_3;
  }
  do {
    if (param_2 <= param_1) {
      return 0;
    }
    uVar2 = *param_1;
    if (param_7 < uVar2) {
      return 2;
    }
    if (uVar2 < 0x80) {
      pbVar5 = (byte *)*param_6;
      if (param_5 - (long)pbVar5 < 1) {
        return 1;
      }
      *param_6 = (long)(pbVar5 + 1);
      *pbVar5 = (byte)uVar2;
    }
    else {
      if (uVar2 < 0x800) {
        pbVar5 = (byte *)*param_6;
        if (param_5 - (long)pbVar5 < 2) {
          return 1;
        }
        *param_6 = (long)(pbVar5 + 1);
        bVar6 = (byte)(uVar2 >> 6) | 0xc0;
      }
      else {
        bVar6 = (byte)(uVar2 >> 8);
        if (uVar2 >> 0xb < 0x1b) {
          pbVar5 = (byte *)*param_6;
          if (param_5 - (long)pbVar5 < 3) {
            return 1;
          }
          *param_6 = (long)(pbVar5 + 1);
          *pbVar5 = bVar6 >> 4 | 0xe0;
          pbVar5 = (byte *)*param_6;
          bVar6 = (byte)(uVar2 >> 6) & 0x3f | 0x80;
        }
        else {
          if (uVar2 >> 10 < 0x37) {
            if ((long)param_2 - (long)param_1 < 3) {
              return 1;
            }
            uVar3 = param_1[1];
            if ((uVar3 & 0xfc00) != 0xdc00) {
              return 2;
            }
            pbVar5 = (byte *)*param_6;
            if (param_5 - (long)pbVar5 < 4) {
              return 1;
            }
            if (param_7 < ((ulong)uVar3 & 0x3ff | ((ulong)uVar2 & 0x3ff) << 10) + 0x10000) {
              return 2;
            }
            *param_3 = (long)(param_1 + 1);
            *param_6 = (long)(pbVar5 + 1);
            uVar1 = (uVar2 >> 6 & 0xf) + 1;
            *pbVar5 = (byte)(uVar1 >> 2) | 0xf0;
            pbVar5 = (byte *)*param_6;
            *param_6 = (long)(pbVar5 + 1);
            *pbVar5 = (char)uVar1 * '\x10' & 0x30U | (byte)(uVar2 >> 2) & 0xf | 0x80;
            pbVar5 = (byte *)*param_6;
            *param_6 = (long)(pbVar5 + 1);
            *pbVar5 = (byte)((uVar2 & 3) << 4) | (byte)(uVar3 >> 6) & 0xf | 0x80;
            pbVar5 = (byte *)*param_6;
            *param_6 = (long)(pbVar5 + 1);
            *pbVar5 = (byte)uVar3 & 0x3f | 0x80;
            goto LAB_00bfeb14;
          }
          if (uVar2 < 0xe000) {
            return 2;
          }
          pbVar5 = (byte *)*param_6;
          if (param_5 - (long)pbVar5 < 3) {
            return 1;
          }
          *param_6 = (long)(pbVar5 + 1);
          *pbVar5 = bVar6 >> 4 | 0xe0;
          pbVar5 = (byte *)*param_6;
          bVar6 = (byte)(uVar2 >> 6) & 0xbf;
        }
        *param_6 = (long)(pbVar5 + 1);
      }
      *pbVar5 = bVar6;
      pbVar5 = (byte *)*param_6;
      *param_6 = (long)(pbVar5 + 1);
      *pbVar5 = (byte)uVar2 & 0x3f | 0x80;
    }
LAB_00bfeb14:
    param_1 = (ushort *)(*param_3 + 2);
    *param_3 = (long)param_1;
  } while( true );
}

