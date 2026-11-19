/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00971d2c
 */

/* ix::HttpClient::run() */

void __thiscall ix::HttpClient::run(HttpClient *this)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  HttpClient HVar3;
  char cVar4;
  bool bVar5;
  long lVar6;
  long *plVar7;
  long *plVar8;
  undefined8 *puVar9;
  code *pcVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  __shared_weak_count *p_Var14;
  byte bVar15;
  long local_130;
  __shared_weak_count *local_128;
  mutex *local_120;
  char local_118;
  long local_110;
  __shared_weak_count *local_108;
  long alStack_100 [4];
  long *local_e0;
  function afStack_d0 [32];
  function *local_b0;
  function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> afStack_a0 [32];
  function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *local_80;
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  do {
    local_b0 = (function *)0x0;
    local_118 = '\x01';
    local_120 = (mutex *)(this + 0x38);
                    /* try { // try from 00971edc to 00971ee3 has its CatchHandler @ 00972274 */
    std::__ndk1::mutex::lock((mutex *)(this + 0x38));
    HVar3 = this[0x90];
    while ((((byte)HVar3 & 1) == 0 && (*(long *)(this + 0x30) == 0))) {
      std::__ndk1::condition_variable::wait
                ((condition_variable *)(this + 0x60),(unique_lock *)&local_120);
      HVar3 = this[0x90];
    }
    if (((byte)this[0x90] & 1) == 0) {
      lVar12 = *(long *)(*(long *)(this + 0x10) +
                        (*(ulong *)(this + 0x28) >> 3 & 0x1ffffffffffffff8));
      uVar13 = *(ulong *)(this + 0x28) & 0x3f;
      plVar7 = (long *)(lVar12 + uVar13 * 0x40);
      local_110 = *plVar7;
      local_108 = (__shared_weak_count *)plVar7[1];
      if (local_108 != (__shared_weak_count *)0x0) {
        p_Var14 = local_108 + 8;
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var14,0x10);
          if (bVar5) {
            *(long *)p_Var14 = *(long *)p_Var14 + 1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      plVar8 = (long *)plVar7[6];
      if (plVar8 == (long *)0x0) {
        local_e0 = (long *)0x0;
      }
      else if ((long *)(lVar12 + uVar13 * 0x40 + 0x10) == plVar8) {
        plVar7 = (long *)plVar7[6];
        local_e0 = alStack_100;
                    /* try { // try from 00971db8 to 00971dbf has its CatchHandler @ 009721ac */
        (**(code **)(*plVar7 + 0x18))(plVar7,alStack_100);
      }
      else {
                    /* try { // try from 00971f7c to 00971f7f has its CatchHandler @ 009721ac */
        local_e0 = (long *)(**(code **)(*plVar8 + 0x10))();
      }
                    /* try { // try from 00971dc0 to 00971dc7 has its CatchHandler @ 009721f8 */
      std::__ndk1::
      deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
      ::pop_front((deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
                   *)(this + 8));
      p_Var14 = local_108;
      lVar12 = local_110;
      if (local_108 != (__shared_weak_count *)0x0) {
        p_Var1 = local_108 + 8;
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar5) {
            *(long *)p_Var1 = *(long *)p_Var1 + 1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      if (local_e0 == (long *)0x0) {
        local_80 = (function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *)0x0;
      }
      else if (alStack_100 == local_e0) {
        local_80 = afStack_a0;
                    /* try { // try from 00971e20 to 00971e27 has its CatchHandler @ 0097213c */
        (**(code **)(*local_e0 + 0x18))(local_e0,afStack_a0);
      }
      else {
                    /* try { // try from 00971dfc to 00971dff has its CatchHandler @ 009721a4 */
        local_80 = (function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *)
                   (**(code **)(*local_e0 + 0x10))();
      }
      std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>::swap
                (afStack_a0,afStack_d0);
      if (afStack_a0 == local_80) {
        pcVar10 = *(code **)(*(long *)local_80 + 0x20);
LAB_00971e5c:
        (*pcVar10)();
      }
      else if (local_80 != (function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *)0x0) {
        pcVar10 = *(code **)(*(long *)local_80 + 0x28);
        goto LAB_00971e5c;
      }
      if (alStack_100 == local_e0) {
        pcVar10 = *(code **)(*local_e0 + 0x20);
LAB_00971e84:
        (*pcVar10)();
      }
      else if (local_e0 != (long *)0x0) {
        pcVar10 = *(code **)(*local_e0 + 0x28);
        goto LAB_00971e84;
      }
      p_Var1 = local_108;
      if (local_108 != (__shared_weak_count *)0x0) {
        p_Var2 = local_108 + 8;
        do {
          lVar11 = *(long *)p_Var2;
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
          if (bVar5) {
            *(long *)p_Var2 = lVar11 + -1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
        if (lVar11 == 0) {
          (**(code **)(*(long *)local_108 + 0x10))(local_108);
          std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
        }
      }
      bVar5 = false;
    }
    else {
      p_Var14 = (__shared_weak_count *)0x0;
      lVar12 = 0;
      bVar5 = true;
    }
    if (local_118 != '\0') {
      std::__ndk1::mutex::unlock(local_120);
    }
    if ((bVar5) || (((byte)this[0x90] & 1) != 0)) {
      bVar15 = 1;
    }
    else {
      if (p_Var14 != (__shared_weak_count *)0x0) {
        p_Var1 = p_Var14 + 8;
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar5) {
            *(long *)p_Var1 = *(long *)p_Var1 + 1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
                    /* try { // try from 00971fd8 to 00971fef has its CatchHandler @ 00972164 */
      local_130 = lVar12;
      local_128 = p_Var14;
      request(&local_110,this,lVar12,lVar12 + 0x18,lVar12 + 0x48,&local_130,0);
      p_Var1 = local_128;
      if (local_128 != (__shared_weak_count *)0x0) {
        p_Var2 = local_128 + 8;
        do {
          lVar12 = *(long *)p_Var2;
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
          if (bVar5) {
            *(long *)p_Var2 = lVar12 + -1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
        if (lVar12 == 0) {
          (**(code **)(*(long *)local_128 + 0x10))(local_128);
          std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
        }
      }
      if (local_b0 == (function *)0x0) {
        puVar9 = (undefined8 *)__cxa_allocate_exception(8);
        *puVar9 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00972120 to 00972133 has its CatchHandler @ 00972138 */
                    /* WARNING: Subroutine does not return */
        __cxa_throw(puVar9,&std::__ndk1::bad_function_call::typeinfo,
                    std::bad_exception::~bad_exception);
      }
                    /* try { // try from 00972038 to 0097203f has its CatchHandler @ 00972140 */
      (**(code **)(*(long *)local_b0 + 0x30))(local_b0,&local_110);
      p_Var1 = local_108;
      bVar15 = (byte)this[0x90] & 1;
      if (local_108 != (__shared_weak_count *)0x0) {
        p_Var2 = local_108 + 8;
        do {
          lVar12 = *(long *)p_Var2;
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
          if (bVar5) {
            *(long *)p_Var2 = lVar12 + -1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
        if (lVar12 == 0) {
          (**(code **)(*(long *)local_108 + 0x10))(local_108);
          std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
        }
      }
    }
    if (afStack_d0 == local_b0) {
      pcVar10 = *(code **)(*(long *)local_b0 + 0x20);
LAB_009720b0:
      (*pcVar10)();
    }
    else if (local_b0 != (function *)0x0) {
      pcVar10 = *(code **)(*(long *)local_b0 + 0x28);
      goto LAB_009720b0;
    }
    if (p_Var14 != (__shared_weak_count *)0x0) {
      p_Var1 = p_Var14 + 8;
      do {
        lVar12 = *(long *)p_Var1;
        cVar4 = '\x01';
        bVar5 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar5) {
          *(long *)p_Var1 = lVar12 + -1;
          cVar4 = ExclusiveMonitorsStatus();
        }
      } while (cVar4 != '\0');
      if (lVar12 == 0) {
        (**(code **)(*(long *)p_Var14 + 0x10))(p_Var14);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var14);
      }
    }
    if (bVar15 != 0) {
      if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  } while( true );
}

