/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb780
 */

/* std::__ndk1::locale::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::locale const&) const */

bool __thiscall std::__ndk1::locale::operator==(locale *this,locale *param_1)

{
  size_t __n;
  char *pcVar1;
  size_t sVar2;
  void *__s1;
  void *__s2;
  byte bVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  
  lVar7 = *(long *)this;
  lVar6 = *(long *)param_1;
  if (lVar7 == lVar6) {
    return true;
  }
  bVar3 = *(byte *)(lVar7 + 0x120);
  __n = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    __n = *(size_t *)(lVar7 + 0x128);
  }
  if (__n == 1) {
    pcVar1 = (char *)(lVar7 + 0x121);
    if ((bVar3 & 1) != 0) {
      pcVar1 = *(char **)(lVar7 + 0x130);
    }
    if (*pcVar1 == '*') {
      return false;
    }
  }
  bVar4 = *(byte *)(lVar6 + 0x120);
  sVar2 = (ulong)(bVar4 >> 1);
  if ((bVar4 & 1) != 0) {
    sVar2 = *(size_t *)(lVar6 + 0x128);
  }
  if (__n != sVar2) {
    return false;
  }
  __s1 = (void *)(lVar7 + 0x121);
  if ((bVar3 & 1) != 0) {
    __s1 = *(void **)(lVar7 + 0x130);
  }
  __s2 = (void *)(lVar6 + 0x121);
  if ((bVar4 & 1) != 0) {
    __s2 = *(void **)(lVar6 + 0x130);
  }
  iVar5 = memcmp(__s1,__s2,__n);
  return iVar5 == 0;
}

