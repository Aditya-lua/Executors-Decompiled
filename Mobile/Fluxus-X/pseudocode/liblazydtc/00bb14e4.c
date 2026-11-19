/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb14e4
 */

void FUN_00bb14e4(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  int local_5c;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  uVar4 = ZSTD_getFrameHeader_advanced
                    (param_1 + 0x74e8,param_2,param_3,*(undefined4 *)(param_1 + 0x7598));
  if (uVar4 < 0xffffffffffffff89) {
    if (uVar4 == 0) {
      if (((*(int *)(param_1 + 0x7610) == 1) &&
          (plVar7 = *(long **)(param_1 + 0x7608), plVar7 != (long *)0x0)) &&
         (*(long *)(param_1 + 0x75f0) != 0)) {
        iVar1 = *(int *)(param_1 + 0x7504);
        local_5c = iVar1;
        uVar4 = ZSTD_XXH64(&local_5c,4,0);
        lVar5 = plVar7[1];
        uVar4 = lVar5 - 1U & uVar4;
        do {
          uVar6 = uVar4;
          iVar3 = ZSTD_getDictID_fromDDict(*(undefined8 *)(*plVar7 + uVar6 * 8));
          uVar4 = (uVar6 & lVar5 - 1U) + 1;
        } while (iVar3 != iVar1 && iVar3 != 0);
        lVar5 = *(long *)(*plVar7 + uVar6 * 8);
        if (lVar5 != 0) {
          ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
          *(undefined8 *)(param_1 + 0x75e8) = 0;
          *(long *)(param_1 + 0x75f0) = lVar5;
          *(undefined4 *)(param_1 + 0x75f8) = *(undefined4 *)(param_1 + 0x7504);
          *(undefined4 *)(param_1 + 0x7600) = 0xffffffff;
        }
      }
      if ((*(int *)(param_1 + 0x7504) == 0) ||
         (*(int *)(param_1 + 0x75f8) == *(int *)(param_1 + 0x7504))) {
        if (*(int *)(param_1 + 0x7508) == 0) {
          *(undefined4 *)(param_1 + 0x75a0) = 0;
        }
        else {
          *(uint *)(param_1 + 0x75a0) = (uint)(*(int *)(param_1 + 0x759c) == 0);
          if (*(int *)(param_1 + 0x759c) == 0) {
            ZSTD_XXH64_reset(param_1 + 0x7538,0);
          }
        }
        uVar4 = 0;
        *(long *)(param_1 + 0x7518) = *(long *)(param_1 + 0x7518) + param_3;
      }
      else {
        uVar4 = 0xffffffffffffffe0;
      }
    }
    else {
      uVar4 = 0xffffffffffffffb8;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

