/* 7ff70c95c440 FUN_7ff70c95c440 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c95c440(byte *param_1,longlong param_2,undefined8 *param_3,ulonglong *param_4)

{
  byte *pbVar1;
  uint uVar2;
  code *pcVar3;
  uint uVar4;
  byte *pbVar5;
  longlong lVar6;
  byte bVar7;
  ulonglong uVar8;
  uint uVar9;
  int iVar10;
  uint uVar11;
  ulonglong *puVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  byte *pbStack_80;
  longlong lStack_78;
  ulonglong *puStack_70;
  undefined8 *puStack_68;
  ulonglong uStack_60;
  
  pcVar3 = _DAT_7ff70cb966e8;
  uVar2 = _DAT_7ff70cb50f40;
  bVar7 = *param_1;
  if (bVar7 == 0) {
    return 0;
  }
  uVar15 = 0;
  uVar14 = 0;
  puStack_70 = param_4;
  puStack_68 = param_3;
  lStack_78 = param_2;
LAB_7ff70c95c4a0:
  do {
    pbVar5 = param_1 + 2;
    if (bVar7 == 0x25) {
      bVar7 = param_1[1];
      if (bVar7 != 0x25) {
        pbStack_80 = param_1 + 1;
        uVar15 = uVar15 + 1;
        if ((byte)(bVar7 - 0x30) < 10) {
          uVar13 = 0;
          do {
            uVar9 = (uint)(byte)(bVar7 - 0x30) + uVar13 * 10;
            if (0x7f < (int)uVar13) {
              uVar9 = uVar13;
            }
            uVar13 = uVar9;
            bVar7 = *pbVar5;
            pbVar5 = pbVar5 + 1;
          } while ((byte)(bVar7 - 0x30) < 10);
          uStack_60 = (ulonglong)uVar15;
          if (((int)uVar13 < 0x81) && (bVar7 == 0x24)) {
            if (uVar13 == 0) {
              uVar13 = uVar15;
            }
            uStack_60 = (ulonglong)uVar13;
            pbStack_80 = pbVar5;
          }
        }
        else {
          uStack_60 = (ulonglong)uVar15;
          if (bVar7 == 0x24) {
            uStack_60 = (ulonglong)uVar15;
            pbStack_80 = pbVar5;
          }
        }
        if ((int)uVar14 < (int)(uint)uStack_60) {
          uVar14 = (uint)uStack_60;
        }
        uVar4 = 0;
        uVar9 = 0;
        uVar13 = 0;
LAB_7ff70c95c5d7:
        do {
          pbVar5 = pbStack_80;
          iVar10 = *pbStack_80 - 0x20;
          switch(iVar10) {
          case 0:
          case 3:
          case 10:
          case 0xb:
          case 0xd:
          case 0xe:
          case 0x10:
          case 0x11:
          case 0x12:
          case 0x13:
          case 0x14:
          case 0x15:
          case 0x16:
          case 0x17:
          case 0x18:
          case 0x19:
          case 0x2c:
          case 0x2f:
          case 0x48:
          case 0x4c:
          case 0x51:
          case 0x5a:
            pbVar1 = pbStack_80 + 1;
            switch(iVar10) {
            case 0:
              uVar13 = uVar13 | 1;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 3:
              uVar13 = uVar13 | 8;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 10:
              uVar15 = uVar15 + 1;
              bVar7 = *pbVar1;
              if ((byte)(bVar7 - 0x30) < 10) {
                pbStack_80 = pbStack_80 + 2;
                uVar11 = 0;
                do {
                  uVar4 = (uint)(byte)(bVar7 - 0x30) + uVar11 * 10;
                  if (0x7f < (int)uVar11) {
                    uVar4 = uVar11;
                  }
                  bVar7 = *pbStack_80;
                  pbStack_80 = pbStack_80 + 1;
                  uVar11 = uVar4;
                } while ((byte)(bVar7 - 0x30) < 10);
                if (((0x80 < (int)uVar4) || (bVar7 != 0x24)) || (pbVar1 = pbStack_80, uVar4 == 0))
                goto code_r0x7ff70c95c802;
              }
              else {
                if (bVar7 == 0x24) {
                  pbVar1 = pbStack_80 + 2;
                }
code_r0x7ff70c95c802:
                pbStack_80 = pbVar1;
                uVar4 = uVar15;
              }
              uVar13 = uVar13 | 0x4000;
              pbVar1 = pbStack_80;
              if ((int)uVar14 < (int)uVar4) {
                uVar14 = uVar4;
              }
              break;
            case 0xb:
              uVar13 = uVar13 | 2;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 0xd:
              uVar13 = uVar13 & 0xfffffefb | 4;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 0xe:
              if (*pbVar1 == 0x2a) {
                pbVar5 = pbStack_80 + 2;
                uVar15 = uVar15 + 1;
                bVar7 = pbStack_80[2];
                if ((byte)(bVar7 - 0x30) < 10) {
                  pbStack_80 = pbStack_80 + 3;
                  uVar9 = 0;
                  do {
                    uVar11 = (uint)(byte)(bVar7 - 0x30) + uVar9 * 10;
                    if (0x7f < (int)uVar9) {
                      uVar11 = uVar9;
                    }
                    uVar9 = uVar11;
                    bVar7 = *pbStack_80;
                    pbStack_80 = pbStack_80 + 1;
                  } while ((byte)(bVar7 - 0x30) < 10);
                  if (((0x80 < (int)uVar9) || (bVar7 != 0x24)) || (pbVar5 = pbStack_80, uVar9 == 0))
                  goto code_r0x7ff70c95c863;
                }
                else {
                  if (bVar7 == 0x24) {
                    pbVar5 = pbStack_80 + 3;
                  }
code_r0x7ff70c95c863:
                  pbStack_80 = pbVar5;
                  uVar9 = uVar15;
                }
                uVar13 = uVar13 | 0x10000;
                if ((int)uVar14 < (int)uVar9) {
                  uVar14 = uVar9;
                }
              }
              else {
                uVar13 = uVar13 | 0x8000;
                pbStack_80 = pbVar1;
                uVar9 = (*pcVar3)(pbVar1,&pbStack_80,10);
              }
              pbVar1 = pbStack_80;
              if ((~uVar13 & 0x18000) == 0) {
                return 1;
              }
              break;
            case 0x10:
              uVar13 = uVar13 | (~uVar13 & 4) << 6;
            case 0x11:
            case 0x12:
            case 0x13:
            case 0x14:
            case 0x15:
            case 0x16:
            case 0x17:
            case 0x18:
            case 0x19:
              uVar13 = uVar13 | 0x2000;
              pbStack_80 = pbVar1;
              uVar4 = (*pcVar3)(pbVar5,&pbStack_80,10);
              goto LAB_7ff70c95c5d7;
            case 0x29:
code_r0x7ff70c95c7d8:
              pbStack_80 = pbStack_80 + 1;
              uVar13 = uVar13 | 0x40;
              goto LAB_7ff70c95c5d7;
            case 0x2c:
              uVar13 = uVar13 | 0x80;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 0x2f:
            case 0x51:
            case 0x5a:
              uVar13 = uVar13 | 0x40;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 0x48:
              uVar13 = uVar13 | 0x10;
              pbStack_80 = pbVar1;
              goto LAB_7ff70c95c5d7;
            case 0x4c:
              if ((uVar13 & 0x20) == 0) {
                uVar13 = uVar13 | 0x20;
                pbStack_80 = pbVar1;
              }
              else {
                uVar13 = uVar13 | 0x40;
                pbStack_80 = pbVar1;
              }
              goto LAB_7ff70c95c5d7;
            }
            pbStack_80 = pbVar1;
            break;
          default:
            goto LAB_7ff70c95c88f;
          case 0x29:
            if ((pbStack_80[1] == 0x33) && (pbStack_80[2] == 0x32)) {
              uVar13 = uVar13 | 0x20;
            }
            else {
              if ((pbStack_80[1] != 0x36) || (pbStack_80[2] != 0x34)) goto code_r0x7ff70c95c7d8;
              uVar13 = uVar13 | 0x40;
            }
            pbStack_80 = pbStack_80 + 3;
          }
        } while( true );
      }
      bVar7 = *pbVar5;
      param_1 = pbVar5;
      goto joined_r0x7ff70c95c4b9;
    }
    param_1 = param_1 + 1;
    bVar7 = *param_1;
  } while (bVar7 != 0);
  goto LAB_7ff70c95cafe;
LAB_7ff70c95c88f:
  if ((int)uStack_60 - 0x81U < 0xffffff80) {
    return 1;
  }
  uVar11 = (int)uStack_60 - 1;
  switch(*pbStack_80) {
  case 0x45:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 7;
    uVar13 = uVar13 | 0x41000;
    break;
  default:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 0;
    break;
  case 0x47:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 7;
    uVar13 = uVar13 | 0x81000;
    break;
  case 0x53:
    uVar13 = uVar13 | 8;
  case 0x73:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 1;
    break;
  case 0x58:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    uVar13 = uVar13 | 0x1a00;
    break;
  case 99:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    uVar13 = uVar13 | 0x20000;
    break;
  case 100:
  case 0x69:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    break;
  case 0x65:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 7;
    uVar13 = uVar13 | 0x40000;
    break;
  case 0x66:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 7;
    break;
  case 0x67:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 7;
    uVar13 = uVar13 | 0x80000;
    break;
  case 0x6e:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 4;
    break;
  case 0x6f:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    uVar13 = uVar13 | 0x400;
    break;
  case 0x70:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 2;
    break;
  case 0x75:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    uVar13 = uVar13 | 0x200;
    break;
  case 0x78:
    *(undefined4 *)(lStack_78 + (ulonglong)uVar11 * 0x18) = 3;
    uVar13 = uVar13 | 0xa00;
  }
  uVar8 = (ulonglong)uVar11;
  lVar6 = lStack_78 + uVar8 * 0x18;
  *(uint *)(lStack_78 + 4 + uVar8 * 0x18) = uVar13;
  *(uint *)(lStack_78 + 8 + uVar8 * 0x18) = uVar4;
  *(uint *)(lStack_78 + 0xc + uVar8 * 0x18) = uVar9;
  if ((uVar13 & 0x4000) != 0) {
    uVar4 = uVar4 - 1;
    if (0x7f < uVar4) {
      return 1;
    }
    *(uint *)(lVar6 + 8) = uVar4;
    *(undefined1 (*) [16])(lStack_78 + (ulonglong)uVar4 * 0x18) = ZEXT416(uVar2);
  }
  if ((uVar13 & 0x10000) != 0) {
    uVar9 = uVar9 - 1;
    if (0x7f < uVar9) {
      return 1;
    }
    *(uint *)(lVar6 + 0xc) = uVar9;
    *(undefined1 (*) [16])(lStack_78 + (ulonglong)uVar9 * 0x18) = ZEXT416(uVar2);
  }
  *puStack_68 = pbStack_80 + (*pbStack_80 != 0);
  puStack_68 = puStack_68 + 1;
  bVar7 = *pbStack_80;
  param_1 = pbStack_80;
joined_r0x7ff70c95c4b9:
  if (bVar7 == 0) goto LAB_7ff70c95cafe;
  goto LAB_7ff70c95c4a0;
LAB_7ff70c95cafe:
  if (0 < (int)uVar14) {
    lVar6 = 0;
    do {
      uVar2 = *(uint *)(lStack_78 + 4 + lVar6);
      if ((uVar2 & 0x4000) == 0) {
        if ((uVar2 & 0x10000) == 0) goto LAB_7ff70c95cb37;
LAB_7ff70c95cb6e:
        puVar12 = puStack_70 + 1;
        *(longlong *)(lStack_78 + 0x10 + (longlong)*(int *)(lStack_78 + 0xc + lVar6) * 0x18) =
             (longlong)(int)(uint)*puStack_70;
        uVar8 = (ulonglong)*(uint *)(lStack_78 + lVar6);
        puStack_70 = puVar12;
        if (uVar8 < 10) goto LAB_7ff70c95cb8d;
        goto LAB_7ff70c95cba3;
      }
      uVar8 = *puStack_70;
      puStack_70 = puStack_70 + 1;
      *(longlong *)(lStack_78 + 0x10 + (longlong)*(int *)(lStack_78 + 8 + lVar6) * 0x18) =
           (longlong)(int)(uint)uVar8;
      if ((uVar2 & 0x10000) != 0) goto LAB_7ff70c95cb6e;
LAB_7ff70c95cb37:
      uVar8 = (ulonglong)*(uint *)(lStack_78 + lVar6);
      puVar12 = puStack_70;
      if (9 < uVar8) goto LAB_7ff70c95cba3;
LAB_7ff70c95cb8d:
      puStack_70 = puVar12;
      switch(&UNK_7ff70cb50e14 + *(int *)(&UNK_7ff70cb50e14 + uVar8 * 4)) {
      case (undefined *)0x7ff70c95cb97:
code_r0x7ff70c95cb97:
        uVar8 = *puVar12;
code_r0x7ff70c95cb9a:
        puStack_70 = puVar12 + 1;
        *(ulonglong *)(lStack_78 + 0x10 + lVar6) = uVar8;
        break;
      case (undefined *)0x7ff70c95cbb8:
        puStack_70 = puVar12 + 1;
        *(ulonglong *)(lStack_78 + 0x10 + lVar6) = *puVar12;
        break;
      case (undefined *)0x7ff70c95cbc9:
        *(undefined4 *)(lStack_78 + lVar6) = 3;
        break;
      case (undefined *)0x7ff70c95cbd2:
        if (((~uVar2 & 0x240) == 0) || ((uVar2 & 0x40) != 0)) goto code_r0x7ff70c95cb97;
        if ((~uVar2 & 0x220) == 0) {
          uVar8 = (ulonglong)(uint)*puVar12;
          goto code_r0x7ff70c95cb9a;
        }
        puStack_70 = puVar12 + 1;
        if (((uVar2 & 0x20) == 0) && ((uVar2 & 0x200) != 0)) {
          *(ulonglong *)(lStack_78 + 0x10 + lVar6) = (ulonglong)(uint)*puVar12;
        }
        else {
          *(longlong *)(lStack_78 + 0x10 + lVar6) = (longlong)(int)(uint)*puVar12;
        }
        goto code_r0x7ff70c95cba6;
      }
LAB_7ff70c95cba3:
code_r0x7ff70c95cba6:
      lVar6 = lVar6 + 0x18;
    } while ((ulonglong)uVar14 * 0x18 != lVar6);
  }
  return 0;
}


