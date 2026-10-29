/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8894..0xae8aac (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae8894_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae8894_1 *field_8;
} st_ae8894_0;

typedef struct st_ae8894_2 {
    struct st_ae8894_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_ae8894_2;

typedef struct st_ae8894_1 {
    long long field_0;
} st_ae8894_1;


unsigned long long sub_ae8894(st_ae8894_0 *a0, long long *a1)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // w25
    unsigned long long v12;  // w25
    unsigned long long v13;  // x0
    unsigned long long v4;  // x22
    st_ae8894_2 *v5;  // x0
    st_ae8894_2 *v6;  // x23
    unsigned long long v7;  // w26
    unsigned long long v8;  // x0
    unsigned long long v9;  // x22
    st_ae8894_2 *v10;  // x0
    st_ae8894_2 *v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!(unsigned int)v2)
        v2 = sub_a99eac(*(long long *)a0->field_8) == 1208;
    if ((int)sub_ad69e4(*a1) >= 1)
    {
        v3 = 0;
        v4 = 0;
        do
        {
            v5 = sub_ad69f8(*a1, v4);
            if ((unsigned int)v2 == v5->field_0->field_0)
            {
                v6 = v5;
                if ((unsigned int)v2 || !sub_a9ae30(*(long long *)a0->field_8, *(long long *)v5->field_0->field_8))
                {
                    v7 = !v6->field_10;
                    if (v6->field_8)
                    {
                        if (!sub_9c1c08(v6->field_8, 0) || !sub_9e4828())
                            v7 = 0;
                        sub_9e48d4();
                    }
                    if (!v7)
                    {
                        return 49;
                    }
                    else if (v3 != 2)
                    {
                        v8 = sub_ae8f94(v2, a0, v6->field_0);
                        if ((unsigned int)v8)
                        {
                            if (1 >= v3)
                                v3 = 1;
                            if ((unsigned int)v8 != 47)
                                return v8;
                        }
                        else
                        {
                            v3 = 2;
                        }
                    }
                }
            }
        } while ((v4 = (unsigned int)v4 + 1, (int)sub_ad69e4(*a1) > (int)v4));
        if (v3 == 1)
            return 47;
    }
    if ((int)sub_ad69e4(a1[1]) < 1)
        return 0;
    v9 = 0;
    do
    {
        v10 = sub_ad69f8(a1[1], v9);
        if ((unsigned int)v2 == v10->field_0->field_0)
        {
            v11 = v10;
            if ((unsigned int)v2 || !sub_a9ae30(*(long long *)a0->field_8, *(long long *)v10->field_0->field_8))
            {
                v12 = !v11->field_10;
                if (v11->field_8)
                {
                    if (!sub_9c1c08(v11->field_8, 0) || !sub_9e4828())
                        v12 = 0;
                    sub_9e48d4();
                }
                if (!v12)
                    return 49;
                v13 = sub_ae8f94(v2, a0, v11->field_0);
                if ((unsigned int)v13 != 47)
                    return v13;
            }
        }
    } while ((v9 = (unsigned int)v9 + 1, (int)sub_ad69e4(a1[1]) > (int)v9));
    return 0;
}
