/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a55154
 */

void ERR_add_error_vdata(int num,va_list args)

{
  long lVar1;
  long lVar2;
  char *__s;
  int iVar3;
  long lVar4;
  size_t sVar5;
  size_t sVar6;
  char *pcVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined4 uVar10;
  undefined1 *puVar11;
  char *__s_00;
  int num_00;
  int iVar12;
  
  lVar4 = ossl_err_get_state_int();
  if (lVar4 == 0) {
    return;
  }
  lVar8 = lVar4 + (long)*(int *)(lVar4 + 0x380) * 4;
  if ((~*(uint *)(lVar8 + 0x200) & 3) == 0) {
    lVar4 = lVar4 + (long)*(int *)(lVar4 + 0x380) * 8;
    __s_00 = *(char **)(lVar4 + 0x100);
    num_00 = *(int *)(lVar4 + 0x180);
    *(undefined8 *)(lVar4 + 0x100) = 0;
    *(undefined4 *)(lVar8 + 0x200) = 0;
    if (0 < num) goto LAB_00a551b8;
LAB_00a552d0:
    lVar4 = (long)num_00;
    lVar8 = ossl_err_get_state_int();
  }
  else {
    __s_00 = CRYPTO_malloc(0x51,"crypto/err/err.c",0x351);
    if (__s_00 == (char *)0x0) {
      return;
    }
    num_00 = 0x51;
    *__s_00 = '\0';
    if (num < 1) goto LAB_00a552d0;
LAB_00a551b8:
    sVar5 = strlen(__s_00);
    iVar12 = num + 1;
    do {
      iVar3 = *(int *)((long)args + 0x18);
      if ((iVar3 < 0) && (*(int *)((long)args + 0x18) = iVar3 + 8, iVar3 + 8 < 1)) {
        puVar9 = (undefined8 *)(*(long *)((long)args + 8) + (long)iVar3);
      }
      else {
        puVar9 = *(undefined8 **)args;
        *(undefined8 **)args = puVar9 + 1;
      }
      __s = "<NULL>";
      if ((char *)*puVar9 != (char *)0x0) {
        __s = (char *)*puVar9;
      }
      sVar6 = strlen(__s);
      sVar5 = sVar6 + (long)(int)sVar5;
      if (num_00 <= (int)sVar5) {
        num_00 = (int)sVar5 + 0x14;
        pcVar7 = CRYPTO_realloc(__s_00,num_00,"crypto/err/err.c",0x361);
        if (pcVar7 == (char *)0x0) goto LAB_00a5536c;
        __s_00 = pcVar7;
      }
      lVar4 = (long)num_00;
      OPENSSL_strlcat(__s_00,__s,lVar4);
      iVar12 = iVar12 + -1;
    } while (1 < iVar12);
    lVar8 = ossl_err_get_state_int();
  }
  if (lVar8 == 0) {
LAB_00a5536c:
    CRYPTO_free(__s_00);
    return;
  }
  lVar1 = lVar8 + (long)*(int *)(lVar8 + 0x380) * 4;
  lVar2 = lVar8 + (long)*(int *)(lVar8 + 0x380) * 8;
  puVar9 = (undefined8 *)(lVar2 + 0x100);
  if ((*(byte *)(lVar1 + 0x200) & 1) == 0) {
    uVar10 = 0;
    *puVar9 = 0;
    *(undefined8 *)(lVar2 + 0x180) = 0;
  }
  else {
    puVar11 = (undefined1 *)*puVar9;
    if (puVar11 == (undefined1 *)0x0) goto LAB_00a55304;
    *puVar11 = 0;
    uVar10 = 1;
  }
  *(undefined4 *)(lVar1 + 0x200) = uVar10;
LAB_00a55304:
  lVar1 = lVar8 + (long)*(int *)(lVar8 + 0x380) * 4;
  lVar8 = lVar8 + (long)*(int *)(lVar8 + 0x380) * 8;
  puVar9 = (undefined8 *)(lVar8 + 0x100);
  if ((*(byte *)(lVar1 + 0x200) & 1) != 0) {
    CRYPTO_free((void *)*puVar9);
  }
  *puVar9 = __s_00;
  *(long *)(lVar8 + 0x180) = lVar4;
  *(undefined4 *)(lVar1 + 0x200) = 3;
  return;
}

