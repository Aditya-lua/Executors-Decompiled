/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6b5c
 */

int MD5_Final(uchar *md,MD5_CTX *c)

{
  uint *ptr;
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  
  uVar2 = c->num;
  uVar3 = (ulong)uVar2;
  ptr = c->data;
  *(undefined1 *)((long)ptr + uVar3) = 0x80;
  lVar4 = uVar3 + 1;
  if (0x37 < uVar2) {
    memset((void *)((long)ptr + lVar4),0,0x3f - uVar3);
    md5_block_data_order(c,ptr,1);
    lVar4 = 0;
  }
  memset((void *)((long)ptr + lVar4),0,0x38 - lVar4);
  uVar2 = c->Nl;
  uVar1 = c->Nh;
  *(char *)((long)c->data + 0x39) = (char)(uVar2 >> 8);
  *(char *)(c->data + 0xe) = (char)uVar2;
  *(char *)((long)c->data + 0x3b) = (char)(uVar2 >> 0x18);
  *(char *)(c->data + 0xf) = (char)uVar1;
  *(char *)((long)c->data + 0x3d) = (char)(uVar1 >> 8);
  *(char *)((long)c->data + 0x3a) = (char)(uVar2 >> 0x10);
  *(char *)((long)c->data + 0x3e) = (char)(uVar1 >> 0x10);
  *(char *)((long)c->data + 0x3f) = (char)(uVar1 >> 0x18);
  md5_block_data_order(c,ptr,1);
  c->num = 0;
  OPENSSL_cleanse(ptr,0x40);
  uVar2 = c->A;
  *md = (uchar)uVar2;
  md[1] = (uchar)(uVar2 >> 8);
  md[2] = (uchar)(uVar2 >> 0x10);
  md[3] = (uchar)(uVar2 >> 0x18);
  uVar2 = c->B;
  md[4] = (uchar)uVar2;
  md[5] = (uchar)(uVar2 >> 8);
  md[6] = (uchar)(uVar2 >> 0x10);
  md[7] = (uchar)(uVar2 >> 0x18);
  uVar2 = c->C;
  md[8] = (uchar)uVar2;
  md[9] = (uchar)(uVar2 >> 8);
  md[10] = (uchar)(uVar2 >> 0x10);
  md[0xb] = (uchar)(uVar2 >> 0x18);
  uVar2 = c->D;
  md[0xc] = (uchar)uVar2;
  md[0xd] = (uchar)(uVar2 >> 8);
  md[0xe] = (uchar)(uVar2 >> 0x10);
  md[0xf] = (uchar)(uVar2 >> 0x18);
  return 1;
}

