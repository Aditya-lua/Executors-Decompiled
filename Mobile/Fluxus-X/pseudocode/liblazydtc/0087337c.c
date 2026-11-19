/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087337c
 */

uint FUN_0087337c(undefined8 param_1,int *param_2)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined8 uVar5;
  int iVar6;
  undefined8 uVar7;
  int iVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  undefined1 uVar13;
  undefined1 uVar14;
  byte bVar15;
  undefined1 uVar16;
  undefined1 uVar17;
  undefined1 uVar18;
  byte bVar19;
  undefined1 uVar20;
  undefined1 auVar21 [16];
  
  iVar2 = *param_2;
  if (iVar2 == 4) {
    return (param_2[5] ^ param_2[4]) * 0x127409f ^ (param_2[3] ^ param_2[2]) * 0x466f45d ^
           (param_2[7] ^ param_2[6]) * 0x4f9ffb7 ^ (param_2[9] ^ param_2[8]) * 0x2611501;
  }
  if (iVar2 == 3) {
    uVar7 = *(undefined8 *)(param_2 + 4);
    bVar15 = (byte)((ulong)uVar7 >> 0x18);
    bVar19 = (byte)((ulong)uVar7 >> 0x38);
    uVar5 = *(undefined8 *)(param_2 + 2);
    bVar9 = (byte)((ulong)uVar5 >> 0x18);
    bVar11 = (byte)((ulong)uVar5 >> 0x38);
    iVar2 = CONCAT13(bVar9,CONCAT12((char)((ulong)uVar5 >> 0x10),
                                    CONCAT11(bVar9 >> 1 ^ (byte)((ulong)uVar5 >> 8),
                                             (byte)((uint)uVar5 >> 0x11) ^ (byte)uVar5))) *
            0x466f45d;
    iVar6 = CONCAT13(bVar11,CONCAT12((char)((ulong)uVar5 >> 0x30),
                                     CONCAT11(bVar11 >> 1 ^ (byte)((ulong)uVar5 >> 0x28),
                                              (byte)((ulong)uVar5 >> 0x31) ^
                                              (byte)((ulong)uVar5 >> 0x20)))) * 0x127409f;
    bVar9 = (byte)iVar6;
    bVar11 = (byte)((uint)iVar6 >> 8);
    bVar10 = (byte)((uint)iVar6 >> 0x10);
    bVar12 = (byte)((uint)iVar6 >> 0x18);
    iVar6 = CONCAT13(bVar15,CONCAT12((char)((ulong)uVar7 >> 0x10),
                                     CONCAT11(bVar15 >> 1 ^ (byte)((ulong)uVar7 >> 8),
                                              (byte)((uint)uVar7 >> 0x11) ^ (byte)uVar7))) *
            0x4f9ffb7;
    uVar13 = (undefined1)((uint)iVar6 >> 8);
    uVar14 = (undefined1)((uint)iVar6 >> 0x10);
    uVar16 = (undefined1)((uint)iVar6 >> 0x18);
    iVar8 = CONCAT13(bVar19,CONCAT12((char)((ulong)uVar7 >> 0x30),
                                     CONCAT11(bVar19 >> 1 ^ (byte)((ulong)uVar7 >> 0x28),
                                              (byte)((ulong)uVar7 >> 0x31) ^
                                              (byte)((ulong)uVar7 >> 0x20)))) * 0x2611501;
    uVar17 = (undefined1)((uint)iVar8 >> 8);
    uVar18 = (undefined1)((uint)iVar8 >> 0x10);
    uVar20 = (undefined1)((uint)iVar8 >> 0x18);
    auVar21[4] = bVar9;
    auVar21._0_4_ = iVar2;
    auVar21[5] = bVar11;
    auVar21[6] = bVar10;
    auVar21[7] = bVar12;
    auVar21[8] = (char)iVar6;
    auVar21[9] = uVar13;
    auVar21[10] = uVar14;
    auVar21[0xb] = uVar16;
    auVar21[0xc] = (char)iVar8;
    auVar21[0xd] = uVar17;
    auVar21[0xe] = uVar18;
    auVar21[0xf] = uVar20;
    auVar4[4] = bVar9;
    auVar4._0_4_ = iVar2;
    auVar4[5] = bVar11;
    auVar4[6] = bVar10;
    auVar4[7] = bVar12;
    auVar4[8] = (char)iVar6;
    auVar4[9] = uVar13;
    auVar4[10] = uVar14;
    auVar4[0xb] = uVar16;
    auVar4[0xc] = (char)iVar8;
    auVar4[0xd] = uVar17;
    auVar4[0xe] = uVar18;
    auVar4[0xf] = uVar20;
    auVar21 = NEON_ext(auVar21,auVar4,8,1);
    uVar1 = CONCAT13((byte)((uint)iVar2 >> 0x18) ^ auVar21[3],
                     CONCAT12((byte)((uint)iVar2 >> 0x10) ^ auVar21[2],
                              CONCAT11((byte)((uint)iVar2 >> 8) ^ auVar21[1],
                                       (byte)iVar2 ^ auVar21[0])));
    return uVar1 ^ (uint)(CONCAT17(bVar12 ^ auVar21[7],
                                   CONCAT16(bVar10 ^ auVar21[6],
                                            CONCAT15(bVar11 ^ auVar21[5],
                                                     CONCAT14(bVar9 ^ auVar21[4],uVar1)))) >> 0x20);
  }
  uVar1 = iVar2 * 0x5bd1e995 ^ param_2[3];
  uVar3 = (param_2[2] ^ uVar1 >> 0x12) * 0x5bd1e995;
  uVar1 = (uVar1 ^ uVar3 >> 0x16) * 0x5bd1e995;
  return (uVar1 ^ (uVar3 ^ uVar1 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995;
}

