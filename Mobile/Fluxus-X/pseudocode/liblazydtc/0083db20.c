/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083db20
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0083db20(ulong *param_1,undefined8 param_2)

{
  uint *puVar1;
  ulong uVar2;
  undefined4 uVar3;
  long lVar4;
  undefined4 *puVar5;
  bool bVar6;
  bool bVar7;
  uint uVar8;
  int iVar9;
  char *pcVar10;
  long *plVar11;
  undefined8 uVar12;
  long lVar13;
  undefined1 *__dest;
  ulong *__src;
  undefined4 *puVar14;
  char *pcVar15;
  ulong local_b8;
  char *pcStack_b0;
  undefined4 *local_a8;
  undefined8 local_a0;
  char *pcStack_98;
  undefined4 *local_90;
  byte local_84;
  char local_83;
  char local_82;
  char local_81;
  undefined8 local_80;
  undefined3 uStack_78;
  undefined3 uStack_75;
  undefined2 uStack_72;
  undefined3 uStack_70;
  undefined3 uStack_6d;
  undefined5 uStack_6a;
  undefined3 uStack_65;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  FUN_008af088(param_2,1,8);
  uVar8 = FUN_008abc64(param_2,1);
  if (uVar8 < 8) {
    FUN_0083e81c();
    if (*(long *)(lVar4 + 0x28) == local_58) {
      uVar12 = FUN_0083e8f8(&DAT_00d1e398);
LAB_0083e02c:
                    /* WARNING: Subroutine does not return */
      FUN_008aed6c(param_2,1,uVar12);
    }
LAB_0083e818:
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  if (((DAT_00d1e3d0 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e3d0), iVar9 != 0)) {
    DAT_00d1e3ca = '\x01';
    DAT_00d1e3c0 = 0xc60a49223ab4c9de;
    _DAT_00d1e3c8 = 0xa5f8;
    __cxa_atexit(&LAB_0083ebbc,&DAT_00d1e3c0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e3d0);
  }
  if (DAT_00d1e3ca == '\x01') {
    DAT_00d1e3ca = '\0';
    DAT_00d1e3c0 = DAT_00d1e3c0 ^ 0xab6b075149d5a59d;
    _DAT_00d1e3c8 = _DAT_00d1e3c8 ^ 0xa59d;
  }
  FUN_008acba4(param_2,1,&DAT_00d1e3c0);
  pcVar10 = (char *)FUN_008ab8a4(param_2,0xffffffff,0);
  FUN_008aa994(param_2,0xfffffffe);
  if (pcVar10 == (char *)0x0) {
    bVar6 = false;
    bVar7 = false;
    goto LAB_0083dd10;
  }
  __src = &DAT_00d1e3d8;
  if ((DAT_00d1e3e8 & 1) == 0) goto LAB_0083e510;
  do {
    if (DAT_00d1e3e4 == '\x01') {
      *(undefined1 *)((long)__src + 0xc) = 0;
      *__src = *__src ^ 0x5167e5b18767e591;
      *(uint *)(__src + 1) = (uint)__src[1] ^ 0x8767e591;
    }
    iVar9 = strcmp(pcVar10,(char *)&DAT_00d1e3d8);
    bVar6 = iVar9 == 0;
    if (((DAT_00d1e400 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e400), iVar9 != 0)) {
      DAT_00d1e3f0 = 0xd2e2445fe68de8e2;
      DAT_00d1e3f8 = 0xe799eedd;
      _DAT_00d1e3fc = 0x133;
      __cxa_atexit(&LAB_0083ebd4,&DAT_00d1e3f0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1e400);
    }
    if (DAT_00d1e3fd == '\x01') {
      _DAT_00d1e3fc = (ushort)(DAT_00d1e3fc ^ 0x33);
      DAT_00d1e3f0 = DAT_00d1e3f0 ^ 0xb1b1213393e987af;
      DAT_00d1e3f8 = DAT_00d1e3f8 ^ 0x93e987af;
    }
    iVar9 = strcmp(pcVar10,(char *)&DAT_00d1e3f0);
    bVar7 = iVar9 == 0;
    if (!bVar6) {
LAB_0083dd10:
      if (!bVar7) {
        FUN_0083e96c();
        if (*(long *)(lVar4 + 0x28) == local_58) {
          uVar12 = FUN_0083ea48(&DAT_00d1e408);
          goto LAB_0083e02c;
        }
        goto LAB_0083e818;
      }
    }
    plVar11 = (long *)FUN_008abd78(param_2,1);
    lVar13 = 0x168;
    if (!bVar6) {
      lVar13 = 0x110;
    }
    lVar13 = *(long *)(*plVar11 + lVar13);
    if (lVar13 == 0) {
      if (((DAT_00d1e468 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e468), iVar9 != 0)) {
        DAT_00d1e463 = '\x01';
        DAT_00d1e45f._1_1_ = 0xe3;
        DAT_00d1e45f._2_1_ = 0x6e;
        DAT_00d1e45f._3_1_ = 0xf7;
        uRam0000000000d1e438 = 0x82b6cde7a79267f8;
        _DAT_00d1e430 = 0x95f7dbf6b39e26f1;
        uRam0000000000d1e448 = 0x80a1d1faf7d722f3;
        _DAT_00d1e440 = 0x8eb4dae7a69567e3;
        uRam0000000000d1e458 = 0xb2d5f1b0d723f2;
        DAT_00d1e45f._0_1_ = 0x82;
        _DAT_00d1e450 = 0x93b6d7e0ff932efb;
        __cxa_atexit(&LAB_0083ecdc,&DAT_00d1e430,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1e468);
      }
      if (DAT_00d1e463 == '\x01') {
        DAT_00d1e463 = '\0';
        DAT_00d1e45f._3_1_ = DAT_00d1e45f._3_1_ ^ 0xf7;
        DAT_00d1e45f._1_1_ = DAT_00d1e45f._1_1_ ^ 0x97;
        DAT_00d1e45f._2_1_ = DAT_00d1e45f._2_1_ ^ 0x47;
        _DAT_00d1e430 = _DAT_00d1e430 ^ 0xe1d7bf93dff74797;
        uRam0000000000d1e438 = uRam0000000000d1e438 ^ 0xe1d7bf93dff74797;
        _DAT_00d1e440 = _DAT_00d1e440 ^ 0xe1d7bf93dff74797;
        uRam0000000000d1e448 = uRam0000000000d1e448 ^ 0xe1d7bf93dff74797;
        _DAT_00d1e450 = _DAT_00d1e450 ^ 0xe1d7bf93dff74797;
        uRam0000000000d1e458 = uRam0000000000d1e458 ^ 0xd7bf93dff74797;
        DAT_00d1e45f._0_1_ = (byte)DAT_00d1e45f ^ 0xe1;
      }
      FUN_008aee78(param_2,1);
      FUN_008ac684(param_2,&DAT_002b6c62,&DAT_00d1e430);
      if (*(long *)(lVar4 + 0x28) == local_58) {
        FUN_008ae364(param_2,2);
        FUN_008aa5f4(param_2);
LAB_0083e160:
        uStack_78 = 0x2cdd84;
        local_80 = 0xabd719aa03209c8d;
        uStack_6d = 0x18bb16;
        uStack_6a = 0x49988fb094;
        uStack_75 = 0xfbb17;
        uStack_72 = 0xbc96;
        uStack_70 = 0x2bdd9f;
        if (((DAT_00d1e490 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e490), iVar9 != 0)) {
                    /* try { // try from 0083e634 to 0083e643 has its CatchHandler @ 0083e790 */
          FUN_0083ecf0(&DAT_00d1e470,&local_80);
          __cxa_atexit(&LAB_0083edd4,&DAT_00d1e470,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1e490);
        }
        if (DAT_00d1e48b == '\x01') {
          DAT_00d1e488 = DAT_00d1e488 ^ 0xeb;
          DAT_00d1e48b = '\0';
          DAT_00d1e470 = DAT_00d1e470 ^ 0xdff77dcf6f49fdeb;
          DAT_00d1e489 = DAT_00d1e489 ^ 0xfd;
          DAT_00d1e478 = DAT_00d1e478 ^ 0xdff77dcf6f49fdeb;
          DAT_00d1e480 = DAT_00d1e480 ^ 0xdff77dcf6f49fdeb;
          DAT_00d1e48a = DAT_00d1e48a ^ 0x49;
        }
        FUN_008aee78(param_2,1);
        FUN_008ac684(param_2,&DAT_002b6c62,&DAT_00d1e470);
        FUN_008ae364(param_2,2);
        if (*(long *)(lVar4 + 0x28) == local_58) {
          FUN_008aa5f4(param_2);
LAB_0083e23c:
          if (*(long *)(lVar4 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
            FUN_007fe124();
          }
        }
      }
      goto LAB_0083e818;
    }
    __src = *(ulong **)(lVar13 + 0x28);
    if ((__src == (ulong *)0x0) || (pcVar10 = *(char **)(lVar13 + 0x20), pcVar10 == (char *)0x0))
    goto LAB_0083e160;
    if ((char *)0xfffffffffffffff7 < pcVar10) goto LAB_0083e23c;
    if (pcVar10 < (char *)0x17) {
      puVar14 = (undefined4 *)((ulong)&local_b8 | 1);
      local_b8 = CONCAT71(local_b8._1_7_,(char)((int)pcVar10 << 1));
    }
    else {
      uVar2 = 0x1a;
      if (((ulong)pcVar10 | 7) != 0x17) {
        uVar2 = ((ulong)pcVar10 | 7) + 1;
      }
      puVar14 = operator_new(uVar2);
      local_b8 = uVar2 | 1;
      pcStack_b0 = pcVar10;
      local_a8 = puVar14;
    }
    memmove(puVar14,__src,(size_t)pcVar10);
    *(char *)((long)puVar14 + (long)pcVar10) = '\0';
    pcVar15 = (char *)(local_b8 >> 1 & 0x7f);
    if ((local_b8 & 1) != 0) {
      pcVar15 = pcStack_b0;
    }
    if (pcVar15 < (char *)0x8) {
      uStack_78 = 0x5c02eb;
      uStack_75 = 0xc83b2b;
      local_80 = 0xd44dc82c6e5b12a9;
      uStack_72 = 0x9146;
      uStack_70 = 0x4e06b8;
      uStack_6d = 0xa72367;
      if (((DAT_00d1e4b8 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e4b8), iVar9 != 0)) {
                    /* try { // try from 0083e680 to 0083e68f has its CatchHandler @ 0083e77c */
        FUN_0083ede4(&DAT_00d1e4a0,&local_80);
        __cxa_atexit(&LAB_0083eea0,&DAT_00d1e4a0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1e4b8);
      }
      if (DAT_00d1e4b6 == '\x01') {
        DAT_00d1e4b6 = '\0';
        _DAT_00d1e4a0 = _DAT_00d1e4a0 ^ 0xb129a74f0b2f6bcb;
        uRam0000000000d1e4a8 = uRam0000000000d1e4a8 ^ 0xb129a74f0b2f6bcb;
        DAT_00d1e4b4 = DAT_00d1e4b4 ^ 0x4f;
        DAT_00d1e4b0 = DAT_00d1e4b0 ^ 0xb2f6bcb;
        DAT_00d1e4b5 = DAT_00d1e4b5 ^ 0xa7;
      }
                    /* try { // try from 0083e2e4 to 0083e32b has its CatchHandler @ 0083e7b8 */
      FUN_008aee78(param_2,1);
      FUN_008ac684(param_2,&DAT_002b6c62,&DAT_00d1e4a0);
      FUN_008ae364(param_2,2);
      if (*(long *)(lVar4 + 0x28) != local_58) goto LAB_0083e818;
      FUN_008aa5f4(param_2);
LAB_0083e32c:
      uStack_78 = 0x8f6ed7;
      uStack_75 = 0x94b2da;
      local_80 = 0x4bbb92bdde8d79dc;
      uStack_72 = 0xebb;
      uStack_70 = 0x926495;
      uStack_6d = 0xfbb4c5;
      if (((DAT_00d1e4d8 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e4d8), iVar9 != 0)) {
                    /* try { // try from 0083e6cc to 0083e6db has its CatchHandler @ 0083e768 */
        FUN_0083eeac(&DAT_00d1e4c0,&local_80);
        __cxa_atexit(&LAB_0083ef68,&DAT_00d1e4c0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1e4d8);
      }
      if (DAT_00d1e4d6 == '\x01') {
        DAT_00d1e4d6 = '\0';
        DAT_00d1e4d4 = DAT_00d1e4d4 ^ 0xd1;
        DAT_00d1e4d5 = DAT_00d1e4d5 ^ 0xfb;
        _DAT_00d1e4c0 = _DAT_00d1e4c0 ^ 0x6bdffbd1bffb17b5;
        uRam0000000000d1e4c8 = uRam0000000000d1e4c8 ^ 0x6bdffbd1bffb17b5;
        DAT_00d1e4d0 = DAT_00d1e4d0 ^ 0xbffb17b5;
      }
                    /* try { // try from 0083e3bc to 0083e403 has its CatchHandler @ 0083e7b0 */
      FUN_008aee78(param_2,1);
      FUN_008ac684(param_2,&DAT_002b6c62,&DAT_00d1e4c0);
      FUN_008ae364(param_2,2);
      if (*(long *)(lVar4 + 0x28) != local_58) goto LAB_0083e818;
      FUN_008aa5f4(param_2);
    }
    else {
      if ((local_b8 & 1) == 0) {
        pcStack_98 = pcStack_b0;
        local_a0 = local_b8;
        local_90 = local_a8;
      }
      else {
                    /* try { // try from 0083dde4 to 0083ddeb has its CatchHandler @ 0083e7b8 */
        FUN_007ff40c(&local_a0,local_a8);
      }
      puVar5 = local_90;
      bVar6 = (local_a0 & 1) == 0;
      puVar14 = local_90;
      if (bVar6) {
        puVar14 = (undefined4 *)((long)&local_a0 + 1);
      }
      uVar3 = *puVar14;
      pcVar10 = (char *)(ulong)((byte)local_a0 >> 1);
      if (!bVar6) {
        pcVar10 = pcStack_98;
      }
      local_84 = (byte)uVar3 ^ 0x52;
      local_83 = ((byte)((uint)uVar3 >> 8) ^ 0x53) - 0x29;
      local_82 = ((byte)((uint)uVar3 >> 0x10) ^ 0x42) + 0xae;
      local_81 = ((byte)((uint)uVar3 >> 0x18) ^ 0x31) + 0x85;
      if (pcVar10 == (char *)0x0) {
        pcVar15 = (char *)0xfffffffffffffff8;
      }
      else {
        pcVar10 = (char *)0x0;
        do {
          puVar14 = (undefined4 *)((ulong)&local_a0 | 1);
          if (!bVar6) {
            puVar14 = local_90;
          }
          *(byte *)((long)puVar14 + (long)pcVar10) =
               *(byte *)((long)puVar14 + (long)pcVar10) ^
               *(char *)((ulong)&local_84 | (ulong)pcVar10 & 3) + (char)pcVar10 * ')';
          pcVar10 = pcVar10 + 1;
          bVar6 = (local_a0 & 1) == 0;
          pcVar15 = (char *)(ulong)((byte)local_a0 >> 1);
          if (!bVar6) {
            pcVar15 = pcStack_98;
          }
        } while (pcVar10 < pcVar15);
        pcVar15 = pcVar15 + -8;
      }
      puVar1 = (uint *)((ulong)&local_a0 | 5);
      if (!bVar6) {
        puVar1 = local_90 + 1;
      }
      uVar8 = *puVar1;
      pcVar10 = (char *)(ulong)uVar8;
      if (uVar8 + 0xfbffffff >> 0x1a < 0x3f) goto LAB_0083e32c;
                    /* try { // try from 0083dee4 to 0083deeb has its CatchHandler @ 0083e7a8 */
      __src = operator_new((ulong)pcVar10);
      memset(__src,0,(size_t)pcVar10);
      puVar14 = (undefined4 *)((ulong)&local_a0 | 9);
      if (!bVar6) {
        puVar14 = puVar5 + 2;
      }
                    /* try { // try from 0083df14 to 0083df5b has its CatchHandler @ 0083e7c0 */
      ZSTD_decompress(__src,pcVar10,puVar14,pcVar15);
      iVar9 = ZSTD_isError();
      if (iVar9 == 0) {
        if (uVar8 < 0x17) {
          __dest = (undefined1 *)((long)param_1 + 1);
          *(char *)param_1 = (char)(uVar8 << 1);
        }
        else {
          uVar2 = 0x1a;
          if (((ulong)pcVar10 | 7) != 0x17) {
            uVar2 = ((ulong)pcVar10 | 7) + 1;
          }
          __dest = operator_new(uVar2);
          param_1[1] = (ulong)pcVar10;
          param_1[2] = (ulong)__dest;
          *param_1 = uVar2 | 1;
        }
        memcpy(__dest,__src,(size_t)pcVar10);
        __dest[(long)pcVar10] = 0;
        operator_delete(__src,(ulong)pcVar10);
        if ((local_a0 & 1) != 0) {
          operator_delete(local_90,local_a0 & 0xfffffffffffffffe);
        }
        if ((local_b8 & 1) != 0) {
          operator_delete(local_a8,local_b8 & 0xfffffffffffffffe);
        }
        if (*(long *)(lVar4 + 0x28) == local_58) {
          return;
        }
        goto LAB_0083e818;
      }
    }
    uStack_78 = 0xf5f3fe;
    uStack_75 = 0x8a1e28;
    local_80 = 0x7d1d811821f8b2f7;
    uStack_6a = 0xfeb0f47d44;
    uStack_65 = 0xe51829;
    uStack_72 = 0x7950;
    uStack_70 = 0xe2b6e3;
    uStack_6d = 0x875d3e;
    if (((DAT_00d1e500 & 1) == 0) && (iVar9 = __cxa_guard_acquire(&DAT_00d1e500), iVar9 != 0)) {
                    /* try { // try from 0083e718 to 0083e727 has its CatchHandler @ 0083e754 */
      FUN_0083ef74(&DAT_00d1e4e0,&local_80);
      __cxa_atexit(&LAB_0083f070,&DAT_00d1e4e0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1e500);
    }
    if (DAT_00d1e4fe == '\x01') {
      DAT_00d1e4fe = '\0';
      DAT_00d1e4e0 = DAT_00d1e4e0 ^ 0x93de57d4d91d391;
      DAT_00d1e4e8 = DAT_00d1e4e8 ^ 0x93de57d4d91d391;
      DAT_00d1e4f8 = DAT_00d1e4f8 ^ 0x91;
      DAT_00d1e4f9 = DAT_00d1e4f9 ^ 0xd3;
      DAT_00d1e4fa = DAT_00d1e4fa ^ 0x91;
      DAT_00d1e4fb = DAT_00d1e4fb ^ 0x4d;
      DAT_00d1e4f0 = DAT_00d1e4f0 ^ 0x93de57d4d91d391;
      DAT_00d1e4fc = DAT_00d1e4fc ^ 0x7d;
      DAT_00d1e4fd = DAT_00d1e4fd ^ 0xe5;
    }
                    /* try { // try from 0083e4c8 to 0083e50f has its CatchHandler @ 0083e7a4 */
    FUN_008aee78(param_2,1);
    FUN_008ac684(param_2,&DAT_002b6c62,&DAT_00d1e4e0);
    FUN_008ae364(param_2,2);
    if (*(long *)(lVar4 + 0x28) != local_58) goto LAB_0083e818;
    FUN_008aa5f4(param_2);
LAB_0083e510:
    iVar9 = __cxa_guard_acquire(&DAT_00d1e3e8);
    if (iVar9 != 0) {
      *(undefined1 *)((long)__src + 0xc) = 1;
      *__src = 0x2304b6dde6048add;
      *(undefined4 *)(__src + 1) = 0x871395f8;
      __cxa_atexit(&LAB_0083ebc8,__src,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1e3e8);
    }
  } while( true );
}

