
uint * FUN_00420730(ulong param_1,uint *param_2)

{
  int iVar1;
  undefined4 *puVar2;
  uint *puVar3;
  ulong *extraout_x8;
  ulong uVar4;
  ulong uVar5;
  ulong *unaff_x19;
  uint unaff_w20;
  uint uVar6;
  undefined1 auVar7 [12];
  int in_stack_00000010;
  uint uStack_58;
  undefined4 uStack_54;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_38;
  int iStack_30;
  undefined4 uStack_24;
  undefined1 auStack_6 [6];
  
  uVar6 = unaff_w20;
  if (param_1 != 0 || in_stack_00000010 != 0) {
    uVar6 = in_stack_00000010 * 1000;
    if (unaff_w20 <= uVar6) {
      uVar4 = (ulong)(uVar6 >> 9) * 0x44b83;
      uVar5 = uVar4 >> 0x27;
      if (CARRY8(param_1,uVar5)) {
        puVar2 = (undefined4 *)func_0x007a23d8(&UNK_008850f5,0x19,&UNK_009d9300);
        uVar6 = 1000000000;
        uStack_38 = 0;
        iStack_30 = 0;
        uStack_24 = 0x10;
        puVar3 = (uint *)_getsockopt(*puVar2,0xffff,
                                     "works/CoreFoundation.framework/Versions/A/CoreFoundation",
                                     &uStack_38,&uStack_24);
        if ((int)puVar3 == -1) {
          puVar3 = (uint *)___error();
          *extraout_x8 = (ulong)*puVar3 << 0x20 | 2;
          uVar6 = 0x3b9aca01;
        }
        else if (uStack_38 != 0 || iStack_30 != 0) {
          uVar6 = iStack_30 * 1000;
          if (999999999 < uVar6) {
            uVar4 = (ulong)(uVar6 >> 9) * 0x44b83;
            uVar5 = uVar4 >> 0x27;
            if (CARRY8(uStack_38,uVar5)) {
              iVar1 = 0x9d9300;
              auVar7 = func_0x007a23d8(&UNK_008850f5,0x19);
              uStack_54 = auVar7._8_4_;
              puStack_48 = &__ZN3std3net3tcp9TcpStream10set_linger17hf9b7fffdefbb7081E;
              if (iVar1 == 1000000000) {
                uStack_54 = 0;
              }
              uStack_58 = (uint)(iVar1 != 1000000000);
              puStack_50 = auStack_6 + -10;
              iVar1 = _setsockopt(*auVar7._0_8_,0xffff,"k/Versions/A/LDAP",&uStack_58,8);
              if (iVar1 == -1) {
                puVar3 = (uint *)___error();
                puVar3 = (uint *)((ulong)*puVar3 << 0x20 | 2);
              }
              else {
                puVar3 = (uint *)0x0;
              }
              return puVar3;
            }
            uStack_38 = uStack_38 + uVar5;
            uVar6 = uVar6 + (uint)(uVar4 >> 0x27) * -1000000000;
          }
          *extraout_x8 = uStack_38;
        }
        *(uint *)(extraout_x8 + 1) = uVar6;
        return puVar3;
      }
      param_1 = param_1 + uVar5;
      uVar6 = uVar6 - (uint)(uVar4 >> 0x27) * unaff_w20;
    }
    *unaff_x19 = param_1;
  }
  *(uint *)(unaff_x19 + 1) = uVar6;
  return param_2;
}

