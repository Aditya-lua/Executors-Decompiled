/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e73c4
 */

/* cpr::CancellationCallback::SetProgressCallback(cpr::ProgressCallback&) */

void __thiscall
cpr::CancellationCallback::SetProgressCallback(CancellationCallback *this,ProgressCallback *param_1)

{
  if (this[0x18] != (CancellationCallback)0x0) {
    this[0x18] = (CancellationCallback)0x0;
  }
  *(ProgressCallback **)(this + 0x10) = param_1;
  this[0x18] = (CancellationCallback)0x1;
  return;
}

