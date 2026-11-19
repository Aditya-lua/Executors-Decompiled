/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e74e0
 */

/* cpr::CertInfo::end() const */

undefined8 __thiscall cpr::CertInfo::end(CertInfo *this)

{
  return *(undefined8 *)(this + 8);
}

