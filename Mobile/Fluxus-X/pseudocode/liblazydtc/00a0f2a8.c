/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0f2a8
 */

/* WARNING: Control flow encountered bad instruction data */

int FUN_00a0f2a8(CONF *param_1,byte *param_2,undefined8 *param_3,byte *param_4)

{
  byte bVar1;
  ushort uVar2;
  uint uVar3;
  code *pcVar4;
  int iVar5;
  BUF_MEM *str;
  size_t sVar6;
  char *__s;
  byte *pbVar7;
  undefined8 uVar8;
  byte *name;
  char cVar9;
  int iVar10;
  byte bVar11;
  void *pvVar12;
  byte bVar13;
  int iVar14;
  ulong uVar15;
  long lVar16;
  byte bVar17;
  byte *pbVar18;
  byte *pbVar19;
  ulong uVar20;
  ulong uVar21;
  byte *pbVar22;
  
  str = BUF_MEM_new();
  if (str == (BUF_MEM *)0x0) {
    return 0;
  }
  sVar6 = strlen((char *)param_4);
  iVar5 = BUF_MEM_grow(str,(long)((sVar6 << 0x20) + 0x100000000) >> 0x20);
  if (iVar5 != 0) {
    uVar20 = 0;
    bVar11 = 0;
LAB_00a0f32c:
    pbVar18 = param_4;
LAB_00a0f348:
    bVar17 = *pbVar18;
    iVar10 = (int)(char)bVar17;
    iVar14 = (int)uVar20;
    if (-1 < (char)bVar17) {
      pvVar12 = param_1->meth_data;
      uVar2 = *(ushort *)((long)pvVar12 + (ulong)bVar17 * 2);
      if ((uVar2 >> 6 & 1) != 0) {
        uVar20 = (ulong)iVar14;
        pbVar22 = pbVar18 + 1;
        uVar15 = (ulong)(char)*pbVar22;
        pbVar19 = pbVar18;
        if (-1 < (char)*pbVar22) goto LAB_00a0f3c4;
        while( true ) {
          pbVar18 = pbVar22;
          uVar21 = uVar20;
          if ((int)uVar15 == (int)(char)bVar17) break;
          while( true ) {
            uVar20 = uVar21 + 1;
            str->data[uVar21] = (char)uVar15;
            pbVar22 = pbVar18 + 1;
            uVar15 = (ulong)(char)*pbVar22;
            pbVar19 = pbVar18;
            if ((char)*pbVar22 < '\0') break;
LAB_00a0f3c4:
            pbVar18 = pbVar22;
            iVar14 = (int)uVar15;
            if ((iVar14 == iVar10) ||
               ((*(ushort *)((long)param_1->meth_data + (uVar15 & 0xff) * 2) >> 3 & 1) != 0))
            goto LAB_00a0f418;
            uVar21 = uVar20;
            if ((*(byte *)((long)param_1->meth_data + (uVar15 & 0xff) * 2) >> 5 & 1) != 0) {
              pbVar18 = pbVar19 + 2;
              bVar13 = *pbVar18;
              uVar15 = (ulong)(char)bVar13;
              iVar14 = (int)(char)bVar13;
              if ((-1 < (char)bVar13) &&
                 ((*(byte *)((long)param_1->meth_data + (ulong)bVar13 * 2) >> 3 & 1) != 0))
              goto LAB_00a0f418;
            }
          }
        }
        iVar14 = iVar10;
LAB_00a0f418:
        if (iVar14 == iVar10) {
          pbVar18 = pbVar18 + 1;
        }
        goto LAB_00a0f348;
      }
      if ((uVar2 >> 10 & 1) != 0) {
        uVar20 = (long)iVar14;
        do {
          pbVar22 = pbVar18 + 1;
          bVar13 = *pbVar22;
          iVar14 = (int)(char)bVar13;
          if ((-1 < (char)bVar13) &&
             ((*(byte *)((long)param_1->meth_data + (ulong)bVar13 * 2) >> 3 & 1) != 0))
          goto LAB_00a0f48c;
          pbVar19 = pbVar22;
          if ((char)bVar13 == iVar10) {
            pbVar19 = pbVar18 + 2;
            bVar13 = bVar17;
            if (*pbVar19 != bVar17) goto code_r0x00a0f480;
          }
          str->data[uVar20] = bVar13;
          pbVar18 = pbVar19;
          uVar20 = uVar20 + 1;
        } while( true );
      }
      if ((uVar2 >> 5 & 1) != 0) {
        bVar17 = pbVar18[1];
        if ((-1 < (char)bVar17) && ((*(byte *)((long)pvVar12 + (ulong)bVar17 * 2) >> 3 & 1) != 0)) {
LAB_00a0f6b8:
          str->data[iVar14] = '\0';
          CRYPTO_free((void *)*param_3);
          *param_3 = str->data;
          CRYPTO_free(str);
          return 1;
        }
        uVar3 = (int)(char)bVar17 - 0x62;
        pbVar18 = pbVar18 + 2;
        if ((uVar3 * 0x80 & 0xff | uVar3 >> 1 & 0x7f) < 10) {
                    /* WARNING (jumptable): Sanity check requires truncation of jumptable */
                    /* WARNING: Could not find normalized switch variable to match jumptable */
          switch(bVar17) {
          case 0:
          case 4:
            return iVar5;
          default:
                    /* WARNING: Bad instruction - Truncating control flow here */
            halt_baddata();
          case 2:
                    /* WARNING: Bad instruction - Truncating control flow here */
            halt_baddata();
          case 5:
                    /* WARNING: Does not return */
            pcVar4 = (code *)UndefinedInstructionException(0,0x751f7c);
            (*pcVar4)();
          case 0xd:
          case 0xf:
                    /* WARNING: Does not return */
            pcVar4 = (code *)UndefinedInstructionException(0,0x751f48);
            (*pcVar4)();
          case 0x11:
                    /* WARNING: Bad instruction - Truncating control flow here */
            halt_baddata();
          }
        }
        str->data[iVar14] = bVar17;
        uVar20 = (ulong)(iVar14 + 1);
        goto LAB_00a0f348;
      }
      if ((uVar2 >> 3 & 1) != 0) goto LAB_00a0f6b8;
      if (iVar10 != 0x24) goto LAB_00a0f334;
      bVar13 = pbVar18[1];
      if (((*(int *)&param_1[1].meth == 0) || (bVar13 == 0x7b)) || (bVar13 == 0x28))
      goto LAB_00a0f510;
    }
LAB_00a0f334:
    pbVar18 = pbVar18 + 1;
    str->data[iVar14] = bVar17;
    uVar20 = (ulong)(iVar14 + 1);
    goto LAB_00a0f348;
  }
  goto LAB_00a0f7a0;
code_r0x00a0f480:
  iVar14 = iVar10;
LAB_00a0f48c:
  pbVar18 = pbVar18 + 2;
  if (iVar14 != iVar10) {
    pbVar18 = pbVar22;
  }
  goto LAB_00a0f348;
LAB_00a0f510:
  bVar17 = 0x29;
  if (bVar13 != 0x28) {
    bVar17 = 0;
  }
  bVar1 = 0x7d;
  if (bVar13 != 0x7b) {
    bVar1 = bVar17;
  }
  pbVar22 = pbVar18 + 2;
  if (bVar1 == 0) {
    pbVar22 = pbVar18 + 1;
  }
  pbVar19 = pbVar22;
  do {
    bVar17 = *pbVar19;
    if (((char)bVar17 < '\0') || ((*(ushort *)((long)pvVar12 + (ulong)bVar17 * 2) & 0x107) == 0)) {
      if (*(int *)&param_1[1].meth == 0) break;
      if ((char)bVar17 < '\0') goto LAB_00a0f5e4;
      if ((*(byte *)((long)pvVar12 + (ulong)bVar17 * 2 + 1) >> 4 & 1) == 0) break;
    }
    pbVar19 = pbVar19 + 1;
  } while( true );
  if (bVar17 == 0x3a) {
    if (pbVar19[1] != 0x3a) {
      bVar17 = 0x3a;
      goto LAB_00a0f5e4;
    }
    bVar11 = 0x3a;
    *pbVar19 = 0;
    name = pbVar19 + 2;
    bVar17 = *name;
    pbVar7 = pbVar22;
    pbVar22 = name;
    if ((char)bVar17 < '\0') {
    }
    else {
      do {
        if ((*(ushort *)((long)param_1->meth_data + (ulong)bVar17 * 2) & 0x107) == 0) {
          if (*(int *)&param_1[1].meth == 0 || (char)bVar17 < '\0') break;
          if ((*(byte *)((long)param_1->meth_data + (ulong)bVar17 * 2 + 1) >> 4 & 1) == 0) break;
        }
        pbVar22 = pbVar22 + 1;
        bVar17 = *pbVar22;
      } while (-1 < (char)bVar17);
    }
  }
  else {
LAB_00a0f5e4:
    pbVar7 = param_2;
    name = pbVar22;
    pbVar19 = (byte *)0x0;
    pbVar22 = pbVar19;
  }
  *pbVar22 = 0;
  param_4 = pbVar22;
  if (bVar1 != 0) {
    if (bVar1 != bVar17) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x2ec,"str_copy");
      uVar8 = 0x66;
      goto LAB_00a0f798;
    }
    param_4 = pbVar22 + 1;
  }
  __s = _CONF_get_string(param_1,(char *)pbVar7,(char *)name);
  if (pbVar19 != (byte *)0x0) {
    *pbVar19 = bVar11;
  }
  *pbVar22 = bVar17;
  if (__s == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x300,"str_copy");
    uVar8 = 0x68;
    goto LAB_00a0f798;
  }
  sVar6 = strlen(__s);
  if ((byte *)0x10000 < pbVar18 + str->length + (sVar6 - (long)param_4)) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x305,"str_copy");
    uVar8 = 0x74;
    goto LAB_00a0f798;
  }
  iVar5 = BUF_MEM_grow_clean(str,(size_t)(pbVar18 + str->length + (sVar6 - (long)param_4)));
  if (iVar5 != 0) {
    cVar9 = *__s;
    if (cVar9 == '\0') {
      *pbVar22 = bVar17;
    }
    else {
      lVar16 = (long)iVar14;
      do {
        __s = __s + 1;
        uVar20 = (ulong)((int)uVar20 + 1);
        str->data[lVar16] = cVar9;
        cVar9 = *__s;
        lVar16 = lVar16 + 1;
      } while (cVar9 != '\0');
      *pbVar22 = bVar17;
    }
    goto LAB_00a0f32c;
  }
  ERR_new();
  ERR_set_debug("crypto/conf/conf_def.c",0x309,"str_copy");
  uVar8 = 0xc0100;
LAB_00a0f798:
  ERR_set_error(0xe,uVar8,0);
LAB_00a0f7a0:
  BUF_MEM_free(str);
  return 0;
}

