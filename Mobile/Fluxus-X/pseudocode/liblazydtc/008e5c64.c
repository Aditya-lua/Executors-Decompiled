/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5c64
 */

/* cpr::AcceptEncoding::getString() const */

void cpr::AcceptEncoding::getString(void)

{
  undefined1 uVar1;
  long lVar2;
  undefined8 uVar3;
  long in_x0;
  undefined1 *__dest;
  char *pcVar4;
  ulong *puVar5;
  undefined8 *puVar6;
  ulong *in_x8;
  long *plVar7;
  ulong uVar8;
  undefined1 *puVar9;
  void *pvVar10;
  ulong uVar11;
  long *plVar12;
  char *pcVar13;
  ulong local_100;
  ulong uStack_f8;
  undefined1 *local_f0;
  ulong local_e0;
  ulong uStack_d8;
  char *local_d0;
  ulong local_c0;
  ulong uStack_b8;
  undefined1 *local_b0;
  ulong local_a0;
  ulong uStack_98;
  void *local_90;
  undefined7 uStack_80;
  undefined1 local_79;
  undefined7 uStack_78;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  plVar7 = *(long **)(in_x0 + 0x10);
  plVar12 = (long *)*plVar7;
  uStack_f8 = 0;
  local_f0 = (undefined1 *)0x0;
  local_100 = 0;
  if ((plVar7[2] & 1U) == 0) {
    local_f0 = (undefined1 *)plVar7[4];
    uStack_f8 = plVar7[3];
    local_100 = plVar7[2];
  }
  else {
    uVar8 = plVar7[3];
    if (0xffffffffffffffef < uVar8) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar10 = (void *)plVar7[4];
    if (uVar8 < 0x17) {
      puVar9 = (undefined1 *)((ulong)&local_100 | 1);
      local_100 = (ulong)(byte)((int)uVar8 << 1);
      if (uVar8 == 0) {
        *puVar9 = 0;
        goto joined_r0x008e5d34;
      }
    }
    else {
      uVar11 = uVar8 + 0x10 & 0xfffffffffffffff0;
      puVar9 = operator_new(uVar11);
      local_100 = uVar11 | 1;
      uStack_f8 = uVar8;
      local_f0 = puVar9;
    }
    memcpy(puVar9,pvVar10,uVar8);
    puVar9[uVar8] = 0;
  }
joined_r0x008e5d34:
  if (plVar12 != (long *)0x0) {
    pcVar13 = (char *)((ulong)&local_e0 | 1);
LAB_008e5d58:
    do {
      puVar9 = local_f0;
      uVar8 = uStack_f8;
      local_c0 = 0;
      uStack_b8 = 0;
      local_b0 = (undefined1 *)0x0;
      if ((local_100 & 1) == 0) {
        local_b0 = local_f0;
        uStack_b8 = uStack_f8;
        local_c0 = local_100;
      }
      else {
        if (0xffffffffffffffef < uStack_f8) {
                    /* try { // try from 008e5fb0 to 008e5fb7 has its CatchHandler @ 008e5fc4 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (uStack_f8 < 0x17) {
          local_c0 = (ulong)(byte)((int)uStack_f8 << 1);
          __dest = (undefined1 *)((ulong)&local_c0 | 1);
          if (uStack_f8 != 0) goto LAB_008e5dc8;
        }
        else {
          uVar11 = uStack_f8 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e5db0 to 008e5db7 has its CatchHandler @ 008e5fdc */
          __dest = operator_new(uVar11);
          local_c0 = uVar11 | 1;
          uStack_b8 = uVar8;
          local_b0 = __dest;
LAB_008e5dc8:
          memcpy(__dest,puVar9,uVar8);
        }
        __dest[uVar8] = 0;
      }
      uStack_d8 = 0;
      local_d0 = (char *)0x0;
      local_e0 = 0;
      if ((plVar12[2] & 1U) == 0) {
        local_d0 = (char *)plVar12[4];
        uStack_d8 = plVar12[3];
        local_e0 = plVar12[2];
      }
      else {
        uVar8 = plVar12[3];
        if (0xffffffffffffffef < uVar8) {
                    /* try { // try from 008e5fa8 to 008e5faf has its CatchHandler @ 008e5fc8 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        pvVar10 = (void *)plVar12[4];
        if (uVar8 < 0x17) {
          local_e0 = (ulong)(byte)((int)uVar8 << 1);
          pcVar4 = pcVar13;
          if (uVar8 != 0) goto LAB_008e5e50;
        }
        else {
          uVar11 = uVar8 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e5e38 to 008e5e3f has its CatchHandler @ 008e5fcc */
          pcVar4 = operator_new(uVar11);
          local_e0 = uVar11 | 1;
          uStack_d8 = uVar8;
          local_d0 = pcVar4;
LAB_008e5e50:
          memcpy(pcVar4,pvVar10,uVar8);
        }
        pcVar4[uVar8] = '\0';
      }
                    /* try { // try from 008e5e64 to 008e5e73 has its CatchHandler @ 008e602c */
      puVar5 = (ulong *)std::__ndk1::
                        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                  *)&local_c0,", ",2);
      local_90 = (void *)puVar5[2];
      uStack_98 = puVar5[1];
      local_a0 = *puVar5;
      puVar5[1] = 0;
      puVar5[2] = 0;
      *puVar5 = 0;
      uVar8 = local_e0 >> 1 & 0x7f;
      pcVar4 = pcVar13;
      if ((local_e0 & 1) != 0) {
        uVar8 = uStack_d8;
        pcVar4 = local_d0;
      }
                    /* try { // try from 008e5ea4 to 008e5eab has its CatchHandler @ 008e5fec */
      puVar6 = (undefined8 *)
               std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_a0,pcVar4,uVar8);
      puVar9 = (undefined1 *)puVar6[2];
      uVar1 = *(undefined1 *)puVar6;
      uStack_78 = (undefined7)((ulong)puVar6[1] >> 8);
      uStack_80 = (undefined7)*(undefined8 *)((long)puVar6 + 1);
      local_79 = (undefined1)((ulong)*(undefined8 *)((long)puVar6 + 1) >> 0x38);
      *puVar6 = 0;
      puVar6[1] = 0;
      puVar6[2] = 0;
      if ((local_a0 & 1) != 0) {
        operator_delete(local_90);
      }
      if ((local_100 & 1) == 0) {
        local_100 = local_100 & 0xffffffffffff0000;
      }
      else {
        *local_f0 = 0;
        uStack_f8 = 0;
        if ((local_100 & 1) != 0) {
          operator_delete(local_f0);
          local_100 = 0;
        }
      }
      uVar3 = CONCAT71(uStack_78,local_79);
      local_100 = CONCAT71(local_100._1_7_,uVar1);
      uStack_78 = 0;
      *(undefined8 *)((long)((ulong)&local_100 | 1) + 7) = uVar3;
      *(ulong *)((ulong)&local_100 | 1) = CONCAT17(local_79,uStack_80);
      uStack_80 = 0;
      local_79 = 0;
      local_f0 = puVar9;
      if ((local_e0 & 1) != 0) {
        operator_delete(local_d0);
        if ((local_c0 & 1) == 0) goto LAB_008e5f38;
LAB_008e5f54:
        operator_delete(local_b0);
        plVar12 = (long *)*plVar12;
        if (plVar12 == (long *)0x0) break;
        goto LAB_008e5d58;
      }
      if ((local_c0 & 1) != 0) goto LAB_008e5f54;
LAB_008e5f38:
      plVar12 = (long *)*plVar12;
    } while (plVar12 != (long *)0x0);
  }
  in_x8[2] = (ulong)local_f0;
  in_x8[1] = uStack_f8;
  *in_x8 = local_100;
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

