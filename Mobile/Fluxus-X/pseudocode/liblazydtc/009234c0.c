/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009234c0
 */

undefined8
FUN_009234c0(long param_1,long *param_2,long param_3,byte *param_4,long param_5,long *param_6)

{
  long *plVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  
  *param_6 = 0;
  plVar9 = param_2 + 1;
  if ((int)*plVar9 != 8) {
    if ((int)*plVar9 == 9) {
switchD_009235b0_caseD_9:
      return 0x38;
    }
    if (((*(byte *)(param_1 + 0xa86) >> 2 & 1) != 0) && ((*(byte *)((long)param_2 + 0x42) & 1) == 0)
       ) {
      if (param_3 == 0) {
        uVar6 = FUN_00934dd0(param_1,1,param_4,param_5);
        iVar5 = (int)uVar6;
      }
      else {
        uVar6 = FUN_009350cc(param_1,param_3,1,param_4,param_5);
        iVar5 = (int)uVar6;
      }
      if (iVar5 != 0) {
LAB_00923568:
        *plVar9 = 0x600000009;
        return uVar6;
      }
    }
    if (param_5 != 0) {
      plVar1 = param_2 + 2;
      do {
        switch((int)*plVar9) {
        case 0:
          bVar3 = *param_4;
          if ((9 < bVar3 - 0x30) &&
             ((uVar4 = bVar3 - 0x41, 0x25 < uVar4 ||
              ((1L << ((ulong)uVar4 & 0x3f) & 0x3f0000003fU) == 0)))) {
            if ((ulong)*(byte *)(param_2 + 6) == 0) {
              FUN_00904b80(param_1,"chunk hex-length char not a hex digit: 0x%x");
            }
            else {
              *(undefined1 *)((long)param_2 + (ulong)*(byte *)(param_2 + 6) + 0x31) = 0;
              iVar5 = FUN_00941b6c((long)param_2 + 0x31,0,0x10,param_2);
              if (iVar5 == 0) {
                *(int *)plVar9 = 1;
                goto joined_r0x009237d8;
              }
              FUN_00904b80(param_1,"chunk hex-length not valid: \'%s\'",(long)param_2 + 0x31);
            }
            lVar10 = 0x200000009;
            goto LAB_00923a28;
          }
          bVar2 = *(byte *)(param_2 + 6);
          if (0xf < (ulong)bVar2) {
            FUN_00904b80(param_1,"chunk hex-length longer than %d",0x10);
            lVar10 = 0x100000009;
            goto LAB_00923a28;
          }
          *(byte *)(param_2 + 6) = bVar2 + 1;
          *(byte *)((long)param_2 + (ulong)bVar2 + 0x31) = bVar3;
          break;
        case 1:
          if (*param_4 == 10) {
            if (*param_2 == 0) {
              *(int *)plVar9 = 5;
            }
            else {
              *(int *)plVar9 = 2;
              if ((((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                  ((*(long *)(param_1 + 0x12a0) == 0 ||
                   (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46b0)) {
                FUN_009050ec(param_1,"http_chunked, chunk start of %ld bytes");
              }
            }
          }
          break;
        case 2:
          lVar10 = param_5;
          if (*param_2 < param_5) {
            lVar10 = FUN_00963a7c();
          }
          if (((*(byte *)(param_1 + 0xa86) >> 2 & 1) == 0) &&
             ((*(byte *)((long)param_2 + 0x42) & 1) == 0)) {
            if (param_3 == 0) {
              uVar6 = FUN_00934dd0(param_1,1,param_4,lVar10);
              iVar5 = (int)uVar6;
            }
            else {
              uVar6 = FUN_009350cc(param_1,param_3,1,param_4,lVar10);
              iVar5 = (int)uVar6;
            }
            if (iVar5 != 0) goto LAB_00923568;
          }
          param_4 = param_4 + lVar10;
          param_5 = param_5 - lVar10;
          *param_6 = *param_6 + lVar10;
          lVar8 = *param_2 - lVar10;
          *param_2 = lVar8;
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
              && (0 < DAT_00cc46b0)))) {
            FUN_009050ec(param_1,"http_chunked, write %zu body bytes, %ld bytes in chunk remain",
                         lVar10);
            lVar8 = *param_2;
          }
          if (lVar8 != 0) goto switchD_009235b0_default;
          *(int *)plVar9 = 3;
          goto joined_r0x009237d8;
        case 3:
          if (*param_4 != 0xd) {
            if (*param_4 != 10) goto LAB_009239b8;
            bVar3 = *(byte *)((long)param_2 + 0x42);
            *(undefined1 *)(param_2 + 6) = 0;
            param_2[1] = 0;
            FUN_0090456c(plVar1);
            *(byte *)((long)param_2 + 0x42) = *(byte *)((long)param_2 + 0x42) & 0xfe | bVar3 & 1;
          }
          break;
        case 4:
          if (*param_4 != 10) {
            *plVar9 = 0x300000009;
            if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
              return 0x38;
            }
            if (*(long *)(param_1 + 0x12a0) == 0) {
              if (DAT_00cc46b0 < 1) {
                return 0x38;
              }
            }
            else {
              if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) {
                return 0x38;
              }
              if (DAT_00cc46b0 < 1) {
                return 0x38;
              }
            }
            FUN_009050ec(param_1,"http_chunk error, expected 0x0a, seeing 0x%ux",*param_4);
            return 0x38;
          }
          *param_6 = *param_6 + 1;
          *param_2 = param_5 + -1;
          *(undefined4 *)(param_2 + 1) = 8;
          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
            return 0;
          }
          if (*(long *)(param_1 + 0x12a0) == 0) {
            if (DAT_00cc46b0 < 1) {
              return 0;
            }
          }
          else {
            if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) {
              return 0;
            }
            if (DAT_00cc46b0 < 1) {
              return 0;
            }
          }
          FUN_009050ec(param_1,"http_chunk, response complete");
          return 0;
        case 5:
          if ((*param_4 == 0xd) || (*param_4 == 10)) {
            lVar10 = FUN_00904974(plVar1);
            if (lVar10 == 0) {
              *(int *)plVar9 = 7;
              goto joined_r0x009237d8;
            }
            uVar6 = FUN_009045fc(plVar1,&DAT_002b917a,2);
            if ((int)uVar6 != 0) goto LAB_00923a34;
            uVar6 = FUN_00904974(plVar1);
            uVar7 = FUN_00904984(plVar1);
            if ((*(byte *)(param_1 + 0xa86) >> 2 & 1) == 0) {
              if (param_3 == 0) {
                uVar6 = FUN_00934dd0(param_1,0x44,uVar6,uVar7);
                iVar5 = (int)uVar6;
              }
              else {
                uVar6 = FUN_009350cc(param_1,param_3,0x44,uVar6);
                iVar5 = (int)uVar6;
              }
              if (iVar5 != 0) goto LAB_00923568;
            }
            FUN_0090456c(plVar1);
            *(int *)plVar9 = 6;
            if (*param_4 == 10) goto switchD_009235b0_default;
          }
          else {
            uVar6 = FUN_009045fc(plVar1,param_4,1);
            if ((int)uVar6 != 0) {
LAB_00923a34:
              *plVar9 = 0x500000009;
              return uVar6;
            }
          }
          break;
        case 6:
          if (*param_4 != 10) {
LAB_009239b8:
            lVar10 = 0x300000009;
LAB_00923a28:
            *plVar9 = lVar10;
            return 0x38;
          }
          *(int *)plVar9 = 7;
          break;
        case 7:
          if (*param_4 != 10) {
            if (*param_4 != 0xd) {
              *(int *)plVar9 = 5;
              goto joined_r0x009237d8;
            }
            param_4 = param_4 + 1;
            param_5 = param_5 + -1;
            *param_6 = *param_6 + 1;
          }
          *(int *)plVar9 = 4;
          goto joined_r0x009237d8;
        case 8:
          goto switchD_009235b0_caseD_8;
        case 9:
          goto switchD_009235b0_caseD_9;
        default:
switchD_009235b0_default:
          goto joined_r0x009237d8;
        }
        param_4 = param_4 + 1;
        param_5 = param_5 + -1;
        *param_6 = *param_6 + 1;
joined_r0x009237d8:
      } while (param_5 != 0);
    }
  }
switchD_009235b0_caseD_8:
  return 0;
}

