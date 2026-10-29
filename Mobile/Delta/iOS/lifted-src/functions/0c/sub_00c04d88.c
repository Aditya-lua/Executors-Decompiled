/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc04d88..0xc04ea8 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c04d88_0 {
    struct st_c04d88_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_c04d88_0 *field_8;
} st_c04d88_0;

typedef struct st_c04d88_1 {
    char padding_0[8];
    struct st_c04d88_0 *field_8;
    struct st_c04d88_2 *field_10;
    struct st_c04d88_0 *field_18;
} st_c04d88_1;

typedef struct st_c04d88_2 {
    long long field_0;
} st_c04d88_2;


void sub_c04d88(st_c04d88_1 *a0)
{
    st_c04d88_0 *v2;  // x21
    unsigned long long v3;  // 4102
    st_c04d88_0 *v4;  // x23
    st_c04d88_0 *v5;  // x23
    st_c04d88_0 *v6;  // x23
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 0x8000000000000000)
    {
        v2 = a0->field_18;
        if (v2->field_0)
        {
            v2->field_0();
        }
        else if (!*(long long *)&v2->field_1)
        {
            return;
        }
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v3 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v3 & 1))
        {
            /* unsupported instruction */;
            sub_b86ac8(a0);
        }
        v4 = 0;
        while (1)
        {
            v5 = v4;
            if (v5 == a0->field_18)
                break;
            v6 = (char *)&v5->field_0 + 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v7 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            v4 = v6;
            if (!(v7 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)((char *)a0->field_10 + 0x8 * v5));
                v4 = v6;
            }
        }
        if (!a0->field_8)
            return;
    }
    _free();
    return;
}
