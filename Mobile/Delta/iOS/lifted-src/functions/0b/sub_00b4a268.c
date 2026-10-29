/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a268..0xb4a2fc (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a268_0 {
    unsigned long long field_0;
    char padding_8[232];
    struct st_b4a268_1 *field_f0;
} st_b4a268_0;

typedef struct st_b4a268_1 {
    char padding_0[40];
    unsigned long long field_28;
    char padding_30[56];
    unsigned long long field_68;
} st_b4a268_1;


unsigned long long sub_b4a268(st_b4a268_0 *a0)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 && !sub_a7c17c(a0->field_0))
        return 0;
    v2 = 0;
    while (!*&a0->field_f0->padding_0[v2 + 40])
    {
        if (v2 == 63)
        {
            v3 = 0;
            while (!*&a0->field_f0->padding_0[v3 + 104])
            {
                if (v3 == 63)
                {
                    if (a0->field_0)
                    {
                        sub_a7c1b4(a0->field_0);
                        return 1;
                    }
                    return 1;
                }
            }
        }
    }
    if (!a0->field_0)
        return 0;
    sub_a7c1b4(a0->field_0);
    return 0;
}
