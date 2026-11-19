/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970c2c
 */

int FUN_00970c2c(long param_1,long param_2,ulong param_3,undefined1 *param_4)

{
  uint uVar1;
  ulong uVar2;
  char *pcVar3;
  undefined4 uVar4;
  long lVar5;
  undefined4 uVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  uint uVar10;
  long lVar11;
  char *pcVar12;
  char *pcVar13;
  SSL_CIPHER *c;
  char *pcVar14;
  BIO_METHOD *type;
  BIO *pBVar15;
  undefined4 *puVar16;
  ulong e;
  undefined8 uVar17;
  int *piVar18;
  long lVar19;
  undefined4 uVar20;
  long lVar21;
  undefined8 *puVar22;
  ulong len;
  long lVar23;
  long lVar24;
  undefined8 *puVar25;
  undefined4 local_1d4;
  int local_1d0 [20];
  undefined8 local_180;
  char acStack_178 [24];
  undefined8 local_160;
  
  lVar5 = tpidr_el0;
  lVar21 = *(long *)(lVar5 + 0x28);
  lVar23 = *(long *)(param_1 + 0x10);
  uVar6 = FUN_00907c74();
  if (*(int *)(lVar23 + 0x50) == 2) {
    iVar7 = 0;
    *param_4 = 1;
    goto LAB_009710fc;
  }
  if (*(int *)(lVar23 + 0x54) == 0) {
    lVar11 = FUN_009086d4(param_2,0,1);
    if (lVar11 < 0) {
LAB_00970f10:
      FUN_00904b80(param_2,"SSL connection timeout");
      iVar7 = 0x1c;
      goto LAB_009710fc;
    }
    lVar24 = *(long *)(param_1 + 0x10);
    lVar11 = *(long *)(lVar24 + 0x30);
    local_160 = 0;
    acStack_178[0] = '\0';
    acStack_178[1] = '\0';
    acStack_178[2] = '\0';
    acStack_178[3] = '\0';
    acStack_178[4] = '\0';
    acStack_178[5] = '\0';
    acStack_178[6] = '\0';
    acStack_178[7] = '\0';
    local_180 = 0;
    acStack_178[0x10] = '\0';
    acStack_178[0x11] = '\0';
    acStack_178[0x12] = '\0';
    acStack_178[0x13] = '\0';
    acStack_178[0x14] = '\0';
    acStack_178[0x15] = '\0';
    acStack_178[0x16] = '\0';
    acStack_178[0x17] = '\0';
    acStack_178[8] = '\0';
    acStack_178[9] = '\0';
    acStack_178[10] = '\0';
    acStack_178[0xb] = '\0';
    acStack_178[0xc] = '\0';
    acStack_178[0xd] = '\0';
    acStack_178[0xe] = '\0';
    acStack_178[0xf] = '\0';
    if (*(long *)(lVar24 + 0x28) == 0) {
      lVar19 = 0;
    }
    else {
      iVar7 = FUN_0096a95c(&local_180);
      if (iVar7 != 0) {
        FUN_00904b80(param_2,"Error determining ALPN");
LAB_009710f0:
        iVar7 = 0x23;
        goto LAB_009710fc;
      }
      lVar19 = (long)local_160._4_4_;
    }
    iVar7 = FUN_0096de88(lVar11,param_1,param_2,lVar24,3,&local_180,lVar19,0,0,FUN_00971368,param_1)
    ;
    if (iVar7 != 0) goto LAB_009710fc;
    type = (BIO_METHOD *)BIO_meth_new(0x401,"OpenSSL CF BIO");
    if (type == (BIO_METHOD *)0x0) {
      *(undefined8 *)(lVar11 + 0x18) = 0;
      iVar7 = 0x1b;
      goto LAB_009710fc;
    }
    BIO_meth_set_write(type,&LAB_00971404);
    BIO_meth_set_read(type,&LAB_0097153c);
    BIO_meth_set_ctrl(type,&LAB_009716d0);
    BIO_meth_set_create(type,&LAB_00971768);
    BIO_meth_set_destroy(type,&LAB_009717a8);
    *(BIO_METHOD **)(lVar11 + 0x18) = type;
    pBVar15 = BIO_new(type);
    if (pBVar15 == (BIO *)0x0) {
      iVar7 = 0x1b;
      goto LAB_009710fc;
    }
    BIO_set_data(pBVar15,param_1);
    BIO_up_ref(pBVar15);
    SSL_set0_rbio(*(undefined8 *)(lVar11 + 8),pBVar15);
    SSL_set0_wbio(*(undefined8 *)(lVar11 + 8),pBVar15);
    if ((((*(long *)(lVar24 + 0x28) != 0) && (FUN_0096aa20(&local_180), param_2 != 0)) &&
        ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
      FUN_00904c98(param_2,"ALPN: curl offers %s",&local_180);
    }
    *(undefined4 *)(lVar24 + 0x54) = 1;
  }
LAB_00970cac:
  do {
    do {
      iVar8 = *(int *)(lVar23 + 0x54);
      if (iVar8 != 1) {
        if (iVar8 == 2) {
          lVar11 = *(long *)(param_1 + 0x10);
          iVar7 = FUN_0096eb48(param_1,param_2,*(undefined8 *)(lVar11 + 0x30),lVar11);
          if (iVar7 != 0) goto LAB_009710fc;
          *(undefined4 *)(lVar11 + 0x54) = 3;
          iVar8 = *(int *)(lVar23 + 0x54);
        }
        if (iVar8 == 3) {
          *(undefined4 *)(lVar23 + 0x50) = 2;
        }
        iVar7 = 0;
        *param_4 = iVar8 == 3;
        *(undefined4 *)(lVar23 + 0x54) = 0;
        goto LAB_009710fc;
      }
      lVar11 = FUN_009086d4(param_2,0,1);
      if (lVar11 < 0) goto LAB_00970f10;
      if (((param_3 & 1) == 0) && (uVar9 = *(uint *)(lVar23 + 0x58), uVar9 != 0)) {
        uVar20 = uVar6;
        if ((uVar9 & 2) == 0) {
          uVar20 = 0xffffffff;
        }
        uVar4 = uVar6;
        if ((uVar9 & 1) == 0) {
          uVar4 = 0xffffffff;
        }
        iVar7 = FUN_0093456c(uVar4,0xffffffff,uVar20,lVar11);
        if (iVar7 < 0) {
          puVar16 = (undefined4 *)__errno();
          FUN_00904b80(param_2,"select/poll on SSL socket, errno: %d",*puVar16);
          goto LAB_009710f0;
        }
        if (iVar7 == 0) goto LAB_00970f10;
      }
      puVar22 = *(undefined8 **)(param_1 + 0x10);
      puVar25 = (undefined8 *)puVar22[6];
      lVar11 = FUN_009685e4(param_1,param_2);
      *(undefined4 *)(puVar22 + 0xb) = 0;
      ERR_clear_error();
      iVar8 = SSL_connect((SSL *)puVar25[1]);
      if ((*(byte *)((long)puVar25 + 0x25) & 1) == 0) {
        iVar7 = FUN_0096d7b0(param_1,param_2,*puVar25);
        if (iVar7 != 0) goto LAB_009710fc;
        *(byte *)((long)puVar25 + 0x25) = *(byte *)((long)puVar25 + 0x25) | 1;
      }
      if (iVar8 == 1) {
        local_1d0[0] = 0;
        *(undefined4 *)((long)puVar22 + 0x54) = 2;
        SSL_get_peer_signature_type_nid(puVar25[1],local_1d0);
        lVar11 = SSL_ctrl((SSL *)puVar25[1],0x86,0,(void *)0x0);
        pcVar12 = OBJ_nid2sn((uint)lVar11 & 0xffff);
        if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
        {
          pcVar13 = SSL_get_version((SSL *)puVar25[1]);
          c = SSL_get_current_cipher((SSL *)puVar25[1]);
          pcVar14 = SSL_CIPHER_get_name(c);
          pcVar3 = "[blank]";
          if (pcVar12 != (char *)0x0) {
            pcVar3 = pcVar12;
          }
          pcVar12 = OBJ_nid2sn(local_1d0[0]);
          FUN_00904c98(param_2,"SSL connection using %s / %s / %s / %s",pcVar13,pcVar14,pcVar3,
                       pcVar12);
        }
        if (puVar22[5] != 0) {
          SSL_get0_alpn_selected(puVar25[1],&local_180,&local_1d4);
          iVar7 = FUN_0096ab00(param_1,param_2,local_180,local_1d4);
          if (iVar7 != 0) goto LAB_009710fc;
        }
      }
      else {
        uVar9 = SSL_get_error((SSL *)puVar25[1],iVar8);
        switch(uVar9) {
        case 2:
          uVar20 = 1;
          break;
        case 3:
          uVar20 = 2;
          break;
        default:
          if (*(int *)(puVar25 + 4) == 0x51) goto joined_r0x00970e98;
          memset(&local_180,0,0x100);
          *(undefined4 *)((long)puVar22 + 0x54) = 1;
          e = ERR_get_error();
          uVar1 = ((int)(uint)e >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)e;
          if (((e & 0xff800000) == 0xa000000) && ((uVar1 == 0x415 || (uVar1 == 0x86)))) {
            lVar23 = SSL_get_verify_result((SSL *)puVar25[1]);
            if (lVar23 == 0) {
              local_160 = CONCAT44(local_160._4_4_,0x64656c);
              builtin_strncpy(acStack_178,"ificate verification fai",0x18);
              local_180._0_1_ = 'S';
              local_180._1_1_ = 'S';
              local_180._2_1_ = 'L';
              local_180._3_1_ = ' ';
              local_180._4_1_ = 'c';
              local_180._5_1_ = 'e';
              local_180._6_1_ = 'r';
              local_180._7_1_ = 't';
            }
            else {
              *(long *)(lVar11 + 0x80) = lVar23;
              pcVar12 = X509_verify_cert_error_string(lVar23);
              curl_msnprintf(&local_180,0x100,"SSL certificate problem: %s",pcVar12);
            }
            iVar7 = 0x3c;
          }
          else {
            pcVar12 = (char *)&local_180;
            local_180 = local_180 & 0xffffffffffffff00;
            uVar17 = OpenSSL_version(6);
            len = 0x100;
            uVar10 = curl_msnprintf(&local_180,0x100,"%s/%s","OpenSSL",uVar17);
            if (uVar10 < 0xfe) {
              lVar23 = (long)(int)uVar10;
              (pcVar12 + lVar23)[0] = ':';
              (pcVar12 + lVar23)[1] = ' ';
              pcVar12 = (char *)((long)local_1d0 + lVar23 + 0x52);
              *pcVar12 = '\0';
              len = 0xfe - lVar23;
            }
            ERR_error_string_n(e,pcVar12,len);
            if (*pcVar12 == '\0') {
              uVar2 = 8;
              if (e != 0) {
                uVar2 = 0xd;
              }
              if (uVar2 < len) {
                pcVar3 = "No error";
                if (e != 0) {
                  pcVar3 = "Unknown error";
                }
                strcpy(pcVar12,pcVar3);
              }
            }
            iVar7 = 0x62;
            if ((e & 0xff800000) != 0xa000000 || uVar1 != 0x45c) {
              iVar7 = 0x23;
            }
            if (e == 0) {
              memset(local_1d0,0,0x50);
              piVar18 = (int *)__errno();
              if ((uVar9 == 5) && (*piVar18 != 0)) {
                FUN_00941a94(*piVar18,local_1d0,0x50);
                pcVar12 = "SSL_ERROR_SYSCALL";
                if ((char)local_1d0[0] != '\0') {
                  pcVar12 = (char *)local_1d0;
                }
              }
              else if (uVar9 < 0xb) {
                pcVar12 = (&PTR_s_SSL_ERROR_NONE_00c51700)[(int)uVar9];
              }
              else {
                pcVar12 = "SSL_ERROR unknown";
              }
              FUN_00904b80(param_2,"OpenSSL SSL_connect: %s in connection to %s:%d ",pcVar12,
                           *puVar22,*(undefined4 *)((long)puVar22 + 0x1c));
              goto LAB_009710f0;
            }
          }
          FUN_00904b80(param_2,&DAT_002b6c62,&local_180);
          goto LAB_009710fc;
        case 9:
        case 0xc:
          *(undefined4 *)((long)puVar22 + 0x54) = 1;
          if ((param_3 & 1) != 0) goto LAB_00970eb0;
          goto LAB_00970cac;
        }
        *(undefined4 *)(puVar22 + 0xb) = uVar20;
      }
joined_r0x00970e98:
    } while ((param_3 & 1) == 0);
LAB_00970eb0:
  } while (*(int *)(lVar23 + 0x54) != 1);
  iVar7 = 0;
LAB_009710fc:
  if (*(long *)(lVar5 + 0x28) != lVar21) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
}

