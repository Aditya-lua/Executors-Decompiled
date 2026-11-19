/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bef678
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::money_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::__do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >&, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, bool, std::__ndk1::locale const&, unsigned int, unsigned
   int&, bool&, std::__ndk1::ctype<wchar_t> const&, std::__ndk1::unique_ptr<wchar_t, void
   (*)(void*)>&, wchar_t*&, wchar_t*) */

undefined8
std::__ndk1::
money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
__do_get(long *param_1,long *param_2,byte param_3,locale *param_4,uint param_5,uint *param_6,
        undefined1 *param_7,long *param_8,long *param_9,long *param_10,wchar_t *param_11)

{
  ulong *puVar1;
  basic_string_conflict bVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar3;
  byte bVar4;
  pattern pVar5;
  byte *pbVar6;
  bool bVar7;
  bool bVar8;
  wchar_t wVar9;
  undefined4 uVar10;
  int iVar11;
  long *plVar12;
  long *plVar13;
  uint *puVar14;
  ulong uVar15;
  long *plVar16;
  size_t __n;
  wchar_t *pwVar17;
  ulong uVar18;
  ulong uVar19;
  undefined4 *puVar20;
  void *pvVar21;
  uint *puVar22;
  byte *pbVar23;
  uint *puVar24;
  uint *puVar25;
  int *piVar26;
  uint *puVar27;
  uint *puVar28;
  int *__s2;
  undefined8 uVar29;
  uint uVar30;
  int *piVar31;
  ulong uVar32;
  int *piVar33;
  ulong *local_2b0;
  code *local_2a0;
  uint *local_290;
  int local_284;
  ulong local_280;
  ulong local_278;
  void *local_270;
  ulong local_268;
  ulong local_260;
  int *local_258;
  ulong local_250;
  ulong local_248;
  int *local_240;
  ulong local_238;
  ulong local_230;
  int *local_228;
  undefined8 local_220;
  ulong local_218;
  byte *local_210;
  wchar_t local_204;
  undefined4 local_200;
  pattern local_1fc [3];
  char cStack_1f9;
  uint local_1f8 [100];
  uint auStack_68 [2];
  
  plVar12 = (long *)*param_1;
  if (plVar12 == (long *)0x0) {
LAB_00bef710:
    bVar7 = true;
    if (param_2 == (long *)0x0) goto LAB_00bef6ec;
LAB_00bef718:
    if ((int *)param_2[3] == (int *)param_2[4]) {
      iVar11 = (**(code **)(*param_2 + 0x48))(param_2);
    }
    else {
      iVar11 = *(int *)param_2[3];
    }
    plVar12 = (long *)0x0;
    if (iVar11 != -1) {
      plVar12 = param_2;
    }
    if (bVar7 == (iVar11 == -1)) goto LAB_00bef810;
  }
  else {
    if ((int *)plVar12[3] == (int *)plVar12[4]) {
      iVar11 = (**(code **)(*plVar12 + 0x48))();
    }
    else {
      iVar11 = *(int *)plVar12[3];
    }
    if (iVar11 == -1) {
      *param_1 = 0;
      goto LAB_00bef710;
    }
    bVar7 = *param_1 == 0;
    if (param_2 != (long *)0x0) goto LAB_00bef718;
LAB_00bef6ec:
    if (bVar7) {
LAB_00bef810:
      *param_6 = *param_6 | 4;
      return 0;
    }
    plVar12 = (long *)0x0;
  }
  local_220 = 0;
  local_218 = 0;
  local_210 = (byte *)0x0;
  local_238 = 0;
  local_230 = 0;
  local_228 = (int *)0x0;
  local_250 = 0;
  local_248 = 0;
  local_240 = (int *)0x0;
  local_268 = 0;
  local_260 = 0;
  local_258 = (int *)0x0;
  local_280 = 0;
  local_278 = 0;
  local_270 = (void *)0x0;
                    /* try { // try from 00bef77c to 00bef7b7 has its CatchHandler @ 00bf089c */
  __money_get<wchar_t>::__gather_info
            ((bool)(param_3 & 1),param_4,local_1fc,&local_200,&local_204,
             (basic_string_conflict *)&local_220,(basic_string_conflict *)&local_238,
             (basic_string_conflict *)&local_250,(basic_string_conflict *)&local_268,&local_284);
  puVar14 = local_1f8;
  piVar26 = (int *)((ulong)&local_238 | 4);
  local_290 = auStack_68;
  local_2b0 = (ulong *)0x0;
  uVar32 = 0;
  puVar28 = local_1f8;
  *param_10 = *param_9;
  local_2a0 = __do_nothing;
LAB_00bef844:
  plVar13 = (long *)*param_1;
  plVar16 = plVar12;
  if (plVar13 == (long *)0x0) {
LAB_00bef890:
    bVar7 = true;
    if (plVar12 == (long *)0x0) goto LAB_00bef884;
LAB_00bef898:
    if ((int *)plVar12[3] == (int *)plVar12[4]) {
      iVar11 = (**(code **)(*plVar12 + 0x48))(plVar12);
    }
    else {
      iVar11 = *(int *)plVar12[3];
    }
    plVar16 = (long *)0x0;
    if (iVar11 != -1) {
      plVar16 = plVar12;
    }
    if (bVar7 == (iVar11 == -1)) goto LAB_00bf052c;
  }
  else {
    if ((int *)plVar13[3] == (int *)plVar13[4]) {
                    /* try { // try from 00bef868 to 00bef8bb has its CatchHandler @ 00bf08d8 */
      iVar11 = (**(code **)(*plVar13 + 0x48))();
    }
    else {
      iVar11 = *(int *)plVar13[3];
    }
    if (iVar11 == -1) {
      *param_1 = 0;
      goto LAB_00bef890;
    }
    bVar7 = *param_1 == 0;
    if (plVar12 != (long *)0x0) goto LAB_00bef898;
LAB_00bef884:
    if (bVar7) goto LAB_00bf052c;
  }
  pVar5 = local_1fc[uVar32];
  if ((byte)pVar5 < 2) {
    if (pVar5 == (pattern)0x0) {
      if (uVar32 != 3) goto LAB_00bf03d0;
    }
    else {
      if (pVar5 != (pattern)0x1) goto LAB_00bef838;
      if (uVar32 != 3) {
        plVar12 = (long *)*param_1;
        if ((undefined4 *)plVar12[3] == (undefined4 *)plVar12[4]) {
                    /* try { // try from 00befbc4 to 00befbdf has its CatchHandler @ 00bf08d8 */
          uVar10 = (**(code **)(*plVar12 + 0x48))();
        }
        else {
          uVar10 = *(undefined4 *)plVar12[3];
        }
        uVar15 = (**(code **)(*param_8 + 0x18))(param_8,1,uVar10);
        if ((uVar15 & 1) != 0) {
          plVar12 = (long *)*param_1;
          puVar20 = (undefined4 *)plVar12[3];
          if (puVar20 == (undefined4 *)plVar12[4]) {
                    /* try { // try from 00befc1c to 00befc5f has its CatchHandler @ 00bf08b8 */
            uVar10 = (**(code **)(*plVar12 + 0x50))();
            if ((local_280 & 1) == 0) goto LAB_00befc04;
LAB_00befc2c:
            uVar15 = (local_280 & 0xfffffffffffffffe) - 1;
            if (local_278 != uVar15) goto LAB_00bf03b8;
          }
          else {
            uVar10 = *puVar20;
            plVar12[3] = (long)(puVar20 + 1);
            if ((local_280 & 1) != 0) goto LAB_00befc2c;
LAB_00befc04:
            bVar3 = local_280._0_1_;
            if (local_280._0_1_ !=
                (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 )0x8) goto LAB_00bf04dc;
            uVar15 = 4;
          }
          basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
          __grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                     *)&local_280,uVar15,1,uVar15,uVar15,0,0);
          local_278 = uVar15;
LAB_00bf03b8:
          do {
            uVar15 = local_278;
            pvVar21 = local_270;
            local_278 = local_278 + 1;
LAB_00bf03c4:
            puVar20 = (undefined4 *)((long)pvVar21 + uVar15 * 4);
            *puVar20 = uVar10;
            puVar20[1] = 0;
LAB_00bf03d0:
            plVar12 = (long *)*param_1;
            bVar8 = true;
            bVar7 = true;
            if (plVar12 == (long *)0x0) {
LAB_00bf0410:
              bVar7 = bVar8;
              if (plVar16 != (long *)0x0) goto LAB_00bf0414;
LAB_00bf0458:
              if (bVar7 != false) goto LAB_00bef838;
            }
            else {
              if ((int *)plVar12[3] == (int *)plVar12[4]) {
                    /* try { // try from 00bf03f8 to 00bf0497 has its CatchHandler @ 00bf08cc */
                iVar11 = (**(code **)(*plVar12 + 0x48))();
              }
              else {
                iVar11 = *(int *)plVar12[3];
              }
              if (iVar11 != -1) {
                bVar8 = *param_1 == 0;
                goto LAB_00bf0410;
              }
              *param_1 = 0;
              if (plVar16 == (long *)0x0) goto LAB_00bf0458;
LAB_00bf0414:
              if ((int *)plVar16[3] == (int *)plVar16[4]) {
                iVar11 = (**(code **)(*plVar16 + 0x48))(plVar16);
              }
              else {
                iVar11 = *(int *)plVar16[3];
              }
              plVar12 = (long *)0x0;
              if (iVar11 != -1) {
                plVar12 = plVar16;
              }
              plVar16 = plVar12;
              if (bVar7 == (iVar11 == -1)) goto LAB_00bef838;
            }
            plVar12 = (long *)*param_1;
            if ((undefined4 *)plVar12[3] == (undefined4 *)plVar12[4]) {
              uVar10 = (**(code **)(*plVar12 + 0x48))();
            }
            else {
              uVar10 = *(undefined4 *)plVar12[3];
            }
            uVar15 = (**(code **)(*param_8 + 0x18))(param_8,1,uVar10);
            if ((uVar15 & 1) == 0) goto LAB_00bef838;
            plVar12 = (long *)*param_1;
            puVar20 = (undefined4 *)plVar12[3];
            if (puVar20 == (undefined4 *)plVar12[4]) {
                    /* try { // try from 00bf04c0 to 00bf0523 has its CatchHandler @ 00bf0894 */
              uVar10 = (**(code **)(*plVar12 + 0x50))();
            }
            else {
              uVar10 = *puVar20;
              plVar12[3] = (long)(puVar20 + 1);
            }
            if ((local_280 & 1) == 0) {
              uVar15 = 4;
              bVar3 = local_280._0_1_;
              if (local_280._0_1_ ==
                  (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                   )0x8) goto LAB_00bf0504;
LAB_00bf04dc:
              uVar15 = (ulong)((byte)bVar3 >> 1);
              local_280 = CONCAT71(local_280._1_7_,(char)bVar3 + 2);
              pvVar21 = (void *)((ulong)&local_280 | 4);
              goto LAB_00bf03c4;
            }
            uVar15 = (local_280 & 0xfffffffffffffffe) - 1;
            if (local_278 != uVar15) goto LAB_00bf03b8;
LAB_00bf0504:
            basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            ::__grow_by((basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                         *)&local_280,uVar15,1,uVar15,uVar15,0,0);
            local_278 = uVar15;
          } while( true );
        }
        goto LAB_00bf077c;
      }
    }
    goto LAB_00bf052c;
  }
  if (pVar5 == (pattern)0x2) {
    piVar31 = local_228;
    if ((local_2b0 == (ulong *)0x0) && (1 < uVar32)) {
      if (((param_5 >> 9 & 1) == 0) && (cStack_1f9 == '\0' || uVar32 != 2)) {
        local_2b0 = (ulong *)0x0;
        goto LAB_00bef838;
      }
      piVar33 = piVar26;
      if ((local_238 & 1) != 0) {
        piVar33 = local_228;
      }
LAB_00befc84:
      uVar15 = local_238 & 0xff;
      uVar30 = (uint)uVar15 & 1;
      if ((byte)local_1fc[uVar32 - 1] < 2) {
        uVar18 = (ulong)((uint)uVar15 >> 1);
        piVar31 = piVar26;
        if ((local_238 & 1) != 0) {
          uVar18 = local_230;
          piVar31 = local_228;
        }
        if (piVar33 != piVar31 + uVar18) {
          do {
                    /* try { // try from 00befcc8 to 00befcd3 has its CatchHandler @ 00bf08c8 */
            uVar18 = (**(code **)(*param_8 + 0x18))(param_8,1,*piVar33);
            uVar15 = local_238 & 0xff;
            if ((uVar18 & 1) == 0) {
              uVar30 = (byte)local_238._0_1_ & 1;
              break;
            }
            uVar30 = (byte)local_238._0_1_ & 1;
            piVar33 = piVar33 + 1;
            uVar18 = (ulong)((byte)local_238._0_1_ >> 1);
            piVar31 = piVar26;
            if ((local_238 & 1) != 0) {
              uVar18 = local_230;
              piVar31 = local_228;
            }
          } while (piVar33 != piVar31 + uVar18);
        }
        piVar31 = local_228;
        __s2 = piVar26;
        if (uVar30 != 0) {
          __s2 = local_228;
        }
        __n = (long)piVar33 - (long)__s2;
        uVar18 = local_280 >> 1 & 0x7f;
        if ((local_280 & 1) != 0) {
          uVar18 = local_278;
        }
        if ((ulong)((long)__n >> 2) <= uVar18) {
          pvVar21 = (void *)((ulong)&local_280 | 4);
          if ((local_280 & 1) != 0) {
            pvVar21 = local_270;
          }
          iVar11 = memcmp((void *)((long)pvVar21 + (uVar18 * 4 - __n)),__s2,__n);
          if (iVar11 == 0) goto LAB_00befec0;
        }
      }
      else {
LAB_00befec0:
        __s2 = piVar33;
      }
    }
    else {
      uVar15 = local_238 & 0xff;
      uVar30 = (byte)local_238._0_1_ & 1;
      __s2 = piVar26;
      if ((local_238 & 1) != 0) {
        __s2 = local_228;
      }
      if (uVar32 != 0) {
        piVar33 = __s2;
        goto LAB_00befc84;
      }
    }
    uVar15 = uVar15 >> 1;
    piVar33 = piVar26;
    if (uVar30 != 0) {
      uVar15 = local_230;
      piVar33 = piVar31;
    }
    if (__s2 != piVar33 + uVar15) {
      do {
        plVar12 = (long *)*param_1;
        if (plVar12 == (long *)0x0) {
LAB_00beff78:
          bVar8 = true;
          bVar7 = true;
          if (plVar16 == (long *)0x0) goto LAB_00beff6c;
LAB_00beff80:
          if ((int *)plVar16[3] == (int *)plVar16[4]) {
            iVar11 = (**(code **)(*plVar16 + 0x48))(plVar16);
          }
          else {
            iVar11 = *(int *)plVar16[3];
          }
          plVar12 = (long *)0x0;
          if (iVar11 != -1) {
            plVar12 = plVar16;
          }
          plVar16 = plVar12;
          if (bVar8 == (iVar11 == -1)) break;
        }
        else {
          if ((int *)plVar12[3] == (int *)plVar12[4]) {
                    /* try { // try from 00beff50 to 00beffdb has its CatchHandler @ 00bf08d4 */
            iVar11 = (**(code **)(*plVar12 + 0x48))();
          }
          else {
            iVar11 = *(int *)plVar12[3];
          }
          if (iVar11 == -1) {
            *param_1 = 0;
            goto LAB_00beff78;
          }
          bVar8 = *param_1 == 0;
          bVar7 = bVar8;
          if (plVar16 != (long *)0x0) goto LAB_00beff80;
LAB_00beff6c:
          plVar12 = plVar16;
          if (bVar7) break;
        }
        plVar16 = (long *)*param_1;
        if ((int *)plVar16[3] == (int *)plVar16[4]) {
          iVar11 = (**(code **)(*plVar16 + 0x48))();
        }
        else {
          iVar11 = *(int *)plVar16[3];
        }
        plVar16 = plVar12;
        if (iVar11 != *__s2) break;
        plVar12 = (long *)*param_1;
        if (plVar12[3] == plVar12[4]) {
                    /* try { // try from 00bf0000 to 00bf0003 has its CatchHandler @ 00bf08c4 */
          (**(code **)(*plVar12 + 0x50))();
        }
        else {
          plVar12[3] = plVar12[3] + 4;
        }
        __s2 = __s2 + 1;
        uVar15 = local_238 >> 1 & 0x7f;
        piVar31 = piVar26;
        if ((local_238 & 1) != 0) {
          uVar15 = local_230;
          piVar31 = local_228;
        }
      } while (__s2 != piVar31 + uVar15);
    }
    if ((param_5 >> 9 & 1) == 0) {
    }
    else {
      uVar15 = local_238 >> 1 & 0x7f;
      piVar31 = piVar26;
      if ((local_238 & 1) != 0) {
        uVar15 = local_230;
        piVar31 = local_228;
      }
      if (__s2 != piVar31 + uVar15) goto LAB_00bf077c;
    }
  }
  else {
    if (pVar5 == (pattern)0x3) {
      uVar18 = local_250 & 0xff;
      uVar15 = (ulong)((byte)local_250._0_1_ >> 1);
      if ((local_250 & 1) != 0) {
        uVar15 = local_248;
      }
      if (uVar15 != 0) {
        plVar12 = (long *)*param_1;
        if ((int *)plVar12[3] == (int *)plVar12[4]) {
                    /* try { // try from 00befd24 to 00befe37 has its CatchHandler @ 00bf08d8 */
          iVar11 = (**(code **)(*plVar12 + 0x48))();
          uVar18 = local_250 & 0xff;
        }
        else {
          iVar11 = *(int *)plVar12[3];
        }
        piVar31 = (int *)((ulong)&local_250 | 4);
        if (((byte)local_250._0_1_ & 1) != 0) {
          piVar31 = local_240;
        }
        if (iVar11 == *piVar31) {
          plVar12 = (long *)*param_1;
          if (plVar12[3] == plVar12[4]) {
            (**(code **)(*plVar12 + 0x50))();
            uVar18 = local_250 & 0xff;
            bVar2 = local_250._0_1_;
          }
          else {
            plVar12[3] = plVar12[3] + 4;
            bVar2 = local_250._0_1_;
          }
          uVar15 = uVar18 >> 1;
          if (((byte)bVar2 & 1) != 0) {
            uVar15 = local_248;
          }
          *param_7 = 0;
          puVar1 = &local_250;
          if (uVar15 < 2) {
            puVar1 = local_2b0;
          }
          local_2b0 = puVar1;
          goto LAB_00bef838;
        }
      }
      uVar19 = local_268 & 0xff;
      uVar15 = (ulong)((byte)local_268._0_1_ >> 1);
      if ((local_268 & 1) != 0) {
        uVar15 = local_260;
      }
      if (uVar15 != 0) {
        plVar12 = (long *)*param_1;
        if ((int *)plVar12[3] == (int *)plVar12[4]) {
          iVar11 = (**(code **)(*plVar12 + 0x48))();
          uVar19 = local_268 & 0xff;
        }
        else {
          iVar11 = *(int *)plVar12[3];
        }
        piVar31 = (int *)((ulong)&local_268 | 4);
        if (((byte)local_268._0_1_ & 1) != 0) {
          piVar31 = local_258;
        }
        if (iVar11 == *piVar31) {
          plVar12 = (long *)*param_1;
          if (plVar12[3] == plVar12[4]) {
                    /* try { // try from 00bf00bc to 00bf00bf has its CatchHandler @ 00bf08d8 */
            (**(code **)(*plVar12 + 0x50))();
            uVar19 = local_268 & 0xff;
            bVar2 = local_268._0_1_;
          }
          else {
            plVar12[3] = plVar12[3] + 4;
            bVar2 = local_268._0_1_;
          }
          uVar15 = uVar19 >> 1;
          if (((byte)bVar2 & 1) != 0) {
            uVar15 = local_260;
          }
          *param_7 = 1;
          puVar1 = &local_268;
          if (uVar15 < 2) {
            puVar1 = local_2b0;
          }
          local_2b0 = puVar1;
          goto LAB_00bef838;
        }
        uVar18 = local_250 & 0xff;
      }
      uVar15 = uVar18 >> 1;
      if ((uVar18 & 1) != 0) {
        uVar15 = local_248;
      }
      uVar18 = uVar19 >> 1;
      if ((uVar19 & 1) != 0) {
        uVar18 = local_260;
      }
      if (uVar15 == 0) {
        if (uVar18 == 0) goto LAB_00bef838;
      }
      else if (uVar18 != 0) goto LAB_00bf077c;
      *param_7 = uVar15 != 0;
      goto LAB_00bef838;
    }
    if (pVar5 == (pattern)0x4) {
      uVar30 = 0;
      puVar27 = puVar28;
      puVar24 = puVar14;
LAB_00bef904:
      plVar13 = (long *)*param_1;
      plVar12 = plVar16;
      if (plVar13 == (long *)0x0) {
LAB_00bef950:
        bVar8 = true;
        bVar7 = true;
        if (plVar16 == (long *)0x0) goto LAB_00bef944;
LAB_00bef958:
        if ((int *)plVar16[3] == (int *)plVar16[4]) {
          iVar11 = (**(code **)(*plVar16 + 0x48))(plVar16);
        }
        else {
          iVar11 = *(int *)plVar16[3];
        }
        plVar12 = (long *)0x0;
        if (iVar11 != -1) {
          plVar12 = plVar16;
        }
        if (bVar8 == (iVar11 == -1)) goto joined_r0x00bf0058;
      }
      else {
        if ((int *)plVar13[3] == (int *)plVar13[4]) {
                    /* try { // try from 00bef928 to 00bef97b has its CatchHandler @ 00bf08e0 */
          iVar11 = (**(code **)(*plVar13 + 0x48))();
        }
        else {
          iVar11 = *(int *)plVar13[3];
        }
        if (iVar11 == -1) {
          *param_1 = 0;
          goto LAB_00bef950;
        }
        bVar8 = *param_1 == 0;
        bVar7 = bVar8;
        if (plVar16 != (long *)0x0) goto LAB_00bef958;
LAB_00bef944:
        if (bVar7) goto joined_r0x00bf0058;
      }
      plVar16 = (long *)*param_1;
      if ((wchar_t *)plVar16[3] == (wchar_t *)plVar16[4]) {
                    /* try { // try from 00bef9b0 to 00bef9f3 has its CatchHandler @ 00bf08e4 */
        wVar9 = (**(code **)(*plVar16 + 0x48))();
      }
      else {
        wVar9 = *(wchar_t *)plVar16[3];
      }
      uVar15 = (**(code **)(*param_8 + 0x18))(param_8,0x40,wVar9);
      puVar14 = puVar24;
      if ((uVar15 & 1) == 0) {
        uVar15 = local_220 >> 1 & 0x7f;
        if ((local_220 & 1) != 0) {
          uVar15 = local_218;
        }
        if (((uVar15 == 0) || (uVar30 == 0)) || (wVar9 != local_204)) goto joined_r0x00bf0058;
        if (puVar27 == local_290) {
          uVar18 = (long)local_290 - (long)puVar24;
          uVar15 = 4;
          if (uVar18 != 0) {
            uVar15 = uVar18 * 2;
          }
          if (0x7ffffffffffffffe < uVar18) {
            uVar15 = 0xffffffffffffffff;
          }
          if (local_2a0 == __do_nothing) {
            puVar14 = malloc(uVar15);
            if (puVar14 != (uint *)0x0) {
              if (puVar24 != (uint *)0x0) {
                    /* try { // try from 00befa9c to 00befaa7 has its CatchHandler @ 00bf08bc */
                __do_nothing(puVar24);
              }
              goto LAB_00befaa8;
            }
          }
          else {
            puVar14 = realloc(puVar24,uVar15);
            if (puVar14 != (uint *)0x0) {
LAB_00befaa8:
              puVar27 = (uint *)((long)puVar14 + uVar18);
              local_290 = (uint *)((long)puVar14 + (uVar15 & 0xfffffffffffffffc));
              local_2a0 = free;
              goto LAB_00befac8;
            }
          }
                    /* try { // try from 00bf0878 to 00bf087f has its CatchHandler @ 00bf08d0 */
          __throw_bad_alloc();
          goto LAB_00bf0880;
        }
LAB_00befac8:
        puVar28 = puVar27 + 1;
        *puVar27 = uVar30;
        uVar30 = 0;
      }
      else {
        pwVar17 = (wchar_t *)*param_10;
        if (pwVar17 == param_11) {
          FUN_00bf11d8(param_9,param_10,&param_11);
          pwVar17 = (wchar_t *)*param_10;
        }
        *pwVar17 = wVar9;
        uVar30 = uVar30 + 1;
        *param_10 = (long)(pwVar17 + 1);
        puVar28 = puVar27;
      }
      plVar13 = (long *)*param_1;
      plVar16 = plVar12;
      puVar27 = puVar28;
      puVar24 = puVar14;
      if (plVar13[3] == plVar13[4]) {
                    /* try { // try from 00befaec to 00befaef has its CatchHandler @ 00bf08e0 */
        (**(code **)(*plVar13 + 0x50))();
      }
      else {
        plVar13[3] = plVar13[3] + 4;
      }
      goto LAB_00bef904;
    }
  }
LAB_00bef838:
  uVar32 = uVar32 + 1;
  plVar12 = plVar16;
  if (uVar32 == 4) goto LAB_00bf052c;
  goto LAB_00bef844;
joined_r0x00bf0058:
  puVar28 = puVar27;
  puVar14 = puVar24;
  if ((puVar24 != puVar27) && (uVar30 != 0)) {
    if (puVar27 == local_290) {
      uVar18 = (long)local_290 - (long)puVar24;
      uVar15 = 4;
      if (uVar18 != 0) {
        uVar15 = uVar18 * 2;
      }
      if (0x7ffffffffffffffe < uVar18) {
        uVar15 = 0xffffffffffffffff;
      }
      if (local_2a0 == __do_nothing) {
        puVar14 = malloc(uVar15);
        if (puVar14 == (uint *)0x0) goto LAB_00bf0880;
        if (puVar24 != (uint *)0x0) {
                    /* try { // try from 00bf0110 to 00bf011b has its CatchHandler @ 00bf0888 */
          __do_nothing(puVar24);
        }
      }
      else {
        puVar14 = realloc(puVar24,uVar15);
        if (puVar14 == (uint *)0x0) {
LAB_00bf0880:
                    /* try { // try from 00bf0880 to 00bf0887 has its CatchHandler @ 00bf088c */
          __throw_bad_alloc();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bf0110 with catch @ 00bf0888
                        */
          FUN_007fe114();
        }
      }
      puVar27 = (uint *)((long)puVar14 + uVar18);
      local_290 = (uint *)((long)puVar14 + (uVar15 & 0xfffffffffffffffc));
      local_2a0 = free;
    }
    puVar28 = puVar27 + 1;
    *puVar27 = uVar30;
  }
  if (0 < local_284) {
    plVar16 = (long *)*param_1;
    if (plVar16 != (long *)0x0) {
      if ((int *)plVar16[3] == (int *)plVar16[4]) {
                    /* try { // try from 00bf0178 to 00bf023b has its CatchHandler @ 00bf0898 */
        iVar11 = (**(code **)(*plVar16 + 0x48))();
      }
      else {
        iVar11 = *(int *)plVar16[3];
      }
      if (iVar11 != -1) {
        bVar7 = *param_1 == 0;
        goto joined_r0x00bf01a8;
      }
      *param_1 = 0;
    }
    bVar7 = true;
joined_r0x00bf01a8:
    if (plVar12 == (long *)0x0) {
      if (bVar7) goto LAB_00bf077c;
      plVar16 = (long *)0x0;
    }
    else {
      if ((int *)plVar12[3] == (int *)plVar12[4]) {
        iVar11 = (**(code **)(*plVar12 + 0x48))(plVar12);
      }
      else {
        iVar11 = *(int *)plVar12[3];
      }
      plVar16 = (long *)0x0;
      if (iVar11 != -1) {
        plVar16 = plVar12;
      }
      if (bVar7 == (iVar11 == -1)) goto LAB_00bf077c;
    }
    plVar12 = (long *)*param_1;
    if ((wchar_t *)plVar12[3] == (wchar_t *)plVar12[4]) {
      wVar9 = (**(code **)(*plVar12 + 0x48))();
    }
    else {
      wVar9 = *(wchar_t *)plVar12[3];
    }
    if (wVar9 == local_200) {
      plVar13 = (long *)*param_1;
      plVar12 = plVar16;
      if (plVar13[3] == plVar13[4]) {
        (**(code **)(*plVar13 + 0x50))();
      }
      else {
        plVar13[3] = plVar13[3] + 4;
      }
joined_r0x00bf0258:
      plVar16 = plVar12;
      if (0 < local_284) {
        do {
          plVar12 = (long *)*param_1;
          if (plVar12 == (long *)0x0) {
LAB_00bf02ac:
            bVar8 = true;
            bVar7 = true;
            if (plVar16 == (long *)0x0) goto LAB_00bf029c;
LAB_00bf02b4:
            if ((int *)plVar16[3] == (int *)plVar16[4]) {
              iVar11 = (**(code **)(*plVar16 + 0x48))(plVar16);
            }
            else {
              iVar11 = *(int *)plVar16[3];
            }
            plVar12 = (long *)0x0;
            if (iVar11 != -1) {
              plVar12 = plVar16;
            }
            if (bVar8 == (iVar11 == -1)) goto LAB_00bf077c;
          }
          else {
            if ((int *)plVar12[3] == (int *)plVar12[4]) {
                    /* try { // try from 00bf0280 to 00bf03a7 has its CatchHandler @ 00bf08dc */
              iVar11 = (**(code **)(*plVar12 + 0x48))();
            }
            else {
              iVar11 = *(int *)plVar12[3];
            }
            if (iVar11 == -1) {
              *param_1 = 0;
              goto LAB_00bf02ac;
            }
            bVar8 = *param_1 == 0;
            bVar7 = bVar8;
            if (plVar16 != (long *)0x0) goto LAB_00bf02b4;
LAB_00bf029c:
            if (bVar7) goto LAB_00bf077c;
            plVar12 = (long *)0x0;
          }
          plVar16 = (long *)*param_1;
          if ((undefined4 *)plVar16[3] == (undefined4 *)plVar16[4]) {
            uVar10 = (**(code **)(*plVar16 + 0x48))();
          }
          else {
            uVar10 = *(undefined4 *)plVar16[3];
          }
          uVar15 = (**(code **)(*param_8 + 0x18))(param_8,0x40,uVar10);
          if ((uVar15 & 1) == 0) goto LAB_00bf077c;
          if ((wchar_t *)*param_10 == param_11) {
            FUN_00bf11d8(param_9,param_10,&param_11);
          }
          plVar16 = (long *)*param_1;
          if ((undefined4 *)plVar16[3] == (undefined4 *)plVar16[4]) {
            uVar10 = (**(code **)(*plVar16 + 0x48))();
            plVar16 = (long *)*param_1;
          }
          else {
            uVar10 = *(undefined4 *)plVar16[3];
          }
          puVar20 = (undefined4 *)*param_10;
          *puVar20 = uVar10;
          *param_10 = (long)(puVar20 + 1);
          local_284 = local_284 + -1;
          if (plVar16[3] != plVar16[4]) goto LAB_00bf024c;
          (**(code **)(*plVar16 + 0x50))();
          plVar16 = plVar12;
          if (local_284 < 1) break;
        } while( true );
      }
      goto LAB_00bef824;
    }
    goto LAB_00bf077c;
  }
LAB_00bef824:
  plVar16 = plVar12;
  if (*param_10 == *param_9) goto LAB_00bf077c;
  goto LAB_00bef838;
LAB_00bf024c:
  plVar16[3] = plVar16[3] + 4;
  goto joined_r0x00bf0258;
LAB_00bf052c:
  if (local_2b0 != (ulong *)0x0) {
    uVar32 = (ulong)(byte)((byte)*local_2b0 >> 1);
    if (((byte)*local_2b0 & 1) != 0) {
      uVar32 = local_2b0[1];
    }
    if (1 < uVar32) {
      uVar32 = 2;
      uVar15 = 1;
      do {
        uVar18 = uVar32;
        plVar12 = (long *)*param_1;
        if (plVar12 == (long *)0x0) {
LAB_00bf05e0:
          bVar8 = true;
          bVar7 = true;
          if (plVar16 == (long *)0x0) goto LAB_00bf05d0;
LAB_00bf05e8:
          if ((int *)plVar16[3] == (int *)plVar16[4]) {
            iVar11 = (**(code **)(*plVar16 + 0x48))(plVar16);
          }
          else {
            iVar11 = *(int *)plVar16[3];
          }
          plVar12 = (long *)0x0;
          if (iVar11 != -1) {
            plVar12 = plVar16;
          }
          if (bVar8 == (iVar11 == -1)) goto LAB_00bf077c;
        }
        else {
          if ((int *)plVar12[3] == (int *)plVar12[4]) {
                    /* try { // try from 00bf05b4 to 00bf067b has its CatchHandler @ 00bf08c0 */
            iVar11 = (**(code **)(*plVar12 + 0x48))();
          }
          else {
            iVar11 = *(int *)plVar12[3];
          }
          if (iVar11 == -1) {
            *param_1 = 0;
            goto LAB_00bf05e0;
          }
          bVar8 = *param_1 == 0;
          bVar7 = bVar8;
          if (plVar16 != (long *)0x0) goto LAB_00bf05e8;
LAB_00bf05d0:
          if (bVar7) goto LAB_00bf077c;
          plVar12 = (long *)0x0;
        }
        plVar16 = (long *)*param_1;
        if ((int *)plVar16[3] == (int *)plVar16[4]) {
          iVar11 = (**(code **)(*plVar16 + 0x48))();
        }
        else {
          iVar11 = *(int *)plVar16[3];
        }
        pbVar23 = (byte *)((long)local_2b0 + 4);
        if ((*local_2b0 & 1) != 0) {
          pbVar23 = (byte *)local_2b0[2];
        }
        if (iVar11 != *(int *)(pbVar23 + uVar15 * 4)) goto LAB_00bf077c;
        plVar16 = (long *)*param_1;
        if (plVar16[3] == plVar16[4]) {
          (**(code **)(*plVar16 + 0x50))();
        }
        else {
          plVar16[3] = plVar16[3] + 4;
        }
        uVar19 = (ulong)(byte)((byte)*local_2b0 >> 1);
        if (((byte)*local_2b0 & 1) != 0) {
          uVar19 = local_2b0[1];
        }
        uVar32 = (ulong)((int)uVar18 + 1);
        plVar16 = plVar12;
        uVar15 = uVar18;
      } while (uVar18 < uVar19);
    }
  }
  if (puVar14 == puVar28) {
    uVar29 = 1;
  }
  else {
    uVar29 = 1;
    uVar32 = local_220 >> 1 & 0x7f;
    if ((local_220 & 1) != 0) {
      uVar32 = local_218;
    }
    if ((4 < (long)puVar28 - (long)puVar14) && (uVar32 != 0)) {
      puVar28 = puVar28 + -1;
      pbVar23 = local_210;
      if (puVar14 < puVar28) {
        puVar24 = puVar28;
        puVar27 = puVar14;
        do {
          puVar22 = puVar27 + 1;
          uVar30 = *puVar27;
          *puVar27 = *puVar24;
          puVar25 = puVar24 + -1;
          *puVar24 = uVar30;
          puVar24 = puVar25;
          puVar27 = puVar22;
        } while (puVar22 < puVar25);
        puVar27 = puVar14;
        if ((local_220 & 1) == 0) {
          pbVar23 = (byte *)((long)&local_220 + 1);
          pbVar6 = (byte *)((long)&local_220 + 1);
          uVar32 = local_220 >> 1 & 0x7f;
        }
        else {
          pbVar6 = local_210;
          uVar32 = local_218;
        }
        do {
          bVar4 = *pbVar23;
          if (((bVar4 != 0) && (bVar4 != 0xff)) && (*puVar27 != (uint)bVar4)) goto LAB_00bf077c;
          puVar27 = puVar27 + 1;
          if (1 < (long)(pbVar6 + (uVar32 - (long)pbVar23))) {
            pbVar23 = pbVar23 + 1;
          }
        } while (puVar27 < puVar28);
      }
      else if ((local_220 & 1) == 0) {
        pbVar23 = (byte *)((long)&local_220 + 1);
      }
      bVar4 = *pbVar23;
      uVar29 = 1;
      if (((bVar4 != 0) && (bVar4 != 0xff)) && ((uint)bVar4 <= *puVar28 - 1)) {
LAB_00bf077c:
        uVar29 = 0;
        *param_6 = *param_6 | 4;
      }
    }
  }
  if ((local_280 & 1) != 0) {
    operator_delete(local_270,(local_280 & 0x3ffffffffffffffe) << 2);
  }
  if ((local_268 & 1) != 0) {
    operator_delete(local_258,(local_268 & 0x3ffffffffffffffe) << 2);
  }
  if ((local_250 & 1) != 0) {
    operator_delete(local_240,(local_250 & 0x3ffffffffffffffe) << 2);
  }
  if ((local_238 & 1) != 0) {
    operator_delete(local_228,(local_238 & 0x3ffffffffffffffe) << 2);
  }
  if ((local_220 & 1) != 0) {
    operator_delete(local_210,local_220 & 0xfffffffffffffffe);
  }
  if (puVar14 == (uint *)0x0) {
    return uVar29;
  }
                    /* try { // try from 00bf0844 to 00bf084f has its CatchHandler @ 00bf0890 */
  (*local_2a0)(puVar14);
  return uVar29;
}

