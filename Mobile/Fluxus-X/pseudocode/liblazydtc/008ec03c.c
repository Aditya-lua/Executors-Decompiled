/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ec03c
 */

/* WARNING: Type propagation algorithm not settling */
/* cpr::Session::CompleteDownload(CURLcode) */

void cpr::Session::CompleteDownload(Response *param_1,long param_2,int param_3)

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
  undefined4 local_e0 [2];
  ulong local_d8;
  size_t sStack_d0;
  void *local_c8;
  ulong local_c0;
  undefined8 uStack_b8;
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
  if (*(long *)(param_2 + 0x150) == 0) {
    curl_easy_setopt(**(undefined8 **)(param_2 + 0x18),0x4e6f,0);
    curl_easy_setopt(**(undefined8 **)(param_2 + 0x18),0x272d,0);
  }
  local_60 = (curl_slist *)0x0;
  curl_easy_getinfo(**(undefined8 **)(param_2 + 0x18),&DAT_0040001c,&local_60);
  util::parseCookies(local_60);
                    /* try { // try from 008ec0cc to 008ec0cf has its CatchHandler @ 008ec31c */
  curl_slist_free_all(local_60);
  local_98 = 0;
  sStack_90 = 0;
  local_88 = (void *)0x0;
  __s = (char *)(*(long *)(param_2 + 0x18) + 0x20);
  __n = strlen(__s);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 008ec278 to 008ec27f has its CatchHandler @ 008ec284 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_98 | 1);
    local_98 = CONCAT71(local_98._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_008ec144;
  }
  else {
    uVar7 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ec11c to 008ec123 has its CatchHandler @ 008ec284 */
    __dest = operator_new(uVar7);
    local_98 = uVar7 | 1;
    sStack_90 = __n;
    local_88 = __dest;
  }
  memcpy(__dest,__s,__n);
LAB_008ec144:
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
  local_c0 = 0;
  uStack_b8 = 0;
  local_b0 = (void *)0x0;
                    /* try { // try from 008ec178 to 008ec17f has its CatchHandler @ 008ec2bc */
  local_e0[0] = Error::getErrorCodeForCurlError(param_3);
  sStack_d0 = sStack_90;
  local_d8 = local_98;
  local_98 = 0;
  sStack_90 = 0;
  local_c8 = local_88;
  local_88 = (void *)0x0;
                    /* try { // try from 008ec1a0 to 008ec1b7 has its CatchHandler @ 008ec288 */
  Response::Response(param_1,&local_a8,&local_c0,param_2 + 0x260,auStack_80,local_e0);
  if ((local_d8 & 1) != 0) {
    operator_delete(local_c8);
  }
  p_Var1 = local_a0;
  if ((local_c0 & 1) != 0) {
    operator_delete(local_b0);
    p_Var1 = local_a0;
  }
  local_a0 = p_Var1;
  if (p_Var1 != (__shared_weak_count *)0x0) {
    p_Var2 = p_Var1 + 8;
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
      (**(code **)(*(long *)p_Var1 + 0x10))(p_Var1);
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

