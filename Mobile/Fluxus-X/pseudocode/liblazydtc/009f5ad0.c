/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5ad0
 */

/* WARNING: Type propagation algorithm not settling */

int ossl_i2c_ASN1_BIT_STRING(uint *param_1,long *param_2)

{
  byte bVar1;
  int iVar2;
  ulong uVar3;
  uint uVar4;
  ulong uVar5;
  uint uVar6;
  long lVar7;
  undefined1 *__dest;
  
  if (param_1 == (uint *)0x0) {
    return 0;
  }
  uVar4 = *param_1;
  uVar5 = (ulong)uVar4;
  if ((int)uVar4 < 1) {
LAB_009f5b70:
    uVar6 = 0;
    uVar4 = (uint)uVar5;
  }
  else {
    uVar6 = (uint)*(undefined8 *)(param_1 + 4);
    if ((uVar6 >> 3 & 1) != 0) {
joined_r0x009f5b88:
      uVar6 = uVar6 & 7;
joined_r0x009f5b98:
      iVar2 = (int)uVar5;
      goto joined_r0x009f5ba8;
    }
    lVar7 = (long)(int)uVar4 << 0x20;
    uVar3 = (long)(int)uVar4;
    do {
      uVar5 = uVar3;
      lVar7 = lVar7 + -0x100000000;
      if ((long)uVar5 < 1) break;
      uVar3 = uVar5 - 1;
    } while (*(char *)(*(long *)(param_1 + 2) + uVar5 + -1) == '\0');
    bVar1 = *(byte *)(*(long *)(param_1 + 2) + (lVar7 >> 0x20));
    if ((bVar1 & 1) != 0) goto LAB_009f5b70;
    uVar4 = (uint)uVar5;
    if ((bVar1 >> 1 & 1) != 0) {
      uVar6 = 1;
      goto joined_r0x009f5b98;
    }
    if ((bVar1 >> 2 & 1) == 0) {
      if ((bVar1 >> 3 & 1) != 0) {
        uVar6 = 3;
        goto joined_r0x009f5b98;
      }
      if ((bVar1 >> 4 & 1) == 0) {
        if ((bVar1 >> 5 & 1) != 0) {
          uVar6 = 5;
          goto joined_r0x009f5b98;
        }
        if ((bVar1 >> 6 & 1) == 0) {
          uVar6 = -(uint)(bVar1 >> 7);
          goto joined_r0x009f5b88;
        }
        uVar6 = 6;
      }
      else {
        uVar6 = 4;
      }
    }
    else {
      uVar6 = 2;
    }
  }
  iVar2 = (int)uVar5;
joined_r0x009f5ba8:
  if (param_2 != (long *)0x0) {
    __dest = (undefined1 *)*param_2 + 1;
    *(undefined1 *)*param_2 = (char)uVar6;
    if (0 < iVar2) {
      memcpy(__dest,*(void **)(param_1 + 2),(long)iVar2);
      __dest = __dest + iVar2;
      __dest[-1] = __dest[-1] & (byte)(0xff << (ulong)uVar6);
    }
    *param_2 = (long)__dest;
  }
  return uVar4 + 1;
}

