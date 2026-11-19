/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed524
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::money_get<char, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> > >::__do_get(std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >&, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, bool, std::__ndk1::locale const&, unsigned int, unsigned int&,
   bool&, std::__ndk1::ctype<char> const&, std::__ndk1::unique_ptr<char, void (*)(void*)>&, char*&,
   char*) */

undefined8
std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__do_get(long *param_1,long *param_2,byte param_3,locale *param_4,uint param_5,uint *param_6,
        undefined1 *param_7,long param_8,long *param_9,long *param_10,undefined1 *param_11)

{
  char *pcVar1;
  char *pcVar2;
  basic_string_conflict bVar3;
  pattern pVar4;
  byte *pbVar5;
  bool bVar6;
  char cVar7;
  undefined1 uVar8;
  byte bVar9;
  int iVar10;
  long *plVar11;
  long *plVar12;
  uint *puVar13;
  void *__dest;
  long *plVar14;
  size_t sVar15;
  char *pcVar16;
  void *pvVar17;
  ulong uVar18;
  char *pcVar19;
  ulong uVar20;
  undefined1 *puVar21;
  ulong uVar22;
  ulong *puVar23;
  uint *puVar24;
  byte *pbVar25;
  uint *puVar26;
  uint *puVar27;
  uint *puVar28;
  bool bVar29;
  void *pvVar30;
  undefined8 uVar31;
  uint *puVar32;
  uint uVar33;
  ulong uVar34;
  code *pcVar35;
  char *pcVar36;
  ulong *local_2b0;
  uint *local_290;
  int local_284;
  ulong local_280;
  ulong local_278;
  void *local_270;
  ulong local_268;
  ulong local_260;
  char *local_258;
  ulong local_250;
  ulong local_248;
  char *local_240;
  ulong local_238;
  ulong local_230;
  char *local_228;
  undefined8 local_220;
  ulong local_218;
  byte *local_210;
  byte local_204 [4];
  byte local_200 [3];
  byte bStack_1fd;
  pattern local_1fc [3];
  char cStack_1f9;
  uint local_1f8 [100];
  uint auStack_68 [2];
  
  plVar11 = (long *)*param_1;
  if (plVar11 == (long *)0x0) {
LAB_00bed5bc:
    bVar6 = true;
    if (param_2 != (long *)0x0) goto LAB_00bed5c4;
LAB_00bed584:
    if (bVar6) {
LAB_00bee550:
      *param_6 = *param_6 | 4;
      return 0;
    }
    plVar11 = (long *)0x0;
  }
  else {
    if (plVar11[3] == plVar11[4]) {
      iVar10 = (**(code **)(*plVar11 + 0x48))();
      if (iVar10 == -1) {
        *param_1 = 0;
        goto LAB_00bed5bc;
      }
      bVar6 = *param_1 == 0;
    }
    else {
      bVar6 = false;
    }
    if (param_2 == (long *)0x0) goto LAB_00bed584;
LAB_00bed5c4:
    if (param_2[3] == param_2[4]) {
      iVar10 = (**(code **)(*param_2 + 0x48))(param_2);
      plVar11 = (long *)0x0;
      if (iVar10 != -1) {
        plVar11 = param_2;
      }
      if (bVar6 == (iVar10 == -1)) goto LAB_00bee550;
    }
    else {
      plVar11 = param_2;
      if (bVar6 == false) goto LAB_00bee550;
    }
  }
  local_220 = 0;
  local_218 = 0;
  local_210 = (byte *)0x0;
  local_238 = 0;
  local_230 = 0;
  local_228 = (char *)0x0;
  local_250 = 0;
  local_248 = 0;
  local_240 = (char *)0x0;
  local_268 = 0;
  local_260 = 0;
  local_258 = (char *)0x0;
  local_280 = 0;
  local_278 = 0;
  local_270 = (void *)0x0;
                    /* try { // try from 00bed600 to 00bed637 has its CatchHandler @ 00bee780 */
  __money_get<char>::__gather_info
            ((bool)(param_3 & 1),param_4,local_1fc,(char *)local_200,(char *)local_204,
             (basic_string_conflict *)&local_220,(basic_string_conflict *)&local_238,
             (basic_string_conflict *)&local_250,(basic_string_conflict *)&local_268,&local_284);
  puVar13 = local_1f8;
  pcVar16 = (char *)((ulong)&local_238 | 1);
  local_290 = auStack_68;
  local_2b0 = (ulong *)0x0;
  uVar34 = 0;
  puVar32 = local_1f8;
  pvVar17 = (void *)((ulong)&local_280 | 1);
  pcVar35 = __do_nothing;
  *param_10 = *param_9;
LAB_00bed6b4:
  plVar12 = (long *)*param_1;
  plVar14 = plVar11;
  if (plVar12 == (long *)0x0) {
LAB_00bed704:
    bVar6 = true;
    if (plVar11 != (long *)0x0) goto LAB_00bed70c;
LAB_00bed6d0:
    if (bVar6) goto LAB_00bee3d4;
  }
  else {
    if (plVar12[3] == plVar12[4]) {
                    /* try { // try from 00bed6e0 to 00bed72f has its CatchHandler @ 00bee7a8 */
      iVar10 = (**(code **)(*plVar12 + 0x48))();
      if (iVar10 == -1) {
        *param_1 = 0;
        goto LAB_00bed704;
      }
      bVar6 = *param_1 == 0;
    }
    else {
      bVar6 = false;
    }
    if (plVar11 == (long *)0x0) goto LAB_00bed6d0;
LAB_00bed70c:
    if (plVar11[3] == plVar11[4]) {
      iVar10 = (**(code **)(*plVar11 + 0x48))(plVar11);
      plVar14 = (long *)0x0;
      if (iVar10 != -1) {
        plVar14 = plVar11;
      }
      if (bVar6 == (iVar10 == -1)) goto LAB_00bee3d4;
    }
    else if (bVar6 == false) goto LAB_00bee3d4;
  }
  pcVar2 = local_228;
  uVar18 = local_230;
  uVar20 = local_238;
  pVar4 = local_1fc[uVar34];
  if ((byte)pVar4 < 2) {
    if (pVar4 == (pattern)0x0) {
      if (uVar34 != 3) goto LAB_00bee234;
    }
    else {
      if (pVar4 != (pattern)0x1) goto LAB_00bed6a8;
      if (uVar34 != 3) {
        plVar11 = (long *)*param_1;
        if ((byte *)plVar11[3] == (byte *)plVar11[4]) {
                    /* try { // try from 00beda88 to 00beda8b has its CatchHandler @ 00bee7a8 */
          uVar20 = (**(code **)(*plVar11 + 0x48))();
          uVar20 = uVar20 & 0xff;
          if ((uint)uVar20 >> 7 != 0) goto LAB_00bee660;
        }
        else {
          bVar9 = *(byte *)plVar11[3];
          uVar20 = (ulong)bVar9;
          if ((char)bVar9 < '\0') goto LAB_00bee660;
        }
        if ((*(ulong *)(*(long *)(param_8 + 0x10) + uVar20 * 8) & 1) != 0) {
          plVar11 = (long *)*param_1;
          puVar21 = (undefined1 *)plVar11[3];
          if (puVar21 == (undefined1 *)plVar11[4]) {
                    /* try { // try from 00bedaec to 00bedaef has its CatchHandler @ 00bee77c */
            uVar8 = (**(code **)(*plVar11 + 0x50))();
            if ((local_280 & 1) != 0) goto LAB_00bedafc;
LAB_00bedacc:
            bVar9 = (byte)local_280;
            if ((byte)local_280 != 0x2c) goto LAB_00bee334;
            sVar15 = 0x16;
            uVar20 = 0x30;
            pvVar30 = pvVar17;
          }
          else {
            plVar11[3] = (long)(puVar21 + 1);
            uVar8 = *puVar21;
            if ((local_280 & 1) == 0) goto LAB_00bedacc;
LAB_00bedafc:
            uVar18 = local_280 & 0xfffffffffffffffe;
            sVar15 = uVar18 - 1;
            if (local_278 != sVar15) goto LAB_00bee21c;
            if (uVar18 == 0xfffffffffffffff8) {
LAB_00bee750:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bee750 to 00bee753 has its CatchHandler @ 00bee76c */
              FUN_007fe124();
            }
            pvVar30 = local_270;
            if (0x7ffffffffffffff2 < sVar15) {
              uVar20 = 0xfffffffffffffff7;
              goto LAB_00bedd20;
            }
            uVar20 = sVar15 * 2 | 7;
            uVar18 = 0x1a;
            if (uVar20 != 0x17) {
              uVar18 = uVar20 + 1;
            }
            uVar20 = 0x17;
            if (0xb < sVar15) {
              uVar20 = uVar18;
            }
          }
          uVar18 = sVar15 + 1;
LAB_00bedd20:
                    /* try { // try from 00bedd20 to 00bedd27 has its CatchHandler @ 00bee77c */
          __dest = operator_new(uVar20);
LAB_00bee1ec:
          memmove(__dest,pvVar30,sVar15);
          if (uVar18 != 0x17) {
            operator_delete(pvVar30,uVar18);
          }
          local_280 = uVar20 | 1;
          local_278 = sVar15;
          local_270 = __dest;
LAB_00bee21c:
          pvVar30 = local_270;
          uVar20 = local_278;
          local_278 = local_278 + 1;
          do {
            *(undefined1 *)((long)pvVar30 + uVar20) = uVar8;
            ((undefined1 *)((long)pvVar30 + uVar20))[1] = 0;
LAB_00bee234:
            plVar11 = (long *)*param_1;
            bVar6 = true;
            if ((plVar11 == (long *)0x0) || (bVar6 = false, plVar11[3] != plVar11[4])) {
joined_r0x00bee250:
              if (plVar14 == (long *)0x0) goto LAB_00bee28c;
LAB_00bee254:
              if (plVar14[3] == plVar14[4]) {
                iVar10 = (**(code **)(*plVar14 + 0x48))(plVar14);
                plVar11 = (long *)0x0;
                if (iVar10 != -1) {
                  plVar11 = plVar14;
                }
                plVar14 = plVar11;
                if (bVar6 == (iVar10 == -1)) goto LAB_00bed6a8;
              }
              else if (bVar6 == false) goto LAB_00bed6a8;
            }
            else {
                    /* try { // try from 00bee270 to 00bee2df has its CatchHandler @ 00bee79c */
              iVar10 = (**(code **)(*plVar11 + 0x48))();
              if (iVar10 == -1) {
                bVar6 = true;
                *param_1 = 0;
                goto joined_r0x00bee250;
              }
              bVar6 = *param_1 == 0;
              if (plVar14 != (long *)0x0) goto LAB_00bee254;
LAB_00bee28c:
              if (bVar6 != false) goto LAB_00bed6a8;
            }
            plVar11 = (long *)*param_1;
            if ((byte *)plVar11[3] == (byte *)plVar11[4]) {
              uVar20 = (**(code **)(*plVar11 + 0x48))();
              uVar20 = uVar20 & 0xff;
              if ((uint)uVar20 >> 7 != 0) goto LAB_00bed6a8;
            }
            else {
              bVar9 = *(byte *)plVar11[3];
              uVar20 = (ulong)bVar9;
              if ((char)bVar9 < '\0') goto LAB_00bed6a8;
            }
            if ((*(ulong *)(*(long *)(param_8 + 0x10) + uVar20 * 8) & 1) == 0) goto LAB_00bed6a8;
            plVar11 = (long *)*param_1;
            puVar21 = (undefined1 *)plVar11[3];
            if (puVar21 == (undefined1 *)plVar11[4]) {
                    /* try { // try from 00bee360 to 00bee3cf has its CatchHandler @ 00bee770 */
              uVar8 = (**(code **)(*plVar11 + 0x50))();
              bVar9 = (byte)local_280;
            }
            else {
              plVar11[3] = (long)(puVar21 + 1);
              uVar8 = *puVar21;
              bVar9 = (byte)local_280;
            }
            if ((local_280 & 1) != 0) goto LAB_00bee370;
            sVar15 = 0x16;
            uVar20 = 0x30;
            pvVar30 = pvVar17;
            if (bVar9 == 0x2c) goto LAB_00bee3c4;
LAB_00bee334:
            uVar20 = (ulong)(bVar9 >> 1);
            local_280 = CONCAT71(local_280._1_7_,bVar9 + 2);
            pvVar30 = pvVar17;
          } while( true );
        }
        goto LAB_00bee660;
      }
    }
    goto LAB_00bee3d4;
  }
  if (pVar4 == (pattern)0x2) {
    pcVar36 = pcVar16;
    if ((local_2b0 == (ulong *)0x0) && (1 < uVar34)) {
      if (((param_5 >> 9 & 1) == 0) && (cStack_1f9 == '\0' || uVar34 != 2)) {
        local_2b0 = (ulong *)0x0;
        goto LAB_00bed6a8;
      }
      bVar6 = (local_238 & 1) == 0;
      if (!bVar6) {
        pcVar36 = local_228;
      }
LAB_00bedb70:
      if (local_200[uVar34 + 3] < 2) {
        uVar22 = (local_238 & 0xff) >> 1;
        if (!bVar6) {
          uVar22 = local_230;
        }
        pcVar19 = pcVar36;
        if (uVar22 != 0) {
          pcVar1 = pcVar36 + uVar22;
          do {
            if (((long)*pcVar19 < 0) ||
               ((*(ulong *)(*(long *)(param_8 + 0x10) + (long)*pcVar19 * 8) & 1) == 0))
            goto LAB_00bedd30;
            uVar22 = uVar22 - 1;
            pcVar19 = pcVar19 + 1;
          } while (uVar22 != 0);
          pcVar19 = pcVar1;
        }
LAB_00bedd30:
        sVar15 = (long)pcVar19 - (long)pcVar36;
        uVar22 = local_280 >> 1 & 0x7f;
        if ((local_280 & 1) != 0) {
          uVar22 = local_278;
        }
        if (sVar15 <= uVar22) {
          pvVar30 = pvVar17;
          if ((local_280 & 1) != 0) {
            pvVar30 = local_270;
          }
          iVar10 = memcmp((void *)((long)pvVar30 + (uVar22 - sVar15)),pcVar36,sVar15);
          if (iVar10 == 0) {
            pcVar36 = pcVar19;
          }
        }
      }
    }
    else {
      bVar6 = (local_238 & 1) == 0;
      if (!bVar6) {
        pcVar36 = local_228;
      }
      if (uVar34 != 0) goto LAB_00bedb70;
    }
    uVar22 = (uVar20 & 0xff) >> 1;
    pcVar19 = pcVar16;
    if ((uVar20 & 1) != 0) {
      uVar22 = uVar18;
      pcVar19 = pcVar2;
    }
    for (pcVar19 = pcVar19 + uVar22; pcVar36 != pcVar19; pcVar19 = pcVar19 + uVar20) {
      plVar12 = (long *)*param_1;
      plVar11 = plVar14;
      if (plVar12 == (long *)0x0) {
LAB_00bede10:
        bVar29 = true;
        bVar6 = true;
        if (plVar14 != (long *)0x0) goto LAB_00bede18;
LAB_00bedddc:
        if (bVar6) break;
      }
      else {
        if (plVar12[3] == plVar12[4]) {
                    /* try { // try from 00beddec to 00bede73 has its CatchHandler @ 00bee7ac */
          iVar10 = (**(code **)(*plVar12 + 0x48))();
          if (iVar10 == -1) {
            *param_1 = 0;
            goto LAB_00bede10;
          }
          bVar6 = *param_1 == 0;
        }
        else {
          bVar6 = false;
        }
        bVar29 = bVar6;
        if (plVar14 == (long *)0x0) goto LAB_00bedddc;
LAB_00bede18:
        if (plVar14[3] == plVar14[4]) {
          iVar10 = (**(code **)(*plVar14 + 0x48))(plVar14);
          plVar11 = (long *)0x0;
          if (iVar10 != -1) {
            plVar11 = plVar14;
          }
          plVar14 = plVar11;
          if (bVar29 == (iVar10 == -1)) break;
        }
        else if (bVar29 == false) break;
      }
      plVar14 = (long *)*param_1;
      if ((char *)plVar14[3] == (char *)plVar14[4]) {
        cVar7 = (**(code **)(*plVar14 + 0x48))();
      }
      else {
        cVar7 = *(char *)plVar14[3];
      }
      plVar14 = plVar11;
      if (cVar7 != *pcVar36) break;
      plVar11 = (long *)*param_1;
      if (plVar11[3] == plVar11[4]) {
                    /* try { // try from 00bede9c to 00bede9f has its CatchHandler @ 00bee7a4 */
        (**(code **)(*plVar11 + 0x50))();
      }
      else {
        plVar11[3] = plVar11[3] + 1;
      }
      pcVar36 = pcVar36 + 1;
      uVar20 = local_238 >> 1 & 0x7f;
      pcVar19 = pcVar16;
      if ((local_238 & 1) != 0) {
        uVar20 = local_230;
        pcVar19 = local_228;
      }
    }
    if ((param_5 >> 9 & 1) == 0) {
    }
    else {
      uVar20 = local_238 >> 1 & 0x7f;
      pcVar2 = pcVar16;
      if ((local_238 & 1) != 0) {
        uVar20 = local_230;
        pcVar2 = local_228;
      }
      if (pcVar36 != pcVar2 + uVar20) goto LAB_00bee660;
    }
  }
  else {
    if (pVar4 != (pattern)0x3) {
      if (pVar4 == (pattern)0x4) {
        uVar33 = 0;
        puVar28 = puVar32;
        puVar26 = puVar13;
LAB_00bed77c:
        plVar12 = (long *)*param_1;
        plVar11 = plVar14;
        if (plVar12 == (long *)0x0) {
LAB_00bed7cc:
          bVar29 = true;
          bVar6 = true;
          if (plVar14 == (long *)0x0) goto LAB_00bed798;
LAB_00bed7d4:
          if (plVar14[3] == plVar14[4]) {
            iVar10 = (**(code **)(*plVar14 + 0x48))(plVar14);
            plVar11 = (long *)0x0;
            if (iVar10 != -1) {
              plVar11 = plVar14;
            }
            plVar14 = plVar11;
            if (bVar29 == (iVar10 == -1)) goto LAB_00beda00;
          }
          else if (bVar29 == false) goto LAB_00beda00;
        }
        else {
          if (plVar12[3] == plVar12[4]) {
                    /* try { // try from 00bed7a8 to 00bed7f7 has its CatchHandler @ 00bee7bc */
            iVar10 = (**(code **)(*plVar12 + 0x48))();
            if (iVar10 == -1) {
              *param_1 = 0;
              goto LAB_00bed7cc;
            }
            bVar6 = *param_1 == 0;
          }
          else {
            bVar6 = false;
          }
          bVar29 = bVar6;
          if (plVar14 != (long *)0x0) goto LAB_00bed7d4;
LAB_00bed798:
          if (bVar6) goto LAB_00beda00;
        }
        plVar12 = (long *)*param_1;
        plVar14 = plVar11;
        if ((byte *)plVar12[3] == (byte *)plVar12[4]) {
                    /* try { // try from 00bed830 to 00bed8e3 has its CatchHandler @ 00bee7b8 */
          uVar20 = (**(code **)(*plVar12 + 0x48))();
          uVar20 = uVar20 & 0xff;
          if ((uint)uVar20 >> 7 == 0) goto LAB_00bed83c;
LAB_00bed84c:
          uVar18 = local_220 >> 1 & 0x7f;
          if ((local_220 & 1) != 0) {
            uVar18 = local_218;
          }
          if (((uVar18 == 0) || (uVar33 == 0)) || (uVar20 != local_204[0])) goto LAB_00beda00;
          puVar13 = puVar26;
          if (puVar28 == local_290) {
            uVar18 = (long)local_290 - (long)puVar26;
            uVar20 = 4;
            if (uVar18 != 0) {
              uVar20 = uVar18 * 2;
            }
            if (0x7ffffffffffffffe < uVar18) {
              uVar20 = 0xffffffffffffffff;
            }
            if (pcVar35 == __do_nothing) {
              puVar13 = malloc(uVar20);
              if (puVar13 != (uint *)0x0) {
                if (puVar26 != (uint *)0x0) {
                    /* try { // try from 00bed914 to 00bed91b has its CatchHandler @ 00bee798 */
                  __do_nothing(puVar26);
                }
                goto LAB_00bed91c;
              }
            }
            else {
              puVar13 = realloc(puVar26,uVar20);
              if (puVar13 != (uint *)0x0) {
LAB_00bed91c:
                puVar28 = (uint *)((long)puVar13 + uVar18);
                local_290 = (uint *)((long)puVar13 + (uVar20 & 0xfffffffffffffffc));
                pcVar35 = free;
                goto LAB_00bed938;
              }
            }
                    /* try { // try from 00bee748 to 00bee74f has its CatchHandler @ 00bee7b0 */
            __throw_bad_alloc();
            goto LAB_00bee750;
          }
LAB_00bed938:
          *puVar28 = uVar33;
          uVar33 = 0;
          puVar28 = puVar28 + 1;
          puVar26 = puVar13;
        }
        else {
          bVar9 = *(byte *)plVar12[3];
          uVar20 = (ulong)bVar9;
          if ((char)bVar9 < '\0') goto LAB_00bed84c;
LAB_00bed83c:
          if (((uint)*(undefined8 *)(*(long *)(param_8 + 0x10) + uVar20 * 8) >> 6 & 1) == 0)
          goto LAB_00bed84c;
          puVar21 = (undefined1 *)*param_10;
          if (puVar21 == param_11) {
            FUN_00bef074(param_9,param_10,&param_11);
            puVar21 = (undefined1 *)*param_10;
          }
          uVar33 = uVar33 + 1;
          *param_10 = (long)(puVar21 + 1);
          *puVar21 = (char)uVar20;
        }
        plVar11 = (long *)*param_1;
        if (plVar11[3] == plVar11[4]) {
                    /* try { // try from 00bed958 to 00bed95b has its CatchHandler @ 00bee7bc */
          (**(code **)(*plVar11 + 0x50))();
        }
        else {
          plVar11[3] = plVar11[3] + 1;
        }
        goto LAB_00bed77c;
      }
      goto LAB_00bed6a8;
    }
    uVar18 = local_250 & 0xff;
    uVar20 = (ulong)((byte)local_250._0_1_ >> 1);
    if ((local_250 & 1) != 0) {
      uVar20 = local_248;
    }
    if (uVar20 == 0) {
LAB_00bedc18:
      uVar22 = local_268 & 0xff;
      uVar20 = (ulong)((byte)local_268._0_1_ >> 1);
      if ((local_268 & 1) != 0) {
        uVar20 = local_260;
      }
      if (uVar20 != 0) {
        plVar11 = (long *)*param_1;
        if ((char *)plVar11[3] == (char *)plVar11[4]) {
          cVar7 = (**(code **)(*plVar11 + 0x48))();
          uVar22 = local_268 & 0xff;
        }
        else {
          cVar7 = *(char *)plVar11[3];
        }
        pcVar2 = (char *)((ulong)&local_268 | 1);
        if (((byte)local_268._0_1_ & 1) != 0) {
          pcVar2 = local_258;
        }
        if (cVar7 == *pcVar2) {
          plVar11 = (long *)*param_1;
          if (plVar11[3] == plVar11[4]) {
                    /* try { // try from 00bedee8 to 00bedeeb has its CatchHandler @ 00bee7a8 */
            (**(code **)(*plVar11 + 0x50))();
            uVar22 = local_268 & 0xff;
            bVar3 = local_268._0_1_;
          }
          else {
            plVar11[3] = plVar11[3] + 1;
            bVar3 = local_268._0_1_;
          }
          uVar20 = uVar22 >> 1;
          if (((byte)bVar3 & 1) != 0) {
            uVar20 = local_260;
          }
          *param_7 = 1;
          puVar23 = &local_268;
          goto LAB_00bedf1c;
        }
        uVar18 = local_250 & 0xff;
      }
      uVar20 = uVar18 >> 1;
      if ((uVar18 & 1) != 0) {
        uVar20 = local_248;
      }
      uVar18 = uVar22 >> 1;
      if ((uVar22 & 1) != 0) {
        uVar18 = local_260;
      }
      if (uVar20 == 0) {
        if (uVar18 == 0) goto LAB_00bed6a8;
      }
      else if (uVar18 != 0) goto LAB_00bee660;
      *param_7 = uVar20 != 0;
    }
    else {
      plVar11 = (long *)*param_1;
      if ((char *)plVar11[3] == (char *)plVar11[4]) {
                    /* try { // try from 00bedbd0 to 00bedceb has its CatchHandler @ 00bee7a8 */
        cVar7 = (**(code **)(*plVar11 + 0x48))();
        uVar18 = local_250 & 0xff;
      }
      else {
        cVar7 = *(char *)plVar11[3];
      }
      pcVar2 = (char *)((ulong)&local_250 | 1);
      if (((byte)local_250._0_1_ & 1) != 0) {
        pcVar2 = local_240;
      }
      if (cVar7 != *pcVar2) goto LAB_00bedc18;
      plVar11 = (long *)*param_1;
      if (plVar11[3] == plVar11[4]) {
        (**(code **)(*plVar11 + 0x50))();
        uVar18 = local_250 & 0xff;
        bVar3 = local_250._0_1_;
      }
      else {
        plVar11[3] = plVar11[3] + 1;
        bVar3 = local_250._0_1_;
      }
      puVar23 = &local_250;
      uVar20 = uVar18 >> 1;
      if (((byte)bVar3 & 1) != 0) {
        uVar20 = local_248;
      }
      *param_7 = 0;
LAB_00bedf1c:
      if (uVar20 < 2) {
        puVar23 = local_2b0;
      }
      local_2b0 = puVar23;
    }
  }
LAB_00bed6a8:
  uVar34 = uVar34 + 1;
  plVar11 = plVar14;
  if (uVar34 == 4) goto LAB_00bee3d4;
  goto LAB_00bed6b4;
LAB_00bee370:
  uVar18 = local_280 & 0xfffffffffffffffe;
  sVar15 = uVar18 - 1;
  if (local_278 == sVar15) goto code_r0x00bee384;
  goto LAB_00bee21c;
code_r0x00bee384:
  if (uVar18 == 0xfffffffffffffff8) goto LAB_00bee75c;
  uVar20 = 0xfffffffffffffff7;
  pvVar30 = local_270;
  if (sVar15 < 0x7ffffffffffffff3) {
    uVar20 = sVar15 * 2 | 7;
    uVar18 = 0x1a;
    if (uVar20 != 0x17) {
      uVar18 = uVar20 + 1;
    }
    uVar20 = 0x17;
    if (0xb < sVar15) {
      uVar20 = uVar18;
    }
LAB_00bee3c4:
    uVar18 = sVar15 + 1;
  }
  __dest = operator_new(uVar20);
  goto LAB_00bee1ec;
LAB_00beda00:
  puVar32 = puVar28;
  puVar13 = puVar26;
  if ((puVar26 != puVar28) && (uVar33 != 0)) {
    if (puVar28 == local_290) {
      uVar18 = (long)local_290 - (long)puVar26;
      uVar20 = 4;
      if (uVar18 != 0) {
        uVar20 = uVar18 * 2;
      }
      if (0x7ffffffffffffffe < uVar18) {
        uVar20 = 0xffffffffffffffff;
      }
      if (pcVar35 == __do_nothing) {
        puVar13 = malloc(uVar20);
        if (puVar13 == (uint *)0x0) goto LAB_00bee754;
        if (puVar26 != (uint *)0x0) {
                    /* try { // try from 00bedf3c to 00bedf43 has its CatchHandler @ 00bee760 */
          __do_nothing(puVar26);
        }
      }
      else {
        puVar13 = realloc(puVar26,uVar20);
        if (puVar13 == (uint *)0x0) {
LAB_00bee754:
                    /* try { // try from 00bee754 to 00bee75b has its CatchHandler @ 00bee768 */
          __throw_bad_alloc();
LAB_00bee75c:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bee75c to 00bee75f has its CatchHandler @ 00bee764 */
          FUN_007fe124();
        }
      }
      puVar28 = (uint *)((long)puVar13 + uVar18);
      local_290 = (uint *)((long)puVar13 + (uVar20 & 0xfffffffffffffffc));
      pcVar35 = free;
    }
    puVar32 = puVar28 + 1;
    *puVar28 = uVar33;
  }
  if (0 < local_284) {
    plVar11 = (long *)*param_1;
    if (plVar11 != (long *)0x0) {
      if (plVar11[3] != plVar11[4]) {
        bVar6 = false;
        goto LAB_00bedfb8;
      }
                    /* try { // try from 00bedf94 to 00bee05b has its CatchHandler @ 00bee778 */
      iVar10 = (**(code **)(*plVar11 + 0x48))();
      if (iVar10 != -1) {
        bVar6 = *param_1 == 0;
        goto LAB_00bedfb8;
      }
      *param_1 = 0;
    }
    bVar6 = true;
LAB_00bedfb8:
    if (plVar14 == (long *)0x0) {
      if (bVar6 != false) goto LAB_00bee660;
      plVar11 = (long *)0x0;
    }
    else if (plVar14[3] == plVar14[4]) {
      iVar10 = (**(code **)(*plVar14 + 0x48))(plVar14);
      plVar11 = (long *)0x0;
      if (iVar10 != -1) {
        plVar11 = plVar14;
      }
      if (bVar6 == (iVar10 == -1)) goto LAB_00bee660;
    }
    else {
      plVar11 = plVar14;
      if (bVar6 == false) goto LAB_00bee660;
    }
    plVar14 = (long *)*param_1;
    if ((byte *)plVar14[3] == (byte *)plVar14[4]) {
      bVar9 = (**(code **)(*plVar14 + 0x48))();
    }
    else {
      bVar9 = *(byte *)plVar14[3];
    }
    if (bVar9 == local_200[0]) {
      plVar12 = (long *)*param_1;
      plVar14 = plVar11;
      if (plVar12[3] == plVar12[4]) {
        (**(code **)(*plVar12 + 0x50))();
      }
      else {
        plVar12[3] = plVar12[3] + 1;
      }
joined_r0x00bee064:
      plVar11 = plVar14;
      if (0 < local_284) {
        do {
          plVar14 = (long *)*param_1;
          if (plVar14 == (long *)0x0) {
LAB_00bee0d0:
            bVar29 = true;
            bVar6 = true;
            if (plVar11 != (long *)0x0) goto LAB_00bee0d8;
LAB_00bee098:
            if (bVar6) goto LAB_00bee660;
            plVar14 = (long *)0x0;
          }
          else {
            if (plVar14[3] == plVar14[4]) {
                    /* try { // try from 00bee0ac to 00bee1cf has its CatchHandler @ 00bee7b4 */
              iVar10 = (**(code **)(*plVar14 + 0x48))();
              if (iVar10 == -1) {
                *param_1 = 0;
                goto LAB_00bee0d0;
              }
              bVar6 = *param_1 == 0;
            }
            else {
              bVar6 = false;
            }
            bVar29 = bVar6;
            if (plVar11 == (long *)0x0) goto LAB_00bee098;
LAB_00bee0d8:
            if (plVar11[3] == plVar11[4]) {
              iVar10 = (**(code **)(*plVar11 + 0x48))(plVar11);
              plVar14 = (long *)0x0;
              if (iVar10 != -1) {
                plVar14 = plVar11;
              }
              if (bVar29 == (iVar10 == -1)) goto LAB_00bee660;
            }
            else {
              plVar14 = plVar11;
              if (bVar29 == false) goto LAB_00bee660;
            }
          }
          plVar11 = (long *)*param_1;
          if ((byte *)plVar11[3] == (byte *)plVar11[4]) {
            uVar20 = (**(code **)(*plVar11 + 0x48))();
            uVar20 = uVar20 & 0xff;
            if ((uint)uVar20 >> 7 != 0) goto LAB_00bee660;
          }
          else {
            bVar9 = *(byte *)plVar11[3];
            uVar20 = (ulong)bVar9;
            if ((char)bVar9 < '\0') goto LAB_00bee660;
          }
          if (((uint)*(undefined8 *)(*(long *)(param_8 + 0x10) + uVar20 * 8) >> 6 & 1) == 0)
          goto LAB_00bee660;
          if ((undefined1 *)*param_10 == param_11) {
            FUN_00bef074(param_9,param_10,&param_11);
          }
          plVar11 = (long *)*param_1;
          if ((undefined1 *)plVar11[3] == (undefined1 *)plVar11[4]) {
            uVar8 = (**(code **)(*plVar11 + 0x48))();
          }
          else {
            uVar8 = *(undefined1 *)plVar11[3];
          }
          puVar21 = (undefined1 *)*param_10;
          *param_10 = (long)(puVar21 + 1);
          *puVar21 = uVar8;
          plVar11 = (long *)*param_1;
          local_284 = local_284 + -1;
          if (plVar11[3] != plVar11[4]) goto LAB_00bee06c;
          (**(code **)(*plVar11 + 0x50))();
          plVar11 = plVar14;
          if (local_284 < 1) break;
        } while( true );
      }
      goto LAB_00bed694;
    }
    goto LAB_00bee660;
  }
LAB_00bed694:
  if (*param_10 == *param_9) goto LAB_00bee660;
  goto LAB_00bed6a8;
LAB_00bee06c:
  plVar11[3] = plVar11[3] + 1;
  goto joined_r0x00bee064;
LAB_00bee3d4:
  if (local_2b0 != (ulong *)0x0) {
    uVar34 = (ulong)(byte)((byte)*local_2b0 >> 1);
    if (((byte)*local_2b0 & 1) != 0) {
      uVar34 = local_2b0[1];
    }
    if (1 < uVar34) {
      uVar34 = 2;
      uVar20 = 1;
      do {
        uVar18 = uVar34;
        plVar11 = (long *)*param_1;
        if (plVar11 == (long *)0x0) {
LAB_00bee488:
          bVar29 = true;
          bVar6 = true;
          if (plVar14 != (long *)0x0) goto LAB_00bee490;
LAB_00bee450:
          if (bVar6) goto LAB_00bee660;
          plVar11 = (long *)0x0;
        }
        else {
          if (plVar11[3] == plVar11[4]) {
                    /* try { // try from 00bee464 to 00bee527 has its CatchHandler @ 00bee7a0 */
            iVar10 = (**(code **)(*plVar11 + 0x48))();
            if (iVar10 == -1) {
              *param_1 = 0;
              goto LAB_00bee488;
            }
            bVar6 = *param_1 == 0;
          }
          else {
            bVar6 = false;
          }
          bVar29 = bVar6;
          if (plVar14 == (long *)0x0) goto LAB_00bee450;
LAB_00bee490:
          if (plVar14[3] == plVar14[4]) {
            iVar10 = (**(code **)(*plVar14 + 0x48))(plVar14);
            plVar11 = (long *)0x0;
            if (iVar10 != -1) {
              plVar11 = plVar14;
            }
            if (bVar29 == (iVar10 == -1)) goto LAB_00bee660;
          }
          else {
            plVar11 = plVar14;
            if (bVar29 == false) goto LAB_00bee660;
          }
        }
        plVar14 = (long *)*param_1;
        if ((byte *)plVar14[3] == (byte *)plVar14[4]) {
          bVar9 = (**(code **)(*plVar14 + 0x48))();
        }
        else {
          bVar9 = *(byte *)plVar14[3];
        }
        pbVar25 = (byte *)((long)local_2b0 + 1);
        if ((*local_2b0 & 1) != 0) {
          pbVar25 = (byte *)local_2b0[2];
        }
        if (bVar9 != pbVar25[uVar20]) goto LAB_00bee660;
        plVar14 = (long *)*param_1;
        if (plVar14[3] == plVar14[4]) {
          (**(code **)(*plVar14 + 0x50))();
        }
        else {
          plVar14[3] = plVar14[3] + 1;
        }
        uVar22 = (ulong)(byte)((byte)*local_2b0 >> 1);
        if (((byte)*local_2b0 & 1) != 0) {
          uVar22 = local_2b0[1];
        }
        uVar34 = (ulong)((int)uVar18 + 1);
        plVar14 = plVar11;
        uVar20 = uVar18;
      } while (uVar18 < uVar22);
    }
  }
  if (puVar13 == puVar32) {
    uVar31 = 1;
  }
  else {
    uVar31 = 1;
    uVar34 = local_220 >> 1 & 0x7f;
    if ((local_220 & 1) != 0) {
      uVar34 = local_218;
    }
    if ((4 < (long)puVar32 - (long)puVar13) && (uVar34 != 0)) {
      puVar32 = puVar32 + -1;
      pbVar25 = local_210;
      if (puVar13 < puVar32) {
        puVar26 = puVar32;
        puVar28 = puVar13;
        do {
          puVar24 = puVar28 + 1;
          uVar33 = *puVar28;
          *puVar28 = *puVar26;
          puVar27 = puVar26 + -1;
          *puVar26 = uVar33;
          puVar26 = puVar27;
          puVar28 = puVar24;
        } while (puVar24 < puVar27);
        puVar28 = puVar13;
        if ((local_220 & 1) == 0) {
          pbVar25 = (byte *)((long)&local_220 + 1);
          pbVar5 = (byte *)((long)&local_220 + 1);
          uVar34 = local_220 >> 1 & 0x7f;
        }
        else {
          pbVar5 = local_210;
          uVar34 = local_218;
        }
        do {
          bVar9 = *pbVar25;
          if (((bVar9 != 0) && (bVar9 != 0xff)) && (*puVar28 != (uint)bVar9)) goto LAB_00bee660;
          puVar28 = puVar28 + 1;
          if (1 < (long)(pbVar5 + (uVar34 - (long)pbVar25))) {
            pbVar25 = pbVar25 + 1;
          }
        } while (puVar28 < puVar32);
      }
      else if ((local_220 & 1) == 0) {
        pbVar25 = (byte *)((long)&local_220 + 1);
      }
      bVar9 = *pbVar25;
      uVar31 = 1;
      if (((bVar9 != 0) && (bVar9 != 0xff)) && ((uint)bVar9 <= *puVar32 - 1)) {
LAB_00bee660:
        uVar31 = 0;
        *param_6 = *param_6 | 4;
      }
    }
  }
  if ((local_280 & 1) != 0) {
    operator_delete(local_270,local_280 & 0xfffffffffffffffe);
  }
  if ((local_268 & 1) != 0) {
    operator_delete(local_258,local_268 & 0xfffffffffffffffe);
  }
  if ((local_250 & 1) != 0) {
    operator_delete(local_240,local_250 & 0xfffffffffffffffe);
  }
  if ((local_238 & 1) != 0) {
    operator_delete(local_228,local_238 & 0xfffffffffffffffe);
  }
  if ((local_220 & 1) != 0) {
    operator_delete(local_210,local_220 & 0xfffffffffffffffe);
  }
  if (puVar13 == (uint *)0x0) {
    return uVar31;
  }
                    /* try { // try from 00bee718 to 00bee71f has its CatchHandler @ 00bee774 */
  (*pcVar35)(puVar13);
  return uVar31;
}

