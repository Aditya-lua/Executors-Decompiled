/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa030f4..0xa03188 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a030f4_1 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_a030f4_0 *field_98;
} st_a030f4_1;

typedef struct st_a030f4_0 {
    char padding_0[24];
    long long field_18;
} st_a030f4_0;


long long sub_a030f4(st_a030f4_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a5ace4(a0->field_88);
    if (a0->field_98->field_18)
    {
        v2 = sub_a50ac8(a0->field_98->field_18);
        v3 = v2;
        if (1 <= (int)v2)
        {
            v4 = arm64g_calculate_condition(v10 | 160, v11, v6, v7);
            v5 = arm64g_calculate_condition(4, (v4 & 1 ? v3 : 0), (v4 & 1 ? a4 : 0), 0);
            if (!(v5 & 1))
                return 0;
        }
        else
        {
            v8 = arm64g_calculate_condition(v10 | 160, v11, v6, v7);
            v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 : 0), (v8 & 1 ? a4 : 0), 0);
            if (!(v9 & 1))
                return 0;
        }
    }
}
