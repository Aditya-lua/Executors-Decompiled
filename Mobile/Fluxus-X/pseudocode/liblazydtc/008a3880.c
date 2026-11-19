/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a3880
 */

void FUN_008a3880(long param_1,long param_2,ulong param_3)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  long local_48;
  ulong uStack_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if (((param_2 != 0) && (*(int *)(param_2 + 8) == DAT_00d1b010)) &&
     (*(long *)(param_1 + 0x38) != 0)) {
    uVar4 = *(ulong *)(param_2 + 0x20);
    uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
    uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
    uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x40) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x28) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0x10) + uVar5 * 0x10) == uVar4) {
          plVar6 = (long *)(*(long *)(param_1 + 0x10) + uVar5 * 0x10 + 8);
          local_48 = *plVar6;
          uStack_40 = param_3;
          if (*(long *)(param_1 + 0x70) == 0) goto LAB_008a3a00;
          uVar4 = ((ulong)(local_48 * -0x40a7b892e31b1a47) >> 0x1f ^ param_3 >> 4 ^ param_3 >> 9 ^
                  local_48 * -0x40a7b892e31b1a47) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(param_1 + 0x78) & 0x3f);
          if ((*(ulong *)(*(long *)(param_1 + 0x60) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0)
          goto LAB_008a3a00;
          goto LAB_008a39d4;
        }
        uVar5 = uVar5 + 1 & *(long *)(param_1 + 0x30) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x28) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0
              );
    }
  }
  goto LAB_008a3a28;
  while (uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x68) - 1U,
        (*(ulong *)(*(long *)(param_1 + 0x60) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
LAB_008a39d4:
    plVar1 = (long *)(*(long *)(param_1 + 0x48) + uVar4 * 0x10);
    if (*plVar1 == local_48 && plVar1[1] == param_3) goto LAB_008a3a28;
  }
LAB_008a3a00:
  FUN_008a3c28(param_1 + 0x48,&local_48);
  lVar3 = FUN_00891928(*(undefined8 *)(param_1 + 8),plVar6);
  *(int *)(lVar3 + 4) = *(int *)(lVar3 + 4) + 1;
LAB_008a3a28:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

