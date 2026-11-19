/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008481f4
 */

byte * FUN_008481f4(undefined8 param_1,byte *param_2,byte *param_3,byte *param_4)

{
  byte bVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  int iVar5;
  undefined2 uVar6;
  
  if (param_2 == param_3) goto LAB_0084851c;
  bVar1 = *param_2;
  uVar4 = (uint)bVar1;
  if (bVar1 < 0x66) {
    if (bVar1 < 0x5c) {
      if ((uVar4 != 0x22) && (bVar1 != 0x2f)) goto LAB_00848360;
    }
    else if (bVar1 != 0x5c) {
      if (uVar4 == 0x61) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 7;
          goto LAB_008484ec;
        }
        bVar1 = 7;
        goto LAB_00848448;
      }
      if (uVar4 == 0x62) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 8;
          goto LAB_008484ec;
        }
        bVar1 = 8;
        goto LAB_00848448;
      }
      goto LAB_00848360;
    }
    if (param_4 == (byte *)0x0) {
LAB_00848448:
      FUN_00845824(param_1,bVar1);
      return param_2 + 1;
    }
    if ((*param_4 & 1) == 0) {
      pbVar3 = param_4 + 1;
      *param_4 = 2;
    }
    else {
      pbVar3 = *(byte **)(param_4 + 0x10);
      param_4[8] = 1;
      param_4[9] = 0;
      param_4[10] = 0;
      param_4[0xb] = 0;
      param_4[0xc] = 0;
      param_4[0xd] = 0;
      param_4[0xe] = 0;
      param_4[0xf] = 0;
    }
    *pbVar3 = bVar1;
    pbVar2 = param_2 + 1;
  }
  else {
    if (bVar1 < 0x72) {
      if (bVar1 == 0x66) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 0xc;
          goto LAB_008484ec;
        }
        bVar1 = 0xc;
        goto LAB_00848448;
      }
      if (bVar1 == 0x6e) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 10;
          goto LAB_008484ec;
        }
        bVar1 = 10;
        goto LAB_00848448;
      }
    }
    else {
      if (uVar4 == 0x72) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 0xd;
LAB_008484ec:
          *(undefined2 *)pbVar2 = uVar6;
          return param_2 + 1;
        }
        bVar1 = 0xd;
        goto LAB_00848448;
      }
      if (uVar4 == 0x74) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 9;
          goto LAB_008484ec;
        }
        bVar1 = 9;
        goto LAB_00848448;
      }
      if (bVar1 == 0x76) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            pbVar2 = param_4 + 1;
            *param_4 = 2;
          }
          else {
            pbVar2 = *(byte **)(param_4 + 0x10);
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
          }
          uVar6 = 0xb;
          goto LAB_008484ec;
        }
        bVar1 = 0xb;
        goto LAB_00848448;
      }
    }
LAB_00848360:
    if ((uVar4 & 0xf8) != 0x30) {
LAB_0084851c:
                    /* WARNING: Subroutine does not return */
      FUN_008450a0();
    }
    pbVar2 = param_2 + 1;
    iVar5 = uVar4 - 0x30;
    if ((pbVar2 != param_3) && (bVar1 = *pbVar2, (bVar1 & 0xf8) == 0x30)) {
      pbVar2 = param_2 + 2;
      iVar5 = (uint)bVar1 + iVar5 * 8 + -0x30;
      if ((pbVar2 != param_3) && (bVar1 = *pbVar2, (bVar1 & 0xf8) == 0x30)) {
        pbVar2 = param_2 + 3;
        iVar5 = (uint)bVar1 + iVar5 * 8 + -0x30;
      }
    }
    if (param_4 == (byte *)0x0) {
      FUN_00845824(param_1,iVar5);
      return pbVar2;
    }
    if ((*param_4 & 1) == 0) {
      pbVar3 = param_4 + 1;
      *param_4 = 2;
    }
    else {
      pbVar3 = *(byte **)(param_4 + 0x10);
      param_4[8] = 1;
      param_4[9] = 0;
      param_4[10] = 0;
      param_4[0xb] = 0;
      param_4[0xc] = 0;
      param_4[0xd] = 0;
      param_4[0xe] = 0;
      param_4[0xf] = 0;
    }
    *pbVar3 = (byte)iVar5;
  }
  pbVar3[1] = 0;
  return pbVar2;
}

