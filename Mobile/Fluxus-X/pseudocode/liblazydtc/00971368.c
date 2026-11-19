/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00971368
 */

undefined8 FUN_00971368(SSL *param_1,SSL_SESSION *param_2)

{
  void *pvVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  
  pvVar1 = SSL_get_ex_data(param_1,0);
  if ((((pvVar1 != (void *)0x0) && (lVar4 = *(long *)((long)pvVar1 + 0x10), lVar4 != 0)) &&
      (lVar3 = *(long *)(lVar4 + 0x38), lVar3 != 0)) &&
     (lVar2 = FUN_009685e4(pvVar1,lVar3), (*(byte *)(lVar2 + 0x79) >> 3 & 1) != 0)) {
    FUN_00968398(lVar3);
    FUN_00968774(pvVar1,lVar3,lVar4,param_2,0,&LAB_0096d7ac);
    FUN_009683b8(lVar3);
    return 1;
  }
  if (param_2 != (SSL_SESSION *)0x0) {
    SSL_SESSION_free(param_2);
  }
  return 1;
}

