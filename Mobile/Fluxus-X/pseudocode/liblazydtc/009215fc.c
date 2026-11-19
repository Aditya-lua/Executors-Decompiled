/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009215fc
 */

undefined8
curl_easy_header(long param_1,long param_2,ulong param_3,uint param_4,int param_5,long *param_6)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  uint uVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  
  uVar4 = 6;
  if ((((-2 < param_5) && (param_4 - 1 < 0x1f)) && (param_1 != 0)) &&
     ((param_2 != 0 && (param_6 != (long *)0x0)))) {
    puVar1 = (undefined8 *)(param_1 + 0x1208);
    lVar5 = FUN_00925eb0(puVar1);
    if (lVar5 == 0) {
      uVar4 = 3;
    }
    else if (*(int *)(param_1 + 0xcd0) < param_5) {
      uVar4 = 4;
    }
    else {
      plVar8 = (long *)*puVar1;
      iVar2 = *(int *)(param_1 + 0xcd0);
      if (param_5 != -1) {
        iVar2 = param_5;
      }
      if (plVar8 != (long *)0x0) {
        lVar5 = 0;
        uVar10 = 0;
        plVar11 = (long *)0x0;
        do {
          lVar7 = *plVar8;
          iVar3 = curl_strequal(*(undefined8 *)(lVar7 + 0x18),param_2);
          if (((iVar3 != 0) && ((*(byte *)(lVar7 + 0x2c) & param_4) != 0)) &&
             (*(int *)(lVar7 + 0x28) == iVar2)) {
            uVar10 = uVar10 + 1;
            lVar5 = lVar7;
            plVar11 = plVar8;
          }
          plVar8 = (long *)plVar8[2];
        } while (plVar8 != (long *)0x0);
        if (uVar10 != 0) {
          if (uVar10 <= param_3) {
            return 1;
          }
          if (uVar10 - 1 == param_3) {
            uVar6 = (uint)*(byte *)(lVar5 + 0x2c);
LAB_00921704:
            uVar4 = *(undefined8 *)(lVar5 + 0x18);
            *(undefined8 *)(param_1 + 0x1230) = *(undefined8 *)(lVar5 + 0x20);
            *(undefined8 *)(param_1 + 0x1228) = uVar4;
            *(ulong *)(param_1 + 0x1238) = uVar10;
            *(ulong *)(param_1 + 0x1240) = param_3;
            *(uint *)(param_1 + 0x1248) = uVar6 | 0x8000000;
            *(long **)(param_1 + 0x1250) = plVar11;
            *param_6 = param_1 + 0x1228;
            return 0;
          }
          plVar11 = (long *)*puVar1;
          if (plVar11 != (long *)0x0) {
            uVar9 = 0;
            do {
              lVar5 = *plVar11;
              iVar3 = curl_strequal(*(undefined8 *)(lVar5 + 0x18),param_2);
              if (((iVar3 != 0) && (uVar6 = (uint)*(byte *)(lVar5 + 0x2c), (uVar6 & param_4) != 0))
                 && (*(int *)(lVar5 + 0x28) == iVar2)) {
                if (uVar9 == param_3) goto LAB_00921704;
                uVar9 = uVar9 + 1;
              }
              plVar11 = (long *)plVar11[2];
              if (plVar11 == (long *)0x0) {
                return 2;
              }
            } while( true );
          }
        }
      }
      uVar4 = 2;
    }
  }
  return uVar4;
}

