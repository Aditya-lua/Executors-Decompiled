/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ba74
 */

undefined8 BN_GF2m_mod(undefined8 param_1,undefined8 param_2,long *param_3)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  int iVar7;
  ulong uVar8;
  ulong uVar9;
  int local_48 [6];
  
  iVar2 = BN_is_zero(param_3);
  if (iVar2 != 0) goto LAB_00a2baa0;
  iVar2 = (int)param_3[1];
  if (iVar2 < 1) {
    iVar4 = 0;
LAB_00a2bb60:
    local_48[iVar4] = -1;
    iVar4 = iVar4 + 1;
  }
  else {
    lVar6 = *param_3;
    iVar4 = 0;
    iVar7 = iVar2 << 6;
    lVar5 = (long)iVar2;
    do {
      uVar8 = *(ulong *)(lVar6 + (lVar5 + -1) * 8);
      if (uVar8 != 0) {
        uVar9 = 0x8000000000000000;
        iVar2 = -1;
        do {
          if ((uVar9 & uVar8) != 0) {
            if (iVar4 < 6) {
              local_48[iVar4] = iVar7 + iVar2;
            }
            iVar4 = iVar4 + 1;
          }
          iVar2 = iVar2 + -1;
          uVar9 = uVar9 >> 1;
        } while (iVar2 != -0x41);
      }
      iVar7 = iVar7 + -0x40;
      bVar1 = 1 < lVar5;
      lVar5 = lVar5 + -1;
    } while (bVar1);
    if (iVar4 < 6) goto LAB_00a2bb60;
  }
  if ((iVar4 != 0) && (iVar4 < 7)) {
    uVar3 = BN_GF2m_mod_arr(param_1,param_2,local_48);
    return uVar3;
  }
LAB_00a2baa0:
  ERR_new();
  ERR_set_debug("crypto/bn/bn_gf2m.c",0x18e,"BN_GF2m_mod");
  ERR_set_error(3,0x6a,0);
  return 0;
}

