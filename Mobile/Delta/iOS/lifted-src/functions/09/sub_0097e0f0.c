/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e0f0..0x97e438 (840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e0f0_3 {
    char padding_0[120];
    struct st_97e0f0_1 *field_78;
    struct st_97e0f0_2 *field_80;
} st_97e0f0_3;

typedef struct st_97e0f0_1 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97e0f0_1;

typedef struct st_97e0f0_0 {
    char padding_0[88];
    long long field_58;
} st_97e0f0_0;

typedef struct st_97e0f0_2 {
    char padding_0[112];
    long long field_70;
} st_97e0f0_2;

extern long long g_97ff2c;

char sub_97e0f0(unsigned long a0, long long a1, char a2, long long a3, unsigned long long *a4)
{
    unsigned long v16;  // x8
    unsigned long long v25;  // x0
    char iter;  // x8
    char v17;  // x23
    st_97e0f0_3 *v18;  // x23
    char v19;  // x24
    long long v20;  // x0
    char v22;  // x9
    st_97e0f0_1 *v23;  // x19
    long long v24;  // x3
    char v0;  // [bp-0xb4]
    st_97e0f0_0 *v1;  // [bp-0xb0]
    char v2;  // [bp-0x98]
    char v3;  // [bp-0x90]
    char v4;  // [bp-0x88]
    char v5;  // [bp-0x7c]
    char v6;  // [bp-0x78]
    st_97e0f0_3 *v7;  // [bp-0x70]
    long long v8;  // [bp-0x68]
    unsigned long long v9;  // [bp-0x60]
    char v10;  // [bp-0x58]
    unsigned int v11;  // [bp-0x50]
    long long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    *a4 = 0;
    if (a2)
    {
        if (!sub_97f48c())
            return 0;
    }
    else
    {
        if (sub_97f48c())
        {
            sub_ad9384(sub_c4ba8(v1->field_58));
            v5 = 1;
            if (v4)
            {
                if (!v3)
                    goto LABEL_97e188;
                v16 = v3 + 184;
                goto LABEL_97e184;
            }
            else if (v2)
            {
                v16 = v2 + 376;
LABEL_97e184:
                *(unsigned int *)v16 = 0;
            }
        }
        else
        {
            return 0;
        }
    }
LABEL_97e188:
    if (v3)
    {
        v17 = !(*(char *)(v3 + 168) & 1);
        if (!(a3 & 0xfffffffe))
            goto LABEL_97e1c8;
LABEL_97e1a4:
    }
    else
    {
        v17 = 1;
        if (a3 & 0xfffffffe)
            goto LABEL_97e1a4;
LABEL_97e1c8:
        if ((unsigned short)(*(short *)(v2 + 336)) >> 5 & 1 || sub_977368(*(long long *)(v2 + 160)))
        {
            goto LABEL_97e400;
        }
        else
        {
            if ((int)sub_97d854(&v1) < 1)
            {
                sub_ad93b4(sub_c4ba8(v1->field_58));
                return 0;
            }
            if (!a2)
            {
                if (!(a3 & 1))
                {
                    sub_ad93b4(sub_c4ba8(v1->field_58));
                    return 1;
                }
                iter = (char)v1;
                do
                {
                } while (!(__ROL__(*(char *)(iter + 112), 27) & 3) && (iter = *(long long *)(iter + 64), iter));
                sub_97e578();
                sub_ad93b4(sub_c4ba8(v1->field_58));
                return 1;
            }
            if (sub_97e490(v3, &v0))
            {
                if (!sub_980e14(v1))
                {
                    v24 = a3;
                    if (v17 & 1)
                        v25 = sub_97e728(&v1, a1, a2, v24, a4);
                    else
                        v25 = sub_97e5f8(&v1, a1, a2, v24, a4);
                    sub_ad93b4(sub_c4ba8(v1->field_58));
                    return v25;
                }
                v18 = (st_97e0f0_3 *)v3;
                v6 = 0;
                if (sub_97fe5c(v18, a1, a2, &v6))
                {
                    v19 = v6;
                    if (v19)
                    {
                        v20 = sub_97724c(v18->field_78->field_a0);
                        sub_98959c(v20, v18->field_80);
                    }
                    if (a3 & 1 && v19 == a2)
                        sub_988eb8(v18->field_80->field_70);
                    sub_982d48(sub_977244(v18->field_78->field_a0), 0);
                    v22 = v6;
                    *a4 = v22;
                    if (a2 == v22)
                    {
                        sub_ad93b4(sub_c4ba8(v1->field_58));
                        return 1;
                    }
                    v7 = v18;
                    v8 = a1 + v22;
                    v9 = a2 - v22;
                    v10 = 0;
                    v11 = 786691;
                    v12 = a3;
                    sub_97b8d8(v1->field_58, 0);
                    if ((int)sub_982de8(sub_97b868(v1->field_58), &g_97ff2c, &v7, 0) > 0)
                    {
                        *a4 = *a4 + v10;
                        sub_ad93b4(sub_c4ba8(v1->field_58));
                        return 1;
                    }
                    v23 = v18->field_78;
                    if (v23->field_150 >> 5 & 1 || sub_977368(v23->field_a0) || !sub_97733c(v23->field_a0))
LABEL_97e400:
                }
                else
                {
                    *a4 = 0;
                }
            }
        }
    }
    sub_97c738(&v1);
    sub_ad93b4(sub_c4ba8(v1->field_58));
    return 0;
}
