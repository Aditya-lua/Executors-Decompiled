/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c09f9c
 */

/* std::__ndk1::moneypunct_byname<wchar_t, true>::init(char const*) */

void __thiscall
std::__ndk1::moneypunct_byname<wchar_t,true>::init
          (moneypunct_byname<wchar_t,true> *this,char *param_1)

{
  uint uVar1;
  char cVar2;
  byte bVar3;
  char **ppcVar4;
  __locale_t __dataset;
  __locale_t p_Var5;
  size_t sVar6;
  mbstate_t mVar7;
  undefined8 uVar8;
  int iVar9;
  ulong uVar10;
  char *pcVar11;
  moneypunct_byname<wchar_t,true> *pmVar12;
  ulong uVar13;
  moneypunct_byname<wchar_t,true> *pmVar14;
  ulong uVar15;
  char **ppcVar16;
  char *pcVar17;
  mbstate_t *this_00;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar18;
  char *pcVar19;
  char *pcVar20;
  char *local_210;
  mbstate_t local_208;
  undefined8 local_200;
  char *apcStack_1f8 [49];
  mbstate_t local_70;
  undefined8 uStack_68;
  void *local_60;
  __locale_t local_38;
  
  __dataset = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  local_38 = __dataset;
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00c09fd8 to 00c09fdf has its CatchHandler @ 00c0a764 */
    p_Var5 = uselocale(__dataset);
    local_200 = p_Var5;
                    /* try { // try from 00c09fe8 to 00c09feb has its CatchHandler @ 00c0a72c */
    param_1 = (char *)localeconv();
    if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c09ff4 to 00c09ffb has its CatchHandler @ 00c0a714 */
      uselocale(p_Var5);
    }
    pcVar17 = ((lconv *)param_1)->mon_decimal_point;
    if (*pcVar17 == '\0') {
LAB_00c0a05c:
      iVar9 = -1;
    }
    else {
      local_70.__count = 0;
      local_70.__value.__wch = 0;
      sVar6 = strlen(pcVar17);
                    /* try { // try from 00c0a018 to 00c0a01f has its CatchHandler @ 00c0a764 */
      p_Var5 = uselocale(__dataset);
                    /* try { // try from 00c0a028 to 00c0a03b has its CatchHandler @ 00c0a710 */
      local_200 = p_Var5;
      sVar6 = mbrtowc(&local_208.__count,pcVar17,sVar6,&local_70);
      if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c0a044 to 00c0a04b has its CatchHandler @ 00c0a6f4 */
        uselocale(p_Var5);
      }
      if (0xfffffffffffffffd < sVar6) goto LAB_00c0a05c;
      iVar9 = local_208.__count;
    }
    *(int *)(this + 0x10) = iVar9;
    pcVar17 = ((lconv *)param_1)->mon_thousands_sep;
    if (*pcVar17 == '\0') {
LAB_00c0a0c4:
      local_208.__count = -1;
    }
    else {
      local_70.__count = 0;
      local_70.__value.__wch = 0;
      sVar6 = strlen(pcVar17);
                    /* try { // try from 00c0a080 to 00c0a087 has its CatchHandler @ 00c0a764 */
      p_Var5 = uselocale(__dataset);
                    /* try { // try from 00c0a090 to 00c0a0a3 has its CatchHandler @ 00c0a70c */
      local_200 = p_Var5;
      sVar6 = mbrtowc(&local_208.__count,pcVar17,sVar6,&local_70);
      if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c0a0ac to 00c0a0b3 has its CatchHandler @ 00c0a6f0 */
        uselocale(p_Var5);
      }
      if (0xfffffffffffffffd < sVar6) goto LAB_00c0a0c4;
    }
    *(int *)(this + 0x14) = local_208.__count;
                    /* try { // try from 00c0a0d0 to 00c0a0d7 has its CatchHandler @ 00c0a764 */
    FUN_0080269c(this + 0x18,((lconv *)param_1)->mon_grouping);
    local_210 = ((lconv *)param_1)->int_curr_symbol;
    local_208.__count = 0;
    local_208.__value.__wch = 0;
                    /* try { // try from 00c0a0e0 to 00c0a0e7 has its CatchHandler @ 00c0a760 */
    mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c0a0f0 to 00c0a103 has its CatchHandler @ 00c0a71c */
    local_70 = mVar7;
    sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
    if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c0a10c to 00c0a113 has its CatchHandler @ 00c0a708 */
      uselocale((__locale_t)mVar7);
    }
    if (sVar6 == 0xffffffffffffffff) goto LAB_00c0a6a0;
    this_00 = (mbstate_t *)(this + 0x30);
    mVar7 = *this_00;
    uVar13 = 4;
    if ((this_00->__count & 1) != 0) {
      uVar13 = ((ulong)mVar7 & 0xfffffffffffffffe) - 1;
    }
    if (sVar6 < uVar13 || sVar6 - uVar13 == 0) {
      pmVar12 = this + 0x34;
      if (((ulong)(uint)mVar7.__count & 1) != 0) {
        pmVar12 = *(moneypunct_byname<wchar_t,true> **)(this + 0x40);
      }
      pmVar14 = pmVar12;
      if (sVar6 != 0) goto LAB_00c0a1a0;
    }
    else {
      uVar10 = (ulong)mVar7 >> 1 & 0x7f;
      if (((ulong)(uint)mVar7.__count & 1) != 0) {
        uVar10 = *(ulong *)(this + 0x38);
      }
                    /* try { // try from 00c0a158 to 00c0a267 has its CatchHandler @ 00c0a768 */
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 *)this_00,uVar13,sVar6 - uVar13,uVar10,0,uVar10,0);
      *(undefined8 *)(this + 0x38) = 0;
      pmVar14 = this + 0x34;
      if (((byte)this[0x30] & 1) != 0) {
        pmVar14 = *(moneypunct_byname<wchar_t,true> **)(this + 0x40);
      }
LAB_00c0a1a0:
      uVar13 = sVar6 - 1 & 0x3fffffffffffffff;
      pcVar17 = (char *)&local_200;
      if ((6 < uVar13) && (0x1f < (ulong)((long)pmVar14 - (long)pcVar17))) {
        uVar13 = uVar13 + 1;
        uVar15 = uVar13 & 0x7ffffffffffffff8;
        pmVar12 = pmVar14 + uVar15 * 4;
        pcVar17 = (&local_208)[1].__value.__wchb + uVar15 * 4 + -4;
        ppcVar16 = apcStack_1f8 + 1;
        pmVar14 = pmVar14 + 0x10;
        uVar10 = uVar15;
        do {
          ppcVar4 = ppcVar16 + -1;
          pcVar11 = ppcVar16[-2];
          pcVar20 = ppcVar16[1];
          pcVar19 = *ppcVar16;
          uVar10 = uVar10 - 8;
          ppcVar16 = ppcVar16 + 4;
          *(char **)(pmVar14 + -8) = *ppcVar4;
          *(char **)(pmVar14 + -0x10) = pcVar11;
          *(char **)(pmVar14 + 8) = pcVar20;
          *(char **)pmVar14 = pcVar19;
          pmVar14 = pmVar14 + 0x20;
        } while (uVar10 != 0);
        pmVar14 = pmVar12;
        if (uVar13 == uVar15) goto LAB_00c0a224;
      }
      do {
        pcVar11 = pcVar17 + 4;
        pmVar12 = pmVar14 + 4;
        *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
        pcVar17 = pcVar11;
        pmVar14 = pmVar12;
      } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
    }
LAB_00c0a224:
    *(undefined4 *)pmVar12 = 0;
    if ((this_00->__count & 1) == 0) {
      *(char *)&this_00->__count = (char)((int)sVar6 << 1);
    }
    else {
      *(size_t *)(this + 0x38) = sVar6;
    }
    uVar1 = 0;
    if ((byte)((lconv *)param_1)->int_frac_digits != 0xff) {
      uVar1 = (uint)(byte)((lconv *)param_1)->int_frac_digits;
    }
    *(uint *)(this + 0x78) = uVar1;
    if (((lconv *)param_1)->int_p_sign_posn == '\0') {
      if (((byte)this[0x48] & 1) == 0) {
        this[0x48] = (moneypunct_byname<wchar_t,true>)0x4;
        pmVar12 = this + 0x4c;
      }
      else {
        pmVar12 = *(moneypunct_byname<wchar_t,true> **)(this + 0x58);
        *(undefined8 *)(this + 0x50) = 2;
      }
      *(undefined4 *)(pmVar12 + 8) = 0;
      *(undefined8 *)pmVar12 = 0x2900000028;
      cVar2 = ((lconv *)param_1)->int_n_sign_posn;
joined_r0x00c0a420:
      if (cVar2 == '\0') {
        if (((byte)this[0x60] & 1) == 0) {
          this[0x60] = (moneypunct_byname<wchar_t,true>)0x4;
          pmVar12 = this + 100;
        }
        else {
          pmVar12 = *(moneypunct_byname<wchar_t,true> **)(this + 0x70);
          *(undefined8 *)(this + 0x68) = 2;
        }
        *(undefined4 *)(pmVar12 + 8) = 0;
        *(undefined8 *)pmVar12 = 0x2900000028;
        bVar3 = (byte)this_00->__count;
        goto joined_r0x00c0a5cc;
      }
      local_210 = ((lconv *)param_1)->negative_sign;
      local_208.__count = 0;
      local_208.__value.__wch = 0;
      mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c0a43c to 00c0a44f has its CatchHandler @ 00c0a700 */
      local_70 = mVar7;
      sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
      if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c0a458 to 00c0a45f has its CatchHandler @ 00c0a6e8 */
        uselocale((__locale_t)mVar7);
      }
      if (sVar6 == 0xffffffffffffffff) goto LAB_00c0a65c;
      pbVar18 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 *)(this + 0x60);
      uVar10 = *(ulong *)pbVar18;
      uVar13 = 4;
      if (((byte)*pbVar18 & 1) != 0) {
        uVar13 = (uVar10 & 0xfffffffffffffffe) - 1;
      }
      if (sVar6 < uVar13 || sVar6 - uVar13 == 0) {
        pmVar12 = this + 100;
        if ((uVar10 & 1) != 0) {
          pmVar12 = *(moneypunct_byname<wchar_t,true> **)(this + 0x70);
        }
        pmVar14 = pmVar12;
        if (sVar6 != 0) goto LAB_00c0a4ec;
      }
      else {
        uVar15 = uVar10 >> 1 & 0x7f;
        if ((uVar10 & 1) != 0) {
          uVar15 = *(ulong *)(this + 0x68);
        }
                    /* try { // try from 00c0a4a4 to 00c0a4b7 has its CatchHandler @ 00c0a768 */
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by(pbVar18,uVar13,sVar6 - uVar13,uVar15,0,uVar15,0);
        *(undefined8 *)(this + 0x68) = 0;
        pmVar14 = this + 100;
        if (((byte)this[0x60] & 1) != 0) {
          pmVar14 = *(moneypunct_byname<wchar_t,true> **)(this + 0x70);
        }
LAB_00c0a4ec:
        uVar13 = sVar6 - 1 & 0x3fffffffffffffff;
        pcVar17 = (char *)&local_200;
        if ((6 < uVar13) && (0x1f < (ulong)((long)pmVar14 - (long)pcVar17))) {
          uVar13 = uVar13 + 1;
          uVar15 = uVar13 & 0x7ffffffffffffff8;
          pmVar12 = pmVar14 + uVar15 * 4;
          pcVar17 = (&local_208)[1].__value.__wchb + uVar15 * 4 + -4;
          ppcVar16 = apcStack_1f8 + 1;
          pmVar14 = pmVar14 + 0x10;
          uVar10 = uVar15;
          do {
            ppcVar4 = ppcVar16 + -1;
            pcVar11 = ppcVar16[-2];
            pcVar20 = ppcVar16[1];
            pcVar19 = *ppcVar16;
            uVar10 = uVar10 - 8;
            ppcVar16 = ppcVar16 + 4;
            *(char **)(pmVar14 + -8) = *ppcVar4;
            *(char **)(pmVar14 + -0x10) = pcVar11;
            *(char **)(pmVar14 + 8) = pcVar20;
            *(char **)pmVar14 = pcVar19;
            pmVar14 = pmVar14 + 0x20;
          } while (uVar10 != 0);
          pmVar14 = pmVar12;
          if (uVar13 == uVar15) goto LAB_00c0a570;
        }
        do {
          pcVar11 = pcVar17 + 4;
          pmVar12 = pmVar14 + 4;
          *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
          pcVar17 = pcVar11;
          pmVar14 = pmVar12;
        } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
      }
LAB_00c0a570:
      *(undefined4 *)pmVar12 = 0;
      if (((byte)*pbVar18 & 1) == 0) {
        *pbVar18 = SUB41((int)sVar6 << 1,0);
        bVar3 = (byte)this_00->__count;
      }
      else {
        *(size_t *)(this + 0x68) = sVar6;
        bVar3 = (byte)this_00->__count;
      }
joined_r0x00c0a5cc:
      if ((bVar3 & 1) == 0) {
        uStack_68 = *(undefined8 *)(this + 0x38);
        local_70 = *this_00;
        local_60 = *(void **)(this + 0x40);
      }
      else {
                    /* try { // try from 00c0a5a0 to 00c0a5a7 has its CatchHandler @ 00c0a6f8 */
        FUN_00bc5654(&local_70,*(undefined8 *)(this + 0x40),*(undefined8 *)(this + 0x38));
      }
                    /* try { // try from 00c0a5ec to 00c0a617 has its CatchHandler @ 00c0a73c */
      FUN_00c09a68(this + 0x7c,&local_70,1,((lconv *)param_1)->int_p_cs_precedes,
                   ((lconv *)param_1)->int_p_sep_by_space,((lconv *)param_1)->int_p_sign_posn);
      FUN_00c09a68(this + 0x80,this_00,1,((lconv *)param_1)->int_n_cs_precedes,
                   ((lconv *)param_1)->int_n_sep_by_space,((lconv *)param_1)->int_n_sign_posn);
      if (((ulong)(uint)local_70.__count & 1) != 0) {
        operator_delete(local_60,((ulong)local_70 & 0x3ffffffffffffffe) << 2);
      }
                    /* try { // try from 00c0a634 to 00c0a63b has its CatchHandler @ 00c0a718 */
      freelocale(__dataset);
      return;
    }
    local_210 = ((lconv *)param_1)->positive_sign;
    local_208.__count = 0;
    local_208.__value.__wch = 0;
    mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c0a270 to 00c0a283 has its CatchHandler @ 00c0a704 */
    local_70 = mVar7;
    sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
    if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c0a28c to 00c0a293 has its CatchHandler @ 00c0a6ec */
      uselocale((__locale_t)mVar7);
    }
    if (sVar6 != 0xffffffffffffffff) {
      pbVar18 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 *)(this + 0x48);
      uVar10 = *(ulong *)pbVar18;
      uVar13 = 4;
      if (((byte)*pbVar18 & 1) != 0) {
        uVar13 = (uVar10 & 0xfffffffffffffffe) - 1;
      }
      if (sVar6 < uVar13 || sVar6 - uVar13 == 0) {
        pmVar12 = this + 0x4c;
        if ((uVar10 & 1) != 0) {
          pmVar12 = *(moneypunct_byname<wchar_t,true> **)(this + 0x58);
        }
        pmVar14 = pmVar12;
        if (sVar6 != 0) goto LAB_00c0a338;
      }
      else {
        uVar15 = uVar10 >> 1 & 0x7f;
        if ((uVar10 & 1) != 0) {
          uVar15 = *(ulong *)(this + 0x50);
        }
                    /* try { // try from 00c0a2d8 to 00c0a433 has its CatchHandler @ 00c0a768 */
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by(pbVar18,uVar13,sVar6 - uVar13,uVar15,0,uVar15,0);
        *(undefined8 *)(this + 0x50) = 0;
        pmVar14 = this + 0x4c;
        if (((byte)this[0x48] & 1) != 0) {
          pmVar14 = *(moneypunct_byname<wchar_t,true> **)(this + 0x58);
        }
LAB_00c0a338:
        uVar13 = sVar6 - 1 & 0x3fffffffffffffff;
        pcVar17 = (char *)&local_200;
        if ((6 < uVar13) && (0x1f < (ulong)((long)pmVar14 - (long)pcVar17))) {
          uVar13 = uVar13 + 1;
          uVar15 = uVar13 & 0x7ffffffffffffff8;
          pmVar12 = pmVar14 + uVar15 * 4;
          pcVar17 = (&local_208)[1].__value.__wchb + uVar15 * 4 + -4;
          ppcVar16 = apcStack_1f8 + 1;
          pmVar14 = pmVar14 + 0x10;
          uVar10 = uVar15;
          do {
            ppcVar4 = ppcVar16 + -1;
            pcVar11 = ppcVar16[-2];
            pcVar20 = ppcVar16[1];
            pcVar19 = *ppcVar16;
            uVar10 = uVar10 - 8;
            ppcVar16 = ppcVar16 + 4;
            *(char **)(pmVar14 + -8) = *ppcVar4;
            *(char **)(pmVar14 + -0x10) = pcVar11;
            *(char **)(pmVar14 + 8) = pcVar20;
            *(char **)pmVar14 = pcVar19;
            pmVar14 = pmVar14 + 0x20;
          } while (uVar10 != 0);
          pmVar14 = pmVar12;
          if (uVar13 == uVar15) goto LAB_00c0a3bc;
        }
        do {
          pcVar11 = pcVar17 + 4;
          pmVar12 = pmVar14 + 4;
          *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
          pcVar17 = pcVar11;
          pmVar14 = pmVar12;
        } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
      }
LAB_00c0a3bc:
      *(undefined4 *)pmVar12 = 0;
      if (((byte)*pbVar18 & 1) == 0) {
        *pbVar18 = SUB41((int)sVar6 << 1,0);
        cVar2 = ((lconv *)param_1)->int_n_sign_posn;
      }
      else {
        *(size_t *)(this + 0x50) = sVar6;
        cVar2 = ((lconv *)param_1)->int_n_sign_posn;
      }
      goto joined_r0x00c0a420;
    }
LAB_00c0a65c:
                    /* try { // try from 00c0a65c to 00c0a667 has its CatchHandler @ 00c0a768 */
    __throw_runtime_error("locale not supported");
  }
                    /* try { // try from 00c0a668 to 00c0a673 has its CatchHandler @ 00c0a6fc */
  FUN_00852d7c(&local_70,param_1);
                    /* try { // try from 00c0a674 to 00c0a68b has its CatchHandler @ 00c0a6cc */
  FUN_00bfb964(&local_200,"moneypunct_byname failed to construct for ",&local_70);
  pcVar17 = apcStack_1f8[1];
  if (((ulong)local_200 & 1) == 0) {
    pcVar17 = (char *)((long)&local_200 + 1);
  }
                    /* try { // try from 00c0a69c to 00c0a69f has its CatchHandler @ 00c0a6ac */
  __throw_runtime_error(pcVar17);
LAB_00c0a6a0:
                    /* try { // try from 00c0a6a0 to 00c0a6ab has its CatchHandler @ 00c0a760 */
  uVar8 = __throw_runtime_error("locale not supported");
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c0a69c with catch @ 00c0a6ac
                        */
  if (((ulong)local_200 & 1) != 0) {
    operator_delete(apcStack_1f8[1],(ulong)local_200 & 0xfffffffffffffffe);
  }
  if (((ulong)(uint)local_70.__count & 1) != 0) {
    operator_delete(local_60,(ulong)local_70 & 0xfffffffffffffffe);
  }
  FUN_00c02418(&local_38);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar8);
}

