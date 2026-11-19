/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009856e0
 */

/* ix::SelectInterruptPipe::SelectInterruptPipe() */

void __thiscall ix::SelectInterruptPipe::SelectInterruptPipe(SelectInterruptPipe *this)

{
  SelectInterrupt::SelectInterrupt((SelectInterrupt *)this);
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined ***)this = &PTR__SelectInterruptPipe_00c51ee0;
  *(undefined8 *)(this + 8) = 0xffffffffffffffff;
  return;
}

