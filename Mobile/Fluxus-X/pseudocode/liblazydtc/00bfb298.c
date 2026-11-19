/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb298
 */

/* std::__ndk1::locale::locale(std::__ndk1::locale const&, std::__ndk1::locale const&, int) */

void __thiscall
std::__ndk1::locale::locale(locale *this,locale *param_1,locale *param_2,int param_3)

{
  void *pvVar1;
  
  pvVar1 = operator_new(0x138);
                    /* try { // try from 00bfb2d0 to 00bfb2d7 has its CatchHandler @ 00bfb2fc */
  FUN_00bf7ec0(pvVar1,*(undefined8 *)param_1,*(undefined8 *)param_2,param_3);
  *(void **)this = pvVar1;
  FUN_00c2bce0(1,(long)pvVar1 + 8);
  return;
}

