/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987e10
 */

/* ix::SocketServer::~SocketServer() */

void __thiscall ix::SocketServer::~SocketServer(SocketServer *this)

{
  __shared_weak_count *p_Var1;
  SocketServer SVar2;
  char cVar3;
  bool bVar4;
  long *plVar5;
  SocketServer *pSVar6;
  code *pcVar7;
  long lVar8;
  long lVar9;
  __shared_weak_count *this_00;
  SocketServer *pSVar10;
  
  *(undefined ***)this = &PTR__SocketServer_00c52040;
                    /* try { // try from 00987e38 to 00987e3b has its CatchHandler @ 00987ff0 */
  stop(this);
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x210));
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(this + 0x1e0));
  plVar5 = *(long **)(this + 0x1d8);
  *(undefined8 *)(this + 0x1d8) = 0;
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 8))();
  }
  if (((byte)this[0x1b8] & 1) == 0) {
    if (((byte)this[0x198] & 1) != 0) goto LAB_00987ec4;
LAB_00987e74:
    if (((byte)this[0x180] & 1) != 0) goto LAB_00987ed4;
LAB_00987e7c:
    if (((byte)this[0x168] & 1) != 0) goto LAB_00987ee4;
LAB_00987e84:
    SVar2 = this[0x150];
  }
  else {
    operator_delete(*(void **)(this + 0x1c8));
    if (((byte)this[0x198] & 1) == 0) goto LAB_00987e74;
LAB_00987ec4:
    operator_delete(*(void **)(this + 0x1a8));
    if (((byte)this[0x180] & 1) == 0) goto LAB_00987e7c;
LAB_00987ed4:
    operator_delete(*(void **)(this + 400));
    if (((byte)this[0x168] & 1) == 0) goto LAB_00987e84;
LAB_00987ee4:
    operator_delete(*(void **)(this + 0x178));
    SVar2 = this[0x150];
  }
  if (((byte)SVar2 & 1) != 0) {
    operator_delete(*(void **)(this + 0x160));
  }
  pSVar6 = *(SocketServer **)(this + 0x140);
  if (this + 0x120 == pSVar6) {
    pcVar7 = *(code **)(*(long *)pSVar6 + 0x20);
  }
  else {
    if (pSVar6 == (SocketServer *)0x0) goto LAB_00987f04;
    pcVar7 = *(code **)(*(long *)pSVar6 + 0x28);
  }
  (*pcVar7)();
LAB_00987f04:
  std::__ndk1::mutex::~mutex((mutex *)(this + 0xf8));
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(this + 200));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0xa0));
  if (*(long *)(this + 0x98) != 0) {
    lVar8 = *(long *)(this + 0x88);
    pSVar6 = *(SocketServer **)(this + 0x90);
    lVar9 = *(long *)pSVar6;
    *(undefined8 *)(lVar9 + 8) = *(undefined8 *)(lVar8 + 8);
    **(long **)(lVar8 + 8) = lVar9;
    *(undefined8 *)(this + 0x98) = 0;
    while (pSVar6 != this + 0x88) {
      pSVar10 = *(SocketServer **)(pSVar6 + 8);
      std::__ndk1::thread::~thread((thread *)(pSVar6 + 0x20));
      this_00 = *(__shared_weak_count **)(pSVar6 + 0x18);
      if (this_00 != (__shared_weak_count *)0x0) {
        p_Var1 = this_00 + 8;
        do {
          lVar8 = *(long *)p_Var1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar4) {
            *(long *)p_Var1 = lVar8 + -1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (lVar8 == 0) {
          (**(code **)(*(long *)this_00 + 0x10))(this_00);
          std::__ndk1::__shared_weak_count::__release_weak(this_00);
        }
      }
      operator_delete(pSVar6);
      pSVar6 = pSVar10;
    }
  }
  std::__ndk1::thread::~thread((thread *)(this + 0x80));
  std::__ndk1::thread::~thread((thread *)(this + 0x70));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x44));
  if (((byte)this[0x10] & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x20));
  return;
}

