/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901474
 */

/* cpr::Response::Response(std::__ndk1::shared_ptr<cpr::CurlHolder>, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&&, cpr::Cookies&&, cpr::Error&&)
    */

void __thiscall
cpr::Response::Response
          (Response *this,undefined8 *param_2,undefined8 *param_3,basic_string_conflict *param_4,
          Response *param_5,undefined4 *param_6)

{
  Response RVar1;
  long lVar2;
  char *__src;
  size_t __n;
  void *__dest;
  Response *pRVar3;
  Response *pRVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined **local_90;
  undefined8 local_88;
  size_t sStack_80;
  void *local_78;
  char *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar6 = *param_2;
  *(undefined8 *)(this + 8) = param_2[1];
  *(undefined8 *)this = uVar6;
  *param_2 = 0;
  param_2[1] = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x28) = param_3[2];
  uVar6 = *param_3;
  *(undefined8 *)(this + 0x20) = param_3[1];
  *(undefined8 *)(this + 0x18) = uVar6;
  param_3[1] = 0;
  param_3[2] = 0;
  *param_3 = 0;
  pRVar4 = this + 0x50;
  *(undefined8 *)pRVar4 = 0;
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined ***)(this + 0x48) = &PTR_LAB_00c48988;
  pRVar3 = this + 0x38;
  *(undefined8 *)pRVar3 = 0;
  *(undefined8 *)(this + 0x58) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(Response **)(this + 0x30) = pRVar3;
  *(undefined8 *)(this + 0x68) = 0;
  RVar1 = *param_5;
  *(undefined8 *)(this + 0x80) = 0;
  *(undefined8 *)(this + 0x88) = 0;
  *(undefined8 *)(this + 0x78) = 0;
  this[0x70] = RVar1;
  uVar6 = *(undefined8 *)(param_5 + 8);
  *(undefined8 *)(this + 0x80) = *(undefined8 *)(param_5 + 0x10);
  *(undefined8 *)(this + 0x78) = uVar6;
  *(undefined8 *)(this + 0x88) = *(undefined8 *)(param_5 + 0x18);
  *(undefined8 *)(param_5 + 8) = 0;
  *(undefined8 *)(param_5 + 0x10) = 0;
  *(undefined8 *)(param_5 + 0x18) = 0;
  *(undefined4 *)(this + 0x90) = *param_6;
  *(undefined8 *)(this + 0xa8) = *(undefined8 *)(param_6 + 6);
  uVar6 = *(undefined8 *)(param_6 + 2);
  *(undefined8 *)(this + 0xa0) = *(undefined8 *)(param_6 + 4);
  *(undefined8 *)(this + 0x98) = uVar6;
  *(undefined8 *)(param_6 + 4) = 0;
  *(undefined8 *)(param_6 + 6) = 0;
  *(undefined8 *)(param_6 + 2) = 0;
  *(undefined8 *)(this + 0xc0) = *(undefined8 *)(param_4 + 0x10);
  uVar6 = *(undefined8 *)param_4;
  *(undefined8 *)(this + 0xb8) = *(undefined8 *)(param_4 + 8);
  *(undefined8 *)(this + 0xb0) = uVar6;
  *(undefined8 *)param_4 = 0;
  *(undefined8 *)(param_4 + 8) = 0;
  *(undefined8 *)(param_4 + 0x10) = 0;
  memset((basic_string_conflict *)(this + 200),0,0x48);
                    /* try { // try from 00901584 to 0090159f has its CatchHandler @ 009017a0 */
  util::parseHeader((util *)(this + 0xb0),(basic_string_conflict *)(this + 200),
                    (basic_string_conflict *)(this + 0xe0),param_4);
  FUN_00827168(this + 0x30,*(undefined8 *)(this + 0x38));
  *(undefined ***)(this + 0x30) = local_90;
  *(ulong *)(this + 0x38) = local_88;
  *(size_t *)(this + 0x40) = sStack_80;
  if (sStack_80 == 0) {
    *(Response **)(this + 0x30) = pRVar3;
  }
  else {
    local_90 = (undefined **)&local_88;
    *(Response **)(local_88 + 0x10) = pRVar3;
    local_88 = 0;
    sStack_80 = 0;
  }
  FUN_00827168(&local_90,local_88);
                    /* try { // try from 009015ec to 00901613 has its CatchHandler @ 009017a4 */
  curl_easy_getinfo(**(undefined8 **)this,0x200002,this + 0x10);
  curl_easy_getinfo(**(undefined8 **)this,&DAT_00300003,this + 0x68);
  local_70 = (char *)0x0;
                    /* try { // try from 00901620 to 0090162f has its CatchHandler @ 009017a8 */
  curl_easy_getinfo(**(undefined8 **)this,0x100001,&local_70);
  __src = local_70;
  local_90 = &PTR_LAB_00c489d0;
  local_88 = 0;
  sStack_80 = 0;
  local_78 = (void *)0x0;
  __n = strlen(local_70);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 0090178c to 00901797 has its CatchHandler @ 0090179c */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((long)&local_88 + 1);
    local_88 = CONCAT71(local_88._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_009016b8;
  }
  else {
    uVar5 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0090168c to 00901693 has its CatchHandler @ 0090179c */
    __dest = operator_new(uVar5);
    local_88 = uVar5 | 1;
    sStack_80 = __n;
    local_78 = __dest;
  }
  memcpy(__dest,__src,__n);
LAB_009016b8:
  *(undefined1 *)((long)__dest + __n) = 0;
  local_90 = &PTR_LAB_00c48988;
  if (((byte)*pRVar4 & 1) == 0) {
    *(undefined2 *)pRVar4 = 0;
  }
  else {
    **(undefined1 **)(this + 0x60) = 0;
    *(undefined8 *)(this + 0x58) = 0;
    if (((byte)this[0x50] & 1) != 0) {
      operator_delete(*(void **)(this + 0x60));
      *(undefined8 *)(this + 0x50) = 0;
    }
  }
  *(void **)(this + 0x60) = local_78;
  *(size_t *)(this + 0x58) = sStack_80;
  *(ulong *)pRVar4 = local_88;
                    /* try { // try from 00901718 to 00901757 has its CatchHandler @ 009017a8 */
  curl_easy_getinfo(**(undefined8 **)this,&DAT_00600008,this + 0x100);
  curl_easy_getinfo(**(undefined8 **)this,&DAT_00600007,this + 0xf8);
  curl_easy_getinfo(**(undefined8 **)this,0x200014,this + 0x108);
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

