/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1638a8..0x1639a4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1638a8_0 {
    char field_0;
} st_1638a8_0;

typedef struct st_1638a8_2 {
    unsigned long long field_0;
} st_1638a8_2;

typedef struct st_1638a8_1 {
    char padding_0[24];
    struct st_1638a8_2 *field_18;
} st_1638a8_1;

extern st_1638a8_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1638a8(unsigned long a0)
{
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_1638a8_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_1638a8_0 *v1;  // [bp-0x60]
    unsigned long long i;  // [bp-0x58]
    double v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x39]
    unsigned long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v8 = v13;
    v9 = v14;
    v10 = &v12;
    v11 = v15;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = 3.92437101582265e+111;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    i = 0;
    if (26 >= i)
    {
        do
        {
            *((char *)&v3 + i) = (char)i + 116 + *((char *)&v3 + i) - ((char)i + 116 & *((char *)&v3 + i)) * 2 - 44;
            i += 1;
        } while (i < 27);
    }
    _strlen(&v3);
    g_f0d3d8->field_18();
}
