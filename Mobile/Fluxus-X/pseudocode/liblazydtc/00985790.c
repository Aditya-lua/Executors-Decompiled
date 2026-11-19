/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985790
 */

/* ix::SelectInterruptPipe::~SelectInterruptPipe() */

void __thiscall ix::SelectInterruptPipe::~SelectInterruptPipe(SelectInterruptPipe *this)

{
  ~SelectInterruptPipe(this);
  operator_delete(this);
  return;
}

