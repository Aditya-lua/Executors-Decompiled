
/* WARNING: Removing unreachable block (ram,0x0013aec8) */

bool FUN_0013ae54(long param_1,long param_2)

{
  byte bVar1;
  undefined *puVar2;
  uint uVar3;
  int in_w9;
  int in_w11;
  long *unaff_x20;
  
  puVar2 = PTR___DefaultRuneLocale_009b0028;
  if (in_w9 <= in_w11) {
    return true;
  }
  if (*(char *)(param_2 + 0x5e) != '\0') {
    param_1 = param_1 + (long)in_w11 * 0xc;
    return *(int *)(param_1 + 4) != *(int *)(param_1 + -8);
  }
  bVar1 = *(byte *)(param_1 + (long)in_w11 * 0xc);
  if ((char)bVar1 < '\0') {
    uVar3 = ___maskrune((ulong)bVar1,0x4000);
    bVar1 = *(byte *)(*unaff_x20 + (long)in_w11 * 0xc + -0xc);
  }
  else {
    uVar3 = *(uint *)(PTR___DefaultRuneLocale_009b0028 + (ulong)bVar1 * 4 + 0x3c) & 0x4000;
    bVar1 = *(byte *)(param_1 + (long)in_w11 * 0xc + -0xc);
  }
  return (uVar3 != 0) != ((*(uint *)(puVar2 + (ulong)bVar1 * 4 + 0x3c) & 0x4000) != 0);
}

