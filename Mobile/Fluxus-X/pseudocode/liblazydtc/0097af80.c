/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097af80
 */

/* std::__ndk1::pair<std::__ndk1::__tree_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, void*>*, long>, bool>
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
   >::__emplace_unique_key_args<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::piecewise_construct_t const&,
   std::__ndk1::tuple<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&&>, std::__ndk1::tuple<> >(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::piecewise_construct_t const&, std::__ndk1::tuple<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&&>&&, std::__ndk1::tuple<>&&) */

undefined1  [16]
std::__ndk1::
__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
::
__emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
          (basic_string_conflict *param_1,piecewise_construct_t *param_2,tuple *param_3,
          tuple *param_4)

{
  ulong uVar1;
  __tree_node_base *p_Var2;
  undefined8 uVar3;
  undefined8 *puVar4;
  __tree_node_base *p_Var5;
  basic_string_conflict *pbVar6;
  basic_string_conflict *pbVar7;
  basic_string_conflict *pbVar8;
  undefined1 auVar9 [16];
  
  pbVar6 = param_1 + 8;
  pbVar7 = *(basic_string_conflict **)pbVar6;
  if (pbVar7 == (basic_string_conflict *)0x0) {
    pbVar8 = pbVar6;
  }
  else {
    pbVar6 = param_1 + 8;
    while( true ) {
      while( true ) {
        uVar1 = ix::CaseInsensitiveLess::operator()
                          ((CaseInsensitiveLess *)(param_1 + 0x10),(basic_string_conflict *)param_2,
                           pbVar7 + 0x20);
        pbVar8 = pbVar7;
        if ((uVar1 & 1) == 0) break;
        if (*(basic_string_conflict **)pbVar7 == (basic_string_conflict *)0x0) {
          p_Var5 = *(__tree_node_base **)pbVar7;
          goto joined_r0x0097b018;
        }
        pbVar6 = pbVar7;
        pbVar7 = *(basic_string_conflict **)pbVar7;
      }
      uVar1 = ix::CaseInsensitiveLess::operator()
                        ((CaseInsensitiveLess *)(param_1 + 0x10),pbVar7 + 0x20,
                         (basic_string_conflict *)param_2);
      if ((uVar1 & 1) == 0) break;
      pbVar6 = pbVar7 + 8;
      if (*(basic_string_conflict **)pbVar6 == (basic_string_conflict *)0x0) break;
      pbVar7 = *(basic_string_conflict **)pbVar6;
    }
  }
  p_Var5 = *(__tree_node_base **)pbVar6;
  pbVar7 = pbVar6;
joined_r0x0097b018:
  if (p_Var5 == (__tree_node_base *)0x0) {
    p_Var5 = operator_new(0x50);
    puVar4 = *(undefined8 **)param_4;
    *(undefined8 *)(p_Var5 + 0x30) = puVar4[2];
    uVar3 = *puVar4;
    *(undefined8 *)(p_Var5 + 0x28) = puVar4[1];
    *(undefined8 *)(p_Var5 + 0x20) = uVar3;
    puVar4[1] = 0;
    puVar4[2] = 0;
    *puVar4 = 0;
    *(undefined8 *)(p_Var5 + 0x40) = 0;
    *(undefined8 *)(p_Var5 + 0x48) = 0;
    *(undefined8 *)(p_Var5 + 0x38) = 0;
    *(undefined8 *)p_Var5 = 0;
    *(undefined8 *)(p_Var5 + 8) = 0;
    *(basic_string_conflict **)(p_Var5 + 0x10) = pbVar8;
    *(__tree_node_base **)pbVar7 = p_Var5;
    if (**(long **)param_1 == 0) {
      p_Var2 = p_Var5;
    }
    else {
      *(long *)param_1 = **(long **)param_1;
      p_Var2 = *(__tree_node_base **)pbVar7;
    }
    __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
              (*(__tree_node_base **)(param_1 + 8),p_Var2);
    uVar3 = 1;
    *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + 1;
  }
  else {
    uVar3 = 0;
  }
  auVar9._8_8_ = uVar3;
  auVar9._0_8_ = p_Var5;
  return auVar9;
}

