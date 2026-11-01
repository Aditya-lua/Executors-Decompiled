
/* WARNING: Removing unreachable block (ram,0x001391a4) */

ulong FUN_00139100(long *param_1,long param_2,long param_3)

{
  byte *pbVar1;
  uint uVar2;
  byte bVar3;
  undefined8 *puVar4;
  long *plVar5;
  int *unaff_x19;
  long unaff_x20;
  byte *pbVar6;
  byte *unaff_x21;
  ulong unaff_x22;
  long lVar7;
  long unaff_x24;
  long lVar8;
  int iVar9;
  uint uVar10;
  long lVar11;
  undefined8 uStack0000000000000000;
  undefined4 uStack0000000000000008;
  byte bStack000000000000000c;
  
code_r0x00139100:
  func_0x001396dc(param_1,param_2,param_3);
code_r0x00139104:
LAB_001391bc:
  unaff_x19[1] = unaff_x19[1] + 1;
  uVar10 = 1;
  pbVar6 = unaff_x21;
  do {
    *(undefined1 *)(unaff_x20 + 0x5d) = 1;
    bVar3 = *pbVar6;
    iVar9 = (int)unaff_x24;
    if (bVar3 == 10) {
      plVar5 = (long *)(*(long *)(unaff_x20 + 8) + (long)*unaff_x19 * 0x18);
      lVar11 = *plVar5;
      lVar7 = plVar5[1];
      puVar4 = (undefined8 *)func_0x00139304();
      if (iVar9 < (int)((ulong)(lVar7 - lVar11) >> 2) * -0x55555555) {
        lVar7 = *(long *)(unaff_x20 + 8);
        lVar8 = (long)*unaff_x19 * 0x18;
        lVar11 = *(long *)(lVar7 + lVar8) + (long)iVar9 * 0xc;
        plVar5 = (long *)(lVar7 + (long)*unaff_x19 * 0x18 + 8);
        func_0x00149130(puVar4,*puVar4,lVar11,*plVar5,(*plVar5 - lVar11 >> 2) * -0x5555555555555555)
        ;
        lVar11 = *(long *)(lVar7 + lVar8) + (long)iVar9 * 0xc;
        if (lVar11 != *plVar5) {
          *plVar5 = lVar11;
        }
      }
      unaff_x24 = 0;
      *unaff_x19 = *unaff_x19 + 1;
      unaff_x19[1] = 0;
      unaff_x22 = (ulong)((int)unaff_x22 + 1);
    }
    else if (bVar3 != 0xd) break;
    pbVar6 = pbVar6 + 1;
  } while( true );
  if (bVar3 == 0) {
    return unaff_x22;
  }
  if ((bVar3 & 0xe0) == 0xc0) {
    uVar10 = 2;
  }
  uVar2 = 3;
  if ((bVar3 & 0xf0) != 0xe0) {
    uVar2 = uVar10;
  }
  uVar10 = 4;
  if ((bVar3 & 0xf8) != 0xf0) {
    uVar10 = uVar2;
  }
  uVar2 = 5;
  if ((bVar3 & 0xfc) != 0xf8) {
    uVar2 = uVar10;
  }
  uVar10 = 6;
  if ((bVar3 & 0xfe) != 0xfc) {
    uVar10 = uVar2;
  }
  lVar11 = (long)iVar9;
  if (*pbVar6 == 0) {
    unaff_x21 = pbVar6;
    unaff_x24 = lVar11;
    goto LAB_001391bc;
  }
  param_1 = (long *)(*(long *)(unaff_x20 + 8) + (long)*unaff_x19 * 0x18);
  lVar7 = lVar11 + 1;
  pbVar1 = pbVar6 + 1;
  uStack0000000000000008 = 0;
  bStack000000000000000c = bStack000000000000000c & 0xf8;
  uStack0000000000000000._4_1_ = *pbVar6;
  func_0x001396dc(param_1,*param_1 + (long)iVar9 * 0xc,(long)&uStack0000000000000000 + 4);
  unaff_x21 = pbVar1;
  unaff_x24 = lVar7;
  if ((uVar10 < 2) || (*pbVar1 == 0)) goto LAB_001391bc;
  unaff_x24 = lVar11 + 2;
  unaff_x21 = pbVar6 + 2;
  uStack0000000000000008 = 0;
  bStack000000000000000c = bStack000000000000000c & 0xf8;
  uStack0000000000000000._4_1_ = *pbVar1;
  func_0x001396dc(param_1,*param_1 + lVar7 * 0xc,(long)&uStack0000000000000000 + 4);
  if (uVar10 < 3) goto code_r0x00139104;
  if (*unaff_x21 == 0) goto LAB_001391bc;
  lVar7 = lVar11 + 3;
  pbVar1 = pbVar6 + 3;
  uStack0000000000000008 = 0;
  bStack000000000000000c = bStack000000000000000c & 0xf8;
  uStack0000000000000000._4_1_ = *unaff_x21;
  func_0x001396dc(param_1,*param_1 + unaff_x24 * 0xc,(long)&uStack0000000000000000 + 4);
  unaff_x21 = pbVar1;
  unaff_x24 = lVar7;
  if ((uVar10 < 4) || (*pbVar1 == 0)) goto LAB_001391bc;
  unaff_x24 = lVar11 + 4;
  unaff_x21 = pbVar6 + 4;
  uStack0000000000000008 = 0;
  bStack000000000000000c = bStack000000000000000c & 0xf8;
  uStack0000000000000000._4_1_ = *pbVar1;
  func_0x001396dc(param_1,*param_1 + lVar7 * 0xc,(long)&uStack0000000000000000 + 4);
  if (4 < uVar10) {
    if (*unaff_x21 != 0) {
      lVar7 = lVar11 + 5;
      pbVar1 = pbVar6 + 5;
      uStack0000000000000008 = 0;
      bStack000000000000000c = bStack000000000000000c & 0xf8;
      uStack0000000000000000._4_1_ = *unaff_x21;
      func_0x001396dc(param_1,*param_1 + unaff_x24 * 0xc,(long)&uStack0000000000000000 + 4);
      unaff_x21 = pbVar1;
      unaff_x24 = lVar7;
      if ((5 < uVar10) && (*pbVar1 != 0)) {
        unaff_x24 = lVar11 + 6;
        param_2 = *param_1 + lVar7 * 0xc;
        unaff_x21 = pbVar6 + 6;
        uStack0000000000000008 = 0;
        bStack000000000000000c = bStack000000000000000c & 0xf8;
        param_3 = (long)&uStack0000000000000000 + 4;
        uStack0000000000000000._4_1_ = *pbVar1;
        goto code_r0x00139100;
      }
    }
    goto LAB_001391bc;
  }
  goto code_r0x00139104;
}

