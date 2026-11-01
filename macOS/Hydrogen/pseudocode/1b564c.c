
void __ZN92__LT_rustls__msgs__handshake__CertificateExtension_u20_as_u20_rustls__msgs__codec__Codec_GT_4read17hd7ea8f8c1e81674cE
               (undefined8 *param_1,ulong *param_2)

{
  byte *pbVar1;
  ushort uVar2;
  uint uVar3;
  undefined *puVar4;
  undefined *extraout_x1;
  undefined *extraout_x1_00;
  undefined *puVar5;
  long *plVar6;
  long lVar7;
  undefined8 uVar8;
  undefined *puVar9;
  undefined *extraout_x8;
  undefined *extraout_x8_00;
  long lVar10;
  undefined *puVar11;
  undefined *extraout_x9;
  undefined *extraout_x9_00;
  long lVar12;
  ulong uVar13;
  uint extraout_w11;
  ulong uVar14;
  undefined *unaff_x20;
  long lVar15;
  ulong uVar16;
  undefined1 auVar17 [16];
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  long *plStack_c0;
  ulong uStack_b8;
  byte *pbStack_78;
  undefined *puStack_70;
  undefined *puStack_68;
  byte bStack_60;
  undefined1 uStack_5f;
  ushort uStack_5e;
  ushort uStack_5c;
  undefined2 uStack_5a;
  byte bStack_58;
  byte bStack_57;
  undefined4 uStack_56;
  undefined2 uStack_52;
  undefined6 uStack_50;
  undefined2 uStack_4a;
  ushort uStack_48;
  ushort uStack_46;
  uint uStack_44;
  
  func_0x001f10d8(&bStack_60);
  if (bStack_60 != 0x15) {
    *(ulong *)((long)param_1 + 0x16) = CONCAT62(uStack_50,uStack_52);
    *(ulong *)((long)param_1 + 0xe) =
         CONCAT44(uStack_56,CONCAT13(bStack_57,CONCAT12(bStack_58,uStack_5a)));
    *(undefined2 *)((long)param_1 + 0x1e) = uStack_4a;
    *(byte *)(param_1 + 1) = bStack_60;
    *(undefined1 *)((long)param_1 + 9) = uStack_5f;
    *(uint *)((long)param_1 + 10) = CONCAT22(uStack_5c,uStack_5e);
LAB_001b56d0:
    *param_1 = 0x8000000000000002;
    return;
  }
  puVar5 = (undefined *)param_2[1];
  puVar4 = (undefined *)param_2[2];
  if ((ulong)((long)puVar5 - (long)puVar4) < 2) {
    param_1[2] = &UNK_008298da;
    param_1[3] = 3;
    *(undefined1 *)(param_1 + 1) = 0xc;
    goto LAB_001b56d0;
  }
  puVar9 = puVar4 + 2;
  param_2[2] = (ulong)puVar9;
  if (puVar4 < (undefined *)0xfffffffffffffffe) {
    if (puVar5 < puVar9) goto LAB_001b58f0;
    uVar14 = *param_2;
    uVar2 = *(ushort *)(puVar4 + uVar14);
    uVar13 = (ulong)uVar2;
    unaff_x20 = (undefined *)(ulong)((uint)(uVar2 >> 8) | (uVar2 & 0xff00ff) << 8);
    if (puVar5 + -(long)puVar9 < unaff_x20) {
      param_1[1] = 0xb;
      param_1[2] = unaff_x20;
      param_1[3] = 0;
      goto LAB_001b56d0;
    }
    puVar11 = puVar9 + (long)unaff_x20;
    param_2[2] = (ulong)puVar11;
    if (CARRY8((ulong)puVar9,(ulong)unaff_x20)) goto LAB_001b5900;
    if (puVar11 <= puVar5) {
      pbVar1 = puVar9 + uVar14;
      pbStack_78 = pbVar1;
      puStack_70 = unaff_x20;
      if (uStack_5e == 5) {
        if (uVar2 == 0) {
          uStack_46 = 0;
          uVar14 = 0;
          bStack_58 = 0xc;
          uStack_48 = 0x15;
          puVar4 = &UNK_00820e5a;
        }
        else {
          puStack_68 = (undefined *)0x1;
          puVar9 = (undefined *)(ulong)*pbVar1;
          if (*pbVar1 == 1) {
            func_0x00223c38(&bStack_60,&pbStack_78);
            uVar16 = (ulong)bStack_58;
            puVar9 = (undefined *)(ulong)bStack_57;
            puVar11 = (undefined *)(ulong)(byte)uStack_56;
            uVar13 = (ulong)CONCAT23(uStack_52,uStack_56._1_3_);
            puVar4 = (undefined *)CONCAT26(uStack_4a,uStack_50);
            uVar14 = (ulong)uStack_44;
            if ((bStack_60 & 1) == 0) {
              if (puStack_68 < puStack_70) {
                *(undefined1 *)(param_1 + 1) = 0xf;
                param_1[2] = &UNK_0081ded1;
                param_1[3] = 0x14;
                *param_1 = 0x8000000000000002;
                uVar16 = (long)puVar11 << 0x10 | uVar13 << 0x18 | (long)puVar9 << 8 | uVar16;
                if ((uVar16 | 0x8000000000000000) == 0x8000000000000000) {
                  return;
                }
                func_0x00187bd4(puVar4,uVar16,1);
                return;
              }
              unaff_x20 = puVar4;
              puVar5 = (undefined *)0x8000000000000001;
              goto LAB_001b5880;
            }
          }
          else {
            bStack_58 = 4;
            uStack_48 = 5;
            uStack_46 = uStack_5c;
          }
        }
        *(int *)((long)param_1 + 0xb) = (int)uVar13;
        *(char *)((long)param_1 + 0xf) = (char)(uVar13 >> 0x20);
        param_1[2] = puVar4;
        *(ushort *)(param_1 + 3) = uStack_48;
        *(ushort *)((long)param_1 + 0x1a) = uStack_46;
        *(int *)((long)param_1 + 0x1c) = (int)uVar14;
        *(byte *)(param_1 + 1) = bStack_58;
        *(char *)((long)param_1 + 9) = (char)puVar9;
        *(char *)((long)param_1 + 10) = (char)puVar11;
        goto LAB_001b56d0;
      }
      if (uVar2 == 0) {
        uVar16 = 1;
      }
      else {
        uVar16 = func_0x00187bd0(unaff_x20,1);
        if (uVar16 == 0) goto LAB_001b5924;
      }
      _memcpy(uVar16,pbVar1,unaff_x20);
      puVar9 = (undefined *)(uVar16 >> 8);
      puVar11 = (undefined *)(uVar16 >> 0x10);
      uVar13 = uVar16 >> 0x18;
      puVar5 = unaff_x20;
      uStack_44 = extraout_w11;
      uStack_48 = uStack_5e;
      uStack_46 = uStack_5c;
LAB_001b5880:
      *param_1 = puVar5;
      param_1[1] = ((ulong)puVar11 & 0xff) << 0x10 | uVar13 << 0x18 | ((ulong)puVar9 & 0xff) << 8 |
                   uVar16 & 0xff;
      param_1[2] = unaff_x20;
      *(ushort *)(param_1 + 3) = uStack_48;
      *(ushort *)((long)param_1 + 0x1a) = uStack_46;
      *(uint *)((long)param_1 + 0x1c) = uStack_44;
      return;
    }
  }
  else {
    func_0x007a28bc(puVar4,puVar9,&UNK_009c9a78);
    puVar5 = extraout_x1;
    puVar9 = extraout_x8;
LAB_001b58f0:
    func_0x007a28b0(puVar9,puVar5,&UNK_009c9a78);
    puVar9 = extraout_x8_00;
    puVar11 = extraout_x9;
LAB_001b5900:
    func_0x007a28bc(puVar9,puVar11,&UNK_009c9a78);
    puVar5 = extraout_x1_00;
    puVar11 = extraout_x9_00;
  }
  func_0x007a28b0(puVar11,puVar5,&UNK_009c9a78);
LAB_001b5924:
  auVar17 = func_0x007a1f00(1,unaff_x20,&UNK_009c6fd0);
  plVar6 = auVar17._8_8_;
  lVar15 = auVar17._0_8_;
  uVar13 = *(ulong *)(lVar15 + 0x28);
  lVar7 = plVar6[2];
  lVar10 = *plVar6;
  plStack_c0 = (long *)(ulong)uStack_5e;
  uStack_b8 = (ulong)uStack_5c;
  if ((ulong)(lVar10 - lVar7) < 3) {
    func_0x0079b61c(plVar6,lVar7,3,1,1);
    lVar7 = plVar6[2];
    lVar10 = *plVar6;
  }
  uVar3 = (uint)uVar13 & 0xff00ff;
  lVar12 = plVar6[1];
  *(char *)((ushort *)(lVar12 + lVar7) + 1) = (char)uVar3;
  *(ushort *)(lVar12 + lVar7) =
       (ushort)(byte)(uVar3 >> 0x10) | (ushort)(((((uint)uVar13 & 0xff00ff00) >> 8) << 0x10) >> 8);
  lVar7 = lVar7 + 3;
  plVar6[2] = lVar7;
  uVar8 = *(undefined8 *)(lVar15 + 0x20);
  if ((ulong)(lVar10 - lVar7) < uVar13) {
    func_0x0079b61c(plVar6,lVar7,uVar13,1,1);
    lVar12 = plVar6[1];
    lVar7 = plVar6[2];
  }
  _memcpy(lVar12 + lVar7,uVar8,uVar13);
  plVar6[2] = lVar7 + uVar13;
  lVar10 = plVar6[2];
  lVar7 = lVar10;
  if ((ulong)(*plVar6 - lVar10) < 2) {
    func_0x0079b61c(plVar6,lVar10,2,1,1);
    lVar7 = plVar6[2];
  }
  *(undefined2 *)(plVar6[1] + lVar7) = 0xffff;
  plVar6[2] = lVar7 + 2;
  uStack_d8 = 0x1616161616161616;
  uStack_e0 = 0x1616161616161616;
  uStack_c8 = 0x1616161616161616;
  uStack_d0 = 0x1616161616161616;
  plStack_c0 = plVar6;
  uStack_b8 = lVar10;
  if (*(long *)(lVar15 + 0x10) != 0) {
    lVar7 = *(long *)(lVar15 + 8);
    lVar15 = *(long *)(lVar15 + 0x10) << 5;
    do {
      func_0x001b5440(lVar7,plVar6);
      lVar7 = lVar7 + 0x20;
      lVar15 = lVar15 + -0x20;
    } while (lVar15 != 0);
  }
  func_0x0024031c(&uStack_e0);
  return;
}

