/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3e08
 */

void Poly1305_Final(uint *param_1,undefined1 *param_2)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  long lVar12;
  
  lVar12 = *(long *)(param_1 + 0x38);
  if (lVar12 != 0) {
    *(undefined1 *)((long)param_1 + lVar12 + 0xd0) = 1;
    if (lVar12 + 1U < 0x10) {
      memset((void *)((long)param_1 + lVar12 + 0xd1),0,0xf - lVar12);
    }
    FUN_00ac3c34(param_1,param_1 + 0x34,0x10,0);
  }
  uVar6 = param_1[2];
  uVar8 = param_1[3];
  uVar1 = (ulong)*param_1 + 5;
  uVar3 = (ulong)param_1[1] + (uVar1 >> 0x20);
  uVar4 = (ulong)uVar6 + (uVar3 >> 0x20);
  lVar12 = (ulong)uVar8 + (uVar4 >> 0x20);
  uVar10 = param_1[4] + (int)((ulong)lVar12 >> 0x20) >> 2;
  uVar11 = -uVar10;
  uVar10 = uVar10 - 1;
  uVar7 = param_1[0x32];
  uVar9 = param_1[0x33];
  uVar1 = (ulong)(uVar10 & *param_1 | uVar11 & (uint)uVar1) + (ulong)param_1[0x30];
  uVar3 = (ulong)(uVar10 & param_1[1] | uVar11 & (uint)uVar3) + (ulong)param_1[0x31] +
          (uVar1 >> 0x20);
  *param_2 = (char)uVar1;
  lVar5 = (ulong)(uVar10 & uVar6 | uVar11 & (uint)uVar4) + (ulong)uVar7 + (uVar3 >> 0x20);
  param_2[1] = (char)(uVar1 >> 8);
  param_2[2] = (char)(uVar1 >> 0x10);
  param_2[3] = (char)(uVar1 >> 0x18);
  param_2[4] = (char)uVar3;
  param_2[5] = (char)(uVar3 >> 8);
  param_2[7] = (char)(uVar3 >> 0x18);
  iVar2 = (uVar10 & uVar8 | uVar11 & (uint)lVar12) + uVar9 + (int)((ulong)lVar5 >> 0x20);
  param_2[8] = (char)lVar5;
  param_2[9] = (char)((ulong)lVar5 >> 8);
  param_2[10] = (char)((ulong)lVar5 >> 0x10);
  param_2[0xc] = (char)iVar2;
  param_2[6] = (char)(uVar3 >> 0x10);
  param_2[0xb] = (char)((ulong)lVar5 >> 0x18);
  param_2[0xd] = (char)((uint)iVar2 >> 8);
  param_2[0xe] = (char)((uint)iVar2 >> 0x10);
  param_2[0xf] = (char)((uint)iVar2 >> 0x18);
  OPENSSL_cleanse(param_1,0xf8);
  return;
}

