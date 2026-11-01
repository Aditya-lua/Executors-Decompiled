
/* WARNING: Removing unreachable block (ram,0x0078a5d0) */
/* WARNING: Removing unreachable block (ram,0x0078a5dc) */
/* WARNING: Removing unreachable block (ram,0x0078a5fc) */
/* WARNING: Removing unreachable block (ram,0x0078a62c) */
/* WARNING: Removing unreachable block (ram,0x0078a934) */

undefined4 FUN_0078a3b0(void)

{
  long *plVar1;
  uint uVar2;
  byte bVar3;
  byte bVar4;
  bool bVar5;
  char cVar6;
  int iVar7;
  char *pcVar8;
  long lVar9;
  long lVar10;
  uint uVar11;
  undefined4 uVar12;
  long unaff_x19;
  uint unaff_w20;
  int unaff_w21;
  long lVar13;
  byte *unaff_x22;
  long unaff_x23;
  uint unaff_w25;
  uint uVar14;
  uint uStack0000000000000014;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000040;
  
  uStack0000000000000014 = 0;
  plVar1 = (long *)(unaff_x19 + 8);
  func_0x0074066c(&uStack0000000000000040,unaff_x23 * 3 + 1);
  if (unaff_w25 == 0) {
    iVar7 = func_0x007408a0(&uStack0000000000000040);
    if (iVar7 != 0) {
code_r0x0078a72c:
      uVar12 = 0x1f;
      if (iVar7 != 100) {
        uVar12 = 7;
      }
      return uVar12;
    }
    pcVar8 = (char *)func_0x00740a58(&uStack0000000000000040);
    while( true ) {
      while (*pcVar8 == '%') {
        bVar3 = pcVar8[1];
        if (((bVar3 - 0x30 & 0xff) < 10) ||
           (uVar14 = bVar3 - 0x41,
           uVar14 < 0x26 && (1L << ((ulong)uVar14 & 0x3f) & 0x3f0000003fU) != 0)) {
          bVar4 = pcVar8[2];
          if (((bVar4 - 0x30 & 0xff) < 10) ||
             (uVar14 = bVar4 - 0x41,
             uVar14 < 0x26 && (1L << ((ulong)uVar14 & 0x3f) & 0x3f0000003fU) != 0)) {
            bVar5 = (byte)(bVar3 + 0xbf) < 0x1a;
            if ((!bVar5 && 0x18 < (byte)(bVar4 + 0xbf)) && (bVar5 || (byte)(bVar4 + 0xbf) != 0x19))
            {
              pcVar8 = pcVar8 + 1;
            }
            else {
              cVar6 = func_0x0077e6e4((int)(char)bVar3);
              pcVar8[1] = cVar6;
              cVar6 = func_0x0077e6e4((long)pcVar8[2]);
              pcVar8[2] = cVar6;
              pcVar8 = pcVar8 + 3;
            }
          }
          else {
            pcVar8 = pcVar8 + 1;
          }
        }
        else {
          pcVar8 = pcVar8 + 1;
        }
      }
      if (*pcVar8 == '\0') break;
      pcVar8 = pcVar8 + 1;
    }
  }
  else {
    bVar3 = *unaff_x22;
    if (bVar3 != 0) {
      uVar14 = uStack0000000000000014;
      do {
        uVar11 = (uint)bVar3;
        if ((uVar11 - 0x30 < 10) || ((uVar11 & 0xdf) - 0x41 < 0x1a)) {
code_r0x0078a6b0:
          uVar2 = uVar14;
          if ((uVar14 & 1) != 0) {
            uVar2 = 0;
          }
          if (uVar11 != 0x3d) {
            uVar2 = uVar14;
          }
          iVar7 = func_0x0074075c(&uStack0000000000000040,unaff_x22,1);
          uVar14 = uVar2;
        }
        else {
          if (0x5e < uVar11) {
            if ((uVar11 != 0x5f) && (uVar11 != 0x7e)) {
code_r0x0078a6a4:
              if ((uVar11 != 0x3d) || ((uVar14 & 1) == 0)) goto code_r0x0078a6d8;
            }
            goto code_r0x0078a6b0;
          }
          if (uVar11 - 0x2d < 2) goto code_r0x0078a6b0;
          if (uVar11 != 0x2f) goto code_r0x0078a6a4;
code_r0x0078a6d8:
          uStack0000000000000020._1_1_ = "0123456789abcdef"[bVar3 >> 4];
          uStack0000000000000020._0_1_ = 0x25;
          uStack0000000000000020._2_1_ = "0123456789abcdef"[(ulong)bVar3 & 0xf];
          iVar7 = func_0x0074075c(&uStack0000000000000040,&uStack0000000000000020,3);
        }
        if (iVar7 != 0) goto code_r0x0078a72c;
        unaff_x22 = unaff_x22 + 1;
        bVar3 = *unaff_x22;
      } while (bVar3 != 0);
    }
  }
  lVar9 = func_0x00740a58(&uStack0000000000000040);
  if ((uStack0000000000000014 == 0) || (lVar9 == 0)) {
    if ((unaff_w21 == 5) &&
       ((lVar13 = func_0x00156654(&uStack0000000000000040), (unaff_w20 >> 10 & 1) == 0 ||
        (lVar13 != 0)))) {
      if (lVar13 == 0) {
code_r0x0078a9e4:
        func_0x00740678(&uStack0000000000000040);
        return 0x15;
      }
      if ((unaff_w25 & 1) == 0) {
        uStack0000000000000018 = 0;
        iVar7 = func_0x00742734(lVar9,lVar13,&uStack0000000000000018,&uStack0000000000000020,3);
        if ((iVar7 != 0) || (iVar7 = func_0x0078b6d8(), iVar7 != 0)) {
          (*pcRam0000000000a2b5f0)(uStack0000000000000018);
          goto code_r0x0078a9e4;
        }
        (*pcRam0000000000a2b5f0)(uStack0000000000000018);
      }
      else {
        iVar7 = func_0x0078b6d8();
        if (iVar7 != 0) goto code_r0x0078a9e4;
      }
    }
  }
  else {
    lVar13 = *(long *)(unaff_x19 + 0x40);
    if ((lVar13 != 0) && (lVar10 = _strlen(lVar13), lVar10 != 0)) {
      cVar6 = *(char *)(lVar10 + lVar13 + -1);
      func_0x0074066c(&uStack0000000000000020,&UNK_007a1200);
      iVar7 = func_0x0074075c(&uStack0000000000000020,*(undefined8 *)(unaff_x19 + 0x40),lVar10);
      if ((iVar7 == 0) &&
         (((cVar6 == '&' || (iVar7 = func_0x0074075c(&uStack0000000000000020,"&",1), iVar7 == 0)) &&
          (iVar7 = func_0x007408a0(&uStack0000000000000020,lVar9), iVar7 == 0)))) {
        func_0x00740678(&uStack0000000000000040);
        (*pcRam0000000000a2b5f0)(*plVar1);
        lVar9 = func_0x00740a58(&uStack0000000000000020);
        *plVar1 = lVar9;
        return 0;
      }
      func_0x00740678(&uStack0000000000000040);
      return 7;
    }
  }
  (*pcRam0000000000a2b5f0)(*plVar1);
  *plVar1 = lVar9;
  return 0;
}

