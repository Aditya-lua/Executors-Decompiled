/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2049c
 */

undefined8 FUN_00b2049c(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  ENGINE *e;
  
  *param_2 = 0;
  lVar2 = OSSL_PARAM_locate_const(param_1,"properties");
  if (lVar2 != 0) {
    if (*(int *)(lVar2 + 8) != 4) {
      return 0;
    }
    *param_2 = *(undefined8 *)(lVar2 + 0x10);
  }
  ENGINE_finish((ENGINE *)*param_3);
  *param_3 = 0;
  lVar2 = OSSL_PARAM_locate_const(param_1,"engine");
  if (lVar2 != 0) {
    if (*(int *)(lVar2 + 8) != 4) {
      return 0;
    }
    e = ENGINE_by_id(*(char **)(lVar2 + 0x10));
    *param_3 = e;
    if (e == (ENGINE *)0x0) {
      return 0;
    }
    iVar1 = ENGINE_init(e);
    ENGINE_free((ENGINE *)*param_3);
    if (iVar1 == 0) {
      *param_3 = 0;
      return 0;
    }
  }
  return 1;
}

