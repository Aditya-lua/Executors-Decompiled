
undefined8 FUN_00736a20(void)

{
  uint uVar1;
  int iVar2;
  uint *puVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long unaff_x26;
  uint *unaff_x27;
  undefined8 uVar8;
  undefined8 uStack0000000000000008;
  
code_r0x00736a20:
  uVar4 = func_0x0072c380();
  if ((int)uVar4 != 0) {
    return uVar4;
  }
code_r0x00736a2c:
  *unaff_x27 = 4;
  lVar7 = unaff_x19[1];
  lVar5 = 0;
  if (lVar7 == 0) goto LAB_0073684c;
  lVar5 = lVar7;
  if ((*(byte *)(lVar7 + 0x24) & 1) == 0) goto LAB_0073684c;
  do {
    if (unaff_x27[4] != 0) {
      if (unaff_x27[4] == 1) {
        lVar5 = unaff_x19[3];
      }
      else {
        lVar5 = unaff_x19[3];
        if ((*(byte *)(*(long *)(lVar5 + 0x3a0) + 0x9c) & 1) == 0) goto LAB_00736a90;
      }
      uVar6 = func_0x007315f4(lVar5,(int)unaff_x19[4]);
      if (((uVar6 & 1) == 0) && (uVar4 = func_0x00795098(), (int)uVar4 != 0)) {
        return uVar4;
      }
    }
LAB_00736a90:
    *unaff_x27 = 5;
    lVar7 = unaff_x19[1];
    lVar5 = 0;
    if ((lVar7 != 0) && (lVar5 = lVar7, (*(byte *)(lVar7 + 0x24) & 1) != 0)) goto code_r0x00736ab0;
LAB_0073684c:
    if ((lVar5 != 0) && ((*(byte *)(lVar5 + 0x24) & 1) == 0)) {
      uVar4 = func_0x00731158();
      if ((int)uVar4 != 0) {
        return uVar4;
      }
      if (*unaff_x21 == '\0') {
        return 0;
      }
    }
    uVar1 = *unaff_x27;
    if (uVar1 == 1) goto code_r0x00736954;
    if (uVar1 == 0) {
      uVar4 = *(undefined8 *)(unaff_x27 + 2);
      uVar1 = unaff_x27[5];
      if (uVar1 == 3) {
        lVar5 = 0;
      }
      else if (uVar1 == 6) {
        lVar5 = 2;
      }
      else {
        if (uVar1 != 4) {
          if (unaff_x20 == 0) {
            return 1;
          }
          if (-1 < *(char *)(unaff_x26 + 3)) {
            return 1;
          }
          if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x20 + 0x18) != 0) &&
             (*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x20 + 0x18) + 8) < 1)) {
            return 1;
          }
          if (*(int *)(*unaff_x19 + 0xc) < 1) {
            return 1;
          }
          func_0x0073cbdc();
          return 1;
        }
        lVar5 = 1;
      }
      uVar8 = *(undefined8 *)(&UNK_00a1e050 + lVar5 * 0x10);
      uStack0000000000000008 = 0;
      puVar3 = (uint *)(*pcRam0000000000a2b608)(1,0x48);
      if (puVar3 == (uint *)0x0) {
        uVar4 = 0;
        uVar8 = 0x1b;
code_r0x00736af4:
        (*pcRam0000000000a2b5f0)(uVar4);
        uStack0000000000000008 = 0;
        (*pcRam0000000000a2b5f0)(puVar3);
        return uVar8;
      }
      *puVar3 = uVar1;
      *(undefined8 *)(puVar3 + 2) = uVar8;
      *(undefined8 *)(puVar3 + 4) = uVar4;
      uVar8 = func_0x00730fe0(&uStack0000000000000008,0xa2b458,puVar3);
      if ((int)uVar8 != 0) {
        uVar4 = uStack0000000000000008;
        goto code_r0x00736af4;
      }
      func_0x007310b4();
      *unaff_x27 = 1;
      lVar7 = unaff_x19[1];
      lVar5 = 0;
      if ((lVar7 != 0) && (lVar5 = lVar7, (*(byte *)(lVar7 + 0x24) & 1) != 0)) {
code_r0x00736954:
        if ((*(byte *)(unaff_x19[3] + 0x398) >> 1 & 1) != 0) {
          uVar4 = func_0x0077e15c();
          if ((int)uVar4 != 0) {
            return uVar4;
          }
          *unaff_x27 = 2;
          lVar7 = unaff_x19[1];
          lVar5 = 0;
          if ((lVar7 == 0) || (lVar5 = lVar7, (*(byte *)(lVar7 + 0x24) & 1) == 0))
          goto LAB_0073684c;
        }
code_r0x00736990:
        lVar5 = unaff_x19[3];
        if ((*(byte *)(lVar5 + 0x398) & 1) == 0) break;
        if ((((*(byte *)(lVar5 + 0x104) & 0xfe) == 2) &&
            (uVar6 = func_0x007315f4(lVar5,(int)unaff_x19[4]), (uVar6 & 1) == 0)) &&
           (uVar4 = func_0x007950f8(), (int)uVar4 != 0)) {
          return uVar4;
        }
        if (((*(byte *)(unaff_x19[3] + 0x398) >> 3 & 1) != 0) &&
           (uVar4 = func_0x0075ae4c(), (int)uVar4 != 0)) {
          return uVar4;
        }
        *unaff_x27 = 3;
        lVar7 = unaff_x19[1];
        lVar5 = 0;
        if ((lVar7 != 0) && (lVar5 = lVar7, (*(byte *)(lVar7 + 0x24) & 1) != 0)) break;
      }
      goto LAB_0073684c;
    }
    if (uVar1 < 3) goto code_r0x00736990;
    if (uVar1 == 3) break;
    if (4 < uVar1) {
code_r0x00736ab0:
      *unaff_x27 = 6;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
      *unaff_x21 = '\x01';
      return 0;
    }
  } while( true );
  if ((*(byte *)(unaff_x26 + 6) & 1) != 0) goto code_r0x00736a0c;
  goto code_r0x00736a2c;
code_r0x00736a0c:
  iVar2 = func_0x007315f4(unaff_x19[3],(int)unaff_x19[4]);
  if (iVar2 != 0) {
    func_0x0073c9e4();
    return 1;
  }
  goto code_r0x00736a20;
}

