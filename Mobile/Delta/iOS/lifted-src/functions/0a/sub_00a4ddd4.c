/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ddd4..0xa4de68 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4ddd4_0 {
    char padding_0[17];
    char field_11;
} st_a4ddd4_0;


char sub_a4ddd4(st_a4ddd4_0 **a0, long long a1)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    char v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(*a0->field_11 >> 1 & 1))
    {
        v2 = sub_a7a42c(sub_9ffdd8(*a0));
        v3 = sub_a50904(a0);
        if ((int)v3 < 1)
            return 0;
        v4 = (int)sub_aa845c(v2, a1, v3, 0) > 0;
        return v4;
    }
}
