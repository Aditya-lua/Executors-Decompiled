/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66400..0x664e4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66400_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_66400_1;

typedef struct st_66400_2 {
    char padding_0[40];
    struct st_66400_3 *field_28;
} st_66400_2;

typedef struct st_66400_3 {
    unsigned long long field_0;
} st_66400_3;

typedef struct st_66400_0 {
    char field_0;
} st_66400_0;


unsigned long long sub_66400(st_66400_2 **a0, long long a1, st_66400_1 *a2)
{
    st_66400_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_66400_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_6b08(a1);
    if (a2->field_18 && sub_60b58(a2) & 1)
        return 0;
    sub_2fa10(a1, 0);
    *a0->field_28();
}
