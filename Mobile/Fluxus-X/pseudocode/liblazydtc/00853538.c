/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853538
 */

long * FUN_00853538(long *param_1,uint param_2,ulong param_3)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  long local_68;
  long lStack_60;
  long local_58;
  long lStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  do {
    uVar4 = *(uint *)(param_1 + 2);
    uVar5 = (ulong)uVar4;
    if (uVar5 < (ulong)param_1[1]) {
      iVar3 = *(int *)((long)param_1 + 0x14);
      do {
        uVar4 = uVar4 + 1;
        bVar1 = *(byte *)(*param_1 + uVar5);
        if (0x20 < bVar1) break;
        if ((1L << ((ulong)bVar1 & 0x3f) & 0x100003a00U) == 0) {
          if ((ulong)bVar1 != 10) break;
          iVar3 = iVar3 + 1;
          *(int *)((long)param_1 + 0x14) = iVar3;
          *(uint *)(param_1 + 3) = uVar4;
        }
        uVar5 = (ulong)uVar4;
        *(uint *)(param_1 + 2) = uVar4;
      } while (uVar5 < (ulong)param_1[1]);
    }
    if ((param_3 & 1) != 0) {
      param_1[9] = *(long *)((long)param_1 + 0x2c);
      param_1[8] = *(long *)((long)param_1 + 0x24);
    }
    FUN_00853648(&local_68,param_1);
    param_1[5] = lStack_60;
    param_1[4] = local_68;
    param_1[7] = lStack_50;
    param_1[6] = local_58;
    if (((param_2 & 1) == 0) || (param_3 = 0, (*(uint *)(param_1 + 4) & 0xfffffffe) != 0x11a)) {
      if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return param_1 + 4;
    }
  } while( true );
}

