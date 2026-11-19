/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51328
 */

undefined8 engine_free_util(void *param_1,int param_2)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  
  if (param_1 == (void *)0x0) {
    return 1;
  }
  piVar1 = (int *)((long)param_1 + 0x9c);
  if (param_2 == 0) {
    do {
      iVar4 = *piVar1 + -1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar3) {
        *piVar1 = iVar4;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
  }
  else {
    do {
      iVar4 = *piVar1 + -1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar3) {
        *piVar1 = iVar4;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (iVar4 == 0) {
      DataMemoryBarrier(2,1);
      goto LAB_00a5137c;
    }
  }
  if (0 < iVar4) {
    return 1;
  }
LAB_00a5137c:
  engine_pkey_meths_free(param_1);
  engine_pkey_asn1_meths_free(param_1);
  if (*(code **)((long)param_1 + 0x58) != (code *)0x0) {
    (**(code **)((long)param_1 + 0x58))(param_1);
  }
  engine_remove_dynamic_id(param_1,param_2);
  CRYPTO_free_ex_data(10,param_1,(CRYPTO_EX_DATA *)((long)param_1 + 0xa8));
  CRYPTO_free(param_1);
  return 1;
}

