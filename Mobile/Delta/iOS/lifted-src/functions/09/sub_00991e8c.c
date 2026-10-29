/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991e8c..0x991f74 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991e8c_0 {
    char padding_0[8];
    struct st_991e8c_1 *field_8;
} st_991e8c_0;

typedef struct st_991e8c_2 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_991e8c_0 *field_18;
    struct st_991e8c_0 *field_20;
    char padding_28[16];
    struct st_991e8c_0 *field_38;
    char padding_40[16];
    struct st_991e8c_0 *field_50;
    struct st_991e8c_0 *field_58;
    char field_60;
    char padding_61[23];
    struct st_991e8c_0 *field_78;
    struct st_991e8c_0 *field_80;
    struct st_991e8c_0 *field_88;
    char padding_90[32];
    struct st_991e8c_0 *field_b0;
    struct st_991e8c_0 *field_b8;
} st_991e8c_2;

typedef struct st_991e8c_1 {
    unsigned long long field_0;
} st_991e8c_1;


unsigned long long sub_991e8c(st_991e8c_2 *a0)
{
    st_991e8c_0 *v2;  // x8
    st_991e8c_0 **v3;  // x21
    unsigned long long v4;  // x20
    unsigned long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_b8;
    v3 = &a0->field_b0;
    if (a0->field_b0 > a0->field_b8)
    {
        v4 = 1;
        do
        {
            v5 = a0->field_0;
            a0->field_b8 = &v2->padding_0[1];
            v4 = sub_991f74(v5, (char *)a0 + 0x40 * v2 + 1, 0) & (unsigned int)v4;
            v2 = a0->field_b8;
        } while (a0->field_b8 < a0->field_b0);
    }
    else
    {
        v4 = 1;
    }
    a0->field_50 = 0;
    *(unsigned int *)&a0->field_58 = 0;
    a0->field_78 = 0;
    *(unsigned int *)&a0->field_80 = 0;
    memset(&a0->field_60, 0, 0x11);
    *v3 = 0;
    v3[1] = 0;
    sub_9d3c28(a0->field_38);
    a0->field_38 = 0;
    if (a0->field_18)
    {
        a0->field_18->field_8();
    }
    else if (a0->field_20)
    {
        a0->field_20->field_8();
    }
    else
    {
        sub_9d3c28(a0->field_38);
        memset(&a0->field_18, 0, 40);
        if (!a0->field_88)
            return v4;
        sub_991c1c(a0);
        return v4;
    }
}
