/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099fe04
 */

/* WebSocketHandshakeKeyGen::sha1(unsigned int*, unsigned int*) */

void WebSocketHandshakeKeyGen::sha1(uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  long lVar6;
  byte bVar9;
  int iVar7;
  undefined8 uVar8;
  byte bVar10;
  byte bVar11;
  undefined8 uVar12;
  int iVar13;
  byte bVar15;
  byte bVar16;
  undefined8 uVar14;
  int iVar17;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  undefined8 uVar18;
  byte bVar25;
  static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<1>> asStack_50 [4];
  uint local_4c;
  uint local_48;
  uint local_44;
  uint local_40;
  uint local_3c;
  long local_38;
  
  lVar6 = tpidr_el0;
  local_38 = *(long *)(lVar6 + 0x28);
  local_4c = param_1[4];
  local_48 = param_1[3];
  local_44 = param_1[2];
  local_40 = param_1[1];
  local_3c = *param_1;
  static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator()(asStack_50,&local_4c,param_2);
  uVar3 = param_2[0xf];
  uVar8 = *(undefined8 *)(param_2 + 0xd);
  uVar12 = *(undefined8 *)(param_2 + 8);
  uVar14 = *(undefined8 *)param_2;
  uVar18 = *(undefined8 *)(param_2 + 2);
  uVar4 = local_40 >> 2 | local_40 << 0x1e;
  bVar19 = (byte)((ulong)uVar18 >> 8);
  bVar20 = (byte)((ulong)uVar18 >> 0x10);
  bVar21 = (byte)((ulong)uVar18 >> 0x18);
  bVar22 = (byte)((ulong)uVar18 >> 0x20);
  bVar23 = (byte)((ulong)uVar18 >> 0x28);
  bVar24 = (byte)((ulong)uVar18 >> 0x30);
  bVar25 = (byte)((ulong)uVar18 >> 0x38);
  uVar5 = local_3c >> 2 | local_3c << 0x1e;
  bVar9 = (byte)((ulong)uVar12 >> 0x18) ^ (byte)((ulong)uVar8 >> 0x18) ^ bVar21 ^
          (byte)((ulong)uVar14 >> 0x18);
  iVar7 = CONCAT13(bVar9,CONCAT12((byte)((ulong)uVar12 >> 0x10) ^ (byte)((ulong)uVar8 >> 0x10) ^
                                  bVar20 ^ (byte)((ulong)uVar14 >> 0x10),
                                  CONCAT11((byte)((ulong)uVar12 >> 8) ^ (byte)((ulong)uVar8 >> 8) ^
                                           bVar19 ^ (byte)((ulong)uVar14 >> 8),
                                           (byte)uVar12 ^ (byte)uVar8 ^ (byte)uVar18 ^ (byte)uVar14)
                                 ));
  bVar10 = (byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38) ^ bVar25 ^
           (byte)((ulong)uVar14 >> 0x38);
  iVar13 = iVar7 << 1;
  iVar17 = (int)(CONCAT17(bVar10,CONCAT16((byte)((ulong)uVar12 >> 0x30) ^
                                          (byte)((ulong)uVar8 >> 0x30) ^ bVar24 ^
                                          (byte)((ulong)uVar14 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar12 >> 0x28) ^
                                                   (byte)((ulong)uVar8 >> 0x28) ^ bVar23 ^
                                                   (byte)((ulong)uVar14 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar12 >> 0x20) ^
                                                            (byte)((ulong)uVar8 >> 0x20) ^ bVar22 ^
                                                            (byte)((ulong)uVar14 >> 0x20),iVar7))))
                >> 0x20) << 1;
  uVar1 = uVar3 + ((local_48 ^ local_44) & local_40 ^ local_48) + local_4c +
          (local_3c >> 0x1b | local_3c << 5) + 0x5a827999;
  bVar9 = bVar9 >> 7 | (byte)iVar13;
  bVar15 = (byte)((uint)iVar13 >> 8);
  bVar16 = (byte)((uint)iVar13 >> 0x10);
  bVar11 = (byte)((uint)iVar13 >> 0x18);
  iVar7 = CONCAT13(bVar11,CONCAT12(bVar16,CONCAT11(bVar15,bVar9)));
  uVar8 = CONCAT17((char)((uint)iVar17 >> 0x18),
                   CONCAT16((char)((uint)iVar17 >> 0x10),
                            CONCAT15((char)((uint)iVar17 >> 8),
                                     CONCAT14(bVar10 >> 7 | (byte)iVar17,iVar7))));
  local_4c = uVar1 >> 2 | uVar1 * 0x40000000;
  *(undefined8 *)param_2 = uVar8;
  uVar12 = *(undefined8 *)(param_2 + 10);
  uVar14 = *(undefined8 *)(param_2 + 4);
  uVar2 = local_48 + (local_3c & (uVar4 ^ local_44) ^ local_44) + (uVar1 >> 0x1b | uVar1 * 0x20) +
          iVar7 + 0x5a827999;
  local_48 = uVar2 >> 2 | uVar2 * 0x40000000;
  bVar10 = bVar21 ^ (byte)(uVar3 >> 0x18) ^ (byte)((ulong)uVar12 >> 0x18) ^
           (byte)((ulong)uVar14 >> 0x18);
  iVar7 = CONCAT13(bVar10,CONCAT12(bVar20 ^ (byte)(uVar3 >> 0x10) ^ (byte)((ulong)uVar12 >> 0x10) ^
                                   (byte)((ulong)uVar14 >> 0x10),
                                   CONCAT11(bVar19 ^ (byte)(uVar3 >> 8) ^ (byte)((ulong)uVar12 >> 8)
                                            ^ (byte)((ulong)uVar14 >> 8),
                                            (byte)uVar18 ^ (byte)uVar3 ^ (byte)uVar12 ^ (byte)uVar14
                                           )));
  bVar11 = bVar25 ^ bVar11 ^ (byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38);
  uVar1 = local_44 + (uVar1 & (uVar5 ^ uVar4) ^ uVar4) + (uVar2 >> 0x1b | uVar2 * 0x20) +
          (int)((ulong)uVar8 >> 0x20) + 0x5a827999;
  iVar13 = iVar7 << 1;
  iVar17 = (int)(CONCAT17(bVar11,CONCAT16(bVar24 ^ bVar16 ^ (byte)((ulong)uVar12 >> 0x30) ^
                                          (byte)((ulong)uVar14 >> 0x30),
                                          CONCAT15(bVar23 ^ bVar15 ^ (byte)((ulong)uVar12 >> 0x28) ^
                                                   (byte)((ulong)uVar14 >> 0x28),
                                                   CONCAT14(bVar22 ^ bVar9 ^
                                                            (byte)((ulong)uVar12 >> 0x20) ^
                                                            (byte)((ulong)uVar14 >> 0x20),iVar7))))
                >> 0x20) << 1;
  iVar7 = CONCAT13((char)((uint)iVar13 >> 0x18),
                   CONCAT12((char)((uint)iVar13 >> 0x10),
                            CONCAT11((char)((uint)iVar13 >> 8),bVar10 >> 7 | (byte)iVar13)));
  uVar8 = CONCAT17((char)((uint)iVar17 >> 0x18),
                   CONCAT16((char)((uint)iVar17 >> 0x10),
                            CONCAT15((char)((uint)iVar17 >> 8),
                                     CONCAT14(bVar11 >> 7 | (byte)iVar17,iVar7))));
  local_44 = uVar1 >> 2 | uVar1 * 0x40000000;
  local_40 = uVar4 + (uVar2 & (local_4c ^ uVar5) ^ uVar5) + iVar7 + (uVar1 >> 0x1b | uVar1 * 0x20) +
             0x5a827999;
  local_3c = uVar5 + (uVar1 & (local_48 ^ local_4c) ^ local_4c) + (int)((ulong)uVar8 >> 0x20) +
             (local_40 >> 0x1b | local_40 * 0x20) + 0x5a827999;
  *(undefined8 *)(param_2 + 2) = uVar8;
  static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator()
            ((static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<3>> *)asStack_50,&local_4c,param_2);
  uVar1 = param_2[0xf] ^ param_2[4] ^ param_2[9] ^ param_2[7];
  uVar2 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[7] = uVar2;
  uVar1 = local_48 ^ local_44;
  local_44 = local_44 >> 2 | local_44 << 0x1e;
  local_3c = uVar2 + (uVar1 ^ local_4c) + local_3c + (local_40 >> 0x1b | local_40 << 5) + 0x6ed9eba1
  ;
  static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator()
            ((static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<4>> *)asStack_50,&local_4c,param_2);
  uVar1 = param_2[3] ^ param_2[8] ^ param_2[0xd] ^ param_2[0xb];
  uVar3 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[0xb] = uVar3;
  uVar2 = local_48 | local_44;
  uVar1 = local_48 & local_44;
  local_44 = local_44 >> 2 | local_44 << 0x1e;
  local_3c = uVar3 + (uVar2 & local_4c | uVar1) + local_3c + (local_40 >> 0x1b | local_40 << 5) +
             -0x70e44324;
  static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator()
            ((static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<5>> *)asStack_50,&local_4c,param_2);
  uVar1 = param_2[7] ^ param_2[0xc] ^ param_2[1] ^ param_2[0xf];
  uVar1 = uVar1 >> 0x1f | uVar1 << 1;
  param_2[0xf] = uVar1;
  param_1[3] = param_1[3] + local_48;
  param_1[4] = param_1[4] + local_4c;
  param_1[1] = param_1[1] + local_40;
  param_1[2] = param_1[2] + (local_44 >> 2 | local_44 << 0x1e);
  *param_1 = *param_1 +
             uVar1 + (local_48 ^ local_44 ^ local_4c) + local_3c +
             (local_40 >> 0x1b | local_40 << 5) + 0xca62c1d6;
  if (*(long *)(lVar6 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

