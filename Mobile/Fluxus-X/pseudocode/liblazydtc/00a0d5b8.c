/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d5b8
 */

void NCONF_free_data(CONF *conf)

{
  if (conf == (CONF *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00a0d5c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*conf->meth->destroy_data)(conf);
  return;
}

