/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada010..0xada238 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada010_3 {
    struct st_ada010_0 *field_0;
    long long field_8;
    char padding_10[24];
    unsigned int field_28;
    char field_29;
} st_ada010_3;

typedef struct st_ada010_0 {
    char padding_0[8];
    struct st_ada010_1 *field_8;
    struct st_ada010_2 *field_10;
    struct st_ada010_1 *field_18;
    struct st_ada010_1 *field_20;
    struct st_ada010_1 *field_28;
} st_ada010_0;

typedef struct st_ada010_2 {
    unsigned long long field_0;
} st_ada010_2;

typedef struct st_ada010_1 {
    char field_0;
} st_ada010_1;

extern long long g_ada238;

unsigned long long sub_ada010(st_ada010_3 *a0)
{
    char v3;  // x20
    char v4;  // x20
    char v5;  // x23
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_0->field_8)
        a0->field_0->field_8();
    if (*((char *)&a0->field_28 + 1) & 1)
        sub_a36ed8(&g_ada238, a0);
    if ((int)sub_ad69e4(a0->field_8) >= 1)
    {
        v3 = 0;
        do
        {
            if (a0->field_0->field_10)
            {
                sub_ad69f8(a0->field_8, v3);
                a0->field_0->field_10();
            }
        } while ((v3 += 1, (int)sub_ad69e4(a0->field_8) > v3));
    }
    if (a0->field_0->field_18)
        a0->field_0->field_18();
    if ((int)sub_ad69e4(a0->field_8) < 1)
    {
        v4 = 0;
        v5 = 0;
    }
    else if (a0->field_0->field_20)
    {
        sub_ad69f8(a0->field_8, 0);
        a0->field_0->field_20();
    }
    else
    {
        a0->field_28 = a0->field_28 & 0xfffffffe;
        v4 = 0xfffffffe;
        v5 = (char)"processing";
    }
    if (!a0->field_0->field_28)
        return v4;
    a0->field_0->field_28();
}
