/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa98e4
 */

void CRYPTO_gcm128_init(void *param_1,undefined8 param_2,code *param_3)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  
  memset(param_1,0,0x1b8);
  *(code **)((long)param_1 + 0x178) = param_3;
  *(undefined8 *)((long)param_1 + 0x180) = param_2;
  (*param_3)((long)param_1 + 0x50,(long)param_1 + 0x50,param_2);
  uVar12 = (ulong)*(byte *)((long)param_1 + 0x5f);
  uVar1 = (*(uint *)((long)param_1 + 0x50) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x50) & 0xff00ff) << 8;
  uVar2 = (*(uint *)((long)param_1 + 0x58) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x58) & 0xff00ff) << 8;
  uVar3 = (ulong)*(byte *)((long)param_1 + 0x54) << 0x18 |
          (ulong)*(byte *)((long)param_1 + 0x55) << 0x10 |
          (ulong)(uVar1 >> 0x10 | uVar1 << 0x10) << 0x20 |
          (ulong)*(byte *)((long)param_1 + 0x56) << 8 | (ulong)*(byte *)((long)param_1 + 0x57);
  uVar4 = (ulong)*(byte *)((long)param_1 + 0x5c) << 0x18 |
          (ulong)*(byte *)((long)param_1 + 0x5d) << 0x10 |
          (ulong)(uVar2 >> 0x10 | uVar2 << 0x10) << 0x20 |
          (ulong)*(byte *)((long)param_1 + 0x5e) << 8 | uVar12;
  uVar6 = uVar4 >> 1 | (ulong)*(byte *)((long)param_1 + 0x57) << 0x3f;
  uVar5 = -(uVar12 & 1) & 0xe100000000000000 ^ uVar3 >> 1;
  uVar7 = uVar6 >> 1 | (uVar3 >> 1) << 0x3f;
  uVar8 = -((uVar12 & 2) >> 1) & 0xe100000000000000 ^ uVar5 >> 1;
  uVar11 = uVar7 >> 1 | (uVar5 >> 1) << 0x3f;
  uVar10 = -((uVar12 & 4) >> 2) & 0xe100000000000000 ^ uVar8 >> 1;
  *(ulong *)((long)param_1 + 0x120) = uVar5 ^ uVar3;
  *(ulong *)((long)param_1 + 0x128) = uVar6 ^ uVar4;
  *(ulong *)((long)param_1 + 0x80) = uVar8;
  *(ulong *)((long)param_1 + 0x88) = uVar7;
  uVar12 = uVar11 ^ uVar7;
  uVar9 = uVar10 ^ uVar8;
  *(ulong *)((long)param_1 + 0xa0) = uVar5;
  *(ulong *)((long)param_1 + 0xa8) = uVar6;
  *(ulong *)((long)param_1 + 0x70) = uVar10;
  *(ulong *)((long)param_1 + 0x78) = uVar11;
  *(ulong *)((long)param_1 + 0x50) = uVar3;
  *(ulong *)((long)param_1 + 0x58) = uVar4;
  *(ulong *)((long)param_1 + 0xe0) = uVar3;
  *(ulong *)((long)param_1 + 0xe8) = uVar4;
  *(ulong *)((long)param_1 + 0xc0) = uVar8 ^ uVar5;
  *(ulong *)((long)param_1 + 200) = uVar7 ^ uVar6;
  *(ulong *)((long)param_1 + 0x100) = uVar8 ^ uVar3;
  *(ulong *)((long)param_1 + 0x108) = uVar7 ^ uVar4;
  *(ulong *)((long)param_1 + 0x90) = uVar9;
  *(ulong *)((long)param_1 + 0x98) = uVar12;
  *(undefined8 *)((long)param_1 + 0x60) = 0;
  *(undefined8 *)((long)param_1 + 0x68) = 0;
  *(ulong *)((long)param_1 + 0xb0) = uVar10 ^ uVar5;
  *(ulong *)((long)param_1 + 0xb8) = uVar11 ^ uVar6;
  *(ulong *)((long)param_1 + 0xf0) = uVar10 ^ uVar3;
  *(ulong *)((long)param_1 + 0xf8) = uVar11 ^ uVar4;
  *(ulong *)((long)param_1 + 0x140) = uVar8 ^ uVar5 ^ uVar3;
  *(ulong *)((long)param_1 + 0x148) = uVar7 ^ uVar6 ^ uVar4;
  *(ulong *)((long)param_1 + 0xd0) = uVar9 ^ uVar5;
  *(ulong *)((long)param_1 + 0xd8) = uVar12 ^ uVar6;
  *(ulong *)((long)param_1 + 0x110) = uVar9 ^ uVar3;
  *(ulong *)((long)param_1 + 0x118) = uVar12 ^ uVar4;
  *(ulong *)((long)param_1 + 0x130) = uVar10 ^ uVar5 ^ uVar3;
  *(ulong *)((long)param_1 + 0x138) = uVar11 ^ uVar6 ^ uVar4;
  *(ulong *)((long)param_1 + 0x150) = uVar9 ^ uVar5 ^ uVar3;
  *(ulong *)((long)param_1 + 0x158) = uVar12 ^ uVar6 ^ uVar4;
  return;
}

