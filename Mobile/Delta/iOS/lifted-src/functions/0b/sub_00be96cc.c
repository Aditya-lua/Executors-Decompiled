/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe96cc..0xbe980c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be96cc_0 {
    char padding_0[24];
    struct st_be96cc_1 *field_18;
} st_be96cc_0;

typedef struct st_be96cc_2 {
    unsigned long long field_0[2];
    struct st_be96cc_0 *field_8;
    char field_10[8];
    char field_12;
} st_be96cc_2;

typedef struct st_be96cc_1 {
    unsigned long long field_0;
} st_be96cc_1;

typedef struct st_be96cc_3 {
    struct st_be96cc_2 *field_0;
    char field_8;
    char field_9;
} st_be96cc_3;

extern unsigned long long g_efa758;

void sub_be96cc(st_be96cc_3 *a0, unsigned long a1, unsigned long long *a2)
{
    st_be96cc_2 *v8;  // x20
    unsigned long v9;  // x8
    uint128_t v0;  // [bp-0x80]
    char *v1;  // [bp-0x70]
    char v2;  // [bp-0x59]
    char *v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a0->field_8 & 1)
    {
        a0->field_8 = 1;
        a0->field_9 = 1;
        return;
    }
    v8 = a0->field_0;
    v9 = a0->field_9;
    if (*((char *)&v8->field_8 + 2) >= 0)
    {
        if (v9 & 1)
            (*(long long *)(v8->field_0[1] + 24))();
        a2();
    }
    else
    {
        if (!(v9 & 1))
            (*(long long *)(v8->field_0[1] + 24))();
        v2 = 1;
        v0 = (uint128_t)v8->field_0;
        v1 = &v2;
        v3 = &v0;
        v4 = &g_efa758;
        v5 = v8->field_8;
        a2();
    }
}
