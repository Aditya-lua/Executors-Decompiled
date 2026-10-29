/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962f70..0x963068 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962f70_0 {
    char padding_0[144];
    struct st_962f70_1 *field_90;
} st_962f70_0;

typedef struct st_962f70_2 {
    unsigned int field_0;
    char padding_4[2476];
    unsigned long long field_9b0;
    char padding_9b8[696];
    struct st_962f70_0 *field_c70;
} st_962f70_2;

typedef struct st_962f70_3 {
    unsigned long long field_0;
    char padding_8[696];
    struct st_962f70_0 *field_2c0;
} st_962f70_3;

typedef struct st_962f70_1 {
    unsigned long long field_0;
} st_962f70_1;

extern char g_10002b0;

int sub_962f70(st_962f70_2 *a0, unsigned long a1)
{
    unsigned long v9;  // x8
    st_962f70_3 *v10;  // x1
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a0)
    {
        v9 = a0->field_0;
        if (!(v9 >> 7 & 1))
        {
            if ((unsigned int)v9)
            {
                a0 = 0;
            }
            else
            {
                a0->field_9b0 = a0->field_9b0 | a1;
                v10 = &a0->field_9b0;
                sub_a71bbc(sub_a70ed8("options", v10), v10);
                v3 = v0;
                v4 = v1;
                v5 = v2;
                a0->field_c70->field_90();
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 != v6)
                ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return (unsigned int)a0;
    ___stack_chk_fail();
}
