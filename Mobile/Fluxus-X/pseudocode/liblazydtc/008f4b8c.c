/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f4b8c
 */

/* std::__ndk1::__tree_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   void*>*, long> std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication>,
   std::__ndk1::less<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::EncodedAuthentication> >
   >::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const, cpr::EncodedAuthentication>
   const&>(std::__ndk1::pair<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const, cpr::EncodedAuthentication> const&) */

void std::__ndk1::
     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>
     ::
     __emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,cpr::EncodedAuthentication>const&>
               (pair *param_1)

{
  ulong uVar1;
  size_t __n;
  pair pVar2;
  long lVar3;
  ulong uVar4;
  int iVar5;
  long lVar6;
  pair *ppVar7;
  __tree_node_base *p_Var8;
  pair *ppVar9;
  __tree_node_base *local_70;
  
  lVar3 = tpidr_el0;
  lVar6 = *(long *)(lVar3 + 0x28);
  __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,cpr::EncodedAuthentication>const&>
            (param_1);
  ppVar7 = param_1 + 8;
  ppVar9 = *(pair **)ppVar7;
  if (ppVar9 != (pair *)0x0) {
    p_Var8 = *(__tree_node_base **)(local_70 + 0x30);
    uVar4 = (ulong)((byte)local_70[0x20] >> 1);
    if (((byte)local_70[0x20] & 1) == 0) {
      p_Var8 = local_70 + 0x21;
    }
    else {
      uVar4 = *(ulong *)(local_70 + 0x28);
    }
    do {
      pVar2 = ppVar9[0x20];
      uVar1 = (ulong)((byte)pVar2 >> 1);
      if (((byte)pVar2 & 1) != 0) {
        uVar1 = *(ulong *)(ppVar9 + 0x28);
      }
      __n = uVar1;
      if (uVar4 <= uVar1) {
        __n = uVar4;
      }
      if (__n == 0) {
LAB_008f4c40:
        if (uVar1 <= uVar4) goto LAB_008f4c34;
LAB_008f4c48:
        ppVar7 = *(pair **)ppVar9;
        if (ppVar7 == (pair *)0x0) {
          ppVar7 = ppVar9;
          goto LAB_008f4c64;
        }
      }
      else {
        ppVar7 = *(pair **)(ppVar9 + 0x30);
        if (((byte)pVar2 & 1) == 0) {
          ppVar7 = ppVar9 + 0x21;
        }
        iVar5 = memcmp(p_Var8,ppVar7,__n);
        if (iVar5 == 0) goto LAB_008f4c40;
        if (iVar5 < 0) goto LAB_008f4c48;
LAB_008f4c34:
        ppVar7 = *(pair **)(ppVar9 + 8);
        if (ppVar7 == (pair *)0x0) goto LAB_008f4c60;
      }
      ppVar9 = ppVar7;
    } while( true );
  }
  ppVar9 = ppVar7;
LAB_008f4c64:
  *(undefined8 *)local_70 = 0;
  *(undefined8 *)(local_70 + 8) = 0;
  *(pair **)(local_70 + 0x10) = ppVar9;
  *(__tree_node_base **)ppVar7 = local_70;
  p_Var8 = local_70;
  if (**(long **)param_1 != 0) {
    *(long *)param_1 = **(long **)param_1;
    p_Var8 = *(__tree_node_base **)ppVar7;
  }
  __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
            (*(__tree_node_base **)(param_1 + 8),p_Var8);
  *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + 1;
  if (*(long *)(lVar3 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_70);
  }
  return;
LAB_008f4c60:
  ppVar7 = ppVar9 + 8;
  goto LAB_008f4c64;
}

