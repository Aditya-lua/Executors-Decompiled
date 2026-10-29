/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53d7c..0xc53eb0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53d7c_0 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[80];
    unsigned long long field_b8;
    long long field_c0;
    char padding_c8[8];
    unsigned long long field_d0;
    long long field_d8;
    char padding_e0[8];
    unsigned long long field_e8;
    long long field_f0;
    char padding_f8[8];
    unsigned long long field_100;
    long long field_108;
    char padding_110[96];
    long long field_170;
} st_c53d7c_0;


void sub_c53d7c(unsigned long a0, unsigned long long a1)
{
    unsigned long long i;  // x23
    st_c53d7c_0 *v3;  // x25
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return;
    i = 0;
    do
    {
        v3 = a0 + 456 * i;
        i += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v4 & 1))
        {
            /* unsupported instruction */;
            sub_c53420(v3->field_170);
        }
        if (v3->field_60 != 47)
        {
            if (v3->field_b8)
                _free(v3->field_c0);
            if (v3->field_d0)
                _free(v3->field_d8);
            if (v3->field_e8)
                _free(v3->field_f0);
            if (v3->field_100)
                _free(v3->field_108);
        }
    } while (i != a1);
    _free();
    return;
}
