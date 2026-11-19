/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fc978
 */

/* void std::__ndk1::vector<cpr::Pair, std::__ndk1::allocator<cpr::Pair>
   >::__push_back_slow_path<cpr::Pair const&>(cpr::Pair const&) */

void __thiscall
std::__ndk1::vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>>::
__push_back_slow_path<cpr::Pair_const&>
          (vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>> *this,Pair *param_1)

{
  ulong uVar1;
  Pair *pPVar2;
  void *pvVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  void *pvVar7;
  Pair *this_00;
  void *pvVar8;
  ulong uVar9;
  undefined8 uVar10;
  
  lVar4 = *(long *)(this + 8) - *(long *)this >> 4;
  uVar9 = 0x555555555555555;
  uVar1 = lVar4 * -0x5555555555555555 + 1;
  if (0x555555555555555 < uVar1) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar5 = *(long *)(this + 0x10) - *(long *)this >> 4;
  if ((ulong)(lVar5 * -0x5555555555555555) < 0x2aaaaaaaaaaaaaa) {
    uVar6 = lVar5 * 0x5555555555555556;
    uVar9 = uVar1;
    if (uVar1 <= uVar6) {
      uVar9 = uVar6;
    }
    if (uVar9 == 0) {
      pvVar3 = (void *)0x0;
      goto LAB_008fca0c;
    }
  }
  pvVar3 = operator_new(uVar9 * 0x30);
LAB_008fca0c:
  this_00 = (Pair *)((long)pvVar3 + lVar4 * 0x10);
                    /* try { // try from 008fca14 to 008fca1f has its CatchHandler @ 008fcb10 */
  cpr::Pair::Pair(this_00,param_1);
  pvVar8 = *(void **)this;
  pvVar7 = *(void **)(this + 8);
  pPVar2 = this_00 + 0x30;
  if (pvVar7 == pvVar8) {
    pvVar7 = pvVar8;
  }
  else {
    do {
      *(undefined8 *)(this_00 + -0x20) = *(undefined8 *)((long)pvVar7 + -0x20);
      uVar10 = *(undefined8 *)((long)pvVar7 + -0x30);
      *(undefined8 *)(this_00 + -0x28) = *(undefined8 *)((long)pvVar7 + -0x28);
      *(undefined8 *)(this_00 + -0x30) = uVar10;
      *(undefined8 *)((long)pvVar7 + -0x28) = 0;
      *(undefined8 *)((long)pvVar7 + -0x20) = 0;
      *(undefined8 *)((long)pvVar7 + -0x30) = 0;
      *(undefined8 *)(this_00 + -8) = *(undefined8 *)((long)pvVar7 + -8);
      uVar10 = *(undefined8 *)((long)pvVar7 + -0x18);
      *(undefined8 *)(this_00 + -0x10) = *(undefined8 *)((long)pvVar7 + -0x10);
      *(undefined8 *)(this_00 + -0x18) = uVar10;
      *(undefined8 *)((long)pvVar7 + -0x18) = 0;
      *(undefined8 *)((long)pvVar7 + -0x10) = 0;
      *(undefined8 *)((long)pvVar7 + -8) = 0;
      pvVar7 = (void *)((long)pvVar7 + -0x30);
      this_00 = this_00 + -0x30;
    } while (pvVar8 != pvVar7);
    pvVar8 = *(void **)this;
    pvVar7 = *(void **)(this + 8);
  }
  *(Pair **)this = this_00;
  *(Pair **)(this + 8) = pPVar2;
  *(void **)(this + 0x10) = (void *)((long)pvVar3 + uVar9 * 0x30);
  while (pvVar3 = pvVar7, pvVar3 != pvVar8) {
    if ((*(byte *)((long)pvVar3 + -0x18) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -8));
    }
    pvVar7 = (void *)((long)pvVar3 + -0x30);
    if ((*(byte *)((long)pvVar3 + -0x30) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -0x20));
    }
  }
  if (pvVar8 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar8);
  return;
}

