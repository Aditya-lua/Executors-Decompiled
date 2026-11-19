/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f1210
 */

/* WARNING: Removing unreachable block (ram,0x008f1434) */
/* WARNING: Removing unreachable block (ram,0x008f1438) */
/* WARNING: Removing unreachable block (ram,0x008f1440) */
/* WARNING: Removing unreachable block (ram,0x008f1448) */
/* WARNING: Removing unreachable block (ram,0x008f144c) */
/* cpr::Session::DownloadAsync(std::__ndk1::basic_ofstream<char, std::__ndk1::char_traits<char> >&)
    */

void cpr::Session::DownloadAsync(basic_ofstream *param_1)

{
  ulong uVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  ThreadPool *this;
  __shared_weak_count *this_00;
  undefined8 *puVar5;
  __assoc_state *p_Var6;
  undefined8 in_x1;
  undefined8 *in_x8;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  __shared_weak_count *p_Var11;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  GetSharedPtrFromThis();
                    /* try { // try from 008f1250 to 008f1297 has its CatchHandler @ 008f1638 */
  this = (ThreadPool *)GlobalThreadPool::GetInstance();
  if (*(int *)(this + 0x20) == 0) {
    ThreadPool::Start(this,0);
  }
  if ((*(long *)(this + 0x30) == 0) && (*(ulong *)(this + 0x28) < *(ulong *)(this + 0x10))) {
    ThreadPool::CreateThread(this);
  }
                    /* try { // try from 008f12a4 to 008f12ab has its CatchHandler @ 008f15f4 */
  this_00 = operator_new(0x60);
  *(undefined8 *)(this_00 + 0x10) = 0;
  p_Var11 = this_00 + 8;
  *(long *)p_Var11 = 0;
  *(undefined ***)this_00 = &PTR____shared_ptr_emplace_00c4e7d8;
  *(undefined8 *)(this_00 + 0x40) = 0;
                    /* try { // try from 008f12d0 to 008f12d7 has its CatchHandler @ 008f15d8 */
  puVar5 = operator_new(0x28);
  puVar5[2] = local_80;
  puVar5[3] = in_x1;
  *puVar5 = &PTR_LAB_00c4eac8;
  puVar5[1] = local_88;
  *(undefined8 **)(this_00 + 0x40) = puVar5;
                    /* try { // try from 008f12f4 to 008f12fb has its CatchHandler @ 008f1540 */
  p_Var6 = operator_new(0x188);
  memset(p_Var6 + 8,0,0x6c);
  *(__assoc_state **)(this_00 + 0x50) = p_Var6;
  *(undefined ***)p_Var6 = &PTR_LAB_00c4f018;
                    /* try { // try from 008f1324 to 008f132f has its CatchHandler @ 008f1510 */
  std::__ndk1::future<cpr::Response>::future((future<cpr::Response> *)&local_70,p_Var6);
                    /* try { // try from 008f1334 to 008f133b has its CatchHandler @ 008f14dc */
  std::__ndk1::mutex::lock((mutex *)(this + 0xa8));
  do {
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var11,0x10);
    if (bVar3) {
      *(long *)p_Var11 = *(long *)p_Var11 + 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  lVar8 = *(long *)(this + 0x80);
  lVar9 = *(long *)(this + 0x88);
  lVar7 = *(long *)(this + 0xa0);
  uVar1 = 0;
  if (lVar9 - lVar8 != 0) {
    uVar1 = (lVar9 - lVar8 >> 3) * 0x55 - 1;
  }
  uVar10 = lVar7 + *(long *)(this + 0x98);
  if (uVar1 == uVar10) {
                    /* try { // try from 008f1380 to 008f1383 has its CatchHandler @ 008f1498 */
    std::__ndk1::
    deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::
    __add_back_capacity((deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
                         *)(this + 0x78));
    lVar7 = *(long *)(this + 0xa0);
    lVar8 = *(long *)(this + 0x80);
    lVar9 = *(long *)(this + 0x88);
    uVar10 = *(long *)(this + 0x98) + lVar7;
  }
  if (lVar9 == lVar8) {
    puVar5 = (undefined8 *)0x0;
  }
  else {
    puVar5 = (undefined8 *)(*(long *)(lVar8 + (uVar10 / 0x55) * 8) + (uVar10 % 0x55) * 0x30);
  }
  puVar5[1] = this_00 + 0x20;
  puVar5[2] = this_00;
  puVar5[4] = puVar5;
  *puVar5 = &PTR_LAB_00c4eb28;
  *(long *)(this + 0xa0) = lVar7 + 1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0xa8));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0xd0));
  do {
    lVar8 = *(long *)p_Var11;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(p_Var11,0x10);
    if (bVar3) {
      *(long *)p_Var11 = lVar8 + -1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (lVar8 == 0) {
    (**(code **)(*(long *)this_00 + 0x10))(this_00);
    std::__ndk1::__shared_weak_count::__release_weak(this_00);
  }
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = local_70;
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

