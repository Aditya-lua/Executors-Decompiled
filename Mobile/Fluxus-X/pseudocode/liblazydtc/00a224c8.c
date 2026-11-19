/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a224c8
 */

int DSO_free(DSO *dso)

{
  int *piVar1;
  byte bVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  _func_3875 *p_Var8;
  _func_3879 *p_Var9;
  
  if (dso == (DSO *)0x0) {
LAB_00a2258c:
    iVar6 = 1;
  }
  else {
    piVar1 = &dso->references;
    do {
      iVar6 = *piVar1;
      iVar5 = iVar6 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
      bVar2 = (byte)dso->flags;
    }
    else {
      if (1 < iVar6) goto LAB_00a2258c;
      bVar2 = (byte)dso->flags;
    }
    if ((((bVar2 >> 2 & 1) == 0) && (p_Var8 = dso->meth->dso_unload, p_Var8 != (_func_3875 *)0x0))
       && (iVar6 = (*p_Var8)(dso), iVar6 == 0)) {
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0x45,"DSO_free");
      uVar7 = 0x6b;
    }
    else {
      p_Var9 = dso->meth->init;
      if ((p_Var9 == (_func_3879 *)0x0) || (iVar6 = (*p_Var9)(dso), iVar6 != 0)) {
        OPENSSL_sk_free(dso->meth_data);
        CRYPTO_free(dso->filename);
        CRYPTO_free(dso->loaded_filename);
        CRYPTO_THREAD_lock_free(dso[1].meth);
        CRYPTO_free(dso);
        goto LAB_00a2258c;
      }
      ERR_new();
      ERR_set_debug("crypto/dso/dso_lib.c",0x4b,"DSO_free");
      uVar7 = 0x66;
    }
    ERR_set_error(0x25,uVar7,0);
    iVar6 = 0;
  }
  return iVar6;
}

