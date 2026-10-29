/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa45f58..0xa461a8 (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a45f58_4 {
    char padding_0[12];
    char field_c;
} st_a45f58_4;

typedef struct st_a45f58_2 {
    char field_0[13];
    char field_5;
} st_a45f58_2;

typedef struct st_a45f58_0 {
    char padding_0[280];
    char field_118;
    char padding_119[7];
    unsigned int field_120;
    char padding_124[4];
    unsigned int field_128;
    unsigned int field_12c;
    unsigned int field_130;
} st_a45f58_0;

typedef struct st_a45f58_5 {
    char padding_0[360];
    struct st_a45f58_5 *field_168;
} st_a45f58_5;

typedef struct st_a45f58_1 {
    char padding_0[40];
    unsigned int field_28;
} st_a45f58_1;

typedef struct st_a45f58_3 {
    char padding_0[11];
    char field_b;
} st_a45f58_3;


unsigned long long sub_a45f58(st_a45f58_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long ptr)
{
    unsigned long long v2;  // x21
    st_a45f58_0 *v3;  // x8
    unsigned long long v12;  // 4118
    st_a45f58_0 *v13;  // x22
    unsigned int *v16;  // x23
    unsigned long long v17;  // x19
    st_a45f58_5 *v18;  // x0
    st_a45f58_0 *v19;  // x22
    unsigned long long v20;  // x0
    unsigned long long v21;  // x0
    st_a45f58_2 *v4;  // x0
    unsigned long long v22;  // 4118
    unsigned long v5;  // x8
    st_a45f58_0 *v6;  // x20
    st_a45f58_3 *v7;  // x0
    st_a45f58_4 *v8;  // x0
    unsigned long long v9;  // w8
    unsigned long v10;  // x21
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9ffdd8();
    if (a1 <= 16)
    {
        v16 = &v3->field_118;
        if (8 >= a1)
        {
            switch (a1)
            {
            case 0:
                *(double *)&v3->field_128 = 2.54639494955e-313;
                *(unsigned long long *)v16 = 0;
                *(unsigned long long *)&v16[2] = 0;
                v3->field_130 = 0xffffffff;
                break;
            case 8:
                v17 = v3;
                v18 = sub_9ffdd8(ptr);
                if (*(long long *)(v17 + 360))
                {
                    if (*(long long *)(v17 + 360) == v17)
                    {
                        v18->field_168 = v18;
                        break;
                    }
                    else
                    {
                        return 0;
                    }
                }
                break;
            default:
                return 0xffffffff;
            }
        }
        else
        {
            switch (a1)
            {
            case 9:
                v2 = 15 - v2;
LABEL_a46094:
                v22 = arm64g_calculate_condition(49, (unsigned int)v2 - 9, 7, 0);
                if (v22 & 1)
                    return 0;
                v3->field_128 = v2;
                break;
            case 16:
                v19 = v3;
                v20 = sub_a50720(a0);
                if (!(unsigned int)v20)
                    return v20;
                if (v19->field_120)
                {
                    v21 = sub_a94058(&v19[1].padding_0[4], ptr, (int)v2);
                    if (!v21)
                        return v21;
                    v16[1] = 0;
                    v16[2] = 0;
                    *(unsigned int *)v19->padding_124 = 0;
                    return 1;
                }
                goto LABEL_a46150;
            default:
                return 0xffffffff;
            }
        }
    }
    else if (a1 > 19)
    {
        if (a1 == 20)
            goto LABEL_a46094;
        if (a1 != 22)
        {
            if (a1 == 37)
                *(unsigned int *)ptr = 15 - v3->field_128;
            else
                return 0xffffffff;
        }
        else
        {
            if ((unsigned int)v2 == 13)
            {
                v4 = sub_a507c8(a0);
                v5 = *(long long *)(ptr + 5);
                *(long long *)&v4->field_0[0] = *(long long *)ptr;
                *(unsigned long *)&v4->field_0[5] = v5;
                v6 = v3;
                v6->field_130 = 13;
                v7 = sub_a507c8(a0);
                v8 = sub_a507c8(a0);
                v9 = v8->field_c | v7->field_b * 0x100;
                v10 = v9 - 8;
                if (8 <= v9)
                {
                    if (!sub_a50720(a0))
                    {
                        v11 = v6->field_12c;
                        if ((int)((unsigned int)v10 & 0xffff) >= (int)v11)
                        {
                            v10 -= v11;
                            *(char *)(sub_a507c8(a0) + 11) = __ROL__((unsigned int)v10, 24);
                            *(char *)(sub_a507c8(a0) + 12) = v10;
                            return v6->field_12c;
                        }
                    }
                    else
                    {
                        v10 = v10;
                        *(char *)(sub_a507c8(a0) + 11) = __ROL__((unsigned int)v10, 24);
                        *(char *)(sub_a507c8(a0) + 12) = v10;
                        return v6->field_12c;
                    }
                }
            }
LABEL_a46150:
            return 0;
        }
    }
    else if (a1 == 0x11)
    {
        if (v2 & 1)
            return 0;
        v12 = arm64g_calculate_condition(49, (unsigned int)v2 - 0x11, 13, 0);
        if (v12 & 1)
            return 0;
        v13 = v3;
        if (ptr && sub_a50720(a0))
            goto LABEL_a46150;
        if (ptr)
        {
            v13->field_120 = 1;
            _memcpy(sub_a507c8(a0), ptr, v2 & 0xffffffff);
        }
        v13->field_12c = v2;
    }
    else if (a1 != 18)
    {
        return 0xffffffff;
    }
    else if ((unsigned int)v2 == 4)
    {
        a0->field_28 = *(int *)ptr;
    }
    else
    {
        return 0;
    }
    return 1;
}
