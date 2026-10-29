/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x38f54..0x38fe4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_38f54_0 {
    char padding_0[8];
    unsigned int field_8;
} st_38f54_0;


st_38f54_0 * sub_38f54(long long *a0, unsigned long a1, char a2, unsigned int a3, unsigned long a4)
{
    st_38f54_0 *v3;  // x0
    unsigned long v4;  // x22
    unsigned long long v5;  // x0
    long long v6;  // x0
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    v3 = sub_158b8(a0 + 73, &v0);
    if (!v3)
        return v3;
    v4 = v3->field_8;
    if ((unsigned int)v4 == a3)
        return v3;
    v5 = sub_2b4f8(*a0);
    v6 = sub_2b4f8(*a0);
    return sub_30704(*a0, v4, a2, v5 - a4, v6);
}
