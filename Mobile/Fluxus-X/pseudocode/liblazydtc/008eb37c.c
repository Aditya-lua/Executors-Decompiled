/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eb37c
 */

/* cpr::Session::SetHeaderInternal() */

void cpr::Session::SetHeaderInternal(void)

{
  long *plVar1;
  byte bVar2;
  long lVar3;
  char *pcVar4;
  long in_x0;
  void *__dest;
  ulong uVar5;
  basic_string_conflict *in_x2;
  long lVar6;
  long *plVar7;
  long lVar8;
  void *pvVar9;
  long *plVar10;
  basic_string_conflict *__n;
  long *plVar11;
  void *pvVar12;
  undefined8 uVar13;
  byte local_98 [8];
  basic_string_conflict *local_90;
  char *local_88;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_80;
  undefined7 uStack_7f;
  undefined1 uStack_78;
  undefined7 uStack_77;
  undefined1 local_70;
  undefined2 uStack_6f;
  undefined5 uStack_6d;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  plVar1 = (long *)(in_x0 + 0xa0);
  if (*(long **)(in_x0 + 0x98) == plVar1) {
    lVar8 = 0;
  }
  else {
    lVar8 = 0;
    pvVar9 = (void *)((ulong)&local_80 | 1);
    plVar10 = *(long **)(in_x0 + 0x98);
    do {
      uStack_78 = 0;
      uStack_77 = 0;
      local_70 = 0;
      uStack_6f = 0;
      uStack_6d = 0;
      local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0
      ;
      uStack_7f = 0;
      if ((*(byte *)(plVar10 + 4) & 1) == 0) {
        lVar6 = plVar10[6];
        local_70 = (undefined1)lVar6;
        uStack_6f = (undefined2)((ulong)lVar6 >> 8);
        uStack_6d = (undefined5)((ulong)lVar6 >> 0x18);
        uVar13 = plVar10[4];
        uStack_78 = (undefined1)plVar10[5];
        uStack_77 = (undefined7)((ulong)plVar10[5] >> 8);
        local_80 = SUB81(uVar13,0);
        uStack_7f = (undefined7)((ulong)uVar13 >> 8);
      }
      else {
        __n = (basic_string_conflict *)plVar10[5];
        if ((basic_string_conflict *)0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        pvVar12 = (void *)plVar10[6];
        if (__n < (basic_string_conflict *)0x17) {
          local_80 = SUB41((int)__n << 1,0);
          __dest = pvVar9;
          if (__n != (basic_string_conflict *)0x0) goto LAB_008eb450;
        }
        else {
          uVar5 = (ulong)(__n + 0x10) & 0xfffffffffffffff0;
          __dest = operator_new(uVar5);
          local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     )((byte)uVar5 | 1);
          uStack_78 = SUB81(__n,0);
          uStack_77 = (undefined7)((ulong)__n >> 8);
          local_70 = SUB81(__dest,0);
          uStack_6f = (undefined2)((ulong)__dest >> 8);
          uStack_6d = (undefined5)((ulong)__dest >> 0x18);
          uStack_7f = (undefined7)(uVar5 >> 8);
LAB_008eb450:
          in_x2 = __n;
          memcpy(__dest,pvVar12,(size_t)__n);
        }
        *(basic_string_conflict *)((long)__dest + (long)__n) = (basic_string_conflict)0x0;
      }
      bVar2 = *(byte *)(plVar10 + 7);
      if ((bVar2 & 1) == 0) {
        if (bVar2 >> 1 != 0) goto LAB_008eb478;
LAB_008eb4c0:
                    /* try { // try from 008eb4c0 to 008eb4d3 has its CatchHandler @ 008eb6b4 */
        in_x2 = (basic_string_conflict *)0x1;
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append(&local_80,";",1);
      }
      else {
        if (plVar10[8] == 0) goto LAB_008eb4c0;
LAB_008eb478:
                    /* try { // try from 008eb478 to 008eb483 has its CatchHandler @ 008eb6e8 */
        std::__ndk1::operator+((__ndk1 *)&DAT_002d4f75,(char *)(plVar10 + 7),in_x2);
        in_x2 = (basic_string_conflict *)(ulong)(local_98[0] >> 1);
        pcVar4 = (char *)((ulong)local_98 | 1);
        if ((local_98[0] & 1) != 0) {
          in_x2 = local_90;
          pcVar4 = local_88;
        }
                    /* try { // try from 008eb49c to 008eb4a3 has its CatchHandler @ 008eb6b8 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append(&local_80,pcVar4,(ulong)in_x2);
        if ((local_98[0] & 1) != 0) {
          operator_delete(local_88);
        }
      }
      pvVar12 = pvVar9;
      if (((byte)local_80 & 1) != 0) {
        pvVar12 = (void *)CONCAT53(uStack_6d,CONCAT21(uStack_6f,local_70));
      }
                    /* try { // try from 008eb4e4 to 008eb4eb has its CatchHandler @ 008eb6ec */
      lVar6 = curl_slist_append(lVar8,pvVar12);
      if (lVar6 != 0) {
        lVar8 = lVar6;
      }
      if (((byte)local_80 & 1) != 0) {
        operator_delete((void *)CONCAT53(uStack_6d,CONCAT21(uStack_6f,local_70)));
      }
      plVar11 = (long *)plVar10[1];
      if ((long *)plVar10[1] == (long *)0x0) {
        plVar11 = plVar10 + 2;
        plVar7 = (long *)*plVar11;
        if ((long *)*plVar7 != plVar10) {
          do {
            lVar6 = *plVar11;
            plVar11 = (long *)(lVar6 + 0x10);
            plVar7 = (long *)*plVar11;
          } while (*plVar7 != lVar6);
        }
      }
      else {
        do {
          plVar7 = plVar11;
          plVar11 = (long *)*plVar7;
        } while ((long *)*plVar7 != (long *)0x0);
      }
      plVar10 = plVar7;
    } while (plVar7 != plVar1);
  }
  if (*(char *)(in_x0 + 0x11) != '\0') {
    local_80 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x22;
    uStack_6d = 0;
    uStack_6f = 0x67;
    uStack_77 = 0x69646f636e452d;
    local_70 = 0x6e;
    uStack_7f = 0x6566736e617254;
    uStack_78 = 0x72;
    plVar11 = (long *)*plVar1;
    plVar10 = plVar1;
    if (plVar11 != (long *)0x0) {
      plVar7 = plVar1;
      do {
        uVar5 = CaseInsensitiveCompare::operator()
                          ((CaseInsensitiveCompare *)(in_x0 + 0xa8),
                           (basic_string_conflict *)(plVar11 + 4),(basic_string_conflict *)&local_80
                          );
        lVar6 = 8;
        if ((uVar5 & 1) == 0) {
          lVar6 = 0;
          plVar7 = plVar11;
        }
        plVar11 = *(long **)((long)plVar11 + lVar6);
      } while (plVar11 != (long *)0x0);
      if ((plVar7 != plVar1) &&
         (uVar5 = CaseInsensitiveCompare::operator()
                            ((CaseInsensitiveCompare *)(in_x0 + 0xa8),
                             (basic_string_conflict *)&local_80,
                             (basic_string_conflict *)(plVar7 + 4)), (uVar5 & 1) == 0)) {
        plVar10 = plVar7;
      }
    }
    if (((byte)local_80 & 1) != 0) {
      operator_delete((void *)CONCAT53(uStack_6d,CONCAT21(uStack_6f,local_70)));
    }
    if (plVar10 == plVar1) {
      lVar6 = curl_slist_append(lVar8,"Transfer-Encoding:chunked");
      if (lVar6 != 0) {
        lVar8 = lVar6;
      }
    }
  }
  lVar6 = curl_slist_append(lVar8,"Expect:");
  if (lVar6 != 0) {
    lVar8 = lVar6;
  }
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2727,lVar8);
  curl_slist_free_all(*(undefined8 *)(*(long *)(in_x0 + 0x18) + 8));
  *(long *)(*(long *)(in_x0 + 0x18) + 8) = lVar8;
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

