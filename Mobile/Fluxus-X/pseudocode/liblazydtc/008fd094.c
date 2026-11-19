/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd094
 */

/* cpr::Files::cend() const */

undefined8 __thiscall cpr::Files::cend(Files *this)

{
  return *(undefined8 *)(this + 8);
}

