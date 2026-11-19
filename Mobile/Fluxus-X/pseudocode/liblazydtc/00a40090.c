/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a40090
 */

/* WARNING: Restarted to delay deadcode elimination for space: stack */

bool ossl_ed25519_verify(void *param_1,size_t param_2,void *param_3,uint *param_4,undefined8 param_5
                        ,undefined8 param_6)

{
  byte *pbVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  byte bVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  int iVar15;
  int iVar16;
  int iVar17;
  int iVar18;
  int iVar19;
  int iVar20;
  int iVar21;
  int iVar22;
  int iVar23;
  int iVar24;
  int iVar25;
  int iVar26;
  bool bVar27;
  int iVar28;
  int iVar29;
  EVP_MD *type;
  EVP_MD_CTX *ctx;
  long lVar30;
  long lVar31;
  long lVar32;
  long lVar33;
  ulong uVar34;
  long lVar35;
  ulong uVar36;
  long lVar37;
  int iVar38;
  long lVar39;
  long lVar40;
  uint uVar41;
  int iVar42;
  int iVar43;
  int local_ad0;
  int local_acc;
  int local_ac8;
  int local_ac4;
  int local_ac0;
  int local_abc;
  int local_ab8;
  int local_ab4;
  int local_ab0;
  int local_aac;
  undefined8 local_a90;
  undefined8 uStack_a88;
  undefined8 local_a80;
  undefined8 local_a78;
  undefined8 local_a70;
  undefined4 local_a68;
  undefined8 local_a64;
  undefined8 uStack_a5c;
  undefined8 local_a54;
  undefined8 uStack_a4c;
  undefined8 local_a44;
  undefined8 local_a3c;
  undefined8 uStack_a34;
  undefined8 local_a2c;
  undefined8 uStack_a24;
  undefined4 local_a1c;
  uint uStack_a14;
  undefined8 local_a10;
  undefined8 uStack_a08;
  undefined8 local_a00;
  undefined8 uStack_9f8;
  int local_9f0;
  int iStack_9ec;
  int local_9e8;
  int iStack_9e4;
  int iStack_9e0;
  int iStack_9dc;
  int local_9d8;
  int local_9d4;
  int local_9d0;
  int local_9cc;
  int local_9c8;
  int iStack_9c4;
  int local_9c0;
  int iStack_9bc;
  int iStack_9b8;
  int iStack_9b4;
  int iStack_9b0;
  int local_9ac;
  int iStack_9a8;
  int local_9a4;
  int iStack_9a0;
  int local_99c;
  undefined8 local_998;
  undefined8 uStack_990;
  undefined8 local_988;
  undefined8 uStack_980;
  int local_978;
  int local_974;
  byte local_970 [32];
  undefined1 auStack_950 [40];
  undefined1 auStack_928 [40];
  undefined1 auStack_900 [40];
  undefined1 auStack_8d8 [40];
  int local_8b0;
  int iStack_8ac;
  int iStack_8a8;
  int iStack_8a4;
  int local_8a0;
  int iStack_89c;
  int iStack_898;
  int iStack_894;
  int local_890;
  int iStack_88c;
  undefined8 local_888;
  undefined8 uStack_880;
  undefined8 local_878;
  undefined8 uStack_870;
  undefined8 local_868;
  undefined8 local_860;
  undefined8 uStack_858;
  undefined8 local_850;
  undefined8 local_848;
  undefined8 local_840;
  undefined1 auStack_838 [40];
  int local_810;
  int local_80c;
  int local_808;
  int local_804;
  int local_800;
  int local_7fc;
  int local_7f8;
  undefined4 local_7f4;
  int local_7f0;
  int local_7ec;
  int local_7e8;
  int local_7e4;
  int local_7e0;
  int local_7dc;
  int local_7d8;
  int local_7d4;
  int local_7d0;
  int local_7cc;
  int local_7c8;
  int local_7c4;
  int local_7c0;
  int local_7bc;
  int local_7b8;
  int local_7b4;
  int local_7b0;
  int local_7ac;
  int local_7a8;
  int local_7a4;
  int local_7a0;
  int local_79c;
  int local_798;
  int local_794;
  int local_790;
  int local_78c;
  int local_788;
  int local_784;
  int local_780;
  int local_77c;
  int local_778;
  int local_774;
  int local_770 [4];
  int local_760;
  int local_75c;
  int local_758;
  int local_754;
  int local_750;
  int local_74c;
  int local_748 [4];
  int local_738;
  int local_734;
  int local_730;
  int local_72c;
  int local_728;
  int local_724;
  undefined8 local_720 [4];
  undefined8 local_700;
  undefined1 auStack_6f8 [40];
  int local_6d0;
  int local_6cc;
  int local_6c8;
  int local_6c4;
  int local_6c0;
  int local_6bc;
  int local_6b8;
  int local_6b4;
  int local_6b0;
  int local_6ac;
  int local_6a8;
  int local_6a4;
  int local_6a0;
  int local_69c;
  int local_698;
  int local_694;
  int local_690;
  int local_68c;
  int local_688;
  int local_684;
  undefined8 local_680;
  undefined8 uStack_678;
  undefined8 local_670;
  undefined8 uStack_668;
  undefined8 local_660;
  undefined1 auStack_658 [40];
  int local_630;
  int local_62c;
  int local_628;
  int local_624;
  int local_620;
  int local_61c;
  int local_618;
  int local_614;
  int local_610;
  int local_60c;
  int local_608;
  int local_604;
  int local_600;
  int local_5fc;
  int local_5f8;
  int local_5f4;
  int local_5f0;
  int local_5ec;
  int local_5e8;
  int local_5e4;
  undefined8 local_5e0;
  undefined8 uStack_5d8;
  undefined8 local_5d0;
  undefined8 uStack_5c8;
  undefined8 local_5c0;
  undefined1 auStack_5b8 [40];
  int local_590;
  int local_58c;
  int local_588;
  int local_584;
  int local_580;
  int local_57c;
  int local_578;
  int local_574;
  int local_570;
  int local_56c;
  int local_568;
  int local_564;
  int local_560;
  int local_55c;
  int local_558;
  int local_554;
  int local_550;
  int local_54c;
  int local_548;
  int local_544;
  undefined8 local_540;
  undefined8 uStack_538;
  undefined8 local_530;
  undefined8 uStack_528;
  undefined8 local_520;
  undefined1 auStack_518 [40];
  int local_4f0;
  int local_4ec;
  int local_4e8;
  int local_4e4;
  int local_4e0;
  int local_4dc;
  int local_4d8;
  int local_4d4;
  int local_4d0;
  int local_4cc;
  int local_4c8;
  int local_4c4;
  int local_4c0;
  int local_4bc;
  int local_4b8;
  int local_4b4;
  int local_4b0;
  int local_4ac;
  int local_4a8;
  int local_4a4;
  undefined8 local_4a0;
  undefined8 uStack_498;
  undefined8 local_490;
  undefined8 uStack_488;
  undefined8 local_480;
  undefined1 auStack_478 [40];
  int local_450;
  int local_44c;
  int local_448;
  int local_444;
  int local_440;
  int local_43c;
  int local_438;
  int local_434;
  int local_430;
  int local_42c;
  int local_428;
  int local_424;
  int local_420;
  int local_41c;
  int local_418;
  int local_414;
  int local_410;
  int local_40c;
  int local_408;
  int local_404;
  undefined8 local_400;
  undefined8 uStack_3f8;
  undefined8 local_3f0;
  undefined8 uStack_3e8;
  undefined8 local_3e0;
  undefined1 auStack_3d8 [40];
  int local_3b0;
  int local_3ac;
  int local_3a8;
  int local_3a4;
  int local_3a0;
  int local_39c;
  int local_398;
  int local_394;
  int local_390;
  int local_38c;
  int local_388;
  int local_384;
  int local_380;
  int local_37c;
  int local_378;
  int local_374;
  int local_370;
  int local_36c;
  int local_368;
  int local_364;
  undefined8 local_360;
  undefined8 uStack_358;
  undefined8 local_350;
  undefined8 uStack_348;
  undefined8 local_340;
  undefined1 auStack_338 [40];
  int local_310;
  int local_30c;
  int local_308;
  int local_304;
  int local_300;
  int local_2fc;
  int local_2f8;
  int local_2f4;
  int local_2f0;
  int local_2ec;
  int local_2e8;
  int local_2e4;
  int local_2e0;
  int local_2dc;
  int local_2d8;
  int local_2d4;
  int local_2d0;
  int local_2cc;
  int local_2c8;
  int local_2c4;
  undefined8 local_2c0;
  undefined8 uStack_2b8;
  undefined8 local_2b0;
  undefined8 uStack_2a8;
  undefined8 local_2a0;
  undefined1 auStack_298 [40];
  byte local_270 [528];
  
  if (0x10 < *(byte *)((long)param_3 + 0x3f)) {
    return false;
  }
  if (*(byte *)((long)param_3 + 0x3f) == 0x10) {
    iVar28 = memcmp((void *)((long)param_3 + 0x30),&DAT_00758bf8,0xf);
    if (iVar28 != 0) {
      return false;
    }
    if (0x13 < *(byte *)((long)param_3 + 0x2f)) {
      if (*(byte *)((long)param_3 + 0x2f) != 0x14) {
        return false;
      }
      if (0xdd < *(byte *)((long)param_3 + 0x2e)) {
        if (*(byte *)((long)param_3 + 0x2e) != 0xde) {
          return false;
        }
        if (0xf8 < *(byte *)((long)param_3 + 0x2d)) {
          if (*(byte *)((long)param_3 + 0x2d) != 0xf9) {
            return false;
          }
          if (0xdd < *(byte *)((long)param_3 + 0x2c)) {
            if (*(byte *)((long)param_3 + 0x2c) != 0xde) {
              return false;
            }
            if (0xa1 < *(byte *)((long)param_3 + 0x2b)) {
              if (*(byte *)((long)param_3 + 0x2b) != 0xa2) {
                return false;
              }
              if (0xf6 < *(byte *)((long)param_3 + 0x2a)) {
                if (*(byte *)((long)param_3 + 0x2a) != 0xf7) {
                  return false;
                }
                if (0x9b < *(byte *)((long)param_3 + 0x29)) {
                  if (*(byte *)((long)param_3 + 0x29) != 0x9c) {
                    return false;
                  }
                  if (0xd5 < *(byte *)((long)param_3 + 0x28)) {
                    if (*(byte *)((long)param_3 + 0x28) != 0xd6) {
                      return false;
                    }
                    if (0x57 < *(byte *)((long)param_3 + 0x27)) {
                      if (*(byte *)((long)param_3 + 0x27) != 0x58) {
                        return false;
                      }
                      if (0x11 < *(byte *)((long)param_3 + 0x26)) {
                        if (*(byte *)((long)param_3 + 0x26) != 0x12) {
                          return false;
                        }
                        if (0x62 < *(byte *)((long)param_3 + 0x25)) {
                          if (*(byte *)((long)param_3 + 0x25) != 99) {
                            return false;
                          }
                          if (0x19 < *(byte *)((long)param_3 + 0x24)) {
                            if (*(byte *)((long)param_3 + 0x24) != 0x1a) {
                              return false;
                            }
                            if (0x5b < *(byte *)((long)param_3 + 0x23)) {
                              if (*(byte *)((long)param_3 + 0x23) != 0x5c) {
                                return false;
                              }
                              if (0xf4 < *(byte *)((long)param_3 + 0x22)) {
                                if (*(byte *)((long)param_3 + 0x22) != 0xf5) {
                                  return false;
                                }
                                if (0xd2 < *(byte *)((long)param_3 + 0x21)) {
                                  if (*(byte *)((long)param_3 + 0x21) != 0xd3) {
                                    return false;
                                  }
                                  if (0xec < *(byte *)((long)param_3 + 0x20)) {
                                    return false;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  lVar33 = (ulong)(uint3)param_4[1] * 0x40;
  lVar35 = (ulong)*(uint3 *)((long)param_4 + 10) * 8;
  lVar39 = (ulong)*(uint3 *)((long)param_4 + 0x17) * 0x20;
  lVar40 = ((ulong)*(uint3 *)((long)param_4 + 0x1d) & 0x7fffff) * 4;
  uVar34 = lVar33 + 0x1000000;
  uVar36 = lVar35 + 0x1000000;
  uVar2 = (ulong)param_4[4] + 0x1000000;
  uVar3 = lVar39 + 0x1000000;
  uVar4 = lVar40 + 0x1000000;
  lVar30 = (ulong)*(uint3 *)((long)param_4 + 7) * 0x20 + (uVar34 >> 0x19);
  lVar32 = (ulong)*param_4 + (uVar4 >> 0x19) * 0x13;
  uVar5 = lVar30 + 0x2000000;
  lVar31 = (ulong)*(uint3 *)((long)param_4 + 0xd) * 4 + (uVar36 >> 0x19);
  uVar6 = lVar31 + 0x2000000;
  lVar37 = (ulong)(uint3)param_4[5] * 0x80 + (uVar2 >> 0x19);
  iStack_9e0 = (int)lVar30 - ((uint)uVar5 & 0xfc000000);
  uVar7 = lVar37 + 0x2000000;
  lVar30 = (ulong)*(uint3 *)((long)param_4 + 0x1a) * 0x10 + (uVar3 >> 0x19);
  local_9d8 = (int)lVar31 - ((uint)uVar6 & 0xfc000000);
  uVar8 = lVar30 + 0x2000000;
  local_9d0 = (int)lVar37 - ((uint)uVar7 & 0xfc000000);
  uVar9 = lVar32 + 0x2000000;
  local_9c8 = (int)lVar30 - ((uint)uVar8 & 0xfc000000);
  iStack_9dc = ((int)(uVar5 >> 0x1a) + (int)lVar35) - ((uint)uVar36 & 0xfe000000);
  local_9d4 = ((int)(uVar6 >> 0x1a) + param_4[4]) - ((uint)uVar2 & 0xfe000000);
  local_9cc = ((int)(uVar7 >> 0x1a) + (int)lVar39) - ((uint)uVar3 & 0xfe000000);
  iStack_9c4 = ((int)lVar40 + (int)(uVar8 >> 0x1a)) - ((uint)uVar4 & 0x2000000);
  iStack_9e4 = ((int)lVar33 - ((uint)uVar34 & 0xfe000000)) + (int)(uVar9 >> 0x1a);
  local_9e8 = (int)lVar32 - ((uint)uVar9 & 0xfc000000);
  local_9a4 = 0;
  iStack_9a0 = 0;
  local_9ac = 0;
  iStack_9a8 = 0;
  iStack_9b4 = 0;
  iStack_9b0 = 0;
  iStack_9bc = 0;
  iStack_9b8 = 0;
  local_99c = 0;
  local_9c0 = 1;
  FUN_00a46500(&local_810);
  FUN_00a44e38(&local_8b0,&local_810,&DAT_00760428);
  iVar28 = local_810 - local_9c0;
  iVar11 = local_80c - iStack_9bc;
  iVar38 = local_808 - iStack_9b8;
  iVar42 = (int)_local_8b0;
  iStack_8ac = (int)((ulong)_local_8b0 >> 0x20) + iStack_9bc;
  iVar43 = (int)_iStack_8a8;
  iStack_8a4 = (int)((ulong)_iStack_8a8 >> 0x20) + iStack_9b4;
  iVar12 = local_804 - iStack_9b4;
  iVar13 = local_800 - iStack_9b0;
  uVar34 = (ulong)_local_8a0 >> 0x20;
  local_8a0 = (int)_local_8a0 + iStack_9b0;
  iStack_89c = (int)uVar34 + local_9ac;
  uVar34 = (ulong)_iStack_898 >> 0x20;
  iStack_898 = (int)_iStack_898 + iStack_9a8;
  iStack_894 = (int)uVar34 + local_9a4;
  iVar14 = local_7fc - local_9ac;
  iVar15 = local_7f8 - iStack_9a8;
  iVar16 = local_7f4 - local_9a4;
  iVar17 = local_7f0 - iStack_9a0;
  iStack_88c = iStack_88c + local_99c;
  iVar18 = local_7ec - local_99c;
  local_810 = iVar28;
  local_80c = iVar11;
  local_808 = iVar38;
  local_804 = iVar12;
  local_800 = iVar13;
  local_7fc = iVar14;
  local_7f8 = iVar15;
  local_7f4 = iVar16;
  local_7f0 = iVar17;
  local_7ec = iVar18;
  local_8b0 = iVar42 + local_9c0;
  iStack_8a8 = iVar43 + iStack_9b8;
  local_890 = local_890 + iStack_9a0;
  FUN_00a46500(auStack_950,&local_8b0);
  FUN_00a44e38(auStack_950,auStack_950,&local_8b0);
  FUN_00a46500(&local_a10,auStack_950);
  FUN_00a44e38(&local_a10,&local_a10,&local_8b0);
  FUN_00a44e38(&local_a10,&local_a10,&local_810);
  FUN_00a46500(local_770,&local_a10);
  FUN_00a46500(local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a44e38(local_270 + 0x100,&local_a10,local_270 + 0x100);
  FUN_00a44e38(local_770,local_770,local_270 + 0x100);
  FUN_00a46500(local_770,local_770);
  FUN_00a44e38(local_770,local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a44e38(local_770,local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a44e38(local_270 + 0x100,local_270 + 0x100,local_770);
  FUN_00a46500(local_270,local_270 + 0x100);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a46500(local_270,local_270);
  FUN_00a44e38(local_270 + 0x100,local_270,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  FUN_00a44e38(local_770,local_270 + 0x100,local_770);
  FUN_00a46500(local_270 + 0x100,local_770);
  iVar42 = 0x31;
  do {
    FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
    iVar42 = iVar42 + -1;
  } while (iVar42 != 0);
  FUN_00a44e38(local_270 + 0x100,local_270 + 0x100,local_770);
  FUN_00a46500(local_270,local_270 + 0x100);
  iVar42 = 99;
  do {
    FUN_00a46500(local_270,local_270);
    iVar42 = iVar42 + -1;
  } while (iVar42 != 0);
  FUN_00a44e38(local_270 + 0x100,local_270,local_270 + 0x100);
  FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
  iVar42 = 0x31;
  do {
    FUN_00a46500(local_270 + 0x100,local_270 + 0x100);
    iVar42 = iVar42 + -1;
  } while (iVar42 != 0);
  FUN_00a44e38(local_770,local_270 + 0x100,local_770);
  FUN_00a46500(local_770,local_770);
  FUN_00a46500(local_770,local_770);
  FUN_00a44e38(&local_a10,local_770,&local_a10);
  FUN_00a44e38(&local_a10,&local_a10,auStack_950);
  FUN_00a44e38(&local_a10,&local_a10,&local_810);
  FUN_00a46500(&local_a90,&local_a10);
  FUN_00a44e38(&local_a90,&local_a90,&local_8b0);
  iVar42 = (int)local_a90;
  iVar43 = local_a90._4_4_;
  iVar19 = (int)uStack_a88;
  iVar20 = uStack_a88._4_4_;
  iVar21 = (int)local_a80;
  local_ad0 = (int)local_a90 - iVar28;
  iVar22 = local_a80._4_4_;
  local_acc = local_a90._4_4_ - iVar11;
  iVar23 = (int)local_a78;
  local_ac8 = (int)uStack_a88 - iVar38;
  iVar24 = local_a78._4_4_;
  local_ac4 = uStack_a88._4_4_ - iVar12;
  iVar25 = (int)local_a70;
  local_ac0 = (int)local_a80 - iVar13;
  iVar26 = local_a70._4_4_;
  local_abc = local_a80._4_4_ - iVar14;
  local_ab8 = (int)local_a78 - iVar15;
  local_ab4 = local_a78._4_4_ - iVar16;
  local_ab0 = (int)local_a70 - iVar17;
  local_aac = local_a70._4_4_ - iVar18;
  FUN_00a45158(local_970,&local_ad0);
  iVar29 = CRYPTO_memcmp(local_970,&DAT_00760478,0x20);
  if (iVar29 != 0) {
    local_ad0 = iVar42 + iVar28;
    local_acc = iVar43 + iVar11;
    local_ac8 = iVar19 + iVar38;
    local_ac4 = iVar20 + iVar12;
    local_ac0 = iVar21 + iVar13;
    local_abc = iVar22 + iVar14;
    local_ab8 = iVar23 + iVar15;
    local_ab4 = iVar24 + iVar16;
    local_ab0 = iVar25 + iVar17;
    local_aac = iVar26 + iVar18;
    FUN_00a45158(local_970,&local_ad0);
    iVar28 = CRYPTO_memcmp(local_970,&DAT_00760478,0x20);
    if (iVar28 != 0) {
      return false;
    }
    FUN_00a44e38(&local_a10,&local_a10,&DAT_00760450);
  }
  FUN_00a45158(local_970,&local_a10);
  if ((local_970[0] & 1) != *(byte *)((long)param_4 + 0x1f) >> 7) {
    local_a10 = CONCAT44(-(int)((ulong)local_a10 >> 0x20),-(int)local_a10);
    uStack_a08 = CONCAT44(-(int)((ulong)uStack_a08 >> 0x20),-(int)uStack_a08);
    local_9f0 = -local_9f0;
    local_a00 = CONCAT44(-(int)((ulong)local_a00 >> 0x20),-(int)local_a00);
    uStack_9f8 = CONCAT44(-(int)((ulong)uStack_9f8 >> 0x20),-(int)uStack_9f8);
    iStack_9ec = -iStack_9ec;
  }
  FUN_00a44e38(&local_998,&local_a10,&local_9e8);
  local_a10._4_4_ = -local_a10._4_4_;
  uStack_a08._4_4_ = -uStack_a08._4_4_;
  local_a00._4_4_ = -local_a00._4_4_;
  uStack_9f8._4_4_ = -uStack_9f8._4_4_;
  local_9f0 = -local_9f0;
  iStack_9ec = -iStack_9ec;
  local_998 = CONCAT44(-(int)((ulong)local_998 >> 0x20),-(int)local_998);
  uStack_990 = CONCAT44(-(int)((ulong)uStack_990 >> 0x20),-(int)uStack_990);
  local_988 = CONCAT44(-(int)((ulong)local_988 >> 0x20),-(int)local_988);
  uStack_980 = CONCAT44(-(int)((ulong)uStack_980 >> 0x20),-(int)uStack_980);
  local_978 = -local_978;
  local_974 = -local_974;
  local_a10._0_4_ = -(int)local_a10;
  uStack_a08._0_4_ = -(int)uStack_a08;
  local_a00._0_4_ = -(int)local_a00;
  uStack_9f8._0_4_ = -(int)uStack_9f8;
  type = (EVP_MD *)EVP_MD_fetch(param_5,"SHA512",param_6);
  if (type == (EVP_MD *)0x0) {
    return false;
  }
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (((((ctx == (EVP_MD_CTX *)0x0) ||
        (iVar28 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar28 == 0)) ||
       (iVar28 = EVP_DigestUpdate(ctx,param_3,0x20), iVar28 == 0)) ||
      ((iVar28 = EVP_DigestUpdate(ctx,param_4,0x20), iVar28 == 0 ||
       (iVar28 = EVP_DigestUpdate(ctx,param_1,param_2), iVar28 == 0)))) ||
     (iVar28 = EVP_DigestFinal_ex(ctx,(uchar *)&local_ad0,&uStack_a14), iVar28 == 0)) {
    bVar27 = false;
  }
  else {
    FUN_00a3f5ac(&local_ad0);
    uVar34 = 0;
    do {
      bVar10 = *(byte *)((long)&local_ad0 + (uVar34 >> 3 & 0x1fffffff));
      uVar41 = (uint)uVar34 & 6;
      uVar36 = uVar34 + 2;
      local_270[uVar34 + 0x100] = bVar10 >> (ulong)uVar41 & 1;
      local_270[uVar34 + 0x101] = bVar10 >> (ulong)(uVar41 | 1) & 1;
      uVar34 = uVar36;
    } while (uVar36 != 0x100);
    pbVar1 = local_270 + 0x100;
    lVar30 = 0;
    uVar34 = (ulong)pbVar1 | 1;
    do {
      if (pbVar1[lVar30] != 0) {
        uVar36 = 1;
        lVar31 = lVar30;
        do {
          uVar2 = uVar36 + lVar30;
          if (0xff < uVar2) break;
          if ((char)pbVar1[uVar2] != 0) {
            iVar11 = (int)(char)pbVar1[uVar2] << (ulong)((uint)uVar36 & 0x1f);
            iVar28 = iVar11 + (char)pbVar1[lVar30];
            if (iVar28 < 0x10) {
              pbVar1[lVar30] = (byte)iVar28;
              pbVar1[uVar2] = 0;
            }
            else {
              iVar11 = (char)pbVar1[lVar30] - iVar11;
              if (iVar11 < -0xf) break;
              pbVar1[lVar30] = (byte)iVar11;
              lVar37 = lVar31;
              do {
                if (*(char *)(uVar34 + lVar37) == '\0') {
                  *(undefined1 *)(uVar34 + lVar37) = 1;
                  break;
                }
                uVar2 = lVar37 + 2;
                *(undefined1 *)(uVar34 + lVar37) = 0;
                lVar37 = lVar37 + 1;
              } while (uVar2 < 0x100);
            }
          }
          uVar36 = uVar36 + 1;
          lVar31 = lVar31 + 1;
        } while (uVar36 < 7);
      }
      lVar30 = lVar30 + 1;
    } while (lVar30 != 0x100);
    uVar34 = 0;
    do {
      bVar10 = ((byte *)((long)param_3 + 0x20))[uVar34 >> 3 & 0x1fffffff];
      uVar41 = (uint)uVar34 & 6;
      uVar36 = uVar34 + 2;
      local_270[uVar34] = bVar10 >> (ulong)uVar41 & 1;
      local_270[uVar34 + 1] = bVar10 >> (ulong)(uVar41 | 1) & 1;
      uVar34 = uVar36;
    } while (uVar36 != 0x100);
    lVar30 = 0;
    uVar34 = (ulong)local_270 | 1;
    do {
      if (local_270[lVar30] != 0) {
        uVar36 = 1;
        lVar31 = lVar30;
        do {
          uVar2 = uVar36 + lVar30;
          if (0xff < uVar2) break;
          iVar28 = (int)(char)local_270[uVar2];
          if (iVar28 != 0) {
            iVar28 = iVar28 << (ulong)((uint)uVar36 & 0x1f);
            iVar38 = (int)(char)local_270[lVar30];
            iVar11 = iVar28 + iVar38;
            if (iVar11 < 0x10) {
              local_270[lVar30] = (byte)iVar11;
              local_270[uVar2] = 0;
            }
            else {
              iVar38 = iVar38 - iVar28;
              if (iVar38 < -0xf) break;
              local_270[lVar30] = (byte)iVar38;
              lVar37 = lVar31;
              do {
                if (*(char *)(uVar34 + lVar37) == '\0') {
                  *(undefined1 *)(uVar34 + lVar37) = 1;
                  break;
                }
                uVar2 = lVar37 + 2;
                *(undefined1 *)(uVar34 + lVar37) = 0;
                lVar37 = lVar37 + 1;
              } while (uVar2 < 0x100);
            }
          }
          uVar36 = uVar36 + 1;
          lVar31 = lVar31 + 1;
        } while (uVar36 < 7);
      }
      lVar30 = lVar30 + 1;
    } while (lVar30 != 0x100);
    local_770[0] = (int)local_a10 + local_9e8;
    local_748[0] = local_9e8 - (int)local_a10;
    local_770[1] = local_a10._4_4_ + iStack_9e4;
    local_748[1] = iStack_9e4 - local_a10._4_4_;
    local_770[2] = (int)uStack_a08 + iStack_9e0;
    local_748[2] = iStack_9e0 - (int)uStack_a08;
    local_770[3] = uStack_a08._4_4_ + iStack_9dc;
    local_748[3] = iStack_9dc - uStack_a08._4_4_;
    local_760 = (int)local_a00 + local_9d8;
    local_738 = local_9d8 - (int)local_a00;
    local_75c = local_a00._4_4_ + local_9d4;
    local_734 = local_9d4 - local_a00._4_4_;
    local_758 = (int)uStack_9f8 + local_9d0;
    local_730 = local_9d0 - (int)uStack_9f8;
    local_754 = uStack_9f8._4_4_ + local_9cc;
    local_72c = local_9cc - uStack_9f8._4_4_;
    local_750 = local_9f0 + local_9c8;
    local_728 = local_9c8 - local_9f0;
    local_74c = iStack_9ec + iStack_9c4;
    local_724 = iStack_9c4 - iStack_9ec;
    local_700 = CONCAT44(local_99c,iStack_9a0);
    local_720[1] = CONCAT44(iStack_9b4,iStack_9b8);
    local_720[0] = CONCAT44(iStack_9bc,local_9c0);
    local_720[3] = CONCAT44(local_9a4,iStack_9a8);
    local_720[2] = CONCAT44(local_9ac,iStack_9b0);
    FUN_00a44e38(auStack_6f8,&local_998,&DAT_00760858);
    local_890 = local_9f0;
    iStack_88c = iStack_9ec;
    local_868 = CONCAT44(iStack_9c4,local_9c8);
    iStack_8a8 = (int)uStack_a08;
    iStack_8a4 = uStack_a08._4_4_;
    local_8b0 = (int)local_a10;
    iStack_8ac = local_a10._4_4_;
    iStack_898 = (int)uStack_9f8;
    iStack_894 = uStack_9f8._4_4_;
    local_8a0 = (int)local_a00;
    iStack_89c = local_a00._4_4_;
    uStack_880 = CONCAT44(iStack_9dc,iStack_9e0);
    local_888 = CONCAT44(iStack_9e4,local_9e8);
    uStack_870 = CONCAT44(local_9cc,local_9d0);
    local_878 = CONCAT44(local_9d4,local_9d8);
    uStack_858 = CONCAT44(iStack_9b4,iStack_9b8);
    local_860 = CONCAT44(iStack_9bc,local_9c0);
    local_848 = CONCAT44(local_9a4,iStack_9a8);
    local_850 = CONCAT44(local_9ac,iStack_9b0);
    local_840 = CONCAT44(local_99c,iStack_9a0);
    FUN_00a46060(&local_810,&local_8b0);
    FUN_00a44e38(auStack_950,&local_810,&local_798);
    FUN_00a44e38(auStack_928,&local_7e8,&local_7c0);
    FUN_00a44e38(auStack_900,&local_7c0,&local_798);
    FUN_00a44e38(auStack_8d8,&local_810,&local_7e8);
    FUN_00a46738(&local_810,auStack_950,local_770);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_6d0 = local_8b0 + (int)local_888;
    local_6a8 = (int)local_888 - local_8b0;
    local_6cc = iStack_8ac + local_888._4_4_;
    local_6a4 = local_888._4_4_ - iStack_8ac;
    local_6c8 = iStack_8a8 + (int)uStack_880;
    local_6a0 = (int)uStack_880 - iStack_8a8;
    local_6c4 = iStack_8a4 + uStack_880._4_4_;
    local_69c = uStack_880._4_4_ - iStack_8a4;
    local_6c0 = local_8a0 + (int)local_878;
    local_698 = (int)local_878 - local_8a0;
    local_6bc = iStack_89c + local_878._4_4_;
    local_694 = local_878._4_4_ - iStack_89c;
    local_6b8 = iStack_898 + (int)uStack_870;
    local_690 = (int)uStack_870 - iStack_898;
    local_6b4 = iStack_894 + uStack_870._4_4_;
    local_68c = uStack_870._4_4_ - iStack_894;
    local_6b0 = local_890 + (int)local_868;
    local_688 = (int)local_868 - local_890;
    local_6ac = iStack_88c + local_868._4_4_;
    local_684 = local_868._4_4_ - iStack_88c;
    uStack_668 = local_848;
    local_670 = local_850;
    local_660 = local_840;
    uStack_678 = uStack_858;
    local_680 = local_860;
    FUN_00a44e38(auStack_658,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_6d0);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_630 = local_8b0 + (int)local_888;
    local_608 = (int)local_888 - local_8b0;
    local_62c = iStack_8ac + local_888._4_4_;
    local_604 = local_888._4_4_ - iStack_8ac;
    local_628 = iStack_8a8 + (int)uStack_880;
    local_600 = (int)uStack_880 - iStack_8a8;
    local_624 = iStack_8a4 + uStack_880._4_4_;
    local_5fc = uStack_880._4_4_ - iStack_8a4;
    local_620 = local_8a0 + (int)local_878;
    local_5f8 = (int)local_878 - local_8a0;
    local_61c = iStack_89c + local_878._4_4_;
    local_5f4 = local_878._4_4_ - iStack_89c;
    local_618 = iStack_898 + (int)uStack_870;
    local_5f0 = (int)uStack_870 - iStack_898;
    local_614 = iStack_894 + uStack_870._4_4_;
    local_5ec = uStack_870._4_4_ - iStack_894;
    local_610 = local_890 + (int)local_868;
    local_5e8 = (int)local_868 - local_890;
    local_60c = iStack_88c + local_868._4_4_;
    local_5e4 = local_868._4_4_ - iStack_88c;
    uStack_5c8 = local_848;
    local_5d0 = local_850;
    local_5c0 = local_840;
    uStack_5d8 = uStack_858;
    local_5e0 = local_860;
    FUN_00a44e38(auStack_5b8,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_630);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_590 = local_8b0 + (int)local_888;
    local_568 = (int)local_888 - local_8b0;
    local_58c = iStack_8ac + local_888._4_4_;
    local_564 = local_888._4_4_ - iStack_8ac;
    local_588 = iStack_8a8 + (int)uStack_880;
    local_560 = (int)uStack_880 - iStack_8a8;
    local_584 = iStack_8a4 + uStack_880._4_4_;
    local_55c = uStack_880._4_4_ - iStack_8a4;
    local_580 = local_8a0 + (int)local_878;
    local_558 = (int)local_878 - local_8a0;
    local_57c = iStack_89c + local_878._4_4_;
    local_554 = local_878._4_4_ - iStack_89c;
    local_578 = iStack_898 + (int)uStack_870;
    local_550 = (int)uStack_870 - iStack_898;
    local_574 = iStack_894 + uStack_870._4_4_;
    local_54c = uStack_870._4_4_ - iStack_894;
    local_570 = local_890 + (int)local_868;
    local_548 = (int)local_868 - local_890;
    local_56c = iStack_88c + local_868._4_4_;
    local_544 = local_868._4_4_ - iStack_88c;
    uStack_528 = local_848;
    local_530 = local_850;
    local_520 = local_840;
    uStack_538 = uStack_858;
    local_540 = local_860;
    FUN_00a44e38(auStack_518,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_590);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_4f0 = local_8b0 + (int)local_888;
    local_4c8 = (int)local_888 - local_8b0;
    local_4ec = iStack_8ac + local_888._4_4_;
    local_4c4 = local_888._4_4_ - iStack_8ac;
    local_4e8 = iStack_8a8 + (int)uStack_880;
    local_4c0 = (int)uStack_880 - iStack_8a8;
    local_4e4 = iStack_8a4 + uStack_880._4_4_;
    local_4bc = uStack_880._4_4_ - iStack_8a4;
    local_4e0 = local_8a0 + (int)local_878;
    local_4b8 = (int)local_878 - local_8a0;
    local_4dc = iStack_89c + local_878._4_4_;
    local_4b4 = local_878._4_4_ - iStack_89c;
    local_4d8 = iStack_898 + (int)uStack_870;
    local_4b0 = (int)uStack_870 - iStack_898;
    local_4d4 = iStack_894 + uStack_870._4_4_;
    local_4ac = uStack_870._4_4_ - iStack_894;
    local_4d0 = local_890 + (int)local_868;
    local_4a8 = (int)local_868 - local_890;
    local_4cc = iStack_88c + local_868._4_4_;
    local_4a4 = local_868._4_4_ - iStack_88c;
    uStack_488 = local_848;
    local_490 = local_850;
    local_480 = local_840;
    uStack_498 = uStack_858;
    local_4a0 = local_860;
    FUN_00a44e38(auStack_478,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_4f0);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_450 = local_8b0 + (int)local_888;
    local_428 = (int)local_888 - local_8b0;
    local_44c = iStack_8ac + local_888._4_4_;
    local_424 = local_888._4_4_ - iStack_8ac;
    local_448 = iStack_8a8 + (int)uStack_880;
    local_420 = (int)uStack_880 - iStack_8a8;
    local_444 = iStack_8a4 + uStack_880._4_4_;
    local_41c = uStack_880._4_4_ - iStack_8a4;
    local_440 = local_8a0 + (int)local_878;
    local_418 = (int)local_878 - local_8a0;
    local_43c = iStack_89c + local_878._4_4_;
    local_414 = local_878._4_4_ - iStack_89c;
    local_438 = iStack_898 + (int)uStack_870;
    local_410 = (int)uStack_870 - iStack_898;
    local_434 = iStack_894 + uStack_870._4_4_;
    local_40c = uStack_870._4_4_ - iStack_894;
    local_430 = local_890 + (int)local_868;
    local_408 = (int)local_868 - local_890;
    local_42c = iStack_88c + local_868._4_4_;
    local_404 = local_868._4_4_ - iStack_88c;
    uStack_3e8 = local_848;
    local_3f0 = local_850;
    local_3e0 = local_840;
    uStack_3f8 = uStack_858;
    local_400 = local_860;
    FUN_00a44e38(auStack_3d8,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_450);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_3b0 = local_8b0 + (int)local_888;
    local_388 = (int)local_888 - local_8b0;
    local_3ac = iStack_8ac + local_888._4_4_;
    local_384 = local_888._4_4_ - iStack_8ac;
    local_3a8 = iStack_8a8 + (int)uStack_880;
    local_380 = (int)uStack_880 - iStack_8a8;
    local_3a4 = iStack_8a4 + uStack_880._4_4_;
    local_37c = uStack_880._4_4_ - iStack_8a4;
    local_3a0 = local_8a0 + (int)local_878;
    local_378 = (int)local_878 - local_8a0;
    local_39c = iStack_89c + local_878._4_4_;
    local_374 = local_878._4_4_ - iStack_89c;
    local_398 = iStack_898 + (int)uStack_870;
    local_370 = (int)uStack_870 - iStack_898;
    local_394 = iStack_894 + uStack_870._4_4_;
    local_36c = uStack_870._4_4_ - iStack_894;
    local_390 = local_890 + (int)local_868;
    local_368 = (int)local_868 - local_890;
    local_38c = iStack_88c + local_868._4_4_;
    local_364 = local_868._4_4_ - iStack_88c;
    local_340 = local_840;
    uStack_348 = local_848;
    local_350 = local_850;
    uStack_358 = uStack_858;
    local_360 = local_860;
    FUN_00a44e38(auStack_338,auStack_838,&DAT_00760858);
    FUN_00a46738(&local_810,auStack_950,&local_3b0);
    FUN_00a44e38(&local_8b0,&local_810,&local_798);
    FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
    FUN_00a44e38(&local_860,&local_7c0,&local_798);
    FUN_00a44e38(auStack_838,&local_810,&local_7e8);
    local_310 = local_8b0 + (int)local_888;
    local_2e8 = (int)local_888 - local_8b0;
    local_30c = iStack_8ac + local_888._4_4_;
    local_2e4 = local_888._4_4_ - iStack_8ac;
    local_308 = iStack_8a8 + (int)uStack_880;
    local_2e0 = (int)uStack_880 - iStack_8a8;
    local_304 = iStack_8a4 + uStack_880._4_4_;
    local_2dc = uStack_880._4_4_ - iStack_8a4;
    local_300 = local_8a0 + (int)local_878;
    local_2d8 = (int)local_878 - local_8a0;
    local_2fc = iStack_89c + local_878._4_4_;
    local_2d4 = local_878._4_4_ - iStack_89c;
    local_2f8 = iStack_898 + (int)uStack_870;
    local_2d0 = (int)uStack_870 - iStack_898;
    local_2f4 = iStack_894 + uStack_870._4_4_;
    local_2cc = uStack_870._4_4_ - iStack_894;
    local_2f0 = local_890 + (int)local_868;
    local_2c8 = (int)local_868 - local_890;
    local_2ec = iStack_88c + local_868._4_4_;
    local_2c4 = local_868._4_4_ - iStack_88c;
    uStack_2a8 = local_848;
    local_2b0 = local_850;
    local_2a0 = local_840;
    uStack_2b8 = uStack_858;
    local_2c0 = local_860;
    FUN_00a44e38(auStack_298,auStack_838,&DAT_00760858);
    local_a70 = 0;
    uStack_a88 = 0;
    local_a90 = 0;
    local_a78 = 0;
    local_a80 = 0;
    local_a44 = 0x100000000;
    uStack_a4c = 0;
    local_a54 = 0;
    uStack_a5c = 0;
    local_a64 = 0;
    local_a68 = 1;
    uStack_a24 = 0;
    local_a2c = 0;
    uStack_a34 = 0;
    local_a3c = 0;
    local_a1c = 0;
    lVar30 = 0xff;
    do {
      lVar31 = lVar30;
      if ((local_270[lVar30 + 0x100] != 0) || (local_270[lVar30] != 0)) break;
      lVar31 = lVar30 + -1;
      bVar27 = lVar30 != 0;
      lVar30 = lVar31;
    } while (bVar27);
    if (-1 < (int)lVar31) {
      lVar30 = (long)(int)lVar31;
      do {
        FUN_00a46060(&local_810,&local_a90);
        bVar10 = local_270[lVar30 + 0x100];
        uVar41 = (uint)(char)bVar10;
        if ((char)bVar10 < '\x01') {
          if ((int)uVar41 < 0) {
            FUN_00a44e38(&local_8b0,&local_810,&local_798);
            FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
            FUN_00a44e38(&local_860,&local_7c0,&local_798);
            FUN_00a44e38(auStack_838,&local_810,&local_7e8);
            local_810 = local_8b0 + (int)local_888;
            local_7e8 = (int)local_888 - local_8b0;
            local_80c = iStack_8ac + local_888._4_4_;
            lVar31 = (long)(char)-(char)((uint)(int)(char)(bVar10 + (char)((uVar41 & 0x80) >> 7)) >>
                                        1);
            local_7e4 = local_888._4_4_ - iStack_8ac;
            local_808 = iStack_8a8 + (int)uStack_880;
            local_7e0 = (int)uStack_880 - iStack_8a8;
            local_804 = iStack_8a4 + uStack_880._4_4_;
            local_7dc = uStack_880._4_4_ - iStack_8a4;
            local_800 = local_8a0 + (int)local_878;
            local_7d8 = (int)local_878 - local_8a0;
            local_7fc = iStack_89c + local_878._4_4_;
            local_7d4 = local_878._4_4_ - iStack_89c;
            local_7f8 = iStack_898 + (int)uStack_870;
            local_7d0 = (int)uStack_870 - iStack_898;
            local_7f4 = iStack_894 + uStack_870._4_4_;
            local_7cc = uStack_870._4_4_ - iStack_894;
            local_7f0 = local_890 + (int)local_868;
            local_7c8 = (int)local_868 - local_890;
            local_7ec = iStack_88c + local_868._4_4_;
            local_7c4 = local_868._4_4_ - iStack_88c;
            FUN_00a44e38(&local_7c0,&local_810,local_748 + lVar31 * 0x28);
            FUN_00a44e38(&local_7e8,&local_7e8,local_770 + lVar31 * 0x28);
            FUN_00a44e38(&local_798,auStack_6f8 + lVar31 * 0xa0,auStack_838);
            FUN_00a44e38(&local_810,&local_860,local_720 + lVar31 * 0x14);
            iVar43 = local_7a8;
            iVar42 = local_7ac;
            iVar18 = local_7ec;
            iVar17 = local_7f0;
            iVar16 = local_7f4;
            iVar15 = local_7f8;
            iVar14 = local_7fc;
            iVar13 = local_800;
            iVar12 = local_804;
            iVar38 = local_808;
            iVar11 = local_80c;
            iVar28 = local_810;
            local_810 = local_7c0 - local_7e8;
            local_80c = local_7bc - local_7e4;
            local_808 = local_7b8 - local_7e0;
            local_804 = local_7b4 - local_7dc;
            local_7e8 = local_7e8 + local_7c0;
            local_800 = local_7b0 - local_7d8;
            local_7fc = local_7ac - local_7d4;
            local_7e4 = local_7e4 + local_7bc;
            local_7f8 = local_7a8 - local_7d0;
            local_7c0 = iVar28 * 2 - local_798;
            local_7f4 = local_7a4 - local_7cc;
            local_7e0 = local_7e0 + local_7b8;
            local_7bc = iVar11 * 2 - local_794;
            local_7dc = local_7dc + local_7b4;
            local_7d8 = local_7d8 + local_7b0;
            local_7f0 = local_7a0 - local_7c8;
            local_7c8 = local_7c8 + local_7a0;
            local_7b8 = iVar38 * 2 - local_790;
            local_7ec = local_79c - local_7c4;
            local_7b4 = iVar12 * 2 - local_78c;
            local_7b0 = iVar13 * 2 - local_788;
            local_7ac = iVar14 * 2 - local_784;
            local_7a8 = iVar15 * 2 - local_780;
            local_7cc = local_7cc + local_7a4;
            local_7a4 = iVar16 * 2 - local_77c;
            local_7d0 = local_7d0 + iVar43;
            local_7a0 = iVar17 * 2 - local_778;
            local_7d4 = local_7d4 + iVar42;
            local_7c4 = local_7c4 + local_79c;
            local_79c = iVar18 * 2 - local_774;
            local_798 = local_798 + iVar28 * 2;
            local_794 = local_794 + iVar11 * 2;
            local_790 = local_790 + iVar38 * 2;
            local_78c = local_78c + iVar12 * 2;
            local_788 = local_788 + iVar13 * 2;
            local_784 = local_784 + iVar14 * 2;
            local_780 = local_780 + iVar15 * 2;
            local_77c = local_77c + iVar16 * 2;
            local_778 = local_778 + iVar17 * 2;
            local_774 = local_774 + iVar18 * 2;
          }
        }
        else {
          FUN_00a44e38(&local_8b0,&local_810,&local_798);
          FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
          FUN_00a44e38(&local_860,&local_7c0,&local_798);
          FUN_00a44e38(auStack_838,&local_810,&local_7e8);
          FUN_00a46738(&local_810,&local_8b0,local_770 + (ulong)(uVar41 >> 1 & 0x7f) * 0x28);
        }
        bVar10 = local_270[lVar30];
        uVar41 = (uint)(char)bVar10;
        if ((char)bVar10 < '\x01') {
          if ((int)uVar41 < 0) {
            FUN_00a44e38(&local_8b0,&local_810,&local_798);
            FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
            FUN_00a44e38(&local_860,&local_7c0,&local_798);
            FUN_00a44e38(auStack_838,&local_810,&local_7e8);
            local_810 = local_8b0 + (int)local_888;
            local_7e8 = (int)local_888 - local_8b0;
            local_80c = iStack_8ac + local_888._4_4_;
            local_7e4 = local_888._4_4_ - iStack_8ac;
            local_808 = iStack_8a8 + (int)uStack_880;
            local_7e0 = (int)uStack_880 - iStack_8a8;
            local_804 = iStack_8a4 + uStack_880._4_4_;
            local_7dc = uStack_880._4_4_ - iStack_8a4;
            local_800 = local_8a0 + (int)local_878;
            local_7d8 = (int)local_878 - local_8a0;
            local_7fc = iStack_89c + local_878._4_4_;
            local_7d4 = local_878._4_4_ - iStack_89c;
            local_7f8 = iStack_898 + (int)uStack_870;
            local_7d0 = (int)uStack_870 - iStack_898;
            local_7f4 = iStack_894 + uStack_870._4_4_;
            local_7cc = uStack_870._4_4_ - iStack_894;
            local_7f0 = local_890 + (int)local_868;
            local_7c8 = (int)local_868 - local_890;
            local_7ec = iStack_88c + local_868._4_4_;
            local_7c4 = local_868._4_4_ - iStack_88c;
            lVar31 = (long)(char)-(char)((uint)(int)(char)(bVar10 + (char)((uVar41 & 0x80) >> 7)) >>
                                        1) * 0x78;
            FUN_00a44e38(&local_7c0,&local_810,&UNK_007604c0 + lVar31);
            FUN_00a44e38(&local_7e8,&local_7e8,&UNK_00760498 + lVar31);
            FUN_00a44e38(&local_798,&UNK_007604e8 + lVar31,auStack_838);
            local_810 = local_7c0 - local_7e8;
            local_80c = local_7bc - local_7e4;
            local_7e8 = local_7e8 + local_7c0;
            local_7e4 = local_7e4 + local_7bc;
            local_808 = local_7b8 - local_7e0;
            local_7e0 = local_7e0 + local_7b8;
            local_804 = local_7b4 - local_7dc;
            local_7dc = local_7dc + local_7b4;
            local_800 = local_7b0 - local_7d8;
            local_7d8 = local_7d8 + local_7b0;
            local_7fc = local_7ac - local_7d4;
            local_7d4 = local_7d4 + local_7ac;
            local_7f8 = local_7a8 - local_7d0;
            local_7d0 = local_7d0 + local_7a8;
            local_7f4 = local_7a4 - local_7cc;
            local_7cc = local_7cc + local_7a4;
            local_7c0 = (int)local_860 * 2 - local_798;
            local_7f0 = local_7a0 - local_7c8;
            local_7c8 = local_7c8 + local_7a0;
            local_7bc = local_860._4_4_ * 2 - local_794;
            local_7ec = local_79c - local_7c4;
            local_7b8 = (int)uStack_858 * 2 - local_790;
            local_7c4 = local_7c4 + local_79c;
            local_7b4 = uStack_858._4_4_ * 2 - local_78c;
            local_798 = local_798 + (int)local_860 * 2;
            local_7b0 = (int)local_850 * 2 - local_788;
            local_794 = local_794 + local_860._4_4_ * 2;
            local_790 = local_790 + (int)uStack_858 * 2;
            local_7ac = local_850._4_4_ * 2 - local_784;
            local_78c = local_78c + uStack_858._4_4_ * 2;
            local_7a8 = (int)local_848 * 2 - local_780;
            local_784 = local_784 + local_850._4_4_ * 2;
            local_7a4 = local_848._4_4_ * 2 - local_77c;
            local_788 = local_788 + (int)local_850 * 2;
            local_780 = local_780 + (int)local_848 * 2;
            local_7a0 = (int)local_840 * 2 - local_778;
            local_77c = local_77c + local_848._4_4_ * 2;
            local_778 = local_778 + (int)local_840 * 2;
            local_79c = local_840._4_4_ * 2 - local_774;
            local_774 = local_774 + local_840._4_4_ * 2;
          }
        }
        else {
          FUN_00a44e38(&local_8b0,&local_810,&local_798);
          FUN_00a44e38(&local_888,&local_7e8,&local_7c0);
          FUN_00a44e38(&local_860,&local_7c0,&local_798);
          FUN_00a44e38(auStack_838,&local_810,&local_7e8);
          FUN_00a45d34(&local_810,&local_8b0,(uVar41 >> 1 & 0x7f) * 0x78 + 0x760498);
        }
        FUN_00a44e38(&local_a90,&local_810,&local_798);
        FUN_00a44e38(&local_a68,&local_7e8,&local_7c0);
        FUN_00a44e38((long)&local_a44 + 4,&local_7c0,&local_798);
        bVar27 = 0 < lVar30;
        lVar30 = lVar30 + -1;
      } while (bVar27);
    }
    FUN_00a44a70(local_770,(long)&local_a44 + 4);
    FUN_00a44e38(local_270 + 0x100,&local_a90,local_770);
    FUN_00a44e38(local_270,&local_a68,local_770);
    FUN_00a45158(&local_810,local_270);
    FUN_00a45158(local_970,local_270 + 0x100);
    local_7f4 = CONCAT13(local_7f4._3_1_ ^ local_970[0] << 7,(undefined3)local_7f4);
    iVar28 = CRYPTO_memcmp(&local_810,param_3,0x20);
    bVar27 = iVar28 == 0;
  }
  EVP_MD_free(type);
  EVP_MD_CTX_free(ctx);
  return bVar27;
}

