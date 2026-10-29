/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa311ec..0xa3130c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a311ec_3 {
    unsigned int field_0;
} st_a311ec_3;

typedef struct st_a311ec_2 {
    long long field_0;
    struct st_a311ec_3 *field_8;
    char padding_10[16];
    struct st_a311ec_0 *field_20;
    long long field_28;
    char field_30;
    char padding_31[3];
    unsigned int field_34;
} st_a311ec_2;

typedef struct st_a311ec_1 {
    unsigned long long field_0;
} st_a311ec_1;

typedef struct st_a311ec_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[84];
    struct st_a311ec_1 *field_60;
} st_a311ec_0;


st_a311ec_0 * sub_a311ec(st_a311ec_0 *a0, st_a311ec_2 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    char v19;  // x24
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_a311ec_0 *v16;  // x0
    st_a311ec_0 *v17;  // x0
    st_a311ec_0 *v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a1->field_34)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    a1->field_34 = 1;
    v16 = sub_a3032c();
    v17 = v16;
    if (a1->field_20 != v17 != (a1->field_30 & 1))
    {
        sub_a77638();
        v18 = sub_ad69e4(a1->field_0);
        v17 = v18;
        if ((int)(unsigned int)v17 >= 1)
        {
            v19 = 0;
            do
            {
                if (!(a1->field_30 & 1))
                {
                    v17 = sub_a2d73c(a0, sub_ad69f8(a1->field_0, v19));
                    if (!(unsigned int)v17)
                        continue;
                }
                else
                {
                    v17 = *(int *)&a1->field_8[v19 & 0xffffffff] == a0->field_8;
                    if (!(unsigned int)v17)
                        continue;
                }
                if (a0->field_60)
                    a0->field_60();
                if ((a1->field_20 == v16 || *(long long *)&a0[1].field_8) && !(v17 = sub_a2f748(a1->field_28, a0), !(unsigned int)v17))
                    break;
            } while ((v19 += 1, (int)(unsigned int)v18 > v19));
        }
    }
    a1->field_34 = 0;
    return v17;
}
