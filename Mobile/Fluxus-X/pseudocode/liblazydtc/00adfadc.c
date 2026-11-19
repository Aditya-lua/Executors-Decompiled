/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adfadc
 */

int SHA256_Final(uchar *md,SHA256_CTX *c)

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
    FUN_00adfe04(c,ptr,1);
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
  FUN_00adfe04(c,ptr,1);
  c->num = 0;
  OPENSSL_cleanse(ptr,0x40);
  uVar2 = c->md_len;
  if (uVar2 == 0x1c) {
    uVar2 = c->h[0];
    *md = (uchar)(uVar2 >> 0x18);
    md[3] = (uchar)uVar2;
    md[1] = (uchar)(uVar2 >> 0x10);
    md[2] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[1];
    md[4] = (uchar)(uVar2 >> 0x18);
    md[7] = (uchar)uVar2;
    md[5] = (uchar)(uVar2 >> 0x10);
    md[6] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[2];
    md[8] = (uchar)(uVar2 >> 0x18);
    md[0xb] = (uchar)uVar2;
    md[9] = (uchar)(uVar2 >> 0x10);
    md[10] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[3];
    md[0xc] = (uchar)(uVar2 >> 0x18);
    md[0xf] = (uchar)uVar2;
    md[0xd] = (uchar)(uVar2 >> 0x10);
    md[0xe] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[4];
    md[0x10] = (uchar)(uVar2 >> 0x18);
    md[0x13] = (uchar)uVar2;
    md[0x11] = (uchar)(uVar2 >> 0x10);
    md[0x12] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[5];
    md[0x14] = (uchar)(uVar2 >> 0x18);
    md[0x17] = (uchar)uVar2;
    md[0x15] = (uchar)(uVar2 >> 0x10);
    md[0x16] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[6];
    md[0x1b] = (uchar)uVar2;
    md[0x18] = (uchar)(uVar2 >> 0x18);
    md[0x19] = (uchar)(uVar2 >> 0x10);
    md[0x1a] = (uchar)(uVar2 >> 8);
  }
  else if (uVar2 == 0x20) {
    uVar2 = c->h[0];
    *md = (uchar)(uVar2 >> 0x18);
    md[3] = (uchar)uVar2;
    md[1] = (uchar)(uVar2 >> 0x10);
    md[2] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[1];
    md[4] = (uchar)(uVar2 >> 0x18);
    md[7] = (uchar)uVar2;
    md[5] = (uchar)(uVar2 >> 0x10);
    md[6] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[2];
    md[8] = (uchar)(uVar2 >> 0x18);
    md[0xb] = (uchar)uVar2;
    md[9] = (uchar)(uVar2 >> 0x10);
    md[10] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[3];
    md[0xc] = (uchar)(uVar2 >> 0x18);
    md[0xf] = (uchar)uVar2;
    md[0xd] = (uchar)(uVar2 >> 0x10);
    md[0xe] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[4];
    md[0x10] = (uchar)(uVar2 >> 0x18);
    md[0x13] = (uchar)uVar2;
    md[0x11] = (uchar)(uVar2 >> 0x10);
    md[0x12] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[5];
    md[0x14] = (uchar)(uVar2 >> 0x18);
    md[0x17] = (uchar)uVar2;
    md[0x15] = (uchar)(uVar2 >> 0x10);
    md[0x16] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[6];
    md[0x18] = (uchar)(uVar2 >> 0x18);
    md[0x1b] = (uchar)uVar2;
    md[0x19] = (uchar)(uVar2 >> 0x10);
    md[0x1a] = (uchar)(uVar2 >> 8);
    uVar2 = c->h[7];
    md[0x1f] = (uchar)uVar2;
    md[0x1c] = (uchar)(uVar2 >> 0x18);
    md[0x1d] = (uchar)(uVar2 >> 0x10);
    md[0x1e] = (uchar)(uVar2 >> 8);
  }
  else {
    if (0x20 < uVar2) {
      return 0;
    }
    if (3 < uVar2) {
      uVar3 = 0;
      do {
        uVar2 = c->h[uVar3];
        uVar3 = uVar3 + 1;
        *md = (uchar)(uVar2 >> 0x18);
        md[1] = (uchar)(uVar2 >> 0x10);
        md[2] = (uchar)(uVar2 >> 8);
        md[3] = (uchar)uVar2;
        md = md + 4;
      } while (uVar3 < c->md_len >> 2);
    }
  }
  return 1;
}

