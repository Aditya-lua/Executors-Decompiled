/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00927968
 */

int FUN_00927968(undefined8 param_1,long param_2,char *param_3,char *param_4,int param_5)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  char *pcVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  char cVar6;
  int iVar7;
  undefined1 *puVar8;
  undefined *puVar9;
  undefined8 *puVar10;
  char *pcVar11;
  byte bVar12;
  char *pcVar13;
  long *plVar14;
  undefined1 *puVar15;
  long lVar16;
  undefined1 *puVar17;
  
  puVar10 = (undefined8 *)(param_2 + 0x48);
  curl_slist_free_all(*puVar10);
  *puVar10 = 0;
  if (*(int *)(param_2 + 0x78) == 1) {
    *(undefined4 *)(param_2 + 0x78) = 1;
    *(undefined8 *)(param_2 + 0x80) = 0;
    *(undefined8 *)(param_2 + 0x88) = 0;
  }
  pcVar13 = *(char **)(param_2 + 0x58);
  if (pcVar13 == (char *)0x0) {
    plVar14 = *(long **)(param_2 + 0x50);
    if (plVar14 != (long *)0x0) {
LAB_009279dc:
      iVar7 = curl_strnequal(*plVar14,"Content-Type",0xc);
      if ((iVar7 == 0) || (*(char *)(*plVar14 + 0xc) != ':')) goto LAB_00927a00;
      pcVar13 = (char *)(*plVar14 + 0xc);
      do {
        pcVar13 = pcVar13 + 1;
      } while (*pcVar13 == ' ');
      goto LAB_00927a20;
    }
LAB_00927a08:
    pcVar13 = (char *)0x0;
  }
LAB_00927a20:
  pcVar11 = pcVar13;
  if (pcVar13 == (char *)0x0) {
    pcVar11 = param_3;
  }
  if (pcVar11 == (char *)0x0) {
    if (*(int *)(param_2 + 0x10) != 4) {
      if (*(int *)(param_2 + 0x10) == 2) {
        pcVar11 = (char *)FUN_009277e8(*(undefined8 *)(param_2 + 0x60));
        if (((pcVar11 == (char *)0x0) &&
            (pcVar11 = (char *)FUN_009277e8(*(undefined8 *)(param_2 + 0x18)), pcVar11 == (char *)0x0
            )) && (pcVar11 = (char *)0x0, *(long *)(param_2 + 0x60) != 0)) {
          pcVar11 = "application/octet-stream";
        }
      }
      else {
        pcVar11 = (char *)FUN_009277e8(*(undefined8 *)(param_2 + 0x60));
      }
      goto LAB_00927a2c;
    }
    pcVar11 = "multipart/mixed";
LAB_00927af8:
    lVar16 = *(long *)(param_2 + 0x38);
    puVar17 = (undefined1 *)0x0;
    if (lVar16 != 0) {
      puVar17 = (undefined1 *)(lVar16 + 0x18);
    }
    plVar14 = *(long **)(param_2 + 0x50);
  }
  else {
LAB_00927a2c:
    if (*(int *)(param_2 + 0x10) == 4) goto LAB_00927af8;
    if ((((pcVar13 == (char *)0x0) && (pcVar11 != (char *)0x0)) &&
        ((iVar7 = curl_strnequal(pcVar11,"text/plain",10), iVar7 != 0 &&
         (((byte)pcVar11[10] < 0x3c &&
          ((1L << ((ulong)(byte)pcVar11[10] & 0x3f) & 0x800000100002601U) != 0)))))) &&
       ((param_5 == 0 || (*(long *)(param_2 + 0x60) == 0)))) {
      pcVar11 = (char *)0x0;
    }
    lVar16 = 0;
    puVar17 = (undefined1 *)0x0;
    plVar14 = *(long **)(param_2 + 0x50);
  }
  if (plVar14 != (long *)0x0) {
LAB_00927b18:
    iVar7 = curl_strnequal(*plVar14,"Content-Disposition",0x13);
    if ((iVar7 == 0) || (*(char *)(*plVar14 + 0x13) != ':')) goto LAB_00927b3c;
    pcVar13 = (char *)(*plVar14 + 0x14);
    do {
      cVar6 = *pcVar13;
      pcVar13 = pcVar13 + 1;
    } while (cVar6 == ' ');
    goto LAB_00927cc4;
  }
LAB_00927b44:
  if (param_4 == (char *)0x0) {
    if ((*(long *)(param_2 + 0x60) != 0) || (*(long *)(param_2 + 0x68) != 0)) {
LAB_00927b58:
      param_4 = "attachment";
      goto LAB_00927b60;
    }
    if (pcVar11 != (char *)0x0) {
      iVar7 = curl_strnequal(pcVar11,"multipart/",10);
      if (iVar7 == 0) goto LAB_00927b58;
      goto LAB_00927cc8;
    }
LAB_00927d40:
    bVar12 = 0;
    plVar14 = *(long **)(param_2 + 0x50);
  }
  else {
LAB_00927b60:
    iVar7 = curl_strequal(param_4,"attachment");
    if ((iVar7 == 0) || (*(long *)(param_2 + 0x68) != 0)) {
      if (param_4 != (char *)0x0) {
        if (*(long *)(param_2 + 0x68) == 0) {
          puVar8 = (undefined1 *)0x0;
LAB_00927be4:
          if (*(long *)(param_2 + 0x60) == 0) {
            puVar15 = (undefined1 *)0x0;
          }
          else {
            puVar15 = (undefined1 *)FUN_00927ed0(param_1,*(long *)(param_2 + 0x60),param_5);
            if (puVar15 == (undefined1 *)0x0) goto LAB_00927c14;
          }
          pcVar13 = "; name=\"";
          puVar1 = puVar8;
          if (puVar8 == (undefined1 *)0x0) {
            pcVar13 = "";
            puVar1 = &DAT_002ab32c;
          }
          puVar2 = &DAT_002c6ec4;
          if (puVar8 == (undefined1 *)0x0) {
            puVar2 = &DAT_002ab32c;
          }
          pcVar3 = "; filename=\"";
          puVar4 = puVar15;
          if (puVar15 == (undefined1 *)0x0) {
            pcVar3 = "";
            puVar4 = &DAT_002ab32c;
          }
          puVar5 = &DAT_002c6ec4;
          if (puVar15 == (undefined1 *)0x0) {
            puVar5 = &DAT_002ab32c;
          }
          iVar7 = FUN_00927700(puVar10,"Content-Disposition: %s%s%s%s%s%s%s",param_4,pcVar13,puVar1,
                               puVar2,pcVar3,puVar4,puVar5);
        }
        else {
          puVar8 = (undefined1 *)FUN_00927ed0(param_1,*(long *)(param_2 + 0x68),param_5);
          if (puVar8 != (undefined1 *)0x0) goto LAB_00927be4;
          puVar15 = (undefined1 *)0x0;
LAB_00927c14:
          iVar7 = 0x1b;
        }
        (*(code *)PTR_free_00cc4678)(puVar8);
        (*(code *)PTR_free_00cc4678)(puVar15);
        if (iVar7 != 0) {
          return iVar7;
        }
      }
    }
    else if ((param_4 != (char *)0x0) &&
            (puVar8 = (undefined1 *)0x0, *(long *)(param_2 + 0x60) != 0)) goto LAB_00927be4;
LAB_00927cc4:
    if (pcVar11 == (char *)0x0) goto LAB_00927d40;
LAB_00927cc8:
    pcVar13 = "; boundary=";
    if (puVar17 == (undefined1 *)0x0) {
      pcVar13 = "";
      puVar17 = &DAT_002ab32c;
    }
    iVar7 = FUN_00927700(puVar10,"Content-Type: %s%s%s",pcVar11,pcVar13,puVar17);
    if (iVar7 != 0) {
      return iVar7;
    }
    bVar12 = 1;
    plVar14 = *(long **)(param_2 + 0x50);
  }
  for (; plVar14 != (long *)0x0; plVar14 = (long *)plVar14[1]) {
    iVar7 = curl_strnequal(*plVar14,"Content-Transfer-Encoding",0x19);
    if ((iVar7 != 0) && (*(char *)(*plVar14 + 0x19) == ':')) {
      pcVar13 = (char *)(*plVar14 + 0x1a);
      do {
        cVar6 = *pcVar13;
        pcVar13 = pcVar13 + 1;
      } while (cVar6 == ' ');
      goto LAB_00927de8;
    }
  }
  if (*(undefined8 **)(param_2 + 0x90) == (undefined8 *)0x0) {
    if (((bool)(param_5 != 0 | bVar12 ^ 1)) || (*(int *)(param_2 + 0x10) == 4)) goto LAB_00927de8;
    puVar9 = &DAT_002c500f;
  }
  else {
    puVar9 = (undefined *)**(undefined8 **)(param_2 + 0x90);
    if (puVar9 == (undefined *)0x0) goto LAB_00927de8;
  }
  iVar7 = FUN_00927700(puVar10,"Content-Transfer-Encoding: %s",puVar9);
  if (iVar7 != 0) {
    return iVar7;
  }
LAB_00927de8:
  if (*(int *)(param_2 + 0x78) == 1) {
    *(undefined4 *)(param_2 + 0x78) = 1;
    *(undefined8 *)(param_2 + 0x80) = *(undefined8 *)(param_2 + 0x48);
    *(undefined8 *)(param_2 + 0x88) = 0;
  }
  if (lVar16 != 0) {
    if (*(int *)(param_2 + 0x10) != 4) {
      return 0;
    }
    if (((pcVar11 == (char *)0x0) ||
        (iVar7 = curl_strnequal(pcVar11,"multipart/form-data",0x13), iVar7 == 0)) ||
       (0x3b < (byte)pcVar11[0x13])) {
      pcVar13 = (char *)0x0;
      lVar16 = *(long *)(lVar16 + 8);
    }
    else {
      pcVar13 = (char *)0x0;
      if ((1L << ((ulong)(byte)pcVar11[0x13] & 0x3f) & 0x800000100002601U) != 0) {
        pcVar13 = "form-data";
      }
      lVar16 = *(long *)(lVar16 + 8);
    }
    for (; lVar16 != 0; lVar16 = *(long *)(lVar16 + 8)) {
      iVar7 = FUN_00927968(param_1,lVar16,0,pcVar13,param_5);
      if (iVar7 != 0) {
        return iVar7;
      }
    }
  }
  return 0;
LAB_00927a00:
  plVar14 = (long *)plVar14[1];
  if (plVar14 == (long *)0x0) goto LAB_00927a08;
  goto LAB_009279dc;
LAB_00927b3c:
  plVar14 = (long *)plVar14[1];
  if (plVar14 == (long *)0x0) goto LAB_00927b44;
  goto LAB_00927b18;
}

