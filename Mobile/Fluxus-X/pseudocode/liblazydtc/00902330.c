/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902330
 */

void curl_global_sslset(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  
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
  FUN_00969614();
  DAT_00d1ff88 = 0;
  return;
}

