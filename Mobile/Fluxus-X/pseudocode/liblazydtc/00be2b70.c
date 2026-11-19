/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be2b70
 */

/* std::__ndk1::num_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, void*&) const */

long * __thiscall
std::__ndk1::
num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get
          (undefined8 param_1,long *param_2,long *param_3,undefined8 param_4,uint *param_5,
          undefined8 param_6)

{
  ulong uVar1;
  undefined8 **ppuVar2;
  ulong uVar3;
  bool bVar4;
  wchar_t __c;
  int iVar5;
  long *plVar6;
  undefined8 **ppuVar7;
  char cVar8;
  char *pcVar9;
  long lVar10;
  ulong uVar11;
  char *pcVar12;
  char *pcVar13;
  undefined8 local_100;
  ulong local_f8;
  char *local_f0;
  long local_e8;
  wchar_t awStack_e0 [24];
  wchar_t local_80;
  wchar_t local_7c;
  undefined8 *local_78;
  undefined8 *local_70 [2];
  
                    /* try { // try from 00be2ba8 to 00be2baf has its CatchHandler @ 00be306c */
  ios_base::getloc();
  local_78 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_100 = &local_78;
    local_70[0] = &local_100;
                    /* try { // try from 00be2bdc to 00be2c33 has its CatchHandler @ 00be3070 */
    __call_once((ulong *)&ctype<wchar_t>::id,local_70,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_e8 + 0x18) - *(long *)(local_e8 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar6 = *(long **)(*(long *)(local_e8 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar6 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be300c to 00be300f has its CatchHandler @ 00be3070 */
    FUN_00bd8968();
  }
  (**(code **)(*plVar6 + 0x60))(plVar6,"0123456789abcdefABCDEFxX+-pPiInN","pPiInN",awStack_e0);
  locale::~locale((locale *)&local_e8);
  local_100 = (undefined8 **)0x0;
  local_f8 = 0;
  local_f0 = (char *)0x0;
                    /* try { // try from 00be2c48 to 00be2c5b has its CatchHandler @ 00be3068 */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_100,0x16,'\0');
  pcVar13 = (char *)((ulong)&local_100 | 1);
  pcVar9 = local_f0;
  if (((ulong)local_100 & 1) == 0) {
    pcVar9 = (char *)((long)&local_100 + 1);
  }
  pcVar12 = pcVar9;
LAB_00be2c8c:
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    if (param_3 != (long *)0x0) goto LAB_00be2cd4;
LAB_00be2cac:
    if (bVar4 != false) goto LAB_00be2ea4;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
                    /* try { // try from 00be2cbc to 00be2cf7 has its CatchHandler @ 00be3088 */
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar5 = *(int *)param_2[3];
    }
    bVar4 = iVar5 == -1;
    plVar6 = (long *)0x0;
    if (!bVar4) {
      plVar6 = param_2;
    }
    param_2 = plVar6;
    if (param_3 == (long *)0x0) goto LAB_00be2cac;
LAB_00be2cd4:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    plVar6 = (long *)0x0;
    if (iVar5 != -1) {
      plVar6 = param_3;
    }
    param_3 = plVar6;
    if (bVar4 == (iVar5 == -1)) goto LAB_00be2ea4;
  }
  uVar3 = (ulong)local_100 >> 1 & 0x7f;
  if (((ulong)local_100 & 1) != 0) {
    uVar3 = local_f8;
  }
  if (pcVar12 == pcVar9 + uVar3) {
    if ((long)uVar3 < 1) {
      uVar11 = uVar3 * 2;
      if (((ulong)local_100 & 1) == 0) {
        local_100 = (undefined8 **)CONCAT71(local_100._1_7_,(char)((int)uVar11 << 1));
        pcVar9 = pcVar13;
      }
      else {
        pcVar9 = local_f0;
        local_f8 = uVar11;
      }
      pcVar9[uVar11] = '\0';
    }
    else {
                    /* try { // try from 00be2d34 to 00be2da3 has its CatchHandler @ 00be3084 */
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_100,uVar3,'\0');
    }
    uVar11 = 0x16;
    if (((ulong)local_100 & 1) != 0) {
      uVar11 = ((ulong)local_100 & 0xfffffffffffffffe) - 1;
    }
    uVar1 = (ulong)local_100 >> 1 & 0x7f;
    if (((ulong)local_100 & 1) != 0) {
      uVar1 = local_f8;
    }
    if (uVar11 < uVar1 || uVar11 - uVar1 == 0) {
      if (((ulong)local_100 & 1) == 0) {
        local_100 = (undefined8 **)CONCAT71(local_100._1_7_,(char)((int)uVar11 << 1));
        pcVar9 = pcVar13;
      }
      else {
        pcVar9 = local_f0;
        local_f8 = uVar11;
      }
      pcVar9[uVar11] = '\0';
    }
    else {
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_100,uVar11 - uVar1,'\0');
    }
    pcVar9 = pcVar13;
    if (((ulong)local_100 & 1) != 0) {
      pcVar9 = local_f0;
    }
    pcVar12 = pcVar9 + uVar3;
  }
  if ((wchar_t *)param_2[3] == (wchar_t *)param_2[4]) {
                    /* try { // try from 00be2df8 to 00be2e9f has its CatchHandler @ 00be3088 */
    __c = (**(code **)(*param_2 + 0x48))(param_2);
  }
  else {
    __c = *(wchar_t *)param_2[3];
  }
  if (pcVar12 == pcVar9) {
    if (__c == local_80) {
      cVar8 = '+';
    }
    else {
      if (__c != local_7c) goto LAB_00be2e0c;
      cVar8 = '-';
    }
  }
  else {
LAB_00be2e0c:
    ppuVar7 = (undefined8 **)wmemchr(awStack_e0,__c,0x1a);
    ppuVar2 = &local_78;
    if (ppuVar7 != (undefined8 **)0x0) {
      ppuVar2 = ppuVar7;
    }
    lVar10 = (long)ppuVar2 - (long)awStack_e0 >> 2;
    if ((0x17 < lVar10) ||
       ((0x15 < lVar10 &&
        (((pcVar12 == pcVar9 || (2 < (long)pcVar12 - (long)pcVar9)) || (pcVar12[-1] != '0'))))))
    goto LAB_00be2ea4;
    cVar8 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar10];
  }
  *pcVar12 = cVar8;
  if (param_2[3] == param_2[4]) {
    (**(code **)(*param_2 + 0x50))(param_2);
    pcVar12 = pcVar12 + 1;
  }
  else {
    param_2[3] = param_2[3] + 4;
    pcVar12 = pcVar12 + 1;
  }
  goto LAB_00be2c8c;
LAB_00be2ea4:
  uVar11 = (long)pcVar12 - (long)pcVar9;
  uVar3 = (ulong)local_100 >> 1 & 0x7f;
  if (((ulong)local_100 & 1) != 0) {
    uVar3 = local_f8;
  }
  if (uVar11 < uVar3 || uVar11 - uVar3 == 0) {
    if (((ulong)local_100 & 1) == 0) {
      local_100 = (undefined8 **)CONCAT71(local_100._1_7_,(char)((int)uVar11 << 1));
      pcVar9 = pcVar13;
    }
    else {
      pcVar9 = local_f0;
      local_f8 = uVar11;
    }
    pcVar9[uVar11] = '\0';
  }
  else {
                    /* try { // try from 00be2ec8 to 00be2ed3 has its CatchHandler @ 00be3060 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
              ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               &local_100,uVar11 - uVar3,'\0');
  }
  if (((ulong)local_100 & 1) != 0) {
    pcVar13 = local_f0;
  }
  if (((DAT_00d270f8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d270f8), iVar5 != 0)) {
                    /* try { // try from 00be3020 to 00be3033 has its CatchHandler @ 00be304c */
    DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
    __cxa_guard_release(&DAT_00d270f8);
  }
                    /* try { // try from 00be2f20 to 00be2f33 has its CatchHandler @ 00be3064 */
  iVar5 = FUN_00c0ca90(pcVar13,DAT_00d270f0,&DAT_002ab219,param_6);
  if (iVar5 != 1) {
    *param_5 = 4;
  }
  if (param_2 == (long *)0x0) {
    bVar4 = true;
    if (param_3 != (long *)0x0) goto LAB_00be2f8c;
LAB_00be2f64:
    if (!bVar4) goto LAB_00be2fcc;
  }
  else {
    if ((int *)param_2[3] == (int *)param_2[4]) {
                    /* try { // try from 00be2f74 to 00be2faf has its CatchHandler @ 00be3060 */
      iVar5 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar5 = *(int *)param_2[3];
    }
    bVar4 = iVar5 == -1;
    plVar6 = (long *)0x0;
    if (!bVar4) {
      plVar6 = param_2;
    }
    param_2 = plVar6;
    if (param_3 == (long *)0x0) goto LAB_00be2f64;
LAB_00be2f8c:
    if ((int *)param_3[3] == (int *)param_3[4]) {
      iVar5 = (**(code **)(*param_3 + 0x48))(param_3);
    }
    else {
      iVar5 = *(int *)param_3[3];
    }
    if (bVar4 != (iVar5 == -1)) goto LAB_00be2fcc;
  }
  *param_5 = *param_5 | 2;
LAB_00be2fcc:
  if (((ulong)local_100 & 1) != 0) {
    operator_delete(local_f0,(ulong)local_100 & 0xfffffffffffffffe);
  }
  return param_2;
}

