/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf295c..0xaf2a9c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af295c_0 {
    struct st_af295c_0 *field_0;
    long long field_8;
    struct st_af295c_0 *field_10;
    long long field_18;
    struct st_af295c_0 *field_20;
    char padding_28[88];
    char field_80;
    char padding_81[23];
    long long field_98;
} st_af295c_0;

extern long long g_af2a9c;

void sub_af295c(st_af295c_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    st_af295c_0 *v4;  // x19
    st_af295c_0 *v5;  // x20
    st_af295c_0 *v6;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    v4 = a0->field_10;
    if ((int)sub_ad69e4(v4) >= 1)
    {
        v5 = 0;
        do
        {
            v6 = *(long long *)(sub_ad69f8(v4, v5) + 8);
            if (v6)
            {
                if (v6->field_20)
                {
                    v6->field_20();
                }
                else if (v6->field_10)
                {
                    v6->field_10();
                }
            }
        } while ((sub_a6c2e4(), v5 = (unsigned int)v5 + 1, (int)sub_ad69e4(v4) > (int)(unsigned int)v5));
    }
    sub_ad6020(v4);
    sub_ad6958(a0->field_8, &g_af2a9c);
    sub_a6a9e8(4, a0, &a0->field_80);
    sub_af82fc(a0->field_18);
    sub_a7c1d0(a0->field_98);
    sub_a6c2e4();
    return;
}
