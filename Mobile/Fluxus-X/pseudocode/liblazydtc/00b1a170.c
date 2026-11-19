/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1a170
 */

ulong FUN_00b1a170(BIO *param_1,undefined4 *param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  uint uVar4;
  int iVar5;
  undefined4 *puVar6;
  time_t tVar7;
  BIO *pBVar8;
  long lVar9;
  undefined8 uVar10;
  code *UNRECOVERED_JUMPTABLE;
  ulong uVar11;
  
  UNRECOVERED_JUMPTABLE = *(code **)(param_2 + 0xc);
  uVar11 = 0xffffffff;
  pBVar8 = param_1;
  do {
    switch(*param_2) {
    case 1:
      if ((*(long *)(param_2 + 2) == 0) && (*(long *)(param_2 + 4) == 0)) {
        ERR_new(pBVar8);
        ERR_set_debug("crypto/bio/bss_conn.c",0x5a,"conn_state");
        ERR_set_error(0x20,0x90,"hostname=%s service=%s",*(undefined8 *)(param_2 + 2),
                      *(undefined8 *)(param_2 + 4));
        goto joined_r0x00b1a420;
      }
      *param_2 = 2;
      break;
    case 2:
      iVar5 = param_2[1];
      if (iVar5 == 0x100) {
        uVar10 = 0;
LAB_00b1a3c8:
        pBVar8 = (BIO *)BIO_lookup(*(undefined8 *)(param_2 + 2),*(undefined8 *)(param_2 + 4),0,
                                   uVar10,1,param_2 + 8);
        if ((int)pBVar8 == 0) goto joined_r0x00b1a420;
        lVar9 = *(long *)(param_2 + 8);
        if (lVar9 != 0) {
          *(long *)(param_2 + 10) = lVar9;
          goto LAB_00b1a3ec;
        }
        ERR_new();
        ERR_set_debug("crypto/bio/bss_conn.c",0x84,"conn_state");
        uVar10 = 0x8e;
      }
      else {
        if (iVar5 == 6) {
          uVar10 = 10;
          goto LAB_00b1a3c8;
        }
        if (iVar5 == 4) {
          uVar10 = 2;
          goto LAB_00b1a3c8;
        }
        ERR_new(pBVar8);
        ERR_set_debug("crypto/bio/bss_conn.c",0x7b,"conn_state");
        uVar10 = 0x92;
      }
      ERR_set_error(0x20,uVar10,0);
      goto joined_r0x00b1a420;
    case 3:
      uVar1 = BIO_ADDRINFO_family(*(undefined8 *)(param_2 + 10));
      uVar2 = BIO_ADDRINFO_socktype(*(undefined8 *)(param_2 + 10));
      uVar3 = BIO_ADDRINFO_protocol(*(undefined8 *)(param_2 + 10));
      pBVar8 = (BIO *)BIO_socket(uVar1,uVar2,uVar3,0);
      if ((int)pBVar8 == -1) {
        ERR_new();
        ERR_set_debug("crypto/bio/bss_conn.c",0x90,"conn_state");
        puVar6 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar6,"calling socket(%s, %s)",*(undefined8 *)(param_2 + 2),
                      *(undefined8 *)(param_2 + 4));
        ERR_new();
        ERR_set_debug("crypto/bio/bss_conn.c",0x93,"conn_state");
        ERR_set_error(0x20,0x76,0);
        uVar11 = 0xffffffff;
        goto joined_r0x00b1a420;
      }
      uVar11 = (ulong)pBVar8 & 0xffffffff;
      *(int *)&param_1->next_bio = (int)pBVar8;
      *param_2 = 4;
      break;
    case 4:
      BIO_clear_flags(param_1,0xf);
      ERR_set_mark();
      uVar1 = *(undefined4 *)&param_1->next_bio;
      uVar10 = BIO_ADDRINFO_address(*(undefined8 *)(param_2 + 10));
      uVar4 = BIO_connect(uVar1,uVar10,param_2[6] | 4);
      *(undefined4 *)((long)&param_1->ptr + 4) = 0;
      if (uVar4 == 0) {
        iVar5 = BIO_sock_should_retry(0);
        if (iVar5 != 0) {
          BIO_set_flags(param_1,0xc);
          *param_2 = 6;
          *(undefined4 *)((long)&param_1->ptr + 4) = 2;
          ERR_pop_to_mark();
          goto LAB_00b1a47c;
        }
        lVar9 = BIO_ADDRINFO_next(*(undefined8 *)(param_2 + 10));
        *(long *)(param_2 + 10) = lVar9;
        if (lVar9 == 0) {
          ERR_clear_last_mark();
          ERR_new();
          ERR_set_debug("crypto/bio/bss_conn.c",0xb1,"conn_state");
          puVar6 = (undefined4 *)__errno();
          pBVar8 = (BIO *)ERR_set_error(2,*puVar6,"calling connect(%s, %s)",
                                        *(undefined8 *)(param_2 + 2),*(undefined8 *)(param_2 + 4));
          uVar11 = 0;
          *param_2 = 7;
        }
        else {
          BIO_closesocket(*(undefined4 *)&param_1->next_bio);
          *param_2 = 3;
          uVar4 = ERR_pop_to_mark();
          pBVar8 = (BIO *)(ulong)uVar4;
          uVar11 = 0;
        }
      }
      else {
        uVar11 = (ulong)uVar4;
        pBVar8 = (BIO *)ERR_clear_last_mark();
LAB_00b1a368:
        *param_2 = 5;
      }
      break;
    case 5:
      uVar11 = 1;
    default:
joined_r0x00b1a420:
joined_r0x00b1a420:
      if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
        return uVar11;
      }
                    /* WARNING: Could not recover jumptable at 0x00b1a44c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar11 = (*UNRECOVERED_JUMPTABLE)(param_1,*param_2,uVar11);
      return uVar11;
    case 6:
      uVar1 = *(undefined4 *)&param_1->next_bio;
      tVar7 = time((time_t *)0x0);
      pBVar8 = (BIO *)BIO_socket_wait(uVar1,0,tVar7);
      if ((int)pBVar8 != 0) {
        uVar4 = BIO_sock_error(*(int *)&param_1->next_bio);
        pBVar8 = (BIO *)(ulong)uVar4;
        if (uVar4 == 0) goto LAB_00b1a368;
        BIO_clear_flags(param_1,0xf);
        lVar9 = BIO_ADDRINFO_next(*(undefined8 *)(param_2 + 10));
        *(long *)(param_2 + 10) = lVar9;
        if (lVar9 == 0) {
          ERR_new();
          ERR_set_debug("crypto/bio/bss_conn.c",0xcd,"conn_state");
          ERR_set_error(2,uVar4,"calling connect(%s, %s)",*(undefined8 *)(param_2 + 2),
                        *(undefined8 *)(param_2 + 4));
          ERR_new();
          ERR_set_debug("crypto/bio/bss_conn.c",0xd0,"conn_state");
          uVar10 = 0x6e;
          goto LAB_00b1a474;
        }
        pBVar8 = (BIO *)BIO_closesocket(*(undefined4 *)&param_1->next_bio);
LAB_00b1a3ec:
        *param_2 = 3;
      }
      break;
    case 7:
      ERR_new(pBVar8);
      ERR_set_debug("crypto/bio/bss_conn.c",0xe2,"conn_state");
      uVar10 = 0x67;
LAB_00b1a474:
      ERR_set_error(0x20,uVar10,0);
LAB_00b1a47c:
      uVar11 = 0;
      goto joined_r0x00b1a420;
    }
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
      pBVar8 = (BIO *)(*UNRECOVERED_JUMPTABLE)(param_1,*param_2,uVar11);
      uVar11 = (ulong)pBVar8 & 0xffffffff;
      if ((int)pBVar8 == 0) {
        return uVar11;
      }
    }
  } while( true );
}

