/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x219fc..0x21f38 (1340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_219fc_2 {
    unsigned long long field_0;
    long long field_8;
} st_219fc_2;

typedef struct st_219fc_1 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
} st_219fc_1;

typedef struct st_219fc_3 {
    struct st_219fc_4 *field_0;
} st_219fc_3;

typedef struct st_219fc_4 {
    struct st_219fc_3 *field_0;
} st_219fc_4;

typedef struct st_219fc_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned long long field_1c;
    unsigned long long field_24;
    char padding_2c[40];
    unsigned long long field_54;
    char padding_5c[720];
    unsigned long long field_32c;
    unsigned long long field_334;
    char padding_33c[8];
    unsigned long long field_344;
    unsigned long long field_34c;
} st_219fc_5;

typedef struct st_219fc_0 {
    char field_0;
} st_219fc_0;

extern unsigned int g_f00ba0;

long long sub_219fc(void* a0)
{
    st_219fc_5 *v24;  // x20
    unsigned int v25;  // w8
    unsigned int v34;  // w0
    unsigned long long v35;  // x8
    unsigned int v36;  // w8
    unsigned long v37;  // x21
    unsigned long v38;  // x0
    long long v39;  // x0
    unsigned long long v26;  // x22
    long long v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v29;  // x8
    unsigned long long v30;  // x8
    unsigned long long v31;  // x0
    unsigned long long v32;  // x26
    unsigned long long v33;  // x27
    unsigned long long v0;  // [bp-0x118]
    st_219fc_0 **v1;  // [bp-0x110], Other Possible Types: char
    st_219fc_0 *v2;  // [bp-0x108]
    st_219fc_4 **v3;  // [bp-0x100]
    unsigned long long len;  // [bp-0xf8]
    st_219fc_4 **v5;  // [bp-0xf0]
    st_219fc_1 **v6;  // [bp-0xe8]
    unsigned long v7;  // [bp-0xd8], Other Possible Types: unsigned long long
    st_219fc_2 **v8;  // [bp-0xd0], Other Possible Types: long long, unsigned long, unsigned long long
    unsigned long long v9;  // [bp-0xc8]
    unsigned int v10;  // [bp-0xc0]
    unsigned long long v11;  // [bp-0xbc]
    unsigned int v12;  // [bp-0xb4]
    unsigned long long v13;  // [bp-0xb0]
    st_219fc_2 *v14;  // [bp-0xa8]
    unsigned long long v15;  // [bp-0xa0]
    unsigned long long v16;  // [bp-0x98]
    unsigned long long *v17;  // [bp-0x90]
    unsigned long long v18;  // [bp-0x88]
    unsigned long long iter;  // [bp-0x80]
    st_219fc_4 **v20;  // [bp-0x78]
    st_219fc_4 **v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v2 = &v1;
    v1 = &v2;
    v17 = a0 + 944;
    v18 = 12297829382473034411 * ((long long)a0[952] - (long long)a0[944] >> 3);
    iter = 0;
    v14 = a0 + 968;
    v15 = 10248191152060862009 * ((long long)a0[976] - (long long)a0[968] >> 2);
    v16 = 0;
    v24 = a0 + 132;
    v12 = (int)a0[128];
    v0 = (long long)a0[132];
    v13 = (long long)a0[132];
    sub_1f3d4();
    while (1)
    {
        v25 = (int)a0[128];
        switch (v25)
        {
        case 91:
            v5 = CONCAT((long long)a0[132], v25);
            sub_f8d0(a0);
            v31 = sub_18934(a0, 0);
            if (sub_1ef30(a0, 93, &v5, 0))
                v32 = (long long)a0[160];
            else
                v32 = 0xffffffffffffffff;
            if (sub_1f3d4(a0, 61, "table field"))
                v33 = (long long)a0[160];
            else
                v33 = 0xffffffffffffffff;
            *(unsigned int *)&v7 = 2;
            v8 = v31;
            v9 = sub_18934(a0, 0);
            v3 = &v21;
            v21 = &v3;
            sub_15798(v17, &v7);
            iter += 1;
            if ((char)a0[88] == 1)
            {
                v34 = sub_1d958(a0);
                v7 = (long long)a0[132];
                v8 = v32;
                v9 = v33;
                v10 = v34;
                if (v10 == 2)
                    v35 = 0xffffffffffffffff;
                else
                    v35 = v24->field_0;
                v11 = v35;
                v3 = &v21;
                v21 = &v3;
                sub_16718(v14, &v7);
LABEL_21d68:
                v16 += 1;
                break;
            }
            break;
        case 125:
LABEL_21dc0:
            v37 = (long long)a0[140];
            if (!(sub_1ef30(a0, 125, &v12, 0) & 1))
            {
                v37 = (long long)a0[168];
                goto LABEL_21de0;
            }
            break;
        case 281:
            sub_b1a4(a0 + 96);
            if ((unsigned int)v7 != 61)
                goto LABEL_21c40;
            sub_1f174(a0, "table field");
            v26 = (long long)a0[132];
            sub_1f3d4(a0, 61, "table field");
            v3 = v5;
            len = 0;
            len = _strlen(v3);
            v27 = sub_404c((long long)a0[216], 56);
            sub_6204(v27, &v5 + 1, &v3, 3);
            v28 = sub_18934(a0, 0);
            if (*(int *)(v28 + 8) == g_f00ba0 && v28)
                *(unsigned long long *)(v28 + 160) = v5;
            *(unsigned int *)&v7 = 1;
            v8 = v27;
            v9 = v28;
            v20 = &v21;
            v21 = &v20;
            sub_15798(v17, &v7);
            iter += 1;
            if ((char)a0[88] == 1)
            {
                v29 = 0xffffffffffffffff;
                v7 = 0xffffffffffffffff;
                v8 = 0xffffffffffffffff;
                v9 = v26;
                v10 = sub_1d958(a0);
                if (v10 != 2)
                    v29 = v24->field_0;
                v11 = v29;
                v20 = &v21;
                v21 = &v20;
                sub_16718(v14, &v7);
                goto LABEL_21d68;
            }
            break;
        default:
LABEL_21c40:
            *(unsigned int *)&v7 = 0;
            v8 = 0;
            v9 = sub_18934(a0, 0);
            v5 = &v3;
            v3 = &v5;
            sub_15798(v17, &v7);
            iter += 1;
            if ((char)a0[88] == 1)
            {
                v30 = 0xffffffffffffffff;
                v8 = 0xffffffffffffffff;
                v9 = 0xffffffffffffffff;
                v7 = 0xffffffffffffffff;
                v10 = sub_1d958(a0);
                if (v10 != 2)
                    v30 = v24->field_0;
                v11 = v30;
                v5 = &v3;
                v3 = &v5;
                sub_16718(v14, &v7);
                goto LABEL_21d68;
            }
        }
        v36 = (int)a0[128];
        if ((int)v36 > 90)
        {
            switch (v36)
            {
            case 91:
LABEL_21d98:
                sub_1db64(a0, v24, "Expected ',' after table constructor element");
                continue;
            case 125:
                continue;
            default:
                if (v36 != 281)
                    goto LABEL_21dc0;
                else
                    goto LABEL_21d98;
            }
            goto LABEL_21dc0;
        }
        if (v36 != 44 && v36 != 59)
            goto LABEL_21dc0;
        sub_f8d0(a0);
    }
LABEL_21de0:
    v7 = v0;
    v8 = v37;
    v5 = sub_ef88(a0, &v17);
    v6 = &v17;
    v38 = sub_404c((long long)a0[216], 48);
    sub_5648(v38, &v7, &v5);
    if ((char)a0[88] == 1)
    {
        v7 = sub_20d84(a0, &v14);
        v8 = &v14;
        v39 = sub_404c((long long)a0[216], 24);
        sub_87cc(v39, &v7);
        v5 = v38;
        sub_1c9f0(a0 + 1184, &v5);
        *(long long *)(sub_12484(a0 + 1184, &v5) + 8) = v39;
    }
    sub_23910(v14, v14->field_0 + 36 * v15, v14->field_8);
    sub_1ab94(v17, *v17 + 24 * v18, v17[1]);
    return v38;
}
