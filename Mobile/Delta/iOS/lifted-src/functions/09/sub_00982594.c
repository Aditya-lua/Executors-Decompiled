/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982594..0x9826e4 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982594_3 {
    char padding_0[96];
    struct st_982594_1 *field_60;
    struct st_982594_1 *field_68;
    unsigned long long field_70;
    struct st_982594_1 *field_78;
} st_982594_3;

typedef struct st_982594_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_982594_0;

typedef struct st_982594_2 {
    struct st_982594_0 *field_0;
} st_982594_2;

typedef struct st_982594_1 {
    struct st_982594_2 *field_0;
    char padding_8[16];
    struct st_982594_1 *field_18;
    struct st_982594_1 *field_20;
    char padding_28[176];
    unsigned long long field_d8;
    char padding_e0[840];
    unsigned long long field_428;
    unsigned long long field_430;
    unsigned long long field_438;
    unsigned long long field_440;
} st_982594_1;


st_982594_1 * sub_982594(st_982594_3 *a0, long long a1, long long a2, st_982594_1 **a3, st_982594_1 *a4, st_982594_1 **a5)
{
    st_982594_1 *v2;  // x21
    st_982594_1 *v3;  // x0
    st_982594_1 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_78;
    if (v2)
    {
        a0->field_78 = 0;
        sub_976d18(v2, a4);
        sub_9844c8(v2->field_428, v2->field_430, v2->field_440);
        sub_9844d4(v2->field_428, v2->field_438);
    }
    else
    {
        v2 = sub_981520(a0, 0, a4, 1, 0);
        if (!v2)
            return v2;
    }
    if (a4 || sub_985ac0(*(long long *)*(long long *)v2->field_0, *(long long *)(*(long long *)v2->field_0 + 8), a2, 1, v2->field_428, 0))
    {
        if (*(char *)a3)
        {
            sub_98b268(v2->field_d8);
            v3 = sub_c61ba0(v2, a1, a2, a3);
            if ((unsigned int)v3)
                goto LABEL_98266c;
        }
        else
        {
            v3 = sub_c61b44(v2, a1, a2);
            if ((unsigned int)v3)
            {
LABEL_98266c:
                v4 = a0->field_68;
                if (v4)
                    v4->field_18 = v2;
                v2->field_18 = 0;
                v2->field_20 = v4;
                a0->field_68 = v2;
                if (!a0->field_60)
                    a0->field_60 = v2;
                a0->field_70 = a0->field_70 + 1;
                *a5 = v2;
                return v3;
            }
        }
    }
}
