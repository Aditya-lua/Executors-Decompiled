/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6dcc
 */

/* std::__ndk1::unique_ptr<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*>,
   std::__ndk1::__hash_node_destructor<std::__ndk1::allocator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*> > > >
   std::__ndk1::__hash_table<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::__construct_node_hash<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>(unsigned long, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void std::__ndk1::
     __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
     ::
     __construct_node_hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
               (ulong param_1,basic_string_conflict *param_2)

{
  void *pvVar1;
  void *__dest;
  byte *in_x2;
  undefined8 *in_x8;
  undefined8 *puVar2;
  ulong __n;
  void *__src;
  ulong uVar3;
  undefined8 uVar4;
  
  pvVar1 = operator_new(0x28);
  *in_x8 = pvVar1;
  in_x8[1] = param_1 + 0x10;
  *(undefined1 *)(in_x8 + 2) = 0;
  *(undefined8 *)((long)pvVar1 + 0x10) = 0;
  *(undefined8 *)((long)pvVar1 + 0x18) = 0;
  *(undefined8 *)((long)pvVar1 + 0x20) = 0;
  if ((*in_x2 & 1) == 0) {
    *(undefined8 *)((long)pvVar1 + 0x20) = *(undefined8 *)(in_x2 + 0x10);
    uVar4 = *(undefined8 *)in_x2;
    *(undefined8 *)((long)pvVar1 + 0x18) = *(undefined8 *)(in_x2 + 8);
    *(undefined8 *)((long)pvVar1 + 0x10) = uVar4;
    goto LAB_008e6e8c;
  }
  __n = *(ulong *)(in_x2 + 8);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008e6eb4 to 008e6eb7 has its CatchHandler @ 008e6eb8 */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(in_x2 + 0x10);
  if (__n < 0x17) {
    __dest = (void *)((long)pvVar1 + 0x11);
    *(char *)((long)pvVar1 + 0x10) = (char)((int)__n << 1);
    if (__n != 0) goto LAB_008e6e78;
  }
  else {
    uVar3 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e6e60 to 008e6e67 has its CatchHandler @ 008e6eb8 */
    __dest = operator_new(uVar3);
    *(ulong *)((long)pvVar1 + 0x18) = __n;
    *(void **)((long)pvVar1 + 0x20) = __dest;
    *(ulong *)((long)pvVar1 + 0x10) = uVar3 | 1;
LAB_008e6e78:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_008e6e8c:
  puVar2 = (undefined8 *)*in_x8;
  *(undefined1 *)(in_x8 + 2) = 1;
  *puVar2 = 0;
  puVar2[1] = param_2;
  return;
}

