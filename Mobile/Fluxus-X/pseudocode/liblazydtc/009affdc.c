/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009affdc
 */

undefined4
FUN_009affdc(byte *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,long param_5)

{
  int iVar1;
  uint uVar2;
  byte bVar3;
  bool bVar4;
  uint uVar5;
  int iVar6;
  ulong uVar7;
  undefined8 *puVar8;
  size_t __n;
  int *piVar9;
  byte *pbVar10;
  byte *__s1;
  char *__s2;
  undefined4 local_90;
  int local_8c;
  uint local_74;
  uint local_70;
  uint uStack_6c;
  uint local_68;
  uint local_64;
  
  local_90 = 1;
  pbVar10 = param_1;
LAB_009b002c:
  uVar7 = (ulong)*pbVar10;
LAB_009b0030:
  iVar6 = 1;
  switch(uVar7) {
  case 0:
    goto switchD_009b0054_caseD_0;
  case 0x20:
  case 0x2c:
  case 0x3a:
  case 0x3b:
    goto switchD_009b0054_caseD_20;
  case 0x21:
    pbVar10 = pbVar10 + 1;
    iVar6 = 2;
    break;
  case 0x2b:
    pbVar10 = pbVar10 + 1;
    iVar6 = 4;
    break;
  case 0x2d:
    pbVar10 = pbVar10 + 1;
    iVar6 = 3;
    break;
  case 0x40:
    pbVar10 = pbVar10 + 1;
    iVar6 = 5;
  }
  local_70 = 0;
  uStack_6c = 0;
  local_74 = 0;
  local_64 = 0;
  local_8c = 0;
  local_68 = 0;
  while( true ) {
    __s1 = pbVar10;
    __n = 0;
    while( true ) {
      bVar3 = __s1[__n];
      if (((0x19 < (byte)((bVar3 & 0xdf) + 0xbf)) && (9 < (byte)(bVar3 - 0x30))) &&
         ((0x3d < bVar3 || ((1L << ((ulong)bVar3 & 0x3f) & 0x2000600000000000U) == 0)))) break;
      __n = __n + 1;
    }
    if ((uint)__n == 0) {
      ERR_new(param_1);
      ERR_set_debug("ssl/ssl_ciph.c",0x42a,"ssl_cipher_process_rulestr");
      ERR_set_error(0x14,0x118,0);
      return 0;
    }
    if (iVar6 == 5) break;
    pbVar10 = __s1 + __n;
    piVar9 = (int *)*param_4;
    if (piVar9 == (int *)0x0) {
LAB_009b02cc:
      if (bVar3 == 0x2b) {
        pbVar10 = pbVar10 + 1;
      }
      while ((uVar7 = (ulong)*pbVar10, 0x3b < *pbVar10 ||
             ((1L << (uVar7 & 0x3f) & 0xc00100100000001U) == 0))) {
        pbVar10 = pbVar10 + 1;
      }
      goto LAB_009b0300;
    }
    puVar8 = param_4;
    while( true ) {
      puVar8 = puVar8 + 1;
      __s2 = *(char **)(piVar9 + 2);
      uVar5 = strncmp((char *)__s1,__s2,__n);
      param_1 = (byte *)(ulong)uVar5;
      if ((uVar5 == 0) && (__s2[__n] == '\0')) break;
      piVar9 = (int *)*puVar8;
      if (piVar9 == (int *)0x0) goto LAB_009b02cc;
    }
    uVar5 = piVar9[7];
    if (uVar5 != 0) {
      if ((local_68 != 0) && (uVar5 = uVar5 & local_68, uVar5 == 0)) goto LAB_009b02cc;
      local_68 = uVar5;
    }
    uVar5 = piVar9[8];
    if (uVar5 != 0) {
      if (uStack_6c == 0) {
        uStack_6c = uVar5;
      }
      else {
        uStack_6c = uVar5 & uStack_6c;
        if (uStack_6c == 0) goto LAB_009b02cc;
      }
    }
    uVar5 = piVar9[9];
    if (uVar5 != 0) {
      if (local_70 == 0) {
        local_70 = uVar5;
      }
      else {
        local_70 = uVar5 & local_70;
        if (local_70 == 0) goto LAB_009b02cc;
      }
    }
    uVar5 = piVar9[10];
    if (uVar5 != 0) {
      if (local_74 == 0) {
        local_74 = uVar5;
      }
      else {
        local_74 = uVar5 & local_74;
        if (local_74 == 0) goto LAB_009b02cc;
      }
    }
    uVar2 = piVar9[0xf];
    uVar5 = uVar2 & 0x1f;
    if (uVar5 == 0) {
LAB_009b0238:
      if ((uVar2 >> 5 & 1) == 0) goto LAB_009b0278;
LAB_009b023c:
      if (local_64 >> 5 != 0) {
        local_64 = local_64 & (uVar2 | 0xffffffdf);
        if (local_64 >> 5 == 0) goto LAB_009b02cc;
        goto LAB_009b0278;
      }
      local_64 = local_64 | uVar2 & 0x20;
      if (*piVar9 != 0) goto LAB_009b0280;
LAB_009b00a0:
      iVar1 = piVar9[0xb];
      if (iVar1 == 0) {
        param_1 = (byte *)0x0;
      }
      else if (local_8c == 0) {
        param_1 = (byte *)0x0;
        local_8c = iVar1;
      }
      else {
        param_1 = (byte *)0x0;
        bVar4 = local_8c != iVar1;
        local_8c = iVar1;
        if (bVar4) goto LAB_009b02cc;
      }
    }
    else {
      if ((local_64 & 0x1f) != 0) {
        local_64 = (uVar2 | 0xffffffe0) & local_64;
        if ((local_64 & 0x1f) == 0) goto LAB_009b02cc;
        goto LAB_009b0238;
      }
      local_64 = uVar5;
      if ((uVar2 >> 5 & 1) != 0) goto LAB_009b023c;
LAB_009b0278:
      if (*piVar9 == 0) goto LAB_009b00a0;
LAB_009b0280:
      param_1 = (byte *)(ulong)(uint)piVar9[6];
    }
    pbVar10 = pbVar10 + 1;
    if (bVar3 != 0x2b) goto code_r0x009b0290;
  }
  uVar5 = (uint)__n & 0x7fffffff;
  pbVar10 = __s1 + __n;
  if (uVar5 == 10) {
    uVar5 = strncmp((char *)__s1,"SECLEVEL=",9);
    param_1 = (byte *)(ulong)uVar5;
    if (uVar5 != 0) goto LAB_009b036c;
    if (__s1[9] - 0x30 < 6) {
      *(uint *)(param_5 + 0x1f0) = __s1[9] - 0x30;
      goto LAB_009b0408;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_ciph.c",0x4c6,"ssl_cipher_process_rulestr");
    param_1 = (byte *)ERR_set_error(0x14,0x118,0);
  }
  else {
    if (uVar5 == 8) {
      uVar5 = strncmp((char *)__s1,"STRENGTH",8);
      param_1 = (byte *)(ulong)uVar5;
      if (uVar5 == 0) {
        param_1 = (byte *)FUN_009afe44(param_2,param_3);
        if ((int)param_1 == 0) goto LAB_009b03a4;
        goto LAB_009b0408;
      }
    }
LAB_009b036c:
    ERR_new(param_1);
    ERR_set_debug("ssl/ssl_ciph.c",0x4cc,"ssl_cipher_process_rulestr");
    param_1 = (byte *)ERR_set_error(0x14,0x118,0);
  }
LAB_009b03a4:
  local_90 = 0;
LAB_009b0408:
  while ((uVar7 = (ulong)*pbVar10, 0x3b < *pbVar10 ||
         ((1L << (uVar7 & 0x3f) & 0xc00100100000001U) == 0))) {
    pbVar10 = pbVar10 + 1;
  }
LAB_009b0300:
  if ((int)uVar7 == 0) {
    return local_90;
  }
  goto LAB_009b0030;
switchD_009b0054_caseD_20:
  pbVar10 = pbVar10 + 1;
  goto LAB_009b002c;
code_r0x009b0290:
  param_1 = (byte *)FUN_009afb54(param_1,local_68,uStack_6c,local_70,local_74,local_8c,local_64,
                                 iVar6,0xffffffff,param_2,param_3);
  pbVar10 = __s1 + __n;
  uVar7 = (ulong)*pbVar10;
  if (*pbVar10 == 0) {
switchD_009b0054_caseD_0:
    return local_90;
  }
  goto LAB_009b0030;
}

