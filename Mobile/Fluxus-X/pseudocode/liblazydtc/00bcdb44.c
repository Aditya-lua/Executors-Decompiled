/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdb44
 */

/* std::__ndk1::ios_base::imbue(std::__ndk1::locale const&) */

void std::__ndk1::ios_base::imbue(locale *param_1)

{
  locale *in_x1;
  locale *in_x8;
  long lVar1;
  
  locale::locale(in_x8,param_1 + 0x30);
  locale::operator=(param_1 + 0x30,in_x1);
  lVar1 = *(long *)(param_1 + 0x48);
  while (lVar1 != 0) {
    lVar1 = lVar1 + -1;
                    /* try { // try from 00bcdb94 to 00bcdb9f has its CatchHandler @ 00bcdbc0 */
    (**(code **)(*(long *)(param_1 + 0x38) + lVar1 * 8))
              (1,param_1,*(undefined4 *)(*(long *)(param_1 + 0x40) + lVar1 * 4));
  }
  return;
}

