/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86c48..0xb86d10 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86c48_0 {
    char padding_0[96];
    unsigned long long field_60;
    struct st_b86c48_1 *field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
} st_b86c48_0;

typedef struct st_b86c48_1 {
    long long field_0;
} st_b86c48_1;


unsigned long long sub_b86c48(long long a0)
{
    unsigned long long v4;  // x0
    st_b86c48_0 *v5;  // x21
    unsigned long v6;  // x22
    unsigned long v7;  // x22
    unsigned long v8;  // x22
    unsigned long long v9;  // 4102
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    while (1)
    {
        v4 = sub_b86d10(&v0, a0);
        if (!v0)
            break;
        v5 = v0 + 72 * v1;
        if (v5->field_80)
            _free(v5->field_78 - (v5->field_80 * 8 + 15 & 0xfffffffffffffff8));
        v6 = 0;
        while (1)
        {
            v7 = v6;
            if (v7 == v5->field_70)
                break;
            v8 = v7 + 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v9 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            v6 = v8;
            if (!(v9 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)&v5->field_68[2 * v7]);
                v6 = v8;
            }
        }
        if (v5->field_60)
            _free(v5->field_68);
    }
    return v4;
}
