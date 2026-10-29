/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963068..0x96318c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963068_0 {
    char padding_0[144];
    struct st_963068_1 *field_90;
} st_963068_0;

typedef struct st_963068_2 {
    unsigned int field_0;
    char padding_4[2476];
    unsigned long long field_9b0;
    char padding_9b8[696];
    struct st_963068_0 *field_c70;
} st_963068_2;

typedef struct st_963068_3 {
    unsigned long long field_0;
    char padding_8[696];
    struct st_963068_0 *field_2c0;
} st_963068_3;

typedef struct st_963068_1 {
    unsigned long long field_0;
} st_963068_1;

extern char g_10002b0;

int sub_963068(st_963068_2 *a0, unsigned long long a1)
{
    unsigned long v9;  // x8
    unsigned int v10;  // x19
    st_963068_3 *v11;  // x1
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
        if (!(unsigned int)v9)
        {
LABEL_9630f4:
            a0->field_9b0 = a0->field_9b0 & ~a1;
            v11 = &a0->field_9b0;
            sub_a71bbc(sub_a70ed8("options", v11), v11);
            v3 = v0;
            v4 = v1;
            v5 = v2;
            a0->field_c70->field_90();
        }
        if (!(v9 >> 7 & 1))
        {
            v10 = 0;
LABEL_9630f0:
            a0 = (st_963068_2 *)v10;
            if (a0)
                goto LABEL_9630f4;
            a0 = 0;
        }
        else
        {
            v10 = sub_980dc8();
            if (!(a0->field_0 >> 7 & 1))
                goto LABEL_9630f0;
            goto LABEL_963188;
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return (unsigned int)a0;
LABEL_963188:
    ___stack_chk_fail();
}
