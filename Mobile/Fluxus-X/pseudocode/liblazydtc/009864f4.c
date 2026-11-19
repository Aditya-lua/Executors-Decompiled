/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009864f4
 */

/* std::__ndk1::shared_ptr<ix::DNSLookup>
   std::__ndk1::shared_ptr<ix::DNSLookup>::make_shared<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   int&>(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int&) */

void __thiscall
std::__ndk1::shared_ptr<ix::DNSLookup>::
make_shared<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int&>
          (shared_ptr<ix::DNSLookup> *this,basic_string_conflict *param_1,int *param_2)

{
  char cVar1;
  bool bVar2;
  __shared_weak_count *this_00;
  __shared_weak_count *this_01;
  undefined8 *in_x8;
  long lVar3;
  DNSLookup *this_02;
  __shared_weak_count *p_Var4;
  __shared_weak_count *p_Var5;
  
  this_00 = operator_new(0xd0);
  p_Var4 = this_00 + 8;
  *(long *)p_Var4 = 0;
  p_Var5 = this_00 + 0x10;
  *(long *)p_Var5 = 0;
  this_02 = (DNSLookup *)(this_00 + 0x18);
  *(undefined ***)this_00 = &PTR____shared_ptr_emplace_00c51f48;
                    /* try { // try from 00986558 to 00986563 has its CatchHandler @ 00986600 */
  ix::DNSLookup::DNSLookup(this_02,(basic_string_conflict *)this,*(int *)param_1,1);
  this_01 = *(__shared_weak_count **)(this_00 + 0x20);
  *in_x8 = this_02;
  in_x8[1] = this_00;
  if ((this_01 == (__shared_weak_count *)0x0) || (*(long *)(this_01 + 8) == -1)) {
    do {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(p_Var4,0x10);
      if (bVar2) {
        *(long *)p_Var4 = *(long *)p_Var4 + 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
    do {
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(p_Var5,0x10);
      if (bVar2) {
        *(long *)p_Var5 = *(long *)p_Var5 + 1;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
    *(DNSLookup **)(this_00 + 0x18) = this_02;
    *(__shared_weak_count **)(this_00 + 0x20) = this_00;
    if (this_01 != (__shared_weak_count *)0x0) {
      __shared_weak_count::__release_weak(this_01);
    }
    do {
      lVar3 = *(long *)p_Var4;
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(p_Var4,0x10);
      if (bVar2) {
        *(long *)p_Var4 = lVar3 + -1;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
    if (lVar3 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      __shared_weak_count::__release_weak(this_00);
      return;
    }
  }
  return;
}

