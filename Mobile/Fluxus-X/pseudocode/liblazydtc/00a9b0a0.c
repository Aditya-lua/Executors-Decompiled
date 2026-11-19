/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b0a0
 */

void FUN_00a9b0a0(ulong *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  
  puVar2 = DAT_00d22118;
  if ((param_1 < DAT_00d22128) || (DAT_00d22128 + DAT_00d22130 <= param_1)) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: WITHIN_FREELIST(list)","crypto/mem_sec.c",0x17a);
  }
  if (DAT_00d22118 <= param_2) {
    puVar1 = (ulong *)((long)DAT_00d22118 + DAT_00d22120);
    if (param_2 < puVar1) {
      puVar3 = (ulong *)*param_1;
      *param_2 = (ulong)puVar3;
      if (puVar3 == (ulong *)0x0) {
        param_2[1] = (ulong)param_1;
      }
      else {
        if ((puVar3 < puVar2) || (puVar1 <= puVar3)) {
                    /* WARNING: Subroutine does not return */
          OPENSSL_die("assertion failed: temp->next == NULL || WITHIN_ARENA(temp->next)",
                      "crypto/mem_sec.c",0x17f);
        }
        param_2[1] = (ulong)param_1;
        if ((ulong *)puVar3[1] != param_1) {
                    /* WARNING: Subroutine does not return */
          OPENSSL_die("assertion failed: (char **)temp->next->p_next == list","crypto/mem_sec.c",
                      0x183);
        }
        puVar3[1] = (ulong)param_2;
      }
      *param_1 = (ulong)param_2;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  OPENSSL_die("assertion failed: WITHIN_ARENA(ptr)","crypto/mem_sec.c",0x17b);
}

