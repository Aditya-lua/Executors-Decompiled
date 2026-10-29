/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3138..0x1c3330 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3138_0 {
    char field_0;
} st_1c3138_0;

extern unsigned long long g_e72e00;

unsigned int sub_1c3138(long long a0, long long a1)
{
    unsigned int v8;  // w27
    long long v9;  // w25
    unsigned long long v18;  // 4104
    unsigned long v19;  // x21
    unsigned int v20;  // w0
    unsigned long v21;  // x23
    unsigned long v22;  // x8
    long long *v23;  // x0
    unsigned int v10;  // w24
    unsigned int v11;  // w0
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4106
    unsigned long long v14;  // 4106
    unsigned long long v15;  // 4108
    unsigned long long v16;  // 4108
    unsigned long long v17;  // 4104
    unsigned int v0;  // [bp-0x8c]
    st_1c3138_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_1c3138_0 *v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x74]
    unsigned long v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = &v1;
    v1 = &v2;
    v4 = 0;
    v5 = 0;
    v3 = 0;
    if (_inet_pton(30, sub_a0c8(a0 + 8), &v4))
    {
        v8 = 0;
        v9 = 7;
        v10 = 1;
    }
    else
    {
        v11 = _inet_pton(2, sub_a0c8(a0 + 8), &v3);
        v12 = v11;
        if (!v11)
        {
            v8 = 1;
            v13 = arm64g_calculate_condition(3, v12, 0, 0);
            if (!(v13 & 1))
                goto LABEL_1c31de;
LABEL_1c31dd:
            v10 = 0;
            v15 = arm64g_calculate_condition(3, v12, 0, 0);
            if (!(v15 & 1))
                goto LABEL_1c31e2;
LABEL_1c31e1:
            v9 = 2;
            v17 = arm64g_calculate_condition(3, v12, 0, 0);
            if (!(v17 & 1))
                goto LABEL_1c31e6;
LABEL_1c31e5:
        }
        else
        {
            v8 = 0;
            v14 = arm64g_calculate_condition(3, v12, 0, 0);
            if (v14 & 1)
                goto LABEL_1c31dd;
LABEL_1c31de:
            v10 = 1;
            v16 = arm64g_calculate_condition(3, v12, 0, 0);
            if (v16 & 1)
                goto LABEL_1c31e1;
LABEL_1c31e2:
            v9 = 7;
            v18 = arm64g_calculate_condition(3, v12, 0, 0);
            if (v18 & 1)
                goto LABEL_1c31e5;
LABEL_1c31e6:
        }
    }
    v19 = sub_af2750(a1, 0x55, 0, 0);
    if (v19 && !(v20 = sub_ad69e4(v19), (int)v20 < 1))
    {
        v0 = 0;
        v21 = 0;
        v22 = 56;
        if (v8)
            v22 = 0;
        if (v10)
            v22 = 8;
        do
        {
            v23 = sub_ad69f8(v19, v21);
            if (*(int *)v23 == v9)
            {
                sub_c4c40(v23[1]);
                sub_9c7b68(v23[1]);
                goto *((void *)(*(long long *)((char *)&g_e72e00 + v22)));
            }
        } while ((v21 = (unsigned int)v21 + 1, (int)v20 > (int)v21));
    }
    else
    {
        v0 = 0;
    }
    sub_ae75d4(v19);
    return v0 & 1;
}
