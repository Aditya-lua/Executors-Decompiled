/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f160
 */

int DH_up_ref(DH *dh)

{
  DH *pDVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  
  pDVar1 = dh + 1;
  do {
    iVar2 = pDVar1->pad;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pDVar1,0x10);
    if (bVar4) {
      pDVar1->pad = iVar2 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  return (int)(0 < iVar2);
}

