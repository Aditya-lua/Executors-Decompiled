/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2bec
 */

int ossl_provider_up_ref(long param_1)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  
  piVar1 = (int *)(param_1 + 0x10);
  do {
    iVar5 = *piVar1 + 1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar3) {
      *piVar1 = iVar5;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (((*(byte *)(param_1 + 200) & 1) != 0) &&
     (iVar4 = ossl_provider_up_ref_parent(param_1,0), iVar4 == 0)) {
    ossl_provider_free(param_1);
    iVar5 = 0;
  }
  return iVar5;
}

