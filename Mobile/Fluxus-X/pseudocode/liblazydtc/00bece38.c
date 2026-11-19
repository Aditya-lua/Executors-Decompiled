/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bece38
 */

/* std::__ndk1::moneypunct_byname<char, false>::do_curr_symbol() const */

void std::__ndk1::moneypunct_byname<char,false>::do_curr_symbol(void)

{
  long in_x0;
  undefined8 *in_x8;
  undefined8 uVar1;
  undefined8 uVar2;
  
  if ((*(byte *)(in_x0 + 0x30) & 1) == 0) {
    uVar2 = *(undefined8 *)(in_x0 + 0x30);
    uVar1 = *(undefined8 *)(in_x0 + 0x40);
    in_x8[1] = *(undefined8 *)(in_x0 + 0x38);
    *in_x8 = uVar2;
    in_x8[2] = uVar1;
    return;
  }
  FUN_007ff40c();
  return;
}

