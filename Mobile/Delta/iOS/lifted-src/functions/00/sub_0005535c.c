/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5535c..0x553e0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5535c_2 {
    char padding_0[32];
    struct st_5535c_1 *field_20;
    unsigned long long field_28;
} st_5535c_2;

typedef struct st_5535c_0 {
    unsigned long long field_0;
} st_5535c_0;

typedef struct st_5535c_1 {
    struct st_5535c_0 *field_0;
} st_5535c_1;

typedef struct st_5535c_3 {
    char field_0;
} st_5535c_3;


int sub_5535c(long long a0, st_5535c_2 *a1)
{
    long long v4;  // x0
    st_5535c_3 **v0;  // [bp-0x40], Other Possible Types: char
    st_5535c_3 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_52940();
    if (!a1->field_28)
    {
        sub_53f4c(a0, v4);
        return 0;
    }
    (*(long long *)*(long long *)*(long long *)a1->field_20)();
}
