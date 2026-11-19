/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00801054
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00801054(byte *param_1)

{
  long lVar1;
  undefined6 uVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  long *plVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  byte *pbVar18;
  long *local_90;
  undefined1 uStack_88;
  undefined5 uStack_87;
  undefined1 uStack_82;
  undefined1 uStack_81;
  undefined1 uStack_80;
  undefined1 uStack_7f;
  undefined4 uStack_7e;
  undefined2 uStack_7a;
  undefined1 uStack_78;
  undefined5 uStack_77;
  undefined1 uStack_72;
  undefined1 local_71;
  undefined7 uStack_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_90 = (long *)0x0;
  iVar7 = (**(code **)(*DAT_00ccabb8 + 0x30))(DAT_00ccabb8,&local_90,0x10006);
  if ((((iVar7 == 0) ||
       (iVar8 = (**(code **)(*DAT_00ccabb8 + 0x20))(DAT_00ccabb8,&local_90,0), iVar8 == 0)) &&
      (plVar6 = local_90, local_90 != (long *)0x0)) && (DAT_00ccabc0 != 0)) {
    uVar9 = (**(code **)(*local_90 + 0xf8))(local_90);
    uStack_80 = 0x72;
    uStack_7f = 0x71;
    uStack_88 = 0x73;
    uStack_87 = 0x897bba882e;
    uStack_82 = 0x1a;
    uStack_81 = 0x4e;
    local_90 = (long *)0x5f12906baf923d74;
    if (((DAT_00ccaf00 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccaf00), iVar8 != 0)) {
                    /* try { // try from 008017ec to 008017fb has its CatchHandler @ 00801b3c */
      FUN_00802d74(&DAT_00ccaee8,&local_90);
      __cxa_atexit(&LAB_00802e10,&DAT_00ccaee8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccaf00);
    }
    FUN_0080372c(&DAT_00ccaee8);
    uStack_88 = 0x59;
    uStack_87 = 0xad5dacf416;
    uStack_82 = 0x3a;
    local_90 = (long *)0x6c3ff04889ba1b7b;
    uStack_81 = 99;
    uStack_80 = 0x50;
    uStack_7f = 0x4a;
    uStack_7e = CONCAT31(uStack_7e._1_3_,0xdb);
    if (((DAT_00ccaf20 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccaf20), iVar8 != 0)) {
                    /* try { // try from 00801838 to 00801847 has its CatchHandler @ 00801b2c */
      FUN_00802e1c(&DAT_00ccaf08,&local_90);
      __cxa_atexit(&LAB_00802ec0,&DAT_00ccaf08,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccaf20);
    }
    FUN_00803774(&DAT_00ccaf08);
    uVar10 = (**(code **)(*plVar6 + 0x480))(plVar6,uVar9,&DAT_00ccaee8,&DAT_00ccaf08);
    uVar10 = (**(code **)(*plVar6 + 0x488))(plVar6,uVar9,uVar10);
    uStack_80 = 0xc5;
    uStack_88 = 0xa8;
    uStack_87 = 0xc137b0c82;
    uStack_82 = 0x6a;
    uStack_81 = 0x1a;
    local_90 = (long *)0x1a7d161c5a1db4a2;
    if (((DAT_00ccaf40 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccaf40), iVar8 != 0)) {
                    /* try { // try from 00801884 to 00801893 has its CatchHandler @ 00801b1c */
      FUN_00802ecc(&DAT_00ccaf28,&local_90);
      __cxa_atexit(&LAB_00802f60,&DAT_00ccaf28,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccaf40);
    }
    FUN_008037cc(&DAT_00ccaf28);
    uStack_88 = 0xa4;
    uStack_87 = 0x1136260ebf;
    uStack_82 = 0x7b;
    uStack_81 = 0x16;
    local_90 = (long *)0x1326041368039ded;
    uStack_78 = 0xa4;
    uStack_77 = 0x20b6805fe;
    uStack_72 = 0x26;
    uStack_80 = 0xab;
    uStack_7f = 0xb6;
    uStack_7e = 0xf292052;
    uStack_7a = 0x968;
    local_71 = 0x30;
    uStack_70 = 0x95e116a0cbba7;
    if (((DAT_00ccaf78 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccaf78), iVar8 != 0)) {
                    /* try { // try from 008018d0 to 008018df has its CatchHandler @ 00801b0c */
      FUN_00802f6c(&DAT_00ccaf50,&local_90);
      __cxa_atexit(&LAB_008030b0,&DAT_00ccaf50,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccaf78);
    }
    if (DAT_00ccaf77 == '\x01') {
      DAT_00ccaf74 = DAT_00ccaf74 ^ 0x65;
      DAT_00ccaf77 = '\0';
      DAT_00ccaf75 = DAT_00ccaf75 ^ 0x65;
      DAT_00ccaf76 = DAT_00ccaf76 ^ 9;
      DAT_00ccaf70 = DAT_00ccaf70 ^ 0x969d1c5;
      _DAT_00ccaf50 = _DAT_00ccaf50 ^ 0x7f0965650969d1c5;
      uRam0000000000ccaf58 = uRam0000000000ccaf58 ^ 0x7f0965650969d1c5;
      _DAT_00ccaf60 = _DAT_00ccaf60 ^ 0x7f0965650969d1c5;
      uRam0000000000ccaf68 = uRam0000000000ccaf68 ^ 0x7f0965650969d1c5;
    }
    uVar11 = (**(code **)(*plVar6 + 0x108))(plVar6,uVar9,&DAT_00ccaf28,&DAT_00ccaf50);
    lVar12 = FUN_007ffe68(plVar6,DAT_00ccabc0,uVar11,uVar10);
    if (lVar12 != 0) {
      uStack_88 = 0xf0;
      local_90 = (long *)0x6843a01cf92587f2;
      uStack_7f = 0x85;
      uStack_7e = 0xa837fb28;
      uStack_7a = 0x2653;
      uStack_78 = 0x93;
      uStack_87 = 0xa716ff2f86;
      uStack_82 = 0x53;
      uStack_81 = 0x68;
      uStack_80 = 0xd0;
      if (((DAT_00ccafa0 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccafa0), iVar8 != 0)) {
                    /* try { // try from 0080191c to 0080192b has its CatchHandler @ 00801afc */
        FUN_008030c0(&DAT_00ccaf80,&local_90);
        __cxa_atexit(&LAB_00803194,&DAT_00ccaf80,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccafa0);
      }
      if (DAT_00ccaf99 == '\x01') {
        DAT_00ccaf99 = '\0';
        DAT_00ccaf80 = DAT_00ccaf80 ^ 0x4727c9738b41e993;
        DAT_00ccaf88 = DAT_00ccaf88 ^ 0x4727c9738b41e993;
        DAT_00ccaf90 = DAT_00ccaf90 ^ 0x4727c9738b41e993;
        DAT_00ccaf98 = DAT_00ccaf98 ^ 0x93;
      }
      uVar11 = (**(code **)(*plVar6 + 0x30))(plVar6,&DAT_00ccaf80);
      if (((DAT_00ccafb8 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccafb8), iVar8 != 0)) {
        DAT_00ccafa8 = 0x815efc0be132c077;
        DAT_00ccafb0 = 0xc53dc04d;
        _DAT_00ccafb4 = 0x167;
        __cxa_atexit(&LAB_008031a4,&DAT_00ccafa8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccafb8);
      }
      if (DAT_00ccafb5 == '\x01') {
        _DAT_00ccafb4 = (ushort)(DAT_00ccafb4 ^ 0x67);
        DAT_00ccafa8 = DAT_00ccafa8 ^ 0xef379d67b145a519;
        DAT_00ccafb0 = DAT_00ccafb0 ^ 0xb145a519;
      }
      if (((DAT_00ccb010 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccb010), iVar8 != 0)) {
        DAT_00ccb00d = '\x01';
        DAT_00ccafe8 = 0x3a88ef4c303ce602;
        DAT_00ccafe0 = 0x2d8ae96a6a2aed30;
        DAT_00ccaff8._0_5_ = 0x462662e738;
        DAT_00ccaff0 = 0x3099e5472401aa6a;
        ram0x00ccb005 = 0x301b9be8;
        DAT_00ccb009 = 0xf7;
        DAT_00ccb00a = 0x2c;
        DAT_00ccb00b = 0x7e;
        DAT_00ccb00c = 0x29;
        DAT_00ccaff8._5_3_ = 0x3a9fef;
        DAT_00ccb000._0_5_ = 0x450662f73f;
        DAT_00ccafc8 = 0x2d8ae96a6a2aed30;
        DAT_00ccafc0 = 0x33c4e05f2427cf79;
        DAT_00ccafd8 = 0x33c4e05f2427cf6a;
        DAT_00ccafd0 = 0x3a88ef4c303ce602;
        __cxa_atexit(&LAB_008031b0,&DAT_00ccafc0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb010);
      }
      if (DAT_00ccb00d == '\x01') {
        DAT_00ccb00d = '\0';
        DAT_00ccafc0 = DAT_00ccafc0 ^ 0x5feb8129454d8351;
        DAT_00ccafc8 = DAT_00ccafc8 ^ 0x5feb8129454d8351;
        DAT_00ccafe0 = DAT_00ccafe0 ^ 0x5feb8129454d8351;
        DAT_00ccafe8 = DAT_00ccafe8 ^ 0x5feb8129454d8351;
        DAT_00ccafd0 = DAT_00ccafd0 ^ 0x5feb8129454d8351;
        DAT_00ccafd8 = DAT_00ccafd8 ^ 0x5feb8129454d8351;
        DAT_00ccb009 = DAT_00ccb009 ^ 0x83;
        DAT_00ccb00a = DAT_00ccb00a ^ 0x4d;
        DAT_00ccaff0 = DAT_00ccaff0 ^ 0x5feb8129454d8351;
        uVar2 = CONCAT15((char)DAT_00ccaff8._5_3_,(uint5)DAT_00ccaff8);
        DAT_00ccaff8._0_5_ = (uint5)DAT_00ccaff8 ^ 0x29454d8351;
        DAT_00ccaff8._5_3_ =
             (uint3)(CONCAT17((char)(DAT_00ccaff8._5_3_ >> 0x10),
                              CONCAT16((char)(DAT_00ccaff8._5_3_ >> 8),uVar2)) >> 0x28) ^ 0x5feb81;
        uVar2 = CONCAT15((char)ram0x00ccb005,(uint5)DAT_00ccb000);
        DAT_00ccb000._0_5_ = (uint5)DAT_00ccb000 ^ 0x29454d8351;
        DAT_00ccb00b = DAT_00ccb00b ^ 0x45;
        DAT_00ccb00c = DAT_00ccb00c ^ 0x29;
        ram0x00ccb005 =
             CONCAT13((char)(ram0x00ccb005 >> 0x18),
                      (int3)(CONCAT17((char)(ram0x00ccb005 >> 0x10),
                                      CONCAT16((char)(ram0x00ccb005 >> 8),uVar2)) >> 0x28)) ^
             0x515feb81;
      }
      uVar13 = (**(code **)(*plVar6 + 0x388))(plVar6,uVar11,&DAT_00ccafa8,&DAT_00ccafc0);
      if (((DAT_00ccb028 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccb028), iVar8 != 0)) {
        _DAT_00ccb020 = 0x113;
        DAT_00ccb018 = 0xe4b4dfe8a48f8a7f;
        __cxa_atexit(&LAB_008031c4,&DAT_00ccb018,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb028);
      }
      if (DAT_00ccb021 == '\x01') {
        DAT_00ccb018 = DAT_00ccb018 ^ 0x87d1a78dddf5eb13;
        _DAT_00ccb020 = (ushort)(DAT_00ccb020 ^ 0x13);
      }
      uVar14 = (**(code **)(*plVar6 + 0x538))(plVar6,&DAT_00ccb018);
      pbVar18 = *(byte **)(param_1 + 0x10);
      if ((*param_1 & 1) == 0) {
        pbVar18 = param_1 + 1;
      }
      uVar15 = (**(code **)(*plVar6 + 0x538))(plVar6,pbVar18);
      uVar13 = FUN_007fff04(plVar6,uVar11,uVar13,uVar14,uVar15);
      uVar16 = (**(code **)(*plVar6 + 0xf8))(plVar6,lVar12);
      if (((DAT_00ccb040 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccb040), iVar8 != 0)) {
        _DAT_00ccb038 = 0x1534f7c65846ceb;
        DAT_00ccb030 = 0x303e566759b370ea;
        __cxa_atexit(&LAB_008031d0,&DAT_00ccb030,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb040);
      }
      uVar3 = _DAT_00ccb038;
      if (DAT_00ccb03f == '\x01') {
        bVar5 = DAT_00ccb03c;
        _DAT_00ccb038 = _DAT_00ccb038 & 0xffffffffffffff;
        uVar4 = _DAT_00ccb038;
        _DAT_00ccb038 = (uint5)(bVar5 ^ 0x15) << 0x20;
        DAT_00ccb03d = SUB81(uVar4,5);
        DAT_00ccb030 = DAT_00ccb030 ^ 0x51533f1509c71599;
        _DAT_00ccb038 =
             (ulong)CONCAT34((int3)(CONCAT16(DAT_00ccb03e,CONCAT15(DAT_00ccb03d,_DAT_00ccb038)) >>
                                   0x20),(int)uVar3) ^ 0x533f0009c71599;
      }
      uStack_88 = 0xfd;
      uStack_87 = 0x4b7b66a43a;
      local_90 = (long *)0x383c4d7167a659b1;
      uStack_7a = 0x3017;
      uStack_78 = 0xed;
      uStack_77 = 0x3f4320fc74;
      uStack_82 = 0x36;
      uStack_81 = 0x3f;
      uStack_80 = 0xed;
      uStack_7f = 0x3a;
      uStack_7e = 0x4f7c6584;
      if (((DAT_00ccb068 & 1) == 0) && (iVar8 = __cxa_guard_acquire(&DAT_00ccb068), iVar8 != 0)) {
                    /* try { // try from 00801ab0 to 00801abf has its CatchHandler @ 00801aec */
        FUN_008031dc(&DAT_00ccb048,&local_90);
        __cxa_atexit(&LAB_008032d8,&DAT_00ccb048,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb068);
      }
      if (DAT_00ccb066 == '\x01') {
        DAT_00ccb060 = DAT_00ccb060 ^ 0x99;
        DAT_00ccb061 = DAT_00ccb061 ^ 0x15;
        DAT_00ccb048 = DAT_00ccb048 ^ 0x51533f1509c71599;
        DAT_00ccb062 = DAT_00ccb062 ^ 199;
        DAT_00ccb050 = DAT_00ccb050 ^ 0x51533f1509c71599;
        DAT_00ccb058 = DAT_00ccb058 ^ 0x51533f1509c71599;
        DAT_00ccb066 = '\0';
        DAT_00ccb063 = DAT_00ccb063 ^ 9;
        DAT_00ccb064 = DAT_00ccb064 ^ 0x15;
        DAT_00ccb065 = DAT_00ccb065 ^ 0x3f;
      }
      uVar17 = (**(code **)(*plVar6 + 0x108))(plVar6,uVar16,&DAT_00ccb030,&DAT_00ccb048);
      FUN_00801b68(plVar6,lVar12,uVar17,uVar13);
      (**(code **)(*plVar6 + 0xb8))(plVar6,uVar13);
      (**(code **)(*plVar6 + 0xb8))(plVar6,uVar15);
      (**(code **)(*plVar6 + 0xb8))(plVar6,uVar14);
      (**(code **)(*plVar6 + 0xb8))(plVar6,uVar11);
      (**(code **)(*plVar6 + 0xb8))(plVar6,uVar16);
      (**(code **)(*plVar6 + 0xb8))(plVar6,lVar12);
    }
    (**(code **)(*plVar6 + 0xb8))(plVar6,uVar10);
    (**(code **)(*plVar6 + 0xb8))(plVar6,uVar9);
    if (iVar7 != 0) {
      (**(code **)(*DAT_00ccabb8 + 0x28))();
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

