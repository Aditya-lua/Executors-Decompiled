/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b8f0
 */

char FUN_00c2b8f0(char param_1,char param_2,char *param_3)

{
  char cVar1;
  bool bVar2;
  char cVar3;
  
  if (DAT_00d280e0 != '\0') {
    cVar3 = *param_3;
    if (cVar3 == param_1) {
      *param_3 = param_2;
    }
    return cVar3;
  }
  do {
    cVar3 = *param_3;
    if (*param_3 != param_1) {
      return cVar3;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(param_3,0x10);
    if (bVar2) {
      *param_3 = param_2;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  return cVar3;
}

