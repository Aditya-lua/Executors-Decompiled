/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad16a0
 */

int RSA_up_ref(RSA *r)

{
  BN_BLINDING **ppBVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  
  ppBVar1 = &r->mt_blinding;
  do {
    iVar2 = *(int *)ppBVar1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(ppBVar1,0x10);
    if (bVar4) {
      *(int *)ppBVar1 = iVar2 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  return (int)(0 < iVar2);
}

