/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987d68
 */

/* std::__ndk1::__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,
   std::__ndk1::thread>,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,
   std::__ndk1::thread> > >::~__list_imp() */

void __thiscall
std::__ndk1::
__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
::~__list_imp(__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
              *this)

{
  __shared_weak_count *p_Var1;
  __list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
  *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  __shared_weak_count *this_00;
  __list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
  *p_Var7;
  
  if (*(long *)(this + 0x10) != 0) {
    lVar5 = *(long *)this;
    p_Var2 = *(__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
               **)(this + 8);
    lVar6 = *(long *)p_Var2;
    *(undefined8 *)(lVar6 + 8) = *(undefined8 *)(lVar5 + 8);
    **(long **)(lVar5 + 8) = lVar6;
    *(undefined8 *)(this + 0x10) = 0;
    while (p_Var2 != this) {
      p_Var7 = *(__list_imp<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::ConnectionState>,std::__ndk1::thread>>>
                 **)(p_Var2 + 8);
      thread::~thread((thread *)(p_Var2 + 0x20));
      this_00 = *(__shared_weak_count **)(p_Var2 + 0x18);
      if (this_00 != (__shared_weak_count *)0x0) {
        p_Var1 = this_00 + 8;
        do {
          lVar5 = *(long *)p_Var1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar4) {
            *(long *)p_Var1 = lVar5 + -1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (lVar5 == 0) {
          (**(code **)(*(long *)this_00 + 0x10))(this_00);
          __shared_weak_count::__release_weak(this_00);
        }
      }
      operator_delete(p_Var2);
      p_Var2 = p_Var7;
    }
  }
  return;
}

