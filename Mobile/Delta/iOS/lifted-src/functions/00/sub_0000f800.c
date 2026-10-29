/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf800..0xf8d0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f800_0 {
    unsigned int field_0;
} st_f800_0;

typedef struct st_f800_2 {
    unsigned long long field_0;
} st_f800_2;

typedef struct st_f800_1 {
    struct st_f800_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_f800_1;

extern st_f800_1 g_e61fa8;

long long sub_f800(unsigned long a0, int *a1, int *a2, unsigned int *a3)
{
    unsigned long v8;  // x9
    unsigned long v0;  // [bp-0x70]
    st_f800_0 **v1;  // [bp-0x68]
    st_f800_0 **v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    unsigned int *v4;  // [bp-0x50]
    unsigned int *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (a1 == a2)
    {
        v3 = 1;
        sub_23c78(a0, a1, a2);
        return sub_18d54(&v0);
    }
    v8 = *a1;
    *a3 = v8;
    (&g_e61fa8.field_0)[v8]();
}
