/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xff50..0x100d0 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ff50_4 {
    char padding_0[128];
    unsigned int field_80;
} st_ff50_4;

typedef struct st_ff50_3 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_ff50_3;

typedef struct st_ff50_1 {
    struct st_ff50_2 *field_0;
} st_ff50_1;

typedef struct st_ff50_2 {
    struct st_ff50_1 *field_0;
} st_ff50_2;

typedef struct st_ff50_0 {
    char field_0;
} st_ff50_0;


unsigned long long sub_ff50(st_ff50_4 *a0, st_ff50_3 *a1, st_ff50_3 *a2)
{
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    st_ff50_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_ff50_0 *v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    st_ff50_2 **v3;  // [bp-0x50]
    st_ff50_2 **v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = &v3;
    v2 = sub_18934();
    v3 = &v4;
    v7 = sub_103a8(a1->field_0, &v2);
    a1->field_10 = a1->field_10 + 1;
    if (a0->field_80 != 44)
        return v7;
    if (a2)
    {
        while (1)
        {
            v3 = &v4;
            v4 = &v3;
            sub_f2b8(a2->field_0, a0 + 1);
            a2->field_10 = a2->field_10 + 1;
            sub_f8d0(a0);
            if (a0->field_80 == 41)
                break;
            v2 = sub_18934(a0, 0);
            v3 = &v4;
            v4 = &v3;
            v8 = sub_103a8(a1->field_0, &v2);
            a1->field_10 = a1->field_10 + 1;
            if (a0->field_80 != 44)
                return v8;
        }
    }
    else
    {
        while (1)
        {
            sub_f8d0(a0);
            if (a0->field_80 == 41)
                break;
            v2 = sub_18934(a0, 0);
            v3 = &v4;
            v4 = &v3;
            v9 = sub_103a8(a1->field_0, &v2);
            a1->field_10 = a1->field_10 + 1;
            if (a0->field_80 != 44)
                return v9;
        }
    }
    return sub_1db64(a0, a0 + 1, "Expected expression after ',' but got ')' instead");
}
