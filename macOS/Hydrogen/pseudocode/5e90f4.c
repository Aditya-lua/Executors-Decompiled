
void FUN_005e90f4(void)

{
  bool bVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined *puVar5;
  undefined *puVar6;
  uint *puVar7;
  long lVar8;
  long lVar9;
  ulong *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x26;
  long *plVar10;
  undefined1 auVar11 [16];
  long *plStack0000000000000010;
  undefined1 auStack_98 [20];
  undefined4 uStack_84;
  long *plStack_80;
  undefined *puStack_78;
  undefined4 *puStack_70;
  undefined *puStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  long **pplStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  long lStack_30;
  undefined *puStack_28;
  
  do {
    DataMemoryBarrier(2,1);
    func_0x005e80f0(unaff_x20 + 8);
LAB_005e9034:
    do {
      do {
        unaff_x22 = unaff_x22 + 1;
        if (unaff_x22 == unaff_x21) {
          return;
        }
        puVar7 = (uint *)(unaff_x23 + unaff_x22 * unaff_x24);
        uVar2 = *puVar7;
        if (uVar2 == 1) {
          plStack0000000000000010 = *(long **)(puVar7 + 2);
          if (plStack0000000000000010 == (long *)0xffffffffffffffff) goto LAB_005e9034;
          lVar9 = *plStack0000000000000010;
          do {
            if (lVar9 == 0) goto LAB_005e9034;
            if (lVar9 < 0) {
              uVar4 = func_0x007b1070(&UNK_009f3bc0,&UNK_009f3be8);
              lVar9 = *plStack0000000000000010;
              *plStack0000000000000010 = lVar9 + -1;
              LORelease();
              if (lVar9 == 1) {
                DataMemoryBarrier(2,1);
                func_0x005e80f0(unaff_x20 + 8);
              }
              __Unwind_Resume(uVar4);
              auVar11 = func_0x007a2668();
              lVar9 = auVar11._0_8_;
              func_0x00469240(auStack_98,auVar11._8_8_,&UNK_008883d0,8);
              uVar4 = func_0x004653b0(auStack_98,&UNK_00828cf0,4,lVar9 + 0x10,&UNK_009f3dc8);
              uVar4 = func_0x004653b0(uVar4,&UNK_008b9c30,6,lVar9 + 0x20,&UNK_009f3dc8);
              func_0x004653b0(uVar4,&UNK_008b9c36,5,lVar9,&UNK_009f3de8);
              if (*(undefined **)(lVar9 + 0x50) != (undefined *)0x0) {
                uStack_58 = *(undefined8 *)(lVar9 + 0x58);
                puStack_60 = *(undefined **)(lVar9 + 0x50);
                func_0x004653b0(auStack_98,&UNK_008b9c3b,0xb,&puStack_60,&UNK_009f3dc8);
              }
              lVar8 = *(long *)(lVar9 + 0x60);
              if (lVar8 == 0) {
                if (*(uint *)(lVar9 + 8) == 0) goto code_r0x005e9328;
                puStack_60 = (undefined *)CONCAT44(puStack_60._4_4_,*(undefined4 *)(lVar9 + 0xc));
                puVar5 = &UNK_008b9a74;
                puVar6 = &UNK_009f3e08;
code_r0x005e9318:
                uVar4 = 4;
              }
              else {
                puStack_28 = *(undefined **)(lVar9 + 0x68);
                lStack_30 = lVar8;
                if ((*(uint *)(lVar9 + 8) & 1) == 0) {
                  plStack_80 = &lStack_30;
                  puStack_78 = &DAT_005eca44;
                  puStack_60 = &UNK_007fc120;
                  uStack_58 = 1;
                  uStack_48 = 1;
                  uStack_40 = 0;
                  pplStack_50 = &plStack_80;
                  puVar5 = &UNK_008b9a78;
                  puVar6 = &UNK_009f3e28;
                  goto code_r0x005e9318;
                }
                plStack_80 = &lStack_30;
                puStack_78 = &DAT_005eca44;
                puStack_70 = &uStack_84;
                puStack_68 = &
                             __ZN4core3fmt3num3imp52__LT_impl_u20_core__fmt__Display_u20_for_u20_u32_GT_3fmt17hb3d30f6df66500a0E
                ;
                puStack_60 = &UNK_009f3e48;
                uStack_58 = 2;
                uStack_48 = 2;
                uStack_40 = 0;
                pplStack_50 = &plStack_80;
                puVar5 = &UNK_008b9e10;
                puVar6 = &UNK_009f3e28;
                uVar4 = 8;
                uStack_84 = *(undefined4 *)(lVar9 + 0xc);
              }
              func_0x004653b0(auStack_98,puVar5,uVar4,&puStack_60,puVar6);
code_r0x005e9328:
              lStack_30 = lVar9 + 0x30;
              puStack_28 = &
                           __ZN68__LT_tracing_core__field__FieldSet_u20_as_u20_core__fmt__Display_GT_3fmt17hc1c02597c88d873dE
              ;
              puStack_60 = &UNK_007fc120;
              uStack_58 = 1;
              uStack_48 = 1;
              uStack_40 = 0;
              pplStack_50 = (long **)&lStack_30;
              uVar4 = func_0x004653b0(auStack_98,&UNK_008b9c47,6,&puStack_60,&UNK_009f3e28);
              puStack_78 = *(undefined **)(lVar9 + 0x48);
              plStack_80 = *(long **)(lVar9 + 0x40);
              uVar4 = func_0x004653b0(uVar4,&UNK_008b9e18,8,&plStack_80,&UNK_009f3e68);
              func_0x004653b0(uVar4,&UNK_00888480,4,lVar9 + 0x70,&UNK_009f3e88);
              func_0x00465628();
              return;
            }
            lVar8 = lVar9 + 1;
            bVar1 = *plStack0000000000000010 != lVar9;
            lVar9 = *plStack0000000000000010;
          } while (bVar1);
          *plStack0000000000000010 = lVar8;
          lVar9 = *(long *)(puVar7 + 4);
          plVar10 = (long *)((long)plStack0000000000000010 +
                            (*(long *)(lVar9 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
        }
        else {
          lVar9 = *(long *)(puVar7 + 4);
          plVar10 = *(long **)(puVar7 + 2);
          plStack0000000000000010 = plVar10;
        }
        uVar3 = (**(code **)(lVar9 + 0x30))(plVar10);
        if (uVar3 != 5) {
          if (uVar3 == 6) {
            uVar3 = 0;
          }
          if (uVar3 < *unaff_x19) {
            *unaff_x19 = uVar3;
          }
        }
      } while ((uVar2 & 1) == 0);
      lVar9 = *plStack0000000000000010;
      *plStack0000000000000010 = lVar9 + unaff_x26;
      LORelease();
    } while (lVar9 != 1);
  } while( true );
}

