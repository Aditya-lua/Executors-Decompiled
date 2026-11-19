/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdc0c
 */

/* std::__ndk1::ios_base::iword(int) */

undefined8 * __thiscall std::__ndk1::ios_base::iword(ios_base *this,int param_1)

{
  ulong uVar1;
  void *pvVar2;
  void *pvVar3;
  void *__s;
  uint uVar4;
  void *pvVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar1 = (long)param_1 + 1;
  if (*(ulong *)(this + 0x68) < uVar1) {
    uVar6 = *(ulong *)(this + 0x68) * 2;
    if (uVar6 <= uVar1) {
      uVar6 = uVar1;
    }
    if (0xffffffffffffffe < uVar1) {
      uVar6 = 0x1fffffffffffffff;
    }
    pvVar5 = realloc(*(void **)(this + 0x58),uVar6 * 8);
    if (pvVar5 == (void *)0x0) {
      uVar4 = *(uint *)(this + 0x20);
      *(uint *)(this + 0x20) = uVar4 | 1;
      if ((*(uint *)(this + 0x24) & (uVar4 | 1)) != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_00bce038("ios_base::clear");
      }
      DAT_00d26730 = 0;
      return &DAT_00d26730;
    }
    uVar7 = *(ulong *)(this + 0x60);
    *(void **)(this + 0x58) = pvVar5;
    if (uVar7 < uVar6) {
      pvVar3 = (void *)(uVar6 * 8 + (long)pvVar5);
      __s = (void *)((long)pvVar5 + uVar7 * 8);
      pvVar2 = (void *)((long)__s + 8);
      if (pvVar2 <= pvVar3) {
        pvVar2 = pvVar3;
      }
      memset(__s,0,((long)pvVar2 + uVar7 * -8 + ~(ulong)pvVar5 & 0xfffffffffffffff8) + 8);
    }
    *(ulong *)(this + 0x68) = uVar6;
  }
  else {
    pvVar5 = *(void **)(this + 0x58);
    uVar7 = *(ulong *)(this + 0x60);
  }
  if (uVar7 <= uVar1) {
    uVar7 = uVar1;
  }
  *(ulong *)(this + 0x60) = uVar7;
  return (undefined8 *)((long)pvVar5 + (long)param_1 * 8);
}

