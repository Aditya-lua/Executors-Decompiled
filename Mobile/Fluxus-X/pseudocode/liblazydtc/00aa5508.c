/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5508
 */

undefined8 CRYPTO_atomic_add(int *param_1,int param_2,int *param_3)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  
  do {
    iVar1 = *param_1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(param_1,0x10);
    if (bVar3) {
      *param_1 = iVar1 + param_2;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  *param_3 = iVar1 + param_2;
  return 1;
}

