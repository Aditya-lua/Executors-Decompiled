/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e569c
 */

/* WARNING: Removing unreachable block (ram,0x009e5724) */

undefined8 ssl_choose_client_version(int *param_1,int param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  int *piVar7;
  undefined8 uVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int *piVar14;
  int *piVar15;
  
  iVar2 = *param_1;
  *param_1 = param_2;
  uVar6 = tls_parse_extension(param_1,0x11,0x300,param_3,0,0);
  if ((int)uVar6 == 0) {
    *param_1 = iVar2;
    return uVar6;
  }
  if ((param_1[0x23a] != 0) && (*param_1 != 0x304)) {
    *param_1 = iVar2;
    ERR_new();
    uVar6 = 0x77d;
LAB_009e58d8:
    ERR_set_debug("ssl/statem/statem_lib.c",uVar6,"ssl_choose_client_version");
    uVar6 = 0x46;
    uVar8 = 0x10a;
    goto LAB_009e59c4;
  }
  iVar9 = **(int **)(param_1 + 2);
  if (iVar9 == 0x1ffff) {
    piVar14 = &DAT_00c58828;
    iVar9 = 0xfefd;
  }
  else {
    if (iVar9 != 0x10000) {
      if (*param_1 == iVar9) {
        return 1;
      }
      *param_1 = iVar2;
      ERR_new();
      uVar6 = 0x785;
      goto LAB_009e58d8;
    }
    piVar14 = &DAT_00c58798;
    iVar9 = 0x304;
  }
  iVar12 = 0;
  iVar10 = 0;
  iVar13 = 0;
  bVar4 = true;
  piVar15 = piVar14;
  iVar11 = 0;
  do {
    while (*(code **)(piVar15 + 2) == (code *)0x0) {
      iVar13 = 0;
      bVar4 = true;
      iVar5 = piVar15[6];
joined_r0x009e57d8:
      piVar15 = piVar15 + 6;
      if (iVar5 == 0) goto LAB_009e57fc;
    }
    piVar7 = (int *)(**(code **)(piVar15 + 2))();
    if ((bVar4) && (iVar13 == 0)) {
      iVar13 = *piVar15;
    }
    iVar5 = FUN_009e4f38(param_1,piVar7);
    if (iVar5 != 0) {
      bVar4 = true;
      iVar5 = piVar15[6];
      goto joined_r0x009e57d8;
    }
    if (!bVar4) {
      iVar12 = *piVar7;
      iVar5 = piVar15[6];
      goto joined_r0x009e57d8;
    }
    iVar12 = *piVar7;
    bVar4 = false;
    if (iVar13 != 0) {
      iVar10 = iVar13;
    }
    piVar15 = piVar15 + 6;
    iVar11 = iVar12;
  } while (*piVar15 != 0);
LAB_009e57fc:
  if (iVar11 == 0) {
    *param_1 = iVar2;
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x79b,"ssl_choose_client_version");
    uVar6 = 0x46;
    uVar8 = 0xbf;
    goto LAB_009e59c4;
  }
  uVar3 = *(uint *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60);
  iVar13 = *param_1;
  if ((uVar3 >> 3 & 1) == 0) {
    if (iVar13 < iVar12) goto LAB_009e5904;
    if (iVar13 <= iVar11) goto LAB_009e5828;
LAB_009e5934:
    *param_1 = iVar2;
    ERR_new();
    uVar6 = 0x7a6;
  }
  else {
    iVar5 = 0xff00;
    if (iVar13 != 0x100) {
      iVar5 = iVar13;
    }
    iVar1 = 0xff00;
    if (iVar12 != 0x100) {
      iVar1 = iVar12;
    }
    if (iVar5 <= iVar1) {
      iVar12 = 0xff00;
      if (iVar11 != 0x100) {
        iVar12 = iVar11;
      }
      if (iVar5 < iVar12) goto LAB_009e5934;
LAB_009e5828:
      if ((*(byte *)(param_1 + 0x27c) & 0x80) != 0) {
        iVar11 = iVar10;
      }
      if ((iVar13 == 0x303) && (0x303 < iVar11)) {
        if (*(long *)(param_1 + 0x56) != 0x14452474e574f44) {
LAB_009e5980:
          do {
            if ((iVar13 == iVar9) && (*(code **)(piVar14 + 2) != (code *)0x0)) {
              uVar6 = (**(code **)(piVar14 + 2))();
              *(undefined8 *)(param_1 + 2) = uVar6;
              return 1;
            }
            iVar9 = piVar14[6];
            piVar14 = piVar14 + 6;
          } while (iVar9 != 0);
          *param_1 = iVar2;
          ERR_new();
          uVar6 = 1999;
          goto LAB_009e59b8;
        }
        *param_1 = iVar2;
        ERR_new();
        uVar6 = 0x7b5;
      }
      else {
        if (((uVar3 >> 3 & 1) != 0) ||
           (((0x302 < iVar13 || (iVar11 <= iVar13)) ||
            (*(char (*) [8])(param_1 + 0x56) != (char  [8])0x4452474e574f44)))) goto LAB_009e5980;
        *param_1 = iVar2;
        ERR_new();
        uVar6 = 0x7c1;
      }
      ERR_set_debug("ssl/statem/statem_lib.c",uVar6,"ssl_choose_client_version");
      uVar6 = 0x2f;
      uVar8 = 0x175;
      goto LAB_009e59c4;
    }
LAB_009e5904:
    *param_1 = iVar2;
    ERR_new();
    uVar6 = 0x7a1;
  }
LAB_009e59b8:
  ERR_set_debug("ssl/statem/statem_lib.c",uVar6,"ssl_choose_client_version");
  uVar6 = 0x46;
  uVar8 = 0x102;
LAB_009e59c4:
  ossl_statem_fatal(param_1,uVar6,uVar8,0);
  return 0;
}

