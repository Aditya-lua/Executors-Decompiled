/* 7ff70c9dc140 FUN_7ff70c9dc140 */

byte * FUN_7ff70c9dc140(undefined8 *param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  byte *pbVar2;
  byte *pbVar3;
  longlong lVar4;
  byte bVar5;
  ulonglong uVar6;
  undefined1 auStack_38 [32];
  
  if (((param_2 < param_3 && param_2 != (byte *)0x0) && (*param_2 != 0)) &&
     ((ulonglong)((longlong)param_3 - (longlong)param_2) < 0x40001)) {
    *param_1 = param_2;
    bVar1 = *param_2;
    *(byte *)((longlong)param_1 + 0x1a) = bVar1 >> 5 & 1;
    *(byte *)(param_1 + 3) = bVar1 >> 6;
    if (((bVar1 & 0x1f) != 0x1f) &&
       (*(byte *)((longlong)param_1 + 0x19) = bVar1 & 0x1f, param_2 + 1 < param_3)) {
      pbVar2 = param_2 + 2;
      uVar6 = (ulonglong)(char)param_2[1];
      pbVar3 = pbVar2;
      if ((longlong)uVar6 < 0) {
        bVar5 = param_2[1] & 0x7f;
        if (bVar5 == 0) {
          if ((bVar1 >> 5 & 1) == 0) {
            return (byte *)0x0;
          }
          param_1[1] = pbVar2;
          while( true ) {
            if (param_3 <= pbVar2) {
              return (byte *)0x0;
            }
            if (*pbVar2 == 0) break;
            pbVar2 = (byte *)FUN_7ff70c9dc140(auStack_38,pbVar2);
            if (pbVar2 == (byte *)0x0) {
              return (byte *)0x0;
            }
          }
          param_1[2] = pbVar2;
          return pbVar2 + 1;
        }
        if ((ulonglong)((longlong)param_3 - (longlong)pbVar2) < (ulonglong)bVar5) {
          return (byte *)0x0;
        }
        lVar4 = 0;
        uVar6 = 0;
        do {
          if ((char)(uVar6 >> 0x18) != '\0') {
            return (byte *)0x0;
          }
          uVar6 = (ulonglong)pbVar2[lVar4] | uVar6 << 8;
          lVar4 = lVar4 + 1;
          pbVar3 = param_2 + (ulonglong)bVar5 + 2;
        } while (bVar5 != (byte)lVar4);
      }
      if (uVar6 <= (ulonglong)((longlong)param_3 - (longlong)pbVar3)) {
        param_1[1] = pbVar3;
        param_1[2] = pbVar3 + uVar6;
        return pbVar3 + uVar6;
      }
    }
  }
  return (byte *)0x0;
}


