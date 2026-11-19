/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00933fc0
 */

undefined8 FUN_00933fc0(long param_1,byte *param_2,ulong param_3,long *param_4)

{
  bool bVar1;
  long lVar2;
  byte *__s1;
  ulong __n;
  byte bVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  char *pcVar9;
  undefined8 *puVar10;
  long lVar11;
  code *pcVar12;
  long lVar13;
  ulong uVar14;
  undefined8 uVar15;
  
  lVar13 = *(long *)(param_1 + 0x20);
  *param_4 = 0;
  if (param_3 != 0) {
    lVar11 = 0;
    lVar2 = lVar13 + 0x428;
    do {
      iVar5 = *(int *)(param_1 + 0x114);
      if (iVar5 == 0) {
LAB_00934048:
        bVar1 = false;
      }
      else {
        bVar1 = false;
        if ((*(byte *)(lVar13 + 0x45c) & 1) == 0) {
          if (*(long *)(param_1 + 0xd8) < 0) goto LAB_00934048;
          bVar1 = *(long *)(param_1 + 0xe8) < *(long *)(param_1 + 0xd8);
        }
      }
      switch(*(undefined4 *)(lVar13 + 0x458)) {
      case 0:
        lVar6 = 0;
        uVar14 = 0;
LAB_00934074:
        __s1 = param_2 + uVar14;
        if (*__s1 != 0x24) {
          if ((*__s1 != 0x52 || bVar1) || (*(int *)(param_1 + 0x9e0) == 0xb)) goto LAB_009340c8;
          __n = param_3 + lVar6;
          if (4 < __n) {
            __n = 5;
          }
          iVar4 = strncmp((char *)__s1,"RTSP/",__n);
          if (iVar4 != 0) goto LAB_009340c8;
          *(undefined4 *)(lVar13 + 0x458) = 0;
          *(byte *)(lVar13 + 0x45c) = *(byte *)(lVar13 + 0x45c) | 1;
          goto LAB_009343c8;
        }
        if ((((-uVar14 != lVar11) && (iVar5 != 0)) &&
            ((*(byte *)(*(long *)(param_1 + 0x20) + 0x45c) & 1) == 0)) &&
           (lVar6 = *(long *)(param_1 + 0xd8), -1 < lVar6)) {
          lVar8 = lVar6 - *(long *)(param_1 + 0xe8);
          if ((lVar8 != 0 && *(long *)(param_1 + 0xe8) <= lVar6) && (lVar8 != 0)) {
            if ((long)(lVar11 + uVar14) <= lVar8) {
              lVar8 = lVar11 + uVar14;
            }
            uVar7 = FUN_00934dd0(param_1,1,__s1 + (-uVar14 - lVar11),lVar8);
            if ((int)uVar7 != 0) {
              return uVar7;
            }
          }
        }
        iVar5 = FUN_009045fc(lVar2,__s1,1);
        if (iVar5 != 0) {
          return 0x1b;
        }
        lVar11 = 0;
        param_2 = param_2 + uVar14 + 1;
        param_3 = (param_3 - uVar14) - 1;
        *param_4 = *param_4 + 1;
        *(undefined4 *)(lVar13 + 0x458) = 1;
        break;
      case 1:
        bVar3 = *param_2;
        if ((1 << (ulong)(bVar3 & 7) & (uint)*(byte *)(param_1 + (ulong)(bVar3 >> 3) + 0x1138)) == 0
           ) {
          *(undefined4 *)(lVar13 + 0x458) = 0;
          if (*param_4 == 0) {
            uVar7 = FUN_00904974(lVar2);
            if (((*(int *)(param_1 + 0x114) != 0) &&
                ((*(byte *)(*(long *)(param_1 + 0x20) + 0x45c) & 1) == 0)) &&
               (lVar6 = *(long *)(param_1 + 0xd8), -1 < lVar6)) {
              lVar8 = lVar6 - *(long *)(param_1 + 0xe8);
              if ((lVar8 != 0 && *(long *)(param_1 + 0xe8) <= lVar6) && (lVar8 != 0)) {
                if (0 < lVar8) {
                  lVar8 = 1;
                }
                uVar7 = FUN_00934dd0(param_1,1,uVar7,lVar8);
                if ((int)uVar7 != 0) {
                  return uVar7;
                }
              }
            }
          }
          else {
            lVar11 = 1;
          }
          FUN_00904534(lVar2);
        }
        else {
          *(uint *)(lVar13 + 0x448) = (uint)bVar3;
          iVar5 = FUN_009045fc(lVar2,param_2,1);
          if (iVar5 != 0) {
            return 0x1b;
          }
          param_2 = param_2 + 1;
          *param_4 = *param_4 + 1;
          *(undefined4 *)(lVar13 + 0x458) = 2;
          param_3 = param_3 - 1;
        }
        break;
      case 2:
        lVar6 = FUN_00904984(lVar2);
        iVar5 = FUN_009045fc(lVar2,param_2,1);
        if (iVar5 != 0) {
          return 0x1b;
        }
        param_2 = param_2 + 1;
        param_3 = param_3 - 1;
        *param_4 = *param_4 + 1;
        if (lVar6 != 2) {
          lVar6 = FUN_00904974(lVar2);
          *(ulong *)(lVar13 + 0x450) =
               (ulong)CONCAT11(*(undefined1 *)(lVar6 + 2),*(undefined1 *)(lVar6 + 3)) + 4;
          *(undefined4 *)(lVar13 + 0x458) = 3;
        }
        break;
      case 3:
        lVar6 = FUN_00904984(lVar2);
        uVar14 = *(long *)(lVar13 + 0x450) - lVar6;
        if (param_3 < uVar14) {
          iVar5 = FUN_009045fc(lVar2,param_2,param_3);
          if (iVar5 != 0) {
            return 0x1b;
          }
          param_2 = param_2 + param_3;
          *param_4 = *param_4 + param_3;
          goto joined_r0x009344a4;
        }
        iVar5 = FUN_009045fc(lVar2,param_2,uVar14);
        if (iVar5 != 0) {
          return 0x1b;
        }
        *param_4 = *param_4 + uVar14;
        uVar7 = FUN_00904974(lVar2);
        lVar6 = *(long *)(lVar13 + 0x450);
        if (lVar6 == 0) {
          pcVar9 = "Cannot write a 0 size RTP packet.";
LAB_00934478:
          FUN_00904b80(param_1,pcVar9);
          FUN_00904534(lVar2);
          *(undefined4 *)(lVar13 + 0x458) = 0;
          return 0x17;
        }
        pcVar12 = *(code **)(param_1 + 0x238);
        puVar10 = (undefined8 *)(param_1 + 0x9d8);
        if (pcVar12 == (code *)0x0) {
          pcVar12 = *(code **)(param_1 + 0x228);
          puVar10 = (undefined8 *)(param_1 + 0x1d0);
        }
        uVar15 = *puVar10;
        FUN_0092f198(param_1,1);
        lVar8 = (*pcVar12)(uVar7,1,lVar6,uVar15);
        FUN_0092f198(param_1,0);
        if (lVar8 == 0x10000001) {
          pcVar9 = "Cannot pause RTP";
          goto LAB_00934478;
        }
        if (lVar8 != lVar6) {
          pcVar9 = "Failed writing RTP data";
          goto LAB_00934478;
        }
        param_2 = param_2 + uVar14;
        FUN_00904534(lVar2);
        *(undefined4 *)(lVar13 + 0x458) = 0;
        param_3 = param_3 - uVar14;
        break;
      default:
        return 0x38;
      }
    } while (param_3 != 0);
joined_r0x009344a4:
    if ((lVar11 != 0) && (*(int *)(param_1 + 0x114) != 0)) {
      if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x45c) & 1) != 0) {
        return 0;
      }
      lVar13 = *(long *)(param_1 + 0xd8);
      if (-1 < lVar13) {
        lVar2 = lVar13 - *(long *)(param_1 + 0xe8);
        if (lVar2 == 0 || lVar13 < *(long *)(param_1 + 0xe8)) {
          return 0;
        }
        if (lVar2 != 0) {
          if (lVar11 <= lVar2) {
            lVar2 = lVar11;
          }
          uVar7 = FUN_00934dd0(param_1,1,(long)param_2 - lVar11,lVar2);
          return uVar7;
        }
      }
    }
  }
  return 0;
LAB_009340c8:
  uVar14 = uVar14 + 1;
  lVar6 = lVar6 + -1;
  *param_4 = *param_4 + 1;
  if (param_3 == uVar14) {
LAB_009343c8:
    param_2 = param_2 + uVar14;
    lVar11 = lVar11 + uVar14;
    goto joined_r0x009344a4;
  }
  goto LAB_00934074;
}

