/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3634
 */

/* std::runtime_error::TEMPNAMEPLACEHOLDERVALUE(std::runtime_error const&) */

runtime_error * __thiscall std::runtime_error::operator=(runtime_error *this,runtime_error *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = *(long *)(param_1 + 8);
  lVar3 = *(long *)(this + 8);
  *(long *)(this + 8) = lVar2;
  FUN_00c2bcb0(1,lVar2 + -8);
  iVar1 = FUN_00c2bcb0(0xffffffff,lVar3 + -8);
  if (iVar1 + -1 < 0) {
    operator_delete((void *)(lVar3 + -0x18));
  }
  return this;
}

