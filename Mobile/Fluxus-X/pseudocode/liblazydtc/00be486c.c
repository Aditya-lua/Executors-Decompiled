/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be486c
 */

/* WARNING: Removing unreachable block (ram,0x00be490c) */
/* WARNING: Removing unreachable block (ram,0x00be4910) */
/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, double) const */

undefined8 __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined4 param_5)

{
  char *pcVar1;
  uint uVar2;
  uint uVar3;
  char cVar4;
  char *pcVar5;
  bool bVar6;
  int iVar7;
  char *__ptr;
  undefined8 uVar8;
  undefined2 *puVar9;
  undefined2 *puVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  char *__ptr_00;
  char *pcVar13;
  char *pcVar14;
  locale alStack_e8 [8];
  char *local_e0;
  char *pcStack_d8;
  char acStack_c9 [57];
  char *local_90;
  char local_86 [30];
  undefined8 local_68;
  
  uVar3 = *(uint *)(param_4 + 8);
  local_68 = 0x25;
  if ((uVar3 >> 0xb & 1) == 0) {
    puVar9 = (undefined2 *)((ulong)&local_68 | 1);
  }
  else {
    puVar9 = (undefined2 *)((ulong)&local_68 | 2);
    local_68 = 0x2b25;
  }
  if ((uVar3 >> 10 & 1) != 0) {
    *(undefined1 *)puVar9 = 0x23;
    puVar9 = (undefined2 *)((long)puVar9 + 1);
  }
  uVar2 = uVar3 & 0x104;
  puVar10 = puVar9;
  if (uVar2 != 0x104) {
    puVar10 = puVar9 + 1;
    *puVar9 = 0x2a2e;
  }
  if (uVar2 == 0x100) {
    bVar6 = (uVar3 & 0x4000) == 0;
    uVar11 = 0x45;
    uVar12 = 0x65;
LAB_00be49b4:
    if (!bVar6) {
      uVar12 = uVar11;
    }
    *(undefined1 *)puVar10 = uVar12;
    local_90 = local_86;
    if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be4ba8 to 00be4bbb has its CatchHandler @ 00be4c90 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar7 = FUN_00c0cd14(param_1,local_86,0x1e,DAT_00d270f0,&local_68,
                         *(undefined4 *)(param_4 + 0x10));
    if (0x1d < iVar7) {
      if (uVar2 != 0x104) {
        if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be4c24 to 00be4c37 has its CatchHandler @ 00be4c88 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
                    /* try { // try from 00be4a48 to 00be4a57 has its CatchHandler @ 00be4ca8 */
        iVar7 = FUN_00c0cdd4(param_1,&local_90,DAT_00d270f0,&local_68,
                             *(undefined4 *)(param_4 + 0x10));
        goto LAB_00be4a58;
      }
      goto LAB_00be4a04;
    }
LAB_00be4a30:
    __ptr_00 = (char *)0x0;
  }
  else {
    if (uVar2 == 4) {
      bVar6 = (uVar3 & 0x4000) == 0;
      uVar11 = 0x46;
      uVar12 = 0x66;
      goto LAB_00be49b4;
    }
    if (uVar2 != 0x104) {
      bVar6 = (uVar3 & 0x4000) == 0;
      uVar11 = 0x47;
      uVar12 = 0x67;
      goto LAB_00be49b4;
    }
    uVar12 = 0x61;
    if ((uVar3 & 0x4000) != 0) {
      uVar12 = 0x41;
    }
    local_90 = local_86;
    *(undefined1 *)puVar10 = uVar12;
    if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be4c5c to 00be4c6f has its CatchHandler @ 00be4c84 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar7 = FUN_00c0cd14(param_1,local_86,0x1e,DAT_00d270f0,&local_68);
    if (iVar7 < 0x1e) goto LAB_00be4a30;
LAB_00be4a04:
    if ((DAT_00d270f8 & 1) == 0) goto LAB_00be4bd8;
    while( true ) {
                    /* try { // try from 00be4a1c to 00be4a2b has its CatchHandler @ 00be4cb8 */
      iVar7 = FUN_00c0cdd4(param_1,&local_90,DAT_00d270f0,&local_68);
LAB_00be4a58:
      if (iVar7 != -1) break;
                    /* try { // try from 00be4bd4 to 00be4bd7 has its CatchHandler @ 00be4cb8 */
      __throw_bad_alloc();
LAB_00be4bd8:
      iVar7 = __cxa_guard_acquire(&DAT_00d270f8);
      if (iVar7 != 0) {
                    /* try { // try from 00be4be8 to 00be4bfb has its CatchHandler @ 00be4c8c */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
    }
    __ptr_00 = local_90;
  }
  pcVar5 = local_90;
  uVar3 = *(uint *)(param_4 + 8) & 0xb0;
  pcVar1 = local_90 + iVar7;
  pcVar13 = pcVar1;
  if (uVar3 != 0x20) {
    if (uVar3 == 0x10) {
      cVar4 = *local_90;
      if ((cVar4 == '-') || (cVar4 == '+')) {
        pcVar13 = local_90 + 1;
      }
      else {
        if (((iVar7 < 2) || (cVar4 != '0')) || ((byte)(local_90[1] | 0x20U) != 0x78))
        goto LAB_00be4ad4;
        pcVar13 = local_90 + 2;
      }
    }
    else {
LAB_00be4ad4:
      pcVar13 = local_90;
    }
  }
  if (local_90 != local_86) {
    __ptr = malloc((long)iVar7 << 1);
    pcVar14 = __ptr;
    if (__ptr != (char *)0x0) goto LAB_00be4b04;
                    /* try { // try from 00be4af8 to 00be4afb has its CatchHandler @ 00be4cac */
    __throw_bad_alloc();
  }
  __ptr = (char *)0x0;
  pcVar14 = acStack_c9;
LAB_00be4b04:
                    /* try { // try from 00be4b04 to 00be4b0f has its CatchHandler @ 00be4cd0 */
  ios_base::getloc();
                    /* try { // try from 00be4b10 to 00be4b2f has its CatchHandler @ 00be4cc0 */
  __num_put<char>::__widen_and_group_float
            (pcVar5,pcVar13,pcVar1,pcVar14,&pcStack_d8,&local_e0,alStack_e8);
  locale::~locale(alStack_e8);
                    /* try { // try from 00be4b3c to 00be4b4f has its CatchHandler @ 00be4cbc */
  uVar8 = FUN_00be5420(param_3,pcVar14,pcStack_d8,local_e0,param_4,param_5);
  if (__ptr != (char *)0x0) {
    free(__ptr);
  }
  if (__ptr_00 != (char *)0x0) {
    free(__ptr_00);
  }
  return uVar8;
}

