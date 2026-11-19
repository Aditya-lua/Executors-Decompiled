/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853424
 */

long * FUN_00853424(long *param_1)

{
  byte bVar1;
  long lVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  long local_68;
  long lStack_60;
  long local_58;
  long lStack_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  bVar4 = true;
  lVar3 = param_1[0xb];
  do {
    uVar6 = *(uint *)(param_1 + 2);
    uVar7 = (ulong)uVar6;
    if (uVar7 < (ulong)param_1[1]) {
      iVar5 = *(int *)((long)param_1 + 0x14);
      do {
        uVar6 = uVar6 + 1;
        bVar1 = *(byte *)(*param_1 + uVar7);
        if (0x20 < bVar1) break;
        if ((1L << ((ulong)bVar1 & 0x3f) & 0x100003a00U) == 0) {
          if ((ulong)bVar1 != 10) break;
          iVar5 = iVar5 + 1;
          *(int *)((long)param_1 + 0x14) = iVar5;
          *(uint *)(param_1 + 3) = uVar6;
        }
        uVar7 = (ulong)uVar6;
        *(uint *)(param_1 + 2) = uVar6;
      } while (uVar7 < (ulong)param_1[1]);
    }
    if (bVar4) {
      param_1[9] = *(long *)((long)param_1 + 0x2c);
      param_1[8] = *(long *)((long)param_1 + 0x24);
    }
    FUN_00853648(&local_68,param_1);
    param_1[5] = lStack_60;
    param_1[4] = local_68;
    param_1[7] = lStack_50;
    param_1[6] = local_58;
    if (((char)lVar3 == '\0') || (bVar4 = false, (*(uint *)(param_1 + 4) & 0xfffffffe) != 0x11a)) {
      if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return param_1 + 4;
    }
  } while( true );
}

