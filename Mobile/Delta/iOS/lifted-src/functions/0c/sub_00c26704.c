/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc26704..0xc267e0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c26704_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_c26704_0;


void sub_c26704(st_c26704_0 *a0)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4135
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = v2 ^ 0x8000000000000000;
    v4 = arm64g_calculate_condition(0x44, v2, 0, 0);
    if (!(v4 & 1))
        v3 = 1;
    if (v3)
    {
        if (v3 != 1)
        {
            sub_c2636c(a0->field_8);
            _free(a0->field_8);
            sub_c2636c(a0->field_10);
        }
        else if (!v2)
        {
            return;
        }
        _free();
        return;
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v5 & 1)
        return;
    /* unsupported instruction */;
}
