/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902398
 */

void curl_easy_init(void)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  int iVar4;
  undefined8 local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  do {
    iVar4 = DAT_00d1ff88;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0xd1ff88,0x10);
    if (bVar2) {
      DAT_00d1ff88 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  while (iVar4 != 0) {
    while (DAT_00d1ff88 != 0) {
      Yield();
    }
    do {
      iVar4 = DAT_00d1ff88;
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0xd1ff88,0x10);
      if (bVar2) {
        DAT_00d1ff88 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
  }
  if (DAT_00d1ff8c == 0) {
    PTR_malloc_00cc4670 = malloc;
    PTR_free_00cc4678 = free;
    PTR_realloc_00cc4680 = realloc;
    PTR_strdup_00cc4688 = strdup;
    DAT_00d1ff8c = 1;
    PTR_calloc_00cc4690 = calloc;
    iVar4 = FUN_009055ec();
    if (((iVar4 != 0) || (iVar4 = FUN_0096836c(), iVar4 == 0)) ||
       (iVar4 = FUN_0090e9a8(), iVar4 != 0)) {
      local_40 = 0;
      DAT_00d1ff8c = DAT_00d1ff8c + -1;
      DAT_00d1ff88 = 0;
      goto LAB_0090249c;
    }
  }
  DAT_00d1ff88 = 0;
  iVar4 = FUN_00946ab8(&local_40);
  if (iVar4 != 0) {
    local_40 = 0;
  }
LAB_0090249c:
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_40);
  }
  return;
}

