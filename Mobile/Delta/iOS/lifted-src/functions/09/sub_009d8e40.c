/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8e40..0x9d8f04 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8e40_0 {
    struct st_9d8e40_0 *field_0;
    struct st_9d8e40_0 *field_8;
    uint128_t field_10;
} st_9d8e40_0;

typedef struct st_9d8e40_1 {
    char padding_0[40];
    unsigned long long field_28;
    char padding_30[8];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d8e40_0 *field_40;
} st_9d8e40_1;


double sub_9d8e40(st_9d8e40_1 *a0, long long a1)
{
    st_9d8e40_0 *v2;  // x0
    st_9d8e40_0 *v3;  // x19
    st_9d8e40_0 *v4;  // x0
    st_9d8e40_0 *v5;  // x0
    st_9d8e40_0 *v6;  // x8
    uint128_t v7;  // q1
    st_9d8e40_0 *v8;  // x0
    unsigned long long v9;  // d0
    unsigned long long v10;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/bio/bss_mem.c", 111);
    if (!v2)
        return v10;
    v3 = v2;
    v4 = sub_9ebca8(a1);
    v3->field_0 = v4;
    if (v4)
    {
        v5 = sub_a6bffc(32);
        v3->field_8 = v5;
        v6 = v3->field_0;
        if (v5)
        {
            v7 = v6->field_10;
            *(int128_t *)&v5->field_0 = *(int128_t *)&v6->field_0;
            v5->field_10 = v7;
            a0->field_28 = 4294967297;
            a0->field_38 = 0xffffffff;
            a0->field_40 = v3;
            return 4294967297;
        }
        sub_9ebcf4(v6);
        v8 = v3;
    }
    else
    {
        v8 = v3;
    }
    sub_a6c2e4(v8);
    return v9;
}
