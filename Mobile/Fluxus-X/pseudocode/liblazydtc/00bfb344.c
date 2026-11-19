/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb344
 */

/* std::__ndk1::locale::__install_ctor(std::__ndk1::locale const&, std::__ndk1::locale::facet*,
   long) */

void __thiscall
std::__ndk1::locale::__install_ctor(locale *this,locale *param_1,facet *param_2,long param_3)

{
  undefined *puVar1;
  
  if (param_2 == (facet *)0x0) {
    puVar1 = *(undefined **)param_1;
    *(undefined **)this = puVar1;
    if (puVar1 == &DAT_00d27100) {
      return;
    }
  }
  else {
    puVar1 = operator_new(0x138);
                    /* try { // try from 00bfb37c to 00bfb387 has its CatchHandler @ 00bfb3c8 */
    FUN_00bfa8f8(puVar1,*(undefined8 *)param_1,param_2,param_3);
    *(undefined **)this = puVar1;
  }
  FUN_00c2bce0(1,puVar1 + 8);
  return;
}

