/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e728..0x97e938 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e728_1 {
    char padding_0[160];
    long long field_a0;
} st_97e728_1;

typedef struct st_97e728_0 {
    char padding_0[120];
    struct st_97e728_1 *field_78;
    struct st_97e728_2 *field_80;
    char field_88;
    char padding_89[7];
    long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    char field_a8;
    char padding_a9[15];
    unsigned int field_b8;
} st_97e728_0;

typedef struct st_97e728_4 {
    struct st_97e728_3 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    struct st_97e728_0 *field_20;
} st_97e728_4;

typedef struct st_97e728_3 {
    char padding_0[112];
    char field_70;
} st_97e728_3;

typedef struct st_97e728_2 {
    char padding_0[112];
    long long field_70;
} st_97e728_2;


unsigned long long sub_97e728(st_97e728_4 *a0, long long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_97e728_4 *v3;  // x19
    st_97e728_0 *v4;  // x21
    unsigned long long v13;  // x8
    unsigned long v14;  // x9
    unsigned long long v5;  // x22
    long long v6;  // x8
    unsigned long long v7;  // x27
    st_97e728_3 *v8;  // x8
    st_97e728_3 *v9;  // x8
    unsigned long long v10;  // w26
    long long v11;  // x0
    unsigned long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = a0->field_20;
    v0 = 0;
    v5 = a2;
    v6 = a1;
    if (v4->field_88 >> 2 & 1)
    {
        if ((v4->field_a8 >> 1 & 1 || v4->field_90 == a1) && v4->field_98 == a2)
        {
            v6 = a1 + v4->field_a0;
            v5 = a2 - v4->field_a0;
        }
        else
        {
            goto LABEL_97e874;
        }
    }
    if (sub_97fe5c(v4, v6, v5, &v0))
    {
        v7 = v0;
        v8 = v3->field_0;
        do
        {
            v9 = v8;
            v10 = __ROL__(v9->field_70, 27) & 4160749571 & 3;
        } while (!v10 && (v8 = *(long long *)&v9->padding_0[64], *(long long *)&v9->padding_0[64]));
        if (v7)
        {
            v11 = sub_97724c(v4->field_78->field_a0);
            sub_98959c(v11, v4->field_80);
        }
        if (a3 & 1 && v7 == v5)
            sub_988eb8(v4->field_80->field_70);
        if (v10 != 2)
            sub_982d48(sub_977244(v4->field_78->field_a0), 0);
        v13 = v0;
        v14 = v4->field_88;
        if (v13 == v5)
        {
            if (!(v14 >> 2 & 1))
            {
                *(unsigned long long *)a4 = v5;
                return 1;
            }
            *(unsigned long long *)a4 = v4->field_98;
            v4->field_88 = v4->field_88 & 0xfffffffb;
            memset(&v4->field_90, 0, 24);
            return 1;
        }
        if (!(v14 >> 2 & 1))
        {
            if (v13)
            {
                v4->field_88 = (char)v14 | 4;
                v4->field_98 = a2;
                v4->field_a0 = v13;
                v4->field_90 = a1;
            }
            *(unsigned long long *)a4 = 0;
            if (*(int *)&v3[1].padding_8[4])
            {
                if (!(int)v3[1].field_0)
                    goto LABEL_97e91c;
LABEL_97e8cc:
                if (v3->field_20)
                {
                    v3->field_20->field_b8 = 3;
                    return 0;
                }
            }
        }
        else
        {
            v4->field_a0 = v4->field_a0 + v13;
            if (*(int *)&v3[1].padding_8[4])
            {
                if ((int)v3[1].field_0)
                    goto LABEL_97e8cc;
LABEL_97e91c:
                if (v3->field_18)
                {
                    *(unsigned int *)(v3->field_18 + 376) = 3;
                    return 0;
                }
            }
        }
    }
    else
    {
        *(unsigned long long *)a4 = 0;
LABEL_97e874:
        sub_97c738(v3);
    }
    return 0;
}
