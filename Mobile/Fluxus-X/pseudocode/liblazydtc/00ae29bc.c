/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae29bc
 */

int SHA512_Update(SHA512_CTX *c,void *data,size_t len)

{
  _union_314 *__dest;
  void *__dest_00;
  uint uVar1;
  ulonglong uVar2;
  ulong __n;
  size_t __n_00;
  
  if (len != 0) {
    uVar2 = c->Nh;
    __dest = &c->u;
    if (CARRY8(c->Nl,len * 8)) {
      uVar2 = uVar2 + 1;
      c->Nh = uVar2;
    }
    uVar1 = c->num;
    c->Nl = c->Nl + len * 8;
    c->Nh = uVar2 + (len >> 0x3d);
    if (uVar1 != 0) {
      __n_00 = 0x80 - (ulong)uVar1;
      __dest_00 = (void *)((long)__dest + (ulong)uVar1);
      if (len < __n_00) {
        memcpy(__dest_00,data,len);
        c->num = c->num + (int)len;
        return 1;
      }
      memcpy(__dest_00,data,__n_00);
      c->num = 0;
      len = len - __n_00;
      data = (void *)((long)data + __n_00);
      FUN_00ae1ac4(c,__dest,1);
    }
    __n = len;
    if (0x7f < len) {
      FUN_00ae1ac4(c,data,len >> 7);
      __n = len & 0x7f;
      data = (void *)((long)data + (len - __n));
    }
    if (__n != 0) {
      memcpy(__dest,data,__n);
      c->num = (uint)__n;
    }
  }
  return 1;
}

