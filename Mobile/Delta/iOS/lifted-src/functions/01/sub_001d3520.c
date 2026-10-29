/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3520..0x1d3624 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d3520_1 {
    char padding_0[8];
    struct st_1d3520_2 *field_8;
    unsigned long long field_10;
    char padding_18[16];
    long long field_28;
} st_1d3520_1;

typedef struct st_1d3520_2 {
    long long field_0;
} st_1d3520_2;

typedef struct st_1d3520_0 {
    char field_0;
} st_1d3520_0;

extern unsigned long long g_e71cc8;

void sub_1d3520(st_1d3520_1 *a0, unsigned long a1)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long i;  // x21
    long long *v17;  // x8
    long long j;  // x9
    long long v19;  // x8
    st_1d3520_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1d3520_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    i = a1;
    v2 = sub_1a40d0();
    sub_1b1cac(a0);
    if (i != a1)
    {
        do
        {
            v3 = i + 56;
            sub_14fdc(&v3);
            v3 = i + 32;
            sub_127c0(&v3);
            sub_1c0954(&v2);
            i = a1;
        } while (i != a1);
    }
    a0->field_28 = 0;
    v17 = a0->field_8;
    j = a0->field_10 - (char *)v17;
    if ((unsigned long long)j >= 0x11)
    {
        do
        {
            sub_4e14(*v17, 42, 8);
            v17 = a0->field_8 + 1;
            a0->field_8 = v17;
            j = a0->field_10 - (char *)v17;
        } while (0x11 <= (unsigned long long)j);
    }
    v19 = 40;
    if (j == 8)
        v19 = 8;
    if (j == 16)
        v19 = 0;
    goto *((void *)(*(long long *)((char *)&g_e71cc8 + v19)));
}
