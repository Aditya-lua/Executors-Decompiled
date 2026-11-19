/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a55864
 */

void ERR_vset_error(uint param_1,uint param_2,char *param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  char *pcVar6;
  undefined4 uVar7;
  long lVar8;
  undefined1 *puVar9;
  undefined4 uVar10;
  ulong n;
  char *buf;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  
  lVar5 = ossl_err_get_state_int();
  if (lVar5 == 0) {
    return;
  }
  lVar8 = (long)*(int *)(lVar5 + 0x380);
  if (param_3 == (char *)0x0) {
    n = 0;
    uVar10 = 0;
    buf = (char *)0x0;
  }
  else {
    lVar2 = lVar5 + lVar8 * 8;
    n = *(ulong *)(lVar2 + 0x180);
    buf = *(char **)(lVar2 + 0x100);
    *(undefined8 *)(lVar2 + 0x100) = 0;
    *(undefined4 *)(lVar5 + lVar8 * 4 + 0x200) = 0;
    if (n < 0x400) {
      pcVar6 = CRYPTO_realloc(buf,0x400,"crypto/err/err_blocks.c",0x54);
      if (pcVar6 != (char *)0x0) {
        n = 0x400;
        buf = pcVar6;
      }
    }
    if (buf == (char *)0x0) {
      uVar4 = 0;
    }
    else {
      uStack_58 = param_4[3];
      local_60 = param_4[2];
      uStack_68 = param_4[1];
      local_70 = *param_4;
      uVar4 = BIO_vsnprintf(buf,n,param_3,&local_70);
      uVar4 = uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU);
      buf[uVar4] = '\0';
    }
    pcVar6 = CRYPTO_realloc(buf,uVar4 + 1,"crypto/err/err_blocks.c",0x67);
    if (pcVar6 != (char *)0x0) {
      pcVar6[uVar4] = '\0';
      n = (ulong)(uVar4 + 1);
      buf = pcVar6;
    }
    lVar8 = (long)*(int *)(lVar5 + 0x380);
    uVar10 = 0;
    if (buf != (char *)0x0) {
      uVar10 = 3;
    }
  }
  lVar2 = lVar5 + lVar8 * 4;
  lVar8 = lVar5 + lVar8 * 8;
  puVar1 = (undefined8 *)(lVar8 + 0x100);
  if ((*(byte *)(lVar2 + 0x200) & 1) == 0) {
    uVar7 = 0;
    *puVar1 = 0;
    *(undefined8 *)(lVar8 + 0x180) = 0;
  }
  else {
    puVar9 = (undefined1 *)*puVar1;
    if (puVar9 == (undefined1 *)0x0) goto LAB_00a559ac;
    *puVar9 = 0;
    uVar7 = 1;
  }
  *(undefined4 *)(lVar2 + 0x200) = uVar7;
LAB_00a559ac:
  lVar8 = (long)*(int *)(lVar5 + 0x380);
  if (param_1 == 2) {
    param_2 = param_2 | 0x80000000;
  }
  else {
    param_2 = param_2 & 0x7fffff | (param_1 & 0xff) << 0x17;
  }
  lVar2 = lVar5 + lVar8 * 8;
  *(ulong *)(lVar2 + 0x80) = (ulong)param_2;
  if (param_3 != (char *)0x0) {
    lVar3 = lVar5 + lVar8 * 4;
    puVar1 = (undefined8 *)(lVar2 + 0x100);
    if ((*(byte *)(lVar3 + 0x200) & 1) != 0) {
      CRYPTO_free((void *)*puVar1);
    }
    *puVar1 = buf;
    *(ulong *)(lVar5 + lVar8 * 8 + 0x180) = n;
    *(undefined4 *)(lVar3 + 0x200) = uVar10;
  }
  return;
}

