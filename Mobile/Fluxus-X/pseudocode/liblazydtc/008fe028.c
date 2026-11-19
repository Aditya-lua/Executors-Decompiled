/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe028
 */

/* cpr::ThreadPool::Start(unsigned long) */

undefined8 __thiscall cpr::ThreadPool::Start(ThreadPool *this,ulong param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  if (*(int *)(this + 0x20) == 0) {
    *(int *)(this + 0x20) = 1;
    uVar3 = *(ulong *)(this + 8);
    if (*(ulong *)(this + 8) <= param_1) {
      uVar3 = param_1;
    }
    uVar1 = *(ulong *)(this + 0x10);
    if (uVar3 <= *(ulong *)(this + 0x10)) {
      uVar1 = uVar3;
    }
    if (uVar1 != 0) {
      uVar3 = 0;
      do {
        CreateThread(this);
        uVar3 = uVar3 + 1;
      } while (uVar3 < uVar1);
    }
    uVar2 = 0;
  }
  else {
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

