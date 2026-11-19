/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aecdb8
 */

TXT_DB * TXT_DB_read(BIO *in,int num)

{
  ulong uVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  BUF_MEM *str;
  TXT_DB *ptr;
  stack_st_OPENSSL_PSTRING *psVar7;
  lhash_st_OPENSSL_STRING **pplVar8;
  _func_4786 **pp_Var9;
  size_t sVar10;
  undefined8 *ptr_00;
  ulong uVar11;
  char *pcVar12;
  char *pcVar13;
  int iVar14;
  char *pcVar15;
  _func_4786 ***ppp_Var16;
  lhash_st_OPENSSL_STRING ***ppplVar17;
  long lVar18;
  long lVar19;
  
  str = BUF_MEM_new();
  if ((str == (BUF_MEM *)0x0) || (iVar4 = BUF_MEM_grow(str,0x200), iVar4 == 0)) {
    BUF_MEM_free(str);
    return (TXT_DB *)0x0;
  }
  ptr = CRYPTO_malloc(0x40,"crypto/txt_db/txt_db.c",0x24);
  if (ptr == (TXT_DB *)0x0) {
LAB_00aed02c:
    BUF_MEM_free(str);
    return ptr;
  }
  ptr->num_fields = num;
  ppplVar17 = &ptr->index;
  *ppplVar17 = (lhash_st_OPENSSL_STRING **)0x0;
  ppp_Var16 = &ptr->qual;
  *ppp_Var16 = (_func_4786 **)0x0;
  psVar7 = (stack_st_OPENSSL_PSTRING *)OPENSSL_sk_new_null();
  ptr->data = psVar7;
  if (psVar7 != (stack_st_OPENSSL_PSTRING *)0x0) {
    pplVar8 = CRYPTO_malloc(num << 3,"crypto/txt_db/txt_db.c",0x2b);
    *ppplVar17 = pplVar8;
    if (pplVar8 != (lhash_st_OPENSSL_STRING **)0x0) {
      pp_Var9 = CRYPTO_malloc(num << 3,"crypto/txt_db/txt_db.c",0x2d);
      *ppp_Var16 = pp_Var9;
      if (pp_Var9 != (_func_4786 **)0x0) {
        if (0 < num) {
          uVar11 = 0;
          do {
            uVar1 = uVar11 + 1;
            (*ppplVar17)[uVar11] = (lhash_st_OPENSSL_STRING *)0x0;
            (*ppp_Var16)[uVar11] = (_func_4786 *)0x0;
            uVar11 = uVar1;
          } while ((uint)num != uVar1);
        }
        iVar4 = num * 8 + 8;
        lVar19 = 0;
        iVar14 = 0x200;
        str->data[0x1ff] = '\0';
LAB_00aeced0:
        iVar6 = (int)lVar19;
        if (iVar6 == 0) {
LAB_00aecee8:
          lVar18 = (long)iVar6;
          str->data[lVar18] = '\0';
          BIO_gets(in,str->data + lVar18,iVar14 - iVar6);
          pcVar15 = str->data;
          if (pcVar15[lVar18] == '\0') goto LAB_00aed02c;
          if ((iVar6 == 0) && (*pcVar15 == '#')) goto LAB_00aeced0;
          sVar10 = strlen(pcVar15 + lVar18);
          lVar19 = lVar18 + (int)sVar10;
          if (pcVar15[lVar19 + -1] != '\n') goto LAB_00aeced0;
          pcVar15[lVar19 + -1] = '\0';
          ptr_00 = CRYPTO_malloc((int)lVar19 + iVar4,"crypto/txt_db/txt_db.c",0x49);
          if (ptr_00 != (undefined8 *)0x0) {
            pcVar13 = (char *)((long)ptr_00 + (long)iVar4);
            *ptr_00 = pcVar13;
            pcVar15 = str->data;
            lVar19 = 1;
LAB_00aecf8c:
            bVar3 = false;
            pcVar12 = pcVar13;
            do {
              cVar2 = *pcVar15;
              if (cVar2 == '\t') {
                if (!bVar3) goto LAB_00aecfc4;
                pcVar12 = pcVar12 + -1;
              }
              else if (cVar2 == '\0') goto LAB_00aecfd8;
              bVar3 = cVar2 == '\\';
              pcVar15 = pcVar15 + 1;
              *pcVar12 = cVar2;
              pcVar12 = pcVar12 + 1;
            } while( true );
          }
        }
        else {
          iVar14 = iVar14 + 0x200;
          iVar5 = BUF_MEM_grow_clean(str,(long)iVar14);
          if (iVar5 != 0) goto LAB_00aecee8;
        }
        BUF_MEM_free(str);
        if (ptr == (TXT_DB *)0x0) {
          return (TXT_DB *)0x0;
        }
        goto LAB_00aed074;
      }
    }
  }
LAB_00aed06c:
  BUF_MEM_free(str);
LAB_00aed074:
  OPENSSL_sk_free(ptr->data);
  CRYPTO_free(ptr->index);
  CRYPTO_free(ptr->qual);
  CRYPTO_free(ptr);
  return (TXT_DB *)0x0;
LAB_00aecfc4:
  pcVar13 = pcVar12 + 1;
  *pcVar12 = '\0';
  pcVar15 = pcVar15 + 1;
  pcVar12 = pcVar13;
  if (num <= lVar19) goto LAB_00aecfd8;
  ptr_00[lVar19] = pcVar13;
  lVar19 = lVar19 + 1;
  goto LAB_00aecf8c;
LAB_00aecfd8:
  *pcVar12 = '\0';
  if (((int)lVar19 != num) || (*pcVar15 != '\0')) {
    CRYPTO_free(ptr_00);
    ptr->error = 6;
    goto LAB_00aed06c;
  }
  ptr_00[(uint)num] = pcVar12 + 1;
  iVar6 = OPENSSL_sk_push(ptr->data,ptr_00);
  lVar19 = 0;
  if (iVar6 == 0) goto code_r0x00aed008;
  goto LAB_00aeced0;
code_r0x00aed008:
  CRYPTO_free(ptr_00);
  goto LAB_00aed06c;
}

