/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff480
 */

undefined8
FUN_00bff480(uint *param_1,uint *param_2,long *param_3,undefined1 *param_4,long param_5,
            long *param_6,ulong param_7,uint param_8)

{
  uint uVar1;
  undefined1 *puVar2;
  byte *pbVar3;
  byte bVar4;
  
  *param_6 = (long)param_4;
  *param_3 = (long)param_1;
  if ((param_8 >> 1 & 1) != 0) {
    if (param_5 - (long)param_4 < 3) {
      return 1;
    }
    *param_6 = (long)(param_4 + 1);
    *param_4 = 0xef;
    puVar2 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar2 + 1);
    *puVar2 = 0xbb;
    puVar2 = (undefined1 *)*param_6;
    *param_6 = (long)(puVar2 + 1);
    *puVar2 = 0xbf;
    param_1 = (uint *)*param_3;
  }
  while( true ) {
    if (param_2 <= param_1) {
      return 0;
    }
    uVar1 = *param_1;
    if (uVar1 >> 0xb == 0x1b || param_7 < uVar1) break;
    if (uVar1 < 0x80) {
      pbVar3 = (byte *)*param_6;
      if (param_5 - (long)pbVar3 < 1) {
        return 1;
      }
      *param_6 = (long)(pbVar3 + 1);
      *pbVar3 = (byte)uVar1;
    }
    else {
      if (uVar1 < 0x800) {
        pbVar3 = (byte *)*param_6;
        if (param_5 - (long)pbVar3 < 2) {
          return 1;
        }
        *param_6 = (long)(pbVar3 + 1);
        bVar4 = (byte)(uVar1 >> 6) | 0xc0;
      }
      else {
        pbVar3 = (byte *)*param_6;
        if (uVar1 >> 0x10 == 0) {
          if (param_5 - (long)pbVar3 < 3) {
            return 1;
          }
          *param_6 = (long)(pbVar3 + 1);
          bVar4 = (byte)(uVar1 >> 0xc) | 0xe0;
        }
        else {
          if (param_5 - (long)pbVar3 < 4) {
            return 1;
          }
          *param_6 = (long)(pbVar3 + 1);
          *pbVar3 = (byte)(uVar1 >> 0x12) | 0xf0;
          pbVar3 = (byte *)*param_6;
          bVar4 = (byte)(uVar1 >> 0xc) & 0x3f | 0x80;
          *param_6 = (long)(pbVar3 + 1);
        }
        *pbVar3 = bVar4;
        pbVar3 = (byte *)*param_6;
        bVar4 = (byte)(uVar1 >> 6) & 0x3f | 0x80;
        *param_6 = (long)(pbVar3 + 1);
      }
      *pbVar3 = bVar4;
      pbVar3 = (byte *)*param_6;
      *param_6 = (long)(pbVar3 + 1);
      *pbVar3 = (byte)uVar1 & 0x3f | 0x80;
    }
    param_1 = (uint *)(*param_3 + 4);
    *param_3 = (long)param_1;
  }
  return 2;
}

