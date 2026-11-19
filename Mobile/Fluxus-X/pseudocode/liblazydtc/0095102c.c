/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095102c
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0095102c(long param_1,ulong param_2,byte param_3)

{
  bool bVar1;
  long lVar2;
  char *pcVar3;
  uint uVar4;
  byte bVar5;
  undefined8 uVar6;
  undefined *puVar7;
  undefined1 uVar8;
  int iVar9;
  char *pcVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *puVar13;
  int iVar14;
  long lVar15;
  
  lVar12 = *(long *)(param_1 + 0x1a0);
  lVar15 = *(long *)(param_1 + 0x20);
  if (param_3 - 0xd < 2) {
    puVar13 = (undefined8 *)(param_1 + 0x728);
  }
  else if (param_3 == 0xf) {
    puVar13 = (undefined8 *)(param_1 + 0x720);
  }
  else {
    puVar13 = (undefined8 *)(param_1 + 0x718);
  }
  puVar13 = (undefined8 *)*puVar13;
  iVar14 = 0;
  lVar2 = lVar15 + 0x428;
  if ((param_2 & 1) == 0) {
    iVar14 = *(int *)(lVar15 + 0x528) + 1;
  }
  *(int *)(lVar15 + 0x528) = iVar14;
  if (puVar13 != (undefined8 *)0x0) {
    if (iVar14 < 1) {
LAB_009510c0:
      pcVar10 = (char *)*puVar13;
      pcVar3 = pcVar10 + 1;
      if (*pcVar10 != '*') {
        pcVar3 = pcVar10;
      }
      *(uint *)(lVar15 + 0x52c) = (uint)(*pcVar10 == '*');
      uVar6 = FUN_009453ec(param_1,lVar2,&DAT_002b6c62,pcVar3);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      if (((((param_1 != 0) && (*(byte *)(lVar12 + 0x536) != param_3)) &&
           ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
          ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
         && (0 < DAT_00cc46c0)) {
        if (lVar12 == 0) {
          puVar7 = &DAT_002c11b5;
        }
        else {
          puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar7,(&PTR_DAT_00c508c0)[param_3]);
      }
      *(byte *)(lVar12 + 0x536) = param_3;
      return 0;
    }
    iVar9 = 1;
    do {
      puVar13 = (undefined8 *)puVar13[1];
      if (puVar13 == (undefined8 *)0x0) break;
      bVar1 = iVar9 < iVar14;
      iVar9 = iVar9 + 1;
    } while (bVar1);
    if (puVar13 != (undefined8 *)0x0) goto LAB_009510c0;
  }
  if (param_3 == 0xd) {
    if (*(int *)(lVar12 + 0x10) != 0) {
      if (((param_1 != 0) && (*(byte *)(lVar15 + 0x536) != 0)) &&
         (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0 &&
          (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
           (0 < DAT_00cc46c0)))))) {
        FUN_00905258(param_1,"[%s] -> [%s]",(&PTR_DAT_00c508c0)[*(byte *)(lVar15 + 0x536)],
                     &DAT_002c11b9);
      }
      *(undefined1 *)(lVar15 + 0x536) = 0;
      return 0;
    }
    if (*(long *)(lVar15 + 0x518) != -1) {
      FUN_00931c24(param_1,*(long *)(lVar15 + 0x518));
      uVar6 = FUN_00951f58(param_1,*(undefined8 *)(lVar15 + 0x518));
      return uVar6;
    }
    if (((*(byte *)(param_1 + 0xa86) >> 1 & 1) == 0) &&
       ((*(byte *)(param_1 + 0x131d) >> 4 & 1) == 0)) {
      uVar6 = FUN_009453ec(param_1,lVar2,"SIZE %s",*(undefined8 *)(lVar15 + 0x4e0));
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      if (((((ulong)*(byte *)(lVar12 + 0x536) != 0x18) &&
           ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
          ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
         && (0 < DAT_00cc46c0)) {
        if (lVar12 == 0) {
          puVar7 = &DAT_002c11b5;
        }
        else {
          puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar7,"RETR_SIZE");
      }
      uVar8 = 0x18;
    }
    else {
      uVar6 = FUN_009453ec(param_1,lVar2,"RETR %s",*(undefined8 *)(lVar15 + 0x4e0));
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      if ((((ulong)*(byte *)(lVar12 + 0x536) != 0x20) &&
          ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
          (0 < DAT_00cc46c0)))) {
        if (lVar12 == 0) {
          puVar7 = &DAT_002c11b5;
        }
        else {
          puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
        }
        FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002b54e5);
      }
      uVar8 = 0x20;
    }
    goto LAB_00951918;
  }
  if (param_3 == 0xe) {
    uVar6 = FUN_00952350(param_1,0);
    return uVar6;
  }
  if (param_3 == 0xf) {
    return 0;
  }
  if ((*(byte *)(lVar15 + 0x53a) >> 3 & 1) == 0) {
    *(undefined4 *)(lVar15 + 0x52c) = 0;
    if (((*(char *)(lVar15 + 0x3a0) < '\0') && (*(long *)(lVar15 + 0x4d8) != 0)) &&
       ((*(int *)(lVar15 + 0x520) == 0 || (*(char *)**(undefined8 **)(lVar15 + 0x4e8) != '/')))) {
      *(undefined4 *)(lVar15 + 0x524) = 0;
      uVar6 = FUN_009453ec(param_1,lVar2,"CWD %s");
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      if (((param_1 != 0) && (bVar5 = *(byte *)(lVar12 + 0x536), bVar5 != 0x10)) &&
         ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) {
        if (*(long *)(param_1 + 0x12a0) != 0) {
          iVar14 = *(int *)(*(long *)(param_1 + 0x12a0) + 8);
joined_r0x009511e8:
          if (iVar14 < 1) goto LAB_009517ec;
        }
joined_r0x0095173c:
        if (0 < DAT_00cc46c0) {
          if (lVar12 == 0) {
            puVar7 = &DAT_002c11b5;
          }
          else {
            puVar7 = (&PTR_DAT_00c508c0)[bVar5];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002bf378);
        }
      }
    }
    else {
      if (*(int *)(lVar15 + 0x520) == 0) {
        if (((-1 < *(char *)(param_1 + 0xa82)) && (*(char *)(param_1 + 0x528) == '\0')) ||
           (*(long *)(lVar15 + 0x4e0) == 0)) {
          if (((-1 < *(char *)(param_1 + 0x1b2)) || (*(long *)(lVar15 + 0x4e0) == 0)) ||
             (bVar5 = *(byte *)(lVar15 + 0x500),
             (*(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49) == (uint)bVar5)) goto LAB_009515ec;
          *(undefined4 *)(*(long *)(param_1 + 0x1a0) + 0x10) = 1;
          uVar4 = *(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49;
          uVar8 = (undefined1)uVar4;
          if (bVar5 == uVar4) goto LAB_00951680;
          uVar6 = FUN_009453ec(param_1,lVar15 + 0x428,"TYPE %c",uVar4);
          if ((int)uVar6 != 0) {
            return uVar6;
          }
          lVar12 = *(long *)(param_1 + 0x20);
          uVar11 = (ulong)*(byte *)(lVar12 + 0x536);
          if ((((uVar11 == 0x13) || ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0)) ||
              ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))
              )) || (DAT_00cc46c0 < 1)) goto LAB_00951974;
          if (lVar12 != 0) goto LAB_0095194c;
          puVar7 = &DAT_002c11b5;
          goto LAB_00951958;
        }
        uVar6 = FUN_009453ec(param_1,lVar15 + 0x428,"MDTM %s");
        if ((int)uVar6 != 0) {
          return uVar6;
        }
        lVar12 = *(long *)(param_1 + 0x20);
        uVar11 = (ulong)*(byte *)(lVar12 + 0x536);
        if (((uVar11 != 0x12) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
            && (0 < DAT_00cc46c0)))) {
          if (lVar12 == 0) goto LAB_00951838;
          goto LAB_0095171c;
        }
        goto LAB_00951858;
      }
      *(undefined4 *)(lVar15 + 0x524) = 1;
      uVar6 = FUN_009453ec(param_1,lVar2,"CWD %s",**(undefined8 **)(lVar15 + 0x4e8));
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      if (((param_1 != 0) && (bVar5 = *(byte *)(lVar12 + 0x536), bVar5 != 0x10)) &&
         ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) {
        if (*(long *)(param_1 + 0x12a0) != 0) {
          iVar14 = *(int *)(*(long *)(param_1 + 0x12a0) + 8);
          goto joined_r0x009511e8;
        }
        goto joined_r0x0095173c;
      }
    }
LAB_009517ec:
    uVar8 = 0x10;
  }
  else {
    if (((-1 < *(char *)(param_1 + 0xa82)) && (*(char *)(param_1 + 0x528) == '\0')) ||
       (*(long *)(lVar15 + 0x4e0) == 0)) {
      if (((-1 < *(char *)(param_1 + 0x1b2)) || (*(long *)(lVar15 + 0x4e0) == 0)) ||
         (bVar5 = *(byte *)(lVar15 + 0x500),
         (*(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49) == (uint)bVar5)) {
LAB_009515ec:
        uVar6 = FUN_00952714(param_1,lVar15);
        return uVar6;
      }
      *(undefined4 *)(*(long *)(param_1 + 0x1a0) + 0x10) = 1;
      uVar4 = *(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49;
      uVar8 = (undefined1)uVar4;
      if (bVar5 == uVar4) {
LAB_00951680:
        if ((((ulong)*(byte *)(lVar15 + 0x536) != 0x13) &&
            ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
            && (0 < DAT_00cc46c0)))) {
          FUN_00905258(param_1,"[%s] -> [%s]",(&PTR_DAT_00c508c0)[*(byte *)(lVar15 + 0x536)],
                       &DAT_002d1123);
        }
        *(undefined1 *)(lVar15 + 0x536) = 0x13;
        uVar6 = FUN_00951994(param_1,200,0x13);
        return uVar6;
      }
      uVar6 = FUN_009453ec(param_1,lVar15 + 0x428,"TYPE %c",uVar4);
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      lVar12 = *(long *)(param_1 + 0x20);
      uVar11 = (ulong)*(byte *)(lVar12 + 0x536);
      if ((((uVar11 == 0x13) || ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0)) ||
          ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
         || (DAT_00cc46c0 < 1)) goto LAB_00951974;
      if (lVar12 == 0) {
        puVar7 = &DAT_002c11b5;
      }
      else {
LAB_0095194c:
        puVar7 = (&PTR_DAT_00c508c0)[uVar11];
      }
LAB_00951958:
      FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002d1123);
LAB_00951974:
      *(undefined1 *)(lVar12 + 0x536) = 0x13;
      *(undefined1 *)(lVar15 + 0x500) = uVar8;
      return 0;
    }
    uVar6 = FUN_009453ec(param_1,lVar15 + 0x428,"MDTM %s");
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    lVar12 = *(long *)(param_1 + 0x20);
    uVar11 = (ulong)*(byte *)(lVar12 + 0x536);
    if ((((uVar11 != 0x12) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
       (0 < DAT_00cc46c0)) {
      if (lVar12 == 0) {
LAB_00951838:
        puVar7 = &DAT_002c11b5;
      }
      else {
LAB_0095171c:
        puVar7 = (&PTR_DAT_00c508c0)[uVar11];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002bd19b);
    }
LAB_00951858:
    uVar8 = 0x12;
  }
LAB_00951918:
  *(undefined1 *)(lVar12 + 0x536) = uVar8;
  return 0;
}

