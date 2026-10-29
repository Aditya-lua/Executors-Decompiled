/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd5ee0..0xd6108 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d5ee0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_d5ee0_1;

typedef struct st_d5ee0_0 {
    char field_0;
} st_d5ee0_0;

extern unsigned long long g_e6e4b8;
extern unsigned long long g_e6e4c0;

void sub_d5ee0(st_d5ee0_1 *a0, int *a1)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long v25;  // x8
    unsigned long long v26;  // x8
    char *v27;  // x8
    unsigned long v28;  // x22
    unsigned long long v29;  // x9
    unsigned int i;  // w10
    int *v31;  // x13
    int *v32;  // x13
    unsigned long long v33;  // x0
    unsigned long v34;  // x9
    unsigned long long v17;  // x24
    unsigned long long v35;  // x10
    unsigned long long v36;  // x12
    unsigned long long v37;  // x10
    unsigned long long v38;  // x10
    unsigned long long v39;  // x20
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned long long v24;  // w24
    st_d5ee0_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_d5ee0_0 *v1;  // [bp-0x68]
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
        v26 = a0->field_0 * (0xff51afd7ed558ccd * (v25 ^ v25 >> 33) ^ 0xff51afd7ed558ccd * (v25 ^ v25 >> 33) >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * (v25 ^ v25 >> 33) ^ 0xff51afd7ed558ccd * (v25 ^ v25 >> 33) >> 33) >> 33;
        v2 = a0->field_30 + (unsigned int)((v26 & 31) >> ((char)a0->field_34 & 63));
        v3 = a0->field_20 & v26 >> 5;
        sub_e04fc(a0, &v2, &v3);
        v27 = a0->field_10;
        v28 = v2;
        v29 = v3;
        i = v27[v29];
        if ((unsigned int)v28 == i)
        {
            v31 = a0->field_8 + 24 * v29;
            do
            {
                v32 = v31 + 6;
                if (*a1 == *v31)
                    goto LABEL_d602c;
                v33 = v29 + 1;
                v3 = v33;
                v28 += a0->field_30;
                v2 = (unsigned int)v28;
                i = v27[1 + v29];
                v29 = v33;
                v31 = v32;
            } while ((unsigned int)v28 == i);
            v29 = v33;
            if (a0->field_28 > a0->field_18)
                goto LABEL_d6068;
        }
        else if (a0->field_18 < a0->field_28)
        {
LABEL_d6068:
            v34 = a0->field_30;
            if ((unsigned int)v34 + (unsigned int)v28 >= 0x100)
            {
                a0->field_28 = 0;
                i = v27[v29];
            }
            if (i)
            {
                v35 = 0;
                v36 = v34 + v28;
                do
                {
                    v37 = v35;
                    v3 = v29 + v37 + 1;
                    v2 = v36;
                    v38 = v37 + 1;
                    v36 += v34;
                    v35 = v38;
                } while (v27[1 + v37 + v29]);
                if (v38)
                {
                    v39 = v29;
                    sub_d29a8(a0, v29 + v38, v39);
                    v29 = v39;
                    v27 = a0->field_10;
                }
            }
            v27[v29] = v28;
            a0->field_18 = a0->field_18 + 1;
            break;
        }
        if (sub_d6dec(a0) & 1)
        {
            v24 += 1;
            if (v24 == 0x100)
                goto *((void *)(g_e6e4b8));
        }
        else
        {
            break;
        }
    }
LABEL_d602c:
    goto *((void *)(g_e6e4c0));
}
