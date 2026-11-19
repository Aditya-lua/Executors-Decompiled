/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985668
 */

/* ix::SelectInterrupt::~SelectInterrupt() */

void __thiscall ix::SelectInterrupt::~SelectInterrupt(SelectInterrupt *this)

{
  operator_delete(this);
  return;
}

