/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008521fc
 */

void FUN_008521fc(ulong *param_1,int *param_2)

{
  long lVar1;
  size_t __n;
  char *pcVar2;
  int iVar3;
  undefined *puVar4;
  ulong uVar5;
  undefined1 *__dest;
  
  iVar3 = *param_2;
  switch(iVar3) {
  case 0:
    __n = strlen("<eof>");
    if (0xfffffffffffffff7 < __n) {
LAB_00852d78:
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    if (__n < 0x17) {
      __dest = (undefined1 *)((long)param_1 + 1);
      *(char *)param_1 = (char)((int)__n << 1);
      if (__n == 0) goto LAB_00852d2c;
      pcVar2 = "<eof>";
    }
    else {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "<eof>";
LAB_00852d18:
      *param_1 = uVar5;
    }
    break;
  default:
    if (iVar3 < 0x100) {
      pcVar2 = "\'%c\'";
LAB_00852d68:
      FUN_008aa02c(param_1,pcVar2,iVar3);
      return;
    }
    if (iVar3 - 0x123U < 0x15) {
      puVar4 = (&PTR_DAT_00c4a540)[iVar3 - 0x123U];
      goto LAB_00852890;
    }
    pcVar2 = "<unknown>";
    goto LAB_00852d48;
  case 0x101:
    __n = strlen("\'==\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'==\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'==\'";
    break;
  case 0x102:
    __n = strlen("\'<=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'<=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'<=\'";
    break;
  case 0x103:
    __n = strlen("\'>=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'>=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'>=\'";
    break;
  case 0x104:
    __n = strlen("\'~=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'~=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'~=\'";
    break;
  case 0x105:
    __n = strlen("\'..\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'..\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'..\'";
    break;
  case 0x106:
    __n = strlen("\'...\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'...\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'...\'";
    break;
  case 0x107:
    __n = strlen("\'->\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'->\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'->\'";
    break;
  case 0x108:
    __n = strlen("\'::\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'::\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'::\'";
    break;
  case 0x109:
    __n = strlen("\'//\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'//\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'//\'";
    break;
  case 0x10a:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "`%.*s{";
LAB_00852760:
      FUN_008aa02c(param_1,pcVar2,iVar3,lVar1);
      return;
    }
    pcVar2 = "the beginning of an interpolated string";
    goto LAB_00852d48;
  case 0x10b:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "}%.*s{";
      goto LAB_00852760;
    }
    pcVar2 = "the middle of an interpolated string";
    goto LAB_00852d48;
  case 0x10c:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "}%.*s`";
      goto LAB_00852760;
    }
    pcVar2 = "the end of an interpolated string";
    goto LAB_00852d48;
  case 0x10d:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "`%.*s`";
      goto LAB_00852760;
    }
    pcVar2 = "interpolated string";
    goto LAB_00852d48;
  case 0x10e:
    __n = strlen("\'+=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'+=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'+=\'";
    break;
  case 0x10f:
    __n = strlen("\'-=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'-=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'-=\'";
    break;
  case 0x110:
    __n = strlen("\'*=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'*=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'*=\'";
    break;
  case 0x111:
    __n = strlen("\'/=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'/=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'/=\'";
    break;
  case 0x112:
    __n = strlen("\'//=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'//=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'//=\'";
    break;
  case 0x113:
    __n = strlen("\'%=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'%=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'%=\'";
    break;
  case 0x114:
    __n = strlen("\'^=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'^=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'^=\'";
    break;
  case 0x115:
    __n = strlen("\'..=\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'..=\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'..=\'";
    break;
  case 0x116:
  case 0x117:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "\"%.*s\"";
      goto LAB_00852760;
    }
    __n = strlen("string");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "string";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "string";
    break;
  case 0x118:
    lVar1 = *(long *)(param_2 + 6);
    if (lVar1 != 0) {
      iVar3 = param_2[5];
      pcVar2 = "\'%.*s\'";
      goto LAB_00852760;
    }
    pcVar2 = "number";
    goto LAB_00852d48;
  case 0x119:
    puVar4 = *(undefined **)(param_2 + 6);
    if (puVar4 != (undefined *)0x0) {
LAB_00852890:
      FUN_008aa02c(param_1,&DAT_002b3373,puVar4);
      return;
    }
    pcVar2 = "identifier";
    goto LAB_00852d48;
  case 0x11a:
    __n = strlen("comment");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "comment";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "comment";
    break;
  case 0x11c:
    puVar4 = *(undefined **)(param_2 + 6);
    if (puVar4 != (undefined *)0x0) goto LAB_00852890;
    pcVar2 = "attribute";
    goto LAB_00852d48;
  case 0x11d:
    __n = strlen("\'@[\'");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "\'@[\'";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "\'@[\'";
    break;
  case 0x11e:
    __n = strlen("malformed string");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "malformed string";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "malformed string";
    break;
  case 0x11f:
    __n = strlen("unfinished comment");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (0x16 < __n) {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      uVar5 = uVar5 | 1;
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      pcVar2 = "unfinished comment";
      goto LAB_00852d18;
    }
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852d2c;
    pcVar2 = "unfinished comment";
    break;
  case 0x120:
    if (param_2[6] != 0) {
      lVar1 = FUN_00851588(param_2[6]);
      iVar3 = param_2[6];
      if (lVar1 != 0) {
        pcVar2 = "Unicode character U+%x (did you mean \'%s\'?)";
        goto LAB_00852760;
      }
      pcVar2 = "Unicode character U+%x";
      goto LAB_00852d68;
    }
    pcVar2 = "invalid UTF-8 sequence";
LAB_00852d48:
    FUN_00852d7c(param_1,pcVar2);
    return;
  case 0x121:
    __n = strlen("\'{{\', which is invalid (did you mean \'\\{\'?)");
    if (0xfffffffffffffff7 < __n) goto LAB_00852d78;
    if (__n < 0x17) {
      __dest = (undefined1 *)((long)param_1 + 1);
      *(char *)param_1 = (char)((int)__n << 1);
      if (__n == 0) goto LAB_00852d2c;
    }
    else {
      uVar5 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar5 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar5);
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      *param_1 = uVar5 | 1;
    }
    pcVar2 = "\'{{\', which is invalid (did you mean \'\\{\'?)";
  }
  memcpy(__dest,pcVar2,__n);
LAB_00852d2c:
  __dest[__n] = 0;
  return;
}

