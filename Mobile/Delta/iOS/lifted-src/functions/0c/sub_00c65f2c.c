/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc65f2c..0xc660f0 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c65f2c_1 {
    char padding_0[64];
    char field_40;
} st_c65f2c_1;

typedef struct st_c65f2c_2 {
    char padding_0[64];
    struct st_c65f2c_0 *field_40;
} st_c65f2c_2;

typedef struct st_c65f2c_0 {
    struct st_c65f2c_1 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[24];
    char field_40;
    char padding_41[23];
    char field_58;
} st_c65f2c_0;

extern char g_10002b0;

void sub_c65f2c(st_c65f2c_2 *a0, char a1, char a2, char a3, char a4, char a5)
{
    unsigned long long v27;  // x26
    unsigned long long v28;  // x25
    st_c65f2c_0 *v37;  // x22
    st_c65f2c_0 *v38;  // x8
    unsigned long long v39;  // x24
    unsigned long long v29;  // x24
    unsigned long long v30;  // x23
    unsigned long long v31;  // x22
    unsigned long long v32;  // x21
    unsigned long long v33;  // x20
    unsigned long long v34;  // x19
    unsigned long long v35;  // x30
    char v36;  // x24
    char v0;  // [bp-0x138], Other Possible Types: unsigned long long
    char v1;  // [bp-0x130]
    char v2;  // [bp-0x120]
    char v3;  // [bp-0x110]
    char v4;  // [bp-0x100]
    char v5;  // [bp-0xf0]
    char v6;  // [bp-0xe0]
    char v7;  // [bp-0xd4]
    char v8;  // [bp-0xc4]
    char v9;  // [bp-0xb4]
    char v10;  // [bp-0xa4]
    char v11;  // [bp-0x94]
    char v12;  // [bp-0x84]
    char v13;  // [bp-0x74]
    char v14;  // [bp-0x68]
    unsigned long v15;  // [bp-0x58]
    unsigned long long v16;  // [bp-0x50]
    unsigned long long v17;  // [bp-0x48]
    unsigned long long v18;  // [bp-0x40]
    unsigned long long v19;  // [bp-0x38]
    unsigned long long v20;  // [bp-0x30]
    unsigned long long v21;  // [bp-0x28]
    unsigned long long v22;  // [bp-0x20]
    unsigned long long v23;  // [bp-0x18]
    char *v24;  // [bp-0x10]
    unsigned long long v25;  // [bp-0x8]
    char v26;  // [bp+0x0]

    v16 = v27;
    v17 = v28;
    v18 = v29;
    v19 = v30;
    v20 = v31;
    v21 = v32;
    v22 = v33;
    v23 = v34;
    v24 = &v26;
    v25 = v35;
    v36 = a3;
    v15 = *(long long *)&g_10002b0;
    v37 = a0->field_40;
    _bzero(&v0, 224);
    if (!a5)
        sub_9d3d58(a0, 15);
    if (*(int *)&a0->padding_0[40] && v37 && *(long long *)&v37->padding_8[0] && (a1 || !a2) && (!v36 || v37->field_58 >> 1 & 1))
    {
        v38 = v37;
        if (v38->field_0)
            v38 = *(long long *)&v37->field_0->field_40;
        if (!a4)
        {
            v0 = a2;
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 0;
            v13 = 0;
            v14 = 0;
            if (!v36)
                goto LABEL_c6604c;
LABEL_c66028:
LABEL_c6605c:
            sub_9d8114(&v1, v36);
            goto LABEL_c66064;
        }
        else if (v38->field_40 >> 1 & 1)
        {
            v0 = a2;
            sub_9d8114(&v8, a4);
            if (v36)
                goto LABEL_c66028;
LABEL_c6604c:
            v36 = *(long long *)&v37->padding_41[7];
            if (*(long long *)&v37->padding_41[7])
                goto LABEL_c6605c;
            v7 = 0;
            v5 = 0;
            v6 = 0;
            v3 = 0;
            v4 = 0;
            v1 = 0;
            v2 = 0;
LABEL_c66064:
            v39 = v37->field_20;
            if (sub_9d7cbc(v37, &v0, 224) != 224 || sub_9d7cbc(v37, a1, a2) != a2)
            {
                v37->field_18 = v37->field_18;
                v37->field_20 = v39;
                if (!a5)
                    sub_9d3d74(a0, 10);
            }
        }
    }
    if (*(long long *)&g_10002b0 != v15)
        ___stack_chk_fail();
}
