/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ff3c..0x50028 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ff3c_1 {
    char padding_0[32];
    unsigned long long field_20;
    long long field_28;
    struct st_4ff3c_2 *field_30;
    long long field_38;
} st_4ff3c_1;

typedef struct st_4ff3c_3 {
    char padding_0[24];
    char field_18;
    char padding_19[39];
    unsigned long long field_40;
    long long field_48;
} st_4ff3c_3;

typedef struct st_4ff3c_2 {
    long long field_0;
} st_4ff3c_2;

typedef struct st_4ff3c_0 {
    char field_0;
} st_4ff3c_0;


long long sub_4ff3c(st_4ff3c_3 *a0, st_4ff3c_1 *a1)
{
    long long v4;  // x21
    long long i;  // x22
    long long v6;  // x1
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    st_4ff3c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_4ff3c_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_38)
        return 0;
    v4 = 0;
    i = 0;
    do
    {
        v6 = *(long long *)((char *)a1->field_30 + v4);
        v7 = sub_4f204(a0, v6);
        if (v6 && (unsigned long long)a1->field_28 > (unsigned long long)i)
        {
            sub_4fbd0(&a0->field_18, a1->field_20 + v4);
            *(long long *)(sub_12484(&a0->field_18, a1->field_20 + v4) + 8) = v6;
        }
        v8 = a0->field_40 + v7;
        a0->field_40 = (v8 & 0x8080808080808080) - ((v8 & 0x8080808080808080) >> 7) | v8 & 0x7f7f7f7f7f7f7f7f;
        a0->field_48 = 0;
        i += 1;
        v4 += 8;
    } while ((unsigned long long)a1->field_38 > (unsigned long long)i);
    return 0;
}
