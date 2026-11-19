/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985724
 */

/* ix::SelectInterruptPipe::~SelectInterruptPipe() */

void __thiscall ix::SelectInterruptPipe::~SelectInterruptPipe(SelectInterruptPipe *this)

{
  *(undefined ***)this = &PTR__SelectInterruptPipe_00c51ee0;
                    /* try { // try from 00985748 to 00985753 has its CatchHandler @ 00985774 */
  close(*(int *)(this + 8));
  close(*(int *)(this + 0xc));
  *(undefined8 *)(this + 8) = 0xffffffffffffffff;
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x10));
  SelectInterrupt::~SelectInterrupt((SelectInterrupt *)this);
  return;
}

