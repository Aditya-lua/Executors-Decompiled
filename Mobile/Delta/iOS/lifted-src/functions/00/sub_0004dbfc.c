/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dbfc..0x4dc7c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dbfc_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[16];
    struct st_4dbfc_2 *field_38;
    unsigned long long field_40;
    char field_48;
} st_4dbfc_1;

typedef struct st_4dbfc_2 {
    long long field_0;
} st_4dbfc_2;

typedef struct st_4dbfc_0 {
    char field_0;
} st_4dbfc_0;


int sub_4dbfc(long long a0, st_4dbfc_1 *a1)
{
    long long *v4;  // x21
    unsigned long long i;  // x22
    unsigned long long v6;  // x22
    unsigned long long *v7;  // x21
    st_4dbfc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4dbfc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_40)
    {
        v4 = a1->field_38;
        i = a1->field_40 * 8;
        do
        {
            v6 = i;
            v7 = v4 + 1;
            sub_4a078(a0, *v4);
            i = v6 - 8;
            v4 = v7;
        } while (i);
    }
    if (a1->field_48 & 1)
        sub_49fdc(a0, a1->field_20, 0);
    return 1;
}
