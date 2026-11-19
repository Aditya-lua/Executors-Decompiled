/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02440
 */

/* std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname(char const*, unsigned long) */

void __thiscall
std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname
          (numpunct_byname<wchar_t> *this,char *param_1,ulong param_2)

{
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0x2c0000002e;
  *(undefined ***)this = &PTR__numpunct_byname_00cad880;
  *(ulong *)(this + 8) = param_2 - 1;
                    /* try { // try from 00c0247c to 00c0247f has its CatchHandler @ 00c02490 */
  __init(this,param_1);
  return;
}

