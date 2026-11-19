/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfacc0
 */

/* std::__ndk1::locale::__global() */

undefined8 * std::__ndk1::locale::__global(void)

{
  int iVar1;
  locale *plVar2;
  
  if (((DAT_00d27250 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27250), iVar1 != 0)) {
                    /* try { // try from 00bfad08 to 00bfad0f has its CatchHandler @ 00bfad2c */
    plVar2 = (locale *)classic();
    locale((locale *)&DAT_00d27248,plVar2);
    __cxa_guard_release(&DAT_00d27250);
  }
  return &DAT_00d27248;
}

