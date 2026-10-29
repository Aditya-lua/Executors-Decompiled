/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fc90..0x40074 (996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fc90_1 {
    char padding_0[1532];
    unsigned int field_5fc;
} st_3fc90_1;

typedef struct st_3fc90_2 {
    char padding_0[32];
    unsigned int field_20;
} st_3fc90_2;

typedef struct st_3fc90_0 {
    char field_0;
} st_3fc90_0;

extern unsigned long long g_e66138;
extern char g_10002b0;

void sub_3fc90(st_3fc90_1 *a0, st_3fc90_2 *a1)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // x8
    unsigned long long v32;  // 4106
    unsigned long long v33;  // 4106
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // x8
    unsigned long long v36;  // 4106
    unsigned long long v37;  // 4106
    unsigned long long v21;  // x26
    unsigned long long v22;  // x25
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    st_3fc90_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_3fc90_0 *v1;  // [bp-0xd8]
    unsigned int v2;  // [bp-0xb8]
    st_3fc90_1 *v3;  // [bp-0x90]
    unsigned int v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0;
    v4 = a0->field_5fc;
    sub_3e1e0();
    if (v2)
    {
        sub_3b87c(a0, a1, 1);
        v30 = a1->field_20;
        v31 = 16;
        if (a1->field_20 < 7)
        {
            v31 = 192;
            v32 = arm64g_calculate_condition(3, v30, 7, 0);
            if (!(v32 & 1))
                goto LABEL_3fd2a;
LABEL_3fd29:
            v31 = 88;
        }
        else
        {
            v33 = arm64g_calculate_condition(3, v30, 7, 0);
            if (v33 & 1)
                goto LABEL_3fd29;
LABEL_3fd2a:
        }
        goto *((void *)(*(long long *)((char *)&g_e66138 + v31)));
    }
    else
    {
        v34 = a1->field_20;
        v35 = 16;
        if (a1->field_20 < 7)
        {
            v35 = 192;
            v36 = arm64g_calculate_condition(3, v34, 7, 0);
            if (!(v36 & 1))
                goto LABEL_3fd5a;
LABEL_3fd59:
            v35 = 88;
        }
        else
        {
            v37 = arm64g_calculate_condition(3, v34, 7, 0);
            if (v37 & 1)
                goto LABEL_3fd59;
LABEL_3fd5a:
        }
        goto *((void *)(*(long long *)((char *)&g_e66138 + v35)));
    }
}
