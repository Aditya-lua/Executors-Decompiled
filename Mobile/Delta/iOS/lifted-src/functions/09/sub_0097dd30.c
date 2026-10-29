/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97dd30..0x97df60 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97dd30_2 {
    struct st_97dd30_0 *field_0;
    char padding_8[16];
    struct st_97dd30_1 *field_18;
} st_97dd30_2;

typedef struct st_97dd30_1 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
    char padding_152[2];
    unsigned int field_154;
    char padding_158[24];
    long long field_170;
} st_97dd30_1;

typedef struct st_97dd30_0 {
    char padding_0[88];
    long long field_58;
} st_97dd30_0;

extern long long g_97fe00;

unsigned long long sub_97dd30(st_97dd30_2 *a0, unsigned long long a1, unsigned long long a2)
{
    st_97dd30_1 *v4;  // x21
    unsigned long long v6;  // x22
    unsigned long long v7;  // w0
    unsigned long long v8;  // x23
    unsigned long long v9;  // x0
    unsigned long long v10;  // w8
    st_97dd30_1 *v0;  // [bp-0x50]
    unsigned int v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_18;
    if (a2)
        sub_ad9384(sub_c4ba8(a0->field_0->field_58));
    if (v4->field_150 >> 5 & 1 || sub_977368(v4->field_a0))
    {
        goto LABEL_97df04;
    }
    else
    {
        v6 = (unsigned int)a1 & 1;
        if (a1 >> 2 & 1 || sub_979844(v4->field_a0, v6))
        {
LABEL_97de14:
            v8 = sub_979864(v4->field_a0, v6);
            if (v8)
            {
                v9 = sub_97ed78(v4, v8);
                if (v9)
                {
                    v4->field_150 = v4->field_150 | 16;
                    v10 = *(int *)&v4->padding_158[16];
                    if (!*(int *)&v4->padding_158[16])
                    {
                        if (!v4->field_154)
                            v10 = 1;
                        else
                            v10 = 2;
                    }
                    sub_979b18(v4->field_a0, v10 == 2, v4->field_170);
                    if (!a2)
                        return v9;
LABEL_97ddd0:
                    sub_ad93b4(sub_c4ba8(a0->field_0->field_58));
                    return v9;
                }
            }
            else
            {
                sub_97c738(a0);
            }
        }
        else
        {
            if (!(a1 >> 1 & 1) && sub_980e14(a0->field_0))
            {
                v0 = v4;
                v1 = v6;
                sub_97b8d8(a0->field_0->field_58, 0);
                v7 = (unsigned int)sub_982de8(sub_97b868(a0->field_0->field_58), &g_97fe00, &v0, 0);
                if (v4->field_150 >> 5 & 1 || sub_977368(v4->field_a0) || !sub_97733c(v4->field_a0))
                {
LABEL_97df04:
                }
                else if (0 < v7)
                {
                    goto LABEL_97de14;
                }
            }
            sub_97c738();
            v8 = 0;
        }
        sub_a6c2e4(0, "ssl/quic/quic_impl.c", 2336);
        sub_989488(sub_97724c(v4->field_a0), v8);
        v9 = 0;
        if (!a2)
            return 0;
        goto LABEL_97ddd0;
    }
}
