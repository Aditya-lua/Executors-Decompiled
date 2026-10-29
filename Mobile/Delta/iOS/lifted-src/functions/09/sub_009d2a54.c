/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2a54..0x9d2acc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2a54_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[8];
    struct st_9d2a54_0 *field_28;
    struct st_9d2a54_0 *field_30;
    char padding_38[8];
    struct st_9d2a54_0 *field_40;
} st_9d2a54_0;


int sub_9d2a54(st_9d2a54_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9d2a54_0 *v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        sub_a6c2e4(a0->field_40->field_8, "crypto/bio/bf_buff.c", 78);
        sub_a6c2e4(a0->field_40->field_18, "crypto/bio/bf_buff.c", 79);
        sub_a6c2e4(a0->field_40, "crypto/bio/bf_buff.c", 80);
        a0->field_40 = 0;
        *(unsigned int *)&a0->field_28 = 0;
        v12 = 1;
        *(unsigned int *)&a0->field_30 = 0;
        a0 = 1;
    }
    return (unsigned int)a0;
}
