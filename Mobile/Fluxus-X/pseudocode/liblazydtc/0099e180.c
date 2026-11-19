/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099e180
 */

/* WebSocketHandshakeKeyGen::generate(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, char*) */

void WebSocketHandshakeKeyGen::generate(basic_string_conflict *param_1,char *param_2)

{
  char cVar1;
  char cVar2;
  uint uVar3;
  undefined1 uVar4;
  byte bVar5;
  long lVar6;
  byte bVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  basic_string_conflict *__src;
  uint uVar16;
  char *pcVar17;
  uint local_f0 [17];
  uint uStack_ac;
  uint uStack_a8;
  uint uStack_a4;
  uint local_a0;
  uint uStack_9c;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  char acStack_80 [16];
  undefined4 local_70;
  undefined1 uStack_6c;
  undefined1 uStack_6b;
  undefined2 uStack_6a;
  undefined8 uStack_68;
  undefined4 local_60;
  uint local_58 [6];
  undefined1 local_40;
  long local_38;
  
  lVar6 = tpidr_el0;
  local_38 = *(long *)(lVar6 + 0x28);
  local_40 = 0;
  local_58[4] = 0;
  local_58[5] = 0;
  local_58[2] = 0;
  local_58[3] = 0;
  local_58[0] = 0;
  local_58[1] = 0;
  __src = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    __src = param_1 + 1;
  }
  strncpy((char *)local_58,(char *)__src,0x18);
  uStack_98 = 0x4146413532353845;
  local_60 = 0xc3d2e1f0;
  uVar16 = (local_58[0] & 0xff00ff00) >> 8 | (local_58[0] & 0xff00ff) << 8;
  uVar3 = (local_58[1] & 0xff00ff00) >> 8 | (local_58[1] & 0xff00ff) << 8;
  stack0xffffffffffffff50 = CONCAT44(uVar3 >> 0x10 | uVar3 << 0x10,uVar16 >> 0x10 | uVar16 << 0x10);
  uStack_88 = 0x3543412d44412d39;
  local_90 = 0x342d34372d453931;
  builtin_strncpy(acStack_80,"BA5C8CD011B5",0xd);
  acStack_80[0xd] = '\0';
  acStack_80[0xe] = '\0';
  acStack_80[0xf] = -0x80;
  uVar16 = (local_58[2] & 0xff00ff00) >> 8 | (local_58[2] & 0xff00ff) << 8;
  uVar3 = (local_58[3] & 0xff00ff00) >> 8 | (local_58[3] & 0xff00ff) << 8;
  _uStack_a8 = CONCAT44(uVar3 >> 0x10 | uVar3 << 0x10,uVar16 >> 0x10 | uVar16 << 0x10);
  local_40 = 0;
  uVar16 = (local_58[4] & 0xff00ff00) >> 8 | (local_58[4] & 0xff00ff) << 8;
  uVar3 = (local_58[5] & 0xff00ff00) >> 8 | (local_58[5] & 0xff00ff) << 8;
  uStack_68 = 0x1032547698badcfe;
  _local_70 = 0xefcdab8967452301;
  _local_a0 = CONCAT44(uVar3 >> 0x10 | uVar3 << 0x10,uVar16 >> 0x10 | uVar16 << 0x10);
  sha1(&local_70,local_f0 + 0x10);
  local_f0[6] = 0;
  local_f0[7] = 0;
  local_f0[4] = 0;
  local_f0[5] = 0;
  local_f0[10] = 0;
  local_f0[0xb] = 0;
  local_f0[8] = 0;
  local_f0[9] = 0;
  local_f0[2] = 0;
  local_f0[3] = 0;
  local_f0[0] = 0;
  local_f0[1] = 0;
  local_f0[0xc] = 0;
  local_f0[0xd] = 0;
  local_f0[0xe] = 0;
  local_f0[0xf] = 0x1e0;
  sha1(&local_70,local_f0);
  uVar3 = local_60;
  uVar14 = uStack_68;
  uVar13 = _local_70;
  uVar4 = (undefined1)_local_70;
  uVar16 = local_70 >> 0x18;
  uVar15 = (ulong)_local_70 >> 8;
  uVar8 = (ulong)_local_70 >> 0x10;
  uVar9 = (ulong)_local_70 >> 0x18;
  uVar10 = (ulong)_local_70 >> 0x20;
  uVar11 = (ulong)_local_70 >> 0x28;
  uVar12 = (ulong)_local_70 >> 0x38;
  _local_70 = CONCAT26(CONCAT11((char)uVar10,(char)uVar11),
                       CONCAT15((char)((ulong)uVar13 >> 0x30),
                                CONCAT14((char)uVar12,
                                         CONCAT31(CONCAT21(CONCAT11(uVar4,(char)uVar15),(char)uVar8)
                                                  ,(char)uVar9))));
  uVar4 = (undefined1)uStack_68;
  uVar15 = (ulong)uStack_68 >> 8;
  uStack_68._0_2_ = CONCAT11((char)((ulong)uStack_68 >> 0x10),(char)((ulong)uStack_68 >> 0x18));
  uStack_68 = CONCAT26(CONCAT11((char)((ulong)uVar14 >> 0x20),(char)((ulong)uVar14 >> 0x28)),
                       CONCAT15((char)((ulong)uVar14 >> 0x30),
                                CONCAT14((char)((ulong)uVar14 >> 0x38),
                                         CONCAT22(CONCAT11(uVar4,(char)uVar15),(undefined2)uStack_68
                                                 ))));
  bVar7 = (byte)local_60;
  bVar5 = (byte)(local_60 >> 8);
  local_60._0_2_ = CONCAT11((char)(local_60 >> 0x10),(char)(local_60 >> 0x18));
  local_60 = CONCAT22(CONCAT11(bVar7,bVar5),(undefined2)local_60);
  uVar15 = 0;
  pcVar17 = param_2;
  while( true ) {
    *pcVar17 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[uVar16 >> 2];
    pcVar17[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                 [(uint)((byte)acStack_80[uVar15 + 0x11] >> 4) |
                  ((byte)acStack_80[uVar15 + 0x10] & 3) << 4];
    pcVar17[2] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                 [(uint)((byte)acStack_80[uVar15 + 0x12] >> 6) |
                  ((byte)acStack_80[uVar15 + 0x11] & 0xf) << 2];
    pcVar17[3] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                 [(ulong)(byte)acStack_80[uVar15 + 0x12] & 0x3f];
    if (0x11 < uVar15 + 3) break;
    uVar16 = (uint)(byte)acStack_80[uVar15 + 0x13];
    pcVar17 = pcVar17 + 4;
    uVar15 = uVar15 + 3;
  }
  param_2[0x18] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[bVar5 >> 2];
  cVar1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[(uVar3 & 0xf) << 2];
  cVar2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
          [(uint)(bVar7 >> 4) | (bVar5 & 3) << 4];
  param_2[0x1b] = '=';
  param_2[0x1a] = cVar1;
  param_2[0x19] = cVar2;
  if (*(long *)(lVar6 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

