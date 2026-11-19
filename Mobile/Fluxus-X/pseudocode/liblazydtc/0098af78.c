/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098af78
 */

/* void* 
   std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,
   std::__ndk1::default_delete<std::__ndk1::__thread_struct> >, void
   (ix::SocketServer::*)(std::__ndk1::unique_ptr<ix::Socket, std::__ndk1::default_delete<ix::Socket>
   >, std::__ndk1::shared_ptr<ix::ConnectionState>), ix::SocketServer*,
   std::__ndk1::unique_ptr<ix::Socket, std::__ndk1::default_delete<ix::Socket> >,
   std::__ndk1::shared_ptr<ix::ConnectionState> > >(void*) */

void * std::__ndk1::
       __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::SocketServer::*)(std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>),ix::SocketServer*,std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>>>
                 (void *param_1)

{
  __shared_weak_count *p_Var1;
  char cVar2;
  bool bVar3;
  long lVar4;
  pthread_key_t *ppVar5;
  long *plVar6;
  void *__pointer;
  code *pcVar7;
  long lVar8;
  __shared_weak_count *p_Var9;
  __thread_struct *this;
  undefined8 local_50;
  __shared_weak_count *p_Stack_48;
  long *local_40;
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
                    /* try { // try from 0098af9c to 0098af9f has its CatchHandler @ 0098b150 */
  ppVar5 = (pthread_key_t *)__thread_local_data();
  __pointer = *(void **)param_1;
  *(undefined8 *)param_1 = 0;
                    /* try { // try from 0098afac to 0098afaf has its CatchHandler @ 0098b140 */
  pthread_setspecific(*ppVar5,__pointer);
  pcVar7 = *(code **)((long)param_1 + 8);
  plVar6 = (long *)(*(long *)((long)param_1 + 0x18) + ((long)*(ulong *)((long)param_1 + 0x10) >> 1))
  ;
  if ((*(ulong *)((long)param_1 + 0x10) & 1) != 0) {
    pcVar7 = *(code **)(pcVar7 + *plVar6);
  }
  local_40 = *(long **)((long)param_1 + 0x20);
  *(undefined8 *)((long)param_1 + 0x20) = 0;
  p_Stack_48 = *(__shared_weak_count **)((long)param_1 + 0x30);
  local_50 = *(undefined8 *)((long)param_1 + 0x28);
  *(undefined8 *)((long)param_1 + 0x28) = 0;
  *(undefined8 *)((long)param_1 + 0x30) = 0;
                    /* try { // try from 0098afe4 to 0098afef has its CatchHandler @ 0098b0e0 */
  (*pcVar7)(plVar6,&local_40,&local_50);
  p_Var9 = p_Stack_48;
  if (p_Stack_48 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Stack_48 + 8;
    do {
      lVar8 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar8 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)p_Stack_48 + 0x10))(p_Stack_48);
      __shared_weak_count::__release_weak(p_Var9);
    }
  }
  plVar6 = local_40;
  local_40 = (long *)0x0;
  if (plVar6 != (long *)0x0) {
    (**(code **)(*plVar6 + 8))();
  }
  p_Var9 = *(__shared_weak_count **)((long)param_1 + 0x30);
  if (p_Var9 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Var9 + 8;
    do {
      lVar8 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar8 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)p_Var9 + 0x10))(p_Var9);
      __shared_weak_count::__release_weak(p_Var9);
    }
  }
  plVar6 = *(long **)((long)param_1 + 0x20);
  *(undefined8 *)((long)param_1 + 0x20) = 0;
  if (plVar6 != (long *)0x0) {
    (**(code **)(*plVar6 + 8))();
  }
  this = *(__thread_struct **)param_1;
  *(undefined8 *)param_1 = 0;
  if (this != (__thread_struct *)0x0) {
    __thread_struct::~__thread_struct(this);
    operator_delete(this);
  }
  operator_delete(param_1);
  if (*(long *)(lVar4 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (void *)0x0;
}

