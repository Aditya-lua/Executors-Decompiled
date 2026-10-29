/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40950..0x409a0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40950_2 {
    char padding_0[32];
    struct st_40950_3 *field_20;
    unsigned long long field_28;
} st_40950_2;

typedef struct st_40950_3 {
    struct st_40950_1 *field_0;
} st_40950_3;

typedef struct st_40950_0 {
    char field_0;
} st_40950_0;

typedef struct st_40950_1 {
    char padding_0[8];
    unsigned int field_8;
} st_40950_1;

extern unsigned int g_f00c70;

st_40950_1 * sub_40950(unsigned long a0, st_40950_2 *a1)
{
    st_40950_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_40950_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_28 != 1)
    {
        return 0;
    }
    else if (*(int *)(*(long long *)a1->field_20 + 8) == g_f00c70)
    {
        return *(long long *)a1->field_20;
    }
    else
    {
        return 0;
    }
}
