/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901884
 */

/* cpr::Response::GetCertInfos() */

void cpr::Response::GetCertInfos(void)

{
  long lVar1;
  byte *pbVar2;
  undefined8 *in_x0;
  size_t __n;
  void *__dest;
  vector<cpr::CertInfo,std::__ndk1::allocator<cpr::CertInfo>> *in_x8;
  char *__s;
  byte *pbVar4;
  byte *pbVar3;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong local_a0;
  size_t local_98;
  void *local_90;
  byte *local_88;
  byte *local_80;
  undefined8 uStack_78;
  int *local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_70 = (int *)0x0;
  curl_easy_getinfo(*(undefined8 *)*in_x0,&DAT_00400022,&local_70);
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  if (0 < *local_70) {
    lVar6 = 0;
    do {
      local_80 = (byte *)0x0;
      uStack_78 = 0;
      local_88 = (byte *)0x0;
      for (puVar7 = *(undefined8 **)(*(long *)(local_70 + 2) + lVar6 * 8);
          puVar7 != (undefined8 *)0x0; puVar7 = (undefined8 *)puVar7[1]) {
        __s = (char *)*puVar7;
        local_a0 = 0;
        local_98 = 0;
        local_90 = (void *)0x0;
        __n = strlen(__s);
        if (0xffffffffffffffef < __n) {
                    /* try { // try from 00901a60 to 00901a67 has its CatchHandler @ 00901a6c */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (__n < 0x17) {
          local_a0 = CONCAT71(local_a0._1_7_,(char)((int)__n << 1));
          __dest = (void *)((ulong)&local_a0 | 1);
          if (__n != 0) goto LAB_00901964;
        }
        else {
          uVar5 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0090194c to 00901953 has its CatchHandler @ 00901a74 */
          __dest = operator_new(uVar5);
          local_a0 = uVar5 | 1;
          local_98 = __n;
          local_90 = __dest;
LAB_00901964:
          memcpy(__dest,__s,__n);
        }
        *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00901978 to 00901983 has its CatchHandler @ 00901a84 */
        CertInfo::emplace_back((CertInfo *)&local_88,(basic_string_conflict *)&local_a0);
        if ((local_a0 & 1) != 0) {
          operator_delete(local_90);
        }
      }
      if (*(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
            **)(in_x8 + 8) <
          *(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
            **)(in_x8 + 0x10)) {
                    /* try { // try from 009019a8 to 009019d3 has its CatchHandler @ 00901a70 */
        std::__ndk1::
        vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
        ::vector(*(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                   **)(in_x8 + 8),(vector *)&local_88);
        *(long *)(in_x8 + 8) = *(long *)(in_x8 + 8) + 0x18;
        pbVar2 = local_88;
      }
      else {
        std::__ndk1::vector<cpr::CertInfo,std::__ndk1::allocator<cpr::CertInfo>>::
        __emplace_back_slow_path<cpr::CertInfo&>(in_x8,(CertInfo *)&local_88);
        pbVar2 = local_88;
      }
      local_88 = pbVar2;
      if (pbVar2 != (byte *)0x0) {
        if (local_80 != pbVar2) {
          pbVar4 = local_80;
          do {
            pbVar3 = pbVar4 + -0x18;
            if ((*pbVar3 & 1) != 0) {
              operator_delete(*(void **)(pbVar4 + -8));
            }
            pbVar4 = pbVar3;
          } while (pbVar2 != pbVar3);
        }
        local_80 = pbVar2;
        operator_delete(local_88);
      }
      lVar6 = lVar6 + 1;
    } while (lVar6 < *local_70);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

