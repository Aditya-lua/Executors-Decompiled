/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902244
 */

void curl_global_cleanup(void)

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
  if ((DAT_00d1ff8c != 0) && (DAT_00d1ff8c = DAT_00d1ff8c + -1, DAT_00d1ff8c == 0)) {
    FUN_009695d8();
    FUN_0090e9b0();
  }
  DAT_00d1ff88 = 0;
  return;
}

