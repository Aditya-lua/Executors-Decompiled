/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088dd6c
 */

void FUN_0088dd6c(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  byte *pbVar5;
  ulong uVar6;
  ulong *puVar7;
  undefined8 *local_30;
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  lVar2 = *(long *)(param_1 + 0x7a8) - *(long *)(param_1 + 0x7a0);
  local_30 = param_2;
  if (lVar2 != 0) {
    uVar6 = lVar2 >> 3;
    uVar4 = 0;
    uVar1 = uVar6;
    if (uVar6 < 2) {
      uVar1 = 1;
    }
    do {
      if (*(undefined8 **)(*(long *)(param_1 + 0x7a0) + uVar4 * 8) == param_2) goto LAB_0088ded0;
      uVar4 = uVar4 + 1;
    } while (uVar1 != uVar4);
    if (199 < uVar6) {
      if (*(long *)(lVar3 + 0x28) == local_28) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 1,
                     "Out of upvalue registers when trying to allocate %s: exceeded limit %d",
                     *param_2,200);
      }
      goto LAB_0088df1c;
    }
  }
  if (*(long *)(param_1 + 0x138) != 0) {
    uVar4 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ (ulong)param_2 >> 0x20) * -0x622015f714c7d297;
    uVar4 = ((ulong)param_2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      do {
        puVar7 = (ulong *)(*(long *)(param_1 + 0x110) + uVar4 * 0x28);
        if ((undefined8 *)*puVar7 == param_2) {
          if ((char)puVar7[4] == '\x01') {
            pbVar5 = (byte *)FUN_00886aac(param_1 + 0xa0,&local_30);
            pbVar5[2] = 1;
            if (pbVar5[1] == 1) {
              *(undefined1 *)(param_1 + (ulong)*pbVar5 + 0x698) = 1;
            }
          }
          break;
        }
        uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x130) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) !=
               0);
    }
  }
  FUN_0086e2d0(param_1 + 0x7a0,&local_30);
  uVar4 = (ulong)(((uint)(*(int *)(param_1 + 0x7a8) - *(int *)(param_1 + 0x7a0)) >> 3) - 1);
LAB_0088ded0:
  if (*(long *)(lVar3 + 0x28) == local_28) {
    return;
  }
LAB_0088df1c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar4);
}

