/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4f6c
 */

long FUN_009c4f6c(long param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  int local_98 [14];
  
  if (*(long *)(param_1 + 0x1db0) == 0) {
    uVar9 = 0;
    lVar8 = 0;
    uVar7 = 0;
  }
  else {
    uVar9 = 0;
    iVar3 = -1;
    do {
      lVar8 = *(long *)(*(long *)(param_1 + 0x1da8) + uVar9 * 8);
      iVar2 = *(int *)(lVar8 + 0xc);
      if (((((iVar2 != 0x40) && (iVar2 != 0x2a3)) && (*(int *)(lVar8 + 0x14) != 6)) &&
          (*(int *)(lVar8 + 0x14) != 0x74)) &&
         ((iVar2 == 0 ||
          (lVar5 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar8 + 0x10)),
          lVar5 != 0)))) {
        if (param_3 == 0) {
          uVar1 = *(uint *)(lVar8 + 0x18);
          if (((uVar1 < 9) &&
              (*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar1 * 0x28 + 0x20) != 0)) &&
             ((*(long *)(*(long *)(param_1 + 0x898) + (long)(int)uVar1 * 0x28 + 0x28) != 0 &&
              (iVar2 = FUN_009c6514(param_1,lVar8), iVar2 != 0)))) {
            lVar5 = *(long *)(*(long *)(param_1 + 0x898) + (long)*(int *)(lVar8 + 0x18) * 0x28 +
                             0x28);
            goto LAB_009c5098;
          }
        }
        else {
          lVar5 = ssl_cert_lookup_by_pkey(param_3,local_98);
          if (((lVar5 != 0) && (*(int *)(lVar8 + 0x18) == local_98[0])) &&
             (iVar2 = FUN_009c6514(param_1,lVar8,param_2,param_3), lVar5 = param_3, iVar2 != 0)) {
LAB_009c5098:
            if (*(int *)(lVar8 + 0x14) == 0x390) {
              if (((lVar5 != 0) && (*(int *)(lVar8 + 0xc) != 0)) &&
                 (lVar6 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar8 + 0x10)),
                 lVar6 != 0)) {
                iVar2 = EVP_PKEY_get_size(lVar5);
                iVar4 = EVP_MD_get_size(lVar6);
                if (iVar4 * 2 + 2 <= iVar2) break;
              }
            }
            else {
              if (*(int *)(lVar8 + 0x14) != 0x198) break;
              if (iVar3 == -1) {
                iVar3 = EVP_PKEY_get_group_name(lVar5,local_98,0x32,0);
                if (iVar3 < 1) {
                  iVar3 = 0;
                  goto LAB_009c5134;
                }
                iVar3 = OBJ_txt2nid((char *)local_98);
                iVar2 = *(int *)(lVar8 + 0x20);
              }
              else {
LAB_009c5134:
                iVar2 = *(int *)(lVar8 + 0x20);
              }
              if ((iVar2 == 0) || (iVar3 == iVar2)) break;
            }
          }
        }
      }
      uVar9 = uVar9 + 1;
    } while (uVar9 < *(ulong *)(param_1 + 0x1db0));
    uVar7 = *(ulong *)(param_1 + 0x1db0);
  }
  lVar5 = 0;
  if (uVar9 != uVar7) {
    lVar5 = lVar8;
  }
  return lVar5;
}

