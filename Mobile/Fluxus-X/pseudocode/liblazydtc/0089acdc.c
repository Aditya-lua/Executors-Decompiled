/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089acdc
 */

byte FUN_0089acdc(long *param_1,long param_2)

{
  int iVar1;
  int iVar2;
  byte bVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  
  iVar2 = DAT_00d1b100;
  iVar1 = *(int *)(param_2 + 8);
  if (iVar1 == DAT_00d1b0f0 && param_2 != 0) {
    if (*(long *)(param_2 + 0x28) == 0) {
      bVar3 = 0;
    }
    else {
      uVar4 = 0;
      do {
        bVar3 = FUN_0089acdc(param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar4 * 8));
        if ((bVar3 & 1) != 0) break;
        uVar4 = uVar4 + 1;
      } while (uVar4 < *(ulong *)(param_2 + 0x28));
    }
    goto LAB_0089aea4;
  }
  bVar3 = 1;
  if (((iVar1 == DAT_00d1b150) || (iVar1 == DAT_00d1b130)) || (iVar1 == DAT_00d1b140))
  goto LAB_0089aea4;
  if (iVar1 == DAT_00d1b100) {
    uVar4 = *(ulong *)(param_2 + 0x20);
    if (param_1[5] != 0) {
      uVar6 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
      uVar6 = (uVar4 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
      uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 6) & 0x3f);
      if ((*(ulong *)(param_1[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
        do {
          puVar7 = (ulong *)(*param_1 + uVar6 * 0x30);
          if (*puVar7 == uVar4) {
            if ((1 < (uint)puVar7[1]) && (((uint)puVar7[1] != 2 || ((char)puVar7[2] != '\0')))) {
              lVar5 = *(long *)(param_2 + 0x28);
              goto LAB_0089ae90;
            }
            break;
          }
          uVar6 = uVar6 + 1 & param_1[4] - 1U;
        } while ((*(ulong *)(param_1[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
      }
    }
    uVar4 = FUN_0088d0f4(param_1);
    lVar5 = *(long *)(param_2 + 0x30);
    if ((uVar4 & 1) == 0) {
      if ((lVar5 != 0) &&
         (uVar4 = FUN_0089acdc(param_1,*(undefined8 *)(param_2 + 0x28)), (uVar4 & 1) != 0)) {
        lVar5 = *(long *)(param_2 + 0x30);
        goto LAB_0089ae90;
      }
    }
    else if (lVar5 != 0) {
LAB_0089ae90:
      bVar3 = FUN_0089acdc(param_1,lVar5);
      goto LAB_0089ae98;
    }
    bVar3 = 0;
  }
LAB_0089ae98:
  bVar3 = iVar1 == iVar2 & bVar3;
LAB_0089aea4:
  return bVar3 & 1;
}

