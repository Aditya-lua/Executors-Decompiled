
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_002c2ca0(long param_1,undefined8 param_2,dword *param_3,char *param_4)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  dword *pdVar5;
  dword *pdVar6;
  undefined8 uVar7;
  long lVar8;
  code *pcVar9;
  long unaff_x20;
  long *plVar10;
  undefined8 *puVar11;
  long unaff_x29;
  undefined1 auVar12 [16];
  dword dStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  code *in_stack_00000020;
  long *in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  if ((*(long *)(param_1 + 0x28) != 0) && ((*(byte *)(*(long *)(param_1 + 0x28) + 0x20) & 1) != 0))
  {
    uVar4 = 0x179;
code_r0x002c2da8:
    param_4 = "/aws-lc/crypto/fipsmodule/ec/ec_key.c";
    param_3 = (dword *)(section_00000068.segname + 0xc);
    func_0x0028f83c(0xf,0,0x84,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",uVar4);
    uVar4 = 0;
    goto LAB_002c3108;
  }
  uVar4 = func_0x002cb024();
  if ((int)uVar4 == 0) goto LAB_002c3108;
  puVar11 = *(undefined8 **)(unaff_x20 + 8);
  plVar10 = (long *)*puVar11;
  param_3 = (dword *)((long)(int)plVar10[0x29] << 3);
  iVar3 = func_0x0036e62c(plVar10 + 0x14,puVar11 + 0x13);
  if (iVar3 != 0) {
    lVar8 = *(long *)(unaff_x20 + 0x10);
joined_r0x002c2ce0:
    if (lVar8 != 0) {
      *(undefined8 *)(unaff_x29 + -0x48) = 0;
      *(undefined8 *)(unaff_x29 + -0x40) = 0;
      puVar11 = (undefined8 *)func_0x0036e31c(0x18);
      if (puVar11 == (undefined8 *)0x0) {
        in_stack_00000028 = (long *)0x0;
        in_stack_00000020 = (code *)0x0;
        in_stack_00000038 = 0;
        in_stack_00000030 = 0;
        in_stack_00000018 = 0;
        uStack0000000000000010 = 0;
        func_0x00373e9c(0xa296c8,&DAT_002c21e4);
        bVar2 = false;
        lVar8 = 0;
      }
      else {
        *puVar11 = _UNK_007fc080;
        in_stack_00000028 = (long *)0x0;
        in_stack_00000020 = (code *)0x0;
        in_stack_00000038 = 0;
        in_stack_00000030 = 0;
        in_stack_00000018 = 0;
        uStack0000000000000010 = 0;
        func_0x00373e9c(0xa296c8,&DAT_002c21e4);
        iVar3 = func_0x002d98c8(puVar11);
        if (iVar3 == 0) {
LAB_002c3064:
          lVar8 = 0;
          bVar2 = false;
          iVar3 = func_0x00370810(puVar11);
        }
        else {
          func_0x003707e8(unaff_x20 + 0x20);
          param_3 = (dword *)0xa3a728;
          param_4 = (char *)0x0;
          iVar3 = func_0x002d8060(&uStack0000000000000010,0,0xa3a728,0,puVar11,0);
          if (iVar3 == 0) goto LAB_002c3064;
          if (in_stack_00000028 == (long *)0x0) {
            param_4 = "/aws-lc/crypto/fipsmodule/evp/digestsign.c";
            uVar4 = 0xe;
            pdVar6 = (dword *)((long)&segment_command_00000020.vmsize + 3);
            uVar7 = 0x10b;
code_r0x002c30b0:
            func_0x0028f83c(uVar4,0,pdVar6,param_4,uVar7);
            lVar8 = 0;
code_r0x002c30b8:
            iVar3 = func_0x00370810(puVar11);
joined_r0x002c31e8:
            bVar2 = false;
            param_3 = pdVar6;
          }
          else {
            pcVar9 = *(code **)(*in_stack_00000028 + 0x30);
            if (pcVar9 == (code *)0x0) {
              if (in_stack_00000038 != 0x800) {
                pcVar9 = *(code **)(*in_stack_00000028 + 0x38);
                if (pcVar9 != (code *)0x0) {
                  param_4 = (char *)(unaff_x29 + -0x48);
                  pdVar6 = &MACH_HEADER.ncmds;
                  goto code_r0x002c2fb8;
                }
                param_4 = "/aws-lc/crypto/fipsmodule/evp/digestsign.c";
                uVar4 = 6;
                pdVar6 = (dword *)(section_00000068.segname + 5);
                uVar7 = 0x11e;
                goto code_r0x002c30b0;
              }
              _dStack0000000000000008 = (dword *)(ulong)*(uint *)(uStack0000000000000010 + 4);
            }
            else {
              pdVar6 = (dword *)(ulong)*(uint *)(uStack0000000000000010 + 4);
              if (in_stack_00000038 == 0x800) {
                _dStack0000000000000008 = pdVar6;
              }
              else {
                if ((int)in_stack_00000028[4] != 8) {
                  param_4 = "/aws-lc/crypto/fipsmodule/evp/evp_ctx.c";
                  uVar4 = 6;
                  pdVar6 = (dword *)(section_00000068.segname + 6);
                  uVar7 = 0x104;
                  goto code_r0x002c30b0;
                }
                param_4 = (char *)0x0;
code_r0x002c2fb8:
                param_3 = &dStack0000000000000008;
                iVar3 = (*pcVar9)(in_stack_00000028,0,param_3,param_4,pdVar6);
                if (iVar3 == 0) goto LAB_002c3064;
              }
            }
            lVar8 = func_0x0036e274(_dStack0000000000000008);
            pdVar6 = param_3;
            if (lVar8 == 0) goto code_r0x002c30b8;
            pdVar6 = &dStack0000000000000008;
            param_4 = (char *)(unaff_x29 + -0x48);
            iVar3 = func_0x002d8acc(&uStack0000000000000010,lVar8,pdVar6,param_4,0x10);
            if (iVar3 == 0) goto code_r0x002c30b8;
            pdVar6 = (dword *)0xa3a728;
            param_4 = (char *)0x0;
            iVar3 = func_0x002d8060(&uStack0000000000000010,0,0xa3a728,0,puVar11,1);
            param_3 = _dStack0000000000000008;
            if (iVar3 == 0) goto code_r0x002c30b8;
            if (in_stack_00000028 == (long *)0x0) {
              uVar4 = 0xe;
              pdVar6 = (dword *)((long)&segment_command_00000020.vmsize + 3);
              uVar7 = 0x132;
code_r0x002c31d8:
              param_4 = "/aws-lc/crypto/fipsmodule/evp/digestsign.c";
              func_0x0028f83c(uVar4,0,pdVar6,"/aws-lc/crypto/fipsmodule/evp/digestsign.c",uVar7);
              iVar3 = func_0x00370810(puVar11);
              goto joined_r0x002c31e8;
            }
            if ((*(long *)(*in_stack_00000028 + 0x48) == 0) || (in_stack_00000038 == 0x800)) {
              pcVar9 = *(code **)(*in_stack_00000028 + 0x50);
              if (pcVar9 == (code *)0x0) {
                uVar4 = 6;
                pdVar6 = (dword *)(section_00000068.segname + 5);
                uVar7 = 0x140;
                goto code_r0x002c31d8;
              }
              param_4 = (char *)(unaff_x29 + -0x48);
              iVar3 = (*pcVar9)(in_stack_00000028,lVar8,_dStack0000000000000008,param_4,0x10);
            }
            else {
              if (in_stack_00000020 == (code *)0x0) goto code_r0x002c30b8;
              (*in_stack_00000020)(&uStack0000000000000010,unaff_x29 + -0x48,0x10);
              iVar3 = func_0x002d884c(&uStack0000000000000010,lVar8);
            }
            pdVar6 = param_3;
            if (iVar3 == 0) goto code_r0x002c30b8;
            bVar2 = true;
            iVar3 = func_0x00370810(puVar11);
          }
        }
        if (iVar3 != 0) {
          if ((puVar11[2] != 0) && (pcVar9 = *(code **)(puVar11[2] + 0xa0), pcVar9 != (code *)0x0))
          {
            (*pcVar9)(puVar11);
            puVar11[1] = 0;
            *(undefined4 *)((long)puVar11 + 4) = 0;
          }
          func_0x0036e3d8(puVar11);
        }
      }
      func_0x002c13c0(&uStack0000000000000010);
      func_0x0036e3d8(lVar8);
      if (!bVar2) {
        uVar4 = 0x1a2;
        goto code_r0x002c2da8;
      }
    }
    uVar4 = 1;
    goto LAB_002c3108;
  }
  pdVar6 = (dword *)func_0x0036e31c(0x18);
  if (pdVar6 != (dword *)0x0) {
    pdVar6[5] = 1;
  }
  pdVar5 = (dword *)func_0x0036e31c(0x18);
  if (pdVar5 != (dword *)0x0) {
    pdVar5[5] = 1;
  }
  if (*(code **)(*plVar10 + 0x68) == (code *)0x0) {
    param_4 = "/aws-lc/crypto/fipsmodule/ec/ec_key.c";
    param_3 = (dword *)((long)&segment_command_00000020.vmsize + 2);
    func_0x0028f83c(0xf,0,0x42,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x18d);
code_r0x002c2ee4:
    if (pdVar6 != (dword *)0x0) goto code_r0x002c2ee8;
  }
  else {
    param_4 = (char *)(puVar11 + 1);
    (**(code **)(*plVar10 + 0x68))(plVar10,&uStack0000000000000010,unaff_x29 + -0x48);
    param_3 = pdVar6;
    lVar8 = func_0x0029c764(&uStack0000000000000010,*(undefined8 *)(unaff_x29 + -0x48));
    if (lVar8 == 0) goto code_r0x002c2ee4;
    param_4 = (char *)(puVar11 + 10);
    (**(code **)(*plVar10 + 0x68))(plVar10,&uStack0000000000000010,unaff_x29 + -0x48);
    param_3 = pdVar5;
    lVar8 = func_0x0029c764(&uStack0000000000000010,*(undefined8 *)(unaff_x29 + -0x48));
    if (lVar8 == 0) goto code_r0x002c2ee4;
    if ((pdVar6[4] == 0) && (pdVar5[4] == 0)) {
      iVar3 = func_0x0029db84(pdVar6,plVar10 + 0x28);
      if ((iVar3 < 0) && (iVar3 = func_0x0029db84(pdVar5,plVar10 + 0x28), iVar3 < 0)) {
        func_0x0029bc0c(pdVar6);
        func_0x0029bc0c(pdVar5);
        lVar8 = *(long *)(unaff_x20 + 0x10);
        goto joined_r0x002c2ce0;
      }
    }
    param_4 = "/aws-lc/crypto/fipsmodule/ec/ec_key.c";
    param_3 = (dword *)((long)&segment_command_00000020.flags + 1);
    func_0x0028f83c(0xf,0,0x65,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x196);
code_r0x002c2ee8:
    uVar1 = pdVar6[5];
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*(undefined8 *)pdVar6);
      uVar1 = pdVar6[5];
    }
    if ((uVar1 & 1) == 0) {
      *(undefined8 *)pdVar6 = 0;
    }
    else {
      func_0x0036e3d8(pdVar6);
    }
  }
  if (pdVar5 == (dword *)0x0) {
    uVar4 = 0;
  }
  else {
    uVar1 = pdVar5[5];
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*(undefined8 *)pdVar5);
      uVar1 = pdVar5[5];
    }
    if ((uVar1 & 1) == 0) {
      uVar4 = 0;
      *(undefined8 *)pdVar5 = 0;
    }
    else {
      func_0x0036e3d8(pdVar5);
      uVar4 = 0;
    }
  }
LAB_002c3108:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return uVar4;
  }
  auVar12 = ___stack_chk_fail(uVar4);
  if ((param_3 == (dword *)0x0) || (param_4 == (char *)0x0)) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3b6);
    return 0;
  }
  (**(code **)(*auVar12._0_8_ + 0x20))();
  iVar3 = func_0x002c7cd4(auVar12._0_8_,auVar12._8_8_);
  if (iVar3 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3bf);
    return 0;
  }
  return 1;
}

