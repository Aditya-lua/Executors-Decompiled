/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed26c
 */

long TXT_DB_write(BIO *out,TXT_DB *db)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BUF_MEM *str;
  undefined8 *puVar4;
  size_t sVar5;
  char *pcVar6;
  char *pcVar7;
  char *pcVar8;
  char cVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  long lVar14;
  
  str = BUF_MEM_new();
  if (str == (BUF_MEM *)0x0) {
LAB_00aed3b0:
    lVar10 = -1;
  }
  else {
    iVar2 = OPENSSL_sk_num(db->data);
    if (iVar2 < 1) {
      lVar10 = 0;
    }
    else {
      iVar1 = db->num_fields;
      uVar11 = 0;
      lVar10 = 0;
      do {
        puVar4 = (undefined8 *)OPENSSL_sk_value(db->data,uVar11 & 0xffffffff);
        lVar13 = 0;
        iVar3 = 0;
        if (0 < iVar1) {
          puVar12 = puVar4;
          lVar14 = (long)iVar1;
          do {
            if ((char *)*puVar12 != (char *)0x0) {
              sVar5 = strlen((char *)*puVar12);
              lVar13 = sVar5 + lVar13;
            }
            iVar3 = (int)lVar13;
            lVar14 = lVar14 + -1;
            puVar12 = puVar12 + 1;
          } while (lVar14 != 0);
        }
        iVar3 = BUF_MEM_grow_clean(str,(long)(iVar1 + iVar3 * 2));
        if (iVar3 == 0) goto LAB_00aed3b0;
        pcVar6 = str->data;
        if (0 < iVar1) {
          lVar13 = 0;
          pcVar7 = pcVar6;
          do {
            pcVar6 = (char *)puVar4[lVar13];
            if (pcVar6 != (char *)0x0) {
              do {
                cVar9 = *pcVar6;
                if (cVar9 == '\t') {
                  pcVar8 = pcVar7 + 1;
                  *pcVar7 = '\\';
                  cVar9 = *pcVar6;
                }
                else {
                  pcVar8 = pcVar7;
                  if (cVar9 == '\0') break;
                }
                pcVar6 = pcVar6 + 1;
                pcVar7 = pcVar8 + 1;
                *pcVar8 = cVar9;
              } while( true );
            }
            lVar13 = lVar13 + 1;
            pcVar6 = pcVar7 + 1;
            *pcVar7 = '\t';
            pcVar7 = pcVar6;
          } while (lVar13 != iVar1);
        }
        pcVar6[-1] = '\n';
        lVar13 = (long)pcVar6 - (long)str->data;
        iVar3 = BIO_write(out,str->data,(int)lVar13);
        if (lVar13 != iVar3) goto LAB_00aed3b0;
        uVar11 = uVar11 + 1;
        lVar10 = lVar13 + lVar10;
      } while ((long)uVar11 < (long)iVar2);
    }
  }
  BUF_MEM_free(str);
  return lVar10;
}

