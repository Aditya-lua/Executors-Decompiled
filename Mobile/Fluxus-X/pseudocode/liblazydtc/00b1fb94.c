/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fb94
 */

undefined8 ossl_prov_bio_new_membuf(void)

{
  undefined8 uVar1;
  
  if (DAT_00d237c0 == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00b1fba0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*DAT_00d237c0)();
  return uVar1;
}

