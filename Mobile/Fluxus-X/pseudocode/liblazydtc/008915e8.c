/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008915e8
 */

uint FUN_008915e8(long param_1,ulong *param_2,undefined8 param_3)

{
  bool bVar1;
  long lVar2;
  long *plVar3;
  byte *pbVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar5 = (*(long **)(param_1 + 0xd70))[1] - **(long **)(param_1 + 0xd70);
  if ((int)(uVar5 >> 3) < 1) {
LAB_008917d8:
    if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_3,"Attempt to access undefined private field");
    }
LAB_008917f8:
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  uVar5 = uVar5 >> 3 & 0x7fffffff;
LAB_00891678:
  uVar8 = uVar5 - 1;
  local_70 = *(ulong *)(**(long **)(param_1 + 0xd70) + uVar8 * 8);
  if (*(long *)(param_1 + 0xd60) != 0) {
    uVar6 = ((ulong)(uint)((int)local_70 << 3) + 8 ^ local_70 >> 0x20) * -0x622015f714c7d297;
    uVar6 = (local_70 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
    uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0xd68) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0xd50) + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0xd38) + uVar6 * 0x40) == local_70) {
          plVar3 = (long *)FUN_00883c54(param_1 + 0xd38,&local_70);
          if (plVar3[5] != 0) {
            uVar6 = *param_2;
            uVar7 = (uVar6 >> 4 ^ uVar6 >> 9) * -0x61c8864680b583eb >>
                    ((ulong)*(byte *)(plVar3 + 6) & 0x3f);
            if ((*(ulong *)(plVar3[3] + (uVar7 >> 6) * 8) >> (uVar7 & 0x3f) & 1) != 0) {
              goto LAB_00891760;
            }
          }
          break;
        }
        uVar6 = uVar6 + 1 & *(long *)(param_1 + 0xd58) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0xd50) + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) !=
               0);
    }
  }
  goto LAB_00891670;
  while (uVar7 = uVar7 + 1 & plVar3[4] - 1U,
        (*(ulong *)(plVar3[3] + (uVar7 >> 6) * 8) >> (uVar7 & 0x3f) & 1) != 0) {
LAB_00891760:
    if (*(ulong *)(*plVar3 + uVar7 * 0x10) == uVar6) {
      pbVar4 = (byte *)FUN_00883e18(plVar3,param_2);
      if (*(long *)(lVar2 + 0x28) == local_68) {
        return (uint)pbVar4[1] << 0x10 | ((uint)uVar8 & 0xff) << 8 | (uint)*pbVar4;
      }
      goto LAB_008917f8;
    }
  }
LAB_00891670:
  bVar1 = (long)uVar5 < 2;
  uVar5 = uVar8;
  if (bVar1) goto LAB_008917d8;
  goto LAB_00891678;
}

