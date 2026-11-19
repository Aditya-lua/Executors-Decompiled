/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be609c
 */

/* WARNING: Removing unreachable block (ram,0x00be613c) */
/* WARNING: Removing unreachable block (ram,0x00be6140) */
/* std::__ndk1::num_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, double) const */

undefined8 __thiscall
std::__ndk1::
num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined4 param_5)

{
  char *pcVar1;
  uint uVar2;
  uint uVar3;
  char cVar4;
  char *pcVar5;
  bool bVar6;
  int iVar7;
  wchar_t *__ptr;
  undefined8 uVar8;
  undefined2 *puVar9;
  undefined2 *puVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  char *__ptr_00;
  char *pcVar13;
  wchar_t *pwVar14;
  locale alStack_198 [8];
  wchar_t *local_190;
  wchar_t *pwStack_188;
  wchar_t awStack_17c [57];
  char *local_98;
  char local_8e [30];
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
LAB_00be61e4:
    if (!bVar6) {
      uVar12 = uVar11;
    }
    *(undefined1 *)puVar10 = uVar12;
    local_98 = local_8e;
    if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be63d8 to 00be63eb has its CatchHandler @ 00be64c0 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar7 = FUN_00c0cd14(param_1,local_8e,0x1e,DAT_00d270f0,&local_68,
                         *(undefined4 *)(param_4 + 0x10));
    if (0x1d < iVar7) {
      if (uVar2 != 0x104) {
        if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be6454 to 00be6467 has its CatchHandler @ 00be64b8 */
          DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
          __cxa_guard_release(&DAT_00d270f8);
        }
                    /* try { // try from 00be6278 to 00be6287 has its CatchHandler @ 00be64d8 */
        iVar7 = FUN_00c0cdd4(param_1,&local_98,DAT_00d270f0,&local_68,
                             *(undefined4 *)(param_4 + 0x10));
        goto LAB_00be6288;
      }
      goto LAB_00be6234;
    }
LAB_00be6260:
    __ptr_00 = (char *)0x0;
  }
  else {
    if (uVar2 == 4) {
      bVar6 = (uVar3 & 0x4000) == 0;
      uVar11 = 0x46;
      uVar12 = 0x66;
      goto LAB_00be61e4;
    }
    if (uVar2 != 0x104) {
      bVar6 = (uVar3 & 0x4000) == 0;
      uVar11 = 0x47;
      uVar12 = 0x67;
      goto LAB_00be61e4;
    }
    uVar12 = 0x61;
    if ((uVar3 & 0x4000) != 0) {
      uVar12 = 0x41;
    }
    local_98 = local_8e;
    *(undefined1 *)puVar10 = uVar12;
    if (((DAT_00d270f8 & 1) == 0) && (iVar7 = __cxa_guard_acquire(&DAT_00d270f8), iVar7 != 0)) {
                    /* try { // try from 00be648c to 00be649f has its CatchHandler @ 00be64b4 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    iVar7 = FUN_00c0cd14(param_1,local_8e,0x1e,DAT_00d270f0,&local_68);
    if (iVar7 < 0x1e) goto LAB_00be6260;
LAB_00be6234:
    if ((DAT_00d270f8 & 1) == 0) goto LAB_00be6408;
    while( true ) {
                    /* try { // try from 00be624c to 00be625b has its CatchHandler @ 00be64e8 */
      iVar7 = FUN_00c0cdd4(param_1,&local_98,DAT_00d270f0,&local_68);
LAB_00be6288:
      if (iVar7 != -1) break;
                    /* try { // try from 00be6404 to 00be6407 has its CatchHandler @ 00be64e8 */
      __throw_bad_alloc();
LAB_00be6408:
      iVar7 = __cxa_guard_acquire(&DAT_00d270f8);
      if (iVar7 != 0) {
                    /* try { // try from 00be6418 to 00be642b has its CatchHandler @ 00be64bc */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
    }
    __ptr_00 = local_98;
  }
  pcVar5 = local_98;
  uVar3 = *(uint *)(param_4 + 8) & 0xb0;
  pcVar1 = local_98 + iVar7;
  pcVar13 = pcVar1;
  if (uVar3 != 0x20) {
    if (uVar3 == 0x10) {
      cVar4 = *local_98;
      if ((cVar4 == '-') || (cVar4 == '+')) {
        pcVar13 = local_98 + 1;
      }
      else {
        if (((iVar7 < 2) || (cVar4 != '0')) || ((byte)(local_98[1] | 0x20U) != 0x78))
        goto LAB_00be6304;
        pcVar13 = local_98 + 2;
      }
    }
    else {
LAB_00be6304:
      pcVar13 = local_98;
    }
  }
  if (local_98 != local_8e) {
    __ptr = malloc((long)iVar7 << 3);
    pwVar14 = __ptr;
    if (__ptr != (wchar_t *)0x0) goto LAB_00be6334;
                    /* try { // try from 00be6328 to 00be632b has its CatchHandler @ 00be64dc */
    __throw_bad_alloc();
  }
  __ptr = (wchar_t *)0x0;
  pwVar14 = awStack_17c;
LAB_00be6334:
                    /* try { // try from 00be6334 to 00be633f has its CatchHandler @ 00be6500 */
  ios_base::getloc();
                    /* try { // try from 00be6340 to 00be635f has its CatchHandler @ 00be64f0 */
  __num_put<wchar_t>::__widen_and_group_float
            (pcVar5,pcVar13,pcVar1,pwVar14,&pwStack_188,&local_190,alStack_198);
  locale::~locale(alStack_198);
                    /* try { // try from 00be636c to 00be637f has its CatchHandler @ 00be64ec */
  uVar8 = FUN_00be6bec(param_3,pwVar14,pwStack_188,local_190,param_4,param_5);
  if (__ptr != (wchar_t *)0x0) {
    free(__ptr);
  }
  if (__ptr_00 != (char *)0x0) {
    free(__ptr_00);
  }
  return uVar8;
}

