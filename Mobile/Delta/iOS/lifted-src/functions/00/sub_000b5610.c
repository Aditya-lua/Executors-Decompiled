/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5610..0xb570c (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5610_2 {
    unsigned int field_0;
} st_b5610_2;

typedef struct st_b5610_1 {
    char padding_0[8];
    struct st_b5610_2 *field_8;
    char padding_10[52];
    unsigned int field_44;
    char padding_48[8];
    unsigned int field_50;
} st_b5610_1;

typedef struct st_b5610_0 {
    char field_0;
} st_b5610_0;

extern char g_cc0c58;

long long sub_b5610(unsigned int a0, st_b5610_1 *a1, unsigned long long a2)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v6;  // w0
    unsigned int v7;  // w9
    unsigned int v8;  // w10
    unsigned long v9;  // x9
    st_b5610_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_b5610_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_50 == 1)
    {
        v4 = a0 + 1;
        if (!(v4 * 0x100000000))
            v5 = 32;
        else
            v5 = Clz(v4 * 0x100000000);
        if ((unsigned int)a2)
            return (v4 * 0x100 >> ((char)~v5 & 31)) + (31 - v5) * 0x100;
        return 0x1f00 - v5 * 0x100;
    }
    else if (a0 == 0x20000)
    {
        return (int)sub_b5610(0x1ffff, a1, a2) + 0x100;
    }
    else
    {
        v6 = sub_b7c54();
        v7 = *(int *)&a1->field_8[v6] + 1;
        if (!(v7 * 0x100000000))
            v8 = 32;
        else
            v8 = Clz(v7 * 0x100000000);
        if (!(unsigned int)a2)
            v9 = 0xffffe100 + v8 * 0x100;
        else
            v9 = v8 * 0x100 - (v7 * 0x100 >> ((char)~v8 & 31)) + 0xffffe100;
        return a1->field_44 + (&g_cc0c58)[v6] * 0x100 + v9;
    }
}
