/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a95f0..0x2a965c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a95f0_0 {
    char field_0;
} st_2a95f0_0;


char * sub_2a95f0(st_2a95f0_0 **a0, char *a1)
{
    unsigned long v2;  // x1
    char *v3;  // x0
    char *v4;  // x0
    char *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[2] <= a0[1])
    {
        v5 = sub_2b0628(a0);
        a0[1] = v5;
        return v5 - 16;
    }
    v2 = *a1;
    v3 = a0[1];
    *v3 = v2;
    sub_2ae53c(v3 + 8, v2);
    v4 = v3 + 16;
    a0[1] = v4;
    a0[1] = v4;
    return v4 - 16;
}
