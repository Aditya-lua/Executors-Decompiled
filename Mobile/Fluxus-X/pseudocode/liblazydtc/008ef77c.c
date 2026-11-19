/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef77c
 */

/* cpr::Session::SetReserveSize(cpr::ReserveSize const&) */

void __thiscall cpr::Session::SetReserveSize(Session *this,ReserveSize *param_1)

{
  *(undefined8 *)(this + 0x240) = *(undefined8 *)param_1;
  return;
}

