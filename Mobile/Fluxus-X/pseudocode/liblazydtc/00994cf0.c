/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994cf0
 */

/* std::__ndk1::__tree<std::__ndk1::shared_ptr<ix::WebSocket>,
   std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket> >,
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket> >
   >::erase(std::__ndk1::__tree_const_iterator<std::__ndk1::shared_ptr<ix::WebSocket>,
   std::__ndk1::__tree_node<std::__ndk1::shared_ptr<ix::WebSocket>, void*>*, long>) */

long * __thiscall
std::__ndk1::
__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
::erase(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
        *this,__tree_node_base *param_2)

{
  __shared_weak_count *p_Var1;
  char cVar2;
  bool bVar3;
  long *plVar4;
  __tree_node_base *p_Var5;
  long lVar6;
  long *plVar7;
  __shared_weak_count *this_00;
  
  plVar4 = *(long **)(param_2 + 8);
  if (*(long **)(param_2 + 8) == (long *)0x0) {
    p_Var5 = param_2 + 0x10;
    plVar7 = *(long **)p_Var5;
    if ((__tree_node_base *)*plVar7 != param_2) {
      do {
        lVar6 = *(long *)p_Var5;
        p_Var5 = (__tree_node_base *)(lVar6 + 0x10);
        plVar7 = *(long **)p_Var5;
      } while (*plVar7 != lVar6);
    }
  }
  else {
    do {
      plVar7 = plVar4;
      plVar4 = (long *)*plVar7;
    } while ((long *)*plVar7 != (long *)0x0);
  }
  if (*(__tree_node_base **)this == param_2) {
    *(long **)this = plVar7;
  }
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + -1;
  __tree_remove<std::__ndk1::__tree_node_base<void*>*>(*(__tree_node_base **)(this + 8),param_2);
  this_00 = *(__shared_weak_count **)(param_2 + 0x28);
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
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
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      __shared_weak_count::__release_weak(this_00);
    }
  }
  operator_delete(param_2);
  return plVar7;
}

