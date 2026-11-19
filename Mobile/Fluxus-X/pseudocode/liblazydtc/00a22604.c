/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22604
 */

int DSO_up_ref(DSO *dso)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  
  if (dso == (DSO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x61,"DSO_up_ref");
    ERR_set_error(0x25,0xc0102,0);
    return 0;
  }
  piVar1 = &dso->references;
  do {
    iVar2 = *piVar1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar4) {
      *piVar1 = iVar2 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  return (int)(0 < iVar2);
}

