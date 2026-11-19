/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02034
 */

/* std::__ndk1::numpunct_byname<char>::numpunct_byname(char const*, unsigned long) */

void __thiscall
std::__ndk1::numpunct_byname<char>::numpunct_byname
          (numpunct_byname<char> *this,char *param_1,ulong param_2)

{
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined2 *)(this + 0x10) = 0x2c2e;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined ***)this = &PTR__numpunct_byname_00cad830;
  *(ulong *)(this + 8) = param_2 - 1;
                    /* try { // try from 00c0206c to 00c0206f has its CatchHandler @ 00c02080 */
  __init(this,param_1);
  return;
}

