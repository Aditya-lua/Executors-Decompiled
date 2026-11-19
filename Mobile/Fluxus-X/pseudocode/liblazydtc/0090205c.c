/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090205c
 */

undefined8 curl_global_init(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  
  do {
    iVar3 = DAT_00d1ff88;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0xd1ff88,0x10);
    if (bVar2) {
      DAT_00d1ff88 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  while (iVar3 != 0) {
    while (DAT_00d1ff88 != 0) {
      Yield();
    }
    do {
      iVar3 = DAT_00d1ff88;
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0xd1ff88,0x10);
      if (bVar2) {
        DAT_00d1ff88 = 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
  }
  uVar4 = 0;
  iVar3 = DAT_00d1ff8c + 1;
  bVar2 = DAT_00d1ff8c == 0;
  DAT_00d1ff8c = iVar3;
  if (bVar2) {
    PTR_malloc_00cc4670 = malloc;
    PTR_free_00cc4678 = free;
    PTR_realloc_00cc4680 = realloc;
    PTR_strdup_00cc4688 = strdup;
    PTR_calloc_00cc4690 = calloc;
    iVar3 = FUN_009055ec(0);
    if (((iVar3 != 0) || (iVar3 = FUN_0096836c(), iVar3 == 0)) ||
       (uVar4 = FUN_0090e9a8(), (int)uVar4 != 0)) {
      uVar4 = 2;
      DAT_00d1ff8c = DAT_00d1ff8c + -1;
    }
  }
  DAT_00d1ff88 = 0;
  return uVar4;
}

