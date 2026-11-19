/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b072e4
 */

int X509V3_NAME_from_section(X509_NAME *nm,stack_st_CONF_VALUE *dn_sk,ulong chtype)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  byte *pbVar6;
  byte *pbVar7;
  
  iVar3 = 0;
  if (nm != (X509_NAME *)0x0) {
    iVar3 = OPENSSL_sk_num(dn_sk);
    if (0 < iVar3) {
      iVar3 = 0;
      do {
        lVar5 = OPENSSL_sk_value(dn_sk,iVar3);
        pbVar6 = *(byte **)(lVar5 + 8);
        pbVar1 = pbVar6;
        do {
          while( true ) {
            pbVar7 = pbVar1 + 1;
            bVar2 = *pbVar1;
            pbVar1 = pbVar7;
            if (bVar2 < 0x2e) break;
            if ((bVar2 == 0x2e) || (bVar2 == 0x3a)) goto LAB_00b07360;
          }
          if (bVar2 == 0) goto LAB_00b0736c;
        } while (bVar2 != 0x2c);
LAB_00b07360:
        if (*pbVar7 != 0) {
          pbVar6 = pbVar7;
        }
LAB_00b0736c:
        pbVar1 = pbVar6 + 1;
        if (*pbVar6 != 0x2b) {
          pbVar1 = pbVar6;
        }
        iVar4 = X509_NAME_add_entry_by_txt
                          (nm,(char *)pbVar1,(int)chtype,*(uchar **)(lVar5 + 0x10),-1,-1,
                           -(uint)(*pbVar6 == 0x2b));
        if (iVar4 == 0) {
          return 0;
        }
        iVar3 = iVar3 + 1;
        iVar4 = OPENSSL_sk_num(dn_sk);
      } while (iVar3 < iVar4);
    }
    iVar3 = 1;
  }
  return iVar3;
}

