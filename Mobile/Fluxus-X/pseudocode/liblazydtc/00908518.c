/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908518
 */

void FUN_00908518(undefined4 param_1,long param_2,code *param_3)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  int iVar7;
  ulong uVar8;
  int local_4c [5];
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  uVar5 = (*param_3)(param_1,local_4c);
  if (uVar5 != 0) {
    uVar6 = 0;
    lVar1 = param_2 + 0x18;
    do {
      uVar4 = (uint)uVar6;
      if (((0x10001 << (ulong)(uVar4 & 0x1f) & uVar5) == 0) || (iVar7 = local_4c[uVar6], iVar7 < 0))
      break;
      if ((1 << (ulong)(uVar4 & 0x1f) & uVar5) == 0) {
        if (*(uint *)(param_2 + 0x14) == 0) {
          uVar8 = 0;
        }
        else {
          uVar8 = 0;
          do {
            if (*(int *)(param_2 + (uVar8 & 0xffffffff) * 4) == iVar7) {
              *(byte *)(lVar1 + uVar8) = *(byte *)(lVar1 + uVar8) | 2;
              goto LAB_0090868c;
            }
            uVar8 = uVar8 + 1;
          } while ((uint)uVar8 < *(uint *)(param_2 + 0x14));
          if (4 < (uint)uVar8) goto LAB_0090868c;
        }
        *(int *)(param_2 + (uVar8 & 0xffffffff) * 4) = iVar7;
        iVar7 = (int)uVar8 + 1;
        *(undefined1 *)(param_2 + (uVar8 & 0xffffffff) + 0x18) = 2;
LAB_00908688:
        *(int *)(param_2 + 0x14) = iVar7;
      }
      else {
        uVar2 = *(uint *)(param_2 + 0x14);
        if ((0x10000 << (ulong)(uVar4 & 0x1f) & uVar5) == 0) {
          if (uVar2 == 0) {
            uVar8 = 0;
          }
          else {
            uVar8 = 0;
            do {
              if (*(int *)(param_2 + (uVar8 & 0xffffffff) * 4) == iVar7) {
                *(byte *)(lVar1 + uVar8) = *(byte *)(lVar1 + uVar8) | 1;
                goto LAB_0090868c;
              }
              uVar8 = uVar8 + 1;
            } while ((uint)uVar8 < uVar2);
            if (4 < (uint)uVar8) goto LAB_0090868c;
          }
          *(int *)(param_2 + (uVar8 & 0xffffffff) * 4) = iVar7;
          iVar7 = (int)uVar8 + 1;
          *(undefined1 *)(param_2 + (uVar8 & 0xffffffff) + 0x18) = 1;
          goto LAB_00908688;
        }
        if (uVar2 == 0) {
          uVar8 = 0;
LAB_00908628:
          *(int *)(param_2 + (uVar8 & 0xffffffff) * 4) = iVar7;
          iVar7 = (int)uVar8 + 1;
          *(undefined1 *)(param_2 + (uVar8 & 0xffffffff) + 0x18) = 3;
          goto LAB_00908688;
        }
        uVar8 = 0;
        do {
          if (*(int *)(param_2 + (uVar8 & 0xffffffff) * 4) == iVar7) {
            *(byte *)(lVar1 + uVar8) = *(byte *)(lVar1 + uVar8) | 3;
            goto LAB_0090868c;
          }
          uVar8 = uVar8 + 1;
        } while ((uint)uVar8 < uVar2);
        if ((uint)uVar8 < 5) goto LAB_00908628;
      }
LAB_0090868c:
      uVar6 = uVar6 + 1;
    } while (uVar6 < 5);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

