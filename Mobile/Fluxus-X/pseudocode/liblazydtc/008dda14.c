/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dda14
 */

/* WARNING: Removing unreachable block (ram,0x008ddae0) */
/* WARNING: Removing unreachable block (ram,0x008ddafc) */

void FUN_008dda14(undefined8 *param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  ulong *puVar4;
  ulong uVar5;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uVar5 = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  do {
    plVar1 = (long *)(param_2 + uVar5 * 0x10);
    if (plVar1[1] == 0 && *plVar1 == 0) {
      local_60 = 0;
      uStack_58 = 0;
      puVar4 = (ulong *)((ulong)&local_60 | (ulong)(0x3f < uVar5) << 3);
      *puVar4 = *puVar4 | 1L << (uVar5 & 0x3f);
      lVar3 = 0;
      do {
        lVar3 = lVar3 + 1;
      } while (lVar3 != 0x80);
                    /* try { // try from 008dda58 to 008dda63 has its CatchHandler @ 008ddb34 */
      FUN_008ddb70(param_1,&local_60);
    }
    uVar5 = uVar5 + 1;
  } while (uVar5 != 0x80);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

