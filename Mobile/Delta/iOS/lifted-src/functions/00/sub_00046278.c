/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46278..0x463c8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46278_2 {
    long long field_0;
    char padding_8[4];
    int field_c;
    int field_10;
    char padding_14[124];
    char field_90;
    char padding_91[399];
    char field_220;
    char padding_221[999];
    unsigned long long field_608;
    char padding_610[32];
    struct st_46278_3 *field_630;
    unsigned long long field_638;
} st_46278_2;

typedef struct st_46278_4 {
    char field_0;
    struct st_46278_4 *field_1;
    unsigned int field_4;
} st_46278_4;

typedef struct st_46278_1 {
    long long field_0;
} st_46278_1;

typedef struct st_46278_3 {
    struct st_46278_1 *field_0;
} st_46278_3;

typedef struct st_46278_0 {
    char field_0;
} st_46278_0;


long long sub_46278(st_46278_2 *a0, long long a1)
{
    st_46278_1 **v4;  // x8
    long long i;  // x24
    st_46278_4 *v6;  // x0
    st_46278_4 *v7;  // x25
    long long v8;  // x0
    long long len;  // x0
    st_46278_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_46278_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_630;
    if (a0->field_638 - (char *)v4 >> 3 <= (unsigned long long)a1)
        return sub_20174(&a0->field_630, a1);
    i = a1;
    do
    {
        v6 = sub_34930(&a0->field_90, &v4[i]);
        if (!v6)
            v7 = 0;
        else
            v7 = &v6->field_1;
        (&v7->field_0)[1] = 0;
        if (a0->field_c > 1)
        {
            v8 = sub_2b4f8(a0->field_0);
            len = _strlen(*(long long *)*(long long *)&a0->field_630[i]);
            sub_2cd44(a0->field_0, *(long long *)*(long long *)&a0->field_630[i], len, v7->field_0, *(int *)&(&v7->field_0)[4], v8);
        }
        if (a0->field_10 >= 1 && (unsigned long long)i >= a0->field_608)
        {
            sub_2b4f8(a0->field_0);
            sub_30704(a0->field_0);
        }
        i += 1;
        v4 = a0->field_630;
    } while (a0->field_638 - (char *)a0->field_630 >> 3 > (unsigned long long)i);
    return sub_20174(&a0->field_630, a1);
}
