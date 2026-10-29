/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8af584..0x8af810 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8af584_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_8af584_1;

typedef struct st_8af584_0 {
    char field_0;
} st_8af584_0;

extern unsigned long long g_e83980;
extern unsigned long long g_e83990;

void sub_8af584(st_8af584_1 *a0, unsigned long long *a1)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long v25;  // x8
    unsigned long long v26;  // x9
    unsigned long long v27;  // x9
    unsigned long long v28;  // x8
    unsigned long v29;  // x8
    unsigned long long v30;  // x9
    unsigned long long v31;  // x10
    unsigned long long v32;  // x8
    unsigned long long v33;  // x8
    unsigned long long v34;  // x10
    unsigned long long v17;  // x24
    unsigned long long v35;  // x8
    char *v36;  // x8
    unsigned long v37;  // x25
    unsigned long long v38;  // x10
    unsigned int i;  // w9
    unsigned long long *v40;  // x13
    unsigned long long v41;  // x0
    unsigned long v42;  // x10
    unsigned long long v43;  // x9
    unsigned long long v44;  // x12
    unsigned long long v18;  // x23
    unsigned long long v45;  // x9
    unsigned long long v46;  // x9
    unsigned long long v47;  // x20
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned long long v24;  // w23
    st_8af584_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_8af584_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x5c], Other Possible Types: unsigned int
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v24 = 0;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        v25 = *a1;
        v26 = v25 >> 33;
        v27 = -v26;
        v28 = ((unsigned int)v25 + ~(unsigned int)v25 * 2 + 1 & v26) + (v27 & v25);
        v29 = a0->field_0 * (0xff51afd7ed558ccd * ((v27 ^ v25) + v28 * 2) ^ 0xff51afd7ed558ccd * ((v27 ^ v25) + v28 * 2) >> 33);
        v30 = v29 >> 33;
        v31 = v30 | v29;
        v32 = (v30 | ~v29) + v29;
        v2 = a0->field_30 + (unsigned int)(((v32 - v31 | 31) ^ v31 - v32) + ((v32 - v31 | 31) & v31 - v32) * 2 >> ((char)a0->field_34 & 63));
        v33 = v31 + ~v32 >> 5;
        v34 = v33 + a0->field_20;
        v35 = -(v33 | a0->field_20);
        v3 = (v34 ^ v35) + (v34 & v35) * 2;
        sub_e04fc(a0, &v2, &v3);
        v36 = a0->field_10;
        v37 = v2;
        v38 = v3;
        i = v36[v38];
        if ((unsigned int)v37 == i)
        {
            v40 = a0->field_8 + v38 * 16;
            do
            {
                if (*a1 == *v40)
                    goto LABEL_8af724;
                v41 = v38 + 1;
                v3 = v41;
                v37 += a0->field_30;
                v2 = (unsigned int)v37;
                i = v36[1 + v38];
                v40 += 2;
                v38 = v41;
            } while ((unsigned int)v37 == i);
        }
        else
        {
            v41 = v38;
        }
        if (a0->field_18 < a0->field_28)
        {
            v42 = a0->field_30;
            if ((unsigned int)v37 + ((unsigned int)v42 | ~(unsigned int)v37) + ((unsigned int)v42 | (unsigned int)v37) + 1 >= 0x100)
            {
                a0->field_28 = 0;
                i = v36[v41];
            }
            if (i)
            {
                v43 = 0;
                v44 = v42 + v37;
                do
                {
                    v45 = v43;
                    v3 = v41 + v45 + 1;
                    v2 = v44;
                    v46 = v45 + 1;
                    v44 += v42;
                    v43 = v46;
                } while (v36[1 + v45 + v41]);
                if (v46)
                {
                    v47 = v41;
                    sub_8af8ac(a0, v41 + v46, v47);
                    v41 = v47;
                    v36 = a0->field_10;
                }
            }
            v36[v41] = v37;
            a0->field_18 = a0->field_18 + 1;
            break;
        }
        else if (sub_91e324(a0) & 1)
        {
            v24 += 1;
            if (v24 == 0x100)
                goto *((void *)(g_e83980));
        }
        else
        {
            break;
        }
    }
LABEL_8af724:
    goto *((void *)(g_e83990));
}
