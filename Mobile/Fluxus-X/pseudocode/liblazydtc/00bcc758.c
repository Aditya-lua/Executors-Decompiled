/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc758
 */

/* std::__ndk1::future<void>::get() */

void __thiscall std::__ndk1::future<void>::get(future<void> *this)

{
  long lVar1;
  __assoc_sub_state *this_00;
  
  this_00 = *(__assoc_sub_state **)this;
  *(undefined8 *)this = 0;
                    /* try { // try from 00bcc770 to 00bcc777 has its CatchHandler @ 00bcc7b4 */
  __assoc_sub_state::copy(this_00);
  lVar1 = FUN_00c2bd10(0xffffffffffffffff,this_00 + 8);
  if (lVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x00bcc7b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)this_00 + 0x10))(this_00);
    return;
  }
  return;
}

