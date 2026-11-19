/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eca00
 */

/* cpr::Session::prepareCommonDownload() */

void cpr::Session::prepareCommonDownload(void)

{
  undefined7 *puVar1;
  __ndk1 _Var2;
  long lVar3;
  ulong __n;
  long in_x0;
  byte *pbVar4;
  basic_string_conflict *in_x2;
  long lVar5;
  size_t __n_00;
  ulong uVar6;
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
  undefined7 *puStack_50;
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
      lVar5 = in_x0 + 0x31;
    }
    else {
      lVar5 = *(long *)(in_x0 + 0x40);
    }
                    /* try { // try from 008ecb5c to 008ecb63 has its CatchHandler @ 008ecd78 */
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2712,lVar5);
LAB_008ecb64:
    uVar11 = (ulong)*(byte *)(in_x0 + 0x30);
    if ((*(byte *)(in_x0 + 0x30) & 1) != 0) goto LAB_008ecb2c;
LAB_008ecb6c:
    pvVar8 = (void *)(in_x0 + 0x31);
    __n_00 = uVar11 >> 1;
    if (__n_00 == 0) goto LAB_008ecb34;
LAB_008ecb78:
    pvVar12 = memchr(pvVar8,0x3a,__n_00);
    uVar6 = (long)pvVar12 - (long)pvVar8;
    if (pvVar12 == (void *)0x0) {
      uVar6 = 0xffffffffffffffff;
    }
  }
  else {
                    /* try { // try from 008eca58 to 008eca6b has its CatchHandler @ 008ecdcc */
    std::__ndk1::operator+
              ((__ndk1 *)(in_x0 + 0x30),(basic_string_conflict *)&DAT_002a35cf,(char *)in_x2);
    local_b0[0] = local_60;
    local_a0 = puStack_50;
                    /* try { // try from 008eca9c to 008ecaa7 has its CatchHandler @ 008ecd9c */
    std::__ndk1::operator+(local_b0,local_78,in_x2);
    local_90 = local_60;
    local_80 = puStack_50;
    local_98 = &PTR_LAB_00c48988;
    if (((byte)local_b0[0] & 1) != 0) {
      operator_delete(local_a0);
    }
    puVar1 = local_80;
    if (((byte)local_90 & 1) == 0) {
      puVar1 = &uStack_8f;
    }
                    /* try { // try from 008ecb04 to 008ecb0b has its CatchHandler @ 008ecd80 */
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2712,puVar1);
    local_98 = &PTR_LAB_00c489d0;
    if (((byte)local_90 & 1) == 0) goto LAB_008ecb64;
    operator_delete(local_80);
    _Var2 = *(__ndk1 *)(in_x0 + 0x30);
    uVar11 = (ulong)(byte)_Var2;
    if (((byte)_Var2 & 1) == 0) goto LAB_008ecb6c;
LAB_008ecb2c:
    __n_00 = *(size_t *)(in_x0 + 0x38);
    pvVar8 = *(void **)(in_x0 + 0x40);
    if (__n_00 != 0) goto LAB_008ecb78;
LAB_008ecb34:
    uVar6 = 0xffffffffffffffff;
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
  if (uVar6 <= __n) {
    __n = uVar6;
  }
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 008ecd6c to 008ecd73 has its CatchHandler @ 008ecd7c */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    pvVar12 = (void *)((ulong)&local_98 | 1);
    local_98 = (undefined **)(ulong)(byte)((int)__n << 1);
    if (__n == 0) goto LAB_008ecc0c;
  }
  else {
    uVar11 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ecbe4 to 008ecbeb has its CatchHandler @ 008ecd7c */
    pvVar12 = operator_new(uVar11);
    local_98 = (undefined **)(uVar11 | 1);
    local_90 = SUB81(__n,0);
    uStack_8f = (undefined7)(__n >> 8);
    uStack_88 = SUB81(pvVar12,0);
    uStack_87 = (undefined7)((ulong)pvVar12 >> 8);
  }
  memcpy(pvVar12,pvVar8,__n);
LAB_008ecc0c:
  *(undefined1 *)((long)pvVar12 + __n) = 0;
                    /* try { // try from 008ecc14 to 008ecd67 has its CatchHandler @ 008ecddc */
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
  *(undefined1 *)(*(long *)(in_x0 + 0x18) + 0x20) = 0;
  if ((*(byte *)(in_x0 + 0x260) & 1) == 0) {
    *(undefined2 *)(in_x0 + 0x260) = 0;
  }
  else {
    **(undefined1 **)(in_x0 + 0x270) = 0;
    *(undefined8 *)(in_x0 + 0x268) = 0;
  }
  if (*(long *)(in_x0 + 0x150) == 0) {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x4e6f,util::writeFunction);
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x272d,(undefined2 *)(in_x0 + 0x260));
  }
  else {
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x4e6f,util::headerUserFunction);
    curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x272d,in_x0 + 0x120);
  }
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

