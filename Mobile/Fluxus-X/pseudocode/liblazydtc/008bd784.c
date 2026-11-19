/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bd784
 */

long FUN_008bd784(long param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  byte bVar4;
  int iVar3;
  byte bVar5;
  byte bVar7;
  int iVar6;
  byte bVar8;
  undefined8 uVar9;
  
  uVar2 = param_2[3];
  if ((int)uVar2 < 3) {
    if (uVar2 == 1) {
      uVar2 = *param_2;
      goto LAB_008bd87c;
    }
  }
  else {
    if (uVar2 == 5) {
      uVar2 = *(uint *)(*(long *)param_2 + 0x10);
      goto LAB_008bd87c;
    }
    if (uVar2 == 4) {
      uVar9 = *(undefined8 *)(param_2 + 1);
      iVar3 = -(uint)((int)uVar9 == -0x80000000);
      iVar6 = -(uint)((int)((ulong)uVar9 >> 0x20) == -0x80000000);
      bVar4 = (byte)((ulong)uVar9 >> 0x10) & ~(byte)((uint)iVar3 >> 0x10);
      bVar5 = (byte)((ulong)uVar9 >> 0x18) & ~(byte)((uint)iVar3 >> 0x18);
      bVar7 = (byte)((ulong)uVar9 >> 0x30) & ~(byte)((uint)iVar6 >> 0x10);
      bVar8 = (byte)((ulong)uVar9 >> 0x38) & ~(byte)((uint)iVar6 >> 0x18);
      iVar3 = CONCAT13(bVar5,CONCAT12(bVar4,CONCAT11(bVar5 >> 1 ^
                                                     (byte)((ulong)uVar9 >> 8) &
                                                     ~(byte)((uint)iVar3 >> 8),
                                                     (byte)(CONCAT11(bVar5,bVar4) >> 1) ^
                                                     (byte)uVar9 & ~(byte)iVar3)));
      uVar2 = 0;
      if (*param_2 != 0x80000000) {
        uVar2 = *param_2;
      }
      uVar2 = iVar3 * 0x127409f ^ (uVar2 ^ uVar2 >> 0x11) * 0x466f45d ^
              (int)(CONCAT17(bVar8,CONCAT16(bVar7,CONCAT15(bVar8 >> 1 ^
                                                           (byte)((ulong)uVar9 >> 0x28) &
                                                           ~(byte)((uint)iVar6 >> 8),
                                                           CONCAT14((byte)(((ulong)CONCAT11(bVar8,
                                                  bVar7) << 0x30) >> 0x31) ^
                                                  (byte)((ulong)uVar9 >> 0x20) & ~(byte)iVar6,iVar3)
                                                  ))) >> 0x20) * 0x4f9ffb7;
      goto LAB_008bd87c;
    }
    if (uVar2 == 3) {
      uVar2 = (*param_2 ^ (param_2[1] & 0x7fffffff) >> 0x12) * 0x5bd1e995;
      uVar1 = (param_2[1] & 0x7fffffff ^ uVar2 >> 0x16) * 0x5bd1e995;
      uVar2 = (uVar1 ^ (uVar2 ^ uVar1 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995;
      goto LAB_008bd87c;
    }
  }
  uVar2 = (*param_2 ^ *param_2 >> 0x10) * -0x7a143595;
  uVar2 = (uVar2 ^ uVar2 >> 0xd) * -0x3d4d51cb;
  uVar2 = uVar2 ^ uVar2 >> 0x10;
LAB_008bd87c:
  return *(long *)(param_1 + 0x28) +
         (ulong)(uVar2 & (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
}

