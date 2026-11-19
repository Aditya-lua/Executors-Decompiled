/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008544a0
 */

void FUN_008544a0(undefined4 *param_1,long *param_2,undefined8 param_3,undefined4 param_4,
                 undefined4 param_5)

{
  undefined4 uVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  undefined4 local_6c;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar2 = *(uint *)(param_2 + 2);
  uVar11 = (ulong)uVar2;
  uVar8 = param_2[1];
  uVar7 = uVar11;
  if (uVar11 < uVar8) {
    do {
      lVar9 = *param_2;
      bVar3 = *(byte *)(lVar9 + uVar7);
      uVar10 = (uint)bVar3;
      iVar6 = (int)uVar7;
      if (bVar3 < 0x5c) {
        if (uVar10 < 0xe && (1 << (ulong)(uVar10 & 0x1f) & 0x2401U) != 0) break;
LAB_0085459c:
        uVar7 = (ulong)(iVar6 + 1U);
        *(uint *)(param_2 + 2) = iVar6 + 1U;
      }
      else {
        if (bVar3 != 0x5c) {
          if (uVar10 == 0x60) {
            uVar1 = *(undefined4 *)((long)param_2 + 0x14);
            lVar5 = param_2[3];
            *param_1 = param_5;
            param_1[5] = iVar6 - uVar2;
            *(undefined8 *)(param_1 + 1) = param_3;
            *(int *)(param_2 + 2) = iVar6 + 1;
            *(ulong *)(param_1 + 3) = CONCAT44((iVar6 + 1) - (int)lVar5,uVar1);
          }
          else {
            if (uVar10 != 0x7b) goto LAB_0085459c;
            local_6c = 0;
            FUN_008546cc(param_2 + 0xc,&local_6c);
            iVar6 = (int)param_2[2];
            lVar9 = *param_2;
            uVar10 = iVar6 + 1;
            if (((ulong)uVar10 < (ulong)param_2[1]) && (*(char *)(lVar9 + (ulong)uVar10) == '{')) {
              uVar1 = *(undefined4 *)((long)param_2 + 0x14);
              lVar5 = param_2[3];
              *(undefined8 *)(param_1 + 1) = param_3;
              *param_1 = 0x121;
              param_1[5] = iVar6 - uVar2;
              *(ulong *)(param_1 + 6) = lVar9 + uVar11;
              *(ulong *)(param_1 + 3) = CONCAT44(iVar6 - (int)lVar5,uVar1);
              *(int *)(param_2 + 2) = iVar6 + 2;
              goto LAB_008545d0;
            }
            uVar1 = *(undefined4 *)((long)param_2 + 0x14);
            lVar5 = param_2[3];
            *(uint *)(param_2 + 2) = uVar10;
            *param_1 = param_4;
            *(undefined8 *)(param_1 + 1) = param_3;
            param_1[5] = iVar6 - uVar2;
            *(ulong *)(param_1 + 3) = CONCAT44(uVar10 - (int)lVar5,uVar1);
          }
          *(ulong *)(param_1 + 6) = lVar9 + uVar11;
          goto LAB_008545d0;
        }
        if ((((iVar6 + 1 < uVar8) && (*(char *)(lVar9 + (ulong)(iVar6 + 1)) == 'u')) &&
            (iVar6 + 2 < uVar8)) && (*(char *)(lVar9 + (ulong)(iVar6 + 2)) == '{')) {
          uVar7 = (ulong)(iVar6 + 3U);
          *(uint *)(param_2 + 2) = iVar6 + 3U;
        }
        else {
          FUN_00854258(param_2);
          uVar7 = (ulong)*(uint *)(param_2 + 2);
          uVar8 = param_2[1];
        }
      }
    } while (uVar7 < uVar8);
  }
  uVar1 = *(undefined4 *)((long)param_2 + 0x14);
  lVar9 = param_2[3];
  *(undefined8 *)(param_1 + 1) = param_3;
  param_1[5] = 0;
  *(undefined8 *)(param_1 + 6) = 0;
  *param_1 = 0x11e;
  *(ulong *)(param_1 + 3) = CONCAT44((int)uVar7 - (int)lVar9,uVar1);
LAB_008545d0:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

