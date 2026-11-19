/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00825648
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00825648(byte *param_1,undefined8 param_2)

{
  ulong uVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  void *pvVar5;
  ulong uVar6;
  long lVar7;
  int iVar8;
  ulong *puVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  longlong extraout_x1;
  long lVar12;
  long lVar13;
  __ndk1 *this;
  double dVar14;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_88;
  undefined7 uStack_87;
  void *local_78;
  undefined8 local_70;
  ulong uStack_68;
  void *local_60;
  byte local_50 [24];
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
  if (((DAT_00d1cc80 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1cc80), iVar8 != 0)) {
    _DAT_00d1cc7c = 0x183;
    DAT_00d1cc78 = 0xa0f278a8;
    __cxa_atexit(&LAB_00826164,&DAT_00d1cc78,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cc80);
  }
  if (DAT_00d1cc7d == '\x01') {
    _DAT_00d1cc7c = (ushort)(DAT_00d1cc7c ^ 0x83);
    DAT_00d1cc78 = DAT_00d1cc78 ^ 0xc59f19cf;
  }
  FUN_008acba4(param_2,0xffffd8ee,&DAT_00d1cc78);
  iVar8 = FUN_008ab0e0(param_2,0xffffffff);
  if (iVar8 == 0) {
    FUN_008aa994(param_2,0xfffffffe);
  }
  else {
    if (((DAT_00d1cc98 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1cc98), iVar8 != 0)) {
      DAT_00d1cc90 = '\x01';
      DAT_00d1cc88 = 0xcf565bca5a30f549;
      __cxa_atexit(&LAB_00826170,&DAT_00d1cc88,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cc98);
    }
    if (DAT_00d1cc90 == '\x01') {
      DAT_00d1cc90 = '\0';
      DAT_00d1cc88 = DAT_00d1cc88 ^ 0xcf2529af23519919;
    }
    FUN_008acba4(param_2,0xffffffff,&DAT_00d1cc88);
    iVar8 = FUN_008ab0e0(param_2,0xffffffff);
    if (iVar8 == 0) {
      this = (__ndk1 *)0x0;
    }
    else {
      if (((DAT_00d1ccb0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1ccb0), iVar8 != 0)) {
        DAT_00d1ccac = '\x01';
        DAT_00d1cca0 = 0xbec3e52dfe2a6297;
        DAT_00d1cca8 = 0x9f3b68a2;
        __cxa_atexit(&LAB_00826178,&DAT_00d1cca0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1ccb0);
      }
      if (DAT_00d1ccac == '\x01') {
        DAT_00d1ccac = '\0';
        DAT_00d1cca0 = DAT_00d1cca0 ^ 0xdfafb5419f490ddb;
        DAT_00d1cca8 = DAT_00d1cca8 ^ 0x9f490ddb;
      }
      FUN_008acba4(param_2,0xffffffff,&DAT_00d1cca0);
      iVar8 = FUN_008ab0e0(param_2,0xffffffff);
      if (iVar8 == 0) {
        this = (__ndk1 *)0x0;
      }
      else {
        if (((DAT_00d1ccc0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1ccc0), iVar8 != 0)) {
          _DAT_00d1ccb8 = 0x163e37cfb5ea608;
          __cxa_atexit(&LAB_00826184,&DAT_00d1ccb8,&PTR_LOOP_00c48880);
          __cxa_guard_release(&DAT_00d1ccc0);
        }
        uVar1 = _DAT_00d1ccb8;
        if (DAT_00d1ccbf == '\x01') {
          uVar6 = _DAT_00d1ccb8 >> 0x30;
          _DAT_00d1ccb8 = (uint5)(DAT_00d1ccbc ^ 0x35) << 0x20;
          _DAT_00d1ccb8 =
               (ulong)CONCAT34((int3)(CONCAT16((char)uVar6,CONCAT15(DAT_00d1ccbd,_DAT_00d1ccb8)) >>
                                     0x20),(int)uVar1) ^ 0x638700893bd55d;
        }
        FUN_008acba4(param_2,0xffffffff,&DAT_00d1ccb8);
        iVar8 = FUN_008ab0e0(param_2,0xffffffff);
        if (iVar8 == 3) {
          dVar14 = (double)FUN_008ab528(param_2,0xffffffff,0);
          this = (__ndk1 *)(long)dVar14;
        }
        else {
          this = (__ndk1 *)0x0;
        }
        FUN_008aa994(param_2,0xfffffffe);
      }
      FUN_008aa994(param_2,0xfffffffe);
    }
    FUN_008aa994(param_2,0xfffffffe);
    FUN_008aa994(param_2,0xfffffffe);
    if (this != (__ndk1 *)0x0) {
      std::__ndk1::to_string(this,extraout_x1);
      local_50[0x10] = 0xcb;
      local_50[8] = 0xb9;
      local_50[9] = 4;
      local_50[10] = 0x7c;
      local_50[0xb] = 0x6e;
      local_50[0xc] = 0x2c;
      local_50[0xd] = 0xd5;
      local_50[0xe] = 0x4c;
      local_50[0xf] = 0xc5;
      local_50[0] = 0xe6;
      local_50[1] = 0;
      local_50[2] = 0x46;
      local_50[3] = 0x65;
      local_50[4] = 0x28;
      local_50[5] = 0xcc;
      local_50[6] = 0x44;
      local_50[7] = 0xe1;
      if (((DAT_00d1cce0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00d1cce0), iVar8 != 0)) {
                    /* try { // try from 00825b7c to 00825b8b has its CatchHandler @ 00825c08 */
        FUN_00826190(&DAT_00d1ccc8,local_50);
        __cxa_atexit(&LAB_00826224,&DAT_00d1ccc8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1cce0);
      }
      FUN_00826230(&DAT_00d1ccc8);
                    /* try { // try from 0082591c to 00825927 has its CatchHandler @ 00825c1c */
      puVar9 = (ulong *)std::__ndk1::
                        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        ::append(&local_88,&DAT_00d1ccc8);
      local_60 = (void *)puVar9[2];
      uStack_68 = puVar9[1];
      local_70 = *puVar9;
      puVar9[1] = 0;
      puVar9[2] = 0;
      *puVar9 = 0;
                    /* try { // try from 00825940 to 00825973 has its CatchHandler @ 00825c24 */
      uVar10 = mbedtls_md_info_from_type(3);
      if ((local_70 & 1) == 0) {
        uVar1 = local_70 >> 1 & 0x7f;
        pvVar5 = (void *)((long)&local_70 + 1);
      }
      else {
        uVar1 = uStack_68;
        pvVar5 = local_60;
      }
      mbedtls_md(uVar10,pvVar5,uVar1,local_50);
      puVar11 = operator_new(0x28);
      lVar7 = DAT_00d1ca90;
      lVar13 = 0;
      *(undefined8 **)(param_1 + 0x10) = puVar11;
      param_1[8] = 0x20;
      param_1[9] = 0;
      param_1[10] = 0;
      param_1[0xb] = 0;
      param_1[0xc] = 0;
      param_1[0xd] = 0;
      param_1[0xe] = 0;
      param_1[0xf] = 0;
      param_1[0] = 0x29;
      param_1[1] = 0;
      param_1[2] = 0;
      param_1[3] = 0;
      param_1[4] = 0;
      param_1[5] = 0;
      param_1[6] = 0;
      param_1[7] = 0;
      puVar11[1] = 0x3030303030303030;
      *puVar11 = 0x3030303030303030;
      puVar11[3] = 0x3030303030303030;
      puVar11[2] = 0x3030303030303030;
      *(undefined1 *)(puVar11 + 4) = 0;
      lVar12 = 0;
      do {
        pbVar2 = param_1 + 1;
        if ((*param_1 & 1) != 0) {
          pbVar2 = *(byte **)(param_1 + 0x10);
        }
        pbVar2[lVar12] = *(byte *)(lVar7 + (ulong)(local_50[lVar13] >> 4));
        pbVar2 = local_50 + lVar13;
        lVar13 = lVar13 + 1;
        pbVar3 = param_1 + 1;
        if ((*param_1 & 1) != 0) {
          pbVar3 = *(byte **)(param_1 + 0x10);
        }
        pbVar3[lVar12 + 1] = *(byte *)(lVar7 + ((ulong)*pbVar2 & 0xf));
        lVar12 = lVar12 + 2;
      } while (lVar13 != 0x10);
      if ((local_70 & 1) != 0) {
        operator_delete(local_60,local_70 & 0xfffffffffffffffe);
      }
      if (((byte)local_88 & 1) != 0) {
        operator_delete(local_78,CONCAT71(uStack_87,local_88) & 0xfffffffffffffffe);
      }
      goto LAB_00825a34;
    }
  }
  param_1[0] = 0;
  param_1[1] = 0;
LAB_00825a34:
  if (*(long *)(lVar4 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

