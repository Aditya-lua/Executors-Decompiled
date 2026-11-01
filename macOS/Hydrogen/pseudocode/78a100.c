
/* WARNING: Removing unreachable block (ram,0x0078a530) */

ulong FUN_0078a100(long *param_1,uint param_2,byte *param_3,undefined8 param_4)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  bool bVar4;
  char cVar5;
  int iVar6;
  undefined *puVar7;
  undefined4 *puVar8;
  ulong uVar9;
  int *piVar10;
  char *pcVar11;
  long lVar12;
  long lVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  undefined *puVar17;
  byte *pbVar18;
  uint uVar19;
  long lVar20;
  long *plVar21;
  uint uVar22;
  uint uStack0000000000000014;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000040;
  
  if (param_1 == (long *)0x0) {
    return 1;
  }
  if (param_3 == (byte *)0x0) {
    switch(param_2) {
    case 0:
      (*pcRam0000000000a2b5f0)(*param_1);
      (*pcRam0000000000a2b5f0)(param_1[1]);
      (*pcRam0000000000a2b5f0)(param_1[2]);
      (*pcRam0000000000a2b5f0)(param_1[3]);
      (*pcRam0000000000a2b5f0)(param_1[4]);
      (*pcRam0000000000a2b5f0)(param_1[5]);
      (*pcRam0000000000a2b5f0)(param_1[6]);
      (*pcRam0000000000a2b5f0)(param_1[7]);
      (*pcRam0000000000a2b5f0)(param_1[8]);
      (*pcRam0000000000a2b5f0)(param_1[9]);
      param_1[10] = 0;
      param_1[7] = 0;
      param_1[6] = 0;
      param_1[9] = 0;
      param_1[8] = 0;
      param_1[3] = 0;
      param_1[2] = 0;
      param_1[5] = 0;
      param_1[4] = 0;
      param_1[1] = 0;
      *param_1 = 0;
      return 0;
    case 1:
      *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) & 0xfb;
      break;
    case 2:
      param_1 = param_1 + 1;
      break;
    case 3:
      param_1 = param_1 + 2;
      break;
    case 4:
      param_1 = param_1 + 3;
      break;
    case 5:
      param_1 = param_1 + 4;
      break;
    case 6:
      *(undefined2 *)(param_1 + 10) = 0;
      param_1 = param_1 + 6;
      break;
    case 7:
      param_1 = param_1 + 7;
      break;
    case 8:
      *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) & 0xfe;
      param_1 = param_1 + 8;
      break;
    case 9:
      *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) & 0xfd;
      param_1 = param_1 + 9;
      break;
    case 10:
      param_1 = param_1 + 5;
      break;
    default:
      return 9;
    }
    if (*param_1 == 0) {
      return 0;
    }
    (*pcRam0000000000a2b5f0)();
    *param_1 = 0;
    return 0;
  }
  puVar7 = (undefined *)_strlen(param_3);
  if (&UNK_007a1200 < puVar7) {
    return 3;
  }
  if (10 < param_2) {
    return 9;
  }
  uVar19 = (uint)param_4;
  uVar16 = uVar19 >> 7 & 1;
  switch(param_2) {
  case 0:
    if (puVar7 == (undefined *)0x0) {
      return 3;
    }
    lVar12 = func_0x00788b7c(param_3,0);
    if ((lVar12 == 0) &&
       (iVar6 = func_0x00789530(param_1,0,&uStack0000000000000040,param_4), iVar6 == 0)) {
      uVar9 = func_0x0078b55c(uStack0000000000000040,param_3,param_1,param_4);
      (*pcRam0000000000a2b5f0)(uStack0000000000000040);
      return uVar9;
    }
    uVar9 = func_0x0078aa74(param_3,param_1,param_4);
    return uVar9;
  case 1:
    if (puVar7 + -0x29 < (undefined *)0xffffffffffffffd8) {
      return 0x1b;
    }
    if (((uVar19 >> 3 & 1) == 0) && (lVar12 = func_0x007850e8(param_3), lVar12 == 0)) {
      return 5;
    }
    if (0x19 < (*param_3 & 0xffffffdf) - 0x41) {
      return 0x1b;
    }
    puVar17 = puVar7 + -1;
    if (puVar17 != (undefined *)0x0) {
      pbVar18 = param_3;
      do {
        bVar2 = *pbVar18;
        if ((9 < bVar2 - 0x30 && 0x19 < (bVar2 & 0xffffffdf) - 0x41) &&
           (0x2e < bVar2 || (1L << ((ulong)bVar2 & 0x3f) & 0x680000000000U) == 0)) {
          return 0x1b;
        }
        pbVar18 = pbVar18 + 1;
        puVar17 = puVar17 + -1;
      } while (puVar17 != (undefined *)0x0);
    }
    uStack0000000000000014 = 0;
    uVar22 = 0;
    uVar16 = 0;
    *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) & 0xfb;
    bVar4 = false;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1;
    break;
  case 2:
    uStack0000000000000014 = 0;
    bVar4 = false;
    uVar22 = 0;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 1;
    break;
  case 3:
    uStack0000000000000014 = 0;
    bVar4 = false;
    uVar22 = 0;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 2;
    break;
  case 4:
    uStack0000000000000014 = 0;
    bVar4 = false;
    uVar22 = 0;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 3;
    break;
  case 5:
    (*pcRam0000000000a2b5f0)(param_1[5]);
    uStack0000000000000014 = 0;
    bVar4 = false;
    uVar22 = 0;
    param_1[5] = 0;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 4;
    break;
  case 6:
    if (9 < *param_3 - 0x30) {
      return 4;
    }
    puVar8 = (undefined4 *)___error();
    *puVar8 = 0;
    uVar9 = _strtoul(param_3,&uStack0000000000000040,10);
    piVar10 = (int *)___error();
    if (*piVar10 != 0) {
      return 4;
    }
    if (uVar9 >> 0x10 != 0) {
      return 4;
    }
    if (*uStack0000000000000040 != '\0') {
      return 4;
    }
    lVar12 = (*pcRam0000000000a2b600)(param_3);
    if (lVar12 == 0) {
      return 7;
    }
    (*pcRam0000000000a2b5f0)(param_1[6]);
    param_1[6] = lVar12;
    *(short *)(param_1 + 10) = (short)uVar9;
    return 0;
  case 7:
    uStack0000000000000014 = 0;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 2);
    bVar4 = true;
    plVar21 = param_1 + 7;
    uVar22 = 0;
    if (*param_3 != 0x2f) {
      iVar6 = func_0x0074075c(&uStack0000000000000040,"/",1);
      uVar14 = 0x1f;
      if (iVar6 != 100) {
        uVar14 = 7;
      }
      if (iVar6 != 0) {
        return (ulong)uVar14;
      }
    }
    break;
  case 8:
    bVar4 = false;
    uStack0000000000000014 = uVar19 >> 8 & 1;
    *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) | 1;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 8;
    uVar22 = uVar16;
    break;
  case 9:
    uStack0000000000000014 = 0;
    bVar4 = false;
    *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) | 2;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 9;
    uVar22 = 0;
    break;
  case 10:
    uStack0000000000000014 = 0;
    bVar4 = false;
    func_0x0074066c(&uStack0000000000000040,(long)puVar7 * 3 + 1);
    plVar21 = param_1 + 5;
    uVar22 = 0;
  }
  if (uVar16 == 0) {
    iVar6 = func_0x007408a0(&uStack0000000000000040,param_3);
    if (iVar6 != 0) {
LAB_0078a72c:
      uVar16 = 0x1f;
      if (iVar6 != 100) {
        uVar16 = 7;
      }
      return (ulong)uVar16;
    }
    pcVar11 = (char *)func_0x00740a58(&uStack0000000000000040);
    while( true ) {
      while (*pcVar11 == '%') {
        bVar2 = pcVar11[1];
        if (((bVar2 - 0x30 & 0xff) < 10) ||
           (uVar22 = bVar2 - 0x41,
           uVar22 < 0x26 && (1L << ((ulong)uVar22 & 0x3f) & 0x3f0000003fU) != 0)) {
          bVar3 = pcVar11[2];
          if (((bVar3 - 0x30 & 0xff) < 10) ||
             (uVar22 = bVar3 - 0x41,
             uVar22 < 0x26 && (1L << ((ulong)uVar22 & 0x3f) & 0x3f0000003fU) != 0)) {
            bVar4 = (byte)(bVar2 + 0xbf) < 0x1a;
            if ((!bVar4 && 0x18 < (byte)(bVar3 + 0xbf)) && (bVar4 || (byte)(bVar3 + 0xbf) != 0x19))
            {
              pcVar11 = pcVar11 + 1;
            }
            else {
              cVar5 = func_0x0077e6e4((int)(char)bVar2);
              pcVar11[1] = cVar5;
              cVar5 = func_0x0077e6e4((long)pcVar11[2]);
              pcVar11[2] = cVar5;
              pcVar11 = pcVar11 + 3;
            }
          }
          else {
            pcVar11 = pcVar11 + 1;
          }
        }
        else {
          pcVar11 = pcVar11 + 1;
        }
      }
      if (*pcVar11 == '\0') break;
      pcVar11 = pcVar11 + 1;
    }
  }
  else {
    bVar2 = *param_3;
    if (bVar2 != 0) {
      uVar14 = uStack0000000000000014;
      do {
        uVar15 = (uint)bVar2;
        uVar1 = uVar22 ^ 1;
        if (uVar15 != 0x20) {
          uVar1 = 1;
        }
        if (uVar1 == 0) {
          iVar6 = func_0x0074075c(&uStack0000000000000040,"+",1);
          if (iVar6 != 0) {
            return 7;
          }
        }
        else {
          if ((9 < uVar15 - 0x30) && (0x19 < (uVar15 & 0xdf) - 0x41)) {
            if (uVar15 < 0x5f) {
              if (1 < uVar15 - 0x2d) {
                if (uVar15 != 0x2f) goto LAB_0078a6a4;
                if (!bVar4) goto LAB_0078a6d8;
              }
            }
            else if ((uVar15 != 0x5f) && (uVar15 != 0x7e)) {
LAB_0078a6a4:
              if ((uVar15 != 0x3d) || ((uVar14 & 1) == 0)) {
LAB_0078a6d8:
                uStack0000000000000020._1_1_ = "0123456789abcdef"[bVar2 >> 4];
                uStack0000000000000020._0_1_ = 0x25;
                uStack0000000000000020._2_1_ = "0123456789abcdef"[(ulong)bVar2 & 0xf];
                iVar6 = func_0x0074075c(&uStack0000000000000040,&uStack0000000000000020,3);
                if (iVar6 == 0) goto LAB_0078a640;
                goto LAB_0078a72c;
              }
            }
          }
          uVar1 = uVar14;
          if ((uVar14 & 1) != 0) {
            uVar1 = 0;
          }
          if (uVar15 != 0x3d) {
            uVar1 = uVar14;
          }
          iVar6 = func_0x0074075c(&uStack0000000000000040,param_3,1);
          uVar14 = uVar1;
          if (iVar6 != 0) goto LAB_0078a72c;
        }
LAB_0078a640:
        param_3 = param_3 + 1;
        bVar2 = *param_3;
      } while (bVar2 != 0);
    }
  }
  lVar12 = func_0x00740a58(&uStack0000000000000040);
  if ((uStack0000000000000014 == 0) || (lVar12 == 0)) {
    if ((param_2 == 5) &&
       ((lVar20 = func_0x00156654(&uStack0000000000000040), (uVar19 >> 10 & 1) == 0 || (lVar20 != 0)
        ))) {
      if (lVar20 == 0) {
code_r0x0078a9e4:
        func_0x00740678(&uStack0000000000000040);
        return 0x15;
      }
      if (uVar16 == 0) {
        uStack0000000000000018 = 0;
        iVar6 = func_0x00742734(lVar12,lVar20,&uStack0000000000000018,&uStack0000000000000020,3);
        if ((iVar6 != 0) ||
           (iVar6 = func_0x0078b6d8(param_1,uStack0000000000000018,
                                    CONCAT53(uStack0000000000000020._3_5_,
                                             CONCAT12(uStack0000000000000020._2_1_,
                                                      CONCAT11(uStack0000000000000020._1_1_,
                                                               (undefined1)uStack0000000000000020)))
                                   ), iVar6 != 0)) {
          (*pcRam0000000000a2b5f0)(uStack0000000000000018);
          goto code_r0x0078a9e4;
        }
        (*pcRam0000000000a2b5f0)(uStack0000000000000018);
      }
      else {
        iVar6 = func_0x0078b6d8(param_1,lVar12,lVar20);
        if (iVar6 != 0) goto code_r0x0078a9e4;
      }
    }
  }
  else {
    lVar20 = param_1[8];
    if ((lVar20 != 0) && (lVar13 = _strlen(lVar20), lVar13 != 0)) {
      cVar5 = *(char *)(lVar13 + lVar20 + -1);
      func_0x0074066c(&uStack0000000000000020,&UNK_007a1200);
      iVar6 = func_0x0074075c(&uStack0000000000000020,param_1[8],lVar13);
      if ((iVar6 == 0) &&
         (((cVar5 == '&' || (iVar6 = func_0x0074075c(&uStack0000000000000020,"&",1), iVar6 == 0)) &&
          (iVar6 = func_0x007408a0(&uStack0000000000000020,lVar12), iVar6 == 0)))) {
        func_0x00740678(&uStack0000000000000040);
        (*pcRam0000000000a2b5f0)(*plVar21);
        lVar12 = func_0x00740a58(&uStack0000000000000020);
        *plVar21 = lVar12;
        return 0;
      }
      func_0x00740678(&uStack0000000000000040);
      return 7;
    }
  }
  (*pcRam0000000000a2b5f0)(*plVar21);
  *plVar21 = lVar12;
  return 0;
}

