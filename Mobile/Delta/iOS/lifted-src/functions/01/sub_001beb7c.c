/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1beb7c..0x1bec0c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1beb7c_0 {
    struct st_1beb7c_1 *field_0;
    long long field_8;
    struct st_1beb7c_2 *field_10;
} st_1beb7c_0;

typedef struct st_1beb7c_2 {
    unsigned long long field_0;
} st_1beb7c_2;

typedef struct st_1beb7c_1 {
    char field_0;
} st_1beb7c_1;


unsigned int sub_1beb7c(st_1beb7c_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned int v4;  // w8
    st_1beb7c_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_1beb7c_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(char *)a0->field_0;
    if (v4 == 1)
    {
        if (sub_1c7708(a0->field_8))
        {
            *(unsigned long *)a0->field_10 = *(long long *)a0->field_10 + a2;
            v4 = *(char *)a0->field_0;
        }
        else
        {
            *(char *)a0->field_0 = 0;
            return 0;
        }
    }
    return v4 & 1;
}
