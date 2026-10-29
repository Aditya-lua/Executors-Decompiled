/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c4de8..0x9c4f78 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c4de8_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_9c4de8_0;


st_9c4de8_0 * sub_9c4de8(st_9c4de8_0 *a0, void* a1, unsigned int a2)
{
    unsigned int v8;  // w22
    st_9c4de8_0 *v9;  // x21
    unsigned int v18;  // w9
    unsigned long long v10;  // 4112
    unsigned int v11;  // w8
    unsigned long long v12;  // 4127
    st_9c4de8_0 *v13;  // w23
    unsigned long long v14;  // 4142
    st_9c4de8_0 *v15;  // x19
    unsigned long long v16;  // 4124
    unsigned int v17;  // w8
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a2;
    v9 = a0;
    if (a2 == 24)
    {
        v13 = (st_9c4de8_0 *)1;
        v15 = v9;
        if (!v15)
        {
LABEL_9c4e80:
            v15 = sub_9c7910();
            if (!v15)
                return v15;
        }
    }
    else if (v8 != 23)
    {
        v10 = arm64g_calculate_condition(0x11, v8, 1, 0);
        if (v10 & 1)
            goto LABEL_9c4e58;
        v11 = (int)a1[20] - 150;
        v12 = arm64g_calculate_condition(33, v11, 100, 0);
        v13 = (st_9c4de8_0 *)(unsigned int)!(v12 & 1);
        v14 = arm64g_calculate_condition(33, v11, 100, 0);
        if (v14 & 1)
            v8 = 23;
        else
            v8 = 24;
        v15 = v9;
        if (!v15)
            goto LABEL_9c4e80;
    }
    else
    {
        v16 = arm64g_calculate_condition(33, (int)a1[20] - 150, 100, 0);
        if (!(v16 & 1))
        {
LABEL_9c4e58:
            v15 = 0;
            goto LABEL_9c4eb4;
        }
        v13 = (st_9c4de8_0 *)0;
        v8 = 23;
        v15 = v9;
        if (!v15)
            goto LABEL_9c4e80;
    }
    if (sub_9c7770(v15, 0, 20))
    {
        v15->field_4 = v8;
        v17 = (int)a1[16];
        if (v17 != 0x7fffffff)
        {
            v18 = (int)a1[20];
            if (!v13)
            {
                v4 = (int)a1[4];
                v5 = *(int *)a1;
                v2 = (int)a1[12];
                v3 = (int)a1[8];
                v0 = v18 - 100 * ((v18 * 1374389535 >> 63) + ((int)(v18 * 1374389535) >> 37));
                v1 = v17 + 1;
                v15->field_0 = sub_9d5b44();
                return v15;
            }
            else if (0x7ffff893 >= (int)v18)
            {
                v4 = (int)a1[4];
                v5 = *(int *)a1;
                v2 = (int)a1[12];
                v3 = (int)a1[8];
                v0 = v18 + 1900;
                v1 = v17 + 1;
                v15->field_0 = sub_9d5b44();
                return v15;
            }
        }
    }
LABEL_9c4eb4:
    if (v15 != v9)
        sub_9c7940(v15);
    return 0;
}
