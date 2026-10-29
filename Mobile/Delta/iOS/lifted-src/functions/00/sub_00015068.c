/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15068..0x15798 (1840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15068_1 {
    unsigned long long field_0;
    long long field_8;
} st_15068_1;

typedef struct st_15068_0 {
    char field_0;
} st_15068_0;

extern long long g_f0cad0;

long long sub_15068(void* a0, long long a1, long long a2)
{
    unsigned int v29;  // w8
    unsigned long long v30;  // x0
    long long v39;  // x0
    unsigned long v40;  // x0
    char *v41;  // x1
    unsigned long long v42;  // x1
    unsigned long v43;  // x0
    long long v44;  // x0
    long long v45;  // x0
    unsigned long v46;  // x0
    unsigned long long v47;  // x0
    unsigned long long v48;  // x21
    unsigned long long v31;  // x21
    unsigned long v32;  // x24
    unsigned long long v33;  // w0
    long long v34;  // x0
    unsigned long v35;  // x25
    unsigned long long v36;  // w0
    unsigned long v37;  // x0
    unsigned long v38;  // x20
    unsigned long long v0;  // [bp-0x160]
    st_15068_0 **v1;  // [bp-0x148], Other Possible Types: char
    st_15068_0 *v2;  // [bp-0x140]
    unsigned long v3;  // [bp-0x138]
    unsigned long v4;  // [bp-0x130]
    unsigned long v5;  // [bp-0x128]
    unsigned long v6;  // [bp-0x120]
    unsigned long v7;  // [bp-0x118]
    unsigned long long v8;  // [bp-0x110]
    st_15068_1 *v9;  // [bp-0x108], Other Possible Types: uint128_t, unsigned int, unsigned long long, unsigned long
    unsigned long v10;  // [bp-0x104]
    long long v11;  // [bp-0x100], Other Possible Types: unsigned long, unsigned long long
    unsigned long long v12;  // [bp-0xf8]
    st_15068_0 **v13;  // [bp-0xf0], Other Possible Types: uint128_t, char, unsigned long
    unsigned int v14;  // [bp-0xe0]
    long long v15;  // [bp-0xd8]
    unsigned long v16;  // [bp-0xd0]
    long long v17;  // [bp-0xc8]
    uint128_t v18;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v19;  // [bp-0xb8]
    long long v20;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long v21;  // [bp-0xa0]
    unsigned long long v22;  // [bp-0x98]
    uint128_t v23;  // [bp-0x90]
    st_15068_0 *v24;  // [bp-0x80], Other Possible Types: uint128_t, unsigned long long, unsigned long
    unsigned long v25;  // [bp-0x78], Other Possible Types: unsigned long long
    unsigned int v26;  // [bp-0x70]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v2 = &v1;
    v1 = &v2;
    sub_16844();
    v23 = (int128_t)a0[132];
    v29 = (int)a0[128];
    v21 = 0;
    v22 = 0;
    if ((int)v29 > 280)
    {
        if (296 >= (int)v29)
        {
            if (v29 - 284 < 2)
            {
                if (a2 & 1)
                {
                    v21 = sub_237f0(a0, 0);
                    v22 = 0;
                    return sub_176e0(a0, a1);
                }
                v18 = 0;
                v19 = 0;
LABEL_153b4:
                goto LABEL_153bc;
            }
            switch (v29)
            {
            case 281:
                *(char *)&v16 = 0;
                *(char *)&v17 = 0;
                v15 = -0x1;
                v13 = _INSERT(CONCAT(v13, 0), 0, 0);
                *(char *)&v14 = 0;
                sub_1f174(a0, "type name");
                if ((int)a0[128] != 262)
                {
                    if ((int)a0[128] == 46)
                    {
                        v15 = (long long)a0[132];
                        sub_f8d0(a0);
                        sub_1a62c(&v16, &v18);
                        sub_1f158(&v13, &v18 + 1);
                        if ((char)g_f0cad0 == 1 && !(v30 = sub_10160(a0 + 360, &v18), !v30))
                            v31 = *(long long *)(v30 + 8);
                        else
                            v31 = 0;
                        sub_2207c(a0, "field name", &v15);
                        v18 = v9;
                        v20 = v12;
                        goto LABEL_155d8;
                    }
                    if (!sub_1935c(&v18, "typeof"))
                        goto LABEL_155a4;
                    v32 = (long long)a0[132];
                    v33 = (unsigned int)sub_1f3d4(a0, 40, "typeof type");
                    v34 = sub_18934(a0, 0);
                    v35 = (long long)a0[132];
                    v9 = (int)a0[128];
                    v10 = (long long)a0[132];
                    v36 = (unsigned int)sub_1ef30(a0, 41, &v9, 0);
                    v9 = *(unsigned long long *)&v23;
                    v11 = (long long)a0[140];
                    v37 = sub_404c((long long)a0[216], 40);
                    v38 = v37;
                    sub_5fcc(v37, &v9, v34);
                    if ((char)a0[88] == 1)
                    {
                        if (!v33)
                            v32 = -0x1;
                        if (!v36)
                            v35 = -0x1;
                        v39 = sub_404c();
                        sub_8598(v39, v32, v35);
                        v9 = v38;
                        sub_1c9f0(a0 + 1184, &v9);
                        v40 = a0 + 1184;
                        v41 = &v9;
LABEL_1547c:
                        *(long long *)(sub_12484(v40, v41) + 8) = v39;
                        break;
                    }
                }
                else
                {
                    sub_1db64(a0, a0 + 132, "Unexpected '...' after type name; type pack is not allowed in this context");
                    sub_f8d0(a0);
LABEL_155a4:
                    v31 = 0;
LABEL_155d8:
                    v7 = 0;
                    v8 = 0;
                    v5 = 0xffffffffffffffff;
                    v6 = 0xffffffffffffffff;
                    v9 = a0 + 1088;
                    v11 = (long long)a0[1096] - (long long)a0[1088] >> 3;
                    v12 = 0;
                    if ((int)a0[128] == 60)
                    {
                        if ((char)a0[88] == 1)
                        {
                            v42 = &v6;
                            v43 = sub_12b7c(a0, &v6, &v9, &v5);
                        }
                        else
                        {
                            v42 = 0;
                            v43 = sub_12b7c(a0, 0, 0, 0);
                        }
                        v7 = v43;
                        v8 = v42;
                    }
                    v3 = *(unsigned long long *)&v23;
                    v4 = (long long)a0[168];
                    v38 = sub_404c((long long)a0[216], 120);
                    v24 = v13;
                    v26 = v14;
                    sub_6984(v38, &v3, v16, v17, *(unsigned long long *)&v18, &v24, &v18 | 8, (int)a0[128] == 60, &v7, v31);
                    if ((char)a0[88] == 1)
                    {
                        v44 = sub_ef54(a0, &v9);
                        v45 = sub_404c((long long)a0[216], 48);
                        sub_8708(v45, v15, v6, v44, &v9, v5);
                        v24 = v38;
                        sub_1c9f0(a0 + 1184, &v24);
                        *(long long *)(sub_12484(a0 + 1184, &v24) + 8) = v45;
                    }
                    sub_dd88(v9, v9->field_0 + v11 * 8, v9->field_8);
                    break;
                }
            case 286:
                sub_f8d0(a0);
                v18 = 0;
                v19 = 0;
                goto LABEL_153b4;
            default:
LABEL_15240:
                v9 = (long long)a0[168];
                v11 = *(unsigned long long *)&v23;
                v24 = (long long)a0[168];
                v25 = *(unsigned long long *)((void*)&v23 + 8);
                sub_b814();
                goto LABEL_15258;
            }
        }
        else if (302 >= (int)v29)
        {
            switch (v29)
            {
            case 297:
                sub_f8d0(a0);
                v38 = sub_404c((long long)a0[216], 32);
                sub_6664(v38, &v23, 0);
                break;
            case 299:
                sub_f8d0(a0);
                v18 = 0;
                v19 = 0;
                goto LABEL_153b4;
            default:
LABEL_15240:
                v9 = (long long)a0[168];
                v11 = *(unsigned long long *)&v23;
                v24 = (long long)a0[168];
                v25 = *(unsigned long long *)((void*)&v23 + 8);
                sub_b814();
                goto LABEL_15258;
            }
        }
        else
        {
            switch (v29)
            {
            case 303:
                sub_f8d0(a0);
                v24 = &v13;
                v13 = &v24;
                v38 = sub_404c((long long)a0[216], 120);
                v18 = 0;
                v20 = 0;
                v9 = 0;
                v11 = 0;
                sub_6984(v38, &v23, 0, 0, (long long)a0[304], &v18, &v23, 0, &v9, 0);
                break;
            case 309:
                sub_f8d0(a0);
                v38 = sub_404c((long long)a0[216], 32);
                sub_6664(v38, &v23, 1);
                break;
            default:
LABEL_15240:
                v9 = (long long)a0[168];
                v11 = *(unsigned long long *)&v23;
                v24 = (long long)a0[168];
                v25 = *(unsigned long long *)((void*)&v23 + 8);
                sub_b814();
LABEL_15258:
                v0 = sub_a0c8(&v18);
                v38 = sub_20de0(a0, &v24, &v9, "Expected type, got %s");
                break;
            }
        }
    }
    else
    {
        if (265 >= (int)v29)
        {
            switch (v29)
            {
            case 40: case 60:
                v18 = 0;
                v19 = 0;
                return sub_176e0(a0, a1);
            case 123:
                v46 = sub_11880(a0, a2);
                goto LABEL_153c4;
            default:
LABEL_15240:
                v9 = (long long)a0[168];
                v11 = *(unsigned long long *)&v23;
                v24 = (long long)a0[168];
                v25 = *(unsigned long long *)((void*)&v23 + 8);
                sub_b814();
            }
            goto LABEL_15258;
        }
        else if (v29 - 278 >= 2)
        {
            if (v29 != 266)
                if (v29 != 269)
                    goto LABEL_15240;
                else
                    goto LABEL_15188;
LABEL_15188:
            sub_1b690(a0);
            v18 = 0;
            v19 = 0;
            goto LABEL_153b4;
        }
        else
        {
            if ((char)a0[88] == 1)
            {
                v47 = sub_1c948(a0);
                v48 = v47 >> 32;
            }
            else
            {
                v48 = 0;
            }
            v9 = 0;
            v11 = 0;
            sub_1ede0(a0);
            if (v20 == 1)
            {
                v24 = v18;
                v38 = sub_404c((long long)a0[216], 48);
                sub_6054(v38, &v23, &v24);
                if ((char)a0[88] == 1)
                {
                    v39 = sub_404c((long long)a0[216], 32);
                    sub_8868(v39, v9, v11, v47, v48);
                    v13 = v38;
                    sub_1c9f0(a0 + 1184, &v13);
                    v40 = a0 + 1184;
                    v41 = &v13;
                    goto LABEL_1547c;
                }
            }
            else
            {
                v24 = 0;
                v25 = 0;
LABEL_153bc:
                v46 = sub_12160(a0);
LABEL_153c4:
                v38 = v46;
            }
        }
    }
    return v38;
}
