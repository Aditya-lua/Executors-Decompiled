/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891a24
 */

long FUN_00891a24(long *param_1,uint *param_2)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  byte bVar12;
  undefined1 uStack_41;
  uint *local_40;
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
  uVar8 = param_1[4];
  uVar2 = *param_2;
  uVar6 = (ulong)(int)uVar2;
  if (uVar8 != 0) {
    bVar12 = POPCOUNT((char)uVar8) + POPCOUNT((char)(uVar8 >> 8)) + POPCOUNT((char)(uVar8 >> 0x10))
             + POPCOUNT((char)(uVar8 >> 0x18)) + POPCOUNT((char)(uVar8 >> 0x20)) +
             POPCOUNT((char)(uVar8 >> 0x28)) + POPCOUNT((char)(uVar8 >> 0x30)) +
             POPCOUNT((char)(uVar8 >> 0x38));
    if (bVar12 < 2) {
      uVar9 = uVar8 - 1 & uVar6;
    }
    else {
      uVar9 = uVar6;
      if (uVar8 <= uVar6) {
        uVar9 = 0;
        if (uVar8 != 0) {
          uVar9 = uVar6 / uVar8;
        }
        uVar9 = uVar6 - uVar9 * uVar8;
      }
    }
    plVar10 = *(long **)(param_1[3] + uVar9 * 8);
    if ((plVar10 != (long *)0x0) && (plVar10 = (long *)*plVar10, plVar10 != (long *)0x0)) {
      do {
        uVar11 = plVar10[1];
        if (uVar11 == uVar6) {
          if (*(uint *)(plVar10 + 2) == uVar2) {
            if ((ulong)plVar10[3] < (ulong)(param_1[1] - *param_1 >> 3)) {
              lVar7 = *param_1 + plVar10[3] * 8;
              goto LAB_00891b44;
            }
            if (*(long *)(lVar4 + 0x28) == local_38) {
              FUN_00892760();
            }
            goto LAB_00891b9c;
          }
        }
        else {
          if (bVar12 < 2) {
            uVar11 = uVar11 & uVar8 - 1;
          }
          else if (uVar8 <= uVar11) {
            uVar3 = 0;
            if (uVar8 != 0) {
              uVar3 = uVar11 / uVar8;
            }
            uVar11 = uVar11 - uVar3 * uVar8;
          }
          if (uVar11 != uVar9) break;
        }
        plVar10 = (long *)*plVar10;
      } while (plVar10 != (long *)0x0);
    }
  }
  local_40 = (uint *)(ulong)uVar2;
  FUN_00892230(param_1,&local_40);
  lVar7 = *param_1;
  lVar1 = param_1[1];
  local_40 = param_2;
  lVar5 = FUN_00892328(param_1 + 3,param_2,&DAT_002dd6a5,&local_40,&uStack_41);
  *(long *)(lVar5 + 0x18) = (lVar1 - lVar7 >> 3) + -1;
  lVar7 = param_1[1] + -8;
LAB_00891b44:
  if (*(long *)(lVar4 + 0x28) == local_38) {
    return lVar7 + 4;
  }
LAB_00891b9c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

