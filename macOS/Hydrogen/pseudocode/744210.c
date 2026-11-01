
undefined8 FUN_00744210(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  long unaff_x23;
  long *unaff_x24;
  
  do {
    lVar4 = unaff_x23;
    if (unaff_x24[9] != 0) {
      lVar2 = func_0x00760008();
      if (lVar2 != 0) {
        lVar4 = unaff_x24[1];
        if ((lVar4 == 0) || (unaff_x24[2] == 0)) {
          uVar3 = func_0x00760198(lVar2,lVar4);
LAB_00744294:
          if ((int)uVar3 != 0) goto LAB_007444e0;
          lVar4 = func_0x0075ff64();
          if (lVar4 != 0) {
            uVar3 = func_0x00760000(lVar2,lVar4);
            goto LAB_007442b8;
          }
        }
        else {
          lVar4 = func_0x0077e93c(lVar4);
          if (lVar4 != 0) {
            uVar3 = func_0x00760198(lVar2,lVar4);
            (*pcRam0000000000a2b5f0)(lVar4);
            goto LAB_00744294;
          }
        }
LAB_007444d4:
        uVar3 = 0x1b;
        goto LAB_007444e0;
      }
      uVar3 = 0x1b;
LAB_007442b8:
      if ((int)uVar3 != 0) goto LAB_007444e0;
    }
    plVar7 = unaff_x24;
    do {
      lVar2 = func_0x00760008(lVar4);
      if (lVar2 == 0) {
        uVar3 = 0x1b;
        break;
      }
      uVar3 = func_0x007600a8(lVar2,plVar7[8],0);
      if (((int)uVar3 != 0) ||
         ((plVar7[7] != 0 && (uVar3 = func_0x00760120(lVar2), (int)uVar3 != 0)))) goto LAB_007444e0;
      if (unaff_x24[9] == 0) {
        lVar5 = unaff_x24[1];
        if ((lVar5 == 0) || (unaff_x24[2] == 0)) {
          uVar3 = func_0x00760198(lVar2,lVar5);
        }
        else {
          lVar5 = func_0x0077e93c(lVar5);
          if (lVar5 == 0) goto LAB_007444d4;
          uVar3 = func_0x00760198(lVar2,lVar5);
          (*pcRam0000000000a2b5f0)(lVar5);
        }
        if ((int)uVar3 != 0) goto LAB_007444e0;
      }
      uVar6 = unaff_x24[10];
      lVar5 = 0x20;
      if ((uVar6 & 0x80) != 0) {
        lVar5 = 0x68;
      }
      if ((uVar6 & 3) == 0) {
        if (((uint)uVar6 >> 4 & 1) == 0) {
          lVar5 = *(long *)((long)unaff_x24 + lVar5);
          if (lVar5 == 0) {
            lVar5 = -1;
          }
          if (((uint)uVar6 >> 6 & 1) == 0) {
            uVar3 = func_0x0075fc1c(lVar2,unaff_x24[3]);
            iVar1 = (int)uVar3;
          }
          else {
            uVar3 = func_0x0075febc(lVar2,lVar5);
            iVar1 = (int)uVar3;
          }
        }
        else {
          lVar5 = unaff_x24[6];
          if (lVar5 == 0) {
            lVar5 = -1;
          }
          uVar3 = func_0x0075fc1c(lVar2,unaff_x24[5],lVar5);
          iVar1 = (int)uVar3;
        }
joined_r0x00744478:
        if (iVar1 != 0) goto LAB_007444e0;
      }
      else {
        lVar5 = plVar7[3];
        iVar1 = _strcmp(lVar5,"-");
        if (iVar1 == 0) {
          uVar3 = func_0x0075febc(lVar2,0xffffffffffffffff,PTR__fread_009b0218,&DAT_007445ac,0,
                                  *(undefined8 *)PTR____stdinp_009b01f8);
          iVar1 = (int)uVar3;
        }
        else {
          uVar3 = func_0x0075fd34(lVar2,lVar5);
          iVar1 = (int)uVar3;
        }
        if (iVar1 != 0) goto LAB_007444e0;
        if ((*(byte *)(unaff_x24 + 10) >> 1 & 1) != 0) {
          uVar3 = func_0x00760210(lVar2,0);
          iVar1 = (int)uVar3;
          goto joined_r0x00744478;
        }
      }
      if ((unaff_x24[0xb] == 0) ||
         ((unaff_x24[9] == 0 && ((*(byte *)(unaff_x24 + 10) & 0x51) == 0)))) {
        uVar3 = 0;
      }
      else {
        uVar3 = func_0x00760210(lVar2);
        if ((int)uVar3 != 0) break;
      }
      plVar7 = (long *)plVar7[9];
    } while (plVar7 != (long *)0x0);
  } while (((int)uVar3 == 0) && (unaff_x24 = (long *)*unaff_x24, unaff_x24 != (long *)0x0));
  if ((int)uVar3 != 0) {
LAB_007444e0:
    func_0x0075f60c();
  }
  return uVar3;
}

