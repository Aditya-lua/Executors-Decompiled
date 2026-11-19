/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00977158
 */

/* ix::HttpClient::get(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::shared_ptr<ix::HttpRequestArgs>) */

void __thiscall ix::HttpClient::get(HttpClient *this,undefined8 param_1,undefined8 *param_3)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  undefined8 local_50;
  __shared_weak_count *local_48;
  ulong local_40;
  undefined8 local_38;
  void *local_30;
  long local_28;
  
  lVar5 = tpidr_el0;
  local_28 = *(long *)(lVar5 + 0x28);
  local_38 = 0;
  local_30 = (void *)0x0;
  local_50 = *param_3;
  local_48 = (__shared_weak_count *)param_3[1];
  local_40 = 0;
  if (local_48 != (__shared_weak_count *)0x0) {
    p_Var1 = local_48 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
                    /* try { // try from 009771a0 to 009771b7 has its CatchHandler @ 00977230 */
  request(this,param_1,&kGet,&local_40,&local_50,0);
  p_Var1 = local_48;
  if (local_48 != (__shared_weak_count *)0x0) {
    p_Var2 = local_48 + 8;
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
      (**(code **)(*(long *)local_48 + 0x10))(local_48);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  if ((local_40 & 1) != 0) {
    operator_delete(local_30);
  }
  if (*(long *)(lVar5 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

