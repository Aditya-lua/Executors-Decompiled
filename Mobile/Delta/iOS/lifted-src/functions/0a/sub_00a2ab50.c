/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ab50..0xa2ac74 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ab50_0 {
    char padding_0[8];
    struct st_a2ab50_1 *field_8;
    char padding_10[16];
    long long field_20;
} st_a2ab50_0;

typedef struct st_a2ab50_1 {
    unsigned int field_0;
} st_a2ab50_1;


long long sub_a2ab50(unsigned long a0, st_a2ab50_0 *a1)
{
    unsigned int v2;  // w9
    long long v3;  // x0
    unsigned int v4;  // w8
    long long v5;  // x19
    long long v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_20)
    {
        v2 = *(int *)a1->field_8;
        v3 = sub_a6dac4();
        if (!v3)
            return v3;
        sub_a99624(*(int *)a1->field_8);
        v4 = *(int *)a1->field_8;
        if (sub_afbeac())
            return 1;
        sub_a6c2e4(v3, "crypto/ec/ecx_meth.c", 47);
        v5 = 524299;
        v6 = 48;
    }
    else
    {
        v5 = 116;
        v6 = 37;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ecx_meth.c", v6, "ecx_pub_encode");
    sub_a36abc(16, v5, 0);
    return 0;
}
