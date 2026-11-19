/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57540
 */

void EVP_MD_free(long param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  
  if ((param_1 != 0) && (*(int *)(param_1 + 0x18) == 0)) {
    piVar1 = (int *)(param_1 + 0x78);
    do {
      iVar2 = *piVar1;
      iVar5 = iVar2 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
      evp_md_free_int();
      return;
    }
    if (iVar2 < 2) {
      evp_md_free_int();
      return;
    }
  }
  return;
}

