/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41168..0xb41284 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b41168_2 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
} st_b41168_2;

typedef struct st_b41168_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[12];
    unsigned int field_18;
} st_b41168_1;

typedef struct st_b41168_0 {
    long long field_0;
    long long field_8;
    struct st_b41168_1 *field_10;
    struct st_b41168_2 *field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_b41168_0;


long long sub_b41168(st_b41168_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v2;  // w21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4)
    {
        if (sub_b41284(a0->field_0, a0->field_8, "priv", a0, 0, a3, a0->field_10->field_8, a0->field_18->field_18) && sub_b41284(a0->field_0, a0->field_8, "priv", a0, 1, a3, a0->field_10->field_8, a0->field_18->field_18))
        {
            v2 = 2;
        }
        else
        {
LABEL_b41248:
            sub_a5a4c8(a0->field_20);
            sub_a5a4c8(a0->field_28);
            memset(&a0->field_20, 0, 20);
            return 0;
        }
    }
    else
    {
        if (!a2)
        {
            v2 = 1;
        }
        else if (!(sub_b41284(a0->field_0, a0->field_8, "pub", a0, 0, a1, a0->field_10->field_18, a0->field_18->field_10) && (v2 = 1, sub_b41284(a0->field_0, a0->field_8, "pub", a0, 1, a1, a0->field_10->field_18, a0->field_18->field_10))))
        {
            goto LABEL_b41248;
        }
    }
    *(int *)&a0->field_30 = v2;
    return 1;
}
