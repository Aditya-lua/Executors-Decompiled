/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902154
 */

undefined8
curl_global_init_mem
          (undefined8 param_1,undefined *param_2,undefined *param_3,undefined *param_4,
          undefined *param_5,undefined *param_6)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  
  if (param_2 == (undefined *)0x0) {
    return 2;
  }
  if (param_3 == (undefined *)0x0) {
    return 2;
  }
  if (param_4 == (undefined *)0x0) {
    return 2;
  }
  if (param_5 == (undefined *)0x0) {
    return 2;
  }
  if (param_6 == (undefined *)0x0) {
    return 2;
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
  if (DAT_00d1ff8c == 0) {
    DAT_00d1ff8c = 1;
    PTR_malloc_00cc4670 = param_2;
    PTR_free_00cc4678 = param_3;
    PTR_realloc_00cc4680 = param_4;
    PTR_strdup_00cc4688 = param_5;
    PTR_calloc_00cc4690 = param_6;
    iVar3 = FUN_009055ec(2);
    if (((iVar3 == 0) && (iVar3 = FUN_0096836c(), iVar3 != 0)) &&
       (uVar4 = FUN_0090e9a8(), (int)uVar4 == 0)) {
      DAT_00d1ff88 = 0;
      return uVar4;
    }
    uVar4 = 2;
    DAT_00d1ff8c = DAT_00d1ff8c + -1;
  }
  else {
    uVar4 = 0;
    DAT_00d1ff8c = DAT_00d1ff8c + 1;
  }
  DAT_00d1ff88 = 0;
  return uVar4;
}

