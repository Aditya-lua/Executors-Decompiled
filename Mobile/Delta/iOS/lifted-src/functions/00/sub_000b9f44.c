/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9f44..0xba034 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9f44_2 {
    unsigned int field_0;
} st_b9f44_2;

typedef struct st_b9f44_1 {
    struct st_b9f44_2 *field_0;
    struct st_b9f44_2 *field_8;
    struct st_b9f44_2 *field_10;
    struct st_b9f44_2 *field_18;
    char padding_20[16];
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    char padding_40[32];
    unsigned int field_60;
} st_b9f44_1;

typedef struct st_b9f44_0 {
    char field_0;
} st_b9f44_0;


int sub_b9f44(st_b9f44_1 *a0, unsigned long long a1, char *a2, unsigned int a3, unsigned long a4)
{
    unsigned long long i;  // x9
    unsigned long long v5;  // x9
    unsigned long idx;  // x10
    unsigned int v8;  // w0
    unsigned int v9;  // w8
    unsigned int v10;  // w0
    st_b9f44_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_b9f44_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_60 != 2)
    {
        if ((unsigned int)a1)
        {
            i = a1 & 0xffffffff;
            do
            {
                v5 = i;
                idx = *a2;
                a2 += 1;
                *(int *)&a0->field_0[idx] = *(int *)&a0->field_0[idx] + 2;
                i = v5 - 1;
            } while (i);
        }
        a0->field_30 = a0->field_30 + (unsigned int)a1 * 2;
    }
    v8 = sub_b7c54(a1);
    *(int *)&a0->field_8[v8] = *(int *)&a0->field_8[v8] + 1;
    a0->field_34 = a0->field_34 + 1;
    if (!(a3 * 0x100000000))
        v9 = 32;
    else
        v9 = Clz(a3 * 0x100000000);
    *(int *)&a0->field_18[31 - v9 & 0xffffffff] = *(int *)&a0->field_18[31 - v9 & 0xffffffff] + 1;
    a0->field_3c = a0->field_3c + 1;
    v10 = sub_becb0();
    *(int *)&a0->field_10[v10] = *(int *)&a0->field_10[v10] + 1;
    a0->field_38 = a0->field_38 + 1;
    return v10;
}
