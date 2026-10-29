/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a494..0xa7a54c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a494_0 {
    char padding_0[176];
    struct st_a7a494_1 *field_b0;
    unsigned long long field_b8;
    long long field_c0;
} st_a7a494_0;

typedef struct st_a7a494_1 {
    char field_0;
} st_a7a494_1;


char * sub_a7a494(st_a7a494_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x21
    char *v4;  // x0
    char *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a7c198(a0->field_c0))
        return 0;
    v2 = a1 >> 3;
    if (v2 >= a0->field_b8)
    {
        v3 = v2 + 1;
        v4 = sub_a6c1b4(a0->field_b0, v3, "crypto/provider_core.c", 2036);
        if (v4)
        {
            a0->field_b0 = v4;
            _bzero(&v4[a0->field_b8], v3 - a0->field_b8);
            a0->field_b8 = v3;
            goto LABEL_a7a500;
        }
        else
        {
            v5 = 0;
        }
    }
    else
    {
LABEL_a7a500:
        *(char *)&a0->field_b0[v2] = *(char *)&a0->field_b0[v2] | (char)(1 << ((char)a1 & 7 & 31));
        v5 = 1;
    }
    sub_a7c1b4(a0->field_c0);
    return v5;
}
