/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986f70
 */

/* ix::DNSLookup::run(std::__ndk1::weak_ptr<ix::DNSLookup>, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, int) */

void __thiscall ix::DNSLookup::run(DNSLookup *this,long *param_2,int param_3,uint param_4)

{
  __shared_weak_count *p_Var1;
  ulong uVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  char *pcVar6;
  __shared_weak_count *p_Var7;
  long lVar8;
  __shared_weak_count *p_Var9;
  undefined8 local_80;
  __shared_weak_count *local_78;
  ulong local_70;
  ulong local_68;
  char *local_60;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  local_70 = 0;
  local_68 = 0;
  local_60 = (char *)0x0;
                    /* try { // try from 00986fac to 00986fbf has its CatchHandler @ 00987210 */
  getAddrInfo((basic_string_conflict *)this,param_3,(basic_string_conflict *)(ulong)param_4);
  if (((__shared_weak_count *)param_2[1] != (__shared_weak_count *)0x0) &&
     (p_Var7 = (__shared_weak_count *)
               std::__ndk1::__shared_weak_count::lock((__shared_weak_count *)param_2[1]),
     p_Var7 != (__shared_weak_count *)0x0)) {
    if (*param_2 != 0) {
      if (local_78 != (__shared_weak_count *)0x0) {
        p_Var9 = local_78 + 8;
        do {
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var9,0x10);
          if (bVar4) {
            *(long *)p_Var9 = *(long *)p_Var9 + 1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
      }
                    /* try { // try from 00986ffc to 00987003 has its CatchHandler @ 00987164 */
      std::__ndk1::mutex::lock((mutex *)(this + 0x48));
      p_Var9 = *(__shared_weak_count **)(this + 0x40);
      *(undefined8 *)(this + 0x38) = local_80;
      *(__shared_weak_count **)(this + 0x40) = local_78;
      if (p_Var9 != (__shared_weak_count *)0x0) {
        p_Var1 = p_Var9 + 8;
        do {
          lVar8 = *(long *)p_Var1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar4) {
            *(long *)p_Var1 = lVar8 + -1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (lVar8 == 0) {
          (**(code **)(*(long *)p_Var9 + 0x10))(p_Var9);
          std::__ndk1::__shared_weak_count::__release_weak(p_Var9);
        }
      }
      std::__ndk1::mutex::unlock((mutex *)(this + 0x48));
                    /* try { // try from 0098704c to 00987053 has its CatchHandler @ 0098715c */
      std::__ndk1::mutex::lock((mutex *)(this + 0x88));
      if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
          (this + 0x70) !=
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
          &local_70) {
        uVar2 = local_70 >> 1 & 0x7f;
        pcVar6 = (char *)((ulong)&local_70 | 1);
        if ((local_70 & 1) != 0) {
          uVar2 = local_68;
          pcVar6 = local_60;
        }
                    /* try { // try from 00987080 to 00987083 has its CatchHandler @ 0098714c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 (this + 0x70),pcVar6,uVar2);
      }
      std::__ndk1::mutex::unlock((mutex *)(this + 0x88));
      this[0xb0] = (DNSLookup)0x1;
    }
    p_Var9 = p_Var7 + 8;
    do {
      lVar8 = *(long *)p_Var9;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var9,0x10);
      if (bVar4) {
        *(long *)p_Var9 = lVar8 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)p_Var7 + 0x10))(p_Var7);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var7);
    }
  }
  if (local_78 != (__shared_weak_count *)0x0) {
    p_Var7 = local_78 + 8;
    do {
      lVar8 = *(long *)p_Var7;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var7,0x10);
      if (bVar4) {
        *(long *)p_Var7 = lVar8 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)local_78 + 0x10))(local_78);
      std::__ndk1::__shared_weak_count::__release_weak(local_78);
    }
  }
  if ((local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

