/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb97ed4..0xb98350 (1148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b97ed4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b97ed4_0;

extern char g_e0639c;

void sub_b97ed4(st_b97ed4_0 **a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_b97ed4_0 *v16;  // x19
    unsigned long long v17;  // x8
    unsigned long long v18;  // 4117
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a0;
    if (10 >= v16->field_0)
    {
        goto *((void *)(sub_b97f10 + (&g_e0639c)[v16->field_0] * 4));
    }
    else
    {
        v17 = 2;
        v18 = arm64g_calculate_condition(0x44, v16->field_8, 0, 0);
        if (v18 & 1)
            v17 = v16->field_8 ^ 0x8000000000000000;
        if (!v17)
        {
            _free();
            return;
        }
        else if (v17 == 1)
        {
            sub_b97ed4(&v16[2].field_8); /* do not return */
        }
        else
        {
            sub_b97ed4(&v16[3].field_8); /* do not return */
        }
    }
}
