/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed968
 */

/* cpr::Session::SetResolves(std::__ndk1::vector<cpr::Resolve, std::__ndk1::allocator<cpr::Resolve>
   > const&) */

void cpr::Session::SetResolves(vector *param_1)

{
  __ndk1 *p_Var1;
  ulong uVar2;
  void *pvVar3;
  __ndk1 *p_Var4;
  ushort uVar5;
  long lVar6;
  char *pcVar7;
  ulong *puVar8;
  int extraout_w1;
  long *in_x1;
  char *in_x2;
  undefined8 *puVar9;
  __ndk1 *p_Var10;
  __ndk1 *p_Var11;
  long lVar12;
  __ndk1 *this;
  undefined8 uVar13;
  __ndk1 *p_Var14;
  byte local_100 [8];
  ulong local_f8;
  char *local_f0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_e8 [16];
  void *local_d8;
  ulong local_d0;
  ulong uStack_c8;
  void *local_c0;
  ulong local_b0;
  ulong uStack_a8;
  void *local_a0;
  ulong local_90;
  ulong uStack_88;
  void *local_80;
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  curl_slist_free_all(*(undefined8 *)(*(long *)(param_1 + 0x18) + 0x10));
  puVar9 = *(undefined8 **)(param_1 + 0x18);
  puVar9[2] = 0;
  this = (__ndk1 *)*in_x1;
  p_Var4 = (__ndk1 *)in_x1[1];
  if (this == p_Var4) {
    uVar13 = 0;
  }
  else {
    do {
      p_Var1 = this + 0x38;
      if (*(__ndk1 **)(this + 0x30) != p_Var1) {
        p_Var14 = *(__ndk1 **)(this + 0x30);
        do {
          while( true ) {
            uVar5 = *(ushort *)(p_Var14 + 0x1a);
            uVar13 = *(undefined8 *)(*(long *)(param_1 + 0x18) + 0x10);
            std::__ndk1::operator+(this,(basic_string_conflict *)&DAT_002bcda4,in_x2);
                    /* try { // try from 008eda0c to 008eda17 has its CatchHandler @ 008edcb4 */
            std::__ndk1::to_string((__ndk1 *)(ulong)uVar5,extraout_w1);
            uVar2 = (ulong)(local_100[0] >> 1);
            pcVar7 = (char *)((ulong)local_100 | 1);
            if ((local_100[0] & 1) != 0) {
              uVar2 = local_f8;
              pcVar7 = local_f0;
            }
                    /* try { // try from 008eda30 to 008eda37 has its CatchHandler @ 008edc94 */
            puVar8 = (ulong *)std::__ndk1::
                              basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                              ::append(local_e8,pcVar7,uVar2);
            local_c0 = (void *)puVar8[2];
            uStack_c8 = puVar8[1];
            local_d0 = *puVar8;
            *puVar8 = 0;
            puVar8[1] = 0;
            puVar8[2] = 0;
                    /* try { // try from 008eda50 to 008eda5f has its CatchHandler @ 008edc74 */
            puVar8 = (ulong *)std::__ndk1::
                              basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                              ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                        *)&local_d0,":",1);
            local_a0 = (void *)puVar8[2];
            uStack_a8 = puVar8[1];
            local_b0 = *puVar8;
            puVar8[1] = 0;
            puVar8[2] = 0;
            *puVar8 = 0;
            in_x2 = (char *)(ulong)((byte)this[0x18] >> 1);
            p_Var10 = this + 0x19;
            if (((byte)this[0x18] & 1) != 0) {
              in_x2 = *(char **)(this + 0x20);
              p_Var10 = *(__ndk1 **)(this + 0x28);
            }
                    /* try { // try from 008eda90 to 008eda97 has its CatchHandler @ 008edc54 */
            puVar8 = (ulong *)std::__ndk1::
                              basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                              ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                        *)&local_b0,(char *)p_Var10,(ulong)in_x2);
            local_80 = (void *)puVar8[2];
            uStack_88 = puVar8[1];
            local_90 = *puVar8;
            puVar8[1] = 0;
            puVar8[2] = 0;
            *puVar8 = 0;
            pvVar3 = (void *)((ulong)&local_90 | 1);
            if ((local_90 & 1) != 0) {
              pvVar3 = local_80;
            }
                    /* try { // try from 008edac0 to 008edac7 has its CatchHandler @ 008edc0c */
            uVar13 = curl_slist_append(uVar13,pvVar3);
            *(undefined8 *)(*(long *)(param_1 + 0x18) + 0x10) = uVar13;
            if ((local_90 & 1) != 0) break;
            if ((local_b0 & 1) == 0) goto LAB_008edae0;
LAB_008edb14:
            operator_delete(local_a0);
            if ((local_d0 & 1) != 0) goto LAB_008edb24;
LAB_008edae8:
            if ((local_100[0] & 1) == 0) goto LAB_008edaf0;
LAB_008edb34:
            operator_delete(local_f0);
            if (((byte)local_e8[0] & 1) != 0) goto LAB_008edb44;
LAB_008edaf8:
            p_Var10 = *(__ndk1 **)(p_Var14 + 8);
            if (*(__ndk1 **)(p_Var14 + 8) == (__ndk1 *)0x0) goto LAB_008edb64;
LAB_008edb54:
            do {
              p_Var14 = p_Var10;
              p_Var10 = *(__ndk1 **)p_Var14;
            } while (*(__ndk1 **)p_Var14 != (__ndk1 *)0x0);
LAB_008edb90:
            if (p_Var14 == p_Var1) goto LAB_008edba8;
          }
          operator_delete(local_80);
          if ((local_b0 & 1) != 0) goto LAB_008edb14;
LAB_008edae0:
          if ((local_d0 & 1) == 0) goto LAB_008edae8;
LAB_008edb24:
          operator_delete(local_c0);
          if ((local_100[0] & 1) != 0) goto LAB_008edb34;
LAB_008edaf0:
          if (((byte)local_e8[0] & 1) == 0) goto LAB_008edaf8;
LAB_008edb44:
          operator_delete(local_d8);
          p_Var10 = *(__ndk1 **)(p_Var14 + 8);
          if (*(__ndk1 **)(p_Var14 + 8) != (__ndk1 *)0x0) goto LAB_008edb54;
LAB_008edb64:
          p_Var10 = p_Var14 + 0x10;
          p_Var11 = *(__ndk1 **)p_Var10;
          if (*(__ndk1 **)p_Var11 != p_Var14) {
            do {
              lVar12 = *(long *)p_Var10;
              p_Var10 = (__ndk1 *)(lVar12 + 0x10);
              p_Var14 = *(__ndk1 **)p_Var10;
            } while (*(long *)p_Var14 != lVar12);
            goto LAB_008edb90;
          }
          p_Var14 = p_Var11;
        } while (p_Var11 != p_Var1);
      }
LAB_008edba8:
      this = this + 0x48;
    } while (this != p_Var4);
    puVar9 = *(undefined8 **)(param_1 + 0x18);
    uVar13 = puVar9[2];
  }
  curl_easy_setopt(*puVar9,0x27db,uVar13);
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

