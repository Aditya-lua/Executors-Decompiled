/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50370
 */

int ENGINE_ctrl(ENGINE *e,int cmd,long i,void *p,f *f)

{
  uint *puVar1;
  int iVar2;
  char *pcVar3;
  size_t sVar4;
  undefined8 uVar5;
  code *UNRECOVERED_JUMPTABLE;
  int *piVar6;
  long lVar7;
  uint uVar8;
  uint *puVar9;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x84,"ENGINE_ctrl");
    uVar5 = 0xc0102;
LAB_00a50468:
    ERR_set_error(0x26,uVar5,0);
    return 0;
  }
  iVar2 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar2 == 0) {
    return 0;
  }
  iVar2 = *(int *)(e + 0x9c);
  CRYPTO_THREAD_unlock(global_engine_lock);
  if (iVar2 < 1) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x8d,"ENGINE_ctrl");
    uVar5 = 0x82;
    goto LAB_00a50468;
  }
  UNRECOVERED_JUMPTABLE = *(code **)(e + 0x70);
  if (7 < cmd - 0xbU) {
    if (cmd == 10) {
      return (uint)(UNRECOVERED_JUMPTABLE != (code *)0x0);
    }
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
LAB_00a504cc:
                    /* WARNING: Could not recover jumptable at 0x00a504f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar2 = (*UNRECOVERED_JUMPTABLE)(e,cmd,i,p,f);
      return iVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0xaf,"ENGINE_ctrl");
    uVar5 = 0x78;
    goto LAB_00a50468;
  }
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0xa2,"ENGINE_ctrl");
    uVar5 = 0x78;
    goto LAB_00a504b0;
  }
  if (((byte)e[0x98] >> 1 & 1) != 0) goto LAB_00a504cc;
  if (cmd == 0xb) {
    piVar6 = *(int **)(e + 0x90);
    if (piVar6 == (int *)0x0) {
      return 0;
    }
    if (*piVar6 == 0) {
      return 0;
    }
    iVar2 = 0;
    if (*(long *)(piVar6 + 2) != 0) {
      iVar2 = *piVar6;
    }
    return iVar2;
  }
  if (((cmd | 2U) == 0xf || cmd == 0x11) && (p == (void *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x52,"int_ctrl_helper");
    uVar5 = 0xc0102;
    goto LAB_00a504b0;
  }
  puVar9 = *(uint **)(e + 0x90);
  if (cmd == 0xd) {
    if (puVar9 != (uint *)0x0) {
      uVar8 = *puVar9;
      while ((uVar8 != 0 && (*(char **)(puVar9 + 2) != (char *)0x0))) {
        iVar2 = strcmp(*(char **)(puVar9 + 2),p);
        if (iVar2 == 0) {
          return *puVar9;
        }
        puVar9 = puVar9 + 8;
        uVar8 = *puVar9;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x5a,"int_ctrl_helper");
    uVar5 = 0x89;
    goto LAB_00a504b0;
  }
  if (puVar9 == (uint *)0x0) {
LAB_00a50640:
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x65,"int_ctrl_helper");
    uVar5 = 0x8a;
LAB_00a504b0:
    ERR_set_error(0x26,uVar5,0);
    return -1;
  }
  uVar8 = *puVar9;
  if (uVar8 == 0) {
    iVar2 = 0;
  }
  else {
    iVar2 = 0;
    puVar1 = puVar9;
    do {
      if (((uint)i <= uVar8) || (*(long *)(puVar1 + 2) == 0)) break;
      uVar8 = puVar1[8];
      iVar2 = iVar2 + 1;
      puVar1 = puVar1 + 8;
    } while (uVar8 != 0);
  }
  if (uVar8 != (uint)i) {
    iVar2 = -1;
  }
  if (iVar2 < 0) goto LAB_00a50640;
  if (6 < cmd - 0xcU) {
switchD_00a50620_caseD_d:
    ERR_new();
    ERR_set_debug("crypto/engine/eng_ctrl.c",0x7c,"int_ctrl_helper");
    uVar5 = 0x6e;
    goto LAB_00a504b0;
  }
  lVar7 = (long)iVar2;
  switch(cmd) {
  case 0xc:
    if (puVar9[lVar7 * 8 + 8] == 0) {
      return 0;
    }
    uVar8 = 0;
    if (*(long *)(puVar9 + lVar7 * 8 + 10) != 0) {
      uVar8 = puVar9[lVar7 * 8 + 8];
    }
    return uVar8;
  case 0xd:
    goto switchD_00a50620_caseD_d;
  case 0xe:
    sVar4 = strlen(*(char **)(puVar9 + lVar7 * 8 + 2));
    uVar8 = (uint)sVar4;
    break;
  case 0xf:
    pcVar3 = *(char **)(puVar9 + lVar7 * 8 + 2);
    goto LAB_00a506ec;
  case 0x10:
    pcVar3 = "";
    if (*(char **)(puVar9 + lVar7 * 8 + 4) != (char *)0x0) {
      pcVar3 = *(char **)(puVar9 + lVar7 * 8 + 4);
    }
    sVar4 = strlen(pcVar3);
    uVar8 = (uint)sVar4;
    break;
  case 0x11:
    pcVar3 = "";
    if (*(char **)(puVar9 + lVar7 * 8 + 4) != (char *)0x0) {
      pcVar3 = *(char **)(puVar9 + lVar7 * 8 + 4);
    }
LAB_00a506ec:
    pcVar3 = strcpy(p,pcVar3);
    sVar4 = strlen(pcVar3);
    uVar8 = (uint)sVar4;
    break;
  case 0x12:
    uVar8 = puVar9[lVar7 * 8 + 6];
  }
  return uVar8;
}

