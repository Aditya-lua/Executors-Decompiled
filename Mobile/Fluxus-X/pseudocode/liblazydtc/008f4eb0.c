/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f4eb0
 */

/* void std::__ndk1::__hash_table<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::__assign_multi<std::__ndk1::__hash_const_iterator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*>*>
   >(std::__ndk1::__hash_const_iterator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*>*>,
   std::__ndk1::__hash_const_iterator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*>*>) */

void __thiscall
std::__ndk1::
__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::
__assign_multi<std::__ndk1::__hash_const_iterator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,void*>*>>
          (__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,__hash_node *param_2,__hash_node *param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  __hash_node *p_Var6;
  __hash_node *p_Var7;
  __hash_node *local_60;
  
  lVar2 = tpidr_el0;
  lVar3 = *(long *)(lVar2 + 0x28);
  lVar4 = *(long *)(this + 8);
  if (lVar4 != 0) {
    lVar5 = 0;
    do {
      *(undefined8 *)(*(long *)this + lVar5 * 8) = 0;
      lVar5 = lVar5 + 1;
    } while (lVar4 != lVar5);
    p_Var6 = *(__hash_node **)(this + 0x10);
    *(undefined8 *)(this + 0x10) = 0;
    *(undefined8 *)(this + 0x18) = 0;
    while (p_Var6 != (__hash_node *)0x0) {
      if (param_2 == param_3) goto LAB_008f4f60;
      if (param_2 != p_Var6) {
        uVar1 = *(ulong *)(param_2 + 0x18);
        p_Var7 = *(__hash_node **)(param_2 + 0x20);
        if (((byte)param_2[0x10] & 1) == 0) {
          p_Var7 = param_2 + 0x11;
          uVar1 = (ulong)((byte)param_2[0x10] >> 1);
        }
                    /* try { // try from 008f4f3c to 008f4f3f has its CatchHandler @ 008f4fe0 */
        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                  ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
                   )(p_Var6 + 0x10),(char *)p_Var7,uVar1);
      }
      p_Var7 = *(__hash_node **)p_Var6;
                    /* try { // try from 008f4f44 to 008f4f4f has its CatchHandler @ 008f4fe4 */
      __node_insert_multi(this,p_Var6);
      param_2 = *(__hash_node **)param_2;
      p_Var6 = p_Var7;
    }
  }
LAB_008f4f8c:
  for (; param_2 != param_3; param_2 = *(__hash_node **)param_2) {
    __construct_node<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
              ((basic_string_conflict *)this);
                    /* try { // try from 008f4fa8 to 008f4faf has its CatchHandler @ 008f5020 */
    __node_insert_multi(this,local_60);
  }
  if (*(long *)(lVar2 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
LAB_008f4f60:
  do {
    p_Var7 = *(__hash_node **)p_Var6;
    if (((byte)p_Var6[0x10] & 1) != 0) {
      operator_delete(*(void **)(p_Var6 + 0x20));
    }
    operator_delete(p_Var6);
    p_Var6 = p_Var7;
  } while (p_Var7 != (__hash_node *)0x0);
  goto LAB_008f4f8c;
}

