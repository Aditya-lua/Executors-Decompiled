/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c06b78
 */

/* std::__ndk1::__time_get_storage<wchar_t>::init(std::__ndk1::ctype<wchar_t> const&) */

void std::__ndk1::__time_get_storage<wchar_t>::init(ctype *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  char cVar3;
  __locale_t p_Var4;
  size_t sVar5;
  uint uVar6;
  wchar_t *pwVar7;
  wchar_t *pwVar8;
  ulong uVar9;
  ulong uVar10;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar11;
  ctype *pcVar12;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar13;
  ctype *pcVar14;
  ulong uVar15;
  undefined8 *puVar16;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uStack_2b8;
  undefined8 local_2b0;
  char *local_2a8;
  mbstate_t local_2a0;
  wchar_t local_294 [2];
  undefined8 auStack_28c [49];
  char acStack_104 [100];
  tm local_a0;
  
  lVar18 = 0;
  local_a0.tm_zone = (char *)0x0;
  local_2a0.__count = 0;
  local_2a0.__value.__wch = 0;
  local_a0.tm_wday = 0;
  local_a0.tm_yday = 0;
  local_a0.tm_mon = 0;
  local_a0.tm_year = 0;
  local_a0.tm_gmtoff = 0;
  local_a0.tm_isdst = 0;
  local_a0._36_4_ = 0;
  local_a0.tm_hour = 0;
  local_a0.tm_mday = 0;
  local_a0.tm_sec = 0;
  local_a0.tm_min = 0;
  do {
    local_a0.tm_wday = (int)lVar18;
    strftime_l(acStack_104,100,"%A",&local_a0,*(__locale_t *)param_1);
    local_2a0.__count = 0;
    local_2a0.__value.__wch = 0;
    local_2a8 = acStack_104;
    p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c06c20 to 00c06c33 has its CatchHandler @ 00c0760c */
    sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
    if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c06c3c to 00c06c43 has its CatchHandler @ 00c075fc */
      uselocale(p_Var4);
    }
    if (sVar5 + 1 < 2) goto LAB_00c075d4;
    pbVar17 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + lVar18 * 0x18 + 8);
    uVar9 = *(ulong *)pbVar17;
    uVar6 = (uint)uVar9 & 0xff;
    uVar10 = 4;
    if (((byte)*pbVar17 & 1) != 0) {
      uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
    }
    if (uVar10 <= sVar5 && sVar5 - uVar10 != 0) {
      uVar15 = uVar9 >> 1 & 0x7f;
      if ((uVar9 & 1) != 0) {
        uVar15 = *(ulong *)(pbVar17 + 8);
      }
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by(pbVar17,uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
      uVar6 = (uint)(byte)*pbVar17;
      *(undefined8 *)(pbVar17 + 8) = 0;
    }
    uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
    pwVar8 = local_294;
    pbVar13 = pbVar17 + 4;
    if ((uVar6 & 1) != 0) {
      pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  **)(pbVar17 + 0x10);
    }
    pbVar11 = pbVar13;
    if ((uVar10 < 7) || ((ulong)((long)pbVar13 - (long)pwVar8) < 0x20)) {
LAB_00c06d18:
      pbVar13 = pbVar11;
      do {
        pwVar7 = pwVar8 + 1;
        pbVar11 = pbVar13 + 4;
        *(wchar_t *)pbVar13 = *pwVar8;
        pwVar8 = pwVar7;
        pbVar13 = pbVar11;
      } while (pwVar7 != local_294 + sVar5);
    }
    else {
      uVar10 = uVar10 + 1;
      uVar15 = uVar10 & 0x7ffffffffffffff8;
      pbVar11 = pbVar13 + uVar15 * 4;
      pwVar8 = local_294 + uVar15;
      pbVar13 = pbVar13 + 0x10;
      uVar9 = uVar15;
      puVar16 = auStack_28c + 1;
      do {
        puVar2 = puVar16 + -1;
        uVar19 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar9 = uVar9 - 8;
        puVar16 = puVar16 + 4;
        *(undefined8 *)(pbVar13 + -8) = *puVar2;
        *(undefined8 *)(pbVar13 + -0x10) = uVar19;
        *(undefined8 *)(pbVar13 + 8) = uVar21;
        *(undefined8 *)pbVar13 = uVar20;
        pbVar13 = pbVar13 + 0x20;
      } while (uVar9 != 0);
      if (uVar10 != uVar15) goto LAB_00c06d18;
    }
    *(wchar_t *)pbVar11 = L'\0';
    if (((byte)*pbVar17 & 1) == 0) {
      *pbVar17 = SUB41((int)sVar5 << 1,0);
    }
    else {
      *(size_t *)(pbVar17 + 8) = sVar5;
    }
    strftime_l(acStack_104,100,"%a",&local_a0,*(__locale_t *)param_1);
    local_2a0.__count = 0;
    local_2a0.__value.__wch = 0;
    local_2a8 = acStack_104;
    p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c06d7c to 00c06d8f has its CatchHandler @ 00c07608 */
    sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
    if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c06d98 to 00c06d9f has its CatchHandler @ 00c075f8 */
      uselocale(p_Var4);
    }
    if (sVar5 + 1 < 2) goto LAB_00c075d4;
    lVar1 = lVar18 * 0x18;
    pbVar17 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + lVar1 + 0xb0);
    uVar9 = *(ulong *)pbVar17;
    uVar6 = (uint)uVar9 & 0xff;
    uVar10 = 4;
    if (((byte)*pbVar17 & 1) != 0) {
      uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
    }
    if (uVar10 <= sVar5 && sVar5 - uVar10 != 0) {
      uVar15 = uVar9 >> 1 & 0x7f;
      if ((uVar9 & 1) != 0) {
        uVar15 = *(ulong *)(param_1 + lVar1 + 0xb8);
      }
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by(pbVar17,uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
      uVar6 = (uint)(byte)*pbVar17;
      *(undefined8 *)(param_1 + lVar1 + 0xb8) = 0;
    }
    uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
    pwVar8 = local_294;
    pcVar14 = param_1 + lVar1 + 0xb4;
    if ((uVar6 & 1) != 0) {
      pcVar14 = *(ctype **)(param_1 + lVar1 + 0xc0);
    }
    pcVar12 = pcVar14;
    if ((uVar10 < 7) || ((ulong)((long)pcVar14 - (long)pwVar8) < 0x20)) {
LAB_00c06e74:
      pcVar14 = pcVar12;
      do {
        pwVar7 = pwVar8 + 1;
        pcVar12 = pcVar14 + 4;
        *(wchar_t *)pcVar14 = *pwVar8;
        pwVar8 = pwVar7;
        pcVar14 = pcVar12;
      } while (pwVar7 != local_294 + sVar5);
    }
    else {
      uVar10 = uVar10 + 1;
      uVar15 = uVar10 & 0x7ffffffffffffff8;
      pcVar12 = pcVar14 + uVar15 * 4;
      pwVar8 = local_294 + uVar15;
      pcVar14 = pcVar14 + 0x10;
      uVar9 = uVar15;
      puVar16 = auStack_28c + 1;
      do {
        puVar2 = puVar16 + -1;
        uVar19 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar9 = uVar9 - 8;
        puVar16 = puVar16 + 4;
        *(undefined8 *)(pcVar14 + -8) = *puVar2;
        *(undefined8 *)(pcVar14 + -0x10) = uVar19;
        *(undefined8 *)(pcVar14 + 8) = uVar21;
        *(undefined8 *)pcVar14 = uVar20;
        pcVar14 = pcVar14 + 0x20;
      } while (uVar9 != 0);
      if (uVar10 != uVar15) goto LAB_00c06e74;
    }
    *(wchar_t *)pcVar12 = L'\0';
    if (((byte)*pbVar17 & 1) == 0) {
      *pbVar17 = SUB41((int)sVar5 << 1,0);
    }
    else {
      *(size_t *)(param_1 + lVar1 + 0xb8) = sVar5;
    }
    lVar18 = lVar18 + 1;
  } while (lVar18 != 7);
  lVar18 = 0;
  do {
    local_a0.tm_mon = (int)lVar18;
    strftime_l(acStack_104,100,"%B",&local_a0,*(__locale_t *)param_1);
    local_2a0.__count = 0;
    local_2a0.__value.__wch = 0;
    local_2a8 = acStack_104;
    p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c06f08 to 00c06f1b has its CatchHandler @ 00c07604 */
    sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
    if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c06f24 to 00c06f2b has its CatchHandler @ 00c075f4 */
      uselocale(p_Var4);
    }
    if (sVar5 + 1 < 2) goto LAB_00c075d4;
    pbVar17 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + lVar18 * 0x18 + 0x158);
    uVar9 = *(ulong *)pbVar17;
    uVar6 = (uint)uVar9 & 0xff;
    uVar10 = 4;
    if (((byte)*pbVar17 & 1) != 0) {
      uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
    }
    if (uVar10 <= sVar5 && sVar5 - uVar10 != 0) {
      uVar15 = uVar9 >> 1 & 0x7f;
      if ((uVar9 & 1) != 0) {
        uVar15 = *(ulong *)(pbVar17 + 8);
      }
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by(pbVar17,uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
      uVar6 = (uint)(byte)*pbVar17;
      *(undefined8 *)(pbVar17 + 8) = 0;
    }
    uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
    pwVar8 = local_294;
    pbVar13 = pbVar17 + 4;
    if ((uVar6 & 1) != 0) {
      pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  **)(pbVar17 + 0x10);
    }
    pbVar11 = pbVar13;
    if ((uVar10 < 7) || ((ulong)((long)pbVar13 - (long)pwVar8) < 0x20)) {
LAB_00c07000:
      pbVar13 = pbVar11;
      do {
        pwVar7 = pwVar8 + 1;
        pbVar11 = pbVar13 + 4;
        *(wchar_t *)pbVar13 = *pwVar8;
        pwVar8 = pwVar7;
        pbVar13 = pbVar11;
      } while (pwVar7 != local_294 + sVar5);
    }
    else {
      uVar10 = uVar10 + 1;
      uVar15 = uVar10 & 0x7ffffffffffffff8;
      pbVar11 = pbVar13 + uVar15 * 4;
      pwVar8 = local_294 + uVar15;
      pbVar13 = pbVar13 + 0x10;
      uVar9 = uVar15;
      puVar16 = auStack_28c + 1;
      do {
        puVar2 = puVar16 + -1;
        uVar19 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar9 = uVar9 - 8;
        puVar16 = puVar16 + 4;
        *(undefined8 *)(pbVar13 + -8) = *puVar2;
        *(undefined8 *)(pbVar13 + -0x10) = uVar19;
        *(undefined8 *)(pbVar13 + 8) = uVar21;
        *(undefined8 *)pbVar13 = uVar20;
        pbVar13 = pbVar13 + 0x20;
      } while (uVar9 != 0);
      if (uVar10 != uVar15) goto LAB_00c07000;
    }
    *(wchar_t *)pbVar11 = L'\0';
    if (((byte)*pbVar17 & 1) == 0) {
      *pbVar17 = SUB41((int)sVar5 << 1,0);
    }
    else {
      *(size_t *)(pbVar17 + 8) = sVar5;
    }
    strftime_l(acStack_104,100,"%b",&local_a0,*(__locale_t *)param_1);
    local_2a0.__count = 0;
    local_2a0.__value.__wch = 0;
    local_2a8 = acStack_104;
    p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c07064 to 00c07077 has its CatchHandler @ 00c07600 */
    sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
    if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c07080 to 00c07087 has its CatchHandler @ 00c075f0 */
      uselocale(p_Var4);
    }
    if (sVar5 + 1 < 2) goto LAB_00c075d4;
    lVar1 = lVar18 * 0x18;
    uVar9 = *(ulong *)(param_1 + lVar1 + 0x278);
    pbVar17 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + lVar1 + 0x278);
    uVar6 = (uint)uVar9 & 0xff;
    uVar10 = 4;
    if (((byte)param_1[lVar1 + 0x278] & 1) != 0) {
      uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
    }
    if (uVar10 <= sVar5 && sVar5 - uVar10 != 0) {
      uVar15 = uVar9 >> 1 & 0x7f;
      if ((uVar9 & 1) != 0) {
        uVar15 = *(ulong *)(param_1 + lVar1 + 0x280);
      }
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      __grow_by(pbVar17,uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
      uVar6 = (uint)(byte)*pbVar17;
      *(undefined8 *)(param_1 + lVar1 + 0x280) = 0;
    }
    uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
    pwVar8 = local_294;
    pcVar14 = param_1 + lVar1 + 0x27c;
    if ((uVar6 & 1) != 0) {
      pcVar14 = *(ctype **)(param_1 + lVar1 + 0x288);
    }
    pcVar12 = pcVar14;
    if ((uVar10 < 7) || ((ulong)((long)pcVar14 - (long)pwVar8) < 0x20)) {
LAB_00c07160:
      pcVar14 = pcVar12;
      do {
        pwVar7 = pwVar8 + 1;
        pcVar12 = pcVar14 + 4;
        *(wchar_t *)pcVar14 = *pwVar8;
        pwVar8 = pwVar7;
        pcVar14 = pcVar12;
      } while (pwVar7 != local_294 + sVar5);
    }
    else {
      uVar10 = uVar10 + 1;
      uVar15 = uVar10 & 0x7ffffffffffffff8;
      pcVar12 = pcVar14 + uVar15 * 4;
      pwVar8 = local_294 + uVar15;
      pcVar14 = pcVar14 + 0x10;
      uVar9 = uVar15;
      puVar16 = auStack_28c + 1;
      do {
        puVar2 = puVar16 + -1;
        uVar19 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar9 = uVar9 - 8;
        puVar16 = puVar16 + 4;
        *(undefined8 *)(pcVar14 + -8) = *puVar2;
        *(undefined8 *)(pcVar14 + -0x10) = uVar19;
        *(undefined8 *)(pcVar14 + 8) = uVar21;
        *(undefined8 *)pcVar14 = uVar20;
        pcVar14 = pcVar14 + 0x20;
      } while (uVar9 != 0);
      if (uVar10 != uVar15) goto LAB_00c07160;
    }
    *(wchar_t *)pcVar12 = L'\0';
    if (((byte)*pbVar17 & 1) == 0) {
      *pbVar17 = SUB41((int)sVar5 << 1,0);
    }
    else {
      *(size_t *)(param_1 + lVar1 + 0x280) = sVar5;
    }
    lVar18 = lVar18 + 1;
  } while (lVar18 != 0xc);
  local_a0.tm_hour = 1;
  strftime_l(acStack_104,100,"%p",&local_a0,*(__locale_t *)param_1);
  local_2a0.__count = 0;
  local_2a0.__value.__wch = 0;
  local_2a8 = acStack_104;
  p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c071c8 to 00c071db has its CatchHandler @ 00c075ec */
  sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
  if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c071e4 to 00c071eb has its CatchHandler @ 00c075e4 */
    uselocale(p_Var4);
  }
  if (sVar5 == 0xffffffffffffffff) goto LAB_00c075d4;
  uVar9 = *(ulong *)(param_1 + 0x398);
  uVar10 = 4;
  if (((byte)param_1[0x398] & 1) != 0) {
    uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
  }
  if (sVar5 < uVar10 || sVar5 - uVar10 == 0) {
    pcVar14 = param_1 + 0x39c;
    if ((uVar9 & 1) != 0) {
      pcVar14 = *(ctype **)(param_1 + 0x3a8);
    }
    pcVar12 = pcVar14;
    if (sVar5 != 0) goto LAB_00c07274;
  }
  else {
    uVar15 = uVar9 >> 1 & 0x7f;
    if ((uVar9 & 1) != 0) {
      uVar15 = *(ulong *)(param_1 + 0x3a0);
    }
    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
    __grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + 0x398),uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
    *(undefined8 *)(param_1 + 0x3a0) = 0;
    pcVar12 = param_1 + 0x39c;
    if (((byte)param_1[0x398] & 1) != 0) {
      pcVar12 = *(ctype **)(param_1 + 0x3a8);
    }
LAB_00c07274:
    uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
    pwVar8 = local_294;
    if ((6 < uVar10) && (0x1f < (ulong)((long)pcVar12 - (long)pwVar8))) {
      uVar10 = uVar10 + 1;
      uVar15 = uVar10 & 0x7ffffffffffffff8;
      pcVar14 = pcVar12 + uVar15 * 4;
      pwVar8 = local_294 + uVar15;
      puVar16 = auStack_28c + 1;
      pcVar12 = pcVar12 + 0x10;
      uVar9 = uVar15;
      do {
        puVar2 = puVar16 + -1;
        uVar19 = puVar16[-2];
        uVar21 = puVar16[1];
        uVar20 = *puVar16;
        uVar9 = uVar9 - 8;
        puVar16 = puVar16 + 4;
        *(undefined8 *)(pcVar12 + -8) = *puVar2;
        *(undefined8 *)(pcVar12 + -0x10) = uVar19;
        *(undefined8 *)(pcVar12 + 8) = uVar21;
        *(undefined8 *)pcVar12 = uVar20;
        pcVar12 = pcVar12 + 0x20;
      } while (uVar9 != 0);
      pcVar12 = pcVar14;
      if (uVar10 == uVar15) goto LAB_00c072f8;
    }
    do {
      pwVar7 = pwVar8 + 1;
      pcVar14 = pcVar12 + 4;
      *(wchar_t *)pcVar12 = *pwVar8;
      pwVar8 = pwVar7;
      pcVar12 = pcVar14;
    } while (pwVar7 != local_294 + sVar5);
  }
LAB_00c072f8:
  *(wchar_t *)pcVar14 = L'\0';
  if (((byte)param_1[0x398] & 1) == 0) {
    param_1[0x398] = SUB41((int)sVar5 << 1,0);
  }
  else {
    *(size_t *)(param_1 + 0x3a0) = sVar5;
  }
  local_a0.tm_hour = 0xd;
  strftime_l(acStack_104,100,"%p",&local_a0,*(__locale_t *)param_1);
  local_2a0.__count = 0;
  local_2a0.__value.__wch = 0;
  local_2a8 = acStack_104;
  p_Var4 = uselocale(*(__locale_t *)param_1);
                    /* try { // try from 00c07350 to 00c07363 has its CatchHandler @ 00c075e8 */
  sVar5 = mbsrtowcs(local_294,&local_2a8,100,&local_2a0);
  if (p_Var4 != (__locale_t)0x0) {
                    /* try { // try from 00c0736c to 00c07373 has its CatchHandler @ 00c075e0 */
    uselocale(p_Var4);
  }
  if (sVar5 == 0xffffffffffffffff) {
LAB_00c075d4:
    __throw_runtime_error("locale not supported");
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c0736c with catch @ 00c075e0
                        */
    FUN_007fe114();
  }
  uVar9 = *(ulong *)(param_1 + 0x3b0);
  uVar10 = 4;
  if (((byte)param_1[0x3b0] & 1) != 0) {
    uVar10 = (uVar9 & 0xfffffffffffffffe) - 1;
  }
  if (sVar5 < uVar10 || sVar5 - uVar10 == 0) {
    pcVar14 = param_1 + 0x3b4;
    if ((uVar9 & 1) != 0) {
      pcVar14 = *(ctype **)(param_1 + 0x3c0);
    }
    pcVar12 = pcVar14;
    if (sVar5 == 0) goto LAB_00c07480;
  }
  else {
    uVar15 = uVar9 >> 1 & 0x7f;
    if ((uVar9 & 1) != 0) {
      uVar15 = *(ulong *)(param_1 + 0x3b8);
    }
    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
    __grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)(param_1 + 0x3b0),uVar10,sVar5 - uVar10,uVar15,0,uVar15,0);
    *(undefined8 *)(param_1 + 0x3b8) = 0;
    pcVar12 = param_1 + 0x3b4;
    if (((byte)param_1[0x3b0] & 1) != 0) {
      pcVar12 = *(ctype **)(param_1 + 0x3c0);
    }
  }
  uVar10 = sVar5 - 1 & 0x3fffffffffffffff;
  pwVar8 = local_294;
  if ((6 < uVar10) && (0x1f < (ulong)((long)pcVar12 - (long)pwVar8))) {
    uVar10 = uVar10 + 1;
    uVar15 = uVar10 & 0x7ffffffffffffff8;
    pcVar14 = pcVar12 + uVar15 * 4;
    pwVar8 = local_294 + uVar15;
    puVar16 = auStack_28c + 1;
    pcVar12 = pcVar12 + 0x10;
    uVar9 = uVar15;
    do {
      puVar2 = puVar16 + -1;
      uVar19 = puVar16[-2];
      uVar21 = puVar16[1];
      uVar20 = *puVar16;
      uVar9 = uVar9 - 8;
      puVar16 = puVar16 + 4;
      *(undefined8 *)(pcVar12 + -8) = *puVar2;
      *(undefined8 *)(pcVar12 + -0x10) = uVar19;
      *(undefined8 *)(pcVar12 + 8) = uVar21;
      *(undefined8 *)pcVar12 = uVar20;
      pcVar12 = pcVar12 + 0x20;
    } while (uVar9 != 0);
    pcVar12 = pcVar14;
    if (uVar10 == uVar15) goto LAB_00c07480;
  }
  do {
    pwVar7 = pwVar8 + 1;
    pcVar14 = pcVar12 + 4;
    *(wchar_t *)pcVar12 = *pwVar8;
    pwVar8 = pwVar7;
    pcVar12 = pcVar14;
  } while (pwVar7 != local_294 + sVar5);
LAB_00c07480:
  *(wchar_t *)pcVar14 = L'\0';
  if (((byte)param_1[0x3b0] & 1) == 0) {
    param_1[0x3b0] = SUB41((int)sVar5 << 1,0);
  }
  else {
    *(size_t *)(param_1 + 0x3b8) = sVar5;
  }
  cVar3 = (char)param_1;
  __analyze(cVar3,(ctype *)0x63);
  if (((byte)param_1[0x3c8] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x3d8),
                    (*(ulong *)(param_1 + 0x3c8) & 0x3ffffffffffffffe) << 2);
  }
  *(undefined8 *)(param_1 + 0x3d8) = local_2b0;
  *(undefined8 *)(param_1 + 0x3d0) = uStack_2b8;
  *(__locale_t *)(param_1 + 0x3c8) = p_Var4;
  __analyze(cVar3,(ctype *)0x72);
  if (((byte)param_1[0x3e0] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x3f0),
                    (*(ulong *)(param_1 + 0x3e0) & 0x3ffffffffffffffe) << 2);
  }
  *(undefined8 *)(param_1 + 0x3f0) = local_2b0;
  *(undefined8 *)(param_1 + 1000) = uStack_2b8;
  *(__locale_t *)(param_1 + 0x3e0) = p_Var4;
  __analyze(cVar3,(ctype *)0x78);
  if (((byte)param_1[0x3f8] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x408),
                    (*(ulong *)(param_1 + 0x3f8) & 0x3ffffffffffffffe) << 2);
  }
  *(undefined8 *)(param_1 + 0x408) = local_2b0;
  *(undefined8 *)(param_1 + 0x400) = uStack_2b8;
  *(__locale_t *)(param_1 + 0x3f8) = p_Var4;
  __analyze(cVar3,(ctype *)0x58);
  if (((byte)param_1[0x410] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x420),
                    (*(ulong *)(param_1 + 0x410) & 0x3ffffffffffffffe) << 2);
  }
  *(undefined8 *)(param_1 + 0x418) = uStack_2b8;
  *(__locale_t *)(param_1 + 0x410) = p_Var4;
  *(undefined8 *)(param_1 + 0x420) = local_2b0;
  return;
}

