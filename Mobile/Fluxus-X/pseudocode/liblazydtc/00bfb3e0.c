/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb3e0
 */

/* std::__ndk1::locale::global(std::__ndk1::locale const&) */

void __thiscall std::__ndk1::locale::global(locale *this,locale *param_1)

{
  ulong uVar1;
  char *pcVar2;
  long *plVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  locale *plVar7;
  locale *in_x8;
  undefined8 local_60;
  ulong uStack_58;
  char *local_50;
  
  if (((DAT_00d27250 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d27250), iVar5 != 0)) {
                    /* try { // try from 00bfb58c to 00bfb593 has its CatchHandler @ 00bfb5b0 */
    plVar7 = (locale *)classic();
    locale((locale *)&DAT_00d27248,plVar7);
    __cxa_guard_release(&DAT_00d27250);
  }
  locale(in_x8,(locale *)&DAT_00d27248);
  if (*(undefined **)this != &DAT_00d27100) {
    FUN_00c2bce0(1,*(undefined **)this + 8);
  }
  plVar3 = DAT_00d27248;
  if ((DAT_00d27248 != (long *)&DAT_00d27100) &&
     (lVar6 = FUN_00c2bd10(0xffffffffffffffff,DAT_00d27248 + 1), lVar6 == 0)) {
    (**(code **)(*plVar3 + 0x10))(plVar3);
  }
  DAT_00d27248 = *(long **)this;
  if ((*(byte *)((long)DAT_00d27248 + 0x120) & 1) == 0) {
    local_60 = *(ulong *)((long)DAT_00d27248 + 0x120);
    uStack_58 = *(ulong *)((long)DAT_00d27248 + 0x128);
    local_50 = *(char **)((long)DAT_00d27248 + 0x130);
  }
  else {
                    /* try { // try from 00bfb49c to 00bfb4a3 has its CatchHandler @ 00bfb5ec */
    FUN_007ff40c(&local_60,*(undefined8 *)((long)DAT_00d27248 + 0x130),
                 *(undefined8 *)((long)DAT_00d27248 + 0x128));
  }
  uVar1 = local_60 >> 1 & 0x7f;
  if ((local_60 & 1) != 0) {
    uVar1 = uStack_58;
  }
  if (uVar1 == 1) {
    pcVar2 = local_50;
    if ((local_60 & 1) == 0) {
      pcVar2 = (char *)((long)&local_60 + 1);
    }
    bVar4 = *pcVar2 == '*';
  }
  else {
    bVar4 = false;
  }
  if ((local_60 & 1) != 0) {
    operator_delete(local_50,local_60 & 0xfffffffffffffffe);
  }
  if (!bVar4) {
    if ((*(byte *)((long)DAT_00d27248 + 0x120) & 1) == 0) {
      uStack_58 = *(ulong *)((long)DAT_00d27248 + 0x128);
      local_60 = *(ulong *)((long)DAT_00d27248 + 0x120);
      local_50 = *(char **)((long)DAT_00d27248 + 0x130);
    }
    else {
                    /* try { // try from 00bfb524 to 00bfb52b has its CatchHandler @ 00bfb5c8 */
      FUN_007ff40c(&local_60,*(undefined8 *)((long)DAT_00d27248 + 0x130),
                   *(undefined8 *)((long)DAT_00d27248 + 0x128));
    }
    pcVar2 = local_50;
    if ((local_60 & 1) == 0) {
      pcVar2 = (char *)((long)&local_60 + 1);
    }
                    /* try { // try from 00bfb540 to 00bfb547 has its CatchHandler @ 00bfb5cc */
    setlocale(6,pcVar2);
    if ((local_60 & 1) != 0) {
      operator_delete(local_50,local_60 & 0xfffffffffffffffe);
    }
  }
  return;
}

