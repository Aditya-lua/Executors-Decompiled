/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be6530
 */

/* std::__ndk1::num_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, long double) const */

undefined8 __thiscall
std::__ndk1::
num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined4 param_5)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  wchar_t *__ptr;
  undefined8 uVar5;
  char *pcVar6;
  char *pcVar7;
  char *pcVar8;
  char cVar9;
  char cVar10;
  char *pcVar11;
  wchar_t *pwVar12;
  locale alStack_190 [8];
  wchar_t *local_188;
  wchar_t *pwStack_180;
  wchar_t awStack_174 [57];
  char *local_90;
  char local_86 [30];
  undefined8 local_68;
  
  uVar2 = *(uint *)(param_4 + 8);
  local_68 = 0x25;
  if ((uVar2 >> 0xb & 1) == 0) {
    pcVar6 = (char *)((ulong)&local_68 | 1);
  }
  else {
    pcVar6 = (char *)((ulong)&local_68 | 2);
    local_68 = 0x2b25;
  }
  if ((uVar2 >> 10 & 1) != 0) {
    *pcVar6 = '#';
    pcVar6 = pcVar6 + 1;
  }
  uVar1 = uVar2 & 0x104;
  pcVar7 = pcVar6;
  if (uVar1 != 0x104) {
    pcVar7 = pcVar6 + 2;
    pcVar6[0] = '.';
    pcVar6[1] = '*';
  }
  cVar10 = 'L';
  pcVar6 = "";
  do {
    pcVar8 = pcVar7 + 1;
    *pcVar7 = cVar10;
    cVar10 = *pcVar6;
    pcVar7 = pcVar8;
    pcVar6 = pcVar6 + 1;
  } while (cVar10 != '\0');
  if (uVar1 == 0x100) {
    bVar3 = (uVar2 & 0x4000) == 0;
    cVar9 = 'E';
    cVar10 = 'e';
LAB_00be6674:
    if (!bVar3) {
      cVar10 = cVar9;
    }
    *pcVar8 = cVar10;
    local_90 = local_86;
    if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be6864 to 00be6877 has its CatchHandler @ 00be694c */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar4 = FUN_00c0cd14(param_1,local_86,0x1e,DAT_00d270f0,&local_68,
                         *(undefined4 *)(param_4 + 0x10));
    if (0x1d < iVar4) {
      if (uVar1 != 0x104) {
        if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be68e0 to 00be68f3 has its CatchHandler @ 00be6944 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
                    /* try { // try from 00be6708 to 00be6717 has its CatchHandler @ 00be6964 */
        iVar4 = FUN_00c0cdd4(param_1,&local_90,DAT_00d270f0,&local_68,
                             *(undefined4 *)(param_4 + 0x10));
        goto LAB_00be6718;
      }
      goto LAB_00be66c4;
    }
LAB_00be66f0:
    pcVar6 = (char *)0x0;
  }
  else {
    if (uVar1 == 4) {
      bVar3 = (uVar2 & 0x4000) == 0;
      cVar9 = 'F';
      cVar10 = 'f';
      goto LAB_00be6674;
    }
    if (uVar1 != 0x104) {
      bVar3 = (uVar2 & 0x4000) == 0;
      cVar9 = 'G';
      cVar10 = 'g';
      goto LAB_00be6674;
    }
    cVar10 = 'a';
    if ((uVar2 & 0x4000) != 0) {
      cVar10 = 'A';
    }
    local_90 = local_86;
    *pcVar8 = cVar10;
    if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be6918 to 00be692b has its CatchHandler @ 00be6940 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar4 = FUN_00c0cd14(param_1,local_86,0x1e,DAT_00d270f0,&local_68);
    if (iVar4 < 0x1e) goto LAB_00be66f0;
LAB_00be66c4:
    if ((DAT_00d270f8 & 1) == 0) goto LAB_00be6894;
    while( true ) {
                    /* try { // try from 00be66dc to 00be66eb has its CatchHandler @ 00be6974 */
      iVar4 = FUN_00c0cdd4(param_1,&local_90,DAT_00d270f0,&local_68);
LAB_00be6718:
      if (iVar4 != -1) break;
                    /* try { // try from 00be6890 to 00be6893 has its CatchHandler @ 00be6974 */
      __throw_bad_alloc();
LAB_00be6894:
      iVar4 = __cxa_guard_acquire(&DAT_00d270f8);
      if (iVar4 != 0) {
                    /* try { // try from 00be68a4 to 00be68b7 has its CatchHandler @ 00be6948 */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
    }
    pcVar6 = local_90;
  }
  pcVar8 = local_90;
  uVar2 = *(uint *)(param_4 + 8) & 0xb0;
  pcVar7 = local_90 + iVar4;
  pcVar11 = pcVar7;
  if (uVar2 != 0x20) {
    if (uVar2 == 0x10) {
      cVar10 = *local_90;
      if ((cVar10 == '-') || (cVar10 == '+')) {
        pcVar11 = local_90 + 1;
      }
      else {
        if (((iVar4 < 2) || (cVar10 != '0')) || ((byte)(local_90[1] | 0x20U) != 0x78))
        goto LAB_00be6794;
        pcVar11 = local_90 + 2;
      }
    }
    else {
LAB_00be6794:
      pcVar11 = local_90;
    }
  }
  if (local_90 != local_86) {
    __ptr = malloc((long)iVar4 << 3);
    pwVar12 = __ptr;
    if (__ptr != (wchar_t *)0x0) goto LAB_00be67c4;
                    /* try { // try from 00be67b8 to 00be67bb has its CatchHandler @ 00be6968 */
    __throw_bad_alloc();
  }
  __ptr = (wchar_t *)0x0;
  pwVar12 = awStack_174;
LAB_00be67c4:
                    /* try { // try from 00be67c4 to 00be67cf has its CatchHandler @ 00be698c */
  ios_base::getloc();
                    /* try { // try from 00be67d0 to 00be67ef has its CatchHandler @ 00be697c */
  __num_put<wchar_t>::__widen_and_group_float
            (pcVar8,pcVar11,pcVar7,pwVar12,&pwStack_180,&local_188,alStack_190);
  locale::~locale(alStack_190);
                    /* try { // try from 00be67fc to 00be680f has its CatchHandler @ 00be6978 */
  uVar5 = FUN_00be6bec(param_3,pwVar12,pwStack_180,local_188,param_4,param_5);
  if (__ptr != (wchar_t *)0x0) {
    free(__ptr);
  }
  if (pcVar6 != (char *)0x0) {
    free(pcVar6);
  }
  return uVar5;
}

