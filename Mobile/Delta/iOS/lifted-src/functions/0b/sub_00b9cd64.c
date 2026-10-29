/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9cd64..0xb9ce00 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9cd64_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_b9cd64_0;


void sub_b9cd64(unsigned long long *a0)
{
    unsigned long long i;  // x20
    st_b9cd64_0 *v3;  // x23
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != a0[2])
    {
        v3 = a0[1] + i * 32;
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
            sub_b86a90(v3->field_0);
        }
        if (v3->field_8)
            _free(v3->field_10);
    }
    if (!*a0)
        return;
    _free();
    return;
}
