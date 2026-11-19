/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096de88
 */

int FUN_0096de88(undefined8 *param_1,void *param_2,long param_3,long param_4,int param_5,
                long param_6,long param_7,code *param_8,undefined8 param_9,new_session_cb *param_10,
                void *param_11)

{
  ulong uVar1;
  undefined8 uVar2;
  byte bVar3;
  byte bVar4;
  long lVar5;
  int iVar6;
  uint uVar7;
  long lVar8;
  long lVar9;
  SSL_METHOD *meth;
  SSL_CTX *pSVar10;
  ulong uVar11;
  SSL *ssl;
  undefined8 uVar12;
  char *pcVar13;
  char *pcVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  SSL_SESSION *local_178;
  char local_170 [256];
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  local_178 = (SSL_SESSION *)0x0;
  lVar8 = FUN_009685c0(param_2);
  lVar9 = FUN_009685e4(param_2,param_3);
  bVar3 = *(byte *)(lVar8 + 0x78);
  lVar17 = *(long *)(lVar9 + 0x18);
  lVar19 = *(long *)(lVar9 + 0x40);
  lVar20 = *(long *)(lVar9 + 0x98);
  bVar4 = *(byte *)(lVar8 + 0x79);
  if ((*(long *)(param_3 + 0xc0) == 0) ||
     ((*(byte *)(*(long *)(param_3 + 0xc0) + 0x231) >> 3 & 1) == 0)) {
    iVar6 = RAND_status();
    if (iVar6 != 0) {
      lVar16 = *(long *)(param_3 + 0xc0);
      if (lVar16 != 0) {
        *(byte *)(lVar16 + 0x231) = *(byte *)(lVar16 + 0x231) | 8;
      }
      goto LAB_0096df38;
    }
    pcVar13 = "Insufficient randomness";
LAB_0096e228:
    FUN_00904b80(param_3,pcVar13);
  }
  else {
LAB_0096df38:
    *(undefined8 *)(lVar9 + 0x80) = 1;
    uVar7 = (uint)bVar3;
    if (param_5 != 5) {
      if (param_5 == 3) {
        if (bVar3 < 8) {
          if ((1 << (ulong)(uVar7 & 0x1f) & 0xf3U) == 0) {
            if (uVar7 == 2) {
              pcVar13 = "No SSLv2 support";
            }
            else {
              pcVar13 = "No SSLv3 support";
            }
            FUN_00904b80(param_3,pcVar13);
            iVar6 = 4;
            goto LAB_0096e234;
          }
          meth = (SSL_METHOD *)TLS_client_method();
          goto LAB_0096df98;
        }
LAB_0096e15c:
        pcVar13 = "Unrecognized parameter passed via CURLOPT_SSLVERSION";
        goto LAB_0096e228;
      }
      FUN_00904b80(param_3,"unsupported transport %d in SSL init");
      goto LAB_0096e230;
    }
    if ((*(int *)(lVar8 + 0x74) != 0) && (*(int *)(lVar8 + 0x74) != 0x70000)) {
      pcVar13 = "QUIC needs at least TLS version 1.3";
      goto LAB_0096e228;
    }
    meth = (SSL_METHOD *)TLS_method();
LAB_0096df98:
    pSVar10 = SSL_CTX_new(meth);
    *param_1 = pSVar10;
    if (pSVar10 == (SSL_CTX *)0x0) {
      pcVar13 = local_170;
      uVar11 = ERR_peek_error();
      local_170[0] = '\0';
      uVar12 = OpenSSL_version(6);
      uVar18 = 0x100;
      uVar7 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar12);
      if (uVar7 < 0xfe) {
        lVar8 = (long)(int)uVar7;
        (pcVar13 + lVar8)[0] = ':';
        (pcVar13 + lVar8)[1] = ' ';
        pcVar13 = local_170 + lVar8 + 2;
        *pcVar13 = '\0';
        uVar18 = 0xfe - lVar8;
      }
      ERR_error_string_n(uVar11,pcVar13,uVar18);
      if (*pcVar13 == '\0') {
        uVar1 = 8;
        if (uVar11 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < uVar18) {
          pcVar14 = "No error";
          if (uVar11 != 0) {
            pcVar14 = "Unknown error";
          }
          strcpy(pcVar13,pcVar14);
        }
      }
      FUN_00904b80(param_3,"SSL: could not create a context: %s",pcVar13);
      iVar6 = 0x1b;
      goto LAB_0096e234;
    }
    if ((param_8 != (code *)0x0) && (iVar6 = (*param_8)(param_2,param_3,param_9), iVar6 != 0))
    goto LAB_0096e234;
    if ((*(long *)(param_3 + 600) != 0) && ((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0)) {
      SSL_CTX_set_msg_callback((SSL_CTX *)*param_1,(cb *)&LAB_0096e770);
      SSL_CTX_ctrl((SSL_CTX *)*param_1,0x10,0,param_2);
    }
    if (7 < uVar7) goto LAB_0096e15c;
    if ((1 << (ulong)(uVar7 & 0x1f) & 0xf3U) == 0) {
      iVar6 = 4;
      goto LAB_0096e234;
    }
    pSVar10 = (SSL_CTX *)*param_1;
    bVar3 = *(byte *)(lVar9 + 0xc0);
    lVar16 = FUN_009685c0(param_2);
    lVar15 = 0x301;
    switch(*(undefined1 *)(lVar16 + 0x78)) {
    case 0:
      goto switchD_0096e050_caseD_0;
    case 1:
    case 4:
      break;
    default:
      lVar15 = 0;
      break;
    case 5:
      lVar15 = 0x302;
      break;
    case 6:
      lVar15 = 0x303;
      break;
    case 7:
      lVar15 = 0x304;
    }
    lVar15 = SSL_CTX_ctrl(pSVar10,0x7b,lVar15,(void *)0x0);
    if (lVar15 != 0) {
switchD_0096e050_caseD_0:
      uVar11 = (ulong)(*(uint *)(lVar16 + 0x74) >> 0x10);
      uVar18 = (ulong)*(uint *)(lVar16 + 0x74) << 0x30;
      lVar16 = (uVar11 | uVar18) + 0x2fd;
      if ((uVar11 & 0xffff00000000fffc | uVar18) != 4) {
        lVar16 = 0;
      }
      lVar16 = SSL_CTX_ctrl(pSVar10,0x7c,lVar16,(void *)0x0);
      if (lVar16 != 0) {
        SSL_CTX_set_options(*param_1,(((ulong)bVar3 & 4) >> 2) << 0xb | 0x82024050);
        if (((param_6 != 0) && (param_7 != 0)) &&
           (iVar6 = SSL_CTX_set_alpn_protos(*param_1,param_6), iVar6 != 0)) {
          pcVar13 = "Error setting ALPN";
          goto LAB_0096e228;
        }
        if ((((lVar17 != 0) || (lVar19 != 0)) || (lVar20 != 0)) &&
           (iVar6 = FUN_0096c1b4(param_3,*param_1,lVar17,lVar19,lVar20,*(undefined8 *)(lVar9 + 0xa0)
                                 ,*(undefined8 *)(lVar9 + 0xa8),*(undefined8 *)(lVar9 + 0xb0),
                                 *(undefined8 *)(lVar9 + 0xb8)), iVar6 == 0)) {
          iVar6 = 0x3a;
          goto LAB_0096e234;
        }
        pcVar13 = *(char **)(lVar8 + 0x20);
        if (pcVar13 == (char *)0x0) {
LAB_0096e2e8:
          pcVar13 = *(char **)(lVar8 + 0x28);
          if (pcVar13 != (char *)0x0) {
            iVar6 = SSL_CTX_set_ciphersuites(*param_1,pcVar13);
            if (iVar6 == 0) {
              pcVar14 = "failed setting TLS 1.3 cipher suite: %s";
              goto LAB_0096e628;
            }
            if (((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_3 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_3 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_3,"TLS 1.3 cipher selection: %s",pcVar13);
            }
          }
          SSL_CTX_set_post_handshake_auth(*param_1,1);
          pcVar13 = *(char **)(lVar8 + 0x68);
          if ((pcVar13 == (char *)0x0) ||
             (lVar17 = SSL_CTX_ctrl((SSL_CTX *)*param_1,0x5c,0,pcVar13), lVar17 != 0)) {
            if ((*(long *)(lVar9 + 0x58) != 0) &&
               (uVar11 = FUN_0096795c(param_3), (uVar11 & 1) != 0)) {
              uVar12 = *(undefined8 *)(lVar9 + 0x58);
              uVar2 = *(undefined8 *)(lVar9 + 0x60);
              if (((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_3 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_3 + 0x12a0) + 8))))) {
                FUN_00904c98(param_3,"Using TLS-SRP username: %s",uVar12);
              }
              iVar6 = SSL_CTX_set_srp_username(*param_1,uVar12);
              if (iVar6 == 0) {
                pcVar13 = "Unable to set SRP username";
              }
              else {
                iVar6 = SSL_CTX_set_srp_password(*param_1,uVar2);
                if (iVar6 != 0) {
                  if (*(long *)(lVar8 + 0x20) == 0) {
                    if (((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0) &&
                       ((*(long *)(param_3 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_3 + 0x12a0) + 8))))) {
                      FUN_00904c98(param_3,"Setting cipher list SRP");
                    }
                    iVar6 = SSL_CTX_set_cipher_list((SSL_CTX *)*param_1,"SRP");
                    if (iVar6 == 0) {
                      FUN_00904b80(param_3,"failed setting SRP cipher list");
                      iVar6 = 0x3b;
                      goto LAB_0096e234;
                    }
                  }
                  goto LAB_0096e410;
                }
                pcVar13 = "failed setting SRP password";
              }
              FUN_00904b80(param_3,pcVar13);
              iVar6 = 0x2b;
              goto LAB_0096e234;
            }
LAB_0096e410:
            SSL_CTX_set_verify((SSL_CTX *)*param_1,bVar4 & 1,(callback *)0x0);
            uVar11 = FUN_009719a0();
            if ((uVar11 & 1) != 0) {
              SSL_CTX_set_keylog_callback(*param_1,&LAB_0096eb40);
            }
            if (param_10 != (new_session_cb *)0x0) {
              SSL_CTX_ctrl((SSL_CTX *)*param_1,0x2c,0x301,(void *)0x0);
              SSL_CTX_sess_set_new_cb((SSL_CTX *)*param_1,param_10);
            }
            if (*(long *)(param_3 + 0x5b8) != 0) {
              if ((*(byte *)((long)param_1 + 0x25) & 1) == 0) {
                iVar6 = FUN_0096d7b0(param_2,param_3,*param_1);
                if (iVar6 != 0) goto LAB_0096e234;
                *(byte *)((long)param_1 + 0x25) = *(byte *)((long)param_1 + 0x25) | 1;
              }
              FUN_0092f198(param_3,1);
              iVar6 = (**(code **)(param_3 + 0x5b8))
                                (param_3,*param_1,*(undefined8 *)(param_3 + 0x5c0));
              FUN_0092f198(param_3,0);
              if (iVar6 != 0) {
                FUN_00904b80(param_3,"error signaled by ssl ctx callback");
                goto LAB_0096e234;
              }
            }
            if ((SSL *)param_1[1] != (SSL *)0x0) {
              SSL_free((SSL *)param_1[1]);
            }
            ssl = SSL_new((SSL_CTX *)*param_1);
            param_1[1] = ssl;
            if (ssl == (SSL *)0x0) {
              FUN_00904b80(param_3,"SSL: could not create a context (handle)");
              iVar6 = 0x1b;
              goto LAB_0096e234;
            }
            SSL_set_ex_data(ssl,0,param_11);
            if ((*(byte *)(lVar8 + 0x79) >> 2 & 1) != 0) {
              SSL_ctrl((SSL *)param_1[1],0x41,1,(void *)0x0);
            }
            SSL_set_connect_state((SSL *)param_1[1]);
            param_1[2] = 0;
            if ((*(void **)(param_4 + 0x10) == (void *)0x0) ||
               (lVar8 = SSL_ctrl((SSL *)param_1[1],0x37,0,*(void **)(param_4 + 0x10)), lVar8 != 0))
            {
              *(byte *)((long)param_1 + 0x25) = *(byte *)((long)param_1 + 0x25) & 0xfd;
              if (param_5 == 3) {
                iVar6 = 0;
                if ((*(byte *)(lVar9 + 0x79) >> 3 & 1) == 0) goto LAB_0096e234;
                FUN_00968398(param_3);
                uVar11 = FUN_009683d4(param_2,param_3,param_4,&local_178,0);
                if ((uVar11 & 1) == 0) {
                  iVar6 = SSL_set_session((SSL *)param_1[1],local_178);
                  if (iVar6 == 0) {
                    pcVar13 = local_170;
                    FUN_009683b8(param_3);
                    uVar11 = ERR_get_error();
                    local_170[0] = '\0';
                    uVar12 = OpenSSL_version(6);
                    uVar18 = 0x100;
                    uVar7 = curl_msnprintf(local_170,0x100,"%s/%s","OpenSSL",uVar12);
                    if (uVar7 < 0xfe) {
                      lVar8 = (long)(int)uVar7;
                      (pcVar13 + lVar8)[0] = ':';
                      (pcVar13 + lVar8)[1] = ' ';
                      pcVar13 = local_170 + lVar8 + 2;
                      *pcVar13 = '\0';
                      uVar18 = 0xfe - lVar8;
                    }
                    ERR_error_string_n(uVar11,pcVar13,uVar18);
                    if (*pcVar13 == '\0') {
                      uVar1 = 8;
                      if (uVar11 != 0) {
                        uVar1 = 0xd;
                      }
                      if (uVar1 < uVar18) {
                        pcVar14 = "No error";
                        if (uVar11 != 0) {
                          pcVar14 = "Unknown error";
                        }
                        strcpy(pcVar13,pcVar14);
                      }
                    }
                    FUN_00904b80(param_3,"SSL: SSL_set_session failed: %s",pcVar13);
                    goto LAB_0096e230;
                  }
                  if (((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0) &&
                     ((*(long *)(param_3 + 0x12a0) == 0 ||
                      (0 < *(int *)(*(long *)(param_3 + 0x12a0) + 8))))) {
                    FUN_00904c98(param_3,"SSL reusing session ID");
                  }
                  *(byte *)((long)param_1 + 0x25) = *(byte *)((long)param_1 + 0x25) | 2;
                }
                FUN_009683b8(param_3);
              }
              iVar6 = 0;
              goto LAB_0096e234;
            }
            pcVar13 = "Failed set SNI";
            goto LAB_0096e228;
          }
          pcVar14 = "failed setting curves list: \'%s\'";
        }
        else {
          iVar6 = SSL_CTX_set_cipher_list((SSL_CTX *)*param_1,pcVar13);
          if (iVar6 != 0) {
            if (((*(byte *)(param_3 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_3 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_3 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_3,"Cipher selection: %s",pcVar13);
            }
            goto LAB_0096e2e8;
          }
          pcVar14 = "failed setting cipher list: %s";
        }
LAB_0096e628:
        FUN_00904b80(param_3,pcVar14,pcVar13);
        iVar6 = 0x3b;
        goto LAB_0096e234;
      }
    }
  }
LAB_0096e230:
  iVar6 = 0x23;
LAB_0096e234:
  if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

