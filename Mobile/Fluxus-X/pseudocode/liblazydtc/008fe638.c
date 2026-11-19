/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe638
 */

undefined8 FUN_008fe638(undefined8 *param_1)

{
  ThreadPool *pTVar1;
  char cVar2;
  long lVar3;
  bool bVar4;
  int iVar5;
  pthread_key_t *ppVar6;
  pthread_t pVar7;
  long *plVar8;
  void *__pointer;
  code *pcVar9;
  undefined8 *puVar10;
  long *plVar11;
  ThreadPool *pTVar12;
  __thread_struct *this;
  long lVar13;
  ulong uVar14;
  uint uVar15;
  bool bVar16;
  long local_b8;
  mutex *local_b0;
  char local_a8;
  long alStack_a0 [4];
  long *local_80;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
                    /* try { // try from 008fe668 to 008fe67b has its CatchHandler @ 008fe9c4 */
  ppVar6 = (pthread_key_t *)std::__ndk1::__thread_local_data();
  __pointer = (void *)*param_1;
  *param_1 = 0;
  pthread_setspecific(*ppVar6,__pointer);
  pTVar12 = (ThreadPool *)param_1[1];
  if (*(int *)(pTVar12 + 0x20) != 0) {
    pTVar1 = pTVar12 + 0x30;
    bVar16 = true;
    do {
      while (*(int *)(pTVar12 + 0x20) == 2) {
                    /* try { // try from 008fe6c8 to 008fe6cb has its CatchHandler @ 008fea68 */
        sched_yield();
      }
      local_80 = (long *)0x0;
      local_a8 = '\x01';
      local_b0 = (mutex *)(pTVar12 + 0xa8);
                    /* try { // try from 008fe6dc to 008fe6e3 has its CatchHandler @ 008fe9dc */
      std::__ndk1::mutex::lock((mutex *)(pTVar12 + 0xa8));
      lVar13 = *(long *)(pTVar12 + 0x18);
      local_b8 = std::__ndk1::chrono::steady_clock::now();
      local_b8 = local_b8 + lVar13 * 1000000;
      do {
        if ((*(int *)(pTVar12 + 0x20) == 0) || (*(long *)(pTVar12 + 0xa0) != 0)) break;
                    /* try { // try from 008fe708 to 008fe717 has its CatchHandler @ 008fe9e4 */
        iVar5 = FUN_008fea6c(pTVar12 + 0xd0,&local_b0,&local_b8);
      } while (iVar5 != 1);
      plVar8 = local_80;
      if (*(int *)(pTVar12 + 0x20) == 0) {
LAB_008fe7b4:
        uVar15 = 1;
      }
      else if (*(long *)(pTVar12 + 0xa0) == 0) {
        if (*(ulong *)(pTVar12 + 8) < *(ulong *)(pTVar12 + 0x28)) {
          pVar7 = pthread_self();
                    /* try { // try from 008fe7ac to 008fe7b3 has its CatchHandler @ 008fe9d4 */
          cpr::ThreadPool::DelThread(pTVar12,pVar7);
          goto LAB_008fe7b4;
        }
        uVar15 = 2;
      }
      else {
        if (!bVar16) {
          do {
            cVar2 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(pTVar1,0x10);
            if (bVar4) {
              *(long *)pTVar1 = *(long *)pTVar1 + -1;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
        }
        lVar13 = *(long *)(*(long *)(pTVar12 + 0x80) + (*(ulong *)(pTVar12 + 0x98) / 0x55) * 8);
        uVar14 = *(ulong *)(pTVar12 + 0x98) % 0x55;
        bVar4 = alStack_a0 == local_80;
        local_80 = (long *)0x0;
        if (bVar4) {
          pcVar9 = *(code **)(*plVar8 + 0x20);
LAB_008fe7cc:
          (*pcVar9)();
        }
        else if (plVar8 != (long *)0x0) {
          pcVar9 = *(code **)(*plVar8 + 0x28);
          goto LAB_008fe7cc;
        }
        puVar10 = (undefined8 *)(lVar13 + uVar14 * 0x30 + 0x20);
        local_80 = (long *)*puVar10;
        if (local_80 == (long *)0x0) {
          local_80 = (long *)0x0;
        }
        else if ((long *)(lVar13 + uVar14 * 0x30) == local_80) {
                    /* try { // try from 008fe820 to 008fe82b has its CatchHandler @ 008fe9d0 */
          local_80 = alStack_a0;
          (**(code **)(*(long *)*puVar10 + 0x18))((long *)*puVar10,alStack_a0);
        }
        else {
          *puVar10 = 0;
        }
        plVar11 = (long *)(*(long *)(*(long *)(pTVar12 + 0x80) +
                                    (*(ulong *)(pTVar12 + 0x98) / 0x55) * 8) +
                          (*(ulong *)(pTVar12 + 0x98) % 0x55) * 0x30);
        plVar8 = (long *)plVar11[4];
        if (plVar11 == plVar8) {
          pcVar9 = *(code **)(*plVar8 + 0x20);
LAB_008fe878:
          (*pcVar9)();
        }
        else if (plVar8 != (long *)0x0) {
          pcVar9 = *(code **)(*plVar8 + 0x28);
          goto LAB_008fe878;
        }
        lVar13 = *(long *)(pTVar12 + 0x98);
        *(long *)(pTVar12 + 0xa0) = *(long *)(pTVar12 + 0xa0) + -1;
        *(ulong *)(pTVar12 + 0x98) = lVar13 + 1U;
        if (0xa9 < lVar13 + 1U) {
          operator_delete((void *)**(undefined8 **)(pTVar12 + 0x80));
          *(long *)(pTVar12 + 0x80) = *(long *)(pTVar12 + 0x80) + 8;
          *(long *)(pTVar12 + 0x98) = *(long *)(pTVar12 + 0x98) + -0x55;
        }
        uVar15 = 0;
      }
      if (local_a8 != '\0') {
        std::__ndk1::mutex::unlock(local_b0);
      }
      if (uVar15 == 0) {
        if (local_80 != (long *)0x0) {
                    /* try { // try from 008fe8e8 to 008fe8eb has its CatchHandler @ 008fe9d8 */
          (**(code **)(*local_80 + 0x30))();
          do {
            cVar2 = '\x01';
            bVar16 = (bool)ExclusiveMonitorPass(pTVar1,0x10);
            if (bVar16) {
              *(long *)pTVar1 = *(long *)pTVar1 + 1;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          uVar15 = 0;
          bVar16 = false;
          goto LAB_008fe904;
        }
        uVar15 = 0;
        if (alStack_a0 == (long *)0x0) goto LAB_008fe934;
LAB_008fe914:
        if (local_80 != (long *)0x0) {
          pcVar9 = *(code **)(*local_80 + 0x28);
          goto LAB_008fe93c;
        }
      }
      else {
LAB_008fe904:
        if (alStack_a0 != local_80) goto LAB_008fe914;
LAB_008fe934:
        pcVar9 = *(code **)(*local_80 + 0x20);
LAB_008fe93c:
        (*pcVar9)();
      }
    } while (((uVar15 | 2) == 2) && (*(int *)(pTVar12 + 0x20) != 0));
    if (param_1 == (undefined8 *)0x0) goto LAB_008fe98c;
  }
  this = (__thread_struct *)*param_1;
  *param_1 = 0;
  if (this != (__thread_struct *)0x0) {
    std::__ndk1::__thread_struct::~__thread_struct(this);
    operator_delete(this);
  }
  operator_delete(param_1);
LAB_008fe98c:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

