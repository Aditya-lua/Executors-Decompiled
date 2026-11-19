/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ece58
 */

/* cpr::Session::Complete(CURLcode) */

void cpr::Session::Complete(Response *param_1,long param_2,int param_3)

{
  char *__s;
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  size_t __n;
  long lVar6;
  void *__dest;
  ulong uVar7;
  undefined4 local_c8 [2];
  ulong local_c0;
  size_t sStack_b8;
  void *local_b0;
  undefined8 local_a8;
  __shared_weak_count *local_a0;
  ulong local_98;
  size_t sStack_90;
  void *local_88;
  undefined1 auStack_80 [8];
  __vector_base<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>> a_Stack_78 [24];
  curl_slist *local_60;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  local_60 = (curl_slist *)0x0;
  curl_easy_getinfo(**(undefined8 **)(param_2 + 0x18),&DAT_0040001c,&local_60);
  util::parseCookies(local_60);
                    /* try { // try from 008eceb8 to 008ecebb has its CatchHandler @ 008ed0bc */
  curl_slist_free_all(local_60);
  *(undefined1 *)(param_2 + 0x10) = 0;
  local_98 = 0;
  sStack_90 = 0;
  local_88 = (void *)0x0;
  __s = (char *)(*(long *)(param_2 + 0x18) + 0x20);
  __n = strlen(__s);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 008ed03c to 008ed043 has its CatchHandler @ 008ed048 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_98 | 1);
    local_98 = CONCAT71(local_98._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_008ecf34;
  }
  else {
    uVar7 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ecf0c to 008ecf13 has its CatchHandler @ 008ed048 */
    __dest = operator_new(uVar7);
    local_98 = uVar7 | 1;
    sStack_90 = __n;
    local_88 = __dest;
  }
  memcpy(__dest,__s,__n);
LAB_008ecf34:
  *(undefined1 *)((long)__dest + __n) = 0;
  local_a8 = *(undefined8 *)(param_2 + 0x18);
  local_a0 = *(__shared_weak_count **)(param_2 + 0x20);
  if (local_a0 != (__shared_weak_count *)0x0) {
    p_Var1 = local_a0 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
                    /* try { // try from 008ecf60 to 008ecf67 has its CatchHandler @ 008ed06c */
  local_c8[0] = Error::getErrorCodeForCurlError(param_3);
  sStack_b8 = sStack_90;
  local_c0 = local_98;
  local_98 = 0;
  sStack_90 = 0;
  local_b0 = local_88;
  local_88 = (void *)0x0;
                    /* try { // try from 008ecf8c to 008ecf9f has its CatchHandler @ 008ed04c */
  Response::Response(param_1,&local_a8,param_2 + 0x248,param_2 + 0x260,auStack_80,local_c8);
  if ((local_c0 & 1) != 0) {
    operator_delete(local_b0);
  }
  p_Var1 = local_a0;
  if (local_a0 != (__shared_weak_count *)0x0) {
    p_Var2 = local_a0 + 8;
    do {
      lVar6 = *(long *)p_Var2;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar4) {
        *(long *)p_Var2 = lVar6 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)local_a0 + 0x10))(local_a0);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  if ((local_98 & 1) != 0) {
    operator_delete(local_88);
  }
  std::__ndk1::__vector_base<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::~__vector_base
            (a_Stack_78);
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

