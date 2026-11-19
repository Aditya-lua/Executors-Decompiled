/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009876d0
 */

/* void* 
   std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,
   std::__ndk1::default_delete<std::__ndk1::__thread_struct> >, void
   (ix::DNSLookup::*)(std::__ndk1::weak_ptr<ix::DNSLookup>, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, int), ix::DNSLookup*,
   std::__ndk1::weak_ptr<ix::DNSLookup>, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, int> >(void*) */

void * std::__ndk1::
       __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::DNSLookup::*)(std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int),ix::DNSLookup*,std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int>>
                 (void *param_1)

{
  ulong *puVar1;
  long *plVar2;
  long lVar3;
  pthread_key_t *ppVar4;
  void *__pointer;
  code *pcVar5;
  __thread_struct *this;
  ulong local_70;
  undefined8 uStack_68;
  void *local_60;
  undefined8 local_50;
  __shared_weak_count *p_Stack_48;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
                    /* try { // try from 009876f4 to 009876f7 has its CatchHandler @ 00987820 */
  ppVar4 = (pthread_key_t *)__thread_local_data();
  __pointer = *(void **)param_1;
  *(undefined8 *)param_1 = 0;
                    /* try { // try from 00987704 to 00987707 has its CatchHandler @ 00987810 */
  pthread_setspecific(*ppVar4,__pointer);
  pcVar5 = *(code **)((long)param_1 + 8);
  puVar1 = (ulong *)((long)param_1 + 0x30);
  plVar2 = (long *)(*(long *)((long)param_1 + 0x18) + ((long)*(ulong *)((long)param_1 + 0x10) >> 1))
  ;
  if ((*(ulong *)((long)param_1 + 0x10) & 1) != 0) {
    pcVar5 = *(code **)(pcVar5 + *plVar2);
  }
  p_Stack_48 = *(__shared_weak_count **)((long)param_1 + 0x28);
  local_50 = *(undefined8 *)((long)param_1 + 0x20);
  *(undefined8 *)((long)param_1 + 0x20) = 0;
  *(undefined8 *)((long)param_1 + 0x28) = 0;
  local_60 = *(void **)((long)param_1 + 0x40);
  uStack_68 = *(undefined8 *)((long)param_1 + 0x38);
  local_70 = *puVar1;
  *(undefined8 *)((long)param_1 + 0x38) = 0;
  *(undefined8 *)((long)param_1 + 0x40) = 0;
  *puVar1 = 0;
                    /* try { // try from 00987750 to 0098775b has its CatchHandler @ 009877e4 */
  (*pcVar5)(plVar2,&local_50,&local_70,*(undefined4 *)((long)param_1 + 0x48));
  if ((local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  if (p_Stack_48 != (__shared_weak_count *)0x0) {
    __shared_weak_count::__release_weak(p_Stack_48);
  }
  if ((*(byte *)puVar1 & 1) != 0) {
    operator_delete(*(void **)((long)param_1 + 0x40));
  }
  if (*(__shared_weak_count **)((long)param_1 + 0x28) != (__shared_weak_count *)0x0) {
    __shared_weak_count::__release_weak(*(__shared_weak_count **)((long)param_1 + 0x28));
  }
  this = *(__thread_struct **)param_1;
  *(undefined8 *)param_1 = 0;
  if (this != (__thread_struct *)0x0) {
    __thread_struct::~__thread_struct(this);
    operator_delete(this);
  }
  operator_delete(param_1);
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (void *)0x0;
}

