/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00943e74
 */

undefined8 FUN_00943e74(long param_1,long param_2,ulong param_3)

{
  long lVar1;
  char cVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  bool bVar12;
  
  lVar10 = *(long *)(param_1 + 0x20);
  uVar6 = *(ulong *)(lVar10 + 0x4d0);
  if (param_3 == 0) {
    uVar5 = 0;
  }
  else {
    uVar11 = 0;
    uVar5 = 0;
    bVar12 = false;
    do {
      cVar2 = *(char *)(param_2 + uVar11);
      if (cVar2 == '\n') {
        if ((uVar6 != 4) && (uVar7 = 0, uVar6 != 1)) goto LAB_00943f68;
        uVar7 = uVar6 + 1;
LAB_00943f80:
        *(ulong *)(lVar10 + 0x4d0) = uVar7;
        if (uVar7 <= uVar6) {
LAB_00943f8c:
          lVar8 = *(long *)(lVar10 + 0x4d8);
          lVar9 = 0;
          do {
            if (lVar8 + lVar9 == 0) {
              lVar9 = uVar6 + lVar9;
              if ((!bVar12) || (lVar9 = lVar9 + -1, lVar9 != 0)) {
                uVar4 = FUN_00934dd0(param_1,1,&DAT_002d30ba,lVar9);
                bVar12 = false;
                iVar3 = (int)uVar4;
                goto joined_r0x00943fe0;
              }
              bVar12 = false;
              uVar5 = uVar11;
              break;
            }
            lVar1 = lVar8 + lVar9;
            lVar9 = lVar9 + -1;
            *(long *)(lVar10 + 0x4d8) = lVar1 + -1;
          } while (uVar6 + lVar9 != 0);
        }
      }
      else {
        if (cVar2 == '.') {
          if (uVar6 == 2) {
            uVar7 = 3;
          }
          else {
            uVar7 = 0;
            if (uVar6 != 3) goto LAB_00943f68;
            uVar7 = 0;
            bVar12 = true;
          }
          goto LAB_00943f80;
        }
        uVar7 = 0;
        if (cVar2 != '\r') {
LAB_00943f68:
          *(ulong *)(lVar10 + 0x4d0) = uVar7;
          if ((uVar6 == 0) || (uVar6 < uVar7)) goto LAB_00943fe4;
          goto LAB_00943f8c;
        }
        if (uVar6 == 3) {
          uVar7 = 4;
          goto LAB_00943f80;
        }
        if (uVar6 != 0) {
          uVar7 = 1;
          goto LAB_00943f68;
        }
        *(undefined8 *)(lVar10 + 0x4d0) = 1;
        if (uVar11 != 0) {
          uVar4 = FUN_00934dd0(param_1,1,param_2 + uVar5,uVar11 - uVar5);
          iVar3 = (int)uVar4;
joined_r0x00943fe0:
          uVar5 = uVar11;
          if (iVar3 != 0) {
            return uVar4;
          }
        }
      }
LAB_00943fe4:
      uVar6 = *(ulong *)(lVar10 + 0x4d0);
      uVar11 = uVar11 + 1;
    } while (uVar11 < param_3);
  }
  if (uVar6 == 0) {
    if (param_3 - uVar5 != 0) {
      uVar4 = FUN_00934dd0(param_1,1,param_2 + uVar5,param_3 - uVar5);
      return uVar4;
    }
    uVar4 = 0;
  }
  else {
    uVar4 = 0;
    if (uVar6 == 5) {
      uVar4 = FUN_00934dd0(param_1,1,&DAT_002d30ba,2);
      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xfffffffe;
      *(undefined8 *)(lVar10 + 0x4d0) = 0;
    }
  }
  return uVar4;
}

