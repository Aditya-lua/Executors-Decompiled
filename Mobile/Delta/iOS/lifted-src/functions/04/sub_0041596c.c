/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41596c..0x415a54 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41596c_1 {
    struct st_41596c_2 *field_0;
    struct st_41596c_2 *field_8;
} st_41596c_1;

typedef struct st_41596c_3 {
    struct st_41596c_1 *field_0;
} st_41596c_3;

typedef struct st_41596c_2 {
    unsigned long long field_0;
} st_41596c_2;

typedef struct st_41596c_0 {
    char field_0;
} st_41596c_0;


void sub_41596c(st_41596c_3 **a0, unsigned int a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w21
    unsigned long idx;  // x22
    void* iter;  // x8
    unsigned int v17;  // w9
    st_41596c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_41596c_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
        (*(long long *)*(long long *)*a0)();
    v14 = a1;
    idx = a1;
    iter = (char *)a0 + (sub_425f1c(a0, idx) & 0xffffffff) + 2;
    if (v14 >= 100)
    {
        v17 = 41 * v14 >> 12;
        *(short *)((char *)iter - 2) = *(short *)(2 * (v14 - 100 * v17 & 0xff) + 13746828);
        iter -= 2;
        v14 = v17;
LABEL_415a24:
        *((char *)iter - 1) = (char)v14 | 48;
    }
    else
    {
        if (v14 < 10)
            goto LABEL_415a24;
        *(short *)((char *)iter - 2) = *(short *)(2 * idx + 13746828);
    }
    (*(long long *)(*(long long *)*a0 + 8))();
}
