/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcde34
 */

/* std::__ndk1::ios_base::register_callback(void (*)(std::__ndk1::ios_base::event,
   std::__ndk1::ios_base&, int), int) */

void __thiscall
std::__ndk1::ios_base::register_callback
          (ios_base *this,_func_void_event_ios_base_ptr_int *param_1,int param_2)

{
  uint uVar1;
  void *pvVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  
  lVar5 = *(long *)(this + 0x48);
  uVar3 = lVar5 + 1;
  if (*(ulong *)(this + 0x50) < uVar3) {
    uVar4 = *(ulong *)(this + 0x50) * 2;
    if (uVar4 <= uVar3) {
      uVar4 = uVar3;
    }
    if (0xffffffffffffffe < uVar3) {
      uVar4 = 0x1fffffffffffffff;
    }
    pvVar2 = realloc(*(void **)(this + 0x38),uVar4 << 3);
    if (pvVar2 == (void *)0x0) {
      uVar1 = *(uint *)(this + 0x20);
      *(uint *)(this + 0x20) = uVar1 | 1;
      if ((*(uint *)(this + 0x24) & (uVar1 | 1)) != 0) goto LAB_00bcdf08;
    }
    *(void **)(this + 0x38) = pvVar2;
    pvVar2 = realloc(*(void **)(this + 0x40),uVar4 << 2);
    if (pvVar2 == (void *)0x0) {
      uVar1 = *(uint *)(this + 0x20);
      *(uint *)(this + 0x20) = uVar1 | 1;
      if ((*(uint *)(this + 0x24) & (uVar1 | 1)) != 0) {
LAB_00bcdf08:
                    /* WARNING: Subroutine does not return */
        FUN_00bce038("ios_base::clear");
      }
    }
    lVar5 = *(long *)(this + 0x48);
    *(void **)(this + 0x40) = pvVar2;
    *(ulong *)(this + 0x50) = uVar4;
    uVar3 = lVar5 + 1;
  }
  *(_func_void_event_ios_base_ptr_int **)(*(long *)(this + 0x38) + lVar5 * 8) = param_1;
  *(int *)(*(long *)(this + 0x40) + lVar5 * 4) = param_2;
  *(ulong *)(this + 0x48) = uVar3;
  return;
}

