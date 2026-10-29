/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb3838..0xbb3914 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb3838_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_bb3838_0;


void sub_bb3838(st_bb3838_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // 4139
    long long v11;  // x0
    unsigned long long v12;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    v9 = v8 ^ 0x8000000000000000;
    v10 = arm64g_calculate_condition(0x44, v8, 0, 0);
    if (!(v10 & 1))
        v9 = 1;
    if (v9)
    {
        if (v9 == 1)
        {
            if (!v8)
                goto LABEL_bb38c0;
            v11 = a0->field_8;
        }
        else
        {
            sub_bb3264(a0->field_8);
            _free(a0->field_8);
            sub_bb3264(a0->field_10);
            v11 = a0->field_10;
        }
        _free(v11);
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v12 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v12 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(a0->field_8);
        }
    }
LABEL_bb38c0:
    sub_bb3264();
    return;
}
