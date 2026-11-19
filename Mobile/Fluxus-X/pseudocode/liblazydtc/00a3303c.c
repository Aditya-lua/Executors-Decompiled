/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3303c
 */

void EC_ec_pre_comp_free(void *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  long *ptr;
  EC_POINT *point;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  piVar1 = (int *)((long)param_1 + 0x30);
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
  }
  else if (1 < iVar2) {
    return;
  }
  ptr = *(long **)((long)param_1 + 0x20);
  if (ptr != (long *)0x0) {
    point = (EC_POINT *)*ptr;
    if (point != (EC_POINT *)0x0) {
      do {
        ptr = ptr + 1;
        EC_POINT_free(point);
        point = (EC_POINT *)*ptr;
      } while (point != (EC_POINT *)0x0);
      ptr = *(long **)((long)param_1 + 0x20);
    }
    CRYPTO_free(ptr);
  }
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x38));
  CRYPTO_free(param_1);
  return;
}

