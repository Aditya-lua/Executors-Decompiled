/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0034
 */

int UTF8_getc(uchar *str,int len,ulong *val)

{
  byte bVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  
  if (len < 1) {
    return 0;
  }
  bVar1 = *str;
  if (-1 < (char)bVar1) {
    *val = (ulong)(bVar1 & 0x7f);
    return 1;
  }
  if ((bVar1 & 0xe0) == 0xc0) {
    if (len < 2) {
      return -1;
    }
    if ((str[1] & 0xc0) != 0x80) {
      return -3;
    }
    uVar3 = (ulong)((bVar1 & 0x1f) << 6) | (ulong)str[1] & 0x3f;
    if (uVar3 < 0x80) {
      return -4;
    }
    *val = uVar3;
    return 2;
  }
  uVar2 = (uint)bVar1;
  if ((uVar2 & 0xf0) == 0xe0) {
    if (len < 3) {
      return -1;
    }
    if ((str[1] & 0xc0) != 0x80) {
      return -3;
    }
    if ((str[2] & 0xc0) != 0x80) {
      return -3;
    }
    uVar5 = (ulong)((uVar2 & 0xf) << 0xc);
    uVar3 = ((ulong)str[1] & 0x3f) << 6;
    uVar4 = uVar5 | uVar3 | (ulong)str[2] & 0x3f;
    if (uVar4 < 0x800) {
      return -4;
    }
    if ((uVar5 | uVar3 & 0x800) == 0xd800) {
      return -2;
    }
    *val = uVar4;
    return 3;
  }
  if ((uVar2 & 0xf8) != 0xf0) {
    return -2;
  }
  if (len < 4) {
    return -1;
  }
  if ((str[1] & 0xc0) != 0x80) {
    return -3;
  }
  if ((str[2] & 0xc0) != 0x80) {
    return -3;
  }
  if ((str[3] & 0xc0) != 0x80) {
    return -3;
  }
  uVar3 = (ulong)((uVar2 & 7) << 0x12) | ((ulong)str[1] & 0x3f) << 0xc | ((ulong)str[2] & 0x3f) << 6
          | (ulong)str[3] & 0x3f;
  if (uVar3 < 0x10000) {
    return -4;
  }
  *val = uVar3;
  return 4;
}

