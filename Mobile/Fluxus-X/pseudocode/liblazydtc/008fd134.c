/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd134
 */

/* cpr::Files::pop_back() */

void __thiscall cpr::Files::pop_back(Files *this)

{
  long lVar1;
  
  lVar1 = *(long *)(this + 8);
  if ((*(byte *)(lVar1 + -0x18) & 1) != 0) {
    operator_delete(*(void **)(lVar1 + -8));
  }
  if ((*(byte *)(lVar1 + -0x30) & 1) != 0) {
    operator_delete(*(void **)(lVar1 + -0x20));
  }
  *(byte **)(this + 8) = (byte *)(lVar1 + -0x30);
  return;
}

