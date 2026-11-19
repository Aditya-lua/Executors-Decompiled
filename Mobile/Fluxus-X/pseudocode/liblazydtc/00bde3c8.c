/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bde3c8
 */

/* std::__ndk1::num_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_get(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, std::__ndk1::ios_base&,
   unsigned int&, void*&) const */

long * __thiscall
std::__ndk1::num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get(undefined8 param_1,long *param_2,long *param_3,undefined8 param_4,uint *param_5,
      undefined8 param_6)

{
  ulong uVar1;
  undefined8 **ppuVar2;
  ulong uVar3;
  long *plVar4;
  bool bVar5;
  int iVar6;
  long *plVar7;
  undefined8 **ppuVar8;
  uint uVar9;
  char cVar10;
  char *pcVar11;
  long lVar12;
  ulong uVar13;
  char *pcVar14;
  bool bVar15;
  char *pcVar16;
  undefined8 local_b0;
  ulong local_a8;
  char *local_a0;
  long local_98;
  undefined1 auStack_8a [24];
  byte local_72;
  byte local_71;
  undefined8 *local_70;
  undefined8 *local_68;
  
                    /* try { // try from 00bde400 to 00bde407 has its CatchHandler @ 00bde8d0 */
  ios_base::getloc();
  local_70 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_b0 = &local_70;
    local_68 = &local_b0;
                    /* try { // try from 00bde434 to 00bde48b has its CatchHandler @ 00bde8d4 */
    __call_once((ulong *)&ctype<char>::id,&local_68,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_98 + 0x18) - *(long *)(local_98 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (plVar7 = *(long **)(*(long *)(local_98 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     plVar7 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bde870 to 00bde873 has its CatchHandler @ 00bde8d4 */
    FUN_00bd8968();
  }
  (**(code **)(*plVar7 + 0x40))(plVar7,"0123456789abcdefABCDEFxX+-pPiInN","pPiInN",auStack_8a);
  locale::~locale((locale *)&local_98);
  local_b0 = (undefined8 **)0x0;
  local_a8 = 0;
  local_a0 = (char *)0x0;
                    /* try { // try from 00bde4a0 to 00bde4b3 has its CatchHandler @ 00bde8cc */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_b0,0x16,'\0');
  pcVar16 = (char *)((ulong)&local_b0 | 1);
  pcVar11 = local_a0;
  if (((ulong)local_b0 & 1) == 0) {
    pcVar11 = (char *)((long)&local_b0 + 1);
  }
  pcVar14 = pcVar11;
LAB_00bde4e4:
  plVar7 = param_3;
  if (param_2 == (long *)0x0) {
    bVar5 = true;
    plVar4 = param_2;
joined_r0x00bde504:
    param_2 = plVar4;
    bVar15 = bVar5;
    if (param_3 != (long *)0x0) goto LAB_00bde508;
LAB_00bde53c:
    if (bVar15 != false) goto LAB_00bde704;
  }
  else {
    if (param_2[3] == param_2[4]) {
                    /* try { // try from 00bde524 to 00bde553 has its CatchHandler @ 00bde8ec */
      iVar6 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar5 = iVar6 == -1;
      plVar4 = (long *)0x0;
      if (!bVar5) {
        plVar4 = param_2;
      }
      goto joined_r0x00bde504;
    }
    bVar5 = false;
    bVar15 = false;
    if (param_3 == (long *)0x0) goto LAB_00bde53c;
LAB_00bde508:
    if (param_3[3] == param_3[4]) {
      iVar6 = (**(code **)(*param_3 + 0x48))(param_3);
      plVar7 = (long *)0x0;
      if (iVar6 != -1) {
        plVar7 = param_3;
      }
      param_3 = plVar7;
      if (bVar5 == (iVar6 == -1)) goto LAB_00bde704;
    }
    else if (bVar5 == false) goto LAB_00bde704;
  }
  uVar3 = (ulong)local_b0 >> 1 & 0x7f;
  if (((ulong)local_b0 & 1) != 0) {
    uVar3 = local_a8;
  }
  if (pcVar14 == pcVar11 + uVar3) {
    if ((long)uVar3 < 1) {
      uVar13 = uVar3 * 2;
      if (((ulong)local_b0 & 1) == 0) {
        local_b0 = (undefined8 **)CONCAT71(local_b0._1_7_,(char)((int)uVar13 << 1));
        pcVar11 = pcVar16;
      }
      else {
        pcVar11 = local_a0;
        local_a8 = uVar13;
      }
      pcVar11[uVar13] = '\0';
    }
    else {
                    /* try { // try from 00bde590 to 00bde5ff has its CatchHandler @ 00bde8e8 */
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_b0,uVar3,'\0');
    }
    uVar13 = 0x16;
    if (((ulong)local_b0 & 1) != 0) {
      uVar13 = ((ulong)local_b0 & 0xfffffffffffffffe) - 1;
    }
    uVar1 = (ulong)local_b0 >> 1 & 0x7f;
    if (((ulong)local_b0 & 1) != 0) {
      uVar1 = local_a8;
    }
    if (uVar13 < uVar1 || uVar13 - uVar1 == 0) {
      if (((ulong)local_b0 & 1) == 0) {
        local_b0 = (undefined8 **)CONCAT71(local_b0._1_7_,(char)((int)uVar13 << 1));
        pcVar11 = pcVar16;
      }
      else {
        pcVar11 = local_a0;
        local_a8 = uVar13;
      }
      pcVar11[uVar13] = '\0';
    }
    else {
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_b0,uVar13 - uVar1,'\0');
    }
    pcVar11 = pcVar16;
    if (((ulong)local_b0 & 1) != 0) {
      pcVar11 = local_a0;
    }
    pcVar14 = pcVar11 + uVar3;
  }
  param_3 = plVar7;
  if ((byte *)param_2[3] == (byte *)param_2[4]) {
                    /* try { // try from 00bde65c to 00bde6ff has its CatchHandler @ 00bde8ec */
    uVar9 = (**(code **)(*param_2 + 0x48))(param_2);
    uVar9 = uVar9 & 0xff;
    if (pcVar14 == pcVar11) goto LAB_00bde670;
LAB_00bde698:
    ppuVar8 = memchr(auStack_8a,uVar9,0x1a);
    ppuVar2 = &local_70;
    if (ppuVar8 != (undefined8 **)0x0) {
      ppuVar2 = ppuVar8;
    }
    lVar12 = (long)ppuVar2 - (long)auStack_8a;
    if ((0x17 < lVar12) ||
       ((0x15 < lVar12 &&
        (((pcVar14 == pcVar11 || (2 < (long)pcVar14 - (long)pcVar11)) || (pcVar14[-1] != '0'))))))
    goto LAB_00bde704;
    cVar10 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar12];
  }
  else {
    uVar9 = (uint)*(byte *)param_2[3];
    if (pcVar14 != pcVar11) goto LAB_00bde698;
LAB_00bde670:
    if (uVar9 == local_72) {
      cVar10 = '+';
    }
    else {
      if (uVar9 != local_71) goto LAB_00bde698;
      cVar10 = '-';
    }
  }
  *pcVar14 = cVar10;
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
    pcVar14 = pcVar14 + 1;
  }
  else {
    param_2[3] = param_2[3] + 1;
    pcVar14 = pcVar14 + 1;
  }
  goto LAB_00bde4e4;
LAB_00bde704:
  uVar13 = (long)pcVar14 - (long)pcVar11;
  uVar3 = (ulong)local_b0 >> 1 & 0x7f;
  if (((ulong)local_b0 & 1) != 0) {
    uVar3 = local_a8;
  }
  if (uVar13 < uVar3 || uVar13 - uVar3 == 0) {
    if (((ulong)local_b0 & 1) == 0) {
      local_b0 = (undefined8 **)CONCAT71(local_b0._1_7_,(char)((int)uVar13 << 1));
      pcVar11 = pcVar16;
    }
    else {
      pcVar11 = local_a0;
      local_a8 = uVar13;
    }
    pcVar11[uVar13] = '\0';
  }
  else {
                    /* try { // try from 00bde728 to 00bde733 has its CatchHandler @ 00bde8c4 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
              ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               &local_b0,uVar13 - uVar3,'\0');
  }
  if (((ulong)local_b0 & 1) != 0) {
    pcVar16 = local_a0;
  }
  if (((DAT_00d270f8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00d270f8), iVar6 != 0)) {
                    /* try { // try from 00bde884 to 00bde897 has its CatchHandler @ 00bde8b0 */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
                    /* try { // try from 00bde780 to 00bde793 has its CatchHandler @ 00bde8c8 */
  iVar6 = FUN_00c0ca90(pcVar16,DAT_00d270f0,&DAT_002ab219,param_6);
  if (iVar6 != 1) {
    *param_5 = 4;
  }
  if (param_2 == (long *)0x0) {
    bVar5 = true;
    plVar7 = param_2;
joined_r0x00bde7c4:
    param_2 = plVar7;
    if (param_3 != (long *)0x0) goto LAB_00bde7c8;
LAB_00bde844:
    if (bVar5 == false) goto LAB_00bde7e4;
  }
  else {
    if (param_2[3] == param_2[4]) {
                    /* try { // try from 00bde82c to 00bde85b has its CatchHandler @ 00bde8c4 */
      iVar6 = (**(code **)(*param_2 + 0x48))(param_2);
      bVar5 = iVar6 == -1;
      plVar7 = (long *)0x0;
      if (!bVar5) {
        plVar7 = param_2;
      }
      goto joined_r0x00bde7c4;
    }
    bVar5 = false;
    if (param_3 == (long *)0x0) goto LAB_00bde844;
LAB_00bde7c8:
    if (param_3[3] == param_3[4]) {
      iVar6 = (**(code **)(*param_3 + 0x48))(param_3);
      if (bVar5 != (iVar6 == -1)) goto LAB_00bde7e4;
    }
    else if (bVar5) goto LAB_00bde7e4;
  }
  *param_5 = *param_5 | 2;
LAB_00bde7e4:
  if (((ulong)local_b0 & 1) != 0) {
    operator_delete(local_a0,(ulong)local_b0 & 0xfffffffffffffffe);
  }
  return param_2;
}

