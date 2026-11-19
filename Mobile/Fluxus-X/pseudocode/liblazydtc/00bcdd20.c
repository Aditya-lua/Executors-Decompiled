/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdd20
 */

/* std::__ndk1::ios_base::pword(int) */

undefined8 * __thiscall std::__ndk1::ios_base::pword(ios_base *this,int param_1)

{
  ulong uVar1;
  void *pvVar2;
  void *pvVar3;
  void *__s;
  ulong uVar4;
  uint uVar5;
  void *pvVar6;
  ulong uVar7;
  
  uVar1 = (long)param_1 + 1;
  if (*(ulong *)(this + 0x80) < uVar1) {
    uVar4 = *(long *)(this + 0x68) * 2;
    if ((ulong)(*(long *)(this + 0x68) * 2) <= uVar1) {
      uVar4 = uVar1;
    }
    if (0xffffffffffffffe < uVar1) {
      uVar4 = 0x1fffffffffffffff;
    }
    pvVar6 = realloc(*(void **)(this + 0x70),uVar4 * 8);
    if (pvVar6 == (void *)0x0) {
      uVar5 = *(uint *)(this + 0x20);
      *(uint *)(this + 0x20) = uVar5 | 1;
      if ((*(uint *)(this + 0x24) & (uVar5 | 1)) != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_00bce038("ios_base::clear");
      }
      DAT_00d26738 = 0;
      return &DAT_00d26738;
    }
    uVar7 = *(ulong *)(this + 0x78);
    *(void **)(this + 0x70) = pvVar6;
    if (uVar7 < uVar4) {
      pvVar3 = (void *)(uVar4 * 8 + (long)pvVar6);
      __s = (void *)((long)pvVar6 + uVar7 * 8);
      pvVar2 = (void *)((long)__s + 8);
      if (pvVar2 <= pvVar3) {
        pvVar2 = pvVar3;
      }
      memset(__s,0,((long)pvVar2 + uVar7 * -8 + ~(ulong)pvVar6 & 0xfffffffffffffff8) + 8);
    }
    *(ulong *)(this + 0x80) = uVar4;
  }
  else {
    pvVar6 = *(void **)(this + 0x70);
    uVar7 = *(ulong *)(this + 0x78);
  }
  if (uVar7 <= uVar1) {
    uVar7 = uVar1;
  }
  *(ulong *)(this + 0x78) = uVar7;
  return (undefined8 *)((long)pvVar6 + (long)param_1 * 8);
}

