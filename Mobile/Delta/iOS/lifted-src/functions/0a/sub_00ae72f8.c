/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae72f8..0xae737c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae72f8_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
    char padding_10[8];
    int field_18;
    char padding_1c[4];
    unsigned long long field_20;
} st_ae72f8_0;

typedef struct st_ae72f8_1 {
    char padding_0[96];
    struct st_ae72f8_0 *field_60;
} st_ae72f8_1;


void sub_ae72f8(st_ae72f8_1 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    st_ae72f8_0 *v9;  // x10
    unsigned long long *v10;  // x10
    unsigned long long *v11;  // x10
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9c1cd0(a1);
    v9 = a0->field_60;
    if (!v9->field_8)
    {
LABEL_ae7368:
    }
    else if (v8 != v9->field_0)
    {
        v10 = &v9->field_20;
        do
        {
            v11 = v10;
            if (!*v11)
                goto LABEL_ae7368;
        } while ((v10 = v11 + 3, v8 != *(int *)((char *)v11 - 8)));
    }
}
