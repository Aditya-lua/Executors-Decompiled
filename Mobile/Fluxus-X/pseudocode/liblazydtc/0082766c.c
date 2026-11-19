/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082766c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0082766c(undefined8 param_1)

{
  byte *pbVar1;
  basic_string_conflict *pbVar2;
  undefined1 *puVar3;
  ulong uVar4;
  long lVar5;
  undefined7 *puVar6;
  uint3 uVar7;
  ulong uVar8;
  char *pcVar9;
  int iVar10;
  char *__s;
  size_t sVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined **ppuVar14;
  ulong *puVar15;
  undefined8 uVar16;
  void *pvVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined **local_1f0;
  undefined8 local_1e8;
  ulong *local_1e0;
  void *local_1d8;
  byte local_1d0;
  undefined7 uStack_1cf;
  ulong uStack_1c8;
  undefined7 *local_1c0;
  undefined8 local_1b8;
  basic_string_conflict *pbStack_1b0;
  void *local_1a8;
  undefined1 auStack_1a0 [8];
  undefined8 local_198;
  undefined1 uStack_181;
  undefined *local_180;
  size_t local_178;
  void *local_170;
  byte local_168;
  undefined7 uStack_167;
  ulong local_160;
  undefined7 *local_158;
  int local_f0;
  byte local_e8;
  undefined1 auStack_e7 [15];
  undefined1 *local_d8;
  undefined8 local_70;
  ulong uStack_68;
  undefined2 local_60;
  undefined6 uStack_5e;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  iVar10 = FUN_008aa984();
  if ((iVar10 < 2) || (iVar10 = FUN_008ab43c(param_1,2), iVar10 == 0)) {
    __s = (char *)FUN_008aefa4(param_1,1,0);
  }
  else {
    __s = (char *)FUN_008ab8a4(param_1,2,0);
  }
  if (((DAT_00d1d040 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1d040), iVar10 != 0)) {
    DAT_00d1d030 = 0x22dcecf4f15250ac;
    _DAT_00d1d038 = 0x1375797;
    __cxa_atexit(&LAB_00828780,&DAT_00d1d030,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d040);
  }
  if (DAT_00d1d03b == '\x01') {
    DAT_00d1d030 = DAT_00d1d030 ^ 0x47bbadd9833723f9;
    _DAT_00d1d038 = _DAT_00d1d038 & 0xffffff ^ 0x3723f9;
  }
  local_1f0 = (undefined **)&DAT_00d1d030;
  if (((DAT_00d1d060 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1d060), iVar10 != 0)) {
    _DAT_00d1d058 = 0x1bbd9bced7e4d90;
    DAT_00d1d050 = 0x1094d5b6ef554cab;
    __cxa_atexit(&LAB_0082878c,&DAT_00d1d050,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d060);
  }
  uVar4 = _DAT_00d1d058;
  if (DAT_00d1d05f == '\x01') {
    uVar8 = _DAT_00d1d058 >> 0x30;
    DAT_00d1d050 = DAT_00d1d050 ^ 0x47bbadd9833723f9;
    _DAT_00d1d058 = (uint5)(DAT_00d1d05c ^ 0xd9) << 0x20;
    _DAT_00d1d058 =
         (ulong)CONCAT34((int3)(CONCAT16((char)uVar8,CONCAT15(DAT_00d1d05d,_DAT_00d1d058)) >> 0x20),
                         (int)uVar4) ^ 0xbbad00833723f9;
  }
  local_1b8 = &DAT_00d1d050;
                    /* try { // try from 008277d4 to 008277e3 has its CatchHandler @ 008283c8 */
  FUN_00828468(&local_180,&local_1f0,&local_1b8);
                    /* try { // try from 008277e4 to 008277f7 has its CatchHandler @ 008283b8 */
  FUN_008285a4(auStack_1a0,&local_180,1,&local_70);
  if ((local_168 & 1) != 0) {
    operator_delete(local_158,CONCAT71(uStack_167,local_168) & 0xfffffffffffffffe);
  }
  if (((ulong)local_180 & 1) != 0) {
    operator_delete(local_170,(ulong)local_180 & 0xfffffffffffffffe);
  }
                    /* try { // try from 00827828 to 00827833 has its CatchHandler @ 008283b0 */
  FUN_008250b8(&local_1b8,param_1);
  pbVar2 = (basic_string_conflict *)((ulong)local_1b8 >> 1 & 0x7f);
  if (((ulong)local_1b8 & 1) != 0) {
    pbVar2 = pbStack_1b0;
  }
  if (pbVar2 == (basic_string_conflict *)0x0) goto LAB_00827bf8;
  puVar15 = &DAT_00d1d070;
  if ((DAT_00d1d080 & 1) == 0) goto LAB_00828118;
  do {
    if (DAT_00d1d07f == '\x01') {
      *(undefined1 *)((long)puVar15 + 0xf) = 0;
      *(byte *)((long)puVar15 + 0xc) = *(byte *)((long)puVar15 + 0xc) ^ 0xa5;
      *(byte *)((long)puVar15 + 0xd) = *(byte *)((long)puVar15 + 0xd) ^ 0xfd;
      *(byte *)((long)puVar15 + 0xe) = *(byte *)((long)puVar15 + 0xe) ^ 0xfb;
      *puVar15 = *puVar15 ^ 0x93fbfda56fbfbdf5;
      *(uint *)(puVar15 + 1) = (uint)puVar15[1] ^ 0x6fbfbdf5;
    }
    sVar11 = strlen((char *)&DAT_00d1d070);
    if (0xfffffffffffffff7 < sVar11) {
      if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082816c to 0082816f has its CatchHandler @ 0082836c */
        FUN_007fe124();
      }
      goto LAB_00828450;
    }
    if (sVar11 < 0x17) {
      pvVar17 = (void *)((ulong)&local_180 | 1);
      local_180 = (undefined *)CONCAT71(local_180._1_7_,(char)((int)sVar11 << 1));
      if (sVar11 != 0) goto LAB_00827930;
    }
    else {
      uVar4 = 0x1a;
      if ((sVar11 | 7) != 0x17) {
        uVar4 = (sVar11 | 7) + 1;
      }
                    /* try { // try from 00827918 to 0082791f has its CatchHandler @ 0082836c */
      pvVar17 = operator_new(uVar4);
      local_180 = (undefined *)(uVar4 | 1);
      local_178 = sVar11;
      local_170 = pvVar17;
LAB_00827930:
      memcpy(pvVar17,&DAT_00d1d070,sVar11);
    }
    local_1f0 = &local_180;
    *(undefined1 *)((long)pvVar17 + sVar11) = 0;
                    /* try { // try from 00827950 to 008279c7 has its CatchHandler @ 0082831c */
    ppuVar14 = (undefined **)&DAT_002dd6a5;
    lVar12 = FUN_00825c7c(auStack_1a0,&local_180,&DAT_002dd6a5,&local_1f0,&local_70);
    pbVar1 = (byte *)(lVar12 + 0x38);
    if (pbVar1 != (byte *)&local_1b8) {
      if ((*pbVar1 & 1) == 0) {
        if (((ulong)local_1b8 & 1) == 0) {
          *(basic_string_conflict **)(lVar12 + 0x40) = pbStack_1b0;
          *(undefined8 **)pbVar1 = local_1b8;
          *(void **)(lVar12 + 0x48) = local_1a8;
        }
        else {
          ppuVar14 = (undefined **)pbStack_1b0;
          FUN_007fdf5c(pbVar1,local_1a8);
        }
      }
      else {
        if (((ulong)local_1b8 & 1) == 0) {
          ppuVar14 = (undefined **)((ulong)local_1b8 >> 1 & 0x7f);
          pvVar17 = (void *)((long)&local_1b8 + 1);
        }
        else {
          ppuVar14 = (undefined **)pbStack_1b0;
          pvVar17 = local_1a8;
        }
        FUN_007fe004(pbVar1,pvVar17);
      }
    }
    if (((ulong)local_180 & 1) != 0) {
      operator_delete(local_170,(ulong)local_180 & 0xfffffffffffffffe);
    }
    if (((DAT_00d1d098 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1d098), iVar10 != 0)) {
      ppuVar14 = &PTR_LOOP_00c48880;
      DAT_00d1d094 = '\x01';
      DAT_00d1d088 = 0xbf76f44486163b92;
      DAT_00d1d090 = 0xe77323cb;
      __cxa_atexit(&LAB_00828a94,&DAT_00d1d088);
      __cxa_guard_release(&DAT_00d1d098);
    }
    if (DAT_00d1d094 == '\x01') {
      DAT_00d1d094 = '\0';
      DAT_00d1d088 = DAT_00d1d088 ^ 0xdb3f9129e75119e9;
      DAT_00d1d090 = DAT_00d1d090 ^ 0xe75119e9;
    }
                    /* try { // try from 00827a3c to 00827a4f has its CatchHandler @ 008282e4 */
    std::__ndk1::operator+
              ((__ndk1 *)&DAT_00d1d088,(char *)&local_1b8,(basic_string_conflict *)ppuVar14);
    if (((DAT_00d1d0a8 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1d0a8), iVar10 != 0)) {
      _DAT_00d1d0a0 = 0x15164cb;
      __cxa_atexit(&LAB_00828aa0,&DAT_00d1d0a0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d0a8);
    }
    if (DAT_00d1d0a3 == '\x01') {
      uVar7 = (uint3)_DAT_00d1d0a0;
      _DAT_00d1d0a0 = (uint)(uVar7 ^ 0x5119e9);
    }
                    /* try { // try from 00827aac to 00827abb has its CatchHandler @ 008282dc */
    puVar13 = (undefined8 *)
              std::__ndk1::
              basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                        ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)&local_180,&DAT_00d1d0a0);
    uVar19 = puVar13[1];
    uVar18 = *puVar13;
    uVar16 = puVar13[2];
    *puVar13 = 0;
    puVar13[1] = 0;
    puVar13[2] = 0;
    uStack_68 = 0x9212ff468e226a8c;
    local_70 = (undefined ***)0x8812e9468b3376bb;
    local_60 = 0x198d;
    if (((DAT_00d1d0c8 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1d0c8), iVar10 != 0)) {
                    /* try { // try from 0082821c to 0082822b has its CatchHandler @ 00828294 */
      FUN_00828aac(&DAT_00d1d0b0,&local_70);
      __cxa_atexit(&LAB_00828b48,&DAT_00d1d0b0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d0c8);
    }
    FUN_00828b54(&DAT_00d1d0b0);
    sVar11 = strlen(&DAT_00d1d0b0);
    if (0xfffffffffffffff7 < sVar11) {
      if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00828268 to 0082826b has its CatchHandler @ 0082833c */
        FUN_007fe124();
      }
      goto LAB_00828450;
    }
    if (sVar11 < 0x17) {
      puVar15 = (ulong *)((ulong)&local_1f0 | 1);
      local_1f0 = (undefined **)CONCAT71(local_1f0._1_7_,(char)((int)sVar11 << 1));
      if (sVar11 != 0) goto LAB_00827b64;
    }
    else {
      uVar4 = 0x1a;
      if ((sVar11 | 7) != 0x17) {
        uVar4 = (sVar11 | 7) + 1;
      }
                    /* try { // try from 00827b4c to 00827b53 has its CatchHandler @ 0082833c */
      puVar15 = operator_new(uVar4);
      local_1f0 = (undefined **)(uVar4 | 1);
      local_1e8 = sVar11;
      local_1e0 = puVar15;
LAB_00827b64:
      memcpy(puVar15,&DAT_00d1d0b0,sVar11);
    }
    local_70 = &local_1f0;
    *(undefined1 *)((long)puVar15 + sVar11) = 0;
                    /* try { // try from 00827b84 to 00827b9f has its CatchHandler @ 008282bc */
    lVar12 = FUN_00825c7c(auStack_1a0,&local_1f0,&DAT_002dd6a5,&local_70,&local_1d0);
    if ((*(byte *)(lVar12 + 0x38) & 1) != 0) {
      operator_delete(*(void **)(lVar12 + 0x48),*(ulong *)(lVar12 + 0x38) & 0xfffffffffffffffe);
    }
    *(undefined8 *)(lVar12 + 0x48) = uVar16;
    *(undefined8 *)(lVar12 + 0x40) = uVar19;
    *(undefined8 *)(lVar12 + 0x38) = uVar18;
    if (((ulong)local_1f0 & 1) != 0) {
      operator_delete(local_1e0,(ulong)local_1f0 & 0xfffffffffffffffe);
    }
    if (((ulong)local_180 & 1) != 0) {
      operator_delete(local_170,(ulong)local_180 & 0xfffffffffffffffe);
    }
LAB_00827bf8:
                    /* try { // try from 00827bf8 to 00827c03 has its CatchHandler @ 008283a8 */
    FUN_008253f8(&local_70,param_1);
    pcVar9 = DAT_00cca8a8;
    uVar4 = (ulong)local_70 >> 1 & 0x7f;
    if (((ulong)local_70 & 1) != 0) {
      uVar4 = uStack_68;
    }
    if (uVar4 != 0) {
      sVar11 = strlen(DAT_00cca8a8);
      if (0xfffffffffffffff7 < sVar11) {
        if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082827c to 0082827f has its CatchHandler @ 00828334 */
          FUN_007fe124();
        }
        goto LAB_00828450;
      }
      if (sVar11 < 0x17) {
        pvVar17 = (void *)((ulong)&local_180 | 1);
        local_180 = (undefined *)CONCAT71(local_180._1_7_,(char)((int)sVar11 << 1));
        if (sVar11 != 0) goto LAB_00827c80;
      }
      else {
        uVar4 = 0x1a;
        if ((sVar11 | 7) != 0x17) {
          uVar4 = (sVar11 | 7) + 1;
        }
                    /* try { // try from 00827c68 to 00827c6f has its CatchHandler @ 00828334 */
        pvVar17 = operator_new(uVar4);
        local_180 = (undefined *)(uVar4 | 1);
        local_178 = sVar11;
        local_170 = pvVar17;
LAB_00827c80:
        memmove(pvVar17,pcVar9,sVar11);
      }
      local_1f0 = &local_180;
      *(undefined1 *)((long)pvVar17 + sVar11) = 0;
                    /* try { // try from 00827c9c to 00827d13 has its CatchHandler @ 00828304 */
      lVar12 = FUN_00825c7c(auStack_1a0,&local_180,&DAT_002dd6a5,&local_1f0,&local_1d0);
      pbVar1 = (byte *)(lVar12 + 0x38);
      if (pbVar1 != (byte *)&local_70) {
        if ((*pbVar1 & 1) == 0) {
          if (((ulong)local_70 & 1) == 0) {
            *(ulong *)(lVar12 + 0x40) = uStack_68;
            *(undefined ****)pbVar1 = local_70;
            *(ulong *)(lVar12 + 0x48) = CONCAT62(uStack_5e,local_60);
          }
          else {
            FUN_007fdf5c(pbVar1,CONCAT62(uStack_5e,local_60),uStack_68);
          }
        }
        else {
          lVar12 = CONCAT62(uStack_5e,local_60);
          if (((ulong)local_70 & 1) == 0) {
            lVar12 = (long)&local_70 + 1;
            uVar4 = (ulong)local_70 >> 1 & 0x7f;
          }
          else {
            uVar4 = uStack_68;
          }
          FUN_007fe004(pbVar1,lVar12,uVar4);
        }
      }
      if (((ulong)local_180 & 1) != 0) {
        operator_delete(local_170,(ulong)local_180 & 0xfffffffffffffffe);
      }
    }
                    /* try { // try from 00827d2c to 00827d37 has its CatchHandler @ 008283a0 */
    FUN_00825648(&local_1d0,param_1);
    pcVar9 = DAT_00cca8b8;
    uVar4 = (ulong)(local_1d0 >> 1);
    if ((local_1d0 & 1) != 0) {
      uVar4 = uStack_1c8;
    }
    if (uVar4 != 0) {
      sVar11 = strlen(DAT_00cca8b8);
      if (0xfffffffffffffff7 < sVar11) {
        if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00828290 to 00828293 has its CatchHandler @ 0082832c */
          FUN_007fe124();
        }
        goto LAB_00828450;
      }
      if (sVar11 < 0x17) {
        pvVar17 = (void *)((ulong)&local_180 | 1);
        local_180 = (undefined *)CONCAT71(local_180._1_7_,(char)((int)sVar11 << 1));
        if (sVar11 != 0) goto LAB_00827db4;
      }
      else {
        uVar4 = 0x1a;
        if ((sVar11 | 7) != 0x17) {
          uVar4 = (sVar11 | 7) + 1;
        }
                    /* try { // try from 00827d9c to 00827da3 has its CatchHandler @ 0082832c */
        pvVar17 = operator_new(uVar4);
        local_180 = (undefined *)(uVar4 | 1);
        local_178 = sVar11;
        local_170 = pvVar17;
LAB_00827db4:
        memmove(pvVar17,pcVar9,sVar11);
      }
      local_1f0 = &local_180;
      *(undefined1 *)((long)pvVar17 + sVar11) = 0;
                    /* try { // try from 00827dd0 to 00827e47 has its CatchHandler @ 008282ec */
      lVar12 = FUN_00825c7c(auStack_1a0,&local_180,&DAT_002dd6a5,&local_1f0,&uStack_181);
      pbVar1 = (byte *)(lVar12 + 0x38);
      if (pbVar1 != &local_1d0) {
        if ((*pbVar1 & 1) == 0) {
          if ((local_1d0 & 1) == 0) {
            *(ulong *)(lVar12 + 0x40) = uStack_1c8;
            *(ulong *)pbVar1 = CONCAT71(uStack_1cf,local_1d0);
            *(undefined7 **)(lVar12 + 0x48) = local_1c0;
          }
          else {
            FUN_007fdf5c(pbVar1,local_1c0,uStack_1c8);
          }
        }
        else {
          if ((local_1d0 & 1) == 0) {
            uVar4 = (ulong)(local_1d0 >> 1);
            puVar6 = &uStack_1cf;
          }
          else {
            uVar4 = uStack_1c8;
            puVar6 = local_1c0;
          }
          FUN_007fe004(pbVar1,puVar6,uVar4);
        }
      }
      if (((ulong)local_180 & 1) != 0) {
        operator_delete(local_170,(ulong)local_180 & 0xfffffffffffffffe);
      }
    }
    puVar15 = (ulong *)strlen(__s);
    if ((ulong *)0xfffffffffffffff7 < puVar15) {
      if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0082809c to 0082809f has its CatchHandler @ 008283d0 */
        FUN_007fe124();
      }
      goto LAB_00828450;
    }
    if (puVar15 < (ulong *)0x17) {
      pvVar17 = (void *)((long)&local_1e8 + 1);
      local_1e8 = CONCAT71(local_1e8._1_7_,(char)((int)puVar15 << 1));
      if (puVar15 != (ulong *)0x0) goto LAB_00827ebc;
    }
    else {
      uVar4 = 0x1a;
      if (((ulong)puVar15 | 7) != 0x17) {
        uVar4 = ((ulong)puVar15 | 7) + 1;
      }
                    /* try { // try from 00827ea4 to 00827eab has its CatchHandler @ 008283d0 */
      pvVar17 = operator_new(uVar4);
      local_1e8 = uVar4 | 1;
      local_1e0 = puVar15;
      local_1d8 = pvVar17;
LAB_00827ebc:
      memmove(pvVar17,__s,(size_t)puVar15);
    }
    *(undefined1 *)((long)pvVar17 + (long)puVar15) = 0;
    local_1f0 = &PTR_LAB_00c48988;
    if (((DAT_00d1ce48 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1ce48), iVar10 != 0)) {
                    /* try { // try from 008280b0 to 008280b3 has its CatchHandler @ 008282a8 */
      FUN_00826858();
      __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1ce48);
    }
                    /* try { // try from 00827eec to 00827f03 has its CatchHandler @ 00828374 */
    FUN_008286bc(&local_180,&local_1f0,auStack_1a0,&DAT_00d1ccf8);
    local_1f0 = &PTR_LAB_00c489d0;
    if ((local_1e8 & 1) != 0) {
      operator_delete(local_1d8,local_1e8 & 0xfffffffffffffffe);
    }
    if (local_f0 == 0) {
      uVar4 = (ulong)(local_168 >> 1);
      puVar6 = &uStack_167;
      if ((local_168 & 1) != 0) {
        uVar4 = local_160;
        puVar6 = local_158;
      }
                    /* try { // try from 00827f50 to 00827f57 has its CatchHandler @ 008283d8 */
      FUN_008ac34c(param_1,puVar6,uVar4);
      FUN_008247c0(&local_180);
      if ((local_1d0 & 1) != 0) {
        operator_delete(local_1c0,CONCAT71(uStack_1cf,local_1d0) & 0xfffffffffffffffe);
      }
      if (((ulong)local_70 & 1) != 0) {
        operator_delete((void *)CONCAT62(uStack_5e,local_60),(ulong)local_70 & 0xfffffffffffffffe);
      }
      if (((ulong)local_1b8 & 1) != 0) {
        operator_delete(local_1a8,(ulong)local_1b8 & 0xfffffffffffffffe);
      }
      FUN_00827168(auStack_1a0,local_198);
      if (*(long *)(lVar5 + 0x28) == local_58) {
        return 1;
      }
LAB_00828450:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    puVar3 = auStack_e7;
    if ((local_e8 & 1) != 0) {
      puVar3 = local_d8;
    }
                    /* try { // try from 008280f8 to 00828117 has its CatchHandler @ 008283d8 */
    FUN_008ac4a8(param_1,puVar3);
    if (*(long *)(lVar5 + 0x28) != local_58) goto LAB_00828450;
    FUN_008aa5f4(param_1);
LAB_00828118:
    iVar10 = __cxa_guard_acquire(&DAT_00d1d080);
    if (iVar10 != 0) {
      puVar15[1] = 0x1fb99ec42dad094;
      *puVar15 = 0xd4d685ca03ddd2a7;
      __cxa_atexit(&LAB_00828a88,puVar15,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d080);
    }
  } while( true );
}

