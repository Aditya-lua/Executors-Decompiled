/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b1f4..0xa4b258 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4b1f4_0 {
    unsigned int field_0;
    char padding_4[88];
    char field_5c;
} st_a4b1f4_0;


char sub_a4b1f4(st_a4b1f4_0 *a0, unsigned long a1, char *a2)
{
    char v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = sub_a4b0e8();
        if (!(a0->field_5c & 1))
        {
            *(char *)(a1 + v2) = 10;
            v2 += 1;
        }
        *(char *)(a1 + v2) = 0;
        a0->field_0 = 0;
    }
    else
    {
        v2 = 0;
    }
    *(unsigned int *)a2 = v2;
    return v2;
}
