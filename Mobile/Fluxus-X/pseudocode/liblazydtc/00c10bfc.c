/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c10bfc
 */

undefined8 * FUN_00c10bfc(long *param_1)

{
  char cVar1;
  byte bVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  void *pvVar5;
  ulong uVar6;
  byte *pbVar7;
  char *pcVar8;
  undefined *puVar9;
  ushort uVar10;
  long lVar11;
  undefined8 uVar12;
  char *pcVar13;
  byte *pbVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  size_t __n;
  long *__src;
  long *plVar19;
  undefined8 *local_58;
  undefined1 local_50 [16];
  ulong local_28;
  
  pcVar13 = (char *)*param_1;
  pbVar7 = (byte *)param_1[1];
  local_58 = (undefined8 *)0x0;
  uVar6 = (long)pbVar7 - (long)pcVar13;
  if (uVar6 == 0) goto code_r0x00c11640;
  cVar1 = *pcVar13;
  switch(cVar1) {
  case 'A':
    pbVar14 = (byte *)(pcVar13 + 1);
    local_28 = 0;
    *param_1 = (long)pbVar14;
    if (pbVar7 == pbVar14) {
LAB_00c11b84:
      uVar6 = FUN_00c16098(param_1);
      puVar4 = (undefined8 *)0x0;
      if (uVar6 == 0) goto joined_r0x00c11c84;
      pcVar13 = (char *)*param_1;
      if ((pcVar13 == (char *)param_1[1]) || (*pcVar13 != '_')) {
        return (undefined8 *)0x0;
      }
      pcVar13 = pcVar13 + 1;
      local_28 = uVar6;
    }
    else if (*pbVar14 - 0x3a < 0xfffffff6) {
      if (*pbVar14 != 0x5f) goto LAB_00c11b84;
      pcVar13 = pcVar13 + 2;
    }
    else {
      local_50 = FUN_00c10abc(param_1,0);
      local_28 = FUN_00c15bec(param_1,local_50);
      pcVar13 = (char *)*param_1;
      if (pcVar13 == (char *)param_1[1]) {
        return (undefined8 *)0x0;
      }
      if (*pcVar13 != '_') {
        return (undefined8 *)0x0;
      }
      pcVar13 = pcVar13 + 1;
    }
    *param_1 = (long)pcVar13;
    pbVar7 = (byte *)FUN_00c10bfc(param_1);
    puVar4 = (undefined8 *)0x0;
    local_50._0_8_ = pbVar7;
    if (pbVar7 != (byte *)0x0) {
      puVar4 = (undefined8 *)FUN_00c278f0(param_1,local_50,&local_28);
    }
    goto joined_r0x00c11c84;
  default:
    goto code_r0x00c11640;
  case 'C':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    if ((byte *)local_50._0_8_ == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    puVar4 = (undefined8 *)FUN_00c260a0(param_1,local_50);
    goto LAB_00c1164c;
  case 'D':
    if (uVar6 < 2) {
      return (undefined8 *)0x0;
    }
    cVar1 = pcVar13[1];
    puVar3 = (undefined8 *)0x0;
    switch(cVar1) {
    case 'A':
      if (uVar6 != 2) {
        bVar2 = pcVar13[2];
        *param_1 = (long)(pcVar13 + 3);
        if (0x6c < bVar2) {
          if (bVar2 == 0x6d) {
            pcVar13 = "unsigned long _Accum";
LAB_00c12258:
            puVar4 = (undefined8 *)FUN_00c25730(param_1,pcVar13);
            return puVar4;
          }
          if (bVar2 == 0x74) {
            pcVar13 = "unsigned short _Accum";
LAB_00c1228c:
            puVar4 = (undefined8 *)FUN_00c1449c(param_1,pcVar13);
            return puVar4;
          }
          if (bVar2 != 0x73) {
            return (undefined8 *)0x0;
          }
          pcVar13 = "short _Accum";
LAB_00c12170:
          puVar4 = (undefined8 *)FUN_00c251dc(param_1,pcVar13);
          return puVar4;
        }
        if (bVar2 == 0x69) {
          pcVar13 = "_Accum";
LAB_00c12230:
          puVar4 = (undefined8 *)FUN_00c2548c(param_1,pcVar13);
          return puVar4;
        }
        if (bVar2 != 0x6a) {
          if (bVar2 != 0x6c) {
            return (undefined8 *)0x0;
          }
          pcVar13 = "long _Accum";
          goto LAB_00c12104;
        }
        pcVar13 = "unsigned _Accum";
        goto LAB_00c11edc;
      }
      goto LAB_00c11fa4;
    case 'B':
    case 'U':
      pbVar14 = (byte *)(pcVar13 + 2);
      *param_1 = (long)pbVar14;
      local_28 = CONCAT71(local_28._1_7_,cVar1 == 'B');
      if ((pbVar7 == pbVar14) || (*pbVar14 - 0x3a < 0xfffffff6)) {
        local_50._0_8_ = FUN_00c16098(param_1);
        if (local_50._0_8_ == 0) {
          return (undefined8 *)0x0;
        }
      }
      else {
        local_50 = FUN_00c10abc(param_1,0);
        lVar11 = FUN_00c15bec(param_1,local_50);
        local_50._0_8_ = lVar11;
      }
      pcVar13 = (char *)*param_1;
      if (pcVar13 == (char *)param_1[1]) {
        return (undefined8 *)0x0;
      }
      if (*pcVar13 == '_') {
        *param_1 = (long)(pcVar13 + 1);
        puVar4 = (undefined8 *)FUN_00c259e0(param_1,local_50,&local_28);
        return puVar4;
      }
      return (undefined8 *)0x0;
    default:
      goto code_r0x00c11b1c;
    case 'F':
      *param_1 = (long)(pcVar13 + 2);
      uVar6 = FUN_00c0ffd8(param_1,&DAT_002b3305,3);
      if ((uVar6 & 1) == 0) {
        local_50 = FUN_00c10abc(param_1,0);
        uVar12 = FUN_00c15bec(param_1,local_50);
        pcVar13 = (char *)*param_1;
        if ((pcVar13 == (char *)param_1[1]) || (*pcVar13 != '_')) {
          return (undefined8 *)0x0;
        }
        *param_1 = (long)(pcVar13 + 1);
        local_50._0_8_ = uVar12;
        puVar4 = (undefined8 *)FUN_00c25690(param_1,local_50);
        return puVar4;
      }
      pcVar13 = "std::bfloat16_t";
LAB_00c11edc:
      puVar4 = (undefined8 *)FUN_00c1e870(param_1,pcVar13);
      return puVar4;
    case 'K':
    case 'k':
      local_50._0_8_ = " auto";
      if (cVar1 != 'k') {
        local_50._0_8_ = " decltype(auto)";
      }
      local_50._8_8_ = 5;
      if (cVar1 != 'k') {
        local_50._8_8_ = 0xf;
      }
      *param_1 = (long)(pcVar13 + 2);
      local_28 = FUN_00c12574(param_1,0);
      if (local_28 == 0) {
        return (undefined8 *)0x0;
      }
      puVar4 = (undefined8 *)FUN_00c25a8c(param_1,&local_28,local_50);
      return puVar4;
    case 'O':
    case 'o':
    case 'w':
    case 'x':
      goto code_r0x00c11710;
    case 'R':
      if (uVar6 != 2) {
        bVar2 = pcVar13[2];
        *param_1 = (long)(pcVar13 + 3);
        if (0x6c < bVar2) {
          if (bVar2 == 0x6d) {
            pcVar13 = "unsigned long _Fract";
            goto LAB_00c12258;
          }
          if (bVar2 == 0x74) {
            pcVar13 = "unsigned short _Fract";
            goto LAB_00c1228c;
          }
          if (bVar2 != 0x73) {
            return (undefined8 *)0x0;
          }
          pcVar13 = "short _Fract";
          goto LAB_00c12170;
        }
        if (bVar2 == 0x69) {
          pcVar13 = "_Fract";
          goto LAB_00c12230;
        }
        if (bVar2 != 0x6a) {
          if (bVar2 != 0x6c) {
            return (undefined8 *)0x0;
          }
          pcVar13 = "long _Fract";
          goto LAB_00c12104;
        }
        pcVar13 = "unsigned _Fract";
        goto LAB_00c11edc;
      }
LAB_00c11fa4:
      pcVar13 = pcVar13 + 3;
LAB_00c11fa8:
      *param_1 = (long)pcVar13;
      return (undefined8 *)0x0;
    case 'S':
      pbVar14 = (byte *)(pcVar13 + 2);
      uVar6 = (long)pbVar7 - (long)pbVar14;
      *param_1 = (long)pbVar14;
      if (pbVar7 == pbVar14) {
        return (undefined8 *)0x0;
      }
      if (uVar6 < 2) {
        return (undefined8 *)0x0;
      }
      if (*pbVar14 != 0x44) {
        return (undefined8 *)0x0;
      }
      if (pcVar13[3] == 'R') {
        if (2 < uVar6) {
          bVar2 = pcVar13[4];
          *param_1 = (long)(pcVar13 + 5);
          if (0x6c < bVar2) {
            if (bVar2 == 0x6d) {
              pcVar13 = "_Sat unsigned long _Fract";
              goto LAB_00c1233c;
            }
            if (bVar2 == 0x74) {
              pcVar13 = "_Sat unsigned short _Fract";
              goto LAB_00c12388;
            }
            if (bVar2 != 0x73) {
              return (undefined8 *)0x0;
            }
            pcVar13 = "_Sat short _Fract";
            goto LAB_00c122f0;
          }
          if (bVar2 != 0x69) {
            if (bVar2 != 0x6a) {
              if (bVar2 != 0x6c) {
                return (undefined8 *)0x0;
              }
              pcVar13 = "_Sat long _Fract";
              goto LAB_00c121d0;
            }
            pcVar13 = "_Sat unsigned _Fract";
            goto LAB_00c12258;
          }
          pcVar13 = "_Sat _Fract";
          goto LAB_00c12104;
        }
      }
      else {
        if (pcVar13[3] != 'A') {
          return (undefined8 *)0x0;
        }
        if (2 < uVar6) {
          bVar2 = pcVar13[4];
          *param_1 = (long)(pcVar13 + 5);
          if (0x6c < bVar2) {
            if (bVar2 == 0x6d) {
              pcVar13 = "_Sat unsigned long _Accum";
LAB_00c1233c:
              puVar4 = (undefined8 *)FUN_00c25934(param_1,pcVar13);
              return puVar4;
            }
            if (bVar2 == 0x74) {
              pcVar13 = "_Sat unsigned short _Accum";
LAB_00c12388:
              puVar4 = (undefined8 *)FUN_00c257dc(param_1,pcVar13);
              return puVar4;
            }
            if (bVar2 != 0x73) {
              return (undefined8 *)0x0;
            }
            pcVar13 = "_Sat short _Accum";
LAB_00c122f0:
            puVar4 = (undefined8 *)FUN_00c253e0(param_1,pcVar13);
            return puVar4;
          }
          if (bVar2 != 0x69) {
            if (bVar2 != 0x6a) {
              if (bVar2 != 0x6c) {
                return (undefined8 *)0x0;
              }
              pcVar13 = "_Sat long _Accum";
LAB_00c121d0:
              puVar4 = (undefined8 *)FUN_00c25888(param_1,pcVar13);
              return puVar4;
            }
            pcVar13 = "_Sat unsigned _Accum";
            goto LAB_00c12258;
          }
          pcVar13 = "_Sat _Accum";
LAB_00c12104:
          puVar4 = (undefined8 *)FUN_00c25130(param_1,pcVar13);
          return puVar4;
        }
      }
      pcVar13 = pcVar13 + 5;
      goto LAB_00c11fa8;
    case 'T':
    case 't':
      puVar4 = (undefined8 *)FUN_00c15284(param_1);
      break;
    case 'a':
      puVar9 = &DAT_002a1f81;
      goto LAB_00c11f08;
    case 'c':
      pcVar8 = "decltype(auto)";
      goto LAB_00c11f3c;
    case 'd':
      pcVar8 = "decimal64";
      goto LAB_00c11fc0;
    case 'e':
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c25538(param_1,"decimal128");
      return puVar4;
    case 'f':
      pcVar8 = "decimal32";
LAB_00c11fc0:
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c25288(param_1,pcVar8);
      return puVar4;
    case 'h':
      puVar9 = &DAT_002cec08;
LAB_00c11f08:
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c15d60(param_1,puVar9);
      return puVar4;
    case 'i':
      pcVar8 = "char32_t";
      goto LAB_00c11ff4;
    case 'n':
      pcVar8 = "std::nullptr_t";
LAB_00c11f3c:
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c2383c(param_1,pcVar8);
      return puVar4;
    case 'p':
      *param_1 = (long)(pcVar13 + 2);
      local_50._0_8_ = FUN_00c10bfc(param_1);
      if ((byte *)local_50._0_8_ == (byte *)0x0) {
        return (undefined8 *)0x0;
      }
      puVar4 = (undefined8 *)FUN_00c19530(param_1,local_50);
      goto LAB_00c1164c;
    case 's':
      pcVar8 = "char16_t";
LAB_00c11ff4:
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c25334(param_1,pcVar8);
      return puVar4;
    case 'u':
      *param_1 = (long)(pcVar13 + 2);
      puVar4 = (undefined8 *)FUN_00c1c880(param_1,"char8_t");
      return puVar4;
    case 'v':
      puVar4 = (undefined8 *)FUN_00c25b38(param_1);
    }
    goto joined_r0x00c11c84;
  case 'F':
    goto code_r0x00c11710;
  case 'G':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    if ((byte *)local_50._0_8_ == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    puVar4 = (undefined8 *)FUN_00c26150(param_1,local_50);
    goto LAB_00c1164c;
  case 'K':
  case 'V':
  case 'r':
    uVar16 = (ulong)(cVar1 == 'r');
    if (uVar16 < uVar6) {
      uVar15 = 1;
      if (cVar1 == 'r') {
        uVar15 = 2;
      }
      if (pcVar13[uVar16] != 'V') {
        uVar15 = (uint)(cVar1 == 'r');
      }
      uVar16 = (ulong)uVar15;
    }
    if (uVar16 < uVar6) {
      uVar15 = (uint)uVar16;
      if (pcVar13[uVar16] == 'K') {
        uVar15 = uVar15 + 1;
      }
      uVar16 = (ulong)uVar15;
    }
    if ((uVar6 <= uVar16) ||
       ((pcVar13[uVar16] != 'F' &&
        ((((pcVar13[uVar16] != 'D' || (uVar6 <= uVar16 + 1)) ||
          (0x29 < (byte)pcVar13[uVar16 + 1] - 0x4f)) ||
         ((1L << ((ulong)((byte)pcVar13[uVar16 + 1] - 0x4f) & 0x3f) & 0x30100000001U) == 0))))))
    goto code_r0x00c10cfc;
    goto code_r0x00c11710;
  case 'M':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    puVar4 = (undefined8 *)0x0;
    if ((byte *)local_50._0_8_ != (byte *)0x0) {
      local_28 = FUN_00c10bfc(param_1);
      puVar4 = (undefined8 *)0x0;
      if (local_28 != 0) {
        puVar4 = (undefined8 *)FUN_00c28328(param_1,local_50,&local_28);
      }
    }
    goto joined_r0x00c11c84;
  case 'O':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    if ((byte *)local_50._0_8_ == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    local_28 = CONCAT44(local_28._4_4_,1);
    goto LAB_00c11958;
  case 'P':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    if ((byte *)local_50._0_8_ == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    puVar4 = (undefined8 *)FUN_00c25f38(param_1,local_50);
    goto LAB_00c1164c;
  case 'R':
    *param_1 = (long)(pcVar13 + 1);
    local_50._0_8_ = FUN_00c10bfc(param_1);
    if ((byte *)local_50._0_8_ == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    local_28 = local_28 & 0xffffffff00000000;
LAB_00c11958:
    puVar4 = (undefined8 *)FUN_00c25fe4(param_1,local_50,&local_28);
    goto LAB_00c1164c;
  case 'S':
    if ((uVar6 < 2) || (pcVar13[1] != 't')) {
      local_28 = (ulong)local_28._1_7_ << 8;
      puVar4 = (undefined8 *)FUN_00c147d8(param_1,0,&local_28);
      if (puVar4 == (undefined8 *)0x0) {
        return (undefined8 *)0x0;
      }
      local_58 = puVar4;
      if (((char *)param_1[1] == (char *)*param_1) || (*(char *)*param_1 != 'I')) {
joined_r0x00c11c2c:
        if ((local_28 & 1) != 0) {
          return puVar4;
        }
        goto LAB_00c1164c;
      }
      if ((local_28 & 1) == 0) {
        FUN_00c12fcc(param_1 + 0x25,&local_58);
      }
      else if ((*(byte *)(param_1 + 0x61) & 1) == 0) goto joined_r0x00c11c2c;
      local_50._0_8_ = FUN_00c14948(param_1,0);
      if ((byte *)local_50._0_8_ == (byte *)0x0) {
        return (undefined8 *)0x0;
      }
LAB_00c11c54:
      puVar4 = (undefined8 *)FUN_00c14e14(param_1,&local_58,local_50);
      goto LAB_00c1164c;
    }
    goto code_r0x00c11640;
  case 'T':
    if (((uVar6 < 2) || (0x10 < (byte)pcVar13[1] - 0x65)) ||
       ((1 << (ulong)((byte)pcVar13[1] - 0x65 & 0x1f) & 0x14001U) == 0)) {
      puVar4 = (undefined8 *)FUN_00c14ebc(param_1);
      if (puVar4 == (undefined8 *)0x0) {
        return (undefined8 *)0x0;
      }
      local_58 = puVar4;
      if ((((char)param_1[0x61] != '\x01') || ((char *)param_1[1] == (char *)*param_1)) ||
         (*(char *)*param_1 != 'I')) goto LAB_00c1164c;
      FUN_00c12fcc(param_1 + 0x25,&local_58);
      local_50._0_8_ = FUN_00c14948(param_1,0);
      if ((byte *)local_50._0_8_ == (byte *)0x0) {
        return (undefined8 *)0x0;
      }
      goto LAB_00c11c54;
    }
code_r0x00c11640:
    puVar4 = (undefined8 *)FUN_00c25dec(param_1);
    goto joined_r0x00c11c84;
  case 'U':
code_r0x00c10cfc:
    puVar4 = (undefined8 *)FUN_00c24d58(param_1);
joined_r0x00c11c84:
    if (puVar4 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
LAB_00c1164c:
    plVar19 = (long *)param_1[0x26];
    if (plVar19 == (long *)param_1[0x27]) {
      __src = (long *)param_1[0x25];
      __n = (long)plVar19 - (long)__src;
      if (__src == param_1 + 0x28) {
        pvVar5 = malloc(__n * 2);
        if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        if (plVar19 != __src) {
          memmove(pvVar5,__src,__n);
        }
        param_1[0x25] = (long)pvVar5;
      }
      else {
        pvVar5 = realloc(__src,__n * 2);
        param_1[0x25] = (long)pvVar5;
        if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
      }
      plVar19 = (long *)((long)pvVar5 + __n);
      param_1[0x27] = (long)((long)pvVar5 + ((long)__n >> 2) * 8);
    }
    *plVar19 = (long)puVar4;
    param_1[0x26] = (long)(plVar19 + 1);
    return puVar4;
  case 'a':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) {
LAB_00c123a8:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "signed char";
    goto LAB_00c11a84;
  case 'b':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "bool";
    goto LAB_00c11b04;
  case 'c':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "char";
    goto LAB_00c11b04;
  case 'd':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "double";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 6;
    break;
  case 'e':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "long double";
LAB_00c11a84:
    *(ushort *)((long)puVar3 + 9) = uVar10 & 0xf000 | 0x540;
    uVar12 = 0xb;
    break;
  case 'f':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "float";
    goto LAB_00c114fc;
  case 'g':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "__float128";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 10;
    break;
  case 'h':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned char";
    goto LAB_00c1178c;
  case 'i':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "int";
    goto LAB_00c113e0;
  case 'j':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned int";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 0xc;
    break;
  case 'l':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "long";
    goto LAB_00c11b04;
  case 'm':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned long";
LAB_00c1178c:
    *(ushort *)((long)puVar3 + 9) = uVar10 & 0xf000 | 0x540;
    uVar12 = 0xd;
    break;
  case 'n':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    *(char **)((long)puVar4 + lVar11 + 0x20) = "__int128";
    *(undefined8 *)((long)puVar4 + lVar11 + 0x28) = 8;
    return puVar3;
  case 'o':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned __int128";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 0x11;
    break;
  case 's':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "short";
LAB_00c114fc:
    *(ushort *)((long)puVar3 + 9) = uVar10 & 0xf000 | 0x540;
    uVar12 = 5;
    break;
  case 't':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned short";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 0xe;
    break;
  case 'u':
    pbVar14 = (byte *)(pcVar13 + 1);
    *param_1 = (long)pbVar14;
    if (pbVar7 == pbVar14) {
      return (undefined8 *)0x0;
    }
    if (*pbVar14 - 0x3a < 0xfffffff6) {
      return (undefined8 *)0x0;
    }
    local_50._8_8_ = 0;
    lVar11 = 0;
    do {
      lVar18 = lVar11;
      uVar17 = local_50._8_8_;
      local_50._0_8_ = pcVar13 + lVar18 + 2;
      *param_1 = local_50._0_8_;
      uVar16 = (ulong)(byte)pcVar13[lVar18 + 1];
      local_50._8_8_ = (uVar16 + uVar17 * 10) - 0x30;
      if ((byte *)local_50._0_8_ == pbVar7) break;
      lVar11 = lVar18 + 1;
    } while (*(byte *)local_50._0_8_ - 0x30 < 10);
    if ((uVar6 - lVar18) - 2 < (ulong)local_50._8_8_) {
      return (undefined8 *)0x0;
    }
    pbVar14 = (byte *)(pcVar13 + uVar16 + uVar17 * 10 + lVar18 + -0x2e);
    *param_1 = (long)pbVar14;
    if (local_50._8_8_ == 0) {
      return (undefined8 *)0x0;
    }
    if ((pbVar14 == pbVar7) || (*pbVar14 != 0x49)) {
      puVar4 = (undefined8 *)FUN_00c14548(param_1,local_50);
    }
    else {
      *param_1 = (long)(pcVar13 + uVar16 + uVar17 * 10 + lVar18 + -0x2d);
      local_28 = FUN_00c10bfc(param_1);
      if (local_28 == 0) {
        return (undefined8 *)0x0;
      }
      pcVar13 = (char *)*param_1;
      if (pcVar13 == (char *)param_1[1]) {
        return (undefined8 *)0x0;
      }
      if (*pcVar13 != 'E') {
        return (undefined8 *)0x0;
      }
      *param_1 = (long)(pcVar13 + 1);
      puVar4 = (undefined8 *)FUN_00c255e4(param_1,local_50,&local_28);
    }
    goto LAB_00c1164c;
  case 'v':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "void";
LAB_00c11b04:
    *(ushort *)((long)puVar3 + 9) = uVar10 & 0xf000 | 0x540;
    uVar12 = 4;
    break;
  case 'w':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "wchar_t";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 7;
    break;
  case 'x':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "long long";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 9;
    break;
  case 'y':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "unsigned long long";
    *(ushort *)((long)puVar4 + lVar11 + 0x19) =
         *(ushort *)((long)puVar4 + lVar11 + 0x19) & 0xf000 | 0x540;
    uVar12 = 0x12;
    break;
  case 'z':
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar13 + 1);
    lVar11 = *(long *)((long)pvVar5 + 8);
    puVar4 = pvVar5;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c123a8;
      lVar11 = 0;
      *puVar4 = pvVar5;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar11 + 0x20;
    puVar3 = (undefined8 *)((long)puVar4 + lVar11 + 0x10);
    *puVar3 = &PTR_LAB_00cb14c0;
    uVar10 = *(ushort *)((long)puVar4 + lVar11 + 0x19);
    *(undefined1 *)((long)puVar4 + lVar11 + 0x18) = 8;
    pcVar13 = "...";
LAB_00c113e0:
    *(ushort *)((long)puVar3 + 9) = uVar10 & 0xf000 | 0x540;
    uVar12 = 3;
  }
  puVar3[2] = pcVar13;
  puVar3[3] = uVar12;
code_r0x00c11b1c:
  return puVar3;
code_r0x00c11710:
  puVar4 = (undefined8 *)FUN_00c247b8(param_1);
  goto joined_r0x00c11c84;
}

