/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab3b4..0x2ab41c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab3b4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_2ab3b4_1;

typedef struct st_2ab3b4_0 {
    char field_0;
} st_2ab3b4_0;


unsigned long long sub_2ab3b4(st_2ab3b4_1 *a0, long long a1)
{
    long long v4;  // x20
    unsigned long long v5;  // x0
    st_2ab3b4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2ab3b4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_2aec50() >= (unsigned long long)a1)
    {
        v4 = sub_2a95dc(a1);
        v5 = sub_12a38(a0, v4);
        a0->field_0 = v5;
        a0->field_8 = 0;
        a0->field_10 = v4;
        return v5;
    }
    sub_ca34();
}
