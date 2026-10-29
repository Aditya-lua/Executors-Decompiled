/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c8ac..0x97cb10 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c8ac_1 {
    int field_0;
    char padding_4[84];
    long long field_58;
    char padding_60[24];
    struct st_97c8ac_0 *field_78;
    long long field_80;
    char padding_88[40];
    unsigned int field_b0;
} st_97c8ac_1;

typedef struct st_97c8ac_2 {
    char padding_0[256];
    unsigned long long field_100;
} st_97c8ac_2;

typedef struct st_97c8ac_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[128];
    char field_128;
    char padding_129[31];
    unsigned long long field_148;
    unsigned short field_150;
} st_97c8ac_0;


unsigned long long sub_97c8ac(st_97c8ac_1 *a0)
{
    st_97c8ac_1 *v2;  // x19
    unsigned int v3;  // w8
    unsigned long v12;  // x9
    long long v13;  // x0
    long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned int v16;  // x20
    unsigned int v19;  // x0
    unsigned int v4;  // x22
    st_97c8ac_0 *v5;  // x20
    unsigned int idx;  // x21
    long long v10;  // x0
    st_97c8ac_2 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = a0;
        v3 = a0->field_0;
        if (129 >= (int)v3)
        {
            if (v3 != 128)
            {
                if (v3 != 129)
                    goto LABEL_97c928;
                v4 = 0;
                v5 = v2->field_78;
                idx = (unsigned int)v2;
            }
            else
            {
                idx = *(long long *)&v2->field_b0;
                v4 = 1;
                v5 = v2;
            }
            sub_ad9384(sub_c4ba8(v2->field_58));
            if (v4 & 1)
            {
                if (*(long long *)&v5->padding_a8[8])
                {
                    sub_ad93b4(sub_c4ba8(v2->field_58));
                    sub_95eea4(*(long long *)&v5->padding_a8[8]);
                    sub_ad9384(sub_c4ba8(v2->field_58));
                    *(unsigned long long *)&v5->padding_a8[8] = 0;
                }
                if (!(~v5->field_150 & 9))
                {
                    sub_989fc4(&v5->field_128);
                    sub_c6366c(&v5->field_128);
                }
                sub_97c7f4(v5, 1);
                if (*(long long *)&v5->padding_0[128])
                    sub_95eea4(*(long long *)&v5->padding_0[128]);
                if (*(long long *)&v5->padding_0[0x88])
                    return sub_95eea4();
                return *(long long *)&v5->padding_0[0x88];
            }
            else
            {
                v5->field_148 = v5->field_148 - 1;
                if (1 >= *(char *)(*(long long *)(idx + 128) + 0x101) - 1 && !sub_988ecc(*(long long *)(*(long long *)(idx + 128) + 112), 0))
                {
                    v10 = sub_97724c(v5->field_a0);
                    sub_989934(v10, *(long long *)(idx + 128), 0);
                }
                v11 = *(long long *)(idx + 128);
                v12 = *(long long *)(*(long long *)(idx + 128) + 0x100);
                if (1 >= (((unsigned int)v12 * 0x10000 | (unsigned int)v12 >> 16) & 0xff) - 1)
                {
                    v13 = sub_97724c(v5->field_a0);
                    sub_989c00(v13, *(long long *)(idx + 128), 0);
                    v11 = *(long long *)(idx + 128);
                    v12 = v11->field_100;
                }
                v11->field_100 = v12 | 0x2000000000;
                v14 = sub_97724c(v5->field_a0);
                sub_98959c(v14, *(long long *)(idx + 128));
                v15 = sub_ad93b4(sub_c4ba8(v2->field_58));
                if (idx == *(long long *)&v5->padding_a8[8])
                    return v15;
                return sub_95eea4();
            }
        }
        if (v3 == 130)
        {
            v16 = *(long long *)&v2->padding_88[0];
            if (v16)
            {
                sub_9d5018(sub_97725c(v16));
                sub_9d5018(sub_975fec(v16));
                v19 = *(long long *)&v2->padding_88[0];
            }
            else
            {
                v19 = 0;
            }
            sub_9816f8(v19);
            sub_981120(*(long long *)&v2->padding_88[0]);
            if (v2->field_78)
                return sub_95eea4();
            sub_97b82c(v2->field_80);
        }
        else if (v3 == 131)
        {
            sub_97b82c(v2->field_78);
        }
        else
        {
LABEL_97c928:
        }
    }
    else
    {
        goto LABEL_97c928;
    }
}
