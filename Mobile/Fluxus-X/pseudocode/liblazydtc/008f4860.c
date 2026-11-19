/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f4860
 */

/* void std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::less<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication> >
   >::__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   void*>*, long>
   >(std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   void*>*, long>,
   std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   void*>*, long>) */

void __thiscall
std::__ndk1::
__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
::
__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,void*>*,long>>
          (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
           *this,__tree_node_base *param_2,__tree_node_base *param_3)

{
  ulong uVar1;
  size_t __n;
  ulong uVar2;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
  _Var3;
  bool bVar4;
  int iVar5;
  __tree_node_base *p_Var6;
  __tree_node_base *p_Var7;
  __tree_node_base *p_Var8;
  long lVar9;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
  *p_Var10;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
  *p_Var11;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
  *p_Var12;
  
  if (*(long *)(this + 0x10) != 0) {
    p_Var6 = *(__tree_node_base **)this;
    p_Var11 = this + 8;
    *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
      **)this = p_Var11;
    *(undefined8 *)(*(long *)p_Var11 + 0x10) = 0;
    *(undefined8 *)(this + 0x10) = 0;
    *(undefined8 *)p_Var11 = 0;
    p_Var8 = *(__tree_node_base **)(p_Var6 + 8);
    if (p_Var8 != (__tree_node_base *)0x0) {
      p_Var6 = p_Var8;
    }
    if (p_Var6 != (__tree_node_base *)0x0) {
LAB_008f48c8:
      if (param_2 == param_3) {
        p_Var8 = *(__tree_node_base **)(p_Var6 + 0x10);
        while (p_Var7 = p_Var8, p_Var7 != (__tree_node_base *)0x0) {
          p_Var6 = p_Var7;
          p_Var8 = *(__tree_node_base **)(p_Var7 + 0x10);
        }
        FUN_00826780(this,p_Var6);
        return;
      }
      if (p_Var6 != param_2) {
        uVar2 = *(ulong *)(param_2 + 0x28);
        p_Var8 = *(__tree_node_base **)(param_2 + 0x30);
        if (((byte)param_2[0x20] & 1) == 0) {
          p_Var8 = param_2 + 0x21;
          uVar2 = (ulong)((byte)param_2[0x20] >> 1);
        }
                    /* try { // try from 008f48fc to 008f4923 has its CatchHandler @ 008f4b50 */
        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                  ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
                   )(p_Var6 + 0x20),(char *)p_Var8,uVar2);
        uVar2 = (ulong)((byte)param_2[0x40] >> 1);
        p_Var8 = param_2 + 0x41;
        if (((byte)param_2[0x40] & 1) != 0) {
          uVar2 = *(ulong *)(param_2 + 0x48);
          p_Var8 = *(__tree_node_base **)(param_2 + 0x50);
        }
        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                  ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
                   )(p_Var6 + 0x40),(char *)p_Var8,uVar2);
      }
      p_Var8 = *(__tree_node_base **)(p_Var6 + 0x10);
      if (p_Var8 != (__tree_node_base *)0x0) {
        p_Var7 = *(__tree_node_base **)p_Var8;
        if (p_Var7 == p_Var6) {
          p_Var7 = *(__tree_node_base **)(p_Var8 + 8);
          *(long *)p_Var8 = 0;
          while (p_Var7 != (__tree_node_base *)0x0) {
            do {
              p_Var8 = p_Var7;
              p_Var7 = *(__tree_node_base **)p_Var8;
            } while (*(__tree_node_base **)p_Var8 != (__tree_node_base *)0x0);
            p_Var7 = *(__tree_node_base **)(p_Var8 + 8);
          }
        }
        else {
          *(long *)(p_Var8 + 8) = 0;
          while (p_Var7 != (__tree_node_base *)0x0) {
            do {
              p_Var8 = p_Var7;
              p_Var7 = *(__tree_node_base **)p_Var8;
            } while (*(__tree_node_base **)p_Var8 != (__tree_node_base *)0x0);
            p_Var7 = *(__tree_node_base **)(p_Var8 + 8);
          }
        }
      }
      p_Var12 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                  **)p_Var11;
      if (p_Var12 !=
          (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
           *)0x0) {
        p_Var7 = *(__tree_node_base **)(p_Var6 + 0x30);
        uVar2 = (ulong)((byte)p_Var6[0x20] >> 1);
        if (((byte)p_Var6[0x20] & 1) == 0) {
          p_Var7 = p_Var6 + 0x21;
        }
        else {
          uVar2 = *(ulong *)(p_Var6 + 0x28);
        }
        do {
          _Var3 = p_Var12[0x20];
          uVar1 = (ulong)((byte)_Var3 >> 1);
          if (((byte)_Var3 & 1) != 0) {
            uVar1 = *(ulong *)(p_Var12 + 0x28);
          }
          __n = uVar1;
          if (uVar2 <= uVar1) {
            __n = uVar2;
          }
          if (__n == 0) {
LAB_008f49f0:
            if (uVar1 <= uVar2) goto LAB_008f49e4;
LAB_008f49f8:
            p_Var10 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                        **)p_Var12;
            if (p_Var10 ==
                (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                 *)0x0) {
              p_Var10 = p_Var12;
              goto LAB_008f4a18;
            }
          }
          else {
            p_Var10 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                        **)(p_Var12 + 0x30);
            if (((byte)_Var3 & 1) == 0) {
              p_Var10 = p_Var12 + 0x21;
            }
            iVar5 = memcmp(p_Var7,p_Var10,__n);
            if (iVar5 == 0) goto LAB_008f49f0;
            if (iVar5 < 0) goto LAB_008f49f8;
LAB_008f49e4:
            p_Var10 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                        **)(p_Var12 + 8);
            if (p_Var10 ==
                (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
                 *)0x0) goto LAB_008f4a14;
          }
          p_Var12 = p_Var10;
        } while( true );
      }
      p_Var10 = p_Var11;
      p_Var12 = p_Var11;
      goto LAB_008f4a18;
    }
  }
LAB_008f4aa0:
  while (param_2 != param_3) {
    __emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,cpr::EncodedAuthentication>const&>
              ((pair *)this);
    p_Var6 = *(__tree_node_base **)(param_2 + 8);
    if (*(__tree_node_base **)(param_2 + 8) == (__tree_node_base *)0x0) {
      p_Var6 = param_2 + 0x10;
      if (*(__tree_node_base **)*(__tree_node_base **)p_Var6 == param_2) {
        param_2 = *(__tree_node_base **)p_Var6;
      }
      else {
        do {
          lVar9 = *(long *)p_Var6;
          p_Var6 = (__tree_node_base *)(lVar9 + 0x10);
          param_2 = *(__tree_node_base **)p_Var6;
        } while (*(long *)param_2 != lVar9);
      }
    }
    else {
      do {
        param_2 = p_Var6;
        p_Var6 = *(__tree_node_base **)param_2;
      } while (*(__tree_node_base **)param_2 != (__tree_node_base *)0x0);
    }
  }
  return;
LAB_008f4a14:
  p_Var10 = p_Var12 + 8;
LAB_008f4a18:
  *(long *)p_Var6 = 0;
  *(long *)(p_Var6 + 8) = 0;
  *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
    **)(p_Var6 + 0x10) = p_Var12;
  *(__tree_node_base **)p_Var10 = p_Var6;
  if (**(long **)this != 0) {
    *(long *)this = **(long **)this;
    p_Var6 = *(__tree_node_base **)p_Var10;
  }
  __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
            (*(__tree_node_base **)(this + 8),p_Var6);
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 1;
  p_Var6 = *(__tree_node_base **)(param_2 + 8);
  if (*(__tree_node_base **)(param_2 + 8) == (__tree_node_base *)0x0) {
    p_Var6 = param_2 + 0x10;
    bVar4 = *(__tree_node_base **)*(__tree_node_base **)p_Var6 != param_2;
    param_2 = *(__tree_node_base **)p_Var6;
    if (bVar4) {
      do {
        lVar9 = *(long *)p_Var6;
        p_Var6 = (__tree_node_base *)(lVar9 + 0x10);
        param_2 = *(__tree_node_base **)p_Var6;
      } while (*(long *)param_2 != lVar9);
    }
  }
  else {
    do {
      param_2 = p_Var6;
      p_Var6 = *(__tree_node_base **)param_2;
    } while (*(__tree_node_base **)param_2 != (__tree_node_base *)0x0);
  }
  p_Var6 = p_Var8;
  if (p_Var8 == (__tree_node_base *)0x0) goto LAB_008f4aa0;
  goto LAB_008f48c8;
}

