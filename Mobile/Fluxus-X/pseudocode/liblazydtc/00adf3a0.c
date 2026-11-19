/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adf3a0
 */

int SHA1_Final(uchar *md,SHA_CTX *c)

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
    FUN_00ade188(c,ptr,1);
    lVar4 = 0;
  }
  memset((void *)((long)ptr + lVar4),0,0x38 - lVar4);
  uVar2 = c->Nl;
  uVar1 = c->Nh;
  *(char *)(c->data + 0xe) = (char)(uVar1 >> 0x18);
  *(char *)((long)c->data + 0x3b) = (char)uVar1;
  *(char *)((long)c->data + 0x3a) = (char)(uVar1 >> 8);
  *(char *)(c->data + 0xf) = (char)(uVar2 >> 0x18);
  *(char *)((long)c->data + 0x3d) = (char)(uVar2 >> 0x10);
  *(char *)((long)c->data + 0x39) = (char)(uVar1 >> 0x10);
  *(char *)((long)c->data + 0x3e) = (char)(uVar2 >> 8);
  *(char *)((long)c->data + 0x3f) = (char)uVar2;
  FUN_00ade188(c,ptr,1);
  c->num = 0;
  OPENSSL_cleanse(ptr,0x40);
  uVar2 = c->h0;
  *md = (uchar)(uVar2 >> 0x18);
  md[3] = (uchar)uVar2;
  md[1] = (uchar)(uVar2 >> 0x10);
  md[2] = (uchar)(uVar2 >> 8);
  uVar2 = c->h1;
  md[4] = (uchar)(uVar2 >> 0x18);
  md[7] = (uchar)uVar2;
  md[5] = (uchar)(uVar2 >> 0x10);
  md[6] = (uchar)(uVar2 >> 8);
  uVar2 = c->h2;
  md[8] = (uchar)(uVar2 >> 0x18);
  md[0xb] = (uchar)uVar2;
  md[9] = (uchar)(uVar2 >> 0x10);
  md[10] = (uchar)(uVar2 >> 8);
  uVar2 = c->h3;
  md[0xc] = (uchar)(uVar2 >> 0x18);
  md[0xf] = (uchar)uVar2;
  md[0xd] = (uchar)(uVar2 >> 0x10);
  md[0xe] = (uchar)(uVar2 >> 8);
  uVar2 = c->h4;
  md[0x10] = (uchar)(uVar2 >> 0x18);
  md[0x11] = (uchar)(uVar2 >> 0x10);
  md[0x12] = (uchar)(uVar2 >> 8);
  md[0x13] = (uchar)uVar2;
  return 1;
}

