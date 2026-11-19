/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00843334
 */

byte * FUN_00843334(long param_1,byte *param_2,byte *param_3,undefined8 param_4,undefined4 param_5,
                   undefined4 param_6)

{
  uint uVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  int iVar6;
  int iVar7;
  byte *pbVar8;
  
  if (param_2 == param_3) {
    return param_2;
  }
  bVar2 = *param_2;
  uVar1 = *(uint *)(param_1 + 0x18) & 0x1f0;
  if (bVar2 < 0x3f) {
    if (bVar2 == 0x2a) {
      pbVar8 = param_2 + 1;
      if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
        pbVar8 = param_2 + 2;
        lVar3 = 0;
LAB_008434b0:
        lVar4 = -1;
LAB_008434e8:
        uVar5 = 0;
        goto LAB_00843668;
      }
      lVar3 = 0;
    }
    else {
      if (bVar2 != 0x2b) {
        return param_2;
      }
      pbVar8 = param_2 + 1;
      if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
        pbVar8 = param_2 + 2;
        lVar3 = 1;
        goto LAB_008434b0;
      }
      lVar3 = 1;
    }
LAB_0084350c:
    lVar4 = -1;
  }
  else {
    if (bVar2 != 0x3f) {
      if (bVar2 != 0x7b) {
        return param_2;
      }
      if ((param_2 + 1 != param_3) &&
         ((bVar2 = param_2[1], (bVar2 & 0xf8) == 0x30 || ((bVar2 & 0xfe) == 0x38)))) {
        param_2 = param_2 + 2;
        iVar6 = bVar2 - 0x30;
        if (param_2 != param_3) {
          do {
            bVar2 = *param_2;
            if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_0084342c;
            if (0xccccccb < iVar6) goto LAB_0084367c;
            param_2 = param_2 + 1;
            iVar6 = (uint)bVar2 + iVar6 * 10 + -0x30;
          } while (param_2 != param_3);
          param_2 = param_3;
        }
LAB_0084342c:
        if (param_2 == param_3) goto LAB_00843680;
        if (*param_2 == 0x2c) {
          if (param_2 + 1 != param_3) {
            bVar2 = param_2[1];
            if (bVar2 == 0x7d) {
              pbVar8 = param_2 + 2;
              if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
                lVar3 = (long)iVar6;
                pbVar8 = param_2 + 3;
                goto LAB_008434b0;
              }
              lVar3 = (long)iVar6;
              goto LAB_0084350c;
            }
            if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_00843680;
            param_2 = param_2 + 2;
            iVar7 = bVar2 - 0x30;
            if (param_2 != param_3) {
              do {
                bVar2 = *param_2;
                if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_008435f4;
                if (0xccccccb < iVar7) goto LAB_0084367c;
                param_2 = param_2 + 1;
                iVar7 = (uint)bVar2 + iVar7 * 10 + -0x30;
              } while (param_2 != param_3);
              param_2 = param_3;
            }
LAB_008435f4:
            if ((param_2 == param_3) || (*param_2 != 0x7d)) goto LAB_00843680;
            if (iVar6 <= iVar7) {
              pbVar8 = param_2 + 1;
              if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
                lVar3 = (long)iVar6;
                lVar4 = (long)iVar7;
                pbVar8 = param_2 + 2;
                goto LAB_008434e8;
              }
              lVar3 = (long)iVar6;
              lVar4 = (long)iVar7;
              goto LAB_00843664;
            }
          }
        }
        else if (*param_2 == 0x7d) {
          pbVar8 = param_2 + 1;
          if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
            lVar3 = (long)iVar6;
            pbVar8 = param_2 + 2;
            lVar4 = lVar3;
            goto LAB_008434e8;
          }
          lVar3 = (long)iVar6;
          lVar4 = lVar3;
          goto LAB_00843664;
        }
      }
LAB_0084367c:
      FUN_00849af4();
LAB_00843680:
                    /* WARNING: Subroutine does not return */
      FUN_00849b40();
    }
    pbVar8 = param_2 + 1;
    if (((uVar1 == 0) && (pbVar8 != param_3)) && (*pbVar8 == 0x3f)) {
      pbVar8 = param_2 + 2;
      lVar3 = 0;
      lVar4 = 1;
      goto LAB_008434e8;
    }
    lVar3 = 0;
    lVar4 = 1;
  }
LAB_00843664:
  uVar5 = 1;
LAB_00843668:
  FUN_008499e0(param_1,lVar3,lVar4,param_4,param_5,param_6,uVar5);
  return pbVar8;
}

