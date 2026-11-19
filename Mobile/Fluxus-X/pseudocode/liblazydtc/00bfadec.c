/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfadec
 */

/* std::__ndk1::locale::locale(std::__ndk1::locale const&) */

void __thiscall std::__ndk1::locale::locale(locale *this,locale *param_1)

{
  undefined *puVar1;
  
  puVar1 = *(undefined **)param_1;
  *(undefined **)this = puVar1;
  if (puVar1 != &DAT_00d27100) {
    FUN_00c2bce0(1,puVar1 + 8);
  }
  return;
}

