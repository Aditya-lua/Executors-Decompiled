/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbfdc
 */

/* cpr::CurlContainer<cpr::Parameter>::GetContent(cpr::CurlHolder const&) const */

void cpr::CurlContainer<cpr::Parameter>::GetContent(CurlHolder *param_1)

{
  ulong uVar1;
  ulong *puVar2;
  byte bVar3;
  long lVar4;
  char *pcVar5;
  basic_string_conflict *in_x1;
  char *in_x2;
  uint uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  ulong uVar7;
  char *pcVar8;
  ulong *puVar9;
  char *pcVar10;
  char *pcVar11;
  void *pvVar12;
  byte local_b8 [8];
  ulong local_b0;
  char *local_a8;
  ulong local_a0;
  char *pcStack_98;
  char *local_90;
  ulong local_80;
  char *pcStack_78;
  char *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  puVar9 = *(ulong **)(param_1 + 8);
  puVar2 = *(ulong **)(param_1 + 0x10);
  if (puVar9 == puVar2) {
LAB_008fc298:
    if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  pcVar8 = (char *)((ulong)&local_80 | 1);
  uVar7 = 0;
  uVar6 = 0;
  pcVar10 = (char *)((ulong)&local_a0 | 1);
  do {
    uVar1 = (ulong)(uVar6 >> 1);
    if ((uVar6 & 1) != 0) {
      uVar1 = uVar7;
    }
    if (uVar1 != 0) {
                    /* try { // try from 008fc078 to 008fc08b has its CatchHandler @ 008fc370 */
      in_x2 = (char *)0x1;
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,"&",1);
    }
    if (*param_1 == (CurlHolder)0x0) {
      pcStack_78 = (char *)0x0;
      local_70 = (char *)0x0;
      local_80 = 0;
      if ((*puVar9 & 1) == 0) {
        local_70 = (char *)puVar9[2];
        pcStack_78 = (char *)puVar9[1];
        local_80 = *puVar9;
      }
      else {
        pcVar11 = (char *)puVar9[1];
        if ((char *)0xffffffffffffffef < pcVar11) {
                    /* try { // try from 008fc2d4 to 008fc2db has its CatchHandler @ 008fc2e0 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        pvVar12 = (void *)puVar9[2];
        if (pcVar11 < (char *)0x17) {
          local_80 = (ulong)(byte)((int)pcVar11 << 1);
          pcVar5 = pcVar8;
          if (pcVar11 != (char *)0x0) goto LAB_008fc118;
        }
        else {
          pcVar5 = operator_new((ulong)(pcVar11 + 0x10) & 0xfffffffffffffff0);
          local_80 = (ulong)(pcVar11 + 0x10) & 0xfffffffffffffff0 | 1;
          pcStack_78 = pcVar11;
          local_70 = pcVar5;
LAB_008fc118:
          in_x2 = pcVar11;
          memcpy(pcVar5,pvVar12,(size_t)pcVar11);
        }
        pcVar5[(long)pcVar11] = '\0';
      }
    }
    else {
                    /* try { // try from 008fc094 to 008fc107 has its CatchHandler @ 008fc374 */
      CurlHolder::urlEncode(in_x1);
    }
    bVar3 = (byte)puVar9[3];
    if ((bVar3 & 1) == 0) {
      if (bVar3 >> 1 != 0) goto LAB_008fc140;
LAB_008fc160:
      in_x2 = (char *)(local_80 >> 1 & 0x7f);
      pcVar11 = pcVar8;
      if ((local_80 & 1) != 0) {
        pcVar11 = local_70;
        in_x2 = pcStack_78;
      }
                    /* try { // try from 008fc17c to 008fc183 has its CatchHandler @ 008fc2e8 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,pcVar11,(ulong)in_x2);
    }
    else {
      if (puVar9[4] == 0) goto LAB_008fc160;
LAB_008fc140:
      if (*param_1 == (CurlHolder)0x0) {
        local_a0 = 0;
        pcStack_98 = (char *)0x0;
        local_90 = (char *)0x0;
        if ((bVar3 & 1) == 0) {
          local_90 = (char *)puVar9[5];
          pcStack_98 = (char *)puVar9[4];
          local_a0 = puVar9[3];
        }
        else {
          pcVar11 = (char *)puVar9[4];
          if ((char *)0xffffffffffffffef < pcVar11) {
                    /* try { // try from 008fc2cc to 008fc2d3 has its CatchHandler @ 008fc2e4 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          pvVar12 = (void *)puVar9[5];
          if (pcVar11 < (char *)0x17) {
            local_a0 = (ulong)(byte)((int)pcVar11 << 1);
            pcVar5 = pcVar10;
            if (pcVar11 != (char *)0x0) goto LAB_008fc1f4;
          }
          else {
                    /* try { // try from 008fc1dc to 008fc1e3 has its CatchHandler @ 008fc2ec */
            pcVar5 = operator_new((ulong)(pcVar11 + 0x10) & 0xfffffffffffffff0);
            local_a0 = (ulong)(pcVar11 + 0x10) & 0xfffffffffffffff0 | 1;
            pcStack_98 = pcVar11;
            local_90 = pcVar5;
LAB_008fc1f4:
            in_x2 = pcVar11;
            memcpy(pcVar5,pvVar12,(size_t)pcVar11);
          }
          pcVar5[(long)pcVar11] = '\0';
        }
      }
      else {
                    /* try { // try from 008fc148 to 008fc153 has its CatchHandler @ 008fc2ec */
        CurlHolder::urlEncode(in_x1);
      }
                    /* try { // try from 008fc208 to 008fc21b has its CatchHandler @ 008fc340 */
      std::__ndk1::operator+((__ndk1 *)&local_80,(basic_string_conflict *)&DAT_002c4dac,in_x2);
      pcVar11 = (char *)((ulong)local_b8 | 1);
      uVar7 = (ulong)(local_b8[0] >> 1);
      if ((local_b8[0] & 1) != 0) {
        pcVar11 = local_a8;
        uVar7 = local_b0;
      }
                    /* try { // try from 008fc238 to 008fc23f has its CatchHandler @ 008fc300 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,pcVar11,uVar7);
      if ((local_b8[0] & 1) != 0) {
        operator_delete(local_a8);
      }
      in_x2 = (char *)(local_a0 >> 1 & 0x7f);
      pcVar11 = pcVar10;
      if ((local_a0 & 1) != 0) {
        in_x2 = pcStack_98;
        pcVar11 = local_90;
      }
                    /* try { // try from 008fc268 to 008fc26f has its CatchHandler @ 008fc2fc */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(in_x8,pcVar11,(ulong)in_x2);
      if ((local_a0 & 1) != 0) {
        operator_delete(local_90);
      }
    }
    if ((local_80 & 1) != 0) {
      operator_delete(local_70);
    }
    if (puVar2 + -6 == puVar9) goto LAB_008fc298;
    uVar6 = (uint)(byte)*in_x8;
    uVar7 = *(ulong *)(in_x8 + 8);
    puVar9 = puVar9 + 6;
  } while( true );
}

