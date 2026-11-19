/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009728a4
 */

/* ix::HttpClient::performRequest(std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> const&) */

void __thiscall ix::HttpClient::performRequest(HttpClient *this,undefined8 *param_2,long *param_3)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long *plVar6;
  undefined8 uVar7;
  code *pcVar8;
  long lVar9;
  undefined8 local_90;
  __shared_weak_count *local_88;
  long alStack_80 [4];
  long *local_60;
  long local_48;
  
  lVar5 = tpidr_el0;
  local_48 = *(long *)(lVar5 + 0x28);
  if (*this == (HttpClient)0x0) {
    uVar7 = 0;
    goto LAB_009729e4;
  }
  std::__ndk1::mutex::lock((mutex *)(this + 0x38));
  local_90 = *param_2;
  local_88 = (__shared_weak_count *)param_2[1];
  if (local_88 != (__shared_weak_count *)0x0) {
    p_Var1 = local_88 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
  plVar6 = (long *)param_3[4];
  if (plVar6 == (long *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_3 == plVar6) {
    local_60 = alStack_80;
    (**(code **)(*plVar6 + 0x18))();
  }
  else {
                    /* try { // try from 00972928 to 0097295b has its CatchHandler @ 00972a10 */
    local_60 = (long *)(**(code **)(*plVar6 + 0x10))();
  }
                    /* try { // try from 00972960 to 0097296b has its CatchHandler @ 00972a34 */
  std::__ndk1::
  deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
  ::push_back((deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
               *)(this + 8),(pair *)&local_90);
  if (alStack_80 == local_60) {
    pcVar8 = *(code **)(*local_60 + 0x20);
LAB_00972994:
    (*pcVar8)();
  }
  else if (local_60 != (long *)0x0) {
    pcVar8 = *(code **)(*local_60 + 0x28);
    goto LAB_00972994;
  }
  p_Var1 = local_88;
  if (local_88 != (__shared_weak_count *)0x0) {
    p_Var2 = local_88 + 8;
    do {
      lVar9 = *(long *)p_Var2;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar4) {
        *(long *)p_Var2 = lVar9 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar9 == 0) {
      (**(code **)(*(long *)local_88 + 0x10))(local_88);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x38));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x60));
  uVar7 = 1;
LAB_009729e4:
  if (*(long *)(lVar5 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

