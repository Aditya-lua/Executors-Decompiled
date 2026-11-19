/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f4688
 */

/* std::__ndk1::unique_ptr<std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, void*>,
   std::__ndk1::__tree_node_destructor<std::__ndk1::allocator<std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, void*> > > >
   std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::less<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >
   >::__construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   const&>(std::__ndk1::pair<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void std::__ndk1::
     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
     ::
     __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
               (pair *param_1)

{
  void *pvVar1;
  void *pvVar2;
  byte *in_x1;
  undefined8 *in_x8;
  void *pvVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 uVar6;
  
  pvVar1 = operator_new(0x50);
  *in_x8 = pvVar1;
  in_x8[1] = param_1 + 8;
  *(undefined1 *)(in_x8 + 2) = 0;
  *(undefined8 *)((long)pvVar1 + 0x20) = 0;
  *(undefined8 *)((long)pvVar1 + 0x28) = 0;
  *(undefined8 *)((long)pvVar1 + 0x30) = 0;
  if ((*in_x1 & 1) == 0) {
    *(undefined8 *)((long)pvVar1 + 0x30) = *(undefined8 *)(in_x1 + 0x10);
    uVar6 = *(undefined8 *)in_x1;
    *(undefined8 *)((long)pvVar1 + 0x28) = *(undefined8 *)(in_x1 + 8);
    *(undefined8 *)((long)pvVar1 + 0x20) = uVar6;
  }
  else {
    uVar4 = *(ulong *)(in_x1 + 8);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 008f47f4 to 008f47fb has its CatchHandler @ 008f4818 */
                    /* WARNING: Subroutine does not return */
      __basic_string_common<true>::__throw_length_error();
    }
    pvVar3 = *(void **)(in_x1 + 0x10);
    if (uVar4 < 0x17) {
      pvVar2 = (void *)((long)pvVar1 + 0x21);
      *(char *)((long)pvVar1 + 0x20) = (char)((int)uVar4 << 1);
      if (uVar4 != 0) goto LAB_008f4734;
    }
    else {
      uVar5 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008f471c to 008f4723 has its CatchHandler @ 008f4818 */
      pvVar2 = operator_new(uVar5);
      *(ulong *)((long)pvVar1 + 0x28) = uVar4;
      *(void **)((long)pvVar1 + 0x30) = pvVar2;
      *(ulong *)((long)pvVar1 + 0x20) = uVar5 | 1;
LAB_008f4734:
      memcpy(pvVar2,pvVar3,uVar4);
    }
    *(undefined1 *)((long)pvVar2 + uVar4) = 0;
  }
  *(undefined8 *)((long)pvVar1 + 0x38) = 0;
  *(undefined8 *)((long)pvVar1 + 0x40) = 0;
  *(undefined8 *)((long)pvVar1 + 0x48) = 0;
  if ((in_x1[0x18] & 1) == 0) {
    *(undefined8 *)((long)pvVar1 + 0x48) = *(undefined8 *)(in_x1 + 0x28);
    uVar6 = *(undefined8 *)(in_x1 + 0x18);
    *(undefined8 *)((long)pvVar1 + 0x40) = *(undefined8 *)(in_x1 + 0x20);
    *(undefined8 *)((long)pvVar1 + 0x38) = uVar6;
    goto LAB_008f47d4;
  }
  uVar4 = *(ulong *)(in_x1 + 0x20);
  if (0xffffffffffffffef < uVar4) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008f47fc to 008f47ff has its CatchHandler @ 008f4800 */
    __basic_string_common<true>::__throw_length_error();
  }
  pvVar3 = *(void **)(in_x1 + 0x28);
  if (uVar4 < 0x17) {
    pvVar2 = (void *)((long)pvVar1 + 0x39);
    *(char *)((long)pvVar1 + 0x38) = (char)((int)uVar4 << 1);
    if (uVar4 != 0) goto LAB_008f47c0;
  }
  else {
    uVar5 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008f47a8 to 008f47af has its CatchHandler @ 008f4800 */
    pvVar2 = operator_new(uVar5);
    *(ulong *)((long)pvVar1 + 0x40) = uVar4;
    *(void **)((long)pvVar1 + 0x48) = pvVar2;
    *(ulong *)((long)pvVar1 + 0x38) = uVar5 | 1;
LAB_008f47c0:
    memcpy(pvVar2,pvVar3,uVar4);
  }
  *(undefined1 *)((long)pvVar2 + uVar4) = 0;
LAB_008f47d4:
  *(undefined1 *)(in_x8 + 2) = 1;
  return;
}

