/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafe30
 */

void ZSTD_getFrameHeader_advanced(ulong *param_1,uint *param_2,ulong param_3,int param_4)

{
  byte *pbVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  long lVar5;
  ulong uVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  uint local_4c;
  long local_48;
  
  lVar5 = tpidr_el0;
  local_48 = *(long *)(lVar5 + 0x28);
  uVar9 = 5;
  if (param_4 != 0) {
    uVar9 = 1;
  }
  if ((param_2 == (uint *)0x0) && (param_3 != 0)) {
    uVar6 = 0xffffffffffffffff;
    goto LAB_00bafe70;
  }
  if (param_3 < uVar9) {
    uVar6 = uVar9;
    if ((param_3 == 0) || (param_4 == 1)) goto LAB_00bafe70;
    local_4c = 0xfd2fb528;
    memcpy(&local_4c,param_2,param_3);
    if (local_4c == 0xfd2fb528) goto LAB_00bafe70;
    local_4c = 0x184d2a50;
    memcpy(&local_4c,param_2,param_3);
    if (local_4c >> 4 == 0x184d2a5) goto LAB_00bafe70;
  }
  else {
    param_1[3] = 0;
    param_1[2] = 0;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    if ((param_4 == 1) || (*param_2 == 0xfd2fb528)) {
      pbVar1 = (byte *)((long)param_2 + uVar9);
      bVar4 = pbVar1[-1];
      lVar2 = *(long *)(&DAT_00364d50 + ((ulong)bVar4 & 3) * 8) + uVar9 +
              *(long *)(&DAT_00364e90 + (ulong)(bVar4 >> 6) * 8);
      if ((bVar4 & 0x20) == 0) {
        lVar2 = lVar2 + 1;
      }
      uVar6 = lVar2 + (ulong)((uint)(bVar4 < 0x40) & (bVar4 & 0x20) >> 5);
      if (uVar6 <= param_3) {
        *(int *)(param_1 + 3) = (int)uVar6;
        bVar4 = pbVar1[-1];
        if ((bVar4 >> 3 & 1) == 0) {
          if ((bVar4 >> 5 & 1) == 0) {
            bVar3 = *pbVar1;
            if (0xaf < (ulong)bVar3) {
              uVar6 = 0xfffffffffffffff0;
              goto LAB_00bafe70;
            }
            uVar9 = uVar9 + 1;
            uVar8 = 1L << (ulong)(bVar3 >> 3) + 10;
            uVar8 = uVar8 + (uVar8 >> 3) * ((ulong)bVar3 & 7);
          }
          else {
            uVar8 = 0;
          }
          uVar7 = bVar4 & 3;
          bVar3 = bVar4 >> 6;
          if (uVar7 == 1 || (bVar4 & 3) == 0) {
            if ((bVar4 & 3) != 0) {
              uVar7 = (uint)*(byte *)((long)param_2 + uVar9);
              uVar9 = uVar9 + 1;
            }
          }
          else if (uVar7 == 2) {
            uVar7 = (uint)*(ushort *)((long)param_2 + uVar9);
            uVar9 = uVar9 + 2;
          }
          else {
            uVar7 = *(uint *)((long)param_2 + uVar9);
            uVar9 = uVar9 + 4;
          }
          if (bVar3 < 2) {
            if (bVar3 == 0) {
              if ((bVar4 >> 5 & 1) == 0) {
                uVar9 = 0xffffffffffffffff;
              }
              else {
                uVar9 = (ulong)*(byte *)((long)param_2 + uVar9);
              }
            }
            else {
              uVar9 = (ulong)*(ushort *)((long)param_2 + uVar9) + 0x100;
            }
          }
          else if (bVar3 == 2) {
            uVar9 = (ulong)*(uint *)((long)param_2 + uVar9);
          }
          else {
            uVar9 = *(ulong *)((long)param_2 + uVar9);
          }
          uVar6 = 0;
          *(uint *)((long)param_1 + 0x1c) = uVar7;
          *(uint *)(param_1 + 4) = bVar4 >> 2 & 1;
          if ((bVar4 & 0x20) != 0) {
            uVar8 = uVar9;
          }
          *param_1 = uVar9;
          param_1[1] = uVar8;
          if (0x1ffff < uVar8) {
            uVar8 = 0x20000;
          }
          *(int *)(param_1 + 2) = (int)uVar8;
          *(undefined4 *)((long)param_1 + 0x14) = 0;
        }
        else {
          uVar6 = 0xfffffffffffffff2;
        }
      }
      goto LAB_00bafe70;
    }
    if (*param_2 >> 4 == 0x184d2a5) {
      uVar6 = 8;
      if (7 < param_3) {
        *(undefined4 *)((long)param_1 + 0x14) = 1;
        uVar7 = *param_2;
        *(undefined4 *)(param_1 + 3) = 8;
        *(uint *)((long)param_1 + 0x1c) = uVar7 + 0xe7b2d5b0;
        uVar6 = 0;
        *param_1 = (ulong)param_2[1];
      }
      goto LAB_00bafe70;
    }
  }
  uVar6 = 0xfffffffffffffff6;
LAB_00bafe70:
  if (*(long *)(lVar5 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

