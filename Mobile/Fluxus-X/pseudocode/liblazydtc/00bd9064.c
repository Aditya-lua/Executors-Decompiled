/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd9064
 */

/* std::__ndk1::ios_base::Init::Init() */

Init * __thiscall std::__ndk1::ios_base::Init::Init(Init *this)

{
  Init *pIVar1;
  
  if (((DAT_00d26fa8 & 1) == 0) &&
     (this = (Init *)__cxa_guard_acquire(&DAT_00d26fa8), (int)this != 0)) {
                    /* try { // try from 00bd90a4 to 00bd90a7 has its CatchHandler @ 00bd90dc */
    FUN_00bd8b14();
    __cxa_atexit(&LAB_00bd9018,&DAT_00d26fa1,&PTR_LOOP_00c48880);
    pIVar1 = (Init *)__cxa_guard_release(&DAT_00d26fa8);
    return pIVar1;
  }
  return this;
}

