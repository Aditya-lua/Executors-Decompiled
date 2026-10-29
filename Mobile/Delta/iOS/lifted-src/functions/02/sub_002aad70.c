/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aad70..0x2aadd4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aad70_0 {
    long long field_0;
} st_2aad70_0;


char * sub_2aad70(st_2aad70_0 **a0)
{
    long long *v2;  // x0
    char *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[2] <= a0[1])
    {
        v3 = sub_2ac530(a0);
        a0[1] = v3;
        return v3 - 16;
    }
    v2 = a0[1];
    *(char *)v2 = 0;
    sub_2ae53c(v2 + 1, 0);
    a0[1] = v2 + 2;
    return v2;
}
