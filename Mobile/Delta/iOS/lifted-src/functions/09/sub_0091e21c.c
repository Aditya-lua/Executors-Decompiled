/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91e21c..0x91e324 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91e21c_1 {
    char padding_0[8];
    struct st_91e21c_2 *field_8;
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
} st_91e21c_1;

typedef struct st_91e21c_2 {
    long long field_0;
} st_91e21c_2;

typedef struct st_91e21c_0 {
    char field_0;
} st_91e21c_0;

extern unsigned long long g_e83a38;

void sub_91e21c(st_91e21c_1 *a0, long long a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    long long i;  // x21
    long long *v16;  // x8
    unsigned long v17;  // x9
    long long v18;  // x9
    long long v19;  // x8
    st_91e21c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_91e21c_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    i = a1;
    v2 = sub_8b00fc();
    sub_15a4d0(a0);
    if (i != a1)
    {
        do
        {
            sub_15b6c0(i + 8);
            sub_8b4930(&v2);
            i = a1;
        } while (i != a1);
    }
    a0->field_28 = 0;
    v16 = a0->field_8;
    v17 = a0->field_10;
    while (1)
    {
        v18 = (char *)v16 + v17 + 2 * v17 + -0x2 * v16 + -2 * (-v16 | v17) + 2 * (-v16 & ~v17);
        if ((unsigned long long)v18 < 0x11)
            break;
        sub_4e14(*v16, 64, 8);
        v16 = a0->field_8 + 1;
        a0->field_8 = v16;
        v17 = a0->field_10;
    }
    v19 = 24;
    if (v18 == 8)
        v19 = 16;
    if (v18 == 16)
        v19 = 48;
    goto *((void *)(*(long long *)((char *)&g_e83a38 + v19)));
}
