/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009951c0
 */

/* std::__ndk1::__tree_node_base<void*>*&
   std::__ndk1::__tree<std::__ndk1::shared_ptr<ix::WebSocket>,
   std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket> >,
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket> >
   >::__find_equal<std::__ndk1::shared_ptr<ix::WebSocket>
   >(std::__ndk1::__tree_const_iterator<std::__ndk1::shared_ptr<ix::WebSocket>,
   std::__ndk1::__tree_node<std::__ndk1::shared_ptr<ix::WebSocket>, void*>*, long>,
   std::__ndk1::__tree_end_node<std::__ndk1::__tree_node_base<void*>*>*&,
   std::__ndk1::__tree_node_base<void*>*&, std::__ndk1::shared_ptr<ix::WebSocket> const&) */

__tree_node_base ** __thiscall
std::__ndk1::
__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
::__find_equal<std::__ndk1::shared_ptr<ix::WebSocket>>
          (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
           *this,__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 *param_2,long *param_3,__tree_node_base **param_4,ulong *param_5)

{
  bool bVar1;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var2;
  ulong uVar3;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var4;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var5;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var6;
  long lVar7;
  
  p_Var2 = this + 8;
  if (p_Var2 != param_2) {
    uVar3 = *param_5;
    if (*(ulong *)(param_2 + 0x20) <= uVar3) {
      if (uVar3 <= *(ulong *)(param_2 + 0x20)) {
        *param_3 = (long)param_2;
        *param_4 = (__tree_node_base *)param_2;
        return param_4;
      }
      p_Var6 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 **)(param_2 + 8);
      if (p_Var6 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                     *)0x0) {
        p_Var6 = param_2 + 0x10;
        p_Var4 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)p_Var6;
        if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
              **)p_Var4 != param_2) {
          do {
            lVar7 = *(long *)p_Var6;
            p_Var6 = (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                      *)(lVar7 + 0x10);
            p_Var4 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                       **)p_Var6;
          } while (*(long *)p_Var4 != lVar7);
        }
      }
      else {
        do {
          p_Var4 = p_Var6;
          p_Var6 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                     **)p_Var4;
        } while (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)p_Var4 !=
                 (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                  *)0x0);
      }
      if ((p_Var4 == p_Var2) || (uVar3 < *(ulong *)(p_Var4 + 0x20))) {
        if (*(long *)(param_2 + 8) == 0) {
          *param_3 = (long)param_2;
          return (__tree_node_base **)(param_2 + 8);
        }
LAB_0099531c:
        *param_3 = (long)p_Var4;
        return (__tree_node_base **)p_Var4;
      }
      if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
            **)p_Var2 !=
          (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
           *)0x0) {
        this = this + 8;
        p_Var4 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)p_Var2;
        do {
          if (uVar3 < *(ulong *)(p_Var4 + 0x20)) {
            p_Var2 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                       **)p_Var4;
            if (p_Var2 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                           *)0x0) goto LAB_0099531c;
            this = p_Var4;
          }
          else {
            if (uVar3 <= *(ulong *)(p_Var4 + 0x20)) {
LAB_0099536c:
              *param_3 = (long)p_Var4;
              return (__tree_node_base **)this;
            }
            this = p_Var4 + 8;
            p_Var2 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                       **)this;
            if (p_Var2 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                           *)0x0) goto LAB_0099536c;
          }
          p_Var4 = p_Var2;
        } while( true );
      }
      goto LAB_00995378;
    }
  }
  p_Var4 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
             **)param_2;
  p_Var6 = param_2;
  if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
        **)this != param_2) {
    if (p_Var4 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   *)0x0) {
      p_Var5 = param_2;
      do {
        p_Var6 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)(p_Var5 + 0x10);
        bVar1 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                  **)p_Var6 == p_Var5;
        p_Var5 = p_Var6;
      } while (bVar1);
    }
    else {
      p_Var5 = p_Var4;
      do {
        p_Var6 = p_Var5;
        p_Var5 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)(p_Var6 + 8);
      } while (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 **)(p_Var6 + 8) !=
               (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                *)0x0);
    }
    uVar3 = *param_5;
    if (uVar3 <= *(ulong *)(p_Var6 + 0x20)) {
      if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
            **)p_Var2 !=
          (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
           *)0x0) {
        this = this + 8;
        p_Var4 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   **)p_Var2;
        do {
          if (uVar3 < *(ulong *)(p_Var4 + 0x20)) {
            p_Var2 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                       **)p_Var4;
            if (p_Var2 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                           *)0x0) goto LAB_0099531c;
            this = p_Var4;
          }
          else {
            if (uVar3 <= *(ulong *)(p_Var4 + 0x20)) {
LAB_009952ac:
              *param_3 = (long)p_Var4;
              return (__tree_node_base **)this;
            }
            this = p_Var4 + 8;
            p_Var2 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                       **)this;
            if (p_Var2 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                           *)0x0) goto LAB_009952ac;
          }
          p_Var4 = p_Var2;
        } while( true );
      }
LAB_00995378:
      *param_3 = (long)p_Var2;
      return (__tree_node_base **)p_Var2;
    }
  }
  if (p_Var4 == (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 *)0x0) {
    *param_3 = (long)param_2;
    return (__tree_node_base **)param_2;
  }
  *param_3 = (long)p_Var6;
  return (__tree_node_base **)(p_Var6 + 8);
}

