/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fcb28
 */

/* void std::__ndk1::vector<cpr::Parameter, std::__ndk1::allocator<cpr::Parameter>
   >::__push_back_slow_path<cpr::Parameter>(cpr::Parameter&&) */

void __thiscall
std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::
__push_back_slow_path<cpr::Parameter>
          (vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>> *this,Parameter *param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  void *pvVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  void *pvVar8;
  void *pvVar9;
  ulong uVar10;
  undefined8 uVar11;
  
  lVar4 = *(long *)(this + 8) - *(long *)this >> 4;
  uVar10 = 0x555555555555555;
  uVar1 = lVar4 * -0x5555555555555555 + 1;
  if (0x555555555555555 < uVar1) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar5 = *(long *)(this + 0x10) - *(long *)this >> 4;
  if ((ulong)(lVar5 * -0x5555555555555555) < 0x2aaaaaaaaaaaaaa) {
    uVar6 = lVar5 * 0x5555555555555556;
    uVar10 = uVar1;
    if (uVar1 <= uVar6) {
      uVar10 = uVar6;
    }
    if (uVar10 == 0) {
      pvVar3 = (void *)0x0;
      goto LAB_008fcbac;
    }
  }
  pvVar3 = operator_new(uVar10 * 0x30);
LAB_008fcbac:
  puVar7 = (undefined8 *)((long)pvVar3 + lVar4 * 0x10);
  puVar7[2] = *(undefined8 *)(param_1 + 0x10);
  uVar11 = *(undefined8 *)param_1;
  puVar7[1] = *(undefined8 *)(param_1 + 8);
  *puVar7 = uVar11;
  *(undefined8 *)(param_1 + 8) = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)param_1 = 0;
  puVar7[5] = *(undefined8 *)(param_1 + 0x28);
  uVar11 = *(undefined8 *)(param_1 + 0x18);
  puVar2 = puVar7 + 6;
  puVar7[4] = *(undefined8 *)(param_1 + 0x20);
  puVar7[3] = uVar11;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  pvVar9 = *(void **)this;
  pvVar8 = *(void **)(this + 8);
  if (pvVar8 == pvVar9) {
    pvVar8 = pvVar9;
  }
  else {
    do {
      puVar7[-4] = *(undefined8 *)((long)pvVar8 + -0x20);
      uVar11 = *(undefined8 *)((long)pvVar8 + -0x30);
      puVar7[-5] = *(undefined8 *)((long)pvVar8 + -0x28);
      puVar7[-6] = uVar11;
      *(undefined8 *)((long)pvVar8 + -0x28) = 0;
      *(undefined8 *)((long)pvVar8 + -0x20) = 0;
      *(undefined8 *)((long)pvVar8 + -0x30) = 0;
      puVar7[-1] = *(undefined8 *)((long)pvVar8 + -8);
      uVar11 = *(undefined8 *)((long)pvVar8 + -0x18);
      puVar7[-2] = *(undefined8 *)((long)pvVar8 + -0x10);
      puVar7[-3] = uVar11;
      *(undefined8 *)((long)pvVar8 + -0x18) = 0;
      *(undefined8 *)((long)pvVar8 + -0x10) = 0;
      *(undefined8 *)((long)pvVar8 + -8) = 0;
      pvVar8 = (void *)((long)pvVar8 + -0x30);
      puVar7 = puVar7 + -6;
    } while (pvVar9 != pvVar8);
    pvVar9 = *(void **)this;
    pvVar8 = *(void **)(this + 8);
  }
  *(undefined8 **)this = puVar7;
  *(undefined8 **)(this + 8) = puVar2;
  *(void **)(this + 0x10) = (void *)((long)pvVar3 + uVar10 * 0x30);
  while (pvVar3 = pvVar8, pvVar3 != pvVar9) {
    if ((*(byte *)((long)pvVar3 + -0x18) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -8));
    }
    pvVar8 = (void *)((long)pvVar3 + -0x30);
    if ((*(byte *)((long)pvVar3 + -0x30) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -0x20));
    }
  }
  if (pvVar9 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar9);
  return;
}

