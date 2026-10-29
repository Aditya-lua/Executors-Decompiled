/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3340..0xc3384 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3340_1 {
    char padding_0[1];
    char field_1;
} st_c3340_1;

typedef struct st_c3340_0 {
    char field_0;
} st_c3340_0;


void sub_c3340(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, st_c3340_1 *a4)
{
    st_c3340_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_c3340_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a4->field_1)
    {
        sub_c41bc();
        return;
    }
    sub_bf358();
    return;
}
