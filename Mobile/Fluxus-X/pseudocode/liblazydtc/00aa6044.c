/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6044
 */

int MD5_Update(MD5_CTX *c,void *data,size_t len)

{
  uint uVar1;
  uint *__s;
  uint uVar2;
  ulong uVar3;
  size_t __n;
  
  if (len != 0) {
    uVar2 = c->Nh;
    uVar1 = (int)len * 8;
    if (CARRY4(c->Nl,uVar1)) {
      uVar2 = uVar2 + 1;
      c->Nh = uVar2;
    }
    uVar3 = (ulong)c->num;
    c->Nl = c->Nl + uVar1;
    c->Nh = uVar2 + (int)(len >> 0x1d);
    if (c->num != 0) {
      __s = c->data;
      if ((uVar3 + len | len) < 0x40) {
        memcpy((void *)((long)__s + uVar3),data,len);
        c->num = c->num + (int)len;
        return 1;
      }
      __n = 0x40 - uVar3;
      memcpy((void *)((long)__s + uVar3),data,__n);
      md5_block_data_order(c,__s,1);
      data = (void *)((long)data + __n);
      len = len - __n;
      memset(__s,0,0x44);
    }
    if (len >> 6 != 0) {
      md5_block_data_order(c,data);
      data = (void *)((long)data + (len & 0xffffffffffffffc0));
      len = len - (len & 0xffffffffffffffc0);
    }
    if (len != 0) {
      c->num = (uint)len;
      memcpy(c->data,data,len);
    }
  }
  return 1;
}

