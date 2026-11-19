/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5524
 */

undefined8 CRYPTO_atomic_or(ulong *param_1,ulong param_2,ulong *param_3)

{
  char cVar1;
  bool bVar2;
  ulong uVar3;
  
  do {
    uVar3 = *param_1;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(param_1,0x10);
    if (bVar2) {
      *param_1 = uVar3 | param_2;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  *param_3 = uVar3 | param_2;
  return 1;
}

