/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c440..0x97c738 (760 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c440_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[360];
    long long field_178;
    char padding_180[752];
    unsigned long long field_470;
    char padding_478[600];
    unsigned long long field_6d0;
} st_97c440_0;

typedef struct st_97c440_1 {
    char padding_0[312];
    unsigned long long field_138;
    unsigned int field_140;
} st_97c440_1;


void* sub_97c440(st_97c440_0 *a0)
{
    unsigned long long v10;  // x0
    void* v11;  // x19
    unsigned short v12;  // x0
    unsigned short idx;  // x0
    unsigned long v14;  // x8
    unsigned long v15;  // x8
    unsigned short v16;  // x0
    unsigned short v17;  // x0
    unsigned short v18;  // x0
    st_97c440_1 *v19;  // x8
    unsigned short v0;  // [bp-0x80]
    unsigned short v1;  // [bp-0x70]
    st_97c440_0 *v2;  // [bp-0x68]
    unsigned short v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    unsigned short v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38], Other Possible Types: unsigned short
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = sub_980dbc();
    if (a0->field_8 == v10)
    {
        sub_97c738(0);
        return 0;
    }
    v11 = sub_a6bffc(384, "ssl/quic/quic_impl.c", 605);
    if (!v11)
    {
        sub_97c738();
        return v11;
    }
    v12 = sub_ad9324();
    *(unsigned long long *)&v11[168] = v12;
    if (!v12)
    {
LABEL_97c650:
        sub_97c738();
        sub_97c7f4(v11, 0);
        sub_a6c2e4(v11, "ssl/quic/quic_impl.c", 679);
        return 0;
    }
    idx = sub_95e81c(a0, v11, sub_954154());
    *(unsigned long long *)&v11[120] = idx;
    if (idx && !(v14 = *(int *)idx, (unsigned int)v14 && (!(v14 >> 7 & 1) || (idx = sub_980dc8(), !idx))))
    {
        *(unsigned long long *)(idx + 352) = *(long long *)(idx + 352) | 0x6000;
        *(unsigned long long *)(idx + 2480) = *(long long *)(idx + 2480) & 0x3df6ffb85;
        *(unsigned int *)(idx + 2988) = 0;
        v15 = a0->field_6d0;
        *(unsigned short *)&v11[336] = (unsigned short)v15 * 2 & 8 | (short)v11[336] & 0xfffffff1;
        v3 = 0;
        v0 = 0;
        v1 = 0;
        v4 = a0->field_0;
        v5 = a0->field_470;
        v6 = (long long)v11[168];
        v7 = 0;
        if (v15 >> 2 & 1 || (v15 & 10) == 10)
            v7 = 1;
        v16 = sub_97b7ac(&v4);
        *(unsigned long long *)&v11[144] = v16;
        if (v16)
        {
            v2 = a0;
            v17 = sub_97b928();
            *(unsigned long long *)&v11[152] = v17;
            if (v17)
            {
                v18 = sub_981510();
                *(unsigned long long *)&v11[160] = v18;
                if (!v18)
                {
                    sub_97c738();
                    sub_981120((long long)v11[152]);
                    *(unsigned long long *)&v11[152] = 0;
LABEL_97c700:
                    sub_97b82c((long long)v11[144]);
                    *(unsigned long long *)&v11[144] = 0;
                    sub_97c7f4(v11, 0);
                    sub_a6c2e4(v11, "ssl/quic/quic_impl.c", 679);
                    return 0;
                }
                sub_979b34();
                sub_979ba4((long long)v11[160], a0->field_178);
                if (sub_c61f30(v11, a0, 128, 0, (long long)v11[144], (long long)v11[152]))
                {
                    *(unsigned int *)&v11[340] = 1;
                    v19 = (long long)v11[8];
                    *(unsigned int *)&v11[344] = v19->field_140;
                    *(unsigned long long *)&v11[352] = v19->field_138 & 0x3df6ffb87;
                    *(unsigned int *)&v11[360] = 0;
                    *(unsigned int *)&v11[376] = 0;
                    sub_979b18((long long)v11[160]);
                    return v11;
                }
            }
            else
            {
                sub_97c738();
                goto LABEL_97c700;
            }
        }
    }
    goto LABEL_97c650;
}
