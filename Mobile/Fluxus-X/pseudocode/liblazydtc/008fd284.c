/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fd284
 */

/* void std::__ndk1::vector<cpr::File, std::__ndk1::allocator<cpr::File>
   >::__emplace_back_slow_path<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&>(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::
__emplace_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
          (vector<cpr::File,std::__ndk1::allocator<cpr::File>> *this,basic_string_conflict *param_1)

{
  ulong *puVar1;
  long lVar2;
  void *pvVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  long lVar7;
  ulong uVar8;
  void *pvVar9;
  void *pvVar10;
  ulong uVar11;
  ulong local_80;
  ulong uStack_78;
  void *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  pvVar9 = *(void **)this;
  pvVar10 = *(void **)(this + 8);
  uVar11 = 0x555555555555555;
  lVar4 = (long)pvVar10 - (long)pvVar9 >> 4;
  uVar8 = lVar4 * -0x5555555555555555 + 1;
  if (0x555555555555555 < uVar8) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar7 = *(long *)(this + 0x10) - (long)pvVar9 >> 4;
  if ((ulong)(lVar7 * -0x5555555555555555) < 0x2aaaaaaaaaaaaaa) {
    uVar5 = lVar7 * 0x5555555555555556;
    uVar11 = uVar8;
    if (uVar8 <= uVar5) {
      uVar11 = uVar5;
    }
    if (uVar11 != 0) goto LAB_008fd318;
    pvVar3 = (void *)0x0;
  }
  else {
LAB_008fd318:
    pvVar3 = operator_new(uVar11 * 0x30);
  }
  uStack_78 = 0;
  local_70 = (void *)0x0;
  local_80 = 0;
  if (((byte)*param_1 & 1) == 0) {
    local_70 = *(void **)(param_1 + 0x10);
    uStack_78 = *(ulong *)(param_1 + 8);
    local_80 = *(ulong *)param_1;
    goto LAB_008fd3b8;
  }
  uVar8 = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < uVar8) {
                    /* try { // try from 008fd4d8 to 008fd4df has its CatchHandler @ 008fd4e0 */
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  pvVar9 = *(void **)(param_1 + 0x10);
  if (uVar8 < 0x17) {
    pvVar10 = (void *)((ulong)&local_80 | 1);
    local_80 = (ulong)(byte)((int)uVar8 << 1);
    if (uVar8 != 0) goto LAB_008fd3a0;
  }
  else {
    uVar5 = uVar8 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008fd388 to 008fd38f has its CatchHandler @ 008fd4e0 */
    pvVar10 = operator_new(uVar5);
    local_80 = uVar5 | 1;
    uStack_78 = uVar8;
    local_70 = pvVar10;
LAB_008fd3a0:
    memcpy(pvVar10,pvVar9,uVar8);
  }
  *(undefined1 *)((long)pvVar10 + uVar8) = 0;
  pvVar9 = *(void **)this;
  pvVar10 = *(void **)(this + 8);
LAB_008fd3b8:
  puVar6 = (ulong *)((long)pvVar3 + lVar4 * 0x10);
  puVar6[2] = (ulong)local_70;
  puVar6[1] = uStack_78;
  *puVar6 = local_80;
  *(undefined8 *)((long)pvVar3 + lVar4 * 0x10 + 0x20) = 0;
  *(undefined8 *)((long)pvVar3 + lVar4 * 0x10 + 0x28) = 0;
  *(undefined8 *)((long)pvVar3 + lVar4 * 0x10 + 0x18) = 0;
  *(undefined8 *)((long)pvVar3 + lVar4 * 0x10 + 0x20) = 0;
  *(undefined1 *)((long)puVar6 + 0x1f) = 0;
  *(undefined2 *)((long)puVar6 + 0x1d) = 0;
  *(undefined4 *)((long)puVar6 + 0x19) = 0;
  *(undefined8 *)((long)pvVar3 + lVar4 * 0x10 + 0x28) = 0;
  puVar1 = puVar6 + 6;
  if (pvVar10 != pvVar9) {
    do {
      puVar6[-4] = *(ulong *)((long)pvVar10 + -0x20);
      uVar8 = *(ulong *)((long)pvVar10 + -0x30);
      puVar6[-5] = *(ulong *)((long)pvVar10 + -0x28);
      puVar6[-6] = uVar8;
      *(undefined8 *)((long)pvVar10 + -0x28) = 0;
      *(undefined8 *)((long)pvVar10 + -0x20) = 0;
      *(undefined8 *)((long)pvVar10 + -0x30) = 0;
      puVar6[-1] = *(ulong *)((long)pvVar10 + -8);
      uVar8 = *(ulong *)((long)pvVar10 + -0x18);
      puVar6[-2] = *(ulong *)((long)pvVar10 + -0x10);
      puVar6[-3] = uVar8;
      *(undefined8 *)((long)pvVar10 + -0x18) = 0;
      *(undefined8 *)((long)pvVar10 + -0x10) = 0;
      *(undefined8 *)((long)pvVar10 + -8) = 0;
      pvVar10 = (void *)((long)pvVar10 + -0x30);
      puVar6 = puVar6 + -6;
    } while (pvVar9 != pvVar10);
    pvVar9 = *(void **)this;
    pvVar10 = *(void **)(this + 8);
  }
  *(ulong **)this = puVar6;
  *(ulong **)(this + 8) = puVar1;
  *(void **)(this + 0x10) = (void *)((long)pvVar3 + uVar11 * 0x30);
  while (pvVar3 = pvVar10, pvVar3 != pvVar9) {
    if ((*(byte *)((long)pvVar3 + -0x18) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -8));
    }
    pvVar10 = (void *)((long)pvVar3 + -0x30);
    if ((*(byte *)((long)pvVar3 + -0x30) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar3 + -0x20));
    }
  }
  if (pvVar9 != (void *)0x0) {
    operator_delete(pvVar9);
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

