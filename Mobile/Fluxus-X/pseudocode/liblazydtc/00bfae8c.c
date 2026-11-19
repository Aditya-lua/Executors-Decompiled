/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfae8c
 */

/* std::__ndk1::locale::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::locale const&) */

locale * __thiscall std::__ndk1::locale::operator=(locale *this,locale *param_1)

{
  long lVar1;
  long *plVar2;
  
  if (*(undefined **)param_1 != &DAT_00d27100) {
    FUN_00c2bce0(1,*(undefined **)param_1 + 8);
  }
  plVar2 = *(long **)this;
  if ((plVar2 != (long *)&DAT_00d27100) &&
     (lVar1 = FUN_00c2bd10(0xffffffffffffffff,plVar2 + 1), lVar1 == 0)) {
    (**(code **)(*plVar2 + 0x10))(plVar2);
  }
  *(undefined8 *)this = *(undefined8 *)param_1;
  return this;
}

