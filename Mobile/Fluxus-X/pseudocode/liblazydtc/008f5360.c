/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5360
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
   >::__construct_node<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void std::__ndk1::
     __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
     ::
     __construct_node<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
               (basic_string_conflict *param_1)

{
  long lVar1;
  void *pvVar2;
  void *__dest;
  undefined8 uVar3;
  byte *in_x1;
  undefined8 *in_x8;
  undefined8 *puVar4;
  ulong uVar5;
  void *__src;
  ulong uVar6;
  __murmur2_or_cityhash<unsigned_long,64ul> a_Stack_60 [8];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  pvVar2 = operator_new(0x28);
  *in_x8 = pvVar2;
  in_x8[1] = param_1 + 0x10;
  *(undefined1 *)(in_x8 + 2) = 0;
  *(undefined8 *)((long)pvVar2 + 0x10) = 0;
  *(undefined8 *)((long)pvVar2 + 0x18) = 0;
  *(undefined8 *)((long)pvVar2 + 0x20) = 0;
  if ((*in_x1 & 1) == 0) {
    *(undefined8 *)((long)pvVar2 + 0x20) = *(undefined8 *)(in_x1 + 0x10);
    uVar3 = *(undefined8 *)in_x1;
    *(undefined8 *)((long)pvVar2 + 0x18) = *(undefined8 *)(in_x1 + 8);
    *(undefined8 *)((long)pvVar2 + 0x10) = uVar3;
    goto LAB_008f542c;
  }
  uVar5 = *(ulong *)(in_x1 + 8);
  if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008f5490 to 008f5493 has its CatchHandler @ 008f5494 */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(in_x1 + 0x10);
  if (uVar5 < 0x17) {
    __dest = (void *)((long)pvVar2 + 0x11);
    *(char *)((long)pvVar2 + 0x10) = (char)((int)uVar5 << 1);
    if (uVar5 != 0) goto LAB_008f5418;
  }
  else {
    uVar6 = uVar5 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008f5400 to 008f5407 has its CatchHandler @ 008f5494 */
    __dest = operator_new(uVar6);
    *(ulong *)((long)pvVar2 + 0x18) = uVar5;
    *(void **)((long)pvVar2 + 0x20) = __dest;
    *(ulong *)((long)pvVar2 + 0x10) = uVar6 | 1;
LAB_008f5418:
    memcpy(__dest,__src,uVar5);
  }
  *(undefined1 *)((long)__dest + uVar5) = 0;
LAB_008f542c:
  puVar4 = (undefined8 *)*in_x8;
  *(undefined1 *)(in_x8 + 2) = 1;
  uVar5 = (ulong)(*(byte *)(puVar4 + 2) >> 1);
  pvVar2 = (void *)((long)puVar4 + 0x11);
  if ((*(byte *)(puVar4 + 2) & 1) != 0) {
    uVar5 = puVar4[3];
    pvVar2 = (void *)puVar4[4];
  }
                    /* try { // try from 008f5454 to 008f545b has its CatchHandler @ 008f54ac */
  uVar3 = __murmur2_or_cityhash<unsigned_long,64ul>::operator()(a_Stack_60,pvVar2,uVar5);
  *puVar4 = 0;
  puVar4[1] = uVar3;
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

