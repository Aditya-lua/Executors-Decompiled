/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b488
 */

/* std::__ndk1::__independent_bits_engine<std::__ndk1::mersenne_twister_engine<unsigned long, 32ul,
   624ul, 397ul, 31ul, 2567483615ul, 11ul, 4294967295ul, 7ul, 2636928640ul, 15ul, 4022730752ul,
   18ul, 1812433253ul>, unsigned long>::__eval(std::__ndk1::integral_constant<bool, true>) */

long std::__ndk1::
     __independent_bits_engine<std::__ndk1::mersenne_twister_engine<unsigned_long,32ul,624ul,397ul,31ul,2567483615ul,11ul,4294967295ul,7ul,2636928640ul,15ul,4022730752ul,18ul,1812433253ul>,unsigned_long>
     ::__eval(long *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  
  if (param_1[4] == 0) {
    uVar3 = 0;
    lVar1 = 0;
  }
  else {
    lVar5 = *param_1;
    uVar6 = *(ulong *)(lVar5 + 0x1380);
    lVar1 = 0;
    uVar4 = 0;
    do {
      do {
        lVar7 = uVar6 * 8;
        uVar3 = uVar6 + 0x18d;
        uVar6 = (uVar6 + 1) % 0x270;
        uVar2 = *(ulong *)(lVar5 + uVar6 * 8);
        *(ulong *)(lVar5 + lVar7) =
             (uVar2 & 1) * 0x9908b0df ^ *(ulong *)(lVar5 + (uVar3 % 0x270) * 8) ^
             (uVar2 & 0x7ffffffe | *(ulong *)(lVar5 + lVar7) & 0xffffffff80000000) >> 1;
        uVar2 = *(ulong *)(lVar5 + *(long *)(lVar5 + 0x1380) * 8);
        *(ulong *)(lVar5 + 0x1380) = uVar6;
        uVar2 = uVar2 >> 0xb & 0xffffffff ^ uVar2;
        uVar2 = (uVar2 & 0x13a58ad) << 7 ^ uVar2;
        uVar2 = (uVar2 & 0x1df8c) << 0xf ^ uVar2;
        uVar2 = uVar2 ^ uVar2 >> 0x12;
      } while ((ulong)param_1[5] <= uVar2);
      uVar3 = param_1[4];
      uVar4 = uVar4 + 1;
      lVar1 = lVar1 << (param_1[2] & 0x3fU);
      if (0x3f < (ulong)param_1[2]) {
        lVar1 = 0;
      }
      lVar1 = lVar1 + (param_1[7] & uVar2);
    } while (uVar4 < uVar3);
  }
  if (uVar3 < (ulong)param_1[3]) {
    lVar5 = *param_1;
    uVar4 = *(ulong *)(lVar5 + 0x1380);
    do {
      do {
        lVar7 = uVar4 * 8;
        uVar6 = uVar4 + 0x18d;
        uVar4 = (uVar4 + 1) % 0x270;
        uVar2 = *(ulong *)(lVar5 + uVar4 * 8);
        *(ulong *)(lVar5 + lVar7) =
             (uVar2 & 1) * 0x9908b0df ^ *(ulong *)(lVar5 + (uVar6 % 0x270) * 8) ^
             (uVar2 & 0x7ffffffe | *(ulong *)(lVar5 + lVar7) & 0xffffffff80000000) >> 1;
        uVar6 = *(ulong *)(lVar5 + *(long *)(lVar5 + 0x1380) * 8);
        *(ulong *)(lVar5 + 0x1380) = uVar4;
        uVar6 = uVar6 >> 0xb & 0xffffffff ^ uVar6;
        uVar6 = (uVar6 & 0x13a58ad) << 7 ^ uVar6;
        uVar6 = (uVar6 & 0x1df8c) << 0xf ^ uVar6;
        uVar6 = uVar6 ^ uVar6 >> 0x12;
      } while ((ulong)param_1[6] <= uVar6);
      uVar3 = uVar3 + 1;
      lVar1 = lVar1 << (param_1[2] + 1U & 0x3f);
      if (0x3e < (ulong)param_1[2]) {
        lVar1 = 0;
      }
      lVar1 = lVar1 + (param_1[8] & uVar6);
    } while (uVar3 < (ulong)param_1[3]);
  }
  return lVar1;
}

