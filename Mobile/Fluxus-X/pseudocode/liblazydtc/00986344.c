/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986344
 */

/* ix::SocketConnect::connect(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()>
   const&) */

int ix::SocketConnect::connect
              (basic_string_conflict *param_1,int param_2,basic_string_conflict *param_3,
              function *param_4)

{
  __shared_weak_count *p_Var1;
  char cVar2;
  bool bVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  addrinfo *local_70;
  __shared_weak_count *local_68;
  DNSLookup *local_60;
  __shared_weak_count *local_58;
  int local_4c;
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  local_4c = param_2;
  std::__ndk1::shared_ptr<ix::DNSLookup>::
  make_shared<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int&>
            ((shared_ptr<ix::DNSLookup> *)param_1,(basic_string_conflict *)&local_4c,(int *)param_3)
  ;
                    /* try { // try from 00986384 to 00986397 has its CatchHandler @ 00986468 */
  DNSLookup::resolve(local_60,param_3,param_4,true);
  for (; local_70 != (addrinfo *)0x0; local_70 = local_70->ai_next) {
                    /* try { // try from 009863a0 to 009863af has its CatchHandler @ 00986478 */
    iVar5 = connectToAddress(local_70,param_3,param_4);
    if (iVar5 != -1) goto LAB_009863c8;
  }
  iVar5 = -1;
LAB_009863c8:
  if (local_68 != (__shared_weak_count *)0x0) {
    p_Var1 = local_68 + 8;
    do {
      lVar6 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar6 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)local_68 + 0x10))(local_68);
      std::__ndk1::__shared_weak_count::__release_weak(local_68);
    }
  }
  if (local_58 != (__shared_weak_count *)0x0) {
    p_Var1 = local_58 + 8;
    do {
      lVar6 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar6 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)local_58 + 0x10))(local_58);
      std::__ndk1::__shared_weak_count::__release_weak(local_58);
    }
  }
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

