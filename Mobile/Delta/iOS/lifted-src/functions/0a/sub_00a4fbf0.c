/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fbf0..0xa4fd04 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4fbf0_0 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[1];
    char field_11;
} st_a4fbf0_0;

typedef struct st_a4fbf0_1 {
    struct st_a4fbf0_0 *field_0;
    char padding_8[100];
    unsigned int field_6c;
    char padding_70[64];
    long long field_b0;
} st_a4fbf0_1;

extern char g_10002b0;

int sub_a4fbf0(st_a4fbf0_1 *a0)
{
    st_a4fbf0_0 *v10;  // x8
    unsigned long v11;  // x0
    unsigned int v12;  // w0
    unsigned long long v13;  // 4112
    unsigned long v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x84]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = a0->field_0;
    if (v10)
    {
        v11 = a0->field_6c;
        if (v11 >> 31 & 1)
        {
            v1 = v10->field_c;
            v0 = v1;
            v5 = 0;
            v6 = 0;
            v3 = 0;
            v4 = 0;
            v2 = 0;
            if (*(long long *)&v10[13].padding_0[6])
            {
                sub_a70ed8("ivlen", &v0);
                v12 = sub_a5262c(a0->field_0, a0->field_b0, &v2);
                if ((int)v12 < 1)
                {
                    v13 = arm64g_calculate_condition(1, v12, 1, 0);
                    if (!(v13 & 1))
                        goto LABEL_a4fcd4;
                }
                else if (!(!sub_a6fc18(&v2) || sub_a6fc2c(&v2, &v1)))
                {
                    goto LABEL_a4fcd4;
                }
LABEL_a4fcc0:
                v11 = v1;
                a0->field_6c = v11;
            }
            else
            {
                if (!(v10->field_11 >> 3 & 1) || (int)sub_a4d5dc(a0, 37, 0, &v1) > 0)
                    goto LABEL_a4fcc0;
LABEL_a4fcd4:
                v11 = 0xffffffff;
            }
        }
    }
    else
    {
        v11 = 0;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v11;
    ___stack_chk_fail();
}
