/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4fb44..0x4fbd0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4fb44_2 {
    char padding_0[32];
    struct st_4fb44_1 *field_20;
    unsigned long long field_28;
} st_4fb44_2;

typedef struct st_4fb44_0 {
    unsigned long long field_0;
} st_4fb44_0;

typedef struct st_4fb44_1 {
    struct st_4fb44_0 *field_0;
} st_4fb44_1;

typedef struct st_4fb44_3 {
    char field_0;
} st_4fb44_3;


int sub_4fb44(unsigned long a0, st_4fb44_2 *a1)
{
    st_4fb44_3 **v0;  // [bp-0x40], Other Possible Types: char
    st_4fb44_3 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_28)
        return 0;
    (*(long long *)*(long long *)*(long long *)a1->field_20)();
}
