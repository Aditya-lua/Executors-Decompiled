/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4d88..0xaf4de8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4d88_0 {
    char padding_0[56];
    unsigned long long field_38;
    char padding_40[88];
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
    unsigned long long field_b0;
    unsigned long long field_b8;
} st_af4d88_0;


void sub_af4d88(st_af4d88_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!(a2 >> 31 & 1))
    {
        a0->field_ac = a2;
        if (!a1)
            goto LABEL_af4da8;
    }
    else
    {
        a2 = a0->field_ac;
        if (!a1)
        {
LABEL_af4da8:
            a1 = sub_ad69f8(a0->field_98, a2);
        }
    }
    a0->field_b8 = a1;
    if (a3)
        *(unsigned int *)&a0->field_b0 = a3;
    goto *((void *)(a0->field_38));
}
