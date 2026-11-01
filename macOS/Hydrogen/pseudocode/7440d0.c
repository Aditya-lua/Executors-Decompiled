
/* WARNING: Possible PIC construction at 0x007440d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007440d4) */
/* WARNING: Removing unreachable block (ram,0x007440dc) */
/* WARNING: Removing unreachable block (ram,0x00744100) */
/* WARNING: Removing unreachable block (ram,0x00744118) */
/* WARNING: Removing unreachable block (ram,0x0074411c) */
/* WARNING: Removing unreachable block (ram,0x00744124) */
/* WARNING: Removing unreachable block (ram,0x00744160) */
/* WARNING: Removing unreachable block (ram,0x00744170) */
/* WARNING: Removing unreachable block (ram,0x0074413c) */
/* WARNING: Removing unreachable block (ram,0x00744158) */
/* WARNING: Removing unreachable block (ram,0x00744174) */
/* WARNING: Removing unreachable block (ram,0x007441b0) */
/* WARNING: Removing unreachable block (ram,0x00744194) */

undefined8 FUN_007440d0(undefined8 param_1,undefined8 param_2,long *param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long *plVar8;
  
  func_0x0075f60c(param_2);
  if (param_3 == (long *)0x0) {
    uVar3 = 0;
  }
  else {
    lVar2 = func_0x0075ff64(param_1);
    if (lVar2 == 0) {
code_r0x007444d4:
      uVar3 = 0x1b;
    }
    else {
      uVar3 = func_0x00760000(param_2,lVar2);
      if ((int)uVar3 == 0) {
        do {
          lVar5 = lVar2;
          if (param_3[9] != 0) {
            lVar4 = func_0x00760008(lVar2);
            if (lVar4 == 0) {
              uVar3 = 0x1b;
            }
            else {
              lVar5 = param_3[1];
              if ((lVar5 == 0) || (param_3[2] == 0)) {
                uVar3 = func_0x00760198(lVar4,lVar5);
              }
              else {
                lVar5 = func_0x0077e93c(lVar5);
                if (lVar5 == 0) goto code_r0x007444d4;
                uVar3 = func_0x00760198(lVar4,lVar5);
                (*pcRam0000000000a2b5f0)(lVar5);
              }
              if ((int)uVar3 != 0) goto code_r0x007444e0;
              lVar5 = func_0x0075ff64(param_1);
              if (lVar5 == 0) goto code_r0x007444d4;
              uVar3 = func_0x00760000(lVar4,lVar5);
            }
            if ((int)uVar3 != 0) goto code_r0x007444e0;
          }
          plVar8 = param_3;
          do {
            lVar4 = func_0x00760008(lVar5);
            if (lVar4 == 0) {
              uVar3 = 0x1b;
              break;
            }
            uVar3 = func_0x007600a8(lVar4,plVar8[8],0);
            if (((int)uVar3 != 0) ||
               ((plVar8[7] != 0 && (uVar3 = func_0x00760120(lVar4), (int)uVar3 != 0))))
            goto code_r0x007444e0;
            if (param_3[9] == 0) {
              lVar6 = param_3[1];
              if ((lVar6 == 0) || (param_3[2] == 0)) {
                uVar3 = func_0x00760198(lVar4,lVar6);
              }
              else {
                lVar6 = func_0x0077e93c(lVar6);
                if (lVar6 == 0) goto code_r0x007444d4;
                uVar3 = func_0x00760198(lVar4,lVar6);
                (*pcRam0000000000a2b5f0)(lVar6);
              }
              if ((int)uVar3 != 0) goto code_r0x007444e0;
            }
            uVar7 = param_3[10];
            lVar6 = 0x20;
            if ((uVar7 & 0x80) != 0) {
              lVar6 = 0x68;
            }
            if ((uVar7 & 3) == 0) {
              if (((uint)uVar7 >> 4 & 1) == 0) {
                lVar6 = *(long *)((long)param_3 + lVar6);
                if (lVar6 == 0) {
                  lVar6 = -1;
                }
                if (((uint)uVar7 >> 6 & 1) == 0) {
                  uVar3 = func_0x0075fc1c(lVar4,param_3[3]);
                  iVar1 = (int)uVar3;
                }
                else {
                  uVar3 = func_0x0075febc(lVar4,lVar6,param_4,0,0,param_3[0xc]);
                  iVar1 = (int)uVar3;
                }
              }
              else {
                lVar6 = param_3[6];
                if (lVar6 == 0) {
                  lVar6 = -1;
                }
                uVar3 = func_0x0075fc1c(lVar4,param_3[5],lVar6);
                iVar1 = (int)uVar3;
              }
joined_r0x00744478:
              if (iVar1 != 0) goto code_r0x007444e0;
            }
            else {
              lVar6 = plVar8[3];
              iVar1 = _strcmp(lVar6,"-");
              if (iVar1 == 0) {
                uVar3 = func_0x0075febc(lVar4,0xffffffffffffffff,PTR__fread_009b0218,&DAT_007445ac,0
                                        ,*(undefined8 *)PTR____stdinp_009b01f8);
                iVar1 = (int)uVar3;
              }
              else {
                uVar3 = func_0x0075fd34(lVar4,lVar6);
                iVar1 = (int)uVar3;
              }
              if (iVar1 != 0) goto code_r0x007444e0;
              if ((*(byte *)(param_3 + 10) >> 1 & 1) != 0) {
                uVar3 = func_0x00760210(lVar4,0);
                iVar1 = (int)uVar3;
                goto joined_r0x00744478;
              }
            }
            if ((param_3[0xb] == 0) ||
               ((param_3[9] == 0 && ((*(byte *)(param_3 + 10) & 0x51) == 0)))) {
              uVar3 = 0;
            }
            else {
              uVar3 = func_0x00760210(lVar4);
              if ((int)uVar3 != 0) break;
            }
            plVar8 = (long *)plVar8[9];
          } while (plVar8 != (long *)0x0);
        } while (((int)uVar3 == 0) && (param_3 = (long *)*param_3, param_3 != (long *)0x0));
        if ((int)uVar3 == 0) {
          return uVar3;
        }
      }
    }
code_r0x007444e0:
    func_0x0075f60c(param_2);
  }
  return uVar3;
}

