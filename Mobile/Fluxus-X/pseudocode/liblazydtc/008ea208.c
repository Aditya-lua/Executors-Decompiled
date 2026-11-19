/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ea208
 */

/* void std::__ndk1::vector<cpr::Cookie, std::__ndk1::allocator<cpr::Cookie>
   >::__emplace_back_slow_path<cpr::Cookie const&>(cpr::Cookie const&) */

void __thiscall
std::__ndk1::vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::
__emplace_back_slow_path<cpr::Cookie_const&>
          (vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>> *this,Cookie *param_1)

{
  ulong uVar1;
  Cookie *pCVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  void *local_70;
  Cookie *local_68;
  Cookie *local_60;
  void *local_58;
  vector<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>> *pvStack_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  uVar9 = 0x222222222222222;
  lVar4 = *(long *)(this + 8) - *(long *)this >> 3;
  uVar1 = lVar4 * -0x1111111111111111 + 1;
  if (0x222222222222222 < uVar1) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar5 = *(long *)(this + 0x10) - *(long *)this >> 3;
  pvStack_50 = this + 0x10;
  if ((ulong)(lVar5 * -0x1111111111111111) < 0x111111111111111) {
    uVar7 = lVar5 * -0x2222222222222222;
    uVar9 = uVar1;
    if (uVar1 <= uVar7) {
      uVar9 = uVar7;
    }
    if (uVar9 == 0) {
      local_70 = (void *)0x0;
      goto LAB_008ea2c0;
    }
  }
  local_58 = (void *)0x0;
  local_70 = operator_new(uVar9 * 0x78);
LAB_008ea2c0:
  local_68 = (Cookie *)((long)local_70 + lVar4 * 8);
  local_58 = (void *)((long)local_70 + uVar9 * 0x78);
  local_60 = local_68;
                    /* try { // try from 008ea2d4 to 008ea2df has its CatchHandler @ 008ea3f8 */
  cpr::Cookie::Cookie(local_68,param_1);
  pCVar2 = local_60 + 0x78;
  local_70 = *(void **)this;
  local_60 = *(Cookie **)(this + 8);
  if (local_60 != local_70) {
    lVar4 = 0;
    do {
      lVar5 = (long)local_60 + lVar4;
      lVar8 = lVar4 + -0x78;
      *(undefined8 *)(local_68 + lVar4 + -0x68) = *(undefined8 *)(lVar5 + -0x68);
      uVar6 = *(undefined8 *)(lVar5 + -0x78);
      *(undefined8 *)(local_68 + lVar4 + -0x70) = *(undefined8 *)(lVar5 + -0x70);
      *(undefined8 *)(local_68 + lVar4 + -0x78) = uVar6;
      *(undefined8 *)(lVar5 + -0x70) = 0;
      *(undefined8 *)(lVar5 + -0x68) = 0;
      *(undefined8 *)(lVar5 + -0x78) = 0;
      *(undefined8 *)(local_68 + lVar4 + -0x50) = *(undefined8 *)(lVar5 + -0x50);
      uVar6 = *(undefined8 *)(lVar5 + -0x60);
      *(undefined8 *)(local_68 + lVar4 + -0x58) = *(undefined8 *)(lVar5 + -0x58);
      *(undefined8 *)(local_68 + lVar4 + -0x60) = uVar6;
      *(undefined8 *)(lVar5 + -0x58) = 0;
      *(undefined8 *)(lVar5 + -0x50) = 0;
      *(undefined8 *)(lVar5 + -0x60) = 0;
      *(undefined8 *)(local_68 + lVar4 + -0x38) = *(undefined8 *)(lVar5 + -0x38);
      uVar6 = *(undefined8 *)(lVar5 + -0x48);
      *(undefined8 *)(local_68 + lVar4 + -0x40) = *(undefined8 *)(lVar5 + -0x40);
      *(undefined8 *)(local_68 + lVar4 + -0x48) = uVar6;
      *(undefined8 *)(lVar5 + -0x48) = 0;
      *(undefined8 *)(lVar5 + -0x40) = 0;
      *(undefined8 *)(lVar5 + -0x38) = 0;
      local_68[lVar4 + -0x30] = *(Cookie *)(lVar5 + -0x30);
      *(undefined8 *)(local_68 + lVar4 + -0x18) = *(undefined8 *)(lVar5 + -0x18);
      uVar6 = *(undefined8 *)(lVar5 + -0x28);
      *(undefined8 *)(local_68 + lVar4 + -0x20) = *(undefined8 *)(lVar5 + -0x20);
      *(undefined8 *)(local_68 + lVar4 + -0x28) = uVar6;
      uVar6 = *(undefined8 *)(lVar5 + -0x10);
      *(undefined8 *)(lVar5 + -0x20) = 0;
      *(undefined8 *)(lVar5 + -0x18) = 0;
      *(undefined8 *)(lVar5 + -0x28) = 0;
      *(undefined8 *)(local_68 + lVar4 + -8) = *(undefined8 *)(lVar5 + -8);
      *(undefined8 *)(local_68 + lVar4 + -0x10) = uVar6;
      lVar4 = lVar8;
    } while ((long)local_70 - (long)local_60 != lVar8);
    local_70 = *(void **)this;
    local_60 = *(Cookie **)(this + 8);
    local_68 = local_68 + lVar8;
  }
  *(Cookie **)this = local_68;
  *(Cookie **)(this + 8) = pCVar2;
  uVar6 = *(undefined8 *)(this + 0x10);
  *(void **)(this + 0x10) = local_58;
  local_68 = local_70;
  local_58 = (void *)uVar6;
  __split_buffer<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>&>::~__split_buffer
            ((__split_buffer<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>&> *)&local_70);
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

