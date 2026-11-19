/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e74f0
 */

/* cpr::CertInfo::cend() const */

undefined8 __thiscall cpr::CertInfo::cend(CertInfo *this)

{
  return *(undefined8 *)(this + 8);
}

