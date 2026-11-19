/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e99c
 */

int EC_KEY_up_ref(EC_KEY *key)

{
  EC_KEY *pEVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  
  pEVar1 = key + 0x38;
  do {
    iVar2 = *(int *)pEVar1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
    if (bVar4) {
      *(int *)pEVar1 = iVar2 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  return (int)(0 < iVar2);
}

