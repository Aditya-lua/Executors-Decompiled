/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49278..0xb49328 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49278_1 {
    unsigned long long field_0;
    char padding_8[232];
    struct st_b49278_0 *field_f0;
} st_b49278_1;

typedef struct st_b49278_0 {
    char padding_0[40];
    unsigned long long field_28;
    char padding_30[103];
    unsigned long long field_97;
    char padding_9f[103];
    unsigned long long field_106;
} st_b49278_0;


unsigned long long sub_b49278(st_b49278_1 *a0)
{
    st_b49278_0 *v2;  // x20
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    if (a0->field_0 && !sub_a7c17c(a0->field_0))
        return 0;
    v3 = 0;
    while (!*&v2->padding_0[v3 + 40])
    {
        if (v3 == 110)
        {
            v4 = 0;
            while (!(v2->padding_30)[1 + v4])
            {
                if (v4 == 110)
                {
                    v5 = 0;
                    while (!v2->padding_9f[0x66 + v5])
                    {
                        if (v5 == 110)
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
        }
    }
    if (!a0->field_0)
        return 0;
    sub_a7c1b4(a0->field_0);
    return 0;
}
