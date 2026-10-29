/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60e3c..0xa60ed4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60e3c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_a60e3c_1;

typedef struct st_a60e3c_0 {
    char padding_0[32];
    long long field_20;
    long long field_28;
    unsigned int field_30;
} st_a60e3c_0;


long long sub_a60e3c(st_a60e3c_0 *a0, long long a1, long long a2, unsigned int a3)
{
    st_a60e3c_1 *v2;  // x23
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_20;
    if (a0->field_20)
    {
        if (a0->field_20 != a1)
        {
            sub_a6c2e4();
        }
        else
        {
            a0->field_30 = a3;
            return 1;
        }
    }
    if (a1 && a2)
    {
        v3 = sub_a6dac4(a1, a2, "crypto/ffc/ffc_params.c", 92);
        v2->field_0 = v3;
        if (!v3)
            return v3;
        a0->field_28 = a2;
        a0->field_30 = a3;
        return 1;
    }
    v2->field_0 = 0;
    v2->field_8 = 0;
    a0->field_30 = a3;
    return 1;
}
