/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2bcb0
 */

int FUN_00c2bcb0(int param_1,int *param_2)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  
  if (DAT_00d280e0 != '\0') {
    LOAcquire();
    iVar3 = *param_2;
    *param_2 = iVar3 + param_1;
    LORelease();
    return iVar3;
  }
  do {
    iVar3 = *param_2;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(param_2,0x10);
    if (bVar2) {
      *param_2 = iVar3 + param_1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  return iVar3;
}

