/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6314
 */

/* std::__ndk1::unique_ptr<std::__ndk1::__tree_node<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   void*>,
   std::__ndk1::__tree_node_destructor<std::__ndk1::allocator<std::__ndk1::__tree_node<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   void*> > > > std::__ndk1::__tree<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::__map_value_compare<cpr::AcceptEncodingMethods,
   std::__ndk1::__value_type<cpr::AcceptEncodingMethods, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::less<cpr::AcceptEncodingMethods>, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > >::__construct_node<std::__ndk1::pair<cpr::AcceptEncodingMethods const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   const&>(std::__ndk1::pair<cpr::AcceptEncodingMethods const, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void std::__ndk1::
     __tree<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<cpr::AcceptEncodingMethods,std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
     ::
     __construct_node<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
               (pair *param_1)

{
  void *pvVar1;
  void *__dest;
  undefined4 *in_x1;
  undefined8 *in_x8;
  ulong __n;
  void *__src;
  ulong uVar2;
  undefined8 uVar3;
  
  pvVar1 = operator_new(0x40);
  *in_x8 = pvVar1;
  in_x8[1] = param_1 + 8;
  *(undefined1 *)(in_x8 + 2) = 0;
  *(undefined4 *)((long)pvVar1 + 0x20) = *in_x1;
  *(undefined8 *)((long)pvVar1 + 0x28) = 0;
  *(undefined8 *)((long)pvVar1 + 0x30) = 0;
  *(undefined8 *)((long)pvVar1 + 0x38) = 0;
  if ((*(byte *)(in_x1 + 2) & 1) == 0) {
    *(undefined8 *)((long)pvVar1 + 0x38) = *(undefined8 *)(in_x1 + 6);
    uVar3 = *(undefined8 *)(in_x1 + 2);
    *(undefined8 *)((long)pvVar1 + 0x30) = *(undefined8 *)(in_x1 + 4);
    *(undefined8 *)((long)pvVar1 + 0x28) = uVar3;
    goto LAB_008e63d8;
  }
  __n = *(ulong *)(in_x1 + 4);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008e63f4 to 008e63f7 has its CatchHandler @ 008e63f8 */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(in_x1 + 6);
  if (__n < 0x17) {
    __dest = (void *)((long)pvVar1 + 0x29);
    *(char *)((long)pvVar1 + 0x28) = (char)((int)__n << 1);
    if (__n != 0) goto LAB_008e63c4;
  }
  else {
    uVar2 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e63ac to 008e63b3 has its CatchHandler @ 008e63f8 */
    __dest = operator_new(uVar2);
    *(ulong *)((long)pvVar1 + 0x30) = __n;
    *(void **)((long)pvVar1 + 0x38) = __dest;
    *(ulong *)((long)pvVar1 + 0x28) = uVar2 | 1;
LAB_008e63c4:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_008e63d8:
  *(undefined1 *)(in_x8 + 2) = 1;
  return;
}

