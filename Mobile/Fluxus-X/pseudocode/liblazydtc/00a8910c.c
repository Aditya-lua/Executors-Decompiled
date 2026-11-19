/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8910c
 */

int AES_set_encrypt_key(uchar *userKey,int bits,AES_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  long lVar6;
  uint uVar7;
  
  iVar5 = -1;
  if ((userKey != (uchar *)0x0) && (key != (AES_KEY *)0x0)) {
    if ((bits != 0x80) && ((bits != 0x100 && (bits != 0xc0)))) {
      return -2;
    }
    if (bits == 0x80) {
      iVar5 = 10;
    }
    else if (bits == 0xc0) {
      iVar5 = 0xc;
    }
    else {
      iVar5 = 0xe;
    }
    key->rounds = iVar5;
    uVar7 = (*(uint *)userKey & 0xff00ff00) >> 8 | (*(uint *)userKey & 0xff00ff) << 8;
    uVar7 = uVar7 >> 0x10 | uVar7 << 0x10;
    key->rd_key[0] = uVar7;
    uVar4 = (*(uint *)(userKey + 4) & 0xff00ff00) >> 8 | (*(uint *)(userKey + 4) & 0xff00ff) << 8;
    key->rd_key[1] = uVar4 >> 0x10 | uVar4 << 0x10;
    uVar4 = (*(uint *)(userKey + 8) & 0xff00ff00) >> 8 | (*(uint *)(userKey + 8) & 0xff00ff) << 8;
    key->rd_key[2] = uVar4 >> 0x10 | uVar4 << 0x10;
    uVar4 = (*(uint *)(userKey + 0xc) & 0xff00ff00) >> 8 |
            (*(uint *)(userKey + 0xc) & 0xff00ff) << 8;
    key->rd_key[3] = uVar4 >> 0x10 | uVar4 << 0x10;
    if (bits == 0x80) {
      lVar6 = 0;
      do {
        uVar2 = key->rd_key[3];
        uVar7 = *(uint *)(&DAT_00767278 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) & 0xff000000 ^ uVar7 ^
                *(uint *)(&DAT_00767678 + (ulong)(uVar2 >> 8 & 0xff) * 4) & 0xff0000 ^
                *(uint *)(&DAT_00767a78 + ((ulong)uVar2 & 0xff) * 4) & 0xff00 ^
                (uint)(byte)(&DAT_00767e78)[(ulong)(uVar2 >> 0x18) * 4] ^
                *(uint *)((long)&DAT_00768278 + lVar6);
        uVar1 = key->rd_key[2];
        lVar6 = lVar6 + 4;
        uVar4 = key->rd_key[1] ^ uVar7;
        ((AES_KEY *)(key->rd_key + 4))->rd_key[0] = uVar7;
        key->rd_key[5] = uVar4;
        uVar1 = uVar1 ^ uVar4;
        key->rd_key[6] = uVar1;
        key->rd_key[7] = uVar1 ^ uVar2;
        key = (AES_KEY *)(key->rd_key + 4);
      } while (lVar6 != 0x28);
    }
    else {
      uVar4 = (*(uint *)(userKey + 0x10) & 0xff00ff00) >> 8 |
              (*(uint *)(userKey + 0x10) & 0xff00ff) << 8;
      key->rd_key[4] = uVar4 >> 0x10 | uVar4 << 0x10;
      uVar4 = (*(uint *)(userKey + 0x14) & 0xff00ff00) >> 8 |
              (*(uint *)(userKey + 0x14) & 0xff00ff) << 8;
      key->rd_key[5] = uVar4 >> 0x10 | uVar4 << 0x10;
      if (bits == 0xc0) {
        lVar6 = 0;
        while( true ) {
          uVar3 = key->rd_key[5];
          uVar7 = *(uint *)(&DAT_00767278 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) & 0xff000000 ^ uVar7
                  ^ *(uint *)(&DAT_00767678 + (ulong)(uVar3 >> 8 & 0xff) * 4) & 0xff0000 ^
                  *(uint *)(&DAT_00767a78 + ((ulong)uVar3 & 0xff) * 4) & 0xff00 ^
                  (uint)(byte)(&DAT_00767e78)[(ulong)(uVar3 >> 0x18) * 4] ^
                  *(uint *)((long)&DAT_00768278 + lVar6);
          uVar4 = key->rd_key[3];
          uVar1 = key->rd_key[1] ^ uVar7;
          uVar2 = key->rd_key[2] ^ uVar1;
          ((AES_KEY *)(key->rd_key + 6))->rd_key[0] = uVar7;
          key->rd_key[7] = uVar1;
          uVar4 = uVar4 ^ uVar2;
          key->rd_key[8] = uVar2;
          key->rd_key[9] = uVar4;
          if (lVar6 == 0x1c) break;
          lVar6 = lVar6 + 4;
          uVar4 = key->rd_key[4] ^ uVar4;
          key->rd_key[10] = uVar4;
          key->rd_key[0xb] = uVar4 ^ uVar3;
          key = (AES_KEY *)(key->rd_key + 6);
        }
      }
      else {
        uVar4 = (*(uint *)(userKey + 0x18) & 0xff00ff00) >> 8 |
                (*(uint *)(userKey + 0x18) & 0xff00ff) << 8;
        key->rd_key[6] = uVar4 >> 0x10 | uVar4 << 0x10;
        uVar4 = (*(uint *)(userKey + 0x1c) & 0xff00ff00) >> 8 |
                (*(uint *)(userKey + 0x1c) & 0xff00ff) << 8;
        key->rd_key[7] = uVar4 >> 0x10 | uVar4 << 0x10;
        if (bits != 0x100) {
          return 0;
        }
        lVar6 = 0;
        while( true ) {
          uVar3 = key->rd_key[7];
          uVar7 = *(uint *)(&DAT_00767278 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) & 0xff000000 ^ uVar7
                  ^ *(uint *)(&DAT_00767678 + (ulong)(uVar3 >> 8 & 0xff) * 4) & 0xff0000 ^
                  *(uint *)(&DAT_00767a78 + ((ulong)uVar3 & 0xff) * 4) & 0xff00 ^
                  (uint)(byte)(&DAT_00767e78)[(ulong)(uVar3 >> 0x18) * 4] ^
                  *(uint *)((long)&DAT_00768278 + lVar6);
          uVar2 = key->rd_key[3];
          uVar4 = key->rd_key[1] ^ uVar7;
          uVar1 = key->rd_key[2] ^ uVar4;
          ((AES_KEY *)(key->rd_key + 8))->rd_key[0] = uVar7;
          key->rd_key[9] = uVar4;
          uVar2 = uVar2 ^ uVar1;
          key->rd_key[10] = uVar1;
          key->rd_key[0xb] = uVar2;
          if (lVar6 == 0x18) break;
          uVar4 = *(uint *)(&DAT_00767278 + (ulong)(uVar2 >> 0x18) * 4) & 0xff000000 ^
                  key->rd_key[4] ^
                  *(uint *)(&DAT_00767678 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) & 0xff0000 ^
                  *(uint *)(&DAT_00767a78 + (ulong)(uVar2 >> 8 & 0xff) * 4) & 0xff00 ^
                  (uint)(byte)(&DAT_00767e78)[(ulong)(uVar2 & 0xff) * 4];
          uVar1 = key->rd_key[5] ^ uVar4;
          key->rd_key[0xc] = uVar4;
          key->rd_key[0xd] = uVar1;
          lVar6 = lVar6 + 4;
          uVar1 = key->rd_key[6] ^ uVar1;
          key->rd_key[0xe] = uVar1;
          key->rd_key[0xf] = uVar1 ^ uVar3;
          key = (AES_KEY *)(key->rd_key + 8);
        }
      }
    }
    iVar5 = 0;
  }
  return iVar5;
}

