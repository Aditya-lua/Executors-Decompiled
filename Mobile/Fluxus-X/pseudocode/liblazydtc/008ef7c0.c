/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef7c0
 */

/* cpr::Session::GetDownloadFileLength() */

undefined8 __thiscall cpr::Session::GetDownloadFileLength(Session *this)

{
  Session SVar1;
  long lVar2;
  int iVar3;
  void *pvVar4;
  byte *pbVar5;
  Session *pSVar6;
  size_t __n;
  ulong uVar7;
  byte *pbVar8;
  ulong __n_00;
  undefined8 uVar9;
  undefined8 uVar10;
  long local_70;
  ulong local_68;
  ulong local_60;
  void *local_58;
  undefined8 local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = 0xffffffffffffffff;
  if (((byte)this[0x30] & 1) == 0) {
    pSVar6 = this + 0x31;
  }
  else {
    pSVar6 = *(Session **)(this + 0x40);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2712,pSVar6);
  SVar1 = this[0x30];
  if (((byte)SVar1 & 1) == 0) {
    pSVar6 = this + 0x31;
    __n = (size_t)((byte)SVar1 >> 1);
    if (__n == 0) goto LAB_008ef850;
LAB_008ef82c:
    pvVar4 = memchr(pSVar6,0x3a,__n);
    uVar7 = (long)pvVar4 - (long)pSVar6;
    if (pvVar4 == (void *)0x0) {
      uVar7 = 0xffffffffffffffff;
    }
  }
  else {
    __n = *(size_t *)(this + 0x38);
    pSVar6 = *(Session **)(this + 0x40);
    if (__n != 0) goto LAB_008ef82c;
LAB_008ef850:
    uVar7 = 0xffffffffffffffff;
  }
  local_68 = 0;
  local_60 = 0;
  local_58 = (void *)0x0;
  pSVar6 = *(Session **)(this + 0x40);
  __n_00 = (ulong)((byte)SVar1 >> 1);
  if (((byte)SVar1 & 1) == 0) {
    pSVar6 = this + 0x31;
  }
  else {
    __n_00 = *(ulong *)(this + 0x38);
  }
  if (uVar7 <= __n_00) {
    __n_00 = uVar7;
  }
  if (0xffffffffffffffef < __n_00) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n_00 < 0x17) {
    pvVar4 = (void *)((ulong)&local_68 | 1);
    local_68 = (ulong)(byte)((int)__n_00 << 1);
    if (__n_00 == 0) goto LAB_008ef8d0;
  }
  else {
    uVar7 = __n_00 + 0x10 & 0xfffffffffffffff0;
    pvVar4 = operator_new(uVar7);
    local_68 = uVar7 | 1;
    local_60 = __n_00;
    local_58 = pvVar4;
  }
  memcpy(pvVar4,pSVar6,__n_00);
LAB_008ef8d0:
  *(undefined1 *)((long)pvVar4 + __n_00) = 0;
                    /* try { // try from 008ef8d8 to 008ef993 has its CatchHandler @ 008efa28 */
  uVar7 = Proxies::has((Proxies *)(this + 0x68),(basic_string_conflict *)&local_68);
  if ((uVar7 & 1) != 0) {
    uVar9 = **(undefined8 **)(this + 0x18);
    pbVar5 = (byte *)Proxies::operator[]((Proxies *)(this + 0x68),(basic_string_conflict *)&local_68
                                        );
    pbVar8 = *(byte **)(pbVar5 + 0x10);
    if ((*pbVar5 & 1) == 0) {
      pbVar8 = pbVar5 + 1;
    }
    curl_easy_setopt(uVar9,0x2714,pbVar8);
    uVar7 = ProxyAuthentication::has
                      ((ProxyAuthentication *)(this + 0x80),(basic_string_conflict *)&local_68);
    if ((uVar7 & 1) != 0) {
      curl_easy_setopt(**(undefined8 **)(this + 0x18),0x6f,0xffffffffffffffef);
      uVar10 = **(undefined8 **)(this + 0x18);
      uVar9 = ProxyAuthentication::operator[]
                        ((ProxyAuthentication *)(this + 0x80),(basic_string_conflict *)&local_68);
      curl_easy_setopt(uVar10,0x2716,uVar9);
    }
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x50,1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,1);
  iVar3 = DoEasyPerform(this);
  if (iVar3 == 0) {
    local_70 = 0;
                    /* try { // try from 008ef9a4 to 008ef9d7 has its CatchHandler @ 008efa24 */
    curl_easy_getinfo(**(undefined8 **)(this + 0x18),0x200002,&local_70);
    if (local_70 == 200) {
      curl_easy_getinfo(**(undefined8 **)(this + 0x18),&DAT_0060000f,&local_50);
    }
  }
  uVar9 = local_50;
  if ((local_68 & 1) != 0) {
    operator_delete(local_58);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar9;
}

