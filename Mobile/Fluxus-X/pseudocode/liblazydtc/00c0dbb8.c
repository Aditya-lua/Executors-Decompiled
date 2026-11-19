/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dbb8
 */

/* std::underflow_error::~underflow_error() */

void __thiscall std::underflow_error::~underflow_error(underflow_error *this)

{
  int iVar1;
  long lVar2;
  
  lVar2 = *(long *)(this + 8);
  *(undefined ***)this = &PTR__underflow_error_00cb0570;
  iVar1 = FUN_00c2bcb0(0xffffffff,lVar2 + -8);
  if (iVar1 + -1 < 0) {
    operator_delete((void *)(lVar2 + -0x18));
  }
  bad_exception::~bad_exception((bad_exception *)this);
  return;
}

