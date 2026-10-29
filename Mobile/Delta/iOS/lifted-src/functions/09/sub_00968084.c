/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968084..0x968218 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_968084_2 {
    char padding_0[1648];
    struct st_968084_0 *field_670;
    unsigned long long field_678;
} st_968084_2;

typedef struct st_968084_1 {
    char field_0;
    char field_1;
} st_968084_1;

typedef struct st_968084_3 {
    char padding_0[216];
    void* field_d8;
} st_968084_3;

typedef struct st_968084_0 {
    char padding_0[16];
    struct st_968084_1 *field_10;
    char padding_18[4];
    unsigned short field_1c;
} st_968084_0;

typedef struct st_968084_4 {
    char padding_0[8];
    struct st_968084_2 *field_8;
    char padding_10[8];
    struct st_968084_3 *field_18;
} st_968084_4;


unsigned int sub_968084(st_968084_4 *a0, unsigned int a1, long long a2, unsigned long long a3, unsigned int a4, unsigned int a5)
{
    unsigned long v2;  // x8
    st_968084_0 *iter;  // x23
    char *v12;  // x19
    unsigned int v13;  // w8
    unsigned long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long v6;  // x22
    unsigned long long v7;  // x8
    unsigned long long v8;  // 4113
    unsigned long v9;  // x21
    unsigned int v10;  // w24
    unsigned long long v11;  // 4122
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8->field_678;
    if (a0->field_8->field_678)
    {
        iter = a0->field_8->field_670;
        while (1)
        {
            v4 = v2;
            if (iter->field_1c == a1)
                break;
            iter = &iter[1].padding_18[2];
            v2 = v4 - 1;
            if (v4 == 1)
            {
                iter = 0;
                break;
            }
        }
        if (a5)
            goto LABEL_9680d4;
    }
    else
    {
        iter = 0;
        if (a5)
        {
LABEL_9680d4:
            *(unsigned int *)a5 = 0;
        }
    }
    if (!iter)
        return 0;
    v5 = 40;
    if (!((int)a0->field_18->field_d8[80] & 8))
        v5 = 32;
    v6 = *(int *)&iter->padding_0[v5];
    v7 = 44;
    v8 = arm64g_calculate_condition(9, (int)a0->field_18->field_d8[80] & 8, 0, 0);
    if (v8 & 1)
        v7 = 36;
    if (v6 >> 31 & 1)
        return 0;
    v9 = *(int *)&iter->padding_0[v7];
    if (v9 >> 31 & 1)
        return 0;
    if ((unsigned int)v9)
    {
        v10 = 1 > (int)sub_9ae69c(a0, a2, v9);
        if ((unsigned int)v6)
            goto LABEL_968140;
    }
    else
    {
        v10 = 1;
        if ((unsigned int)v6)
        {
LABEL_968140:
            if ((int)sub_9ae69c(a0, a3, v6) < 0)
                v10 = 0;
        }
    }
    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a5 && (unsigned int)a3 == 772 && v10)
    {
        v11 = arm64g_calculate_condition(33, (unsigned int)v9 - 772, 0x303, 0);
        *(unsigned int *)a5 = !(v11 & 1);
    }
    if (a4 && !(v12 = &iter->field_10->field_0, *v12 == 69 && v12[1] == 67 && !v12[2] || !_strcmp(v12, "X25519")))
        v13 = !_strcmp(v12, "X448");
    else
        v13 = 1;
    return v13 & v10;
}
