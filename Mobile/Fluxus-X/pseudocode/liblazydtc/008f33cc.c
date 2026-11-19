/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f33cc
 */

/* cpr::Session::SetOption(cpr::ReserveSize const&) */

void __thiscall cpr::Session::SetOption(Session *this,ReserveSize *param_1)

{
  *(undefined8 *)(this + 0x240) = *(undefined8 *)param_1;
  return;
}

