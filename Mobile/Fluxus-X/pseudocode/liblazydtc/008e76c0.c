/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e76c0
 */

/* cpr::CertInfo::pop_back() */

void __thiscall cpr::CertInfo::pop_back(CertInfo *this)

{
  byte *pbVar1;
  
  pbVar1 = (byte *)(*(long *)(this + 8) + -0x18);
  if ((*pbVar1 & 1) != 0) {
    operator_delete(*(void **)(*(long *)(this + 8) + -8));
  }
  *(byte **)(this + 8) = pbVar1;
  return;
}

