/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccaa8
 */

/* std::__ndk1::shared_future<void>::~shared_future() */

void __thiscall std::__ndk1::shared_future<void>::~shared_future(shared_future<void> *this)

{
  long lVar1;
  long *plVar2;
  
  plVar2 = *(long **)this;
  if ((plVar2 == (long *)0x0) || (lVar1 = FUN_00c2bd10(0xffffffffffffffff,plVar2 + 1), lVar1 != 0))
  {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00bccaf8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x10))(plVar2);
  return;
}

