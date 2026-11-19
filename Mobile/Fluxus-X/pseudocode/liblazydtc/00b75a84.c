/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b75a84
 */

void mbedtls_des_self_test(int param_1)

{
  uint uVar1;
  char *pcVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  bool bVar12;
  int iVar13;
  long lVar14;
  uchar uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  long lVar18;
  undefined8 uVar19;
  uint uVar20;
  int iVar21;
  ulong uVar22;
  undefined4 auStack_470 [24];
  ulong local_410;
  long local_408;
  undefined8 local_400;
  long local_3f8;
  undefined8 local_3f0;
  undefined8 local_370 [16];
  undefined8 local_2f0;
  undefined8 local_270;
  undefined8 local_268;
  undefined8 local_260;
  undefined8 local_258;
  undefined8 local_250;
  undefined8 local_248;
  undefined8 local_240;
  undefined8 local_238;
  undefined8 uStack_230;
  undefined8 local_228;
  undefined8 local_220;
  undefined8 local_218;
  undefined8 local_210;
  undefined8 local_208;
  undefined8 local_200;
  undefined8 local_1f8;
  undefined8 local_1f0;
  undefined8 local_170 [16];
  undefined8 local_f0;
  long local_70;
  
  local_408 = tpidr_el0;
  local_70 = *(long *)(local_408 + 0x28);
  memset(&local_270,0,0x80);
  memset(&local_3f0,0,0x180);
  uVar22 = 0;
  do {
    iVar21 = (int)(uVar22 >> 1);
    if (param_1 != 0) {
      uVar15 = ' ';
      if (iVar21 != 0) {
        uVar15 = '3';
      }
      pcVar2 = "dec";
      if ((uVar22 & 1) != 0) {
        pcVar2 = "enc";
      }
      printf("  DES%c-ECB-%3d (%s): ",uVar15,iVar21 * 0x38 + 0x38,pcVar2);
    }
    local_3f8 = 0x7420736920776f4e;
    switch(uVar22 & 0x7fffffff) {
    case 0:
      mbedtls_des_setkey(&local_270,&DAT_0077f140);
      uVar11 = local_238;
      uVar10 = local_240;
      uVar9 = local_248;
      uVar8 = local_250;
      uVar7 = local_258;
      uVar6 = local_260;
      uVar5 = local_268;
      uVar19 = local_270;
      local_270 = local_1f8;
      local_1f8 = uVar19;
      local_268 = local_200;
      local_200 = uVar5;
      local_260 = local_208;
      local_208 = uVar6;
      local_258 = local_210;
      local_210 = uVar7;
      local_250 = local_218;
      local_218 = uVar8;
      local_248 = local_220;
      local_220 = uVar9;
      local_240 = local_228;
      local_228 = uVar10;
      local_238 = uStack_230;
      uStack_230 = uVar11;
      break;
    case 1:
      mbedtls_des_setkey(&local_270,&DAT_0077f140);
      break;
    case 2:
      mbedtls_des_setkey(&local_1f0,&DAT_0077f140);
      mbedtls_des_setkey(local_370,&DAT_0077f148);
      uVar16 = 0;
      lVar18 = 0xf8;
      lVar14 = 0;
      do {
        uVar3 = *(undefined4 *)((long)&local_270 + lVar18);
        uVar4 = *(undefined4 *)((long)&local_270 + lVar18 + 4);
        uVar16 = uVar16 + 2;
        *(undefined4 *)((long)local_370 + lVar14 + -0x80) = uVar3;
        *(undefined4 *)((long)local_370 + lVar14 + -0x7c) = uVar4;
        uVar19 = *(undefined8 *)((long)local_370 + lVar18 + -0x80);
        lVar18 = lVar18 + -8;
        *(undefined4 *)((long)local_370 + lVar14 + 0x80) = uVar3;
        *(undefined8 *)((long)local_170 + lVar14) = uVar19;
        uVar19 = *(undefined8 *)((long)local_170 + lVar14 + -0x80);
        *(undefined4 *)((long)local_370 + lVar14 + 0x84) = uVar4;
        *(undefined8 *)((long)local_170 + lVar14 + 0x80) = uVar19;
        lVar14 = lVar14 + 8;
      } while (uVar16 < 0x20);
      goto LAB_00b75cec;
    case 3:
      mbedtls_des_setkey(&local_3f0,&DAT_0077f140);
      mbedtls_des_setkey(local_170,&DAT_0077f148);
      uVar16 = 0;
      lVar18 = 0xf8;
      lVar14 = 0;
      do {
        uVar3 = *(undefined4 *)((long)auStack_470 + lVar18);
        uVar4 = *(undefined4 *)((long)auStack_470 + lVar18 + 4);
        uVar16 = uVar16 + 2;
        *(undefined4 *)((long)local_170 + lVar14 + -0x80) = uVar3;
        *(undefined4 *)((long)local_170 + lVar14 + -0x7c) = uVar4;
        uVar19 = *(undefined8 *)((long)local_170 + lVar18 + -0x80);
        lVar18 = lVar18 + -8;
        *(undefined4 *)((long)local_170 + lVar14 + 0x80) = uVar3;
        *(undefined8 *)((long)local_370 + lVar14) = uVar19;
        uVar19 = *(undefined8 *)((long)local_370 + lVar14 + -0x80);
        *(undefined4 *)((long)local_170 + lVar14 + 0x84) = uVar4;
        *(undefined8 *)((long)local_370 + lVar14 + 0x80) = uVar19;
        lVar14 = lVar14 + 8;
      } while (uVar16 < 0x20);
LAB_00b75cec:
      mbedtls_platform_zeroize(&local_1f0,0x180);
      break;
    case 4:
      mbedtls_des3_set3key_dec(&local_3f0,&DAT_0077f140);
      break;
    case 5:
      mbedtls_des3_set3key_enc(&local_3f0,&DAT_0077f140);
      break;
    default:
      goto switchD_00b75b6c_default;
    }
    iVar13 = 100;
    do {
      while (iVar21 != 0) {
        mbedtls_des3_crypt_ecb(&local_3f0,&local_3f8,&local_3f8);
        iVar13 = iVar13 + -1;
        if (iVar13 == 0) goto LAB_00b75d5c;
      }
      mbedtls_des_crypt_ecb(&local_270,&local_3f8,&local_3f8);
      iVar13 = iVar13 + -1;
    } while (iVar13 != 0);
LAB_00b75d5c:
    if ((uVar22 & 1) == 0) {
      puVar17 = &DAT_0077f158;
    }
    else {
      puVar17 = &DAT_0077f170;
    }
    if (local_3f8 != puVar17[uVar22 >> 1]) goto LAB_00b76170;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar1 = (int)uVar22 + 1;
    uVar22 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  uVar22 = 0;
  do {
    uVar1 = (uint)uVar22 & 1;
    iVar21 = (int)(uVar22 >> 1);
    if (param_1 != 0) {
      uVar15 = ' ';
      if (iVar21 != 0) {
        uVar15 = '3';
      }
      pcVar2 = "dec";
      if ((uVar22 & 1) != 0) {
        pcVar2 = "enc";
      }
      printf("  DES%c-CBC-%3d (%s): ",uVar15,iVar21 * 0x38 + 0x38,pcVar2);
    }
    local_400 = 0xefcdab9078563412;
    local_3f8 = 0x7420736920776f4e;
    switch(uVar22 & 0x7fffffff) {
    case 0:
      mbedtls_des_setkey(&local_270,&DAT_0077f140);
      uVar11 = local_238;
      uVar10 = local_240;
      uVar9 = local_248;
      uVar8 = local_250;
      uVar7 = local_258;
      uVar6 = local_260;
      uVar5 = local_268;
      uVar19 = local_270;
      local_270 = local_1f8;
      local_1f8 = uVar19;
      local_268 = local_200;
      local_200 = uVar5;
      local_260 = local_208;
      local_208 = uVar6;
      local_258 = local_210;
      local_210 = uVar7;
      local_250 = local_218;
      local_218 = uVar8;
      local_248 = local_220;
      local_220 = uVar9;
      local_240 = local_228;
      local_228 = uVar10;
      local_238 = uStack_230;
      uStack_230 = uVar11;
      break;
    case 1:
      mbedtls_des_setkey(&local_270,&DAT_0077f140);
      break;
    case 2:
      mbedtls_des_setkey(&local_1f0,&DAT_0077f140);
      mbedtls_des_setkey(local_370,&DAT_0077f148);
      uVar16 = 0;
      lVar18 = 0xf8;
      lVar14 = 0;
      do {
        uVar3 = *(undefined4 *)((long)&local_270 + lVar18);
        uVar4 = *(undefined4 *)((long)&local_270 + lVar18 + 4);
        uVar16 = uVar16 + 2;
        *(undefined4 *)((long)local_370 + lVar14 + -0x80) = uVar3;
        *(undefined4 *)((long)local_370 + lVar14 + -0x7c) = uVar4;
        uVar19 = *(undefined8 *)((long)local_370 + lVar18 + -0x80);
        lVar18 = lVar18 + -8;
        *(undefined4 *)((long)local_370 + lVar14 + 0x80) = uVar3;
        *(undefined8 *)((long)local_170 + lVar14) = uVar19;
        uVar19 = *(undefined8 *)((long)local_170 + lVar14 + -0x80);
        *(undefined4 *)((long)local_370 + lVar14 + 0x84) = uVar4;
        *(undefined8 *)((long)local_170 + lVar14 + 0x80) = uVar19;
        lVar14 = lVar14 + 8;
      } while (uVar16 < 0x20);
      goto LAB_00b75ff4;
    case 3:
      mbedtls_des_setkey(&local_3f0,&DAT_0077f140);
      mbedtls_des_setkey(local_170,&DAT_0077f148);
      uVar16 = 0;
      lVar18 = 0xf8;
      lVar14 = 0;
      do {
        uVar3 = *(undefined4 *)((long)auStack_470 + lVar18);
        uVar4 = *(undefined4 *)((long)auStack_470 + lVar18 + 4);
        uVar16 = uVar16 + 2;
        *(undefined4 *)((long)local_170 + lVar14 + -0x80) = uVar3;
        *(undefined4 *)((long)local_170 + lVar14 + -0x7c) = uVar4;
        uVar19 = *(undefined8 *)((long)local_170 + lVar18 + -0x80);
        lVar18 = lVar18 + -8;
        *(undefined4 *)((long)local_170 + lVar14 + 0x80) = uVar3;
        *(undefined8 *)((long)local_370 + lVar14) = uVar19;
        uVar19 = *(undefined8 *)((long)local_370 + lVar14 + -0x80);
        *(undefined4 *)((long)local_170 + lVar14 + 0x84) = uVar4;
        *(undefined8 *)((long)local_370 + lVar14 + 0x80) = uVar19;
        lVar14 = lVar14 + 8;
      } while (uVar16 < 0x20);
LAB_00b75ff4:
      mbedtls_platform_zeroize(&local_1f0,0x180);
      break;
    case 4:
      mbedtls_des3_set3key_dec(&local_3f0,&DAT_0077f140);
      break;
    case 5:
      mbedtls_des3_set3key_enc(&local_3f0,&DAT_0077f140);
      break;
    default:
      goto switchD_00b75b6c_default;
    }
    uVar20 = 0;
    local_410 = uVar22;
    if ((uVar22 & 1) == 0) {
      do {
        if (iVar21 == 0) {
          iVar13 = mbedtls_des_crypt_cbc(&local_270,0,8,&local_400,&local_3f8,&local_3f8);
        }
        else {
          iVar13 = mbedtls_des3_crypt_cbc(&local_3f0,0,8,&local_400,&local_3f8,&local_3f8);
        }
        if (iVar13 != 0) goto LAB_00b76184;
        uVar20 = uVar20 + 1;
      } while (uVar20 < 100);
      if ((uVar22 & 1) == 0) goto LAB_00b76088;
LAB_00b7611c:
      puVar17 = &DAT_0077f1a0;
    }
    else {
      lVar14 = -0x1032546f87a9cbee;
      lVar18 = local_3f8;
      do {
        local_3f8 = lVar18;
        lVar18 = lVar14;
        if (iVar21 == 0) {
          iVar13 = mbedtls_des_crypt_cbc(&local_270,uVar1,8,&local_400,&local_3f8,&local_3f8);
        }
        else {
          iVar13 = mbedtls_des3_crypt_cbc(&local_3f0,uVar1,8,&local_400,&local_3f8,&local_3f8);
        }
        if (iVar13 != 0) goto LAB_00b76184;
        uVar20 = uVar20 + 1;
        lVar14 = local_3f8;
      } while (uVar20 < 100);
      if ((uVar22 & 1) != 0) goto LAB_00b7611c;
LAB_00b76088:
      puVar17 = &DAT_0077f188;
    }
    uVar16 = local_410;
    if (local_3f8 != puVar17[uVar22 >> 1]) goto LAB_00b76170;
    if (param_1 != 0) {
      puts("passed");
    }
    uVar1 = (int)uVar16 + 1;
    uVar22 = (ulong)uVar1;
  } while (uVar1 < 6);
  if (param_1 != 0) {
    putchar(10);
  }
  iVar13 = 0;
LAB_00b76184:
  mbedtls_platform_zeroize(&local_270,0x80);
  mbedtls_platform_zeroize(&local_3f0,0x180);
  bVar12 = iVar13 != 0;
LAB_00b761a4:
  if (*(long *)(local_408 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar12);
  }
  return;
switchD_00b75b6c_default:
  local_3f8 = 0x7420736920776f4e;
  bVar12 = true;
  goto LAB_00b761a4;
LAB_00b76170:
  if (param_1 != 0) {
    puts("failed");
  }
  iVar13 = 1;
  goto LAB_00b76184;
}

