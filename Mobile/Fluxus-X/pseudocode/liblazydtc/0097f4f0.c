/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097f4f0
 */

/* std::__ndk1::shared_ptr<ix::HttpResponse>
   std::__ndk1::shared_ptr<ix::HttpResponse>::make_shared<int, char const (&) [10],
   ix::HttpErrorCode, std::__ndk1::map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   > >(int&&, char const (&) [10], ix::HttpErrorCode&&,
   std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > >&&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&&) */

void __thiscall
std::__ndk1::shared_ptr<ix::HttpResponse>::
make_shared<int,char_const(&)[10],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
          (shared_ptr<ix::HttpResponse> *this,int *param_1,char *param_2,HttpErrorCode *param_3,
          map *param_4,basic_string_conflict *param_5)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar3;
  size_t __n;
  undefined8 *in_x8;
  void *__dest;
  ulong uVar4;
  ulong local_98 [2];
  void *local_88;
  ulong local_80;
  size_t local_78;
  void *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  puVar3 = operator_new(0x98);
  puVar3[2] = 0;
  *puVar3 = &PTR____shared_ptr_emplace_00c51878;
  puVar3[1] = 0;
  iVar1 = *(int *)this;
  local_80 = 0;
  local_78 = 0;
  local_70 = (void *)0x0;
  __n = strlen((char *)param_1);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 0097f680 to 0097f687 has its CatchHandler @ 0097f68c */
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_80 | 1);
    local_80 = CONCAT71(local_80._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_0097f5f4;
  }
  else {
    uVar4 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097f5b4 to 0097f5bb has its CatchHandler @ 0097f68c */
    __dest = operator_new(uVar4);
    local_80 = uVar4 | 1;
    local_78 = __n;
    local_70 = __dest;
  }
  memcpy(__dest,param_1,__n);
LAB_0097f5f4:
  *(undefined1 *)((long)__dest + __n) = 0;
  local_98[0] = 0;
  local_98[1] = 0;
  local_88 = (void *)0x0;
                    /* try { // try from 0097f604 to 0097f62b has its CatchHandler @ 0097f694 */
  ix::HttpResponse::HttpResponse
            ((HttpResponse *)(puVar3 + 3),iVar1,(basic_string_conflict *)&local_80,
             (HttpErrorCode *)param_2,(map *)param_3,(basic_string_conflict *)param_4,
             (basic_string_conflict *)local_98,0,0);
  if ((local_98[0] & 1) != 0) {
    operator_delete(local_88);
  }
  if ((local_80 & 1) != 0) {
    operator_delete(local_70);
  }
  *in_x8 = (HttpResponse *)(puVar3 + 3);
  in_x8[1] = puVar3;
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

