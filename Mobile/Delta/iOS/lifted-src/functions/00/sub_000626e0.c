/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x626e0..0x62748 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_626e0_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_626e0_3;

typedef struct st_626e0_1 {
    struct st_626e0_2 *field_0;
    long long field_8;
    unsigned long long field_10;
} st_626e0_1;

typedef struct st_626e0_2 {
    unsigned long long field_0;
} st_626e0_2;

typedef struct st_626e0_0 {
    char field_0;
} st_626e0_0;


unsigned long long sub_626e0(st_626e0_1 *a0, unsigned long a1, st_626e0_3 **a2, unsigned long long *a3)
{
    unsigned long long v4;  // x0
    st_626e0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_626e0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *a3 = 0;
    a3[1] = 0;
    a3[2] = a1;
    *a2 = a3;
    if (*(long long *)a0->field_0)
        a0->field_0 = *(long long *)a0->field_0;
    v4 = sub_6220c(a0->field_8, a3);
    a0->field_10 = a0->field_10 + 1;
    return v4;
}
