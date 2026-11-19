/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fdc38
 */

/* cpr::ThreadPool::ThreadPool(unsigned long, unsigned long, std::__ndk1::chrono::duration<long
   long, std::__ndk1::ratio<1l, 1000l> >) */

void __thiscall
cpr::ThreadPool::ThreadPool
          (ThreadPool *this,undefined8 param_1,undefined8 param_2,undefined8 param_4)

{
  *(undefined8 *)(this + 0x10) = param_2;
  *(undefined8 *)(this + 0x18) = param_4;
  *(undefined4 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(ThreadPool **)(this + 0x38) = this + 0x38;
  *(ThreadPool **)(this + 0x40) = this + 0x38;
  *(undefined ***)this = &PTR__ThreadPool_00c4f108;
  *(undefined8 *)(this + 8) = param_1;
  memset(this + 0x48,0,0xb8);
  return;
}

