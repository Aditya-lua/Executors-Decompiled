/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d794..0x1d90c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d794_1 {
    char padding_0[132];
    char field_84;
    char padding_85[83];
    long long field_d8;
    char padding_e0[104];
    unsigned long long field_148;
    unsigned long long field_150;
    char padding_158[8];
    unsigned long long field_160;
    char field_168;
    char padding_169[103];
    unsigned long long field_1d0;
    unsigned long long field_1d8;
} st_1d794_1;

typedef struct st_1d794_0 {
    char field_0;
} st_1d794_0;


long long sub_1d794(st_1d794_1 *a0)
{
    char v10;  // x0
    char v11;  // x20
    long long v12;  // x0
    long long v13;  // x0
    unsigned long v0;  // [bp-0x80]
    st_1d794_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_1d794_0 *v2;  // [bp-0x68]
    char v3;  // [bp-0x60], Other Possible Types: unsigned long
    char v4;  // [bp-0x58]
    char v5;  // [bp-0x50]
    char v6;  // [bp-0x48]
    char v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v2 = &v1;
    v1 = &v2;
    sub_107a4();
    if (!(v7 & 1))
    {
        v3 = sub_19088(a0, 0, 0);
        v4 = 0;
        v13 = sub_404c(a0->field_d8, 56);
        return sub_740c(v13, &a0->field_84, &v3, 0xffffffff + 2863311531 * (unsigned int)(a0->field_1d8 - a0->field_1d0 >> 4));
    }
    v10 = sub_10160(&a0->field_168, &v5);
    if (!v10)
        return sub_5c94(sub_404c(a0->field_d8, 40), &v6, &v5);
    v11 = *(long long *)(v10 + 8);
    if (v11)
    {
        if (a0->field_160 > (unsigned long long)*(long long *)(v11 + 32))
        {
            v3 = 0;
            v4 = 0;
            v0 = *(long long *)v11;
            return sub_11094(a0, &a0->field_84, &v3, "Type function cannot reference outer local '%s'");
        }
        v12 = sub_404c(a0->field_d8, 48);
        return sub_5350(v12, &v6, v11, *(long long *)(v11 + 32) != ((long long)(a0->field_150 - a0->field_148) >> 3) - 1);
    }
    return sub_5c94(sub_404c(a0->field_d8, 40), &v6, &v5);
}
