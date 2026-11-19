/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0b2b4
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00c0b2b4(__shared_weak_count *param_1)

{
  __shared_weak_count _Var1;
  
  *(undefined ***)param_1 = &PTR_FUN_00caf408;
  if (((byte)param_1[0x60] & 1) == 0) {
    _Var1 = param_1[0x48];
  }
  else {
    operator_delete(*(void **)(param_1 + 0x70),
                    (*(ulong *)(param_1 + 0x60) & 0x3ffffffffffffffe) << 2);
    _Var1 = param_1[0x48];
  }
  if (((byte)_Var1 & 1) == 0) {
    _Var1 = param_1[0x30];
  }
  else {
    operator_delete(*(void **)(param_1 + 0x58),
                    (*(ulong *)(param_1 + 0x48) & 0x3ffffffffffffffe) << 2);
    _Var1 = param_1[0x30];
  }
  if (((byte)_Var1 & 1) == 0) {
    _Var1 = param_1[0x18];
  }
  else {
    operator_delete(*(void **)(param_1 + 0x40),
                    (*(ulong *)(param_1 + 0x30) & 0x3ffffffffffffffe) << 2);
    _Var1 = param_1[0x18];
  }
  if (((byte)_Var1 & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x28),*(ulong *)(param_1 + 0x18) & 0xfffffffffffffffe);
  }
  std::__ndk1::__shared_weak_count::~__shared_weak_count(param_1);
  return;
}

