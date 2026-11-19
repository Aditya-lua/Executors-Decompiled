/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f01e8
 */

int UTF8_putc(uchar *str,int len,ulong value)

{
  byte bVar1;
  uint uVar2;
  int iVar3;
  
  uVar2 = (uint)value;
  bVar1 = (byte)value;
  if (str == (uchar *)0x0) {
    len = 4;
  }
  else if (len < 1) {
    return -1;
  }
  if (value < 0x80) {
    if (str == (uchar *)0x0) {
      return 1;
    }
    *str = bVar1;
    return 1;
  }
  if (value < 0x800) {
    iVar3 = 2;
    if (len < 2) {
      iVar3 = -1;
    }
    else if (str != (uchar *)0x0) {
      *str = (byte)(uVar2 >> 6) & 0x1f | 0xc0;
      str[1] = bVar1 & 0x3f | 0x80;
      return 2;
    }
  }
  else if (value >> 0x10 == 0) {
    if (value >> 0xb == 0x1b) {
      return -2;
    }
    iVar3 = 3;
    if (len < 3) {
      iVar3 = -1;
    }
    else if (str != (uchar *)0x0) {
      *str = (byte)(uVar2 >> 0xc) & 0xf | 0xe0;
      str[1] = (byte)(uVar2 >> 6) & 0x3f | 0x80;
      str[2] = bVar1 & 0x3f | 0x80;
      return 3;
    }
  }
  else {
    if (0x10 < value >> 0x10) {
      return -2;
    }
    iVar3 = 4;
    if (len < 4) {
      iVar3 = -1;
    }
    else if (str != (uchar *)0x0) {
      *str = (byte)(uVar2 >> 0x12) & 7 | 0xf0;
      iVar3 = 4;
      str[1] = (byte)(uVar2 >> 0xc) & 0x3f | 0x80;
      str[2] = (byte)(uVar2 >> 6) & 0x3f | 0x80;
      str[3] = bVar1 & 0x3f | 0x80;
    }
  }
  return iVar3;
}

