/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaefc4..0xaaf01c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaefc4_0 {
    char padding_0[8];
    long long field_8;
} st_aaefc4_0;

typedef struct st_aaefc4_1 {
    char padding_0[8];
    struct st_aaefc4_1 *field_8;
    char padding_10[16];
    struct st_aaefc4_1 *field_20;
} st_aaefc4_1;


st_aaefc4_1 * sub_aaefc4(st_aaefc4_0 *a0)
{
    long long v2;  // x0
    st_aaefc4_1 *v3;  // x0
    st_aaefc4_1 *v4;  // x8
    st_aaefc4_1 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aadf10();
    v3 = sub_9c5520(v2, a0->field_8);
    if (!v3)
    {
        return v3;
    }
    else if (v3->field_8)
    {
        v4 = sub_9cf9b4(v3->field_8);
        v5 = v3;
        v5->field_20 = v4;
        if (v4)
            return v5;
        sub_aadf28(v5);
        return 0;
    }
    else
    {
        return v3;
    }
}
