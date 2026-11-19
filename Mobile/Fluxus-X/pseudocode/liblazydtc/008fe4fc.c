/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe4fc
 */

/* std::__ndk1::__deque_base<std::__ndk1::function<void ()>,
   std::__ndk1::allocator<std::__ndk1::function<void ()> > >::clear() */

void __thiscall
std::__ndk1::
__deque_base<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::
clear(__deque_base<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>
      *this)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 *puVar6;
  long lVar5;
  ulong uVar7;
  long *plVar8;
  long *plVar9;
  long *plVar10;
  
  puVar3 = *(undefined8 **)(this + 8);
  puVar6 = *(undefined8 **)(this + 0x10);
  if (puVar6 != puVar3) {
    uVar7 = *(ulong *)(this + 0x20);
    plVar9 = (long *)(puVar3[uVar7 / 0x55] + (uVar7 % 0x55) * 0x30);
    plVar8 = (long *)(puVar3[(*(long *)(this + 0x28) + uVar7) / 0x55] +
                     ((*(long *)(this + 0x28) + uVar7) % 0x55) * 0x30);
    if (plVar8 != plVar9) {
      plVar10 = puVar3 + uVar7 / 0x55;
      do {
        plVar1 = (long *)plVar9[4];
        if (plVar9 == plVar1) {
          pcVar2 = *(code **)(*plVar1 + 0x20);
LAB_008fe59c:
          (*pcVar2)();
        }
        else if (plVar1 != (long *)0x0) {
          pcVar2 = *(code **)(*plVar1 + 0x28);
          goto LAB_008fe59c;
        }
        plVar9 = plVar9 + 6;
        if ((long)plVar9 - *plVar10 == 0xff0) {
          plVar10 = plVar10 + 1;
          plVar9 = (long *)*plVar10;
        }
      } while (plVar8 != plVar9);
      puVar3 = *(undefined8 **)(this + 8);
      puVar6 = *(undefined8 **)(this + 0x10);
    }
  }
  *(undefined8 *)(this + 0x28) = 0;
  lVar5 = (long)puVar6 - (long)puVar3;
  while (uVar7 = lVar5 >> 3, 2 < uVar7) {
    operator_delete((void *)*puVar3);
    puVar3 = (undefined8 *)(*(long *)(this + 8) + 8);
    *(undefined8 **)(this + 8) = puVar3;
    lVar5 = *(long *)(this + 0x10) - (long)puVar3;
  }
  if (uVar7 == 1) {
    uVar4 = 0x2a;
  }
  else {
    if (uVar7 != 2) {
      return;
    }
    uVar4 = 0x55;
  }
  *(undefined8 *)(this + 0x20) = uVar4;
  return;
}

