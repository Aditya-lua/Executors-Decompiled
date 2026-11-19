/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083c480
 */

void FUN_0083c480(undefined8 param_1,long param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  byte *pbVar4;
  byte bVar5;
  long local_48;
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  FUN_008aba9c(param_1,2,&local_3c);
  if (((DAT_00ccab88 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccab88), iVar2 != 0)) {
                    /* try { // try from 0083c558 to 0083c55b has its CatchHandler @ 0083c578 */
    DAT_00ccab80 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00ccab88);
  }
  local_48 = *(long *)(DAT_00ccab80 + (long)local_3c * 8 + 0x6d752e0);
  if ((local_48 == 0) ||
     (plVar3 = (long *)(*DAT_00d1b390)(*(long *)(param_2 + 0x18) + 0x1d8,&local_48),
     plVar3 == (long *)0x0)) {
    pbVar4 = (byte *)0x0;
    bVar5 = 0;
  }
  else {
    pbVar4 = (byte *)(*plVar3 + 0xa9);
    bVar5 = *pbVar4 >> 4 & 1;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(pbVar4,bVar5);
  }
  return;
}

