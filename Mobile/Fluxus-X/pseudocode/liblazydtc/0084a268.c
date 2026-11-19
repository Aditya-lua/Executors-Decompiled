/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a268
 */

byte * FUN_0084a268(undefined8 param_1,byte *param_2,byte *param_3,undefined8 param_4,
                   undefined4 param_5,undefined4 param_6)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  byte *pbVar4;
  int iVar5;
  
  if (param_2 == param_3) {
    return param_2;
  }
  if (*param_2 == 0x2a) {
    FUN_008499e0(param_1,0,0xffffffffffffffff,param_4,param_5,param_6,1);
    return param_2 + 1;
  }
  if (param_2 + 1 == param_3) {
    return param_2;
  }
  if (*param_2 != 0x5c) {
    return param_2;
  }
  if (param_2[1] != 0x7b) {
    return param_2;
  }
  param_2 = param_2 + (ulong)(param_2[1] == 0x7b) * 2;
  if ((param_2 != param_3) &&
     ((bVar1 = *param_2, (bVar1 & 0xf8) == 0x30 || ((bVar1 & 0xfe) == 0x38)))) {
    param_2 = param_2 + 1;
    iVar3 = bVar1 - 0x30;
    if (param_2 != param_3) {
      do {
        bVar1 = *param_2;
        if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) goto LAB_0084a35c;
        if (0xccccccb < iVar3) goto LAB_0084a4a0;
        param_2 = param_2 + 1;
        iVar3 = (uint)bVar1 + iVar3 * 10 + -0x30;
      } while (param_2 != param_3);
      param_2 = param_3;
    }
LAB_0084a35c:
    if (param_2 == param_3) goto LAB_0084a4a4;
    pbVar4 = param_2 + 1;
    if (*param_2 != 0x2c) {
      if (((pbVar4 != param_3) && (*param_2 == 0x5c)) && (*pbVar4 == 0x7d)) {
        lVar2 = (long)iVar3;
        pbVar4 = param_2 + 2;
        goto LAB_0084a438;
      }
      goto LAB_0084a4a4;
    }
    if ((pbVar4 == param_3) ||
       ((bVar1 = *pbVar4, (bVar1 & 0xf8) != 0x30 && ((bVar1 & 0xfe) != 0x38)))) {
      iVar5 = -1;
    }
    else {
      pbVar4 = param_2 + 2;
      iVar5 = bVar1 - 0x30;
      if (pbVar4 != param_3) {
        do {
          bVar1 = *pbVar4;
          if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) goto LAB_0084a39c;
          if (0xccccccb < iVar5) goto LAB_0084a4a0;
          pbVar4 = pbVar4 + 1;
          iVar5 = (uint)bVar1 + iVar5 * 10 + -0x30;
        } while (pbVar4 != param_3);
        pbVar4 = param_3;
      }
    }
LAB_0084a39c:
    if ((((pbVar4 == param_3) || (pbVar4 + 1 == param_3)) || (*pbVar4 != 0x5c)) ||
       (pbVar4[1] != 0x7d)) goto LAB_0084a4a4;
    pbVar4 = pbVar4 + (ulong)(pbVar4[1] == 0x7d) * 2;
    if (iVar5 == -1) {
      lVar2 = -1;
LAB_0084a438:
      FUN_008499e0(param_1,(long)iVar3,lVar2,param_4,param_5,param_6,1);
      return pbVar4;
    }
    if (iVar3 <= iVar5) {
      lVar2 = (long)iVar5;
      goto LAB_0084a438;
    }
  }
LAB_0084a4a0:
  FUN_00849af4();
LAB_0084a4a4:
                    /* WARNING: Subroutine does not return */
  FUN_00849b40();
}

