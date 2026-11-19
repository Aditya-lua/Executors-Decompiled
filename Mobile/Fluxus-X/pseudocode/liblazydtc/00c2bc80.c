/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2bc80
 */

undefined8 FUN_00c2bc80(undefined8 param_1,undefined8 *param_2)

{
  char cVar1;
  bool bVar2;
  undefined8 uVar3;
  
  if (DAT_00d280e0 != '\0') {
    LOAcquire();
    uVar3 = *param_2;
    *param_2 = param_1;
    LORelease();
    return uVar3;
  }
  do {
    uVar3 = *param_2;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(param_2,0x10);
    if (bVar2) {
      *param_2 = param_1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  return uVar3;
}

