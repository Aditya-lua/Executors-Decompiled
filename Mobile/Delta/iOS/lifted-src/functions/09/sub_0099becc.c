/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99becc..0x99bf24 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99becc_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2476];
    unsigned int field_a28;
    char padding_a2c[36];
    unsigned long long field_a50[2];
} st_99becc_0;


int sub_99becc(st_99becc_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_78)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a6c2e4(a0->field_a50[0], "ssl/statem/extensions.c", 1095);
        *(uint128_t *)a0->field_a50 = 0;
        return 1;
    }
    a0->field_a28 = 0xffffffff;
    return 1;
}
