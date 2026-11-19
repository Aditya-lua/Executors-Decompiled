/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091906c
 */

int FUN_0091906c(long param_1,undefined1 *param_2)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  char *pcVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  long lVar7;
  int iVar8;
  long lVar9;
  long lVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  long lVar14;
  uint uVar15;
  undefined1 *puVar16;
  undefined *puVar17;
  undefined *puVar18;
  char *pcVar19;
  undefined1 *puVar20;
  long *plVar21;
  undefined1 auStack_98 [32];
  undefined1 *local_78;
  long local_70;
  
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  puVar16 = &DAT_002ab32c;
  lVar14 = *(long *)(param_1 + 0x20);
  local_78 = &DAT_002ab32c;
  *param_2 = 1;
  if ((*(char *)(lVar14 + 0x570) == '\x03') && ((*(ulong *)(lVar14 + 0x3a0) & 0x28) == 0x20)) {
    iVar8 = 1;
    goto LAB_0091969c;
  }
  iVar8 = FUN_00921be0(param_1);
  if ((iVar8 == 0) && (iVar8 = FUN_0091b1b4(param_1,lVar14), iVar8 == 0)) {
    lVar9 = FUN_00941e8c(param_1,"User-Agent",10);
    if (lVar9 != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12a8));
      *(undefined8 *)(param_1 + 0x12a8) = 0;
    }
    uVar15 = (uint)*(byte *)(param_1 + 0x131a);
    if (((*(byte *)(*(long *)(lVar14 + 0x3a8) + 0x8c) & 7) != 0) &&
       ((*(byte *)(param_1 + 0x131e) & 2) != 0)) {
      uVar15 = 4;
    }
    puVar18 = *(undefined **)(param_1 + 0x818);
    if (puVar18 == (undefined *)0x0) {
      if (*(char *)(param_1 + 0x1b2) < '\0') {
        puVar18 = &DAT_002bce54;
      }
      else if (uVar15 - 1 < 5) {
        puVar18 = (&PTR_DAT_00c4f530)[(char)(uVar15 - 1)];
      }
      else {
        puVar18 = &DAT_002d7152;
      }
    }
    lVar9 = *(long *)(param_1 + 0x11a8);
    if (*(long *)(param_1 + 0x11b0) != 0) {
      lVar9 = curl_maprintf("%s?%s",lVar9);
      lVar10 = lVar9;
      if (lVar9 != 0) goto LAB_009191d4;
LAB_009191c8:
      iVar8 = 0x1b;
      goto LAB_0091969c;
    }
    lVar10 = 0;
LAB_009191d4:
    iVar8 = FUN_00919fec(param_1,lVar14,puVar18,uVar15,lVar9,0);
    (*(code *)PTR_free_00cc4678)(lVar10);
    if (iVar8 == 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12c8));
      *(undefined8 *)(param_1 + 0x12c8) = 0;
      if ((*(long *)(param_1 + 0x11c0) != 0) &&
         (lVar9 = FUN_00941e8c(param_1,"Referer",7), lVar9 == 0)) {
        lVar9 = curl_maprintf("Referer: %s\r\n",*(undefined8 *)(param_1 + 0x11c0));
        *(long *)(param_1 + 0x12c8) = lVar9;
        if (lVar9 == 0) goto LAB_009191c8;
      }
      lVar9 = FUN_00941e8c(param_1,"Accept-Encoding",0xf);
      if ((lVar9 == 0) && (*(long *)(param_1 + 0x840) != 0)) {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b0));
        *(undefined8 *)(param_1 + 0x12b0) = 0;
        lVar9 = curl_maprintf("Accept-Encoding: %s\r\n",*(undefined8 *)(param_1 + 0x840));
        *(long *)(param_1 + 0x12b0) = lVar9;
        if (lVar9 == 0) goto LAB_009191c8;
      }
      else {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b0));
        *(undefined8 *)(param_1 + 0x12b0) = 0;
      }
      iVar8 = FUN_0091c36c(param_1);
      if ((iVar8 == 0) && (iVar8 = FUN_0091b654(param_1,uVar15,&local_78), iVar8 == 0)) {
        lVar9 = FUN_00941e8c(param_1,"Accept",6);
        iVar8 = FUN_0091c060(param_1,uVar15);
        if (iVar8 == 0) {
          if (*(char *)(param_1 + 0x1319) == '\n') {
            puVar17 = &DAT_002a36b1;
          }
          else {
            puVar17 = &DAT_002a36b1;
            if ((*(char *)(lVar14 + 0x574) != '\n') &&
               (puVar17 = &DAT_002a36b1, *(char *)(param_1 + 0x1318) != '\x01')) {
              puVar17 = &UNK_002af2ab;
            }
          }
          FUN_00904528(auStack_98,0x100000);
          FUN_0090456c(param_1 + 0xc60);
          iVar8 = FUN_009048cc(auStack_98,&DAT_002ab558,puVar18);
          if ((iVar8 == 0) && (iVar8 = FUN_0091b3e0(param_1,lVar14,auStack_98), iVar8 == 0)) {
            puVar12 = (undefined1 *)0x0;
            if ((*(byte *)(lVar14 + 0x3a1) & 1) != 0) {
              lVar10 = FUN_00941e8c(param_1,"Alt-Used",8);
              puVar12 = (undefined1 *)0x0;
              if ((lVar10 == 0) &&
                 (puVar12 = (undefined1 *)
                            curl_maprintf("Alt-Used: %s:%d\r\n",*(undefined8 *)(lVar14 + 0x80),
                                          *(undefined4 *)(lVar14 + 0x564)),
                 puVar12 == (undefined1 *)0x0)) {
                FUN_00904534(auStack_98);
                iVar8 = 0x1b;
                goto LAB_0091969c;
              }
            }
            puVar1 = &DAT_002ab32c;
            if (*(undefined1 **)(param_1 + 0x12d0) != (undefined1 *)0x0) {
              puVar1 = *(undefined1 **)(param_1 + 0x12d0);
            }
            puVar2 = &DAT_002ab32c;
            if (*(undefined1 **)(param_1 + 0x1300) != (undefined1 *)0x0) {
              puVar2 = *(undefined1 **)(param_1 + 0x1300);
            }
            puVar3 = &DAT_002ab32c;
            if (*(undefined1 **)(param_1 + 0x12b8) != (undefined1 *)0x0) {
              puVar3 = *(undefined1 **)(param_1 + 0x12b8);
            }
            if ((*(byte *)(param_1 + 0x131d) & 1) != 0) {
              puVar16 = &DAT_002ab32c;
              if (*(undefined1 **)(param_1 + 0x12c0) != (undefined1 *)0x0) {
                puVar16 = *(undefined1 **)(param_1 + 0x12c0);
              }
            }
            puVar20 = &DAT_002ab32c;
            if (*(char **)(param_1 + 0x890) == (char *)0x0) {
              puVar11 = &DAT_002ab32c;
            }
            else {
              puVar11 = &DAT_002ab32c;
              if (**(char **)(param_1 + 0x890) != '\0') {
                puVar11 = &DAT_002ab32c;
                if (*(undefined1 **)(param_1 + 0x12a8) != (undefined1 *)0x0) {
                  puVar11 = *(undefined1 **)(param_1 + 0x12a8);
                }
              }
            }
            pcVar4 = "Accept: */*\r\n";
            if (lVar9 != 0) {
              pcVar4 = "";
            }
            puVar5 = &DAT_002ab32c;
            if (*(undefined1 **)(param_1 + 0x12e8) != (undefined1 *)0x0) {
              puVar5 = *(undefined1 **)(param_1 + 0x12e8);
            }
            if ((*(char **)(param_1 + 0x840) != (char *)0x0) &&
               (puVar20 = &DAT_002ab32c, **(char **)(param_1 + 0x840) != '\0')) {
              puVar20 = &DAT_002ab32c;
              if (*(undefined1 **)(param_1 + 0x12b0) != (undefined1 *)0x0) {
                puVar20 = *(undefined1 **)(param_1 + 0x12b0);
              }
            }
            puVar13 = &DAT_002ab32c;
            if (*(long *)(param_1 + 0x11c0) != 0) {
              puVar13 = &DAT_002ab32c;
              if (*(undefined1 **)(param_1 + 0x12c8) != (undefined1 *)0x0) {
                puVar13 = *(undefined1 **)(param_1 + 0x12c8);
              }
            }
            pcVar19 = "";
            if ((*(ulong *)(lVar14 + 0x3a0) & 9) == 1) {
              lVar9 = FUN_00941e8c(param_1,"Proxy-Connection",0x10);
              pcVar19 = "";
              if (lVar9 == 0) {
                if (((*(byte *)(lVar14 + 0x3a0) >> 5 & 1) == 0) ||
                   ((*(byte *)(param_1 + 0xa82) >> 3 & 1) == 0)) {
                  plVar21 = *(long **)(param_1 + 0x340);
                }
                else {
                  plVar21 = *(long **)(param_1 + 0x6c0);
                }
                for (; plVar21 != (long *)0x0; plVar21 = (long *)plVar21[1]) {
                  iVar8 = curl_strnequal(*plVar21,"Proxy-Connection",0x10);
                  if ((iVar8 != 0) && (lVar9 = *plVar21, (*(byte *)(lVar9 + 0x10) & 0xfe) == 0x3a))
                  goto LAB_00919554;
                }
                lVar9 = 0;
LAB_00919554:
                pcVar19 = "Proxy-Connection: Keep-Alive\r\n";
                if (lVar9 != 0) {
                  pcVar19 = "";
                }
              }
            }
            puVar6 = &DAT_002ab32c;
            if (puVar12 != (undefined1 *)0x0) {
              puVar6 = puVar12;
            }
            iVar8 = FUN_009048cc(auStack_98," HTTP/%s\r\n%s%s%s%s%s%s%s%s%s%s%s%s",puVar17,puVar1,
                                 puVar2,puVar3,puVar16,puVar11,pcVar4,puVar5,puVar20,puVar13,pcVar19
                                 ,local_78,puVar6);
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b8));
            *(undefined8 *)(param_1 + 0x12b8) = 0;
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1300));
            *(undefined8 *)(param_1 + 0x1300) = 0;
            (*(code *)PTR_free_00cc4678)(puVar12);
            if (iVar8 == 0) {
              if ((((*(byte *)(*(long *)(lVar14 + 0x3a8) + 0x94) & 1) == 0) &&
                  (*(byte *)(lVar14 + 0x574) < 0x14)) && (*(char *)(param_1 + 0x1318) == '\x03')) {
                FUN_00904534(auStack_98);
                iVar8 = 1;
                goto LAB_0091969c;
              }
              iVar8 = FUN_0091bd44(param_1,lVar14,auStack_98);
              if (((iVar8 == 0) && (iVar8 = FUN_0091afe4(param_1,auStack_98), iVar8 == 0)) &&
                 ((iVar8 = FUN_0091ac70(param_1,0,auStack_98), iVar8 == 0 &&
                  (iVar8 = FUN_0091ba64(param_1,auStack_98,uVar15), iVar8 == 0)))) {
                iVar8 = FUN_00932b04(param_1,auStack_98);
                FUN_00904534(auStack_98);
                if (iVar8 == 0) {
                  if (0x13 < *(byte *)(lVar14 + 0x574)) {
                    uVar15 = *(uint *)(param_1 + 0x1b1);
                    iVar8 = 0;
                    if ((uVar15 >> 0xd & 1) != 0) {
                      iVar8 = 0;
                      *(uint *)(param_1 + 0x1b1) = uVar15 & 0xffffdfff;
                    }
                  }
                  goto LAB_0091969c;
                }
                goto LAB_00919684;
              }
            }
          }
          FUN_00904534(auStack_98);
        }
      }
    }
  }
LAB_00919684:
  if (iVar8 == 100) {
    FUN_00904b80(param_1,"HTTP request too large");
  }
LAB_0091969c:
  if (*(long *)(lVar7 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar8;
}

