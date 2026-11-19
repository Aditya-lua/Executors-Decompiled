/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008febd4
 */

/* cpr::util::parseCookies(curl_slist*) */

void cpr::util::parseCookies(curl_slist *param_1)

{
  long lVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  size_t __n;
  void *__dest;
  undefined8 uVar5;
  char cVar6;
  byte *in_x2;
  size_t sVar7;
  Cookies *in_x8;
  long lVar8;
  char *__s;
  byte *pbVar10;
  byte *pbVar9;
  ulong uVar11;
  ulong local_100;
  size_t local_f8;
  void *local_f0;
  byte local_e8;
  void *local_d8;
  byte local_d0;
  void *local_c0;
  byte local_b0;
  void *local_a0;
  byte *local_88;
  byte *local_80;
  byte *local_78;
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  *in_x8 = (Cookies)0x1;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)(in_x8 + 0x18) = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  if (param_1 != (curl_slist *)0x0) {
LAB_008fec3c:
    do {
      cVar6 = (char)in_x2;
      __s = *(char **)param_1;
      local_100 = 0;
      local_f8 = 0;
      local_f0 = (void *)0x0;
      __n = strlen(__s);
      if (0xffffffffffffffef < __n) {
                    /* try { // try from 008feee8 to 008feeef has its CatchHandler @ 008fef18 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (__n < 0x17) {
        local_100 = CONCAT71(local_100._1_7_,(char)((int)__n << 1));
        __dest = (void *)((ulong)&local_100 | 1);
        if (__n != 0) goto LAB_008fec98;
      }
      else {
        uVar11 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008fec80 to 008fec87 has its CatchHandler @ 008fef20 */
        __dest = operator_new(uVar11);
        local_100 = uVar11 | 1;
        local_f8 = __n;
        local_f0 = __dest;
LAB_008fec98:
        sVar7 = __n;
        memcpy(__dest,__s,__n);
        cVar6 = (char)sVar7;
      }
      *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 008fecac to 008fecbb has its CatchHandler @ 008fefa0 */
      split((util *)&local_100,(basic_string_conflict *)0x9,cVar6);
      if ((local_100 & 1) != 0) {
        operator_delete(local_f0);
      }
      lVar8 = (long)local_80 - (long)local_88;
      while ((ulong)((lVar8 >> 3) * -0x5555555555555555) < 7) {
        if (local_80 < local_78) {
          local_80[8] = 0;
          local_80[9] = 0;
          local_80[10] = 0;
          local_80[0xb] = 0;
          local_80[0xc] = 0;
          local_80[0xd] = 0;
          local_80[0xe] = 0;
          local_80[0xf] = 0;
          local_80[0x10] = 0;
          local_80[0x11] = 0;
          local_80[0x12] = 0;
          local_80[0x13] = 0;
          local_80[0x14] = 0;
          local_80[0x15] = 0;
          local_80[0x16] = 0;
          local_80[0x17] = 0;
          local_80[0] = 0;
          local_80[1] = 0;
          local_80[2] = 0;
          local_80[3] = 0;
          local_80[4] = 0;
          local_80[5] = 0;
          local_80[6] = 0;
          local_80[7] = 0;
          local_80 = local_80 + 0x18;
        }
        else {
                    /* try { // try from 008fed08 to 008fed13 has its CatchHandler @ 008fefb8 */
          std::__ndk1::
          vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
          ::__emplace_back_slow_path<char_const(&)[1]>
                    ((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                      *)&local_88,"");
        }
        lVar8 = (long)local_80 - (long)local_88;
      }
                    /* try { // try from 008fed34 to 008fed3f has its CatchHandler @ 008fef9c */
      lVar8 = std::__ndk1::stoul((basic_string_conflict *)(local_88 + 0x60),(ulong *)0x0,10);
      pbVar2 = local_88;
      if ((ulong)(((long)local_80 - (long)local_88 >> 3) * -0x5555555555555555) < 6) {
                    /* try { // try from 008feef0 to 008fef0f has its CatchHandler @ 008fef14 */
        std::__ndk1::__vector_base_common<true>::__throw_out_of_range();
LAB_008feef8:
        std::__ndk1::__vector_base_common<true>::__throw_out_of_range();
LAB_008fef00:
        std::__ndk1::__vector_base_common<true>::__throw_out_of_range();
LAB_008fef08:
        std::__ndk1::__vector_base_common<true>::__throw_out_of_range();
        goto LAB_008fef10;
      }
      if ((long)local_80 - (long)local_88 == 0x90) goto LAB_008feef8;
                    /* try { // try from 008fed68 to 008fedeb has its CatchHandler @ 008fefb4 */
      uVar3 = isTrue((basic_string_conflict *)(local_88 + 0x18));
      pbVar10 = local_88;
      if ((ulong)(((long)local_80 - (long)local_88 >> 3) * -0x5555555555555555) < 3)
      goto LAB_008fef08;
      if ((long)local_80 - (long)local_88 == 0x48) goto LAB_008fef00;
      uVar4 = isTrue((basic_string_conflict *)(local_88 + 0x48));
      in_x2 = pbVar2 + 0x90;
      uVar5 = std::__ndk1::chrono::system_clock::from_time_t(lVar8);
      Cookie::Cookie((Cookie *)&local_100,pbVar2 + 0x78,in_x2,pbVar2,uVar3 & 1,pbVar10 + 0x30,
                     uVar4 & 1,uVar5);
                    /* try { // try from 008fedec to 008fedf7 has its CatchHandler @ 008fef28 */
      Cookies::emplace_back(in_x8,(Cookie *)&local_100);
      if ((local_b0 & 1) == 0) {
        if ((local_d0 & 1) == 0) goto LAB_008fee08;
LAB_008fee64:
        operator_delete(local_c0);
        if ((local_e8 & 1) != 0) goto LAB_008fee74;
LAB_008fee10:
        if ((local_100 & 1) == 0) goto LAB_008fee18;
LAB_008fee84:
        operator_delete(local_f0);
        if (local_88 == (byte *)0x0) goto LAB_008fee94;
LAB_008fee20:
        pbVar2 = local_88;
        if (local_80 != local_88) {
          pbVar10 = local_80;
          do {
            pbVar9 = pbVar10 + -0x18;
            if ((*pbVar9 & 1) != 0) {
              operator_delete(*(void **)(pbVar10 + -8));
            }
            pbVar10 = pbVar9;
          } while (pbVar2 != pbVar9);
        }
        local_80 = pbVar2;
        operator_delete(local_88);
        param_1 = *(curl_slist **)(param_1 + 8);
        if (param_1 == (curl_slist *)0x0) break;
        goto LAB_008fec3c;
      }
      operator_delete(local_a0);
      if ((local_d0 & 1) != 0) goto LAB_008fee64;
LAB_008fee08:
      if ((local_e8 & 1) == 0) goto LAB_008fee10;
LAB_008fee74:
      operator_delete(local_d8);
      if ((local_100 & 1) != 0) goto LAB_008fee84;
LAB_008fee18:
      if (local_88 != (byte *)0x0) goto LAB_008fee20;
LAB_008fee94:
      param_1 = *(curl_slist **)(param_1 + 8);
    } while (param_1 != (curl_slist *)0x0);
  }
  if (*(long *)(lVar1 + 0x28) == local_70) {
    return;
  }
LAB_008fef10:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

