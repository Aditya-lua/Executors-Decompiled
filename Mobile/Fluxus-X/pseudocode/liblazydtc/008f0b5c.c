/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0b5c
 */

/* WARNING: Removing unreachable block (ram,0x008f0f10) */
/* WARNING: Removing unreachable block (ram,0x008f0f14) */
/* WARNING: Removing unreachable block (ram,0x008f0f1c) */
/* WARNING: Removing unreachable block (ram,0x008f0f24) */
/* WARNING: Removing unreachable block (ram,0x008f0f28) */
/* cpr::Session::DownloadAsync(cpr::WriteCallback const&) */

void cpr::Session::DownloadAsync(WriteCallback *param_1)

{
  __shared_weak_count *p_Var1;
  ulong uVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  __shared_weak_count *p_Var6;
  long *plVar7;
  ThreadPool *this;
  __shared_weak_count *this_00;
  undefined8 *puVar8;
  future_error *pfVar9;
  undefined8 *in_x1;
  undefined8 *in_x8;
  undefined8 uVar10;
  code *pcVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  __shared_weak_count *p_Var16;
  undefined8 local_110;
  undefined8 uStack_108;
  long alStack_f0 [4];
  long *local_d0;
  undefined8 local_c0;
  __shared_weak_count *p_Stack_b8;
  undefined8 local_b0;
  long alStack_a0 [4];
  long *local_80;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  GetSharedPtrFromThis();
  uVar10 = *in_x1;
  plVar7 = (long *)in_x1[6];
  if (plVar7 == (long *)0x0) {
    local_d0 = (long *)0x0;
  }
  else if (in_x1 + 2 == plVar7) {
    local_d0 = alStack_f0;
    (**(code **)(*plVar7 + 0x18))();
  }
  else {
                    /* try { // try from 008f0bbc to 008f0be3 has its CatchHandler @ 008f1068 */
    local_d0 = (long *)(**(code **)(*plVar7 + 0x10))();
  }
                    /* try { // try from 008f0be4 to 008f0c2b has its CatchHandler @ 008f119c */
  this = (ThreadPool *)GlobalThreadPool::GetInstance();
  if (*(int *)(this + 0x20) == 0) {
    ThreadPool::Start(this,0);
  }
  if ((*(long *)(this + 0x30) == 0) && (*(ulong *)(this + 0x28) < *(ulong *)(this + 0x10))) {
    ThreadPool::CreateThread(this);
  }
  p_Stack_b8 = (__shared_weak_count *)uStack_108;
  local_c0 = local_110;
  local_b0 = uVar10;
  if (local_d0 == (long *)0x0) {
    local_80 = (long *)0x0;
  }
  else if (alStack_f0 == local_d0) {
    local_80 = alStack_a0;
    (**(code **)(*local_d0 + 0x18))();
  }
  else {
                    /* try { // try from 008f0c60 to 008f0c8b has its CatchHandler @ 008f1044 */
    local_80 = (long *)(**(code **)(*local_d0 + 0x10))();
  }
                    /* try { // try from 008f0c8c to 008f0c93 has its CatchHandler @ 008f112c */
  this_00 = operator_new(0x60);
  *(undefined8 *)(this_00 + 0x10) = 0;
  p_Var16 = this_00 + 8;
  *(long *)p_Var16 = 0;
  *(undefined ***)this_00 = &PTR____shared_ptr_emplace_00c4e7d8;
  *(undefined8 *)(this_00 + 0x40) = 0;
                    /* try { // try from 008f0cb8 to 008f0cbf has its CatchHandler @ 008f1114 */
  puVar8 = operator_new(0x70);
  p_Var6 = p_Stack_b8;
  uVar10 = local_c0;
  local_c0 = 0;
  p_Stack_b8 = (__shared_weak_count *)0x0;
  *puVar8 = &PTR_LAB_00c4e9e8;
  puVar8[2] = uVar10;
  puVar8[3] = p_Var6;
  puVar8[4] = local_b0;
  if (local_80 == (long *)0x0) {
    puVar8[10] = 0;
  }
  else if (alStack_a0 == local_80) {
    puVar8[10] = puVar8 + 6;
    (**(code **)(*local_80 + 0x18))();
  }
  else {
                    /* try { // try from 008f0d08 to 008f0d2f has its CatchHandler @ 008f0ffc */
    uVar10 = (**(code **)(*local_80 + 0x10))();
    puVar8[10] = uVar10;
  }
  *(undefined8 **)(this_00 + 0x40) = puVar8;
                    /* try { // try from 008f0d34 to 008f0d3b has its CatchHandler @ 008f10dc */
  puVar8 = operator_new(0x188);
  memset(puVar8 + 1,0,0x6c);
  *(undefined8 **)(this_00 + 0x50) = puVar8;
  *puVar8 = &PTR_LAB_00c4f018;
  if (alStack_a0 == local_80) {
    pcVar11 = *(code **)(*local_80 + 0x20);
LAB_008f0d90:
    (*pcVar11)();
  }
  else if (local_80 != (long *)0x0) {
    pcVar11 = *(code **)(*local_80 + 0x28);
    goto LAB_008f0d90;
  }
  p_Var6 = p_Stack_b8;
  if (p_Stack_b8 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Stack_b8 + 8;
    do {
      lVar13 = *(long *)p_Var1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = lVar13 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar13 == 0) {
      (**(code **)(*(long *)p_Stack_b8 + 0x10))(p_Stack_b8);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var6);
    }
  }
  if (*(__assoc_state **)(this_00 + 0x50) == (__assoc_state *)0x0) {
    pfVar9 = (future_error *)__cxa_allocate_exception(0x20);
    uVar10 = std::__ndk1::future_category();
                    /* try { // try from 008f0f80 to 008f0f8b has its CatchHandler @ 008f0fa8 */
    std::__ndk1::future_error::future_error(pfVar9,3,uVar10);
                    /* try { // try from 008f0f8c to 008f0fa3 has its CatchHandler @ 008f10c0 */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(pfVar9,&std::__ndk1::future_error::typeinfo,std::__ndk1::future_error::~future_error
               );
  }
                    /* try { // try from 008f0dd4 to 008f0ddb has its CatchHandler @ 008f10c0 */
  std::__ndk1::future<cpr::Response>::future
            ((future<cpr::Response> *)&local_c0,*(__assoc_state **)(this_00 + 0x50));
                    /* try { // try from 008f0de0 to 008f0de7 has its CatchHandler @ 008f108c */
  std::__ndk1::mutex::lock((mutex *)(this + 0xa8));
  do {
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(p_Var16,0x10);
    if (bVar4) {
      *(long *)p_Var16 = *(long *)p_Var16 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  lVar13 = *(long *)(this + 0x80);
  lVar14 = *(long *)(this + 0x88);
  lVar12 = *(long *)(this + 0xa0);
  uVar2 = 0;
  if (lVar14 - lVar13 != 0) {
    uVar2 = (lVar14 - lVar13 >> 3) * 0x55 - 1;
  }
  uVar15 = lVar12 + *(long *)(this + 0x98);
  if (uVar2 == uVar15) {
                    /* try { // try from 008f0e2c to 008f0e2f has its CatchHandler @ 008f0fb8 */
    std::__ndk1::
    deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::
    __add_back_capacity((deque<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
                         *)(this + 0x78));
    lVar12 = *(long *)(this + 0xa0);
    lVar13 = *(long *)(this + 0x80);
    lVar14 = *(long *)(this + 0x88);
    uVar15 = *(long *)(this + 0x98) + lVar12;
  }
  if (lVar14 == lVar13) {
    puVar8 = (undefined8 *)0x0;
  }
  else {
    puVar8 = (undefined8 *)(*(long *)(lVar13 + (uVar15 / 0x55) * 8) + (uVar15 % 0x55) * 0x30);
  }
  puVar8[1] = this_00 + 0x20;
  puVar8[2] = this_00;
  puVar8[4] = puVar8;
  *puVar8 = &PTR_LAB_00c4ea48;
  *(long *)(this + 0xa0) = lVar12 + 1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0xa8));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0xd0));
  uVar10 = local_c0;
  do {
    lVar13 = *(long *)p_Var16;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(p_Var16,0x10);
    if (bVar4) {
      *(long *)p_Var16 = lVar13 + -1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (lVar13 == 0) {
    (**(code **)(*(long *)this_00 + 0x10))(this_00);
    std::__ndk1::__shared_weak_count::__release_weak(this_00);
  }
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = uVar10;
  if (alStack_f0 == local_d0) {
    pcVar11 = *(code **)(*local_d0 + 0x20);
  }
  else {
    if (local_d0 == (long *)0x0) goto LAB_008f0f08;
    pcVar11 = *(code **)(*local_d0 + 0x28);
  }
  (*pcVar11)();
LAB_008f0f08:
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

