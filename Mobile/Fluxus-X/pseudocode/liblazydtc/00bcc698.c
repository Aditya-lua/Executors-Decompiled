/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc698
 */

/* std::__ndk1::future<void>::future(std::__ndk1::__assoc_sub_state*) */

void __thiscall std::__ndk1::future<void>::future(future<void> *this,__assoc_sub_state *param_1)

{
  uint uVar1;
  
  *(__assoc_sub_state **)this = param_1;
  mutex::lock((mutex *)(param_1 + 0x18));
  uVar1 = *(uint *)(param_1 + 0x70);
  if ((uVar1 >> 1 & 1) != 0) {
                    /* try { // try from 00bcc6e8 to 00bcc6ef has its CatchHandler @ 00bcc6f0 */
                    /* WARNING: Subroutine does not return */
    FUN_00bcc1b4(1);
  }
  FUN_00c2bce0(1,param_1 + 8);
  *(uint *)(param_1 + 0x70) = uVar1 | 2;
  mutex::unlock((mutex *)(param_1 + 0x18));
  return;
}

