/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdbd4
 */

/* std::__ndk1::ios_base::getloc() const */

void std::__ndk1::ios_base::getloc(void)

{
  long in_x0;
  locale *in_x8;
  
  locale::locale(in_x8,(locale *)(in_x0 + 0x30));
  return;
}

