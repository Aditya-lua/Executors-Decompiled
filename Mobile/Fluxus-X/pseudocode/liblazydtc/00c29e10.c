/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29e10
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 __gxx_personality_v0(int param_1,uint param_2,ulong param_3,long param_4,long param_5)

{
  byte bVar1;
  int iVar2;
  byte bVar3;
  char *pcVar4;
  ulong uVar5;
  byte *pbVar6;
  long lVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  byte *pbVar11;
  byte *pbVar12;
  ulong uVar13;
  byte *extraout_x9;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  long lVar17;
  long *plVar18;
  byte *pbVar19;
  byte *pbVar20;
  ulong uVar21;
  long lVar22;
  undefined **ppuStack_130;
  byte *pbStack_128;
  long lStack_120;
  code *pcStack_118;
  ulong uStack_110;
  byte *pbStack_108;
  ulong uStack_100;
  undefined8 uStack_f8;
  byte *pbStack_f0;
  byte *pbStack_e8;
  long *plStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  long lStack_c8;
  long local_b8;
  char *local_b0;
  byte *local_a8;
  long *local_a0;
  ulong local_98;
  ulong local_90;
  ulong local_88;
  byte *local_80;
  byte *local_78;
  byte *local_70;
  undefined8 local_68;
  
  if (param_1 != 1) {
    return 3;
  }
  if (param_4 == 0) {
    return 3;
  }
  if (param_5 == 0) {
    return 3;
  }
  if ((param_2 == 6) && ((long *)(param_3 & 0xffffffffffffff00) == (long *)0x434c4e47432b2b00)) {
    iVar2 = *(int *)(param_4 + -0x24);
    uVar16 = *(undefined8 *)(param_4 + -0x10);
    thunk_FUN_00c2c478(param_5,0,param_4);
    thunk_FUN_00c2c478(param_5,1,(long)iVar2);
    FUN_00c2c324(param_5,uVar16);
    if (-1 < iVar2) {
      return 7;
    }
    goto LAB_00c29eb4;
  }
  if ((param_2 & 1) != 0) {
    if ((param_2 & 0xe) != 0) {
      return 3;
    }
LAB_00c29f18:
    pcVar4 = (char *)FUN_00c2c268(param_5);
    if (pcVar4 == (char *)0x0) {
      return 8;
    }
    lVar17 = FUN_00c2c2f4(param_5);
    uVar5 = FUN_00c2c29c(param_5);
    local_70 = (byte *)(pcVar4 + 1);
    if (*pcVar4 == -1) {
      local_88 = uVar5;
    }
    else {
      local_88 = FUN_00c2a5f8(&local_70,*pcVar4,0);
    }
    pbVar11 = local_70 + 1;
    local_90 = (ulong)*local_70;
    if (local_90 == 0xff) {
      local_80 = (byte *)0x0;
    }
    else {
      uVar14 = 0;
      uVar21 = 0;
      pbVar20 = pbVar11;
      do {
        pbVar11 = pbVar20 + 1;
        bVar1 = *pbVar20;
        uVar13 = uVar14 & 0x3f;
        uVar14 = uVar14 + 7;
        uVar21 = ((ulong)bVar1 & 0x7f) << uVar13 | uVar21;
        pbVar20 = pbVar11;
      } while ((char)bVar1 < '\0');
      local_80 = pbVar11 + uVar21;
    }
    uVar14 = 0;
    local_98 = 0;
    pbVar20 = (byte *)(lVar17 + ~uVar5);
    bVar1 = *pbVar11;
    pbVar11 = pbVar11 + 1;
    do {
      pbVar19 = pbVar11 + 1;
      bVar3 = *pbVar11;
      uVar5 = uVar14 & 0x3f;
      uVar14 = uVar14 + 7;
      local_98 = ((ulong)bVar3 & 0x7f) << uVar5 | local_98;
      pbVar11 = pbVar19;
    } while ((char)bVar3 < '\0');
    local_98 = local_98 & 0xffffffff;
    pbVar11 = pbVar19 + local_98;
    local_b0 = pcVar4;
    local_a0 = (long *)(param_3 & 0xffffffffffffff00);
    local_78 = pbVar19;
    local_70 = pbVar19;
    do {
      if (pbVar11 <= local_78) break;
      pbVar6 = (byte *)FUN_00c2a5f8(&local_78,bVar1,0);
      lVar7 = FUN_00c2a5f8(&local_78,bVar1,0);
      lVar17 = FUN_00c2a5f8(&local_78,bVar1,0);
      uVar5 = 0;
      uVar14 = 0;
      pbVar12 = local_78;
      do {
        local_78 = pbVar12 + 1;
        bVar3 = *pbVar12;
        uVar21 = uVar5 & 0x3f;
        uVar5 = uVar5 + 7;
        uVar14 = ((ulong)bVar3 & 0x7f) << uVar21 | uVar14;
        pbVar12 = local_78;
      } while ((char)bVar3 < '\0');
      if ((pbVar6 <= pbVar20) && (pbVar20 < pbVar6 + lVar7)) {
        if (lVar17 == 0) {
          return 8;
        }
        lVar17 = lVar17 + local_88;
        if (uVar14 == 0) {
          if ((param_2 & 1) != 0) {
            return 8;
          }
          goto LAB_00c29ed8;
        }
        local_a8 = (byte *)(param_4 + 0x20);
        local_88 = local_90 & 0xf;
        pbVar19 = pbVar19 + uVar14 + local_98 + -1;
        local_98 = CONCAT44(local_98._4_4_,0x1c1d >> local_88);
        plVar18 = local_a0;
        uVar5 = 0;
        local_b8 = lVar17;
        goto LAB_00c2a0e0;
      }
    } while (pbVar6 <= pbVar20);
    __cxa_begin_catch(param_4);
    if (local_a0 == (long *)0x434c4e47432b2b00) {
      FUN_00c0d774(*(undefined8 *)(param_4 + -0x38));
    }
                    /* WARNING: Subroutine does not return */
    std::terminate();
  }
  if ((param_2 >> 1 & 1) == 0) {
    return 3;
  }
  if (((param_2 ^ 0xffffffff) & 0xc) != 0) goto LAB_00c29f18;
  lVar17 = 0;
LAB_00c29ed8:
  uVar21 = 0;
  goto LAB_00c29edc;
LAB_00c2a0e0:
  uVar14 = 0;
  uVar21 = 0;
  pbVar11 = pbVar19;
  do {
    pbVar20 = pbVar11 + 1;
    bVar1 = *pbVar11;
    uVar13 = uVar14 & 0x3f;
    uVar14 = uVar14 + 7;
    uVar21 = ((ulong)bVar1 & 0x7f) << uVar13 | uVar21;
    pbVar11 = pbVar20;
  } while ((char)bVar1 < '\0');
  uVar13 = -1L << (uVar14 & 0x3f);
  if (0x3f < uVar14 || bVar1 < 0x40) {
    uVar13 = 0;
  }
  uVar21 = uVar21 | uVar13;
  if ((long)uVar21 < 1) {
    uVar14 = (ulong)((uint)(uVar21 == 0) | (uint)uVar5);
    if (((param_2 >> 3 & 1) == 0) && (uVar21 != 0)) {
      lVar7 = FUN_00c292fc(param_4);
      if (plVar18 != (long *)0x434c4e47432b2b00) goto joined_r0x00c2a35c;
      pbVar6 = local_a8;
      if (lVar7 == 0x434c4e47432b2b01) {
        pbVar6 = *(byte **)(param_4 + -0x58);
      }
      if ((pbVar6 == (byte *)0x0) || (*(long *)(param_4 + -0x50) == 0)) goto LAB_00c2a39c;
      uVar13 = FUN_00c2a7a0(uVar21,local_80,local_90,*(long *)(param_4 + -0x50),pbVar6,param_4,0);
      uVar14 = uVar5;
      lVar17 = local_b8;
      pbVar11 = pbVar6;
      if ((uVar13 & 1) != 0) goto joined_r0x00c2a364;
    }
  }
  else {
    if (((local_80 == (byte *)0x0) || (0xc < (uint)local_88)) || ((local_98 & 1) == 0)) {
      FUN_00c2a5c8(plVar18 == (long *)0x434c4e47432b2b00,param_4);
LAB_00c2a39c:
      __cxa_begin_catch(param_4);
      lVar17 = FUN_00c0d774(*(undefined8 *)(param_4 + -0x38));
      pcStack_118 = __cxa_call_unexpected;
      uStack_f8 = 0x434c4e47432b2b00;
      lStack_120 = (long)register0x00000008 + -0x60;
      uStack_110 = uVar5;
      pbStack_108 = pbVar6;
      uStack_100 = uVar21;
      pbStack_f0 = pbVar19;
      pbStack_e8 = pbVar20;
      plStack_e0 = plVar18;
      uStack_d8 = (ulong)param_2;
      lStack_d0 = param_5;
      lStack_c8 = param_4;
      if (lVar17 == 0) {
        __cxa_begin_catch();
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      __cxa_begin_catch();
      uVar5 = FUN_00c29308(lVar17);
      if ((uVar5 & 1) == 0) {
        uVar9 = std::get_terminate();
        uVar16 = std::get_unexpected();
        uVar15 = 0;
        lVar7 = 0;
      }
      else {
        uVar16 = *(undefined8 *)(lVar17 + -0x40);
        uVar9 = *(undefined8 *)(lVar17 + -0x38);
        lVar7 = lVar17 + -0x60;
        pbVar19 = *(byte **)(lVar17 + -0x18);
        uVar15 = *(undefined8 *)(lVar17 + -0x10);
        plVar18 = (long *)(long)*(int *)(lVar17 + -0x24);
      }
      FUN_00c0d728(uVar16);
      __cxa_begin_catch();
      if ((uVar5 & 1) == 0) goto LAB_00c2a538;
      pbStack_128 = pbVar19 + 1;
      FUN_00c2a5f8(&pbStack_128,*pbVar19,uVar15);
      bVar1 = *pbStack_128;
      if (bVar1 != 0xff) goto LAB_00c2a454;
      do {
        FUN_00c0d774(uVar9);
        pbStack_128 = extraout_x9;
LAB_00c2a454:
        uVar5 = 0;
        uVar14 = 0;
        pbVar11 = pbStack_128 + 1;
        do {
          pbVar20 = pbVar11 + 1;
          bVar3 = *pbVar11;
          uVar21 = uVar5 & 0x3f;
          uVar5 = uVar5 + 7;
          uVar14 = ((ulong)bVar3 & 0x7f) << uVar21 | uVar14;
          pbVar11 = pbVar20;
        } while ((char)bVar3 < '\0');
        pbStack_128 = pbVar20;
        plVar8 = (long *)__cxa_get_globals_fast();
        lVar22 = *plVar8;
      } while (lVar22 == 0);
      bVar3 = FUN_00c29308(lVar22 + 0x60);
      if ((bVar3 & lVar22 != lVar7) == 1) {
        uVar16 = *(undefined8 *)(lVar22 + 0x10);
        lVar7 = FUN_00c292fc(lVar22 + 0x60);
        if (lVar7 == 0x434c4e47432b2b01) {
          lVar7 = *(long *)(lVar22 + 8);
        }
        else {
          lVar7 = lVar22 + 0x80;
        }
        uVar5 = FUN_00c2a7a0(plVar18,pbVar20 + uVar14,bVar1,uVar16,lVar7,lVar17,uVar15);
        if ((uVar5 & 1) == 0) {
          lVar17 = plVar8[1];
          *(int *)(lVar22 + 0x38) = -*(int *)(lVar22 + 0x38);
          *(int *)(plVar8 + 1) = (int)lVar17 + 1;
          __cxa_end_catch();
          __cxa_end_catch();
          __cxa_begin_catch(lVar22 + 0x60);
          uVar16 = __cxa_rethrow();
          std::bad_exception::~bad_exception((bad_exception *)&ppuStack_130);
          __cxa_end_catch();
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar16);
        }
      }
      pbVar19 = &std::bad_exception::vtable;
      ppuStack_130 = &PTR__bad_exception_00cb04d8;
      uVar5 = FUN_00c2a7a0(plVar18,pbVar20 + uVar14,bVar1,&std::bad_exception::typeinfo,
                           &ppuStack_130,lVar17,uVar15);
      if ((uVar5 & 1) != 0) {
        std::bad_exception::~bad_exception((bad_exception *)&ppuStack_130);
LAB_00c2a538:
        __cxa_end_catch();
        FUN_00c0d774(uVar9);
      }
      __cxa_end_catch();
      puVar10 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar10 = pbVar19 + 0x10;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar10,&std::bad_exception::typeinfo,std::bad_exception::~bad_exception);
    }
    local_68 = local_80 + *(long *)(&DAT_0078d6f8 + local_88 * 8) * uVar21;
    plVar8 = (long *)FUN_00c2a5f8(&local_68,local_90,0);
    if (plVar8 == (long *)0x0) {
      lVar7 = FUN_00c292fc(param_4);
joined_r0x00c2a35c:
      lVar17 = local_b8;
      pbVar11 = local_a8;
      if (lVar7 == 0x434c4e47432b2b01) {
        pbVar11 = *(byte **)(param_4 + -0x58);
      }
      goto joined_r0x00c2a364;
    }
    if (plVar18 == (long *)0x434c4e47432b2b00) {
      lVar17 = FUN_00c292fc(param_4);
      local_68 = local_a8;
      if (lVar17 == 0x434c4e47432b2b01) {
        local_68 = *(byte **)(param_4 + -0x58);
      }
      plVar18 = plVar8;
      if ((local_68 == (byte *)0x0) || (*(long *)(param_4 + -0x50) == 0)) goto LAB_00c2a39c;
      uVar14 = (**(code **)(*plVar8 + 0x20))(plVar8,*(long *)(param_4 + -0x50),&local_68);
      plVar18 = local_a0;
      lVar17 = local_b8;
      pbVar11 = local_68;
      if ((uVar14 & 1) != 0) goto joined_r0x00c2a364;
    }
    uVar14 = uVar5;
  }
  uVar5 = 0;
  uVar21 = 0;
  pbVar11 = pbVar20;
  do {
    bVar1 = *pbVar11;
    uVar13 = uVar5 & 0x3f;
    uVar5 = uVar5 + 7;
    uVar21 = ((ulong)bVar1 & 0x7f) << uVar13 | uVar21;
    pbVar11 = pbVar11 + 1;
  } while ((char)bVar1 < '\0');
  uVar13 = -1L << (uVar5 & 0x3f);
  if (0x3f < uVar5 || bVar1 < 0x40) {
    uVar13 = 0;
  }
  if ((uVar21 | uVar13) == 0) goto LAB_00c2a2ac;
  pbVar19 = pbVar20 + (uVar21 | uVar13);
  uVar5 = uVar14;
  goto LAB_00c2a0e0;
LAB_00c2a2ac:
  if (((uint)uVar14 & (param_2 & 2) >> 1) == 0) {
    return 8;
  }
  pbVar19 = (byte *)0x0;
  uVar21 = 0;
  plVar18 = local_a0;
  lVar17 = local_b8;
  pbVar11 = (byte *)0x0;
joined_r0x00c2a364:
  if ((param_2 & 1) != 0) {
    if (plVar18 == (long *)0x434c4e47432b2b00) {
      *(int *)(param_4 + -0x24) = (int)uVar21;
      *(byte **)(param_4 + -0x20) = pbVar19;
      *(char **)(param_4 + -0x18) = local_b0;
      *(long *)(param_4 + -0x10) = lVar17;
      *(byte **)(param_4 + -8) = pbVar11;
      return 6;
    }
    return 6;
  }
  local_b8 = lVar17;
LAB_00c29edc:
  thunk_FUN_00c2c478(param_5,0,param_4);
  thunk_FUN_00c2c478(param_5,1,uVar21);
  FUN_00c2c324(param_5,lVar17);
  if (-1 < (long)uVar21) {
    return 7;
  }
LAB_00c29eb4:
  *(undefined8 *)(param_4 + -0x10) = 0;
  return 7;
}

