/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41ed0c..0x41ee30 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41ed0c_1 {
    struct st_41ed0c_2 *field_0;
    struct st_41ed0c_2 *field_8;
} st_41ed0c_1;

typedef struct st_41ed0c_3 {
    struct st_41ed0c_1 *field_0;
} st_41ed0c_3;

typedef struct st_41ed0c_2 {
    unsigned long long field_0;
} st_41ed0c_2;

typedef struct st_41ed0c_0 {
    char field_0;
} st_41ed0c_0;


void sub_41ed0c(st_41ed0c_3 **a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    char v19;  // x9
    unsigned long long v20;  // x10
    unsigned int v21;  // w9
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x21
    void* iter;  // x8
    unsigned long long v16;  // x21
    unsigned long long v17;  // x10
    void* v18;  // x9
    st_41ed0c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_41ed0c_0 *v1;  // [bp-0x38]
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
    iter = (char *)a0 + (sub_425f1c(a0) & 0xffffffff) + 2;
    if (v14 >= 100)
    {
        do
        {
            v16 = v14;
            v17 = (v16 >> 2) / 25;
            *(short *)((char *)iter - 2) = *(short *)(2 * v16 + -200 * v17 + 13747028);
            iter -= 2;
            v14 = v17;
        } while (624 < v16 >> 4);
        if (v17 < 10)
            goto LABEL_41ede0;
LABEL_41eda4:
        v18 = 2 * v17 + 13747028;
        *((char *)iter - 1) = (char)v18[1];
        v19 = *(char *)v18;
        v20 = 0xfffffffffffffffe;
    }
    else
    {
        v17 = v14;
        if (10 <= v17)
            goto LABEL_41eda4;
LABEL_41ede0:
        v21 = ((unsigned int)v17 * 2 + 2 & 32) + ((unsigned int)v17 + 1 ^ 48);
        v19 = (char)~v21 + (char)v21 * 2;
        v20 = 0xffffffffffffffff;
    }
    *((char *)iter + v20) = v19;
    (*(long long *)(*(long long *)*a0 + 8))();
}
