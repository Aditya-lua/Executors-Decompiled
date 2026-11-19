/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00979efc
 */

/* std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> > > >::pop_front()
    */

void __thiscall
std::__ndk1::
deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
::pop_front(deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
            *this)

{
  __shared_weak_count *p_Var1;
  char cVar2;
  bool bVar3;
  long *plVar4;
  code *pcVar5;
  long lVar6;
  long lVar7;
  __shared_weak_count *this_00;
  ulong uVar8;
  
  lVar7 = *(long *)(*(long *)(this + 8) + (*(ulong *)(this + 0x20) >> 3 & 0x1ffffffffffffff8));
  uVar8 = *(ulong *)(this + 0x20) & 0x3f;
  lVar6 = lVar7 + uVar8 * 0x40;
  plVar4 = *(long **)(lVar6 + 0x30);
  if ((long *)(lVar6 + 0x10) == plVar4) {
    pcVar5 = *(code **)(*plVar4 + 0x20);
  }
  else {
    if (plVar4 == (long *)0x0) goto LAB_00979f58;
    pcVar5 = *(code **)(*plVar4 + 0x28);
  }
  (*pcVar5)();
LAB_00979f58:
  this_00 = *(__shared_weak_count **)(lVar7 + uVar8 * 0x40 + 8);
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      lVar6 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar6 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      __shared_weak_count::__release_weak(this_00);
    }
  }
  lVar6 = *(long *)(this + 0x20);
  *(long *)(this + 0x28) = *(long *)(this + 0x28) + -1;
  *(ulong *)(this + 0x20) = lVar6 + 1U;
  if (0x7f < lVar6 + 1U) {
    operator_delete((void *)**(undefined8 **)(this + 8));
    *(long *)(this + 8) = *(long *)(this + 8) + 8;
    *(long *)(this + 0x20) = *(long *)(this + 0x20) + -0x40;
  }
  return;
}

