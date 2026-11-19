/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdff8
 */

/* std::__ndk1::ios_base::clear(unsigned int) */

void __thiscall std::__ndk1::ios_base::clear(ios_base *this,uint param_1)

{
  uint uVar1;
  
  uVar1 = param_1 | *(long *)(this + 0x28) == 0;
  *(uint *)(this + 0x20) = uVar1;
  if ((*(uint *)(this + 0x24) & uVar1) != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_00bce038("ios_base::clear");
  }
  return;
}

