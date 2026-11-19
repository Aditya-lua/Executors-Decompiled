/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbe48
 */

int BIO_free(BIO *a)

{
  ulong *puVar1;
  code *pcVar2;
  char cVar3;
  bool bVar4;
  ulong uVar5;
  int iVar6;
  code *pcVar7;
  
  if (a == (BIO *)0x0) {
    return 0;
  }
  puVar1 = &a->num_write;
  do {
    uVar5 = *puVar1;
    iVar6 = (int)uVar5 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(puVar1,0x10);
    if (bVar4) {
      *(int *)puVar1 = iVar6;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar6 == 0) {
    DataMemoryBarrier(2,1);
    pcVar7 = (code *)a->cb_arg;
    pcVar2 = *(code **)&a->init;
  }
  else {
    if (1 < (int)uVar5) {
      return 1;
    }
    pcVar7 = (code *)a->cb_arg;
    pcVar2 = *(code **)&a->init;
  }
  if (pcVar7 == (code *)0x0) {
    if (pcVar2 == (code *)0x0) goto LAB_009fbef0;
LAB_009fbec4:
    iVar6 = (*pcVar2)(a,1,0,0,0,0,1,0);
  }
  else {
    if (pcVar2 != (code *)0x0) goto LAB_009fbec4;
    iVar6 = (*pcVar7)(a,1,0,0,0,1);
  }
  if (iVar6 < 1) {
    return 0;
  }
LAB_009fbef0:
  if ((a->callback != (_func_603 *)0x0) &&
     (pcVar7 = *(code **)(a->callback + 0x50), pcVar7 != (code *)0x0)) {
    (*pcVar7)(a);
  }
  CRYPTO_free_ex_data(0xc,a,(CRYPTO_EX_DATA *)(a + 1));
  CRYPTO_THREAD_lock_free(a[1].cb_arg);
  CRYPTO_free(a);
  return 1;
}

