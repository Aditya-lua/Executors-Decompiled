/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e74b4
 */

/* cpr::CertInfo::operator[](unsigned long const&) */

long __thiscall cpr::CertInfo::operator[](CertInfo *this,ulong *param_1)

{
  return *(long *)this + *param_1 * 0x18;
}

