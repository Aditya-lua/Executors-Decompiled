/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c336c
 */

undefined8 tls_get_ticket_from_client(int *param_1,long param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  *param_3 = 0;
  param_1[0x2a6] = 0;
  if ((((*param_1 < 0x301) || ((*(byte *)((long)param_1 + 0x9e9) >> 6 & 1) != 0)) ||
      (iVar1 = ssl_security(param_1,10,0,0,0), iVar1 == 0)) ||
     (lVar3 = *(long *)(param_2 + 0x288), *(int *)(lVar3 + 0x100) == 0)) {
    return 2;
  }
  uVar2 = tls_decrypt_ticket(param_1,*(undefined8 *)(lVar3 + 0xf0),*(undefined8 *)(lVar3 + 0xf8),
                             param_2 + 0x30,*(undefined8 *)(param_2 + 0x28),param_3);
  return uVar2;
}

