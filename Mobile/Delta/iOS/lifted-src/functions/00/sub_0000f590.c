/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf590..0xf6e8 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f590_1 {
    char padding_0[96];
    char field_60;
    char padding_61[215];
    unsigned int field_138;
    unsigned int field_13c;
} st_f590_1;

typedef struct st_f590_2 {
    char padding_0[4];
    unsigned int field_4;
} st_f590_2;

typedef struct st_f590_0 {
    char field_0;
} st_f590_0;


long long sub_f590(st_f590_1 *a0, unsigned long long a1, st_f590_2 *a2)
{
    unsigned long v10;  // x8
    unsigned int v12;  // w21
    unsigned long long v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98]
    st_f590_0 **v2;  // [bp-0x88], Other Possible Types: char
    st_f590_0 *v3;  // [bp-0x80]
    unsigned long v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x70]
    unsigned int v6;  // [bp-0x68]
    char v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v3 = &v2;
    v2 = &v3;
    v10 = a0->field_138;
    if ((unsigned int)v10 && a0->field_13c > a2->field_4)
    {
        v4 = 0;
        v5 = 0;
        sub_9f8c(&v6, &v4, v10);
        sub_b814(&v6);
        v0 = sub_a0c8(&v7);
        v1 = a0->field_13c + 1;
        sub_31fc4("; did you forget to close %s at line %d?");
        sub_ed8c(a0, a1, a2, sub_a0c8(&v6));
        sub_b1a4(&a0->field_60);
        v12 = v6;
        if (v12 == (unsigned int)a1)
            goto LABEL_f68c;
    }
    else
    {
        sub_ed8c(a0, a1);
        sub_b1a4(&a0->field_60);
        v12 = v6;
        if (v12 == (unsigned int)a1)
        {
LABEL_f68c:
            sub_f8d0(a0);
            sub_f8d0(a0);
        }
    }
    return v12 == (unsigned int)a1;
}
