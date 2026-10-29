/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fffd8..0xa001a8 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fffd8_0 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[48];
    void* field_98;
} st_9fffd8_0;


unsigned long long sub_9fffd8(st_9fffd8_0 *a0, long long a1)
{
    long long v3;  // x19
    void* v4;  // x23
    unsigned long long v13;  // 4118
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x0
    long long v17;  // x21
    unsigned long long v18;  // x22
    unsigned long v5;  // x20
    unsigned long long v6;  // x0
    long long v7;  // x1
    unsigned long long v8;  // x0
    unsigned long v9;  // x22
    unsigned long long v11;  // x0
    int v12;  // w8
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v4 = a0->field_98;
    v5 = (int)v4[32];
    if ((unsigned int)v5)
    {
        v6 = sub_9feb74(v5);
        if (!v6)
            return v6;
        if ((int)v5 < 4)
            v7 = 920;
        else
            v7 = 28;
        sub_a5ab14(v3, v7, v6);
        return 1;
    }
    else
    {
        if (a0->field_60)
        {
            v8 = sub_9e5ce8();
            if (!v8)
                return v8;
            sub_a5ce38();
        }
        else
        {
            v8 = 0;
        }
        if ((int)v4[8] < 1)
        {
            v16 = sub_9ff998();
            if (v16)
            {
                v17 = v16;
                v18 = sub_9fe82c();
                sub_9e5cfc(v8);
                if (!(unsigned int)v18)
                {
                    sub_9ffb3c(v17);
                    return 0;
                }
                sub_a5ab14(v3, 28, v17);
                return v18;
            }
        }
        else if (2 >= (unsigned int)(int)v4[8] && (v9 = *(int *)v4, v11 = sub_9ff998(), v11))
        {
            v6 = v11;
            if (0x7ff < (int)v9)
                v12 = 0x100;
            else
                v12 = 160;
            v13 = arm64g_calculate_condition(1, (int)v4[12], 1, 0);
            if (!(v13 & 1))
                v12 = (int)v4[12];
            if ((long long)v4[24])
                sub_a60e34(v6 + 8, sub_a50a58((long long)v4[24]), 0);
            if ((int)v4[8] == 1)
            {
                if (0 >= (int)sub_a62e78(0, v6 + 8, 1, v9, v12, &v0, v8))
                    goto LABEL_a00170;
LABEL_a00158:
                sub_9e5cfc(v8);
                sub_a5ab14(v3, 920, v6);
                return 1;
            }
            v15 = arm64g_calculate_condition(179, (int)v4[8], 1, 0);
            if (!(v15 & 1) && (int)sub_a62e5c(0, v6 + 8, 1, v9, v12, &v0, v8) > 0)
                goto LABEL_a00158;
LABEL_a00170:
            sub_9ffb3c(v6);
        }
        sub_9e5cfc(v8);
        return 0;
    }
}
