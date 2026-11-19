/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2bb90
 */

int BN_GF2m_poly2arr(long *param_1,long param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  
  iVar2 = BN_is_zero();
  iVar3 = 0;
  if (iVar2 == 0) {
    iVar2 = (int)param_1[1];
    if (iVar2 < 1) {
      iVar3 = 0;
      if (param_3 < 1) {
        return 0;
      }
    }
    else {
      lVar5 = *param_1;
      iVar3 = 0;
      iVar6 = iVar2 << 6;
      lVar4 = (long)iVar2;
      do {
        uVar7 = *(ulong *)(lVar5 + (lVar4 + -1) * 8);
        if (uVar7 != 0) {
          uVar8 = 0x8000000000000000;
          iVar2 = -1;
          do {
            if ((uVar8 & uVar7) != 0) {
              if (iVar3 < param_3) {
                *(int *)(param_2 + (long)iVar3 * 4) = iVar6 + iVar2;
              }
              iVar3 = iVar3 + 1;
            }
            iVar2 = iVar2 + -1;
            uVar8 = uVar8 >> 1;
          } while (iVar2 != -0x41);
        }
        iVar6 = iVar6 + -0x40;
        bVar1 = 1 < lVar4;
        lVar4 = lVar4 + -1;
      } while (bVar1);
      if (param_3 <= iVar3) {
        return iVar3;
      }
    }
    *(undefined4 *)(param_2 + (long)iVar3 * 4) = 0xffffffff;
    iVar3 = iVar3 + 1;
  }
  return iVar3;
}

