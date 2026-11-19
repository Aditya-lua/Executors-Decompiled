/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008453c8
 */

byte * FUN_008453c8(long param_1,byte *param_2,byte *param_3,byte *param_4)

{
  byte bVar1;
  byte *pbVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  
  if (param_2 == param_3) {
    return param_2;
  }
  bVar1 = *param_2;
  uVar4 = (uint)bVar1;
  if (bVar1 < 0x72) {
    if (uVar4 == 0x65 || bVar1 < 0x65) {
      if (uVar4 == 0x30) {
        if (param_4 != (byte *)0x0) {
          if ((*param_4 & 1) == 0) {
            *param_4 = 2;
            param_4[1] = 0;
            param_4[2] = 0;
          }
          else {
            param_4[8] = 1;
            param_4[9] = 0;
            param_4[10] = 0;
            param_4[0xb] = 0;
            param_4[0xc] = 0;
            param_4[0xd] = 0;
            param_4[0xe] = 0;
            param_4[0xf] = 0;
            **(undefined2 **)(param_4 + 0x10) = 0;
          }
          goto LAB_008457f4;
        }
        iVar3 = 0;
      }
      else {
        if (uVar4 == 99) {
          if ((param_2 + 1 != param_3) && (bVar1 = param_2[1], (byte)((bVar1 & 0xdf) + 0xbf) < 0x1a)
             ) {
            bVar1 = bVar1 & 0x1f;
            if (param_4 == (byte *)0x0) {
              FUN_00845824(param_1,bVar1);
              return param_2 + 2;
            }
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
            *pbVar2 = bVar1;
            pbVar2[1] = 0;
            return param_2 + 2;
          }
          goto LAB_00845820;
        }
        if (bVar1 == 0x5f) goto LAB_00845820;
LAB_008457ac:
        iVar3 = (int)(char)bVar1;
        if ((-1 < iVar3) &&
           ((*(ulong *)(*(long *)(*(long *)(param_1 + 8) + 0x10) + (ulong)uVar4 * 8) & 0x60) != 0))
        goto LAB_00845820;
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
          *pbVar2 = bVar1;
          pbVar2[1] = 0;
          goto LAB_008457f4;
        }
      }
    }
    else if (uVar4 == 0x66) {
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
        pbVar2[0] = 0xc;
        pbVar2[1] = 0;
        goto LAB_008457f4;
      }
      iVar3 = 0xc;
    }
    else {
      if (uVar4 != 0x6e) goto LAB_008457ac;
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
        pbVar2[0] = 10;
        pbVar2[1] = 0;
        goto LAB_008457f4;
      }
      iVar3 = 10;
    }
  }
  else {
    if (0x74 < bVar1) {
      if (bVar1 == 0x75) {
        if (param_2 + 1 == param_3) goto LAB_00845820;
        bVar1 = param_2[1];
        uVar4 = (uint)bVar1;
        iVar3 = 0xffd0;
        if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) {
          uVar4 = bVar1 | 0x20;
          if (5 < uVar4 - 0x61) goto LAB_00845820;
          iVar3 = 0xffa9;
        }
        param_2 = param_2 + 2;
        if (param_2 == param_3) goto LAB_00845820;
        bVar1 = *param_2;
        uVar6 = (uint)bVar1;
        iVar5 = 0xffd0;
        if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) {
          uVar6 = uVar6 | 0x20;
          if (5 < uVar6 - 0x61) goto LAB_00845820;
          iVar5 = 0xffa9;
        }
        iVar3 = (iVar3 + uVar4) * 0x100 + (iVar5 + uVar6) * 0x10;
      }
      else {
        if (uVar4 == 0x76) {
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
            pbVar2[0] = 0xb;
            pbVar2[1] = 0;
            goto LAB_008457f4;
          }
          iVar3 = 0xb;
          goto LAB_008457ec;
        }
        if (uVar4 != 0x78) goto LAB_008457ac;
        iVar3 = 0;
      }
      if (param_2 + 1 != param_3) {
        bVar1 = param_2[1];
        uVar4 = (uint)bVar1;
        iVar5 = 0xffd0;
        if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) {
          uVar4 = uVar4 | 0x20;
          if (5 < uVar4 - 0x61) goto LAB_00845820;
          iVar5 = 0xffa9;
        }
        if (param_2 + 2 != param_3) {
          bVar1 = param_2[2];
          uVar6 = (uint)bVar1;
          iVar7 = 0xffd0;
          if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) {
            uVar6 = uVar6 | 0x20;
            if (5 < uVar6 - 0x61) goto LAB_00845820;
            iVar7 = 0xffa9;
          }
          iVar3 = iVar7 + uVar6 + (iVar5 + iVar3 + uVar4) * 0x10;
          if (param_4 == (byte *)0x0) {
            FUN_00845824(param_1,iVar3);
            return param_2 + 3;
          }
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
          *pbVar2 = (byte)iVar3;
          pbVar2[1] = 0;
          return param_2 + 3;
        }
      }
LAB_00845820:
                    /* WARNING: Subroutine does not return */
      FUN_008450a0();
    }
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
        pbVar2[0] = 0xd;
        pbVar2[1] = 0;
        goto LAB_008457f4;
      }
      iVar3 = 0xd;
    }
    else {
      if (bVar1 != 0x74) goto LAB_008457ac;
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
        pbVar2[0] = 9;
        pbVar2[1] = 0;
        goto LAB_008457f4;
      }
      iVar3 = 9;
    }
  }
LAB_008457ec:
  FUN_00845824(param_1,iVar3);
LAB_008457f4:
  return param_2 + 1;
}

