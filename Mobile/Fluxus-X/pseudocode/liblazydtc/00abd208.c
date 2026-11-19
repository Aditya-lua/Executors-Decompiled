/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd208
 */

uchar * OPENSSL_utf82uni(char *param_1,int param_2,uchar **param_3,int *param_4)

{
  ulong uVar1;
  int iVar2;
  size_t sVar3;
  uchar *puVar4;
  uchar *puVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  uchar *puVar9;
  ulong local_58;
  
  local_58 = 0;
  if (param_2 == -1) {
    sVar3 = strlen(param_1);
    param_2 = (int)sVar3;
  }
  iVar7 = 2;
  if (0 < param_2) {
    iVar7 = 0;
    iVar8 = 0;
    do {
      iVar2 = UTF8_getc((uchar *)(param_1 + iVar8),param_2 - iVar8,&local_58);
      if (iVar2 < 0) {
        puVar4 = OPENSSL_asc2uni(param_1,param_2,param_3,param_4);
        return puVar4;
      }
      if (0x10 < local_58 >> 0x10) {
        return (uchar *)0x0;
      }
      iVar8 = iVar2 + iVar8;
      iVar2 = 4;
      if (local_58 >> 0x10 == 0) {
        iVar2 = 2;
      }
      iVar7 = iVar2 + iVar7;
    } while (iVar8 < param_2);
    iVar7 = iVar7 + 2;
  }
  puVar4 = CRYPTO_malloc(iVar7,"crypto/pkcs12/p12_utl.c",0x7a);
  if (puVar4 == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_utl.c",0x7b,"OPENSSL_utf82uni");
    ERR_set_error(0x23,0xc0100,0);
  }
  else {
    puVar5 = puVar4;
    if (0 < param_2) {
      iVar8 = 0;
      puVar9 = puVar4;
      do {
        iVar2 = UTF8_getc((uchar *)(param_1 + iVar8),param_2 - iVar8,&local_58);
        uVar1 = local_58 - 0x10000;
        if (local_58 < 0x10000) {
          puVar5 = puVar9 + 2;
          *puVar9 = (uchar)(local_58 >> 8);
          uVar6 = (uint)(byte)local_58;
        }
        else {
          uVar6 = (int)(uVar1 >> 10) + 0xd800;
          puVar5 = puVar9 + 4;
          puVar9[2] = (byte)(uVar1 >> 8) & 3 | 0xdc;
          *puVar9 = (uchar)(uVar6 >> 8);
          puVar9[3] = (uchar)uVar1;
          local_58 = uVar1;
        }
        iVar8 = iVar2 + iVar8;
        puVar9[1] = (uchar)uVar6;
        puVar9 = puVar5;
      } while (iVar8 < param_2);
    }
    puVar5[0] = '\0';
    puVar5[1] = '\0';
    if (param_4 != (int *)0x0) {
      *param_4 = iVar7;
    }
    if (param_3 != (uchar **)0x0) {
      *param_3 = puVar4;
    }
  }
  return puVar4;
}

