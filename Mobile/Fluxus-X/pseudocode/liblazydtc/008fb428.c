/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fb428
 */

/* std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::less<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > >::operator[](std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

__tree_node_base * __thiscall
std::__ndk1::
map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
::operator[](map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *this,basic_string_conflict *param_1)

{
  long lVar1;
  __tree_node_base **pp_Var2;
  __tree_node_base *p_Var3;
  __tree_node_base *p_Var4;
  ulong __n;
  void *__src;
  ulong uVar5;
  undefined8 uVar6;
  __tree_end_node *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  pp_Var2 = __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::
            __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                      ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                        *)this,&local_60,param_1);
  p_Var4 = *pp_Var2;
  if (p_Var4 != (__tree_node_base *)0x0) goto LAB_008fb548;
  p_Var4 = operator_new(0x50);
  *(undefined8 *)(p_Var4 + 0x20) = 0;
  *(undefined8 *)(p_Var4 + 0x28) = 0;
  *(undefined8 *)(p_Var4 + 0x30) = 0;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(p_Var4 + 0x30) = *(undefined8 *)(param_1 + 0x10);
    uVar6 = *(undefined8 *)param_1;
    *(undefined8 *)(p_Var4 + 0x28) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)(p_Var4 + 0x20) = uVar6;
  }
  else {
    __n = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008fb57c to 008fb57f has its CatchHandler @ 008fb580 */
      __basic_string_common<true>::__throw_length_error();
    }
    __src = *(void **)(param_1 + 0x10);
    if (__n < 0x17) {
      p_Var3 = p_Var4 + 0x21;
      p_Var4[0x20] = SUB41((int)__n << 1,0);
      if (__n != 0) goto LAB_008fb4ec;
    }
    else {
      uVar5 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008fb4d4 to 008fb4db has its CatchHandler @ 008fb580 */
      p_Var3 = operator_new(uVar5);
      *(ulong *)(p_Var4 + 0x28) = __n;
      *(__tree_node_base **)(p_Var4 + 0x30) = p_Var3;
      *(ulong *)(p_Var4 + 0x20) = uVar5 | 1;
LAB_008fb4ec:
      memcpy(p_Var3,__src,__n);
    }
    p_Var3[__n] = (__tree_node_base)0x0;
  }
  *(undefined8 *)(p_Var4 + 0x40) = 0;
  *(undefined8 *)(p_Var4 + 0x48) = 0;
  *(undefined8 *)(p_Var4 + 0x38) = 0;
  *(undefined8 *)p_Var4 = 0;
  *(undefined8 *)(p_Var4 + 8) = 0;
  *(__tree_end_node **)(p_Var4 + 0x10) = local_60;
  *pp_Var2 = p_Var4;
  if (**(long **)this == 0) {
    p_Var3 = p_Var4;
  }
  else {
    *(long *)this = **(long **)this;
    p_Var3 = *pp_Var2;
  }
  __tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
            (*(__tree_node_base **)(this + 8),p_Var3);
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 1;
LAB_008fb548:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return p_Var4 + 0x38;
}

