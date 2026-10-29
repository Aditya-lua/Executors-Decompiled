/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08218..0xb08234 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b08218_0 {
    uint128_t field_0;
    char padding_10[92];
    char field_6c;
    char padding_6d[115];
    uint128_t field_e0;
} st_b08218_0;


int sub_b08218(st_b08218_0 *a0)
{
    if (a0->field_6c >> 2 & 1)
        a0->field_e0 = a0->field_0;
    *(unsigned int *)&a0[1].padding_10[48] = 0;
    return 1;
}
