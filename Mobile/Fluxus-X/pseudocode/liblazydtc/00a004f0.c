/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a004f0
 */

long FUN_00a004f0(BIO *param_1,undefined4 param_2,long param_3,bio_st *param_4)

{
  int iVar1;
  uint uVar2;
  FILE *pFVar3;
  undefined4 *puVar4;
  undefined8 uVar5;
  undefined *puVar6;
  uint uVar7;
  long lVar8;
  char acStack_34 [4];
  
  pFVar3 = (FILE *)param_1->prev_bio;
  uVar7 = (uint)param_3;
  lVar8 = 1;
  switch(param_2) {
  case 1:
switchD_00a00530_caseD_1:
    iVar1 = fseek(pFVar3,param_3,0);
LAB_00a005a4:
    lVar8 = (long)iVar1;
    break;
  case 2:
    iVar1 = feof(pFVar3);
    goto LAB_00a005a4;
  case 3:
switchD_00a00530_caseD_3:
    lVar8 = ftell(pFVar3);
    break;
  case 8:
    lVar8 = (long)*(int *)&param_1->field_0x2c;
    break;
  case 9:
    *(uint *)&param_1->field_0x2c = uVar7;
    lVar8 = 1;
    break;
  case 0xb:
    iVar1 = fflush(pFVar3);
    if (iVar1 != -1) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bss_file.c",0x146,"file_ctrl");
    puVar4 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar4,"calling fflush()");
    ERR_new();
    uVar5 = 0x148;
LAB_00a00748:
    ERR_set_debug("crypto/bio/bss_file.c",uVar5,"file_ctrl");
    uVar5 = 0x80002;
LAB_00a00758:
    ERR_set_error(0x20,uVar5,0);
  case 4:
  case 5:
  case 6:
  case 7:
  case 10:
switchD_00a00530_caseD_4:
    lVar8 = 0;
    break;
  case 0xc:
    break;
  default:
    switch(param_2) {
    case 0x6a:
      if (*(int *)&param_1->field_0x2c != 0) {
        if ((param_1->num != 0) && (pFVar3 != (FILE *)0x0)) {
          fclose(pFVar3);
          param_1->prev_bio = (bio_st *)0x0;
          *(undefined4 *)&param_1->ptr = 0;
        }
        param_1->num = 0;
      }
      param_1->num = 1;
      *(uint *)&param_1->field_0x2c = uVar7 & 1;
      param_1->prev_bio = param_4;
      return 1;
    case 0x6b:
      if (param_4 == (bio_st *)0x0) {
        return 1;
      }
      param_4->method = (BIO_METHOD *)pFVar3;
      return 1;
    case 0x6c:
      if (*(int *)&param_1->field_0x2c != 0) {
        if ((param_1->num != 0) && (pFVar3 != (FILE *)0x0)) {
          uVar2 = fclose(pFVar3);
          pFVar3 = (FILE *)(ulong)uVar2;
          param_1->prev_bio = (bio_st *)0x0;
          *(undefined4 *)&param_1->ptr = 0;
        }
        param_1->num = 0;
      }
      *(uint *)&param_1->field_0x2c = uVar7 & 1;
      if ((uVar7 >> 3 & 1) != 0) {
        if ((uVar7 >> 1 & 1) == 0) {
          puVar6 = &DAT_002a374f;
        }
        else {
          puVar6 = &DAT_002c2ec2;
        }
LAB_00a006bc:
        OPENSSL_strlcpy(acStack_34,puVar6,4);
        pFVar3 = openssl_fopen((char *)param_4,acStack_34);
        if (pFVar3 != (FILE *)0x0) {
          param_1->prev_bio = (bio_st *)pFVar3;
          param_1->num = 1;
          BIO_clear_flags(param_1,0);
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/bio/bss_file.c",0x129,"file_ctrl");
        puVar4 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar4,"calling fopen(%s, %s)",param_4,acStack_34);
        ERR_new();
        uVar5 = 300;
        goto LAB_00a00748;
      }
      if (((uVar7 >> 2 & 1) != 0) && ((uVar7 >> 1 & 1) != 0)) {
        puVar6 = &DAT_0029df83;
        goto LAB_00a006bc;
      }
      if ((uVar7 >> 2 & 1) != 0) {
        puVar6 = &DAT_002d2ecc;
        goto LAB_00a006bc;
      }
      if ((uVar7 >> 1 & 1) != 0) {
        puVar6 = &DAT_002c8cc8;
        goto LAB_00a006bc;
      }
      ERR_new(pFVar3);
      ERR_set_debug("crypto/bio/bss_file.c",0x11a,"file_ctrl");
      uVar5 = 0x65;
      goto LAB_00a00758;
    default:
      goto switchD_00a00530_caseD_4;
    case 0x80:
      goto switchD_00a00530_caseD_1;
    case 0x85:
      goto switchD_00a00530_caseD_3;
    }
  }
  return lVar8;
}

