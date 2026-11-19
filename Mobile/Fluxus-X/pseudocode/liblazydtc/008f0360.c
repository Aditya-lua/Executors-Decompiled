/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0360
 */

/* cpr::Session::GetAsync() */

void cpr::Session::GetAsync(void)

{
  __shared_weak_count *p_Var1;
  ulong uVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  undefined8 *in_x0;
  __shared_weak_count *this;
  ThreadPool *this_00;
  __shared_weak_count *this_01;
  __assoc_state *p_Var6;
  undefined8 *in_x8;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  __shared_weak_count *p_Var13;
  __shared_weak_count *p_Var14;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if ((__shared_weak_count *)in_x0[1] != (__shared_weak_count *)0x0) {
    uVar12 = *in_x0;
    this = (__shared_weak_count *)
           std::__ndk1::__shared_weak_count::lock((__shared_weak_count *)in_x0[1]);
    if (this != (__shared_weak_count *)0x0) {
      p_Var1 = this + 8;
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar4) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
                    /* try { // try from 008f03c0 to 008f0407 has its CatchHandler @ 008f0710 */
      this_00 = (ThreadPool *)GlobalThreadPool::GetInstance();
      if (*(int *)(this_00 + 0x20) == 0) {
        ThreadPool::Start(this_00,0);
      }
      if ((*(long *)(this_00 + 0x30) == 0) &&
         (*(ulong *)(this_00 + 0x28) < *(ulong *)(this_00 + 0x10))) {
        ThreadPool::CreateThread(this_00);
      }
                    /* try { // try from 008f0408 to 008f040f has its CatchHandler @ 008f06f8 */
      this_01 = operator_new(0x60);
      *(undefined8 *)(this_01 + 0x10) = 0;
      p_Var13 = this_01 + 8;
      *(long *)p_Var13 = 0;
      *(undefined ***)this_01 = &PTR____shared_ptr_emplace_00c4e7d8;
      p_Var14 = this_01 + 0x20;
      *(undefined ***)p_Var14 = &PTR_LAB_00c4e830;
      *(__shared_weak_count **)(this_01 + 0x40) = p_Var14;
      *(undefined8 *)(this_01 + 0x28) = uVar12;
      *(__shared_weak_count **)(this_01 + 0x30) = this;
                    /* try { // try from 008f044c to 008f0453 has its CatchHandler @ 008f06b4 */
      p_Var6 = operator_new(0x188);
      memset(p_Var6 + 8,0,0x6c);
      *(__assoc_state **)(this_01 + 0x50) = p_Var6;
      *(undefined ***)p_Var6 = &PTR_LAB_00c4f018;
                    /* try { // try from 008f047c to 008f0487 has its CatchHandler @ 008f0684 */
      std::__ndk1::future<cpr::Response>::future((future<cpr::Response> *)&local_70,p_Var6);
                    /* try { // try from 008f048c to 008f0493 has its CatchHandler @ 008f0650 */
      std::__ndk1::mutex::lock((mutex *)(this_00 + 0xa8));
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(p_Var13,0x10);
        if (bVar4) {
          *(long *)p_Var13 = *(long *)p_Var13 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      lVar8 = *(long *)(this_00 + 0x80);
      lVar10 = *(long *)(this_00 + 0x88);
      lVar7 = *(long *)(this_00 + 0xa0);
      uVar2 = 0;
      if (lVar10 - lVar8 != 0) {
        uVar2 = (lVar10 - lVar8 >> 3) * 0x55 - 1;
      }
      uVar11 = lVar7 + *(long *)(this_00 + 0x98);
      if (uVar2 == uVar11) {
                    /* try { // try from 008f04d4 to 008f04d7 has its CatchHandler @ 008f060c */
        std::__ndk1::
        deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::
        __add_back_capacity((deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
                             *)(this_00 + 0x78));
        lVar7 = *(long *)(this_00 + 0xa0);
        lVar8 = *(long *)(this_00 + 0x80);
        lVar10 = *(long *)(this_00 + 0x88);
        uVar11 = *(long *)(this_00 + 0x98) + lVar7;
      }
      if (lVar10 == lVar8) {
        puVar9 = (undefined8 *)0x0;
      }
      else {
        puVar9 = (undefined8 *)(*(long *)(lVar8 + (uVar11 / 0x55) * 8) + (uVar11 % 0x55) * 0x30);
      }
      puVar9[1] = p_Var14;
      puVar9[2] = this_01;
      puVar9[4] = puVar9;
      *puVar9 = &PTR_LAB_00c4e888;
      *(long *)(this_00 + 0xa0) = lVar7 + 1;
      std::__ndk1::mutex::unlock((mutex *)(this_00 + 0xa8));
      std::__ndk1::condition_variable::notify_one((condition_variable *)(this_00 + 0xd0));
      do {
        lVar8 = *(long *)p_Var13;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(p_Var13,0x10);
        if (bVar4) {
          *(long *)p_Var13 = lVar8 + -1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (lVar8 == 0) {
        (**(code **)(*(long *)this_01 + 0x10))(this_01);
        std::__ndk1::__shared_weak_count::__release_weak(this_01);
      }
      in_x8[1] = 0;
      in_x8[2] = 0;
      *in_x8 = local_70;
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
        (**(code **)(*(long *)this + 0x10))(this);
        std::__ndk1::__shared_weak_count::__release_weak(this);
      }
      if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
  puVar9 = (undefined8 *)__cxa_allocate_exception(8);
  *puVar9 = &PTR__bad_weak_ptr_00cac890;
                    /* WARNING: Subroutine does not return */
  __cxa_throw(puVar9,&std::__ndk1::bad_weak_ptr::typeinfo,std::__ndk1::bad_weak_ptr::~bad_weak_ptr);
}

