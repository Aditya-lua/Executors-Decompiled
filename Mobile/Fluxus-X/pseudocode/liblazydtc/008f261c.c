/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f261c
 */

/* WARNING: Removing unreachable block (ram,0x008f2820) */
/* WARNING: Removing unreachable block (ram,0x008f2824) */
/* WARNING: Removing unreachable block (ram,0x008f282c) */
/* WARNING: Removing unreachable block (ram,0x008f2834) */
/* WARNING: Removing unreachable block (ram,0x008f2838) */
/* cpr::Session::PutAsync() */

void __thiscall cpr::Session::PutAsync(Session *this)

{
  ulong uVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  ThreadPool *this_00;
  __shared_weak_count *this_01;
  __assoc_state *p_Var5;
  undefined8 *in_x8;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  __shared_weak_count *p_Var11;
  __shared_weak_count *p_Var12;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 local_60;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  GetSharedPtrFromThis();
                    /* try { // try from 008f2650 to 008f2697 has its CatchHandler @ 008f29c0 */
  this_00 = (ThreadPool *)GlobalThreadPool::GetInstance();
  if (*(int *)(this_00 + 0x20) == 0) {
    ThreadPool::Start(this_00,0);
  }
  if ((*(long *)(this_00 + 0x30) == 0) && (*(ulong *)(this_00 + 0x28) < *(ulong *)(this_00 + 0x10)))
  {
    ThreadPool::CreateThread(this_00);
  }
                    /* try { // try from 008f26a0 to 008f26a7 has its CatchHandler @ 008f2988 */
  this_01 = operator_new(0x60);
  *(undefined8 *)(this_01 + 0x10) = 0;
  p_Var11 = this_01 + 8;
  *(long *)p_Var11 = 0;
  *(undefined ***)this_01 = &PTR____shared_ptr_emplace_00c4e7d8;
  p_Var12 = this_01 + 0x20;
  *(undefined ***)p_Var12 = &PTR_LAB_00c4ef28;
  *(__shared_weak_count **)(this_01 + 0x40) = p_Var12;
  *(undefined8 *)(this_01 + 0x28) = local_70;
  *(undefined8 *)(this_01 + 0x30) = local_68;
                    /* try { // try from 008f26e4 to 008f26eb has its CatchHandler @ 008f2934 */
  p_Var5 = operator_new(0x188);
  memset(p_Var5 + 8,0,0x6c);
  *(__assoc_state **)(this_01 + 0x50) = p_Var5;
  *(undefined ***)p_Var5 = &PTR_LAB_00c4f018;
                    /* try { // try from 008f2714 to 008f271f has its CatchHandler @ 008f28f8 */
  std::__ndk1::future<cpr::Response>::future((future<cpr::Response> *)&local_60,p_Var5);
                    /* try { // try from 008f2724 to 008f272b has its CatchHandler @ 008f28c4 */
  std::__ndk1::mutex::lock((mutex *)(this_00 + 0xa8));
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var11,0x10);
    if (bVar3) {
      *(long *)p_Var11 = *(long *)p_Var11 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  lVar7 = *(long *)(this_00 + 0x80);
  lVar9 = *(long *)(this_00 + 0x88);
  lVar6 = *(long *)(this_00 + 0xa0);
  uVar1 = 0;
  if (lVar9 - lVar7 != 0) {
    uVar1 = (lVar9 - lVar7 >> 3) * 0x55 - 1;
  }
  uVar10 = lVar6 + *(long *)(this_00 + 0x98);
  if (uVar1 == uVar10) {
                    /* try { // try from 008f276c to 008f276f has its CatchHandler @ 008f2880 */
    std::__ndk1::
    deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::
    __add_back_capacity((deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
                         *)(this_00 + 0x78));
    lVar6 = *(long *)(this_00 + 0xa0);
    lVar7 = *(long *)(this_00 + 0x80);
    lVar9 = *(long *)(this_00 + 0x88);
    uVar10 = *(long *)(this_00 + 0x98) + lVar6;
  }
  if (lVar9 == lVar7) {
    puVar8 = (undefined8 *)0x0;
  }
  else {
    puVar8 = (undefined8 *)(*(long *)(lVar7 + (uVar10 / 0x55) * 8) + (uVar10 % 0x55) * 0x30);
  }
  puVar8[1] = p_Var12;
  puVar8[2] = this_01;
  puVar8[4] = puVar8;
  *puVar8 = &PTR_LAB_00c4ef88;
  *(long *)(this_00 + 0xa0) = lVar6 + 1;
  std::__ndk1::mutex::unlock((mutex *)(this_00 + 0xa8));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this_00 + 0xd0));
  do {
    lVar7 = *(long *)p_Var11;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var11,0x10);
    if (bVar3) {
      *(long *)p_Var11 = lVar7 + -1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (lVar7 == 0) {
    (**(code **)(*(long *)this_01 + 0x10))(this_01);
    std::__ndk1::__shared_weak_count::__release_weak(this_01);
  }
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = local_60;
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

