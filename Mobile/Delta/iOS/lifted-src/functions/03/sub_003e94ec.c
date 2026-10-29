/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e94ec..0x3e9548 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e94ec_0 {
    char padding_0[16];
    struct st_3e94ec_1 *field_10;
    char padding_18[24];
    unsigned int field_30;
} st_3e94ec_0;

typedef struct st_3e94ec_1 {
    char field_0;
} st_3e94ec_1;


st_3e94ec_0 * sub_3e94ec(st_3e94ec_0 *a0, unsigned int *a1, unsigned long long *a2)
{
    char *v0;  // x8
    unsigned int v1;  // w9
    unsigned long long i;  // x10
    unsigned int v3;  // w11

    v0 = a0->field_10;
    v1 = *a1;
    for (i = *a2; v0[i] > v1; *a1 = ~((v3 ^ v1) + (v3 & v1) * 2) + ((v3 ^ v1) + (v3 & v1) * 2) * 2)
    {
        *a2 = i + (i | 1) + (~i | 1) + 1;
        v3 = a0->field_30 + 1;
    }
    return a0;
}
