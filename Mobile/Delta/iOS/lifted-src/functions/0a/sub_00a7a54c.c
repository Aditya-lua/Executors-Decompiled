/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a54c..0xa7a5d4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a54c_0 {
    char padding_0[176];
    struct st_a7a54c_1 *field_b0;
    unsigned long long field_b8;
    long long field_c0;
} st_a7a54c_0;

typedef struct st_a7a54c_1 {
    char field_0;
} st_a7a54c_1;


unsigned long long sub_a7a54c(st_a7a54c_0 *a0, unsigned long long a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        sub_c6946c();
        return 0;
    }
    *(unsigned int *)a2 = 0;
    v2 = sub_a7c17c(a0->field_c0);
    if (!(unsigned int)v2)
        return v2;
    v3 = a1 >> 3;
    if (a0->field_b8 > v3)
        *(unsigned int *)a2 = (*(char *)&a0->field_b0[v3] & 1 << ((char)a1 & 7 & 31)) != 0;
    sub_a7c1b4(a0->field_c0);
    return 1;
}
