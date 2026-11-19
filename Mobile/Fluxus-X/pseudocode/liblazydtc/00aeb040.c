/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb040
 */

undefined8 OSSL_STORE_LOADER_up_ref(long param_1)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  
  if (*(long *)(param_1 + 0x60) != 0) {
    piVar1 = (int *)(param_1 + 0x80);
    do {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar3) {
        *piVar1 = *piVar1 + 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
  }
  return 1;
}

