/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9c0c
 */

/* std::__ndk1::__tree_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, void*>*, long>
   std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, cpr::CaseInsensitiveCompare,
   true>, std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >
   >::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   const&>(std::__ndk1::pair<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void std::__ndk1::
     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
     ::
     __emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
               (pair *param_1)

{
  basic_string_conflict *pbVar1;
  long lVar2;
  ulong uVar3;
  __tree_node_base *p_Var4;
  pair *ppVar5;
  pair *ppVar6;
  __tree_node_base *local_60 [3];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  FUN_008289b8(local_60);
  ppVar5 = param_1 + 8;
  if (*(pair **)ppVar5 != (pair *)0x0) {
    pbVar1 = (basic_string_conflict *)(local_60[0] + 0x20);
    ppVar6 = *(pair **)ppVar5;
    do {
      uVar3 = cpr::CaseInsensitiveCompare::operator()
                        ((CaseInsensitiveCompare *)(param_1 + 0x10),pbVar1,
                         (basic_string_conflict *)(ppVar6 + 0x20));
      if ((uVar3 & 1) == 0) {
        ppVar5 = *(pair **)(ppVar6 + 8);
        if (ppVar5 == (pair *)0x0) {
          ppVar5 = ppVar6 + 8;
          goto LAB_008f9c98;
        }
      }
      else {
        ppVar5 = *(pair **)ppVar6;
        if (ppVar5 == (pair *)0x0) goto LAB_008f9c94;
      }
      ppVar6 = ppVar5;
    } while( true );
  }
  ppVar6 = ppVar5;
LAB_008f9c98:
  *(undefined8 *)local_60[0] = 0;
  *(undefined8 *)(local_60[0] + 8) = 0;
  *(pair **)(local_60[0] + 0x10) = ppVar6;
  *(__tree_node_base **)ppVar5 = local_60[0];
  p_Var4 = local_60[0];
  if (**(long **)param_1 != 0) {
    *(long *)param_1 = **(long **)param_1;
    p_Var4 = *(__tree_node_base **)ppVar5;
  }
  __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
            (*(__tree_node_base **)(param_1 + 8),p_Var4);
  *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + 1;
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_60[0]);
  }
  return;
LAB_008f9c94:
  ppVar5 = ppVar6;
  goto LAB_008f9c98;
}

