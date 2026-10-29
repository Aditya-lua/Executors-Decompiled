/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60c38..0xa60cac (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a60c38(void* a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9e48d4(*(long long *)a0);
    sub_9e48d4((long long)a0[8]);
    sub_9e48d4((long long)a0[16]);
    sub_9e48d4((long long)a0[24]);
    sub_a6c2e4((long long)a0[32], "crypto/ffc/ffc_params.c", 41);
    *(uint128_t *)&a0[64] = 0;
    *(uint128_t *)&a0[80] = 0;
    *(uint128_t *)&a0[32] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)a0 = 0;
    *(uint128_t *)&a0[16] = 0;
    *(unsigned int *)&a0[48] = 0xffffffff;
    *(unsigned int *)&a0[56] = 0xffffffff;
    *(unsigned int *)&a0[64] = 3;
    return 0;
}
