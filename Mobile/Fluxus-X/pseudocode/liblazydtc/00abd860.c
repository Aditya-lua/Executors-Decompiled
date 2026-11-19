/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd860
 */

ulong asn1_d2i_read_bio(BIO *param_1,undefined8 *param_2)

{
  ulong uVar1;
  uchar *puVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  BUF_MEM *str;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  int iVar12;
  ulong uVar13;
  int iStack_78;
  int local_74;
  ulong local_70;
  uchar *local_68;
  
  str = BUF_MEM_new();
  if (str == (BUF_MEM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_d2i_fp.c",0x7e,"asn1_d2i_read_bio");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    uVar4 = ERR_set_mark();
    iVar12 = 0;
    uVar8 = 0;
    uVar13 = 0;
LAB_00abd8e4:
    do {
      uVar9 = uVar13 - uVar8;
      if (uVar9 < 9) {
        uVar11 = 8 - uVar9;
        if (!CARRY8(uVar11,uVar13)) {
          iVar5 = BUF_MEM_grow_clean(str,uVar11 + uVar13);
          uVar4 = 0;
          if (iVar5 != 0) {
            iVar5 = BIO_read(param_1,str->data + uVar13,(int)uVar11);
            if ((uVar9 != 0) || (-1 < iVar5)) {
              if (0 < iVar5) {
                bVar3 = CARRY8(uVar13,(long)iVar5);
                uVar13 = uVar13 + (long)iVar5;
                if (bVar3) {
                  ERR_new();
                  uVar7 = 0x93;
                  goto LAB_00abdbb4;
                }
                uVar9 = uVar13 - uVar8;
              }
              local_68 = (uchar *)(str->data + uVar8);
              if (uVar9 != 0) goto LAB_00abd958;
              goto LAB_00abdac4;
            }
            ERR_new();
            uVar7 = 0x8e;
LAB_00abdab0:
            ERR_set_debug("crypto/asn1/a_d2i_fp.c",uVar7,"asn1_d2i_read_bio");
            uVar7 = 0x8e;
            goto LAB_00abdabc;
          }
        }
        ERR_new(uVar4);
        uVar7 = 0x89;
LAB_00abdb2c:
        ERR_set_debug("crypto/asn1/a_d2i_fp.c",uVar7,"asn1_d2i_read_bio");
        uVar7 = 0xc0100;
        goto LAB_00abdabc;
      }
      local_68 = (uchar *)(str->data + uVar8);
LAB_00abd958:
      puVar2 = local_68;
      uVar6 = ASN1_get_object(&local_68,(long *)&local_70,&local_74,&iStack_78,uVar9);
      uVar4 = uVar6;
      if ((uVar6 >> 7 & 1) != 0) {
        uVar9 = ERR_peek_last_error();
        if ((((int)(uint)uVar9 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar9) != 0x9b)
        goto LAB_00abdac4;
        uVar4 = ERR_pop_to_mark();
      }
      uVar8 = uVar8 + (long)((int)local_68 - (int)puVar2);
      if ((uVar6 & 1) != 0) {
        if (iVar12 == -1) {
          ERR_new(uVar4);
          ERR_set_debug("crypto/asn1/a_d2i_fp.c",0xaf,"asn1_d2i_read_bio");
          uVar7 = 0x7b;
          goto LAB_00abdabc;
        }
        iVar12 = iVar12 + 1;
        goto LAB_00abd8e4;
      }
      if (((iVar12 != 0) && (local_70 == 0)) && (local_74 == 0)) {
        iVar12 = iVar12 + -1;
        if (iVar12 == 0) break;
        goto LAB_00abd8e4;
      }
      uVar9 = local_70 - (uVar13 - uVar8);
      if (uVar13 - uVar8 <= local_70 && uVar9 != 0) {
        if ((uVar9 >> 0x1f != 0) || (CARRY8(uVar9,uVar13))) {
          ERR_new(uVar4);
          uVar7 = 0xc4;
          goto LAB_00abdbb4;
        }
        if (uVar9 != 0) {
          uVar11 = 0x4000;
          do {
            uVar1 = uVar11;
            if (uVar9 <= uVar11) {
              uVar1 = uVar9;
            }
            uVar4 = BUF_MEM_grow_clean(str,uVar1 + uVar13);
            if (uVar4 == 0) {
              ERR_new();
              uVar7 = 0xd1;
              goto LAB_00abdb2c;
            }
            if (uVar1 != 0) {
              uVar10 = uVar1;
              do {
                uVar4 = BIO_read(param_1,str->data + uVar13,(int)uVar10);
                if ((int)uVar4 < 1) {
                  ERR_new();
                  uVar7 = 0xd8;
                  goto LAB_00abdab0;
                }
                uVar10 = uVar10 - (long)(int)uVar4;
                uVar13 = uVar13 + (long)(int)uVar4;
              } while (uVar10 != 0);
            }
            uVar9 = uVar9 - uVar1;
            uVar11 = uVar11 << (uVar11 < 0x3fffffff);
          } while (uVar9 != 0);
        }
      }
      bVar3 = CARRY8(local_70,uVar8);
      uVar8 = local_70 + uVar8;
      if (bVar3) {
        ERR_new(uVar4);
        uVar7 = 0xe7;
        goto LAB_00abdbb4;
      }
    } while (iVar12 != 0);
    if (uVar8 >> 0x1f == 0) {
      *param_2 = str;
      goto LAB_00abdad4;
    }
    ERR_new(uVar4);
    uVar7 = 0xf3;
LAB_00abdbb4:
    ERR_set_debug("crypto/asn1/a_d2i_fp.c",uVar7,"asn1_d2i_read_bio");
    uVar7 = 0x9b;
LAB_00abdabc:
    ERR_set_error(0xd,uVar7,0);
LAB_00abdac4:
    ERR_clear_last_mark();
    BUF_MEM_free(str);
  }
  uVar8 = 0xffffffff;
LAB_00abdad4:
  return uVar8 & 0xffffffff;
}

