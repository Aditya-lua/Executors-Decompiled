/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5575c..0xb55908 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5575c_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_b5575c_2;

typedef struct st_b5575c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b5575c_1;

typedef struct st_b5575c_0 {
    char padding_0[8];
    struct st_b5575c_1 *field_8;
} st_b5575c_0;

extern char g_10002b0;

long long sub_b5575c(st_b5575c_0 *a0, unsigned int a1, long long *a2, long long *a3, long long *a4, unsigned long long *a5, unsigned long a6)
{
    st_b5575c_2 *iter;  // x24
    long long v10;  // x2
    long long v11;  // x1
    long long v12;  // x0
    uint128_t v0;  // [bp-0x178]
    uint128_t v1;  // [bp-0x168]
    unsigned long v2;  // [bp-0x158]
    unsigned int v3;  // [bp-0x14c]
    char v4;  // [bp-0x148]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v3 = a1;
    if (a4)
    {
        iter = &v4;
        if (a3)
        {
            iter = &v4 + 40;
            sub_a71618("data-type", a3, 0);
        }
        if (a2)
        {
            sub_a71618("input-type", a2, 0);
            iter->field_0 = v0;
            iter->field_10 = v1;
            iter->field_20 = v2;
            iter = &(&iter->field_20)[1];
        }
        if ((char)a0->field_8)
        {
            sub_a71618("data-structure", &a0->field_8, 0);
            iter->field_20 = v2;
            iter->field_0 = v0;
            iter->field_10 = v1;
            iter = &(&iter->field_20)[1];
        }
        sub_a6ffac("type", &v3);
        iter->field_20 = v2;
        iter->field_0 = v0;
        iter->field_10 = v1;
        v10 = *a4;
        v11 = a4[1];
        v12 = sub_a71670("data", v11, v10);
        *(uint128_t *)&(&iter->field_20)[1] = v0;
        *(uint128_t *)((char *)&iter->field_28 + 8) = v1;
        *(unsigned long *)((char *)&iter->field_38 + 8) = v2;
        sub_a71bbc(v12, v11, v10);
        *(uint128_t *)&iter->field_48 = v0;
        iter->field_50 = v1;
        *(unsigned long *)&iter->field_60 = v2;
        a5();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v6)
            return 1;
        ___stack_chk_fail();
    }
}
