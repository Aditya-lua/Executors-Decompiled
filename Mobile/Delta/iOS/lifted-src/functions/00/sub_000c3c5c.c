/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3c5c..0xc3dbc (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3c5c_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned short *field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    long long field_80;
    long long field_88;
    long long field_90;
} st_c3c5c_0;


unsigned long long sub_c3c5c(st_c3c5c_0 *a0, unsigned long a1, unsigned long long a2, unsigned short *a3, unsigned long long a4, unsigned int *a5)
{
    unsigned long v11;  // x12
    unsigned long v12;  // x13
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    unsigned long long v27;  // x30
    unsigned long long v28;  // x22
    long long v29;  // x8
    long long v30;  // x21
    unsigned long v13;  // x14
    long long v31;  // x20
    long long v32;  // x19
    unsigned long long v33;  // x9
    unsigned long long v34;  // x10
    unsigned long long v35;  // x10
    unsigned long long v36;  // x9
    unsigned long long v37;  // x0
    unsigned long v14;  // x10
    long long v15;  // x9
    long long v16;  // x11
    long long v17;  // x10
    unsigned long long v18;  // x12
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a2)
        return 0;
    if (10 > a4)
    {
        return 0xffffffffffffffec;
    }
    else if ((char)(*a5 >> 16) == 11)
    {
        v11 = *a3;
        v12 = a3[1];
        v13 = a3[2];
        v14 = a3 + 3;
        v15 = v14 + v11;
        a0->field_78 = v14;
        a0->field_80 = v15;
        v16 = v15 + v12;
        v17 = v16 + v13;
        a0->field_88 = v16;
        a0->field_90 = v17;
        if (v11 < 8)
        {
            return 0;
        }
        else if ((unsigned int)v12 < 8)
        {
            return 0;
        }
        else if ((unsigned int)v13 >= 8)
        {
            v18 = v11 + v12 + v13 + 6;
            if (a4 - v18 < 8)
            {
                return 0;
            }
            else if (v18 > a4)
            {
                return 0xffffffffffffffec;
            }
            else
            {
                v0 = v19;
                v1 = v20;
                v2 = v21;
                v3 = v22;
                v4 = v23;
                v5 = v24;
                v6 = v25;
                v7 = v26;
                v8 = &v10;
                v9 = v27;
                v28 = a1 + (a2 & ~((long long)(a2) >> 63));
                v29 = v15 - 8;
                v30 = v16 - 8;
                a0->field_0 = v29;
                a0->field_8 = v30;
                v31 = v17 - 8;
                v32 = (char *)a3 + a4 - 8;
                a0->field_10 = v31;
                a0->field_18 = v32;
                v33 = a2 + 3 >> 2;
                v34 = a1 + v33;
                a0->field_20 = a1;
                a0->field_28 = v34;
                v35 = v34 + v33;
                v36 = v35 + v33;
                a0->field_30 = v35;
                a0->field_38 = v36;
                if (v28 <= v36)
                    return 0;
                a0->field_40 = sub_c1870(v29);
                a0->field_48 = sub_c1870(v30);
                a0->field_50 = sub_c1870(v31);
                v37 = sub_c1870(v32);
                a0->field_68 = a3;
                a0->field_70 = v28;
                a0->field_58 = v37;
                a0->field_60 = a5 + 1;
                return 1;
            }
        }
        else
        {
            return 0;
        }
    }
    return 0;
}
