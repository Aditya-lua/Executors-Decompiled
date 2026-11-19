/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fc390
 */

/* cpr::CurlContainer<cpr::Pair>::GetContent(cpr::CurlHolder const&) const */

void cpr::CurlContainer<cpr::Pair>::GetContent(CurlHolder *param_1)

{
  ulong uVar1;
  __ndk1 *p_Var2;
  long lVar3;
  __ndk1 *this;
  char *pcVar4;
  ulong *puVar5;
  basic_string_conflict *in_x1;
  char *in_x2;
  uint uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  ulong uVar7;
  char *pcVar8;
  void *__src;
  char *pcVar9;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_b8 [16];
  void *local_a8;
  ulong local_a0;
  char *pcStack_98;
  char *local_90;
  ulong local_80;
  char *pcStack_78;
  char *local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  p_Var2 = *(__ndk1 **)(param_1 + 0x10);
  if (*(__ndk1 **)(param_1 + 8) == p_Var2) {
LAB_008fc594:
    if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  uVar7 = 0;
  uVar6 = 0;
  pcVar9 = (char *)((ulong)&local_80 | 1);
  this = *(__ndk1 **)(param_1 + 8);
  do {
    uVar1 = (ulong)(uVar6 >> 1);
    if ((uVar6 & 1) != 0) {
      uVar1 = uVar7;
    }
    if (uVar1 != 0) {
                    /* try { // try from 008fc41c to 008fc42f has its CatchHandler @ 008fc5d8 */
      in_x2 = (char *)0x1;
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,"&",1);
    }
    if (*param_1 == (CurlHolder)0x0) {
      pcStack_78 = (char *)0x0;
      local_70 = (char *)0x0;
      local_80 = 0;
      if (((byte)this[0x18] & 1) == 0) {
        local_70 = *(char **)(this + 0x28);
        pcStack_78 = *(char **)(this + 0x20);
        local_80 = *(ulong *)(this + 0x18);
      }
      else {
        pcVar8 = *(char **)(this + 0x20);
        if ((char *)0xffffffffffffffef < pcVar8) {
                    /* try { // try from 008fc5c8 to 008fc5cf has its CatchHandler @ 008fc5d4 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        __src = *(void **)(this + 0x28);
        if (pcVar8 < (char *)0x17) {
          local_80 = (ulong)(byte)((int)pcVar8 << 1);
          pcVar4 = pcVar9;
          if (pcVar8 != (char *)0x0) goto LAB_008fc4c0;
        }
        else {
          pcVar4 = operator_new((ulong)(pcVar8 + 0x10) & 0xfffffffffffffff0);
          local_80 = (ulong)(pcVar8 + 0x10) & 0xfffffffffffffff0 | 1;
          pcStack_78 = pcVar8;
          local_70 = pcVar4;
LAB_008fc4c0:
          in_x2 = pcVar8;
          memcpy(pcVar4,__src,(size_t)pcVar8);
        }
        pcVar4[(long)pcVar8] = '\0';
      }
    }
    else {
                    /* try { // try from 008fc43c to 008fc4af has its CatchHandler @ 008fc5dc */
      CurlHolder::urlEncode(in_x1);
    }
                    /* try { // try from 008fc4d8 to 008fc4e7 has its CatchHandler @ 008fc64c */
    std::__ndk1::operator+(this,(basic_string_conflict *)&DAT_002c4dac,in_x2);
    pcVar8 = (char *)(local_80 >> 1 & 0x7f);
    pcVar4 = pcVar9;
    if ((local_80 & 1) != 0) {
      pcVar8 = pcStack_78;
      pcVar4 = local_70;
    }
                    /* try { // try from 008fc500 to 008fc507 has its CatchHandler @ 008fc62c */
    puVar5 = (ulong *)std::__ndk1::
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::append(local_b8,pcVar4,(ulong)pcVar8);
    local_90 = (char *)puVar5[2];
    pcStack_98 = (char *)puVar5[1];
    local_a0 = *puVar5;
    puVar5[1] = 0;
    puVar5[2] = 0;
    *puVar5 = 0;
    in_x2 = (char *)(local_a0 >> 1 & 0x7f);
    pcVar8 = (char *)((ulong)&local_a0 | 1);
    if ((local_a0 & 1) != 0) {
      in_x2 = pcStack_98;
      pcVar8 = local_90;
    }
                    /* try { // try from 008fc538 to 008fc53f has its CatchHandler @ 008fc5ec */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append(in_x8,pcVar8,(ulong)in_x2);
    if ((local_a0 & 1) != 0) {
      operator_delete(local_90);
    }
    if (((byte)local_b8[0] & 1) != 0) {
      operator_delete(local_a8);
    }
    if ((local_80 & 1) != 0) {
      operator_delete(local_70);
    }
    if (p_Var2 == this + 0x30) goto LAB_008fc594;
    uVar6 = (uint)(byte)*in_x8;
    uVar7 = *(ulong *)(in_x8 + 8);
    this = this + 0x30;
  } while( true );
}

