/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eb760
 */

/* cpr::Session::Session() */

void __thiscall cpr::Session::Session(Session *this)

{
  long lVar1;
  CurlHolder *this_00;
  undefined8 *puVar2;
  long lVar3;
  size_t __n;
  ulong *puVar4;
  char *__s;
  void *pvVar5;
  ulong uVar6;
  ulong local_90;
  ulong uStack_88;
  void *local_80;
  ulong local_70;
  size_t local_68;
  void *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  *(undefined8 *)this = 0;
  *(undefined8 *)(this + 8) = 0;
  *(undefined2 *)(this + 0x10) = 0;
                    /* try { // try from 008eb794 to 008eb79b has its CatchHandler @ 008eba64 */
  this_00 = operator_new(0x120);
                    /* try { // try from 008eb7a0 to 008eb7a3 has its CatchHandler @ 008eba4c */
  CurlHolder::CurlHolder(this_00);
  *(CurlHolder **)(this + 0x18) = this_00;
                    /* try { // try from 008eb7a8 to 008eb7af has its CatchHandler @ 008eba3c */
  puVar2 = operator_new(0x20);
  puVar2[3] = this_00;
  *puVar2 = &PTR____shared_weak_count_00c4f078;
  puVar2[2] = 0;
  puVar2[1] = 0;
  *(undefined8 *)(this + 0x90) = 0;
  *(undefined8 *)(this + 0x88) = 0;
  this[0x48] = (Session)0x1;
  *(undefined8 **)(this + 0x20) = puVar2;
  *(undefined ***)(this + 0x28) = &PTR_LAB_00c48988;
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(undefined8 *)(this + 0x58) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x78) = 0;
  *(undefined8 *)(this + 0x70) = 0;
  *(Session **)(this + 0x68) = this + 0x70;
  *(Session **)(this + 0x80) = this + 0x88;
  *(undefined8 *)(this + 0xa8) = 0;
  *(undefined8 *)(this + 0xa0) = 0;
  *(Session **)(this + 0x98) = this + 0xa0;
  *(undefined8 *)(this + 0xb8) = 0;
  *(undefined8 *)(this + 0xb0) = 0;
  *(undefined4 *)(this + 0xd0) = 0x3f800000;
  *(undefined8 *)(this + 200) = 0;
  *(undefined8 *)(this + 0xc0) = 0;
  *(undefined8 *)(this + 0x110) = 0;
  *(undefined8 *)(this + 0xe8) = 0;
  *(undefined8 *)(this + 0xe0) = 0;
  *(undefined8 *)(this + 0x120) = 0;
  *(undefined8 *)(this + 0x150) = 0;
  *(undefined8 *)(this + 0x160) = 0;
  *(undefined8 *)(this + 400) = 0;
  *(undefined8 *)(this + 0x1a0) = 0;
  *(undefined8 *)(this + 0x1d0) = 0;
  *(undefined8 *)(this + 0x1e0) = 0;
  *(undefined8 *)(this + 0x210) = 0;
  this[0x238] = (Session)0x0;
  this[0x230] = (Session)0x0;
  *(undefined8 *)(this + 0x228) = 0;
  *(undefined8 *)(this + 0x220) = 0;
  memset(this + 0x240,0,0x6a);
                    /* try { // try from 008eb874 to 008eb87b has its CatchHandler @ 008eba34 */
  lVar3 = curl_version_info(0xb);
  __s = *(char **)(lVar3 + 8);
  local_70 = 0;
  local_68 = 0;
  local_60 = (void *)0x0;
  __n = strlen(__s);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 008eba08 to 008eba0f has its CatchHandler @ 008eba14 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    pvVar5 = (void *)((ulong)&local_70 | 1);
    local_70 = CONCAT71(local_70._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_008eb8ec;
  }
  else {
    uVar6 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008eb8c4 to 008eb8cb has its CatchHandler @ 008eba14 */
    pvVar5 = operator_new(uVar6);
    local_70 = uVar6 | 1;
    local_68 = __n;
    local_60 = pvVar5;
  }
  memcpy(pvVar5,__s,__n);
LAB_008eb8ec:
  *(undefined1 *)((long)pvVar5 + __n) = 0;
                    /* try { // try from 008eb8f0 to 008eb907 has its CatchHandler @ 008eba20 */
  puVar4 = (ulong *)std::__ndk1::
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    insert((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            *)&local_70,0,"curl/",5);
  local_80 = (void *)puVar4[2];
  uStack_88 = puVar4[1];
  local_90 = *puVar4;
  puVar4[1] = 0;
  puVar4[2] = 0;
  *puVar4 = 0;
  if ((local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  pvVar5 = (void *)((ulong)&local_90 | 1);
  if ((local_90 & 1) != 0) {
    pvVar5 = local_80;
  }
                    /* try { // try from 008eb950 to 008eb957 has its CatchHandler @ 008eba74 */
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2722,pvVar5);
  local_70 = 0x32;
  local_68 = 0x70001;
                    /* try { // try from 008eb970 to 008eb97b has its CatchHandler @ 008eba1c */
  SetRedirect(this,(Redirect *)&local_70);
                    /* try { // try from 008eb984 to 008eb9cb has its CatchHandler @ 008eba74 */
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2b,1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x271a,*(undefined8 **)(this + 0x18) + 4);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x272f,&DAT_002ab32c);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0xd5,1);
  if ((local_90 & 1) != 0) {
    operator_delete(local_80);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

