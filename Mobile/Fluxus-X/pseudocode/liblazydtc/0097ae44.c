/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097ae44
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
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, ix::CaseInsensitiveLess, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >
   >::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   const&>(std::__ndk1::pair<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void std::__ndk1::
     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
     ::
     __emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
               (pair *param_1)

{
  long lVar1;
  ulong uVar2;
  __tree_node_base *p_Var3;
  long lVar4;
  pair *ppVar5;
  pair *ppVar6;
  __tree_node_base *local_60;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
  __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
            (param_1);
  ppVar5 = param_1 + 8;
  if (*(pair **)ppVar5 != (pair *)0x0) {
    ppVar6 = *(pair **)ppVar5;
    do {
                    /* try { // try from 0097ae98 to 0097aea3 has its CatchHandler @ 0097af38 */
      uVar2 = ix::CaseInsensitiveLess::operator()
                        ((CaseInsensitiveLess *)(param_1 + 0x10),
                         (basic_string_conflict *)(local_60 + 0x20),
                         (basic_string_conflict *)(ppVar6 + 0x20));
      if ((uVar2 & 1) == 0) {
        ppVar5 = *(pair **)(ppVar6 + 8);
        if (ppVar5 == (pair *)0x0) {
          ppVar5 = ppVar6 + 8;
          goto LAB_0097aed0;
        }
      }
      else {
        ppVar5 = *(pair **)ppVar6;
        if (ppVar5 == (pair *)0x0) goto LAB_0097aecc;
      }
      ppVar6 = ppVar5;
    } while( true );
  }
  ppVar6 = ppVar5;
LAB_0097aed0:
  *(undefined8 *)local_60 = 0;
  *(undefined8 *)(local_60 + 8) = 0;
  *(pair **)(local_60 + 0x10) = ppVar6;
  *(__tree_node_base **)ppVar5 = local_60;
  p_Var3 = local_60;
  if (**(long **)param_1 != 0) {
    *(long *)param_1 = **(long **)param_1;
    p_Var3 = *(__tree_node_base **)ppVar5;
  }
  __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
            (*(__tree_node_base **)(param_1 + 8),p_Var3);
  *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + 1;
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_60);
  }
  return;
LAB_0097aecc:
  ppVar5 = ppVar6;
  goto LAB_0097aed0;
}

