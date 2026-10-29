/* 7ff70c8be290 FUN_7ff70c8be290 */

/* WARNING: Control flow encountered bad instruction data */

undefined8 FUN_7ff70c8be290(undefined8 param_1)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  longlong lVar4;
  ulonglong uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined4 *puVar9;
  byte bVar10;
  byte bVar11;
  byte in_AF;
  byte bVar12;
  byte bVar13;
  byte in_TF;
  byte in_IF;
  byte bVar14;
  byte in_NT;
  byte in_AC;
  byte in_VIF;
  byte in_VIP;
  byte in_ID;
  undefined4 extraout_XMM0_Da;
  undefined4 extraout_XMM0_Da_00;
  undefined4 uVar15;
  undefined8 uStack_80;
  undefined8 uStack_78;
  ulonglong uStack_70;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined1 auStack_20 [8];
  
  uStack_70 = 0x7ff70c8be29f;
  lVar4 = FUN_7ff70c8194a0();
  uStack_38 = 2;
  uStack_40 = 0x14;
  uStack_48 = 0x10;
  uStack_70 = 0x7ff70c8be2da;
  FUN_7ff70c8491c0(&UNK_7ff70cb8bd4c,0xbd8,0x4d0,8);
  uStack_70 = 0x7ff70c8be2e4;
  uVar5 = func_0x7ff70d6a3845(auStack_20);
  bVar10 = 0;
  bVar14 = 0;
  bVar13 = (longlong)uVar5 < 0;
  bVar12 = uVar5 == 0;
  bVar11 = (POPCOUNT(uVar5 & 0xff) & 1U) == 0;
  if (!(bool)bVar12) {
    uStack_70 = 0x7ff70c8be2f7;
    iVar2 = func_0x7ff70d633c9b(&uStack_28);
    uStack_70 = (ulonglong)(in_NT & 1) * 0x4000 | (ulonglong)(bVar14 & 1) * 0x800 |
                (ulonglong)(in_IF & 1) * 0x200 | (ulonglong)(in_TF & 1) * 0x100 |
                (ulonglong)(bVar13 & 1) * 0x80 | (ulonglong)(bVar12 & 1) * 0x40 |
                (ulonglong)(in_AF & 1) * 0x10 | (ulonglong)(bVar11 & 1) * 4 |
                (ulonglong)(bVar10 & 1) | (ulonglong)(in_ID & 1) * 0x200000 |
                (ulonglong)(in_VIP & 1) * 0x100000 | (ulonglong)(in_VIF & 1) * 0x80000 |
                (ulonglong)(in_AC & 1) * 0x40000;
    if (iVar2 != 0) {
      uStack_78 = 0x7ff70c8be30a;
      puVar6 = (undefined8 *)FUN_7ff70c802100(0x50);
      *puVar6 = 0;
      puVar6[1] = 0;
      puVar6[2] = 0;
      puVar6[3] = 0;
      puVar6[4] = 0;
      puVar6[5] = 0;
      puVar6[6] = 0;
      puVar6[7] = 0;
      puVar6[8] = 0;
      puVar6[9] = 0;
      *(undefined8 **)(lVar4 + 0x90) = puVar6;
      *(undefined **)(lVar4 + 0x80) = &UNK_7ff70cb8b959;
      *(byte *)(lVar4 + 4) = *(byte *)(lVar4 + 4) | 6;
      *puVar6 = param_1;
      puVar6[4] = uStack_28;
      puVar6[3] = uStack_30;
      *(undefined4 *)(puVar6 + 5) = 0xb;
      lVar4 = *(longlong *)(lVar4 + 0x90);
      uStack_78 = 0x7ff70c8be366;
      uVar3 = func_0x7ff70d79557a(0);
      puVar9 = (undefined4 *)(lVar4 + 0x2c);
      uStack_78 = 0x7ff70c8be383;
      uVar7 = func_0x7ff70d8e569f(uVar3 >> 0x10,0x20001004,puVar9,4);
      if ((int)CONCAT71((int7)((ulonglong)uVar7 >> 8),*(undefined1 *)puVar6) == 0) {
        *puVar9 = 0;
      }
      uStack_78 = 0x7ff70c8be393;
      lVar4 = FUN_7ff70c833020();
      uVar7 = *(undefined8 *)((longlong)puVar6 + 1);
      *(undefined8 *)(lVar4 + 0x38) = uVar7;
      *(undefined8 *)(lVar4 + 0x30) = uVar7;
      *(undefined1 *)((longlong)puVar6 + 0x32) = 1;
      bVar10 = 3;
      puVar8 = &uStack_78;
      uStack_80 = 0x7ff70c8be3af;
      uStack_78 = param_1;
      lVar4 = func_0x7ff70d7605ce();
      uVar15 = extraout_XMM0_Da;
      if (lVar4 == 0) {
        bVar10 = 0x11;
        puVar8 = &uStack_80;
        uStack_80 = param_1;
        lVar4 = func_0x7ff70d929ff7();
        uVar15 = extraout_XMM0_Da_00;
        if (lVar4 == 0) {
          uVar7 = func_0x7ff70d898425(&UNK_7ff70cb84e52);
          return uVar7;
        }
      }
      *(longlong *)((longlong)puVar6 + 0x39) = lVar4;
      *(undefined8 *)((longlong)puVar8 + -8) = 0x7ff70c8be40f;
      lVar4 = func_0x7ff70d6e69b1(uVar15,&UNK_7ff70cb82166);
      puVar1 = (uint *)(lVar4 + -0x77);
      *puVar1 = *puVar1 >> (bVar10 & 0x1f) | *puVar1 << 0x20 - (bVar10 & 0x1f);
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
  }
  return 0;
}


