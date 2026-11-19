/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b027ec
 */

int X509_PURPOSE_get_by_sname(char *sname)

{
  int iVar1;
  undefined *puVar2;
  ulong uVar3;
  undefined *puVar4;
  
  uVar3 = 0;
  puVar4 = &DAT_00cc9a28;
  if (DAT_00d227e0 != 0) goto LAB_00b0282c;
  while ((long)uVar3 < 9) {
    while( true ) {
      puVar2 = puVar4;
      if (8 < uVar3) {
        puVar2 = (undefined *)OPENSSL_sk_value(DAT_00d227e0,(int)uVar3 + -9);
      }
      iVar1 = strcmp(*(char **)(puVar2 + 0x20),sname);
      if (iVar1 == 0) goto LAB_00b0287c;
      uVar3 = uVar3 + 1;
      puVar4 = puVar4 + 0x30;
      if (DAT_00d227e0 == 0) break;
LAB_00b0282c:
      iVar1 = OPENSSL_sk_num();
      if ((long)(iVar1 + 9) <= (long)uVar3) goto LAB_00b02878;
    }
  }
LAB_00b02878:
  uVar3 = 0xffffffff;
LAB_00b0287c:
  return (int)uVar3;
}

