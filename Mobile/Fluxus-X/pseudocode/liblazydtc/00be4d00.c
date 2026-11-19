/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be4d00
 */

/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, long double) const */

undefined8 __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined4 param_5)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  char *__ptr;
  undefined8 uVar5;
  char *pcVar6;
  char *pcVar7;
  char *pcVar8;
  char cVar9;
  char cVar10;
  char *pcVar11;
  char *pcVar12;
  locale alStack_e0 [8];
  char *local_d8;
  char *pcStack_d0;
  char acStack_c1 [57];
  char *local_88;
  char local_7e [30];
  undefined8 local_48;
  
  uVar2 = *(uint *)(param_4 + 8);
  local_48 = 0x25;
  if ((uVar2 >> 0xb & 1) == 0) {
    pcVar6 = (char *)((ulong)&local_48 | 1);
  }
  else {
    pcVar6 = (char *)((ulong)&local_48 | 2);
    local_48 = 0x2b25;
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
LAB_00be4e44:
    if (!bVar3) {
      cVar10 = cVar9;
    }
    *pcVar8 = cVar10;
    local_88 = local_7e;
    if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be5034 to 00be5047 has its CatchHandler @ 00be511c */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar4 = FUN_00c0cd14(param_1,local_7e,0x1e,DAT_00d270f0,&local_48,
                         *(undefined4 *)(param_4 + 0x10));
    if (0x1d < iVar4) {
      if (uVar1 != 0x104) {
        if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be50b0 to 00be50c3 has its CatchHandler @ 00be5114 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
                    /* try { // try from 00be4ed8 to 00be4ee7 has its CatchHandler @ 00be5134 */
        iVar4 = FUN_00c0cdd4(param_1,&local_88,DAT_00d270f0,&local_48,
                             *(undefined4 *)(param_4 + 0x10));
        goto LAB_00be4ee8;
      }
      goto LAB_00be4e94;
    }
LAB_00be4ec0:
    pcVar6 = (char *)0x0;
  }
  else {
    if (uVar1 == 4) {
      bVar3 = (uVar2 & 0x4000) == 0;
      cVar9 = 'F';
      cVar10 = 'f';
      goto LAB_00be4e44;
    }
    if (uVar1 != 0x104) {
      bVar3 = (uVar2 & 0x4000) == 0;
      cVar9 = 'G';
      cVar10 = 'g';
      goto LAB_00be4e44;
    }
    cVar10 = 'a';
    if ((uVar2 & 0x4000) != 0) {
      cVar10 = 'A';
    }
    local_88 = local_7e;
    *pcVar8 = cVar10;
    if (((DAT_00d270f8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d270f8), iVar4 != 0)) {
                    /* try { // try from 00be50e8 to 00be50fb has its CatchHandler @ 00be5110 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar4 = FUN_00c0cd14(param_1,local_7e,0x1e,DAT_00d270f0,&local_48);
    if (iVar4 < 0x1e) goto LAB_00be4ec0;
LAB_00be4e94:
    if ((DAT_00d270f8 & 1) == 0) goto LAB_00be5064;
    while( true ) {
                    /* try { // try from 00be4eac to 00be4ebb has its CatchHandler @ 00be5144 */
      iVar4 = FUN_00c0cdd4(param_1,&local_88,DAT_00d270f0,&local_48);
LAB_00be4ee8:
      if (iVar4 != -1) break;
                    /* try { // try from 00be5060 to 00be5063 has its CatchHandler @ 00be5144 */
      __throw_bad_alloc();
LAB_00be5064:
      iVar4 = __cxa_guard_acquire(&DAT_00d270f8);
      if (iVar4 != 0) {
                    /* try { // try from 00be5074 to 00be5087 has its CatchHandler @ 00be5118 */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
    }
    pcVar6 = local_88;
  }
  pcVar8 = local_88;
  uVar2 = *(uint *)(param_4 + 8) & 0xb0;
  pcVar7 = local_88 + iVar4;
  pcVar11 = pcVar7;
  if (uVar2 != 0x20) {
    if (uVar2 == 0x10) {
      cVar10 = *local_88;
      if ((cVar10 == '-') || (cVar10 == '+')) {
        pcVar11 = local_88 + 1;
      }
      else {
        if (((iVar4 < 2) || (cVar10 != '0')) || ((byte)(local_88[1] | 0x20U) != 0x78))
        goto LAB_00be4f64;
        pcVar11 = local_88 + 2;
      }
    }
    else {
LAB_00be4f64:
      pcVar11 = local_88;
    }
  }
  if (local_88 != local_7e) {
    __ptr = malloc((long)iVar4 << 1);
    pcVar12 = __ptr;
    if (__ptr != (char *)0x0) goto LAB_00be4f94;
                    /* try { // try from 00be4f88 to 00be4f8b has its CatchHandler @ 00be5138 */
    __throw_bad_alloc();
  }
  __ptr = (char *)0x0;
  pcVar12 = acStack_c1;
LAB_00be4f94:
                    /* try { // try from 00be4f94 to 00be4f9f has its CatchHandler @ 00be515c */
  ios_base::getloc();
                    /* try { // try from 00be4fa0 to 00be4fbf has its CatchHandler @ 00be514c */
  __num_put<char>::__widen_and_group_float
            (pcVar8,pcVar11,pcVar7,pcVar12,&pcStack_d0,&local_d8,alStack_e0);
  locale::~locale(alStack_e0);
                    /* try { // try from 00be4fcc to 00be4fdf has its CatchHandler @ 00be5148 */
  uVar5 = FUN_00be5420(param_3,pcVar12,pcStack_d0,local_d8,param_4,param_5);
  if (__ptr != (char *)0x0) {
    free(__ptr);
  }
  if (pcVar6 != (char *)0x0) {
    free(pcVar6);
  }
  return uVar5;
}

