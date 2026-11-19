/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992324
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
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >, ix::CaseInsensitiveLess, true>,
   std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >
   >::__construct_node<std::__ndk1::piecewise_construct_t const&,
   std::__ndk1::tuple<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>, std::__ndk1::tuple<> >(std::__ndk1::piecewise_construct_t
   const&, std::__ndk1::tuple<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>&&, std::__ndk1::tuple<>&&) */

void __thiscall
std::__ndk1::
__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
::
__construct_node<std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>>
          (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           *this,piecewise_construct_t *param_1,tuple *param_2,tuple *param_3)

{
  void *pvVar1;
  void *__dest;
  undefined8 *in_x8;
  byte *pbVar2;
  ulong __n;
  void *__src;
  ulong uVar3;
  undefined8 uVar4;
  
  pvVar1 = operator_new(0x50);
  *in_x8 = pvVar1;
  in_x8[1] = this + 8;
  *(undefined1 *)(in_x8 + 2) = 0;
  pbVar2 = *(byte **)param_2;
  *(undefined8 *)((long)pvVar1 + 0x20) = 0;
  *(undefined8 *)((long)pvVar1 + 0x28) = 0;
  *(undefined8 *)((long)pvVar1 + 0x30) = 0;
  if ((*pbVar2 & 1) == 0) {
    *(undefined8 *)((long)pvVar1 + 0x30) = *(undefined8 *)(pbVar2 + 0x10);
    uVar4 = *(undefined8 *)pbVar2;
    *(undefined8 *)((long)pvVar1 + 0x28) = *(undefined8 *)(pbVar2 + 8);
    *(undefined8 *)((long)pvVar1 + 0x20) = uVar4;
    goto LAB_009923e0;
  }
  __n = *(ulong *)(pbVar2 + 8);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00992404 to 00992407 has its CatchHandler @ 00992408 */
    __basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(pbVar2 + 0x10);
  if (__n < 0x17) {
    __dest = (void *)((long)pvVar1 + 0x21);
    *(char *)((long)pvVar1 + 0x20) = (char)((int)__n << 1);
    if (__n != 0) goto LAB_009923cc;
  }
  else {
    uVar3 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009923b4 to 009923bb has its CatchHandler @ 00992408 */
    __dest = operator_new(uVar3);
    *(ulong *)((long)pvVar1 + 0x28) = __n;
    *(void **)((long)pvVar1 + 0x30) = __dest;
    *(ulong *)((long)pvVar1 + 0x20) = uVar3 | 1;
LAB_009923cc:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_009923e0:
  *(undefined8 *)((long)pvVar1 + 0x40) = 0;
  *(undefined8 *)((long)pvVar1 + 0x48) = 0;
  *(undefined8 *)((long)pvVar1 + 0x38) = 0;
  *(undefined1 *)(in_x8 + 2) = 1;
  return;
}

