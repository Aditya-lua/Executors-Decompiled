/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0dbac
 */

/* std::logic_error::what() const */

undefined8 __thiscall std::logic_error::what(logic_error *this)

{
  return *(undefined8 *)(this + 8);
}

