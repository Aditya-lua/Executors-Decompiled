/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58944
 */

undefined8 EVP_MD_up_ref(long param_1)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  
  if (*(int *)(param_1 + 0x18) == 0) {
    piVar1 = (int *)(param_1 + 0x78);
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

