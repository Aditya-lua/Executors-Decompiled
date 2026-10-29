/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f904..0x97fb98 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97f904_1 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[8];
    unsigned long long field_b0;
    char padding_b8[152];
    unsigned short field_150;
    char padding_152[30];
    long long field_170;
} st_97f904_1;

typedef struct st_97f904_2 {
    struct st_97f904_0 *field_0;
    char padding_8[16];
    struct st_97f904_1 *field_18;
    unsigned long long field_20;
    unsigned int field_28;
} st_97f904_2;

typedef struct st_97f904_0 {
    char padding_0[88];
    long long field_58;
    char padding_60[16];
    char field_70;
} st_97f904_0;

extern long long g_97fcc8;

unsigned long long sub_97f904(st_97f904_2 *a0, unsigned long long a1)
{
    unsigned long long idx;  // x19
    unsigned long v8;  // x8
    unsigned long long v19;  // x8
    unsigned long long v20;  // x21
    unsigned long long v21;  // 4106
    unsigned long long v22;  // w8
    long long v9;  // x21
    unsigned long long v10;  // x0
    st_97f904_0 *v11;  // x8
    st_97f904_0 *v12;  // x9
    unsigned long long v13;  // w10
    unsigned long long v15;  // x0
    long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    st_97f904_2 *v3;  // [bp-0x50]
    long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    idx = a0->field_18;
    v8 = *(short *)(idx + 336);
    if (v8 >> 4 & 1 || !*(int *)(idx + 340))
        goto LABEL_97fa6c;
    v9 = !((unsigned int)v8 & 2);
    v10 = sub_98952c(sub_97724c(*(long long *)(idx + 160)), v9);
    if (!v10)
    {
        v10 = sub_98952c(sub_97724c(*(long long *)(idx + 160)), v9 | 2);
        if (!v10)
        {
            v11 = a0->field_0;
            while (1)
            {
                v12 = v11;
                switch (v13)
                {
                case 0:
                    v11 = *(long long *)&v12->padding_0[64];
                    goto LABEL_97f9c4;
                case 2:
                    goto LABEL_97f9d4;
                default:
LABEL_97f9c4:
                    sub_982d48(sub_97b868(a0->field_0->field_58), 0);
                }
            }
LABEL_97f9d4:
            v10 = sub_98952c(sub_97724c(*(long long *)(idx + 160)), v9);
            if (!v10)
            {
                if (a1)
                    return 0;
                if (sub_977368(*(long long *)(idx + 160)))
                    goto LABEL_97fa6c;
                if (!sub_980e14(a0->field_0))
                {
                    if (!*(int *)&a0[1].padding_8[0])
                    {
                        return 0;
                    }
                    else if (a0->field_28)
                    {
                        if (!a0->field_20)
                            return 0;
                        *(unsigned int *)(a0->field_20 + 184) = 2;
                        return 0;
                    }
                    else
                    {
                        if (!a0->field_18)
                            return 0;
                        *(unsigned int *)&a0->field_18[1].padding_0[0] = 2;
                        return 0;
                    }
                }
                v1 = idx;
                v2 = 0;
                v3 = a0;
                v4 = v9;
                v15 = sub_97d380(a0, &g_97fcc8, &v1);
                if ((unsigned int)v15)
                {
                    if (v15 >> 31 & 1)
                        return 0;
                    v10 = v2;
                    if (!v10)
                        return 0;
                    goto LABEL_97f9ec;
                    goto LABEL_97f9ec;
                }
LABEL_97fa6c:
                sub_97c738();
                return 0;
            }
        }
    }
LABEL_97f9ec:
    sub_989228(sub_977254(*(long long *)(idx + 160)), &v0);
    sub_989ce8(sub_97724c(*(long long *)(idx + 160)), v10, v0);
    v19 = sub_97ed78(idx, v10);
    v20 = *(long long *)(idx + 176);
    if (v20 != v19)
    {
        *(unsigned long long *)(idx + 176) = v19;
        if (v19)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v21 = arm64g_calculate_condition(19, /* unsupported instruction */, 1, 0);
            if (!(v21 & 1))
                /* unsupported instruction */;
        }
        else
        {
            sub_95efac(idx);
        }
        if (v20)
            sub_95eea4(v20);
        if (*(long long *)(idx + 176))
            goto LABEL_97fa9c;
    }
    else if (v19)
    {
LABEL_97fa9c:
        *(unsigned short *)(idx + 336) = *(short *)(idx + 336) | 16;
        v22 = *(int *)(idx + 360);
        if (!*(int *)(idx + 360))
        {
            if (!*(int *)(idx + 340))
                v22 = 1;
            else
                v22 = 2;
        }
        sub_979b18(*(long long *)(idx + 160), v22 == 2, *(long long *)(idx + 368));
        return 1;
    }
    goto LABEL_97fa6c;
}
