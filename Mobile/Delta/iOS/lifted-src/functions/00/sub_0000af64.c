/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf64..0xafc0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af64_0 {
    char field_0;
} st_af64_0;

typedef struct st_af64_1 {
    struct st_af64_0 *field_0;
    unsigned int field_8;
} st_af64_1;


unsigned long long sub_af64(unsigned long a0, st_af64_1 *a1)
{
    unsigned long i;  // x8
    char *v3;  // x9
    unsigned int v4;  // w0
    char *v5;  // x9
    unsigned int v6;  // w0
    unsigned long v7;  // x8
    char *v8;  // x9
    st_af64_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_af64_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    i = a1->field_8;
    if (!(unsigned int)i)
        return 2166136261;
    v3 = a1->field_0;
    v4 = 2166136261;
    do
    {
        v5 = v3;
        v6 = v4;
        v7 = i;
        v8 = v5 + 1;
        i = v7 - 1;
        v4 = 16777619 * (v6 ^ *v5);
        v3 = v8;
    } while (i);
    return 16777619 * (v6 ^ *v5);
}
