/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d02c0
 */

undefined8
tls_collect_extensions
          (int *param_1,undefined8 *param_2,uint param_3,undefined8 *param_4,long *param_5,
          int param_6)

{
  long lVar1;
  undefined1 *puVar2;
  uint uVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  bool bVar7;
  int iVar8;
  void *ptr;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined *puVar13;
  long *plVar14;
  bool bVar15;
  long *plVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  undefined8 *puVar20;
  undefined1 *puVar21;
  long local_68;
  
  puVar21 = (undefined1 *)*param_2;
  uVar18 = param_2[1];
  lVar19 = *(long *)(param_1 + 0x226);
  *param_4 = 0;
  if ((param_3 >> 7 & 1) != 0) {
    custom_ext_init(*(long *)(param_1 + 0x226) + 0x1d8);
  }
  lVar1 = *(long *)(lVar19 + 0x1e0) + 0x1a;
  ptr = (void *)CRYPTO_zalloc(lVar1 * 0x28,"ssl/statem/extensions.c",0x245);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions.c",0x247,"tls_collect_extensions");
    ossl_statem_fatal(param_1,0x50,0xc0100,0);
    return 0;
  }
  bVar7 = (param_3 & 0x80) != 0;
  uVar5 = (param_3 >> 7 ^ 0xffffffff) & 2;
  lVar17 = 0;
  if (bVar7) {
    uVar5 = 1;
  }
  while (puVar13 = &DAT_00c581e8, uVar18 != 0) {
    if ((uVar18 == 1) || ((uVar18 & 0xfffffffffffffffe) == 2)) {
LAB_009d07b4:
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x253,"tls_collect_extensions");
      uVar10 = 0x32;
LAB_009d07d4:
      uVar11 = 0x6e;
LAB_009d07d8:
      ossl_statem_fatal(param_1,uVar10,uVar11,0);
      goto LAB_009d07e4;
    }
    uVar4 = (ulong)CONCAT11(puVar21[2],puVar21[3]);
    uVar12 = uVar18 - 4;
    uVar18 = uVar12 - uVar4;
    if (uVar12 < uVar4) goto LAB_009d07b4;
    uVar3 = (uint)CONCAT11(*puVar21,puVar21[1]);
    if (0x3373 < uVar3) {
      if (uVar3 == 0x3374) {
        puVar13 = &UNK_00c583a8;
        lVar9 = 8;
      }
      else if (uVar3 == 65000) {
        puVar13 = &UNK_00c58680;
        lVar9 = 0x15;
      }
      else {
        if (uVar3 != 0xff01) goto switchD_009d0488_caseD_2;
        lVar9 = 0;
      }
      goto LAB_009d05d8;
    }
    switch(uVar3) {
    case 0:
      puVar13 = &UNK_00c58220;
      lVar9 = 1;
      break;
    case 1:
      puVar13 = &UNK_00c58258;
      lVar9 = 2;
      break;
    default:
switchD_009d0488_caseD_2:
      local_68 = 0;
      lVar9 = custom_ext_find(lVar19 + 0x1d8,uVar5,uVar3,&local_68);
      if (lVar9 == 0) {
        plVar14 = (long *)0x0;
        plVar16 = (long *)0x0;
        bVar15 = true;
        goto LAB_009d0700;
      }
      uVar6 = *(uint *)(lVar9 + 8);
      if ((uVar6 & param_3) != 0) {
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
          uVar6 = uVar6 >> 1;
        }
        if ((uVar6 & 1) != 0) goto LAB_009d0790;
        lVar9 = local_68 + 0x1a;
        goto joined_r0x009d06f4;
      }
      goto LAB_009d0790;
    case 5:
      puVar13 = &UNK_00c58370;
      lVar9 = 7;
      break;
    case 10:
      puVar13 = &UNK_00c58300;
      lVar9 = 5;
      break;
    case 0xb:
      puVar13 = &UNK_00c582c8;
      lVar9 = 4;
      break;
    case 0xc:
      puVar13 = &UNK_00c58290;
      lVar9 = 3;
      break;
    case 0xd:
      puVar13 = &UNK_00c58568;
      lVar9 = 0x10;
      break;
    case 0xe:
      puVar13 = &UNK_00c58418;
      lVar9 = 10;
      break;
    case 0x10:
      puVar13 = &UNK_00c583e0;
      lVar9 = 9;
      break;
    case 0x12:
      puVar13 = &UNK_00c58488;
      lVar9 = 0xc;
      break;
    case 0x15:
      puVar13 = &UNK_00c58728;
      lVar9 = 0x18;
      break;
    case 0x16:
      puVar13 = &UNK_00c58450;
      lVar9 = 0xb;
      break;
    case 0x17:
      puVar13 = &UNK_00c584c0;
      lVar9 = 0xd;
      break;
    case 0x23:
      puVar13 = &UNK_00c58338;
      lVar9 = 6;
      break;
    case 0x29:
      puVar13 = &UNK_00c58760;
      lVar9 = 0x19;
      break;
    case 0x2a:
      puVar13 = &UNK_00c586b8;
      lVar9 = 0x16;
      break;
    case 0x2b:
      puVar13 = &UNK_00c585a0;
      lVar9 = 0x11;
      break;
    case 0x2c:
      puVar13 = &UNK_00c58648;
      lVar9 = 0x14;
      break;
    case 0x2d:
      puVar13 = &UNK_00c585d8;
      lVar9 = 0x12;
      break;
    case 0x2f:
      puVar13 = &UNK_00c586f0;
      lVar9 = 0x17;
      break;
    case 0x31:
      puVar13 = &UNK_00c58530;
      lVar9 = 0xf;
      break;
    case 0x32:
      puVar13 = &UNK_00c584f8;
      lVar9 = 0xe;
      break;
    case 0x33:
      puVar13 = &UNK_00c58610;
      lVar9 = 0x13;
    }
LAB_009d05d8:
    uVar6 = *(uint *)(puVar13 + 4);
    if ((uVar6 & param_3) == 0) {
LAB_009d0790:
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x260,"tls_collect_extensions");
      uVar10 = 0x2f;
      goto LAB_009d07d4;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) != 0) {
      if ((uVar6 & 1) == 0) goto joined_r0x009d06f4;
      goto LAB_009d0790;
    }
    if ((uVar6 >> 1 & 1) != 0) goto LAB_009d0790;
joined_r0x009d06f4:
    plVar16 = (long *)((long)ptr + lVar9 * 0x28);
    if (plVar16 == (long *)0x0) {
      bVar15 = true;
      plVar14 = (long *)0x0;
    }
    else {
      if (*(int *)((long)ptr + lVar9 * 0x28 + 0x10) == 1) goto LAB_009d0790;
      bVar15 = false;
      plVar14 = plVar16;
    }
LAB_009d0700:
    if ((uVar3 == 0x29 && bVar7) && (uVar18 != 0)) goto LAB_009d0790;
    if ((((((param_3 & 0x6080) == 0) &&
          (uVar12 = (ulong)(uint)((int)((ulong)((long)plVar16 - (long)ptr) >> 3) * -0x33333333),
          uVar12 < 0x1a)) && (uVar3 != 0x12)) && ((uVar3 != 0x2c && (uVar3 != 0xff01)))) &&
       (((*(byte *)((long)param_1 + uVar12 + 0xa28) >> 1 & 1) == 0 &&
        (((uint)(uVar3 == 65000) & param_3 >> 8) == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x280,"tls_collect_extensions");
      uVar10 = 0x6e;
      uVar11 = 0xd9;
      goto LAB_009d07d8;
    }
    puVar2 = puVar21 + 4;
    puVar21 = puVar2 + uVar4;
    if (!bVar15) {
      *plVar14 = (long)puVar2;
      plVar14[1] = uVar4;
      *(undefined4 *)(plVar14 + 2) = 1;
      *(uint *)(plVar14 + 3) = uVar3;
      plVar14[4] = lVar17;
      lVar17 = lVar17 + 1;
      if (*(code **)(param_1 + 0x292) != (code *)0x0) {
        (**(code **)(param_1 + 0x292))
                  (param_1,param_1[0xe] == 0,uVar3,puVar2,uVar4,*(undefined8 *)(param_1 + 0x294));
      }
    }
  }
  if (param_6 != 0) {
    uVar18 = 0;
    puVar20 = &DAT_00c581f0;
    do {
      if (((code *)*puVar20 != (code *)0x0) &&
         (uVar5 = *(uint *)((long)puVar20 + -4), (uVar5 & param_3) != 0)) {
        uVar3 = *(uint *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60);
        if ((param_3 >> 0xb & 1) == 0) {
          bVar7 = false;
          if ((uVar3 >> 3 & 1) != 0) goto LAB_009d0884;
          iVar8 = **(int **)(param_1 + 2);
          bVar7 = false;
          if (0x303 < iVar8) {
            bVar7 = iVar8 != 0x10000;
          }
        }
        else {
          bVar7 = true;
LAB_009d0884:
          if (((uVar5 >> 2 & 1) != 0) && ((uVar3 >> 3 & 1) != 0)) goto LAB_009d08e8;
        }
        if (((((uVar5 >> 3 & 1) != 0) || (*param_1 != 0x300)) &&
            ((((uVar5 >> 4 & 1) == 0 || (!bVar7)) &&
             (((param_3 >> 7 & 1) != 0 || (((uVar5 >> 5 & 1) == 0 || (bVar7)))))))) &&
           (((((uVar5 >> 5 & 1) == 0 || ((bVar7 || (param_1[0xe] == 0)))) &&
             (((uVar5 >> 6 ^ 0xffffffff) & 1) != 0 || param_1[0x134] == 0)) &&
            (iVar8 = (*(code *)*puVar20)(param_1,param_3), iVar8 == 0)))) {
LAB_009d07e4:
          CRYPTO_free(ptr);
          return 0;
        }
      }
LAB_009d08e8:
      uVar18 = uVar18 + 1;
      puVar20 = puVar20 + 7;
    } while (uVar18 < 0x1a);
  }
  *param_4 = ptr;
  if (param_5 != (long *)0x0) {
    *param_5 = lVar1;
  }
  return 1;
}

