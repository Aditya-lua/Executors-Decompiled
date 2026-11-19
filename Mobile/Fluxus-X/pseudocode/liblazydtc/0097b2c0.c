/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b2c0
 */

/* long 
   std::__ndk1::uniform_int_distribution<long>::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::mersenne_twister_engine<unsigned
   long, 32ul, 624ul, 397ul, 31ul, 2567483615ul, 11ul, 4294967295ul, 7ul, 2636928640ul, 15ul,
   4022730752ul, 18ul, 1812433253ul>&, std::__ndk1::uniform_int_distribution<long>::param_type
   const&) */

long __thiscall
std::__ndk1::uniform_int_distribution<long>::operator()
          (uniform_int_distribution<long> *this,mersenne_twister_engine *param_1,param_type *param_2
          )

{
  ulong uVar1;
  long lVar2;
  bool bVar3;
  long lVar4;
  ulong uVar5;
  mersenne_twister_engine *local_c8;
  ulong uStack_c0;
  ulong local_b8;
  ulong uStack_b0;
  long local_a8;
  ulong local_a0;
  long local_98;
  ulong local_90;
  ulong uStack_88;
  mersenne_twister_engine *local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  lVar4 = *(long *)param_2;
  if (*(long *)(param_2 + 8) - lVar4 == 0) goto LAB_0097b460;
  uVar1 = (*(long *)(param_2 + 8) - lVar4) + 1;
  if (uVar1 == 0) {
    uStack_70 = 0x20;
    local_78 = 0x40;
    uStack_60 = 2;
    local_68 = 2;
    uStack_50 = 0;
    local_58 = 0x100000000;
    uStack_40 = 0x1ffffffff;
    local_48 = 0xffffffff;
    local_80 = param_1;
    lVar4 = __independent_bits_engine<std::__ndk1::mersenne_twister_engine<unsigned_long,32ul,624ul,397ul,31ul,2567483615ul,11ul,4294967295ul,7ul,2636928640ul,15ul,4022730752ul,18ul,1812433253ul>,unsigned_long>
            ::__eval(&local_80);
    goto LAB_0097b460;
  }
  uStack_c0 = (0x40 - LZCOUNT(uVar1)) -
              (ulong)((0xffffffffffffffffU >> (0x41U - (0x40 - LZCOUNT(uVar1)) & 0x3f) & uVar1) == 0
                     );
  uStack_b0 = uStack_c0 >> 5;
  if ((uStack_c0 & 0x1f) != 0) {
    uStack_b0 = uStack_b0 + 1;
  }
  local_b8 = 0;
  if (uStack_b0 != 0) {
    local_b8 = uStack_c0 / uStack_b0;
  }
  local_a0 = (0x100000000U >> (local_b8 & 0x3f)) << (local_b8 & 0x3f);
  if (0x3f < local_b8) {
    local_a0 = 0;
  }
  uVar5 = 0;
  if (uStack_b0 != 0) {
    uVar5 = local_a0 / uStack_b0;
  }
  if (uVar5 < 0x100000000 - local_a0) {
    uStack_b0 = uStack_b0 + 1;
    local_b8 = 0;
    if (uStack_b0 != 0) {
      local_b8 = uStack_c0 / uStack_b0;
    }
    if (local_b8 < 0x40) {
      local_a0 = (0x100000000U >> (local_b8 & 0x3f)) << (local_b8 & 0x3f);
      goto LAB_0097b384;
    }
    local_a8 = uStack_b0 - (uStack_c0 - local_b8 * uStack_b0);
    local_98 = 0;
    bVar3 = false;
    local_a0 = 0;
  }
  else {
LAB_0097b384:
    uVar5 = 0;
    if (uStack_b0 != 0) {
      uVar5 = uStack_c0 / uStack_b0;
    }
    local_a8 = uStack_b0 - (uStack_c0 - uVar5 * uStack_b0);
    if (local_b8 < 0x3f) {
      local_98 = (0x100000000U >> (local_b8 + 1 & 0x3f)) << (local_b8 + 1 & 0x3f);
      bVar3 = true;
    }
    else {
      local_98 = 0;
      bVar3 = false;
    }
  }
  uStack_88 = 0xffffffffffffffff >> (0x3f - local_b8 & 0x3f);
  local_90 = 0;
  if (local_b8 != 0) {
    local_90 = 0xffffffffffffffff >> (0x40 - local_b8 & 0x3f);
  }
  if (!bVar3) {
    uStack_88 = 0xffffffffffffffff;
  }
  local_c8 = param_1;
  do {
    uVar5 = __independent_bits_engine<std::__ndk1::mersenne_twister_engine<unsigned_long,32ul,624ul,397ul,31ul,2567483615ul,11ul,4294967295ul,7ul,2636928640ul,15ul,4022730752ul,18ul,1812433253ul>,unsigned_long>
            ::__eval(&local_c8);
  } while (uVar1 <= uVar5);
  lVar4 = *(long *)param_2 + uVar5;
LAB_0097b460:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar4;
}

