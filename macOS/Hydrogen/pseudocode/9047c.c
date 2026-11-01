
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0009047c(void)

{
  long lVar1;
  undefined8 *puVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uStack0000000000000008;
  undefined8 *puStack_b0;
  undefined4 uStack_a8;
  long alStack_48 [3];
  
  _memmove();
  *(long *)(unaff_x22 + 8) = unaff_x20 + unaff_x21;
  lVar4 = func_0x000282f8(0xa339e0);
  if (lVar4 != 0) {
    func_0x006e5bd0();
    lVar4 = func_0x000282f8(0xa339e0);
    if (lVar4 != 0) {
      func_0x00063518(&uStack0000000000000008,0xa339e0,lVar4);
      lVar4 = uStack0000000000000008;
      uStack0000000000000008 = 0;
      if (lVar4 != 0) {
        __ZdlPv();
      }
    }
    return 0;
  }
  uVar5 = func_0x0002a824("unordered_map::at: key not found");
  puVar6 = puRam0000000000a334a0;
  if (puRam0000000000a334a0 != puRam0000000000a334a8) {
    do {
      lVar4 = func_0x000282f8(0xa339e0,puVar6);
      if (lVar4 == 0) {
        puVar6 = (undefined8 *)func_0x0002a824("unordered_map::at: key not found");
        uVar5 = func_0x006e67c8(puVar6,1,0);
        iVar3 = _strcmp(uVar5,"Text");
        if (iVar3 == 0) {
          puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x80,0);
          *(undefined4 *)(puVar7 + 1) = 1;
          *(undefined1 *)((long)puVar7 + 0xc) = 0;
          puVar7[3] = 0;
          puVar7[4] = 0;
          puVar7[2] = 0x3ff0000000000000;
          *puVar7 = &UNK_009ba280;
          *(undefined1 *)((long)puVar7 + 0x3f) = 4;
          *(undefined4 *)(puVar7 + 5) = 0x74786554;
          *(undefined1 *)((long)puVar7 + 0x2c) = 0;
          puVar7[8] = 0x4020000000000000;
          *(undefined2 *)(puVar7 + 9) = 0;
          *(undefined8 *)((long)puVar7 + 0x54) = 0;
          *(undefined8 *)((long)puVar7 + 0x4c) = 0;
          puVar7[0xd] = 0;
          puVar7[0xe] = 0;
          puVar7[0xc] = 0;
          *(undefined4 *)(puVar7 + 0xf) = 0;
        }
        else {
          iVar3 = _strcmp(uVar5,"Circle");
          if (iVar3 == 0) {
            puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x50,0);
            *(undefined4 *)(puVar7 + 1) = 1;
            *(undefined1 *)((long)puVar7 + 0xc) = 0;
            puVar7[3] = 0;
            puVar7[4] = 0;
            puVar7[2] = 0x3ff0000000000000;
            *puVar7 = &UNK_009ba320;
            uVar5 = _UNK_0080bab0;
            puVar7[6] = _UNK_0080bab8;
            puVar7[5] = uVar5;
            puVar7[7] = 0x4000000000000000;
            puVar7[8] = 0;
code_r0x0009078c:
            *(undefined1 *)(puVar7 + 9) = 0;
          }
          else {
            iVar3 = _strcmp(uVar5,"Square");
            if (iVar3 == 0) {
              puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x48,0);
              *(undefined4 *)(puVar7 + 1) = 1;
              *(undefined1 *)((long)puVar7 + 0xc) = 0;
              puVar7[2] = 0x3ff0000000000000;
              puVar7[3] = 0;
              *puVar7 = &UNK_009ba370;
              puVar7[4] = 0;
              puVar7[5] = 0x3ff0000000000000;
              puVar7[6] = 0x42c8000042c80000;
              puVar7[7] = 0;
              *(undefined1 *)(puVar7 + 8) = 0;
            }
            else {
              iVar3 = _strcmp(uVar5,"Line");
              if (iVar3 == 0) {
                puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x40,0);
                *(undefined4 *)(puVar7 + 1) = 1;
                *(undefined1 *)((long)puVar7 + 0xc) = 0;
                puVar7[2] = 0x3ff0000000000000;
                puVar7[3] = 0;
                *puVar7 = &UNK_009ba1e8;
                puVar7[4] = 0;
                puVar7[5] = 0x3ff0000000000000;
                puVar7[6] = 0;
                puVar7[7] = 0;
              }
              else {
                iVar3 = _strcmp(uVar5,"Image");
                if (iVar3 == 0) {
                  puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x48,0);
                  *(undefined4 *)(puVar7 + 1) = 1;
                  *(undefined1 *)((long)puVar7 + 0xc) = 0;
                  puVar7[2] = 0x3ff0000000000000;
                  puVar7[3] = 0;
                  puVar7[4] = 0;
                  puVar7[5] = 0;
                  *puVar7 = &UNK_009ba2d0;
                  puVar7[6] = 0;
                  puVar7[7] = 0;
                  *(undefined4 *)(puVar7 + 8) = 0;
                }
                else {
                  iVar3 = _strcmp(uVar5,"Quad");
                  if (iVar3 != 0) {
                    iVar3 = _strcmp(uVar5,"Triangle");
                    if (iVar3 != 0) goto code_r0x00090a64;
                    puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x50,0);
                    *(undefined4 *)(puVar7 + 1) = 1;
                    *(undefined1 *)((long)puVar7 + 0xc) = 0;
                    puVar7[2] = 0x3ff0000000000000;
                    puVar7[3] = 0;
                    *puVar7 = &UNK_009ba410;
                    puVar7[4] = 0;
                    puVar7[5] = 0x3ff0000000000000;
                    puVar7[7] = 0;
                    puVar7[8] = 0;
                    puVar7[6] = 0;
                    goto code_r0x0009078c;
                  }
                  puVar7 = (undefined8 *)func_0x006e5610(puVar6,0x58,0);
                  *(undefined4 *)(puVar7 + 1) = 1;
                  *(undefined1 *)((long)puVar7 + 0xc) = 0;
                  puVar7[2] = 0x3ff0000000000000;
                  puVar7[3] = 0;
                  *puVar7 = &UNK_009ba3c0;
                  puVar7[4] = 0;
                  puVar7[5] = 0x3ff0000000000000;
                  puVar7[7] = 0;
                  puVar7[6] = 0;
                  puVar7[9] = 0;
                  puVar7[8] = 0;
                  *(undefined1 *)(puVar7 + 10) = 0;
                }
              }
            }
          }
        }
        func_0x006e3d18(puVar6,0xffffd8f0,"drawing_obj_mt");
        func_0x006e4a40(puVar6,0xfffffffe);
        uStack_a8 = func_0x006e1c18(puVar6,0xffffffff);
        puStack_b0 = puVar7;
        func_0x00092830(0xa339e0,&puStack_b0,&puStack_b0);
        puVar6 = puRam0000000000a334a8;
        puVar2 = puRam0000000000a334a0;
        if (puRam0000000000a334a8 < puRam0000000000a334b0) {
          *puRam0000000000a334a8 = puVar7;
          puRam0000000000a334a8 = puRam0000000000a334a8 + 1;
          return 1;
        }
        lVar15 = (long)puRam0000000000a334a8 - (long)puRam0000000000a334a0;
        lVar4 = lVar15 >> 3;
        uVar10 = lVar4 + 1;
        if (uVar10 >> 0x3d != 0) {
          func_0x00017f90(0xa334a0);
code_r0x00090a60:
          func_0x00017514();
code_r0x00090a64:
          uVar5 = func_0x006e644c(puVar6,"Invalid drawing type");
          puVar6 = (undefined8 *)func_0x006e33ec(uVar5,1);
                    /* WARNING: Could not recover jumptable at 0x00090aa0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar5 = (**(code **)*puVar6)(puVar6,uVar5);
          return uVar5;
        }
        uVar11 = (long)puRam0000000000a334b0 - (long)puRam0000000000a334a0 >> 2;
        if (uVar11 <= uVar10) {
          uVar11 = uVar10;
        }
        if (0x7ffffffffffffff7 < (ulong)((long)puRam0000000000a334b0 - (long)puRam0000000000a334a0))
        {
          uVar11 = 0x1fffffffffffffff;
        }
        if (uVar11 == 0) {
          lVar8 = 0;
          puVar9 = (undefined8 *)(lVar4 * 8);
          puRam0000000000a334b0 = (undefined8 *)0x0;
          *puVar9 = puVar7;
        }
        else {
          if (uVar11 >> 0x3d != 0) goto code_r0x00090a60;
          lVar8 = __Znwm(uVar11 << 3);
          puVar9 = (undefined8 *)(lVar8 + lVar4 * 8);
          puRam0000000000a334b0 = (undefined8 *)(lVar8 + uVar11 * 8);
          *puVar9 = puVar7;
        }
        lVar1 = (long)puVar6 - (long)puVar2;
        puVar7 = puVar9 + 1;
        if (lVar1 == 0) goto code_r0x00090a1c;
        uVar10 = lVar1 - 8;
        puVar14 = puVar6;
        if ((uVar10 < 0x58) || ((ulong)((long)puVar6 - (lVar15 + lVar8)) < 0x40))
        goto code_r0x00090a08;
        uVar10 = (uVar10 >> 3) + 1;
        uVar12 = uVar10 & 0x3ffffffffffffff8;
        puVar14 = puVar6 + -uVar12;
        puVar9 = puVar9 + -uVar12;
        puVar6 = puVar6 + -4;
        puVar13 = (undefined8 *)(lVar8 + lVar4 * 8 + -0x20);
        uVar11 = uVar12;
        do {
          uVar17 = *puVar6;
          uVar16 = puVar6[3];
          uVar5 = puVar6[2];
          uVar21 = puVar6[-3];
          uVar20 = puVar6[-4];
          uVar19 = puVar6[-1];
          uVar18 = puVar6[-2];
          puVar13[1] = puVar6[1];
          *puVar13 = uVar17;
          puVar13[3] = uVar16;
          puVar13[2] = uVar5;
          puVar13[-3] = uVar21;
          puVar13[-4] = uVar20;
          puVar13[-1] = uVar19;
          puVar13[-2] = uVar18;
          puVar6 = puVar6 + -8;
          puVar13 = puVar13 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar10 != uVar12) {
code_r0x00090a08:
          do {
            puVar14 = puVar14 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar14;
          } while (puVar14 != puVar2);
        }
        puVar6 = puRam0000000000a334a0;
code_r0x00090a1c:
        puRam0000000000a334a0 = puVar9;
        if (puVar6 != (undefined8 *)0x0) {
          puRam0000000000a334a8 = puVar7;
          __ZdlPv(puVar6);
        }
        puRam0000000000a334a8 = puVar7;
        return 1;
      }
      func_0x006e5bd0(uVar5,*(undefined4 *)(lVar4 + 0x18));
      lVar4 = func_0x000282f8(0xa339e0,puVar6);
      if (lVar4 != 0) {
        func_0x00063518(alStack_48,0xa339e0,lVar4);
        lVar4 = alStack_48[0];
        alStack_48[0] = 0;
        if (lVar4 != 0) {
          __ZdlPv();
        }
      }
      puVar6 = puVar6 + 1;
    } while (puVar6 != puRam0000000000a334a8);
  }
  puRam0000000000a334a8 = puRam0000000000a334a0;
  return 0;
}

