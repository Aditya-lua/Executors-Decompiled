/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8dec
 */

/* cpr::Cookies::pop_back() */

void __thiscall cpr::Cookies::pop_back(Cookies *this)

{
  byte bVar1;
  long lVar2;
  byte *pbVar3;
  
  lVar2 = *(long *)(this + 0x10);
  if ((*(byte *)(lVar2 + -0x28) & 1) != 0) {
    operator_delete(*(void **)(lVar2 + -0x18));
  }
  pbVar3 = (byte *)(lVar2 + -0x78);
  if ((*(byte *)(lVar2 + -0x48) & 1) == 0) {
    bVar1 = *(byte *)(lVar2 + -0x60);
  }
  else {
    operator_delete(*(void **)(lVar2 + -0x38));
    bVar1 = *(byte *)(lVar2 + -0x60);
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = *pbVar3;
  }
  else {
    operator_delete(*(void **)(lVar2 + -0x50));
    bVar1 = *pbVar3;
  }
  if ((bVar1 & 1) != 0) {
    operator_delete(*(void **)(lVar2 + -0x68));
  }
  *(byte **)(this + 0x10) = pbVar3;
  return;
}

