/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65dac..0x65fd8 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65dac_0 {
    char padding_0[48];
    struct st_65dac_1 *field_30;
} st_65dac_0;

typedef struct st_65dac_1 {
    unsigned long long field_0;
} st_65dac_1;

typedef struct st_65dac_3 {
    struct st_65dac_0 *field_0;
} st_65dac_3;

typedef struct st_65dac_2 {
    char field_0;
} st_65dac_2;

extern char g_10002b0;

long long sub_65dac(unsigned long long a0, long long a1, long long a2, st_65dac_3 **a3)
{
    unsigned short v11;  // x8
    unsigned long long v12;  // x0
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4112
    unsigned long v15;  // x8
    unsigned long long v16;  // 4118
    unsigned long long v17;  // 4112
    unsigned short v18;  // x8
    st_65dac_2 **v0;  // [bp-0x90], Other Possible Types: char
    st_65dac_2 *v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x80]
    unsigned short v3;  // [bp-0x7c]
    unsigned short v4;  // [bp-0x78]
    unsigned short v5;  // [bp-0x6c]
    unsigned long v6;  // [bp-0x64], Other Possible Types: unsigned short
    unsigned short v7;  // [bp-0x5c]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    if ((unsigned int)a0)
        v11 = 9;
    else
        v11 = 12;
    *(unsigned short *)&v6 = v11;
    if (*a3)
        (*(long long *)(*(long long *)*a3 + 48))();
    v4 = 0;
    v12 = sub_6552c(&(int)a2, 1, a1, &v4);
    if (v12 >> 31 & 1)
    {
LABEL_65f8c:
        v5 = 3;
    }
    else if ((unsigned int)v12)
    {
        v13 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
        if (v13 & 1 || !(unsigned int)a0 || !(*(unsigned short *)((void*)&v6 + 2) & 1))
        {
            v14 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
            if (!(v14 & 1) && !(a0 & 1))
            {
                v15 = *(unsigned short *)((void*)&v6 + 2);
                if (!(v15 >> 2 & 1))
                    goto LABEL_65f84;
                v5 = 1;
                v2 = 4;
                v3 = 0xffffffff;
                v16 = arm64g_calculate_condition(1, _getsockopt(a2, 0xffff, 0x1007, &v3, &v2) & 0xffffffff, 1, 0);
                if (v16 & 1 || v3)
                {
                    v5 = 3;
                    *(unsigned int *)___error() = v3;
                }
            }
            else
            {
                v17 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
                if (!(v17 & 1))
                {
                    v15 = *(unsigned short *)((void*)&v6 + 2);
LABEL_65f84:
                    if ((unsigned int)v15 & 56)
                        goto LABEL_65f8c;
                }
            }
        }
        else
        {
            v5 = 0;
        }
    }
    else
    {
        v5 = 2;
        if (*a3)
            v18 = 0;
        else
            v18 = 1;
        if (!(v18 & 1))
            sub_65fd8(a3, &v5);
    }
    if (*(long long *)&g_10002b0 == v8)
        return v5;
    ___stack_chk_fail(v5);
}
