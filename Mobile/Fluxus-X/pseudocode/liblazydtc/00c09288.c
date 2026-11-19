/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c09288
 */

/* std::__ndk1::moneypunct_byname<wchar_t, false>::init(char const*) */

void __thiscall
std::__ndk1::moneypunct_byname<wchar_t,false>::init
          (moneypunct_byname<wchar_t,false> *this,char *param_1)

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
  moneypunct_byname<wchar_t,false> *pmVar12;
  ulong uVar13;
  moneypunct_byname<wchar_t,false> *pmVar14;
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
                    /* try { // try from 00c092c4 to 00c092cb has its CatchHandler @ 00c09a50 */
    p_Var5 = uselocale(__dataset);
    local_200 = p_Var5;
                    /* try { // try from 00c092d4 to 00c092d7 has its CatchHandler @ 00c09a18 */
    param_1 = (char *)localeconv();
    if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c092e0 to 00c092e7 has its CatchHandler @ 00c09a00 */
      uselocale(p_Var5);
    }
    pcVar17 = ((lconv *)param_1)->mon_decimal_point;
    if (*pcVar17 == '\0') {
LAB_00c09348:
      iVar9 = -1;
    }
    else {
      local_70.__count = 0;
      local_70.__value.__wch = 0;
      sVar6 = strlen(pcVar17);
                    /* try { // try from 00c09304 to 00c0930b has its CatchHandler @ 00c09a50 */
      p_Var5 = uselocale(__dataset);
                    /* try { // try from 00c09314 to 00c09327 has its CatchHandler @ 00c099fc */
      local_200 = p_Var5;
      sVar6 = mbrtowc(&local_208.__count,pcVar17,sVar6,&local_70);
      if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c09330 to 00c09337 has its CatchHandler @ 00c099e0 */
        uselocale(p_Var5);
      }
      if (0xfffffffffffffffd < sVar6) goto LAB_00c09348;
      iVar9 = local_208.__count;
    }
    *(int *)(this + 0x10) = iVar9;
    pcVar17 = ((lconv *)param_1)->mon_thousands_sep;
    if (*pcVar17 == '\0') {
LAB_00c093b0:
      local_208.__count = -1;
    }
    else {
      local_70.__count = 0;
      local_70.__value.__wch = 0;
      sVar6 = strlen(pcVar17);
                    /* try { // try from 00c0936c to 00c09373 has its CatchHandler @ 00c09a50 */
      p_Var5 = uselocale(__dataset);
                    /* try { // try from 00c0937c to 00c0938f has its CatchHandler @ 00c099f8 */
      local_200 = p_Var5;
      sVar6 = mbrtowc(&local_208.__count,pcVar17,sVar6,&local_70);
      if (p_Var5 != (__locale_t)0x0) {
                    /* try { // try from 00c09398 to 00c0939f has its CatchHandler @ 00c099dc */
        uselocale(p_Var5);
      }
      if (0xfffffffffffffffd < sVar6) goto LAB_00c093b0;
    }
    *(int *)(this + 0x14) = local_208.__count;
                    /* try { // try from 00c093bc to 00c093c3 has its CatchHandler @ 00c09a50 */
    FUN_0080269c(this + 0x18,((lconv *)param_1)->mon_grouping);
    local_210 = ((lconv *)param_1)->currency_symbol;
    local_208.__count = 0;
    local_208.__value.__wch = 0;
                    /* try { // try from 00c093cc to 00c093d3 has its CatchHandler @ 00c09a4c */
    mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c093dc to 00c093ef has its CatchHandler @ 00c09a08 */
    local_70 = mVar7;
    sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
    if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c093f8 to 00c093ff has its CatchHandler @ 00c099f4 */
      uselocale((__locale_t)mVar7);
    }
    if (sVar6 == 0xffffffffffffffff) goto LAB_00c0998c;
    this_00 = (mbstate_t *)(this + 0x30);
    mVar7 = *this_00;
    uVar13 = 4;
    if ((this_00->__count & 1) != 0) {
      uVar13 = ((ulong)mVar7 & 0xfffffffffffffffe) - 1;
    }
    if (sVar6 < uVar13 || sVar6 - uVar13 == 0) {
      pmVar12 = this + 0x34;
      if (((ulong)(uint)mVar7.__count & 1) != 0) {
        pmVar12 = *(moneypunct_byname<wchar_t,false> **)(this + 0x40);
      }
      pmVar14 = pmVar12;
      if (sVar6 != 0) goto LAB_00c0948c;
    }
    else {
      uVar10 = (ulong)mVar7 >> 1 & 0x7f;
      if (((ulong)(uint)mVar7.__count & 1) != 0) {
        uVar10 = *(ulong *)(this + 0x38);
      }
                    /* try { // try from 00c09444 to 00c09553 has its CatchHandler @ 00c09a54 */
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 *)this_00,uVar13,sVar6 - uVar13,uVar10,0,uVar10,0);
      *(undefined8 *)(this + 0x38) = 0;
      pmVar14 = this + 0x34;
      if (((byte)this[0x30] & 1) != 0) {
        pmVar14 = *(moneypunct_byname<wchar_t,false> **)(this + 0x40);
      }
LAB_00c0948c:
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
        if (uVar13 == uVar15) goto LAB_00c09510;
      }
      do {
        pcVar11 = pcVar17 + 4;
        pmVar12 = pmVar14 + 4;
        *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
        pcVar17 = pcVar11;
        pmVar14 = pmVar12;
      } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
    }
LAB_00c09510:
    *(undefined4 *)pmVar12 = 0;
    if ((this_00->__count & 1) == 0) {
      *(char *)&this_00->__count = (char)((int)sVar6 << 1);
    }
    else {
      *(size_t *)(this + 0x38) = sVar6;
    }
    uVar1 = 0;
    if ((byte)((lconv *)param_1)->frac_digits != 0xff) {
      uVar1 = (uint)(byte)((lconv *)param_1)->frac_digits;
    }
    *(uint *)(this + 0x78) = uVar1;
    if (((lconv *)param_1)->p_sign_posn == '\0') {
      if (((byte)this[0x48] & 1) == 0) {
        this[0x48] = (moneypunct_byname<wchar_t,false>)0x4;
        pmVar12 = this + 0x4c;
      }
      else {
        pmVar12 = *(moneypunct_byname<wchar_t,false> **)(this + 0x58);
        *(undefined8 *)(this + 0x50) = 2;
      }
      *(undefined4 *)(pmVar12 + 8) = 0;
      *(undefined8 *)pmVar12 = 0x2900000028;
      cVar2 = ((lconv *)param_1)->n_sign_posn;
joined_r0x00c0970c:
      if (cVar2 == '\0') {
        if (((byte)this[0x60] & 1) == 0) {
          this[0x60] = (moneypunct_byname<wchar_t,false>)0x4;
          pmVar12 = this + 100;
        }
        else {
          pmVar12 = *(moneypunct_byname<wchar_t,false> **)(this + 0x70);
          *(undefined8 *)(this + 0x68) = 2;
        }
        *(undefined4 *)(pmVar12 + 8) = 0;
        *(undefined8 *)pmVar12 = 0x2900000028;
        bVar3 = (byte)this_00->__count;
        goto joined_r0x00c098b8;
      }
      local_210 = ((lconv *)param_1)->negative_sign;
      local_208.__count = 0;
      local_208.__value.__wch = 0;
      mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c09728 to 00c0973b has its CatchHandler @ 00c099ec */
      local_70 = mVar7;
      sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
      if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c09744 to 00c0974b has its CatchHandler @ 00c099d4 */
        uselocale((__locale_t)mVar7);
      }
      if (sVar6 == 0xffffffffffffffff) goto LAB_00c09948;
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
          pmVar12 = *(moneypunct_byname<wchar_t,false> **)(this + 0x70);
        }
        pmVar14 = pmVar12;
        if (sVar6 != 0) goto LAB_00c097d8;
      }
      else {
        uVar15 = uVar10 >> 1 & 0x7f;
        if ((uVar10 & 1) != 0) {
          uVar15 = *(ulong *)(this + 0x68);
        }
                    /* try { // try from 00c09790 to 00c097a3 has its CatchHandler @ 00c09a54 */
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by(pbVar18,uVar13,sVar6 - uVar13,uVar15,0,uVar15,0);
        *(undefined8 *)(this + 0x68) = 0;
        pmVar14 = this + 100;
        if (((byte)this[0x60] & 1) != 0) {
          pmVar14 = *(moneypunct_byname<wchar_t,false> **)(this + 0x70);
        }
LAB_00c097d8:
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
          if (uVar13 == uVar15) goto LAB_00c0985c;
        }
        do {
          pcVar11 = pcVar17 + 4;
          pmVar12 = pmVar14 + 4;
          *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
          pcVar17 = pcVar11;
          pmVar14 = pmVar12;
        } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
      }
LAB_00c0985c:
      *(undefined4 *)pmVar12 = 0;
      if (((byte)*pbVar18 & 1) == 0) {
        *pbVar18 = SUB41((int)sVar6 << 1,0);
        bVar3 = (byte)this_00->__count;
      }
      else {
        *(size_t *)(this + 0x68) = sVar6;
        bVar3 = (byte)this_00->__count;
      }
joined_r0x00c098b8:
      if ((bVar3 & 1) == 0) {
        uStack_68 = *(undefined8 *)(this + 0x38);
        local_70 = *this_00;
        local_60 = *(void **)(this + 0x40);
      }
      else {
                    /* try { // try from 00c0988c to 00c09893 has its CatchHandler @ 00c099e4 */
        FUN_00bc5654(&local_70,*(undefined8 *)(this + 0x40),*(undefined8 *)(this + 0x38));
      }
                    /* try { // try from 00c098d8 to 00c09903 has its CatchHandler @ 00c09a28 */
      FUN_00c09a68(this + 0x7c,&local_70,0,((lconv *)param_1)->p_cs_precedes,
                   ((lconv *)param_1)->p_sep_by_space,((lconv *)param_1)->p_sign_posn);
      FUN_00c09a68(this + 0x80,this_00,0,((lconv *)param_1)->n_cs_precedes,
                   ((lconv *)param_1)->n_sep_by_space,((lconv *)param_1)->n_sign_posn);
      if (((ulong)(uint)local_70.__count & 1) != 0) {
        operator_delete(local_60,((ulong)local_70 & 0x3ffffffffffffffe) << 2);
      }
                    /* try { // try from 00c09920 to 00c09927 has its CatchHandler @ 00c09a04 */
      freelocale(__dataset);
      return;
    }
    local_210 = ((lconv *)param_1)->positive_sign;
    local_208.__count = 0;
    local_208.__value.__wch = 0;
    mVar7 = (mbstate_t)uselocale(__dataset);
                    /* try { // try from 00c0955c to 00c0956f has its CatchHandler @ 00c099f0 */
    local_70 = mVar7;
    sVar6 = mbsrtowcs((wchar_t *)&local_200,&local_210,100,&local_208);
    if (mVar7 != (mbstate_t)0x0) {
                    /* try { // try from 00c09578 to 00c0957f has its CatchHandler @ 00c099d8 */
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
          pmVar12 = *(moneypunct_byname<wchar_t,false> **)(this + 0x58);
        }
        pmVar14 = pmVar12;
        if (sVar6 != 0) goto LAB_00c09624;
      }
      else {
        uVar15 = uVar10 >> 1 & 0x7f;
        if ((uVar10 & 1) != 0) {
          uVar15 = *(ulong *)(this + 0x50);
        }
                    /* try { // try from 00c095c4 to 00c0971f has its CatchHandler @ 00c09a54 */
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by(pbVar18,uVar13,sVar6 - uVar13,uVar15,0,uVar15,0);
        *(undefined8 *)(this + 0x50) = 0;
        pmVar14 = this + 0x4c;
        if (((byte)this[0x48] & 1) != 0) {
          pmVar14 = *(moneypunct_byname<wchar_t,false> **)(this + 0x58);
        }
LAB_00c09624:
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
          if (uVar13 == uVar15) goto LAB_00c096a8;
        }
        do {
          pcVar11 = pcVar17 + 4;
          pmVar12 = pmVar14 + 4;
          *(undefined4 *)pmVar14 = *(undefined4 *)pcVar17;
          pcVar17 = pcVar11;
          pmVar14 = pmVar12;
        } while (pcVar11 != (&local_208)[1].__value.__wchb + sVar6 * 4 + -4);
      }
LAB_00c096a8:
      *(undefined4 *)pmVar12 = 0;
      if (((byte)*pbVar18 & 1) == 0) {
        *pbVar18 = SUB41((int)sVar6 << 1,0);
        cVar2 = ((lconv *)param_1)->n_sign_posn;
      }
      else {
        *(size_t *)(this + 0x50) = sVar6;
        cVar2 = ((lconv *)param_1)->n_sign_posn;
      }
      goto joined_r0x00c0970c;
    }
LAB_00c09948:
                    /* try { // try from 00c09948 to 00c09953 has its CatchHandler @ 00c09a54 */
    __throw_runtime_error("locale not supported");
  }
                    /* try { // try from 00c09954 to 00c0995f has its CatchHandler @ 00c099e8 */
  FUN_00852d7c(&local_70,param_1);
                    /* try { // try from 00c09960 to 00c09977 has its CatchHandler @ 00c099b8 */
  FUN_00bfb964(&local_200,"moneypunct_byname failed to construct for ",&local_70);
  pcVar17 = apcStack_1f8[1];
  if (((ulong)local_200 & 1) == 0) {
    pcVar17 = (char *)((long)&local_200 + 1);
  }
                    /* try { // try from 00c09988 to 00c0998b has its CatchHandler @ 00c09998 */
  __throw_runtime_error(pcVar17);
LAB_00c0998c:
                    /* try { // try from 00c0998c to 00c09997 has its CatchHandler @ 00c09a4c */
  uVar8 = __throw_runtime_error("locale not supported");
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c09988 with catch @ 00c09998
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

