/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3c1c
 */

/* std::__ndk1::__tree_node_base<void*>*& std::__ndk1::__tree<unsigned short,
   std::__ndk1::less<unsigned short>, std::__ndk1::allocator<unsigned short>
   >::__find_equal<unsigned short>(std::__ndk1::__tree_const_iterator<unsigned short,
   std::__ndk1::__tree_node<unsigned short, void*>*, long>,
   std::__ndk1::__tree_end_node<std::__ndk1::__tree_node_base<void*>*>*&,
   std::__ndk1::__tree_node_base<void*>*&, unsigned short const&) */

__tree_node_base ** __thiscall
std::__ndk1::
__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::
__find_equal<unsigned_short>
          (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
           *this,__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                 *param_2,long *param_3,__tree_node_base **param_4,ushort *param_5)

{
  ushort uVar1;
  bool bVar2;
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
  *p_Var3;
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
  *p_Var4;
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
  *p_Var5;
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
  *p_Var6;
  long lVar7;
  
  p_Var3 = this + 8;
  if (p_Var3 != param_2) {
    uVar1 = *param_5;
    if (*(ushort *)(param_2 + 0x1a) <= uVar1) {
      if (uVar1 <= *(ushort *)(param_2 + 0x1a)) {
        *param_3 = (long)param_2;
        *param_4 = (__tree_node_base *)param_2;
        return param_4;
      }
      p_Var6 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                 **)(param_2 + 8);
      if (p_Var6 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                     *)0x0) {
        p_Var6 = param_2 + 0x10;
        p_Var4 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)p_Var6;
        if (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
              **)p_Var4 != param_2) {
          do {
            lVar7 = *(long *)p_Var6;
            p_Var6 = (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                      *)(lVar7 + 0x10);
            p_Var4 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                       **)p_Var6;
          } while (*(long *)p_Var4 != lVar7);
        }
      }
      else {
        do {
          p_Var4 = p_Var6;
          p_Var6 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                     **)p_Var4;
        } while (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)p_Var4 !=
                 (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                  *)0x0);
      }
      if ((p_Var4 == p_Var3) || (uVar1 < *(ushort *)(p_Var4 + 0x1a))) {
        if (*(long *)(param_2 + 8) == 0) {
          *param_3 = (long)param_2;
          return (__tree_node_base **)(param_2 + 8);
        }
LAB_008f3d78:
        *param_3 = (long)p_Var4;
        return (__tree_node_base **)p_Var4;
      }
      if (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
            **)p_Var3 !=
          (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
           *)0x0) {
        this = this + 8;
        p_Var4 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)p_Var3;
        do {
          if (uVar1 < *(ushort *)(p_Var4 + 0x1a)) {
            p_Var3 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                       **)p_Var4;
            if (p_Var3 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                           *)0x0) goto LAB_008f3d78;
            this = p_Var4;
          }
          else {
            if (uVar1 <= *(ushort *)(p_Var4 + 0x1a)) {
LAB_008f3dc8:
              *param_3 = (long)p_Var4;
              return (__tree_node_base **)this;
            }
            this = p_Var4 + 8;
            p_Var3 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                       **)this;
            if (p_Var3 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                           *)0x0) goto LAB_008f3dc8;
          }
          p_Var4 = p_Var3;
        } while( true );
      }
      goto LAB_008f3dd4;
    }
  }
  p_Var4 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
             **)param_2;
  p_Var6 = param_2;
  if (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
        **)this != param_2) {
    if (p_Var4 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   *)0x0) {
      p_Var5 = param_2;
      do {
        p_Var6 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)(p_Var5 + 0x10);
        bVar2 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                  **)p_Var6 == p_Var5;
        p_Var5 = p_Var6;
      } while (bVar2);
    }
    else {
      p_Var5 = p_Var4;
      do {
        p_Var6 = p_Var5;
        p_Var5 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)(p_Var6 + 8);
      } while (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                 **)(p_Var6 + 8) !=
               (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                *)0x0);
    }
    uVar1 = *param_5;
    if (uVar1 <= *(ushort *)(p_Var6 + 0x1a)) {
      if (*(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
            **)p_Var3 !=
          (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
           *)0x0) {
        this = this + 8;
        p_Var4 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                   **)p_Var3;
        do {
          if (uVar1 < *(ushort *)(p_Var4 + 0x1a)) {
            p_Var3 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                       **)p_Var4;
            if (p_Var3 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                           *)0x0) goto LAB_008f3d78;
            this = p_Var4;
          }
          else {
            if (uVar1 <= *(ushort *)(p_Var4 + 0x1a)) {
LAB_008f3d08:
              *param_3 = (long)p_Var4;
              return (__tree_node_base **)this;
            }
            this = p_Var4 + 8;
            p_Var3 = *(__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                       **)this;
            if (p_Var3 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                           *)0x0) goto LAB_008f3d08;
          }
          p_Var4 = p_Var3;
        } while( true );
      }
LAB_008f3dd4:
      *param_3 = (long)p_Var3;
      return (__tree_node_base **)p_Var3;
    }
  }
  if (p_Var4 == (__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
                 *)0x0) {
    *param_3 = (long)param_2;
    return (__tree_node_base **)param_2;
  }
  *param_3 = (long)p_Var6;
  return (__tree_node_base **)(p_Var6 + 8);
}

