/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ec334
 */

/* cpr::Session::prepareCommon() */

void cpr::Session::prepareCommon(void)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this;
  undefined7 *puVar1;
  __ndk1 _Var2;
  long lVar3;
  ulong __n;
  long in_x0;
  byte *pbVar4;
  basic_string_conflict *in_x2;
  size_t __n_00;
  ulong uVar5;
  long lVar6;
  byte *pbVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  void *pvVar12;
  __ndk1 local_b0 [16];
  undefined7 *local_a0;
  undefined **local_98;
  __ndk1 local_90;
  undefined7 uStack_8f;
  undefined1 uStack_88;
  undefined7 uStack_87;
  undefined7 *local_80;
  basic_string_conflict local_78 [8];
  ulong local_70;
  void *local_68;
  __ndk1 local_60;
  undefined7 uStack_5f;
  undefined7 *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  SetHeaderInternal();
  CurlContainer<cpr::Parameter>::GetContent((CurlHolder *)(in_x0 + 0x48));
  uVar11 = (ulong)((byte)local_78[0] >> 1);
  if (((byte)local_78[0] & 1) != 0) {
    uVar11 = local_70;
  }
  if (uVar11 == 0) {
    if ((*(byte *)(in_x0 + 0x30) & 1) == 0) {
      lVar6 = in_x0 + 0x31;
    }
    else {
      lVar6 = *(long *)(in_x0 + 0x40);
    }
                    /* try { // try from 008ec490 to 008ec497 has its CatchHandler @ 008ec80c */
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2712,lVar6);
LAB_008ec498:
    uVar11 = (ulong)*(byte *)(in_x0 + 0x30);
    if ((*(byte *)(in_x0 + 0x30) & 1) != 0) goto LAB_008ec460;
LAB_008ec4a0:
    pvVar8 = (void *)(in_x0 + 0x31);
    __n_00 = uVar11 >> 1;
    if (__n_00 != 0) goto LAB_008ec4ac;
LAB_008ec468:
    uVar5 = 0xffffffffffffffff;
  }
  else {
                    /* try { // try from 008ec38c to 008ec39f has its CatchHandler @ 008ec854 */
    std::__ndk1::operator+
              ((__ndk1 *)(in_x0 + 0x30),(basic_string_conflict *)&DAT_002a35cf,(char *)in_x2);
    local_b0[0] = local_60;
    local_a0 = local_50;
                    /* try { // try from 008ec3d0 to 008ec3db has its CatchHandler @ 008ec830 */
    std::__ndk1::operator+(local_b0,local_78,in_x2);
    local_90 = local_60;
    local_80 = local_50;
    local_98 = &PTR_LAB_00c48988;
    if (((byte)local_b0[0] & 1) != 0) {
      operator_delete(local_a0);
    }
    puVar1 = local_80;
    if (((byte)local_90 & 1) == 0) {
      puVar1 = &uStack_8f;
    }
                    /* try { // try from 008ec438 to 008ec43f has its CatchHandler @ 008ec814 */
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2712,puVar1);
    local_98 = &PTR_LAB_00c489d0;
    if (((byte)local_90 & 1) == 0) goto LAB_008ec498;
    operator_delete(local_80);
    _Var2 = *(__ndk1 *)(in_x0 + 0x30);
    uVar11 = (ulong)(byte)_Var2;
    if (((byte)_Var2 & 1) == 0) goto LAB_008ec4a0;
LAB_008ec460:
    __n_00 = *(size_t *)(in_x0 + 0x38);
    pvVar8 = *(void **)(in_x0 + 0x40);
    if (__n_00 == 0) goto LAB_008ec468;
LAB_008ec4ac:
    pvVar12 = memchr(pvVar8,0x3a,__n_00);
    uVar5 = (long)pvVar12 - (long)pvVar8;
    if (pvVar12 == (void *)0x0) {
      uVar5 = 0xffffffffffffffff;
    }
  }
  local_98 = (undefined **)0x0;
  local_90 = (__ndk1)0x0;
  uStack_8f = 0;
  uStack_88 = 0;
  uStack_87 = 0;
  pvVar8 = *(void **)(in_x0 + 0x40);
  __n = uVar11 >> 1;
  if ((uVar11 & 1) == 0) {
    pvVar8 = (void *)(in_x0 + 0x31);
  }
  else {
    __n = *(ulong *)(in_x0 + 0x38);
  }
  if (uVar5 <= __n) {
    __n = uVar5;
  }
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 008ec7dc to 008ec7e3 has its CatchHandler @ 008ec810 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    pvVar12 = (void *)((ulong)&local_98 | 1);
    local_98 = (undefined **)(ulong)(byte)((int)__n << 1);
    if (__n == 0) goto LAB_008ec540;
  }
  else {
    uVar11 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ec518 to 008ec51f has its CatchHandler @ 008ec810 */
    pvVar12 = operator_new(uVar11);
    local_98 = (undefined **)(uVar11 | 1);
    local_90 = SUB81(__n,0);
    uStack_8f = (undefined7)(__n >> 8);
    uStack_88 = SUB81(pvVar12,0);
    uStack_87 = (undefined7)((ulong)pvVar12 >> 8);
  }
  memcpy(pvVar12,pvVar8,__n);
LAB_008ec540:
  *(undefined1 *)((long)pvVar12 + __n) = 0;
                    /* try { // try from 008ec548 to 008ec623 has its CatchHandler @ 008ec868 */
  uVar11 = Proxies::has((Proxies *)(in_x0 + 0x68),(basic_string_conflict *)&local_98);
  if ((uVar11 & 1) != 0) {
    uVar9 = **(undefined8 **)(in_x0 + 0x18);
    pbVar4 = (byte *)Proxies::operator[]((Proxies *)(in_x0 + 0x68),
                                         (basic_string_conflict *)&local_98);
    pbVar7 = *(byte **)(pbVar4 + 0x10);
    if ((*pbVar4 & 1) == 0) {
      pbVar7 = pbVar4 + 1;
    }
    curl_easy_setopt(uVar9,0x2714,pbVar7);
    uVar11 = ProxyAuthentication::has
                       ((ProxyAuthentication *)(in_x0 + 0x80),(basic_string_conflict *)&local_98);
    if ((uVar11 & 1) != 0) {
      curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x6f,0xffffffffffffffef);
      uVar10 = **(undefined8 **)(in_x0 + 0x18);
      uVar9 = ProxyAuthentication::operator[]
                        ((ProxyAuthentication *)(in_x0 + 0x80),(basic_string_conflict *)&local_98);
      curl_easy_setopt(uVar10,0x2716,uVar9);
    }
  }
  uVar11 = AcceptEncoding::empty((AcceptEncoding *)(in_x0 + 0xb0));
  if ((uVar11 & 1) == 0) {
    uVar11 = AcceptEncoding::disabled();
    uVar9 = **(undefined8 **)(in_x0 + 0x18);
    if ((uVar11 & 1) == 0) {
                    /* try { // try from 008ec628 to 008ec637 has its CatchHandler @ 008ec808 */
      AcceptEncoding::getString();
      puVar1 = (undefined7 *)((ulong)&local_60 | 1);
      if (((byte)local_60 & 1) != 0) {
        puVar1 = local_50;
      }
                    /* try { // try from 008ec64c to 008ec657 has its CatchHandler @ 008ec7e8 */
      curl_easy_setopt(uVar9,0x2776,puVar1);
      if (((byte)local_60 & 1) != 0) {
        operator_delete(local_50);
      }
    }
    else {
      curl_easy_setopt(uVar9,0x2776,0);
    }
  }
  else {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2776,&DAT_002ab32c);
  }
  local_60 = (__ndk1)0x0;
  uStack_5f = 0;
                    /* try { // try from 008ec674 to 008ec67f has its CatchHandler @ 008ec864 */
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0xd8,&local_60);
  uVar9 = CONCAT71(uStack_5f,local_60);
                    /* try { // try from 008ec68c to 008ec793 has its CatchHandler @ 008ec86c */
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0xd8,0x10);
  if (((uint)uVar9 >> 1 & 1) != 0) {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0xd8,2);
  }
  this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         (in_x0 + 0x248);
  *(undefined1 *)(*(long *)(in_x0 + 0x18) + 0x20) = 0;
  if ((*(byte *)(in_x0 + 0x248) & 1) == 0) {
    *(undefined2 *)this = 0;
    uVar11 = *(ulong *)(in_x0 + 0x240);
  }
  else {
    **(undefined1 **)(in_x0 + 600) = 0;
    *(undefined8 *)(in_x0 + 0x250) = 0;
    uVar11 = *(ulong *)(in_x0 + 0x240);
  }
  if (uVar11 != 0) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    reserve(this,uVar11);
  }
  if ((*(byte *)(in_x0 + 0x260) & 1) == 0) {
    *(undefined2 *)(in_x0 + 0x260) = 0;
    lVar6 = *(long *)(in_x0 + 400);
  }
  else {
    **(undefined1 **)(in_x0 + 0x270) = 0;
    *(undefined8 *)(in_x0 + 0x268) = 0;
    lVar6 = *(long *)(in_x0 + 400);
  }
  if (lVar6 == 0) {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x4e2b,util::writeFunction);
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2711,this);
  }
  if (*(long *)(in_x0 + 0x150) == 0) {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x4e6f,util::writeFunction);
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x272d,(undefined2 *)(in_x0 + 0x260));
  }
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0xac,1);
  if (((ulong)local_98 & 1) != 0) {
    operator_delete((void *)CONCAT71(uStack_87,uStack_88));
  }
  if (((byte)local_78[0] & 1) != 0) {
    operator_delete(local_68);
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

