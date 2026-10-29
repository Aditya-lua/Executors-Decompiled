/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9981a4..0x998220 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9981a4_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_9981a4_0;


int sub_9981a4(unsigned long a0, st_9981a4_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_30 || (v2 = sub_a6bf4c(0x4540, "ssl/record/methods/tls_common.c", 1049), a1->field_30 = v2, v2))
    {
        v3 = sub_9f2b98(*(long long *)(a0 + 4160));
        if (!(v3 >> 31 & 1))
        {
            a1->field_8 = v3 & 0xffffffff;
            a1->field_20 = a1->field_30;
            v2 = 1;
        }
        else
        {
            v2 = 0;
        }
    }
    return v2;
}
