/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097853c
 */

/* ix::HttpClient::put(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::shared_ptr<ix::HttpRequestArgs>) */

void __thiscall
ix::HttpClient::put(HttpClient *this,undefined8 param_1,undefined8 param_2,undefined8 *param_4)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  undefined8 local_38;
  __shared_weak_count *local_30;
  long local_28;
  
  lVar5 = tpidr_el0;
  local_28 = *(long *)(lVar5 + 0x28);
  local_38 = *param_4;
  local_30 = (__shared_weak_count *)param_4[1];
  if (local_30 != (__shared_weak_count *)0x0) {
    p_Var1 = local_30 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
                    /* try { // try from 00978584 to 0097859b has its CatchHandler @ 009785f8 */
  request(this,param_1,&kPut,param_2,&local_38,0);
  p_Var1 = local_30;
  if (local_30 != (__shared_weak_count *)0x0) {
    p_Var2 = local_30 + 8;
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
      (**(code **)(*(long *)local_30 + 0x10))(local_30);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  if (*(long *)(lVar5 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

