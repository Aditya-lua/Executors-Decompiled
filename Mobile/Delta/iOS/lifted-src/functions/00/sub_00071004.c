/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71004..0x71070 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71004_0 {
    struct st_71004_1 *field_0;
} st_71004_0;

typedef struct st_71004_1 {
    struct st_71004_0 *field_0;
} st_71004_1;


long long sub_71004(unsigned long a0, char *a1, unsigned long a2, char *a3)
{
    char *v4;  // x21
    st_71004_1 **v0;  // [bp-0x50]
    st_71004_1 **v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    while (1)
    {
        v4 = a1;
        if (v4 == a3)
            return a0;
        a1 = v4 - 1;
        v0 = &v1;
        v1 = &v0;
        if (!sub_58440(*(v4 - 1), 0x4000))
            return a0;
    }
}
