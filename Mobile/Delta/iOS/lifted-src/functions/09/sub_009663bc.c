/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9663bc..0x96657c (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9663bc_2 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[2876];
    struct st_9663bc_0 *field_b88;
} st_9663bc_2;

typedef struct st_9663bc_1 {
    unsigned long long field_0;
} st_9663bc_1;

typedef struct st_9663bc_0 {
    char padding_0[48];
    long long field_30;
    char padding_38[25];
    char field_51;
    char padding_52[30];
    struct st_9663bc_1 *field_70;
    char padding_78[888];
    long long field_3f0;
} st_9663bc_0;

extern char g_10002b0;

char sub_9663bc(st_9663bc_2 *a0, long long a1, long long n)
{
    st_9663bc_0 *v6;  // x22
    char v7;  // x0
    int v0;  // [bp-0x3e8], Other Possible Types: unsigned int
    long long v1;  // [bp-0x198]
    char v2;  // [bp-0x190]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = a0->field_b88;
    if (!(v6->field_51 & 1))
    {
        v0 = a0->field_48;
        if (32 >= (unsigned long long)n && (___memcpy_chk(&v2, a1, n, 328), v1 = n, sub_a7c17c(v6->field_3f0)))
        {
            v7 = sub_a66b6c(a0->field_b88->field_30, &v0);
            if (v7)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                sub_a7c1b4(a0->field_b88->field_3f0);
                if ((int)/* unsupported instruction */ >= 1)
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return v7;
                    ___stack_chk_fail();
                }
            }
            else
            {
                sub_a7c1b4(a0->field_b88->field_3f0);
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v6 = a0->field_b88;
                goto LABEL_9664a4;
            }
        }
    }
    else
    {
LABEL_9664a4:
        if (v6->field_70)
        {
            v0 = 1;
            v6->field_70();
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
