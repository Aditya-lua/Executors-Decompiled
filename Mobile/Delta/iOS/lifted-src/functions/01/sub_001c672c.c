/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c672c..0x1c678c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c672c_1 {
    char padding_0[8];
    long long field_8;
} st_1c672c_1;

typedef struct st_1c672c_0 {
    char field_0;
} st_1c672c_0;


long long sub_1c672c(st_1c672c_1 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned int v10;  // w0
    unsigned int v11;  // w9
    st_1c672c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1c672c_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_1bf1c8(a0->field_8, a2, a1);
    if ((unsigned int)a1 != 95)
        v11 = 0;
    else
        v11 = ((unsigned int)a2 * 0x2000000 | (unsigned int)a2 >> 7) & 4261412865 & 1;
    if (!(v10 & 1))
        return v11;
    return 1;
}
