/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50f0c
 */

undefined8 engine_unlocked_init(long param_1)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  undefined8 uVar4;
  
  if ((*(int *)(param_1 + 0xa0) == 0) && (*(code **)(param_1 + 0x60) != (code *)0x0)) {
    uVar4 = (**(code **)(param_1 + 0x60))(param_1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
  }
  else {
    uVar4 = 1;
  }
  piVar1 = (int *)(param_1 + 0x9c);
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar3) {
      *piVar1 = *piVar1 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  *(int *)(param_1 + 0xa0) = *(int *)(param_1 + 0xa0) + 1;
  return uVar4;
}

