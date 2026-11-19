/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a0588
 */

void FUN_008a0588(long param_1,long *param_2,ulong param_3,ulong *param_4)

{
  long lVar1;
  ulong uVar2;
  ulong local_60;
  ulong local_58;
  ulong uStack_50;
  ulong local_48;
  ulong uStack_40;
  ulong local_38;
  undefined1 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (*(long *)(param_1 + 0xc0) != 0) {
    if (param_4 == (ulong *)0x0) {
      if (param_2[5] != 0) {
        uVar2 = ((ulong)(uint)((int)param_3 << 3) + 8 ^ param_3 >> 0x20) * -0x622015f714c7d297;
        uVar2 = (param_3 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
        uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_2 + 6) & 0x3f);
        if ((*(ulong *)(param_2[3] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
          do {
            param_4 = (ulong *)(*param_2 + uVar2 * 0x30);
            if (*param_4 == param_3) {
              param_4 = param_4 + 1;
              goto LAB_008a05b0;
            }
            uVar2 = uVar2 + 1 & param_2[4] - 1U;
          } while ((*(ulong *)(param_2[3] + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0);
        }
      }
      local_30 = 1;
      local_38 = 0;
      uStack_50 = 0;
      local_58 = 0;
      uStack_40 = 0;
      local_48 = 0;
    }
    else {
LAB_008a05b0:
      local_30 = 0;
      uStack_50 = param_4[1];
      local_58 = *param_4;
      uStack_40 = param_4[3];
      local_48 = param_4[2];
      local_38 = param_4[4];
    }
    local_60 = param_3;
    FUN_008a06c4(*(long *)(param_1 + 0xc0),&local_60);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

