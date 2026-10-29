/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2d20..0x1c2fb0 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2d20_2 {
    struct st_1c2d20_1 *field_0;
    struct st_1c2d20_3 *field_8;
    struct st_1c2d20_3 *field_10;
} st_1c2d20_2;

typedef struct st_1c2d20_3 {
    unsigned int field_0;
} st_1c2d20_3;

typedef struct st_1c2d20_5 {
    struct st_1c2d20_0 *field_0;
} st_1c2d20_5;

typedef struct st_1c2d20_1 {
    char padding_0[376];
    long long field_178;
    long long field_180;
    char padding_188[448];
    char field_348;
    char field_349;
    char padding_34a[6];
    char field_350;
    char padding_351[23];
    unsigned long long field_368;
    char padding_370[104];
    char field_3d8;
    char padding_3d9[31];
    char field_3f8;
} st_1c2d20_1;

typedef struct st_1c2d20_4 {
    char padding_0[376];
    unsigned long long field_178;
    unsigned long long field_180;
    char padding_188[448];
    char field_348;
    char field_349;
    char padding_34a[6];
    char field_350;
    char padding_351[23];
    unsigned long long field_368;
    char padding_370[104];
    char field_3d8;
    char padding_3d9[31];
    unsigned long long field_3f8;
} st_1c2d20_4;

typedef struct st_1c2d20_0 {
    char field_0;
} st_1c2d20_0;

typedef struct st_1c2d20_6 {
    st_1c2d20_0 field_0;
} st_1c2d20_6;

extern long long g_95fdc4;
extern unsigned long long g_e72d58;
extern unsigned long long g_e72d60;
extern char g_10002b0;

int sub_1c2d20(st_1c2d20_2 *a0, st_1c2d20_4 *a1)
{
    st_1c2d20_1 *v12;  // x20
    unsigned int *v13;  // x8
    unsigned int v14;  // w9
    char v16;  // x0
    unsigned int v17;  // w8
    st_1c2d20_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_1c2d20_0 *v1;  // [bp-0xa0]
    char v2;  // [bp-0x98]
    st_1c2d20_6 **v3;  // [bp-0x90], Other Possible Types: char
    st_1c2d20_5 **v4;  // [bp-0x88], Other Possible Types: char *, char
    char *v5;  // [bp-0x80]
    st_1c2d20_1 *v6;  // [bp-0x60]
    char *v7;  // [bp-0x58]
    char v8;  // [bp-0x40]
    unsigned long i;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    i = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v12 = a0->field_0;
    if (v12->field_348 == 1)
    {
        v5 = &v4;
        v4 = &v5;
        v3 = 1;
        v6 = v12;
        v7 = &v3;
        sub_1beaf4(&v6->field_3d8, &v6);
        if (v3 & 1)
        {
            sub_95fa14(a1, 0, 0);
        }
        else
        {
            v13 = a0->field_8;
            v14 = 9;
            goto LABEL_1c2e38;
        }
    }
    if (!(sub_1c1ef4(*(int *)a0->field_10, a1, &g_95fdc4, v12->field_178, v12->field_180) & 1))
    {
        v13 = a0->field_8;
        v14 = 8;
LABEL_1c2e38:
        *v13 = v14;
        if (*(long long *)&g_10002b0 == i)
            return 0;
    }
    else if (v12->field_348 == 1)
    {
        if (!v12->field_368)
            goto LABEL_1c2e68;
        v6 = a1;
        switch ((unsigned int)sub_6b0cc(&v12->field_350, &v6))
        {
        case 0:
LABEL_1c2e68:
            v16 = sub_962b18(a1);
            *(unsigned long long *)&v12->field_3f8 = v16;
            if (v16)
            {
                *(unsigned int *)a0->field_8 = 10;
                goto *((void *)(g_e72d58));
            }
            else
            {
                v2 = sub_95fa88(a1);
                v4 = &v2;
                sub_1a4ee0(&v5, &v4, &v3);
                v3 = &v4;
                v4 = &v3;
                sub_159d9c(&v6, &v5);
                v8 = 1;
                sub_181a8(&v5);
                if (v2)
                {
                    if (v12->field_349 != 1 || sub_1b6634(v12) & 1)
                    {
                        sub_1b3f74(&v6);
                        goto *((void *)(g_e72d60));
                    }
                    else
                    {
                        v17 = 11;
                    }
                }
                else
                {
                    v17 = 10;
                }
                *(unsigned int *)a0->field_8 = v17;
                sub_1b3f74(&v6);
                goto *((void *)(g_e72d58));
            }
        case 2:
            *(unsigned int *)a0->field_8 = 10;
            goto *((void *)(g_e72d58));
        default:
            goto *((void *)(g_e72d60));
        }
    }
    else if (*(long long *)&g_10002b0 == i)
    {
        return 1;
    }
    do
    {
        ___stack_chk_fail();
    } while (*(long long *)&g_10002b0 != i);
    return 0;
}
