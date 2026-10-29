/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4730c..0xa47458 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4730c_2 {
    char padding_0[120];
    struct st_a4730c_0 *field_78;
} st_a4730c_2;

typedef struct st_a4730c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_a4730c_1 *field_70;
    unsigned int field_78;
    unsigned int field_7c;
    unsigned int field_80;
    char padding_84[36];
    struct st_a4730c_1 *field_a8;
    struct st_a4730c_1 *field_b0;
    struct st_a4730c_1 *field_b8;
    char padding_c0[4];
    int field_c4;
    unsigned long long field_c8;
} st_a4730c_0;

typedef struct st_a4730c_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_a4730c_1;

extern char g_10002b0;

int sub_a4730c(st_a4730c_2 *a0, unsigned int *a1, unsigned int *a2)
{
    st_a4730c_0 *v5;  // x19
    unsigned long n;  // x8
    unsigned int v7;  // w9
    unsigned int v8;  // w8
    unsigned int v9;  // w10
    unsigned int *v0;  // [bp-0x38]
    unsigned int *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a1 || a2)
    {
        v5 = a0->field_78;
        v5->field_a8 = 0;
        v5->field_b0 = 0;
        v5->field_b8 = 0;
        v5->field_c8 = 0xffffffffffffffff;
        if (a2)
        {
            v0 = 0;
            v1 = 0;
            n = v5->field_c4;
            if (16 >= (int)n)
            {
                _memcpy((char *)&v2 - n, a2, n);
                a1 = a1;
            }
            if (a1)
            {
                v5->field_0 = *a1;
                v5->field_4 = a1[1];
                v5->field_8 = a1[2];
                v5->field_c = a1[3];
                v5->field_10 = a1[4];
                v5->field_14 = a1[5];
                v5->field_18 = a1[6];
                v5->field_1c = a1[7];
            }
            v7 = *(unsigned int *)((void*)&v0 + 4);
            v5->field_20 = (unsigned int)v0;
            v5->field_24 = v7;
            v8 = (unsigned int)v1;
            v9 = *(unsigned int *)((void*)&v1 + 4);
            v5->field_28 = v8;
            v5->field_2c = v9;
            *(unsigned int *)&v5->field_70 = 0;
            v5->field_78 = v7;
            v5->field_7c = v8;
            v5->field_80 = v9;
        }
        else
        {
            if (a1)
            {
                v5->field_0 = *a1;
                v5->field_4 = a1[1];
                v5->field_8 = a1[2];
                v5->field_c = a1[3];
                v5->field_10 = a1[4];
                v5->field_14 = a1[5];
                v5->field_18 = a1[6];
                v5->field_1c = a1[7];
            }
            *(unsigned int *)&v5->field_70 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return 1;
    ___stack_chk_fail();
}
