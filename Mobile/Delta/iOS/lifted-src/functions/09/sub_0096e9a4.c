/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96e9a4..0x96eae0 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96e9a4_3 {
    long long field_0;
    char padding_8[1608];
    struct st_96e9a4_2 *field_650;
    char padding_658[8];
    struct st_96e9a4_1 *field_660;
} st_96e9a4_3;

typedef struct st_96e9a4_2 {
    unsigned short field_0;
} st_96e9a4_2;

typedef struct st_96e9a4_0 {
    char padding_0[20];
    unsigned int field_14;
} st_96e9a4_0;

typedef struct st_96e9a4_1 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[2];
    unsigned int field_14;
    char padding_18[4];
    unsigned int field_1c;
    char padding_20[12];
    struct st_96e9a4_2 *field_2c;
} st_96e9a4_1;

typedef struct st_96e9a4_4 {
    char field_0;
    char padding_1[7];
    struct st_96e9a4_3 *field_8;
    char padding_10[104];
    struct st_96e9a4_2 *field_78;
    char padding_80[872];
    struct st_96e9a4_2 *field_3e8;
    char padding_3f0[8];
    struct st_96e9a4_2 *field_3f8;
} st_96e9a4_4;


unsigned short * sub_96e9a4(st_96e9a4_4 *a0, st_96e9a4_0 *a1, unsigned short *a2, long long a3)
{
    unsigned long v4;  // x0
    unsigned long long v5;  // x8
    unsigned short *v6;  // x0
    unsigned short *v7;  // x9
    unsigned int *v9;  // x15
    unsigned short *v10;  // x17
    unsigned short *v11;  // x17
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_14;
    if ((unsigned int)v4)
        sub_a9976c(v4);
    if ((int)sub_a5b5fc(a3, a0->field_8->field_0) < 1)
        return 0;
    v5 = 2898;
    if (!(int)a0->field_78)
        v5 = 2896;
    if ((&a0->field_0)[v5] == 2)
    {
        return 1;
    }
    else if (a2)
    {
        if (!a0->field_3e8)
            return 1;
        v6 = sub_af3b48(a2, &v1, &v0, 0, 0);
        if (!(unsigned int)v6)
        {
            return v6;
        }
        else if (a0->field_3f8)
        {
            v7 = 0;
            do
            {
                if (a0->field_8->field_650)
                {
                    v9 = &a0->field_8->field_660->field_1c;
                    v10 = a0->field_8->field_650;
                    do
                    {
                        v11 = v10;
                        if (*(short *)((char *)v9 - 12) == *(short *)((char *)a0->field_3e8 + 0x2 * v7) && v9[4] && v1 == *(int *)((char *)v9 - 8))
                        {
                            if (v0 == *v9)
                                return 1;
                            break;
                        }
                    } while ((v9 += 18, v10 = (char *)v11 - 1, v11 != 1));
                }
            } while ((v7 = (char *)v7 + 1, v7 != a0->field_3f8));
        }
    }
    return 0;
}
