/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b41650
 */

uint FUN_00b41650(BIO *param_1,char *param_2,BIGNUM *param_3)

{
  char *pcVar1;
  char *param4;
  byte *pbVar2;
  byte bVar3;
  bool bVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  ulong *puVar9;
  byte *ptr;
  uint uVar10;
  char *pcVar11;
  undefined4 local_68;
  undefined1 local_64;
  
  local_64 = 0;
  local_68 = 0x20202020;
  if (param_3 == (BIGNUM *)0x0) {
    return 0;
  }
  pcVar11 = "";
  if (param_2 != (char *)0x0) {
    pcVar11 = param_2;
  }
  pcVar1 = "";
  if (param_2 != (char *)0x0) {
    pcVar1 = " ";
  }
  iVar5 = BN_is_zero(param_3);
  if (iVar5 != 0) {
    uVar6 = BIO_printf(param_1,"%s%s0\n",pcVar11,pcVar1);
    return uVar6;
  }
  iVar5 = BN_num_bits(param_3);
  if (iVar5 < 0x41) {
    puVar9 = (ulong *)bn_get_words(param_3);
    iVar5 = BN_is_negative(param_3);
    param4 = "";
    if (iVar5 != 0) {
      param4 = "-";
    }
    uVar6 = BIO_printf(param_1,"%s%s%s%lu (%s0x%lx)\n",pcVar11,pcVar1,param4,*puVar9,param4,*puVar9)
    ;
    return uVar6;
  }
  ptr = (byte *)BN_bn2hex(param_3);
  if (ptr == (byte *)0x0) {
    return 0;
  }
  bVar4 = *ptr == 0x2d;
  pbVar2 = ptr + 1;
  if (!bVar4) {
    pbVar2 = ptr;
  }
  pcVar1 = " (Negative)";
  if (!bVar4) {
    pcVar1 = "";
  }
  iVar5 = BIO_printf(param_1,"%s%s\n",pcVar11,pcVar1);
  if ((iVar5 < 1) || (iVar5 = BIO_printf(param_1,"%s",&local_68), iVar5 < 1)) {
LAB_00b418dc:
    uVar6 = 0;
  }
  else {
    bVar3 = ptr[bVar4];
    if (bVar3 < 0x38) {
      uVar6 = 0;
    }
    else {
      iVar5 = BIO_printf(param_1,"%02x",0);
      if (iVar5 < 1) goto LAB_00b418dc;
      bVar3 = ptr[bVar4];
      uVar6 = 1;
    }
    if (bVar3 != 0) {
      iVar5 = -uVar6;
      uVar10 = uVar6;
      do {
        if ((uVar6 == 0) || (iVar5 + (uVar6 / 0xf) * 0xf != 0)) {
          pcVar11 = ":";
          if (uVar10 == 0) goto LAB_00b41870;
        }
        else {
          iVar7 = BIO_printf(param_1,":\n%s",&local_68);
          if (iVar7 < 1) goto LAB_00b418dc;
          bVar3 = *pbVar2;
LAB_00b41870:
          pcVar11 = "";
        }
        iVar7 = tolower((uint)bVar3);
        iVar8 = tolower((uint)pbVar2[1]);
        iVar7 = BIO_printf(param_1,"%s%c%c",pcVar11,(uchar)iVar7,(uchar)iVar8);
        if (iVar7 < 1) goto LAB_00b418dc;
        bVar3 = pbVar2[2];
        uVar6 = uVar6 + 1;
        iVar5 = iVar5 + -1;
        uVar10 = 1;
        pbVar2 = pbVar2 + 2;
      } while (bVar3 != 0);
    }
    iVar5 = BIO_printf(param_1,"\n");
    uVar6 = (uint)(0 < iVar5);
  }
  CRYPTO_free(ptr);
  return uVar6;
}

