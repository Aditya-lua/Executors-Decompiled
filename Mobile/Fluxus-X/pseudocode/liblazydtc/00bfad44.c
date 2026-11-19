/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfad44
 */

/* std::__ndk1::locale::locale() */

void __thiscall std::__ndk1::locale::locale(locale *this)

{
  undefined *puVar1;
  bool bVar2;
  int iVar3;
  locale *plVar4;
  
  if (((DAT_00d27250 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d27250), iVar3 != 0)) {
                    /* try { // try from 00bfadb0 to 00bfadb7 has its CatchHandler @ 00bfadd4 */
    plVar4 = (locale *)classic();
    locale((locale *)&DAT_00d27248,plVar4);
    __cxa_guard_release(&DAT_00d27250);
  }
  puVar1 = DAT_00d27248;
  bVar2 = DAT_00d27248 != &DAT_00d27100;
  *(undefined **)this = DAT_00d27248;
  if (bVar2) {
    FUN_00c2bce0(1,puVar1 + 8);
  }
  return;
}

